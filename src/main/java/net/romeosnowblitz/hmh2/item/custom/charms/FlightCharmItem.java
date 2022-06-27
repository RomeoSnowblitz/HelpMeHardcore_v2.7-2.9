package net.romeosnowblitz.hmh2.item.custom.charms;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class FlightCharmItem extends Item {
    public FlightCharmItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity playerEntity = context.getPlayer();
        playerEntity.removeStatusEffect(StatusEffects.MINING_FATIGUE);
        playerEntity.removeStatusEffect(StatusEffects.SLOWNESS);
        playerEntity.removeStatusEffect(StatusEffects.HUNGER);
        playerEntity.removeStatusEffect(StatusEffects.NAUSEA);
        playerEntity.removeStatusEffect(StatusEffects.WEAKNESS);
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK,1200,4));
        context.getStack().damage(1, playerEntity, p -> p.sendToolBreakStatus(context.getHand()));
        return super.useOnBlock(context);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        attacker.removeStatusEffect(StatusEffects.MINING_FATIGUE);
        attacker.removeStatusEffect(StatusEffects.SLOWNESS);
        target.removeStatusEffect(StatusEffects.MINING_FATIGUE);
        target.removeStatusEffect(StatusEffects.SLOWNESS);
        attacker.removeStatusEffect(StatusEffects.HUNGER);
        attacker.removeStatusEffect(StatusEffects.NAUSEA);
        target.removeStatusEffect(StatusEffects.HUNGER);
        target.removeStatusEffect(StatusEffects.NAUSEA);
        attacker.removeStatusEffect(StatusEffects.WEAKNESS);
        target.removeStatusEffect(StatusEffects.WEAKNESS);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 4));
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 4));
        stack.damage(1, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return super.postHit(stack, target, attacker);
    }
}
