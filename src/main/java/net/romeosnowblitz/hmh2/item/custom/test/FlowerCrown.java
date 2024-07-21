package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.util.ModStats;

public class FlowerCrown extends ArmorItem {
    public FlowerCrown(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(entity instanceof ServerPlayerEntity serverPlayer &&
                serverPlayer.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID)) == 0 &&
                ((ServerPlayerEntity) entity).getEquippedStack(EquipmentSlot.HEAD).isOf(this)){
            serverPlayer.getStatHandler().setStat(serverPlayer, Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID), 100);
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
