/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1271
 *  net.minecraft.class_1293
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_174
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1839
 *  net.minecraft.class_1937
 *  net.minecraft.class_3222
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3468
 *  net.minecraft.class_5328
 */
package net.romeosnowblitz.hmh2.item.custom.food;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;

public class EnderSkinConsumableLong
extends Item {
    public EnderSkinConsumableLong(Settings settings) {
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
        user.addStatusEffect(new StatusEffectInstance(CustomEffects.ENDER_SKIN, 12000, 1));
        return super.finishUsing(stack, world, user);
    }

}

