package net.romeosnowblitz.hmh2.mixin;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Blocks;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.romeosnowblitz.hmh2.item.ModItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(GlassBottleItem.class)
public class GlassBottleMixin extends Item {
    public GlassBottleMixin(Settings settings) {super(settings);}

    @Inject(method = "use", at = @At("HEAD"), cancellable = true)
    public void use(World world, PlayerEntity user, Hand hand, CallbackInfoReturnable<TypedActionResult<ItemStack>> cir) {
        List<AreaEffectCloudEntity> list = world.getEntitiesByClass(AreaEffectCloudEntity.class, user.getBoundingBox().expand(2.0D), (entity) -> entity != null && entity.isAlive() && entity.getOwner() instanceof EnderDragonEntity);
        ItemStack itemStack = user.getStackInHand(hand);
        if (!list.isEmpty()) {
            AreaEffectCloudEntity areaEffectCloudEntity = list.get(0);
            areaEffectCloudEntity.setRadius(areaEffectCloudEntity.getRadius() - 0.5F);
            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ITEM_BOTTLE_FILL_DRAGONBREATH, SoundCategory.NEUTRAL, 1.0F, 1.0F);
            world.emitGameEvent(user, GameEvent.FLUID_PICKUP, user.getPos());
            if (user instanceof ServerPlayerEntity) {
                ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)user;
                Criteria.PLAYER_INTERACTED_WITH_ENTITY.trigger(serverPlayerEntity, itemStack, areaEffectCloudEntity);
            }
            cir.setReturnValue(TypedActionResult.success(ItemUsage.exchangeStack(itemStack, user, new ItemStack(Items.DRAGON_BREATH)), world.isClient()));
        } else {
            BlockHitResult blockHitResult = raycast(world, user, RaycastContext.FluidHandling.SOURCE_ONLY);
            if (blockHitResult.getType() == HitResult.Type.MISS) {
                cir.setReturnValue(TypedActionResult.pass(itemStack));
            } else {
                if (blockHitResult.getType() == HitResult.Type.BLOCK) {
                    BlockPos blockPos = blockHitResult.getBlockPos();
                    if (!world.canPlayerModifyAt(user, blockPos)) {
                        cir.setReturnValue(TypedActionResult.pass(itemStack));
                    }
                    if (world.getFluidState(blockPos).isIn(FluidTags.WATER)) {
                        world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.NEUTRAL, 1.0F, 1.0F);
                        world.emitGameEvent(user, GameEvent.FLUID_PICKUP, blockPos);
                        cir.setReturnValue(TypedActionResult.success(ItemUsage.exchangeStack(itemStack, user, PotionUtil.setPotion(new ItemStack(Items.POTION), Potions.WATER)), world.isClient()));
                    }
                    if (world.getBlockState(blockPos).isOf(Blocks.NETHER_PORTAL)) {
                        world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.NEUTRAL, 1.0F, 1.0F);
                        cir.setReturnValue(TypedActionResult.success(ItemUsage.exchangeStack(itemStack, user, new ItemStack(ModItems.NETHER_PORTAL_BOTTLE)), world.isClient()));
                    }
                    if (world.getBlockState(blockPos).isOf(Blocks.END_PORTAL)) {
                        world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.NEUTRAL, 1.0F, 1.0F);
                        cir.setReturnValue(TypedActionResult.success(ItemUsage.exchangeStack(itemStack, user, new ItemStack(ModItems.END_PORTAL_BOTTLE)), world.isClient()));
                    }
                }

                cir.setReturnValue(TypedActionResult.pass(itemStack));
            }
        }
    }



}
