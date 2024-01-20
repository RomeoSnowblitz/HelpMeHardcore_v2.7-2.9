package net.romeosnowblitz.hmh2.item.custom.food;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidDrainable;
import net.minecraft.block.FluidFillable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import org.jetbrains.annotations.Nullable;

public class MultiPurposeHoneyBucket extends Item
        implements FluidModificationItem {

    private final Fluid fluid;

    public MultiPurposeHoneyBucket(Fluid fluid, Settings settings) {
        super(settings);
        this.fluid = fluid;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)user;
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }
        if (user instanceof PlayerEntity && !((PlayerEntity)user).getAbilities().creativeMode) {
            stack.decrement(1);
        }
        if (!world.isClient) {
            user.removeStatusEffect(StatusEffects.MINING_FATIGUE);
            user.removeStatusEffect(StatusEffects.SLOWNESS);
            user.removeStatusEffect(StatusEffects.HUNGER);
            user.removeStatusEffect(StatusEffects.NAUSEA);
            user.removeStatusEffect(StatusEffects.POISON);
            user.removeStatusEffect(StatusEffects.WITHER);
            user.removeStatusEffect(StatusEffects.BLINDNESS);
            user.removeStatusEffect(StatusEffects.DARKNESS);
            user.removeStatusEffect(StatusEffects.WEAKNESS);
            user.removeStatusEffect(StatusEffects.INSTANT_DAMAGE);
            user.removeStatusEffect(StatusEffects.BAD_OMEN);
            user.removeStatusEffect(StatusEffects.UNLUCK);
            user.removeStatusEffect(StatusEffects.SLOW_FALLING);
            user.removeStatusEffect(StatusEffects.GLOWING);
            user.removeStatusEffect(StatusEffects.LEVITATION);

            user.removeStatusEffect(CustomEffects.ANCHORED);
            user.removeStatusEffect(CustomEffects.ASH_LUNG);
            user.removeStatusEffect(CustomEffects.BLOOD_FEVER);
            user.removeStatusEffect(CustomEffects.CONDUIT_FAILURE);
            user.removeStatusEffect(CustomEffects.DOLPHINS_CURSE);
            user.removeStatusEffect(CustomEffects.ENDER_SKIN);
            user.removeStatusEffect(CustomEffects.HEALTH_SHRINKAGE);
            user.removeStatusEffect(CustomEffects.HELL_BOUND);
            user.removeStatusEffect(CustomEffects.KINDLING);
            user.removeStatusEffect(CustomEffects.QUANTUM_LOCK);
            user.removeStatusEffect(CustomEffects.SIGHTLESSSNESS);
            user.removeStatusEffect(CustomEffects.TIPSY);
        }
        if (stack.isEmpty()) {
            return new ItemStack(Items.BUCKET);
        }
        return stack;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        BlockHitResult blockHitResult = BucketItem.raycast(world, user, this.fluid == Fluids.EMPTY ? RaycastContext.FluidHandling.SOURCE_ONLY : RaycastContext.FluidHandling.NONE);
        if (blockHitResult.getType() == HitResult.Type.MISS) {
            return ItemUsage.consumeHeldItem(world, user, hand);
        }
        if (blockHitResult.getType() == HitResult.Type.BLOCK) {
            BlockPos blockPos3;
            BlockPos blockPos = blockHitResult.getBlockPos();
            Direction direction = blockHitResult.getSide();
            BlockPos blockPos2 = blockPos.offset(direction);
            if (!world.canPlayerModifyAt(user, blockPos) || !user.canPlaceOn(blockPos2, direction, itemStack)) {
                return TypedActionResult.fail(itemStack);
            }
            if (this.fluid == Fluids.EMPTY) {
                FluidDrainable fluidDrainable;
                ItemStack itemStack2;
                BlockState blockState = world.getBlockState(blockPos);
                if (blockState.getBlock() instanceof FluidDrainable && !(itemStack2 = (fluidDrainable = (FluidDrainable)((Object)blockState.getBlock())).tryDrainFluid(world, blockPos, blockState)).isEmpty()) {
                    user.incrementStat(Stats.USED.getOrCreateStat(this));
                    fluidDrainable.getBucketFillSound().ifPresent(sound -> user.playSound((SoundEvent)sound, 1.0f, 1.0f));
                    world.emitGameEvent(user, GameEvent.FLUID_PICKUP, blockPos);
                    ItemStack itemStack3 = ItemUsage.exchangeStack(itemStack, user, itemStack2);
                    if (!world.isClient) {
                        Criteria.FILLED_BUCKET.trigger((ServerPlayerEntity)user, itemStack2);
                    }
                    return TypedActionResult.success(itemStack3, world.isClient());
                }
                return TypedActionResult.fail(itemStack);
            }
            BlockState blockState = world.getBlockState(blockPos);
            BlockPos blockPos4 = blockPos3 = blockState.getBlock() instanceof FluidFillable && this.fluid == Fluids.WATER ? blockPos : blockPos2;
            if (this.placeFluid(user, world, blockPos3, blockHitResult)) {
                this.onEmptied(user, world, itemStack, blockPos3);
                if (user instanceof ServerPlayerEntity) {
                    Criteria.PLACED_BLOCK.trigger((ServerPlayerEntity)user, blockPos3, itemStack);
                }
                user.incrementStat(Stats.USED.getOrCreateStat(this));
                return TypedActionResult.success(BucketItem.getEmptiedStack(itemStack, user), world.isClient());
            }
            return TypedActionResult.fail(itemStack);
        }
        return TypedActionResult.pass(itemStack);
    }

    @Override
    public void onEmptied(@Nullable PlayerEntity player, World world, ItemStack stack, BlockPos pos) {
    }

    @Override
    public boolean placeFluid(@Nullable PlayerEntity player, World world, BlockPos pos, @Nullable BlockHitResult hitResult) {

        if (!(this.fluid instanceof FlowableFluid)) {
            return false;
        }
        BlockState blockState = world.getBlockState(pos);
        Block block = blockState.getBlock();
        if (!(blockState.isAir() || blockState.canBucketPlace(this.fluid) || block instanceof FluidFillable && ((FluidFillable) block).canFillWithFluid(world, pos, blockState, this.fluid))) {
            return hitResult != null && this.placeFluid(player, world, hitResult.getBlockPos().offset(hitResult.getSide()), null);
        }
        if (world.getDimension().ultrawarm() && this.fluid.isIn(FluidTags.WATER)) {
            int i = pos.getX();
            int j = pos.getY();
            int k = pos.getZ();
            world.playSound(player, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5f, 2.6f + (world.random.nextFloat() - world.random.nextFloat()) * 0.8f);
            for (int l = 0; l < 8; ++l) {
                world.addParticle(ParticleTypes.LARGE_SMOKE, (double)i + Math.random(), (double)j + Math.random(), (double)k + Math.random(), 0.0, 0.0, 0.0);
            }
            return true;
        }
        if (block instanceof FluidFillable && this.fluid == Fluids.WATER) {
            ((FluidFillable) block).tryFillWithFluid(world, pos, blockState, ((FlowableFluid)this.fluid).getStill(false));
            this.playEmptyingSound(player, world, pos);
            return true;
        }
        if (!world.isClient && blockState.canBucketPlace(this.fluid) && !blockState.isLiquid()) {
            world.breakBlock(pos, true);
        }
        if (world.setBlockState(pos, this.fluid.getDefaultState().getBlockState(), Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD) || blockState.getFluidState().isStill()) {
            this.playEmptyingSound(player, world, pos);
            return true;
        }
        return false;
    }

    protected void playEmptyingSound(@Nullable PlayerEntity player, WorldAccess world, BlockPos pos) {
        SoundEvent soundEvent = this.fluid.isIn(FluidTags.LAVA) ? SoundEvents.ITEM_BUCKET_EMPTY_LAVA : SoundEvents.ITEM_BUCKET_EMPTY;
        world.playSound(player, pos, soundEvent, SoundCategory.BLOCKS, 1.0f, 1.0f);
        world.emitGameEvent(player, GameEvent.FLUID_PLACE, pos);
    }
}
