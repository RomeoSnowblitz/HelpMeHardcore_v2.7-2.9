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
package net.romeosnowblitz.hmh2.item.custom.magic.perks.single;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.item.WarfareItems;
import net.romeosnowblitz.hmh2.item.custom.armor.ArialHealthArmorItem;
import net.romeosnowblitz.hmh2.item.custom.armor.ArialNourishmentArmorItem;

public class QueenBeePerk
extends ArialNourishmentArmorItem {
    public QueenBeePerk(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && entity instanceof PlayerEntity player) {
            if (player.getEquippedStack(EquipmentSlot.HEAD).isOf(WarfareItems.QUEEN_BEE_HELMET) || player.getEquippedStack(EquipmentSlot.CHEST).isOf(WarfareItems.QUEEN_BEE_CHESTPLATE) ||
                    player.getEquippedStack(EquipmentSlot.LEGS).isOf(WarfareItems.QUEEN_BEE_LEGGINGS) || player.getEquippedStack(EquipmentSlot.FEET).isOf(WarfareItems.QUEEN_BEE_BOOTS)) {
                player.addStatusEffect(new StatusEffectInstance(CustomEffects.POISON_IMMUNITY, 60, 0, false, false, true));
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}

