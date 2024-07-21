
package net.romeosnowblitz.hmh2.item.custom.food;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;

public class EnderSkinConsumableShort
extends Item {
    public EnderSkinConsumableShort(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 40;
    }

    @Override
    public SoundEvent getEatSound() {
        return SoundEvents.ENTITY_GENERIC_EAT;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        user.addStatusEffect(new StatusEffectInstance(CustomEffects.ENDER_SKIN, 600, 1));
        return super.finishUsing(stack, world, user);
    }

}

