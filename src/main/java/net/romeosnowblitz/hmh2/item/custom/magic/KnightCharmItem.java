package net.romeosnowblitz.hmh2.item.custom.magic;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class KnightCharmItem extends Item {
    public KnightCharmItem(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(entity instanceof PlayerEntity player && !world.isClient()){
            player.removeStatusEffect(StatusEffects.MINING_FATIGUE);
            player.removeStatusEffect(StatusEffects.SLOWNESS);
            player.removeStatusEffect(StatusEffects.HUNGER);
            player.removeStatusEffect(StatusEffects.NAUSEA);
            player.removeStatusEffect(StatusEffects.POISON);
            player.removeStatusEffect(StatusEffects.WITHER);
            player.removeStatusEffect(StatusEffects.BLINDNESS);
            player.removeStatusEffect(StatusEffects.DARKNESS);
            player.removeStatusEffect(StatusEffects.WEAKNESS);
            player.removeStatusEffect(StatusEffects.INSTANT_DAMAGE);
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK,1200,9));
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

}
