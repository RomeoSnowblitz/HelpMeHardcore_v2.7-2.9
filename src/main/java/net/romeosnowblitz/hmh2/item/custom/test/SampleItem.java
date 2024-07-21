package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

public class SampleItem extends Item {
    NbtCompound nbt = new NbtCompound();
    NbtCompound nbtCompound = nbt.getCompound("EntityTag");
    Entity entity;
    EntityType<?> type;

    public SampleItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack item = this.getDefaultStack();
        if(!item.hasNbt()){
            entity = world.getClosestEntity(LivingEntity.class, TargetPredicate.DEFAULT, user, user.getX(), user.getY(), user.getZ(), new Box(user.getBlockPos()).expand(1));
        }
        if(entity != null) {
            this.type = entity.getType();
            if(user.hasStatusEffect(CustomEffects.BLOOD_WITCH) && !user.getStackInHand(hand).hasNbt()){
                item.getOrCreateNbt().putString("type", EntityType.get(nbt.getCompound("EntityTag").getString("id")).orElse(type).getUntranslatedName());
                user.setStackInHand(hand, item);
            }
        }
        return super.use(world, user, hand);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        ItemStack stack = context.getStack();

        //String type = String.valueOf(EntityType.getEntityFromNbt(stack.getOrCreateNbt().getCompound("id"), context.getWorld()));
        //Entity entityType = EntityType.getEntityFromNbt(stack.getOrCreateNbt().getCompound("id"), context.getWorld()).get();
        if(stack.hasNbt()){
            //Optional<EntityType<?>> type2 = EntityType.fromNbt(stack.getNbt().getString("type"));
            //String string = String.valueOf(type2.get());
            player.sendMessage(Text.literal(String.valueOf(stack.getNbt().getString("type"))).formatted(Formatting.LIGHT_PURPLE));
        }

        player.sendMessage(Text.literal(String.valueOf(this.type)).formatted(Formatting.RED));
        //player.sendMessage(Text.literal(String.valueOf(stack.getOrCreateNbt().getString("type"))).formatted(Formatting.GREEN));

        /*
        World world = context.getWorld();
        if(world instanceof ServerWorld serverWorld){
            serverWorld.spawnEntity(EntityType.get(nbtCompound.getString("id")).orElse(this.type).spawn(serverWorld, context.getBlockPos().up(1), SpawnReason.MOB_SUMMONED));
            player.getStackInHand(context.getHand()).decrement(1);
        }

         */


        return super.useOnBlock(context);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(stack.hasNbt() && world.isClient()){
            if(!stack.getOrCreateNbt().getString("type").isEmpty()){
                tooltip.add(Text.literal(stack.getOrCreateNbt().getString("type")));
            } else {
                tooltip.add(Text.literal((stack.getOrCreateNbt().getString("type"))));
            }
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
