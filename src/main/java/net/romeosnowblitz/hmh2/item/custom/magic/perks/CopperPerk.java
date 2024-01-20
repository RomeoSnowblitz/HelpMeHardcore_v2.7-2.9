/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.StatusEffectInstance()
 *  net.minecraft.StatusEffects
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1738
 *  net.minecraft.class_1738$class_8051
 *  net.minecraft.class_1741
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.ItemStack
 *  net.minecraft.class_1937
 */
package net.romeosnowblitz.hmh2.item.custom.magic.perks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.item.WarfareItems;
import net.romeosnowblitz.hmh2.item.custom.armor.UndergroundMovementArmorItem;

import java.util.Objects;

import static net.minecraft.entity.damage.DamageTypes.LIGHTNING_BOLT;

public class CopperPerk
        extends UndergroundMovementArmorItem {
    public CopperPerk(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && entity instanceof PlayerEntity) {
            PlayerEntity player = (ServerPlayerEntity)entity;
            ItemStack headPiece = player.getEquippedStack(EquipmentSlot.HEAD);
            ItemStack chestPiece = player.getEquippedStack(EquipmentSlot.CHEST);
            ItemStack legPiece = player.getEquippedStack(EquipmentSlot.LEGS);
            ItemStack footPiece = player.getEquippedStack(EquipmentSlot.FEET);
            if (headPiece.isOf(WarfareItems.COPPER_HELMET) || chestPiece.isOf(WarfareItems.COPPER_CHESTPLATE) || legPiece.isOf(WarfareItems.COPPER_LEGGINGS) || footPiece.isOf(WarfareItems.COPPER_BOOTS)) {
                if(world.isReceivingRedstonePower(player.getBlockPos())){
                    player.damage(world.getDamageSources().generic(), 1);
                }
                if(player.getRecentDamageSource() == world.getDamageSources().lightningBolt()){
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 0));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 0));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 100, 0));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 0));
                }
            }
            if (headPiece.isOf(WarfareItems.COPPER_HELMET) && chestPiece.isOf(WarfareItems.COPPER_CHESTPLATE) || headPiece.isOf(WarfareItems.COPPER_HELMET) && legPiece.isOf(WarfareItems.COPPER_LEGGINGS) || headPiece.isOf(WarfareItems.COPPER_HELMET) && footPiece.isOf(WarfareItems.COPPER_BOOTS) || chestPiece.isOf(WarfareItems.COPPER_CHESTPLATE) && legPiece.isOf(WarfareItems.COPPER_LEGGINGS) || chestPiece.isOf(WarfareItems.COPPER_CHESTPLATE) && footPiece.isOf(WarfareItems.COPPER_BOOTS) || legPiece.isOf(WarfareItems.COPPER_LEGGINGS) && footPiece.isOf(WarfareItems.COPPER_BOOTS)) {
                if(world.isReceivingRedstonePower(player.getBlockPos())){
                    player.damage(world.getDamageSources().generic(), 2);
                }
                if(player.getRecentDamageSource() == world.getDamageSources().lightningBolt()){
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 1));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 1));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 100, 1));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 1));
                }
            }
            if (chestPiece.isOf(WarfareItems.COPPER_CHESTPLATE) && legPiece.isOf(WarfareItems.COPPER_LEGGINGS) && footPiece.isOf(WarfareItems.COPPER_BOOTS) || headPiece.isOf(WarfareItems.COPPER_HELMET) && legPiece.isOf(WarfareItems.COPPER_LEGGINGS) && footPiece.isOf(WarfareItems.COPPER_BOOTS) || headPiece.isOf(WarfareItems.COPPER_HELMET) && chestPiece.isOf(WarfareItems.COPPER_CHESTPLATE) && footPiece.isOf(WarfareItems.COPPER_BOOTS) || headPiece.isOf(WarfareItems.COPPER_HELMET) && chestPiece.isOf(WarfareItems.COPPER_CHESTPLATE) && legPiece.isOf(WarfareItems.COPPER_LEGGINGS)) {
                if(world.isReceivingRedstonePower(player.getBlockPos())){
                    player.damage(world.getDamageSources().generic(), 3);
                }
                if(player.getRecentDamageSource() == world.getDamageSources().lightningBolt()){
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 2));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 2));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 2));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 100, 2));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 2));
                }
            }
            if (headPiece.isOf(WarfareItems.COPPER_HELMET) && chestPiece.isOf(WarfareItems.COPPER_CHESTPLATE) && legPiece.isOf(WarfareItems.COPPER_LEGGINGS) && footPiece.isOf(WarfareItems.COPPER_BOOTS)) {
                if(world.isReceivingRedstonePower(player.getBlockPos())){
                    player.damage(world.getDamageSources().generic(), 4);
                }
                if(player.getRecentDamageSource() == world.getDamageSources().lightningBolt()){
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 3));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 3));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 3));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 100, 3));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 3));
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}

