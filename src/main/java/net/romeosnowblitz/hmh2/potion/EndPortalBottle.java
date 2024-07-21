package net.romeosnowblitz.hmh2.potion;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.item.custom.food.ConsumeLeaveItem;

import java.util.Set;

public class EndPortalBottle extends ConsumeLeaveItem {
    public EndPortalBottle(int consumeTime, SoundEvent sound, ItemStack leftovers, Item.Settings settings) {
        super(consumeTime, sound, leftovers, settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity entity) {
        ServerWorld serverWorld = (ServerWorld) world;
        if(entity.getWorld().getDimension().bedWorks()){
            entity.teleport(serverWorld.getServer().getWorld(World.END), entity.getX(), entity.getY(), entity.getZ(), Set.of(), entity.getYaw(), entity.getPitch());
        } else if (entity.getWorld().getDimension().ultrawarm()) {
            entity.teleport(serverWorld.getServer().getWorld(World.END), entity.getX()*8, entity.getY(), entity.getZ()*8, Set.of(), entity.getYaw(), entity.getPitch());
        } else {
            entity.teleport(serverWorld.getServer().getWorld(World.OVERWORLD), entity.getX(), entity.getY(), entity.getZ(), Set.of(), entity.getYaw(), entity.getPitch());
        }
        return super.finishUsing(stack, world, entity);
    }

    @Override
    public SoundEvent getEatSound() {
        return SoundEvents.ITEM_HONEY_BOTTLE_DRINK;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }
}
