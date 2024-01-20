/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1738
 *  net.minecraft.class_1738$class_8051
 *  net.minecraft.class_1741
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 */
package net.romeosnowblitz.hmh2.item.custom.magic.perks;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.item.WarfareItems;
import net.romeosnowblitz.hmh2.item.custom.armor.UndergroundHealthArmorItem;

public class HeartPerk
extends UndergroundHealthArmorItem {
    public HeartPerk(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && entity instanceof PlayerEntity) {
            PlayerEntity player = (ServerPlayerEntity)entity;
            ItemStack headPiece = player.getEquippedStack(EquipmentSlot.HEAD);
            ItemStack chestPiece = player.getEquippedStack(EquipmentSlot.CHEST);
            ItemStack legPiece = player.getEquippedStack(EquipmentSlot.LEGS);
            ItemStack footPiece = player.getEquippedStack(EquipmentSlot.FEET);
            if (!player.hasStatusEffect(StatusEffects.ABSORPTION) && headPiece.isOf(WarfareItems.LIFE_HELMET) && chestPiece.isOf(WarfareItems.LIFE_CHESTPLATE) && legPiece.isOf(WarfareItems.LIFE_LEGGINGS) && footPiece.isOf(WarfareItems.LIFE_BOOTS)) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 3, false, false, true));
                headPiece.damage(4, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.HEAD));
                chestPiece.damage(4, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.CHEST));
                legPiece.damage(4, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.LEGS));
                footPiece.damage(4, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.FEET));
            }
            if (!player.hasStatusEffect(StatusEffects.ABSORPTION) && chestPiece.isOf(WarfareItems.LIFE_CHESTPLATE) && legPiece.isOf(WarfareItems.LIFE_LEGGINGS) && footPiece.isOf(WarfareItems.LIFE_BOOTS) || !player.hasStatusEffect(StatusEffects.ABSORPTION) && headPiece.isOf(WarfareItems.LIFE_HELMET) && legPiece.isOf(WarfareItems.LIFE_LEGGINGS) && footPiece.isOf(WarfareItems.LIFE_BOOTS) || !player.hasStatusEffect(StatusEffects.ABSORPTION) && headPiece.isOf(WarfareItems.LIFE_HELMET) && chestPiece.isOf(WarfareItems.LIFE_CHESTPLATE) && footPiece.isOf(WarfareItems.LIFE_BOOTS) || !player.hasStatusEffect(StatusEffects.ABSORPTION) && headPiece.isOf(WarfareItems.LIFE_HELMET) && chestPiece.isOf(WarfareItems.LIFE_CHESTPLATE) && legPiece.isOf(WarfareItems.LIFE_LEGGINGS)) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 900, 2, false, false, true));
                headPiece.damage(3, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.HEAD));
                chestPiece.damage(3, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.CHEST));
                legPiece.damage(3, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.LEGS));
                footPiece.damage(3, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.FEET));
            }
            if (!player.hasStatusEffect(StatusEffects.ABSORPTION) && headPiece.isOf(WarfareItems.LIFE_HELMET) && chestPiece.isOf(WarfareItems.LIFE_CHESTPLATE) || !player.hasStatusEffect(StatusEffects.ABSORPTION) && headPiece.isOf(WarfareItems.LIFE_HELMET) && legPiece.isOf(WarfareItems.LIFE_LEGGINGS) ||  !player.hasStatusEffect(StatusEffects.ABSORPTION) && headPiece.isOf(WarfareItems.LIFE_HELMET) && footPiece.isOf(WarfareItems.LIFE_BOOTS) || !player.hasStatusEffect(StatusEffects.ABSORPTION) && chestPiece.isOf(WarfareItems.LIFE_CHESTPLATE) && legPiece.isOf(WarfareItems.LIFE_LEGGINGS) || !player.hasStatusEffect(StatusEffects.ABSORPTION) && chestPiece.isOf(WarfareItems.LIFE_CHESTPLATE) && footPiece.isOf(WarfareItems.LIFE_BOOTS) || !player.hasStatusEffect(StatusEffects.ABSORPTION) && legPiece.isOf(WarfareItems.LIFE_LEGGINGS) && footPiece.isOf(WarfareItems.LIFE_BOOTS)) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 1, false, false, true));
                headPiece.damage(2, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.HEAD));
                chestPiece.damage(2, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.CHEST));
                legPiece.damage(2, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.LEGS));
                footPiece.damage(2, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.FEET));
            }
            if (!player.hasStatusEffect(StatusEffects.ABSORPTION) && headPiece.isOf(WarfareItems.LIFE_HELMET) || !player.hasStatusEffect(StatusEffects.ABSORPTION) && chestPiece.isOf(WarfareItems.LIFE_CHESTPLATE) || !player.hasStatusEffect(StatusEffects.ABSORPTION) && legPiece.isOf(WarfareItems.LIFE_LEGGINGS) || !player.hasStatusEffect(StatusEffects.ABSORPTION) && footPiece.isOf(WarfareItems.LIFE_BOOTS)) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 300, 0, false, false, true));
                headPiece.damage(1, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.HEAD));
                chestPiece.damage(1, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.CHEST));
                legPiece.damage(1, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.LEGS));
                footPiece.damage(1, player,  (p) -> p.sendEquipmentBreakStatus(EquipmentSlot.FEET));
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}

