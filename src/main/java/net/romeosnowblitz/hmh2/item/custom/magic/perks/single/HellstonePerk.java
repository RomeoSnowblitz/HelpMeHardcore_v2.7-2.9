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
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.item.WarfareItems;
import net.romeosnowblitz.hmh2.item.custom.armor.NetherHealthArmorItem;
import net.romeosnowblitz.hmh2.item.custom.armor.NetherSightArmorItem;

public class HellstonePerk
extends NetherSightArmorItem {
    public HellstonePerk(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && entity instanceof PlayerEntity player) {
            if (player.getEquippedStack(EquipmentSlot.HEAD).isOf(WarfareItems.HELLSTONE_HELMET) || player.getEquippedStack(EquipmentSlot.CHEST).isOf(WarfareItems.HELLSTONE_CHESTPLATE) ||
                    player.getEquippedStack(EquipmentSlot.LEGS).isOf(WarfareItems.HELLSTONE_LEGGINGS) || player.getEquippedStack(EquipmentSlot.FEET).isOf(WarfareItems.HELLSTONE_BOOTS)) {
                if(player.isOnFire()){player.setFireTicks(0);}
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}

