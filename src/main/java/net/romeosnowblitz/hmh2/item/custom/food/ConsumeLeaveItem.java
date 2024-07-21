package net.romeosnowblitz.hmh2.item.custom.food;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ConsumeLeaveItem extends Item {

    public int consumeTime;
    public SoundEvent sound;
    public ItemStack leftovers;

    public ConsumeLeaveItem(int consumeTime, SoundEvent sound, ItemStack leftovers, Settings settings) {
        super(settings);
        this.consumeTime = consumeTime;
        this.sound = sound;
        this.leftovers = leftovers;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return consumeTime;
    }

    @Override
    public SoundEvent getDrinkSound() {
        return sound;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }


    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if(user instanceof PlayerEntity player){player.giveItemStack(leftovers);}
        return super.finishUsing(stack, world, user);
    }

}
