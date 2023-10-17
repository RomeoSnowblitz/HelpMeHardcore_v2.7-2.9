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

public class FurPerk
extends ArmorItem {
    public FurPerk(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && entity instanceof PlayerEntity player) {
            if (player.getEquippedStack(EquipmentSlot.HEAD).isOf(WarfareItems.FUR_HELMET) || player.getEquippedStack(EquipmentSlot.CHEST).isOf(WarfareItems.FUR_CHESTPLATE) ||
                    player.getEquippedStack(EquipmentSlot.LEGS).isOf(WarfareItems.FUR_LEGGINGS) || player.getEquippedStack(EquipmentSlot.FEET).isOf(WarfareItems.FUR_BOOTS)) {
                player.addStatusEffect(new StatusEffectInstance(CustomEffects.LUNAR_WOLF_PERCEPTION, 60, 0, false, false, true));
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}

