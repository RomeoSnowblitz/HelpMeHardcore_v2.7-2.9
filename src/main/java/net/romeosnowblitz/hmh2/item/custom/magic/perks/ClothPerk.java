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

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.item.WarfareItems;
import net.romeosnowblitz.hmh2.item.custom.armor.NetherMovementArmorItem;

public class ClothPerk
        extends NetherMovementArmorItem {
    public ClothPerk(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && entity instanceof PlayerEntity) {
            PlayerEntity player = (ServerPlayerEntity)entity;
            ItemStack headPiece = player.getEquippedStack(EquipmentSlot.HEAD);
            ItemStack chestPiece = player.getEquippedStack(EquipmentSlot.CHEST);
            ItemStack legPiece = player.getEquippedStack(EquipmentSlot.LEGS);
            ItemStack footPiece = player.getEquippedStack(EquipmentSlot.FEET);
            if (headPiece.isOf(WarfareItems.CLOTH_HELMET) || chestPiece.isOf(WarfareItems.CLOTH_CHESTPLATE) || legPiece.isOf(WarfareItems.CLOTH_LEGGINGS) || footPiece.isOf(WarfareItems.CLOTH_BOOTS)) {
                player.addStatusEffect(new StatusEffectInstance(CustomEffects.KINDLING, 60, 0, false, false, true));
            }
            if (headPiece.isOf(WarfareItems.CLOTH_HELMET) && chestPiece.isOf(WarfareItems.CLOTH_CHESTPLATE) || headPiece.isOf(WarfareItems.CLOTH_HELMET) && legPiece.isOf(WarfareItems.CLOTH_LEGGINGS) || headPiece.isOf(WarfareItems.CLOTH_HELMET) && footPiece.isOf(WarfareItems.CLOTH_BOOTS) || chestPiece.isOf(WarfareItems.CLOTH_CHESTPLATE) && legPiece.isOf(WarfareItems.CLOTH_LEGGINGS) || chestPiece.isOf(WarfareItems.CLOTH_CHESTPLATE) && footPiece.isOf(WarfareItems.CLOTH_BOOTS) || legPiece.isOf(WarfareItems.CLOTH_LEGGINGS) && footPiece.isOf(WarfareItems.CLOTH_BOOTS)) {
                player.addStatusEffect(new StatusEffectInstance(CustomEffects.KINDLING, 60, 1, false, false, true));
            }
            if (chestPiece.isOf(WarfareItems.CLOTH_CHESTPLATE) && legPiece.isOf(WarfareItems.CLOTH_LEGGINGS) && footPiece.isOf(WarfareItems.CLOTH_BOOTS) || headPiece.isOf(WarfareItems.CLOTH_HELMET) && legPiece.isOf(WarfareItems.CLOTH_LEGGINGS) && footPiece.isOf(WarfareItems.CLOTH_BOOTS) || headPiece.isOf(WarfareItems.CLOTH_HELMET) && chestPiece.isOf(WarfareItems.CLOTH_CHESTPLATE) && footPiece.isOf(WarfareItems.CLOTH_BOOTS) || headPiece.isOf(WarfareItems.CLOTH_HELMET) && chestPiece.isOf(WarfareItems.CLOTH_CHESTPLATE) && legPiece.isOf(WarfareItems.CLOTH_LEGGINGS)) {
                player.addStatusEffect(new StatusEffectInstance(CustomEffects.KINDLING, 60, 2, false, false, true));
            }
            if (headPiece.isOf(WarfareItems.CLOTH_HELMET) && chestPiece.isOf(WarfareItems.CLOTH_CHESTPLATE) && legPiece.isOf(WarfareItems.CLOTH_LEGGINGS) && footPiece.isOf(WarfareItems.CLOTH_BOOTS)) {
                player.addStatusEffect(new StatusEffectInstance(CustomEffects.KINDLING, 60, 3, false, false, true));
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}

