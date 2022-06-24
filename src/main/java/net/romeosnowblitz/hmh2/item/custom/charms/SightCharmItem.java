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

public class SightCharmItem extends Item {
    public SightCharmItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity playerEntity = context.getPlayer();
        playerEntity.removeStatusEffect(StatusEffects.BLINDNESS);
        playerEntity.removeStatusEffect(StatusEffects.DARKNESS);
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK,1200,2));
        context.getStack().damage(1, playerEntity, p -> p.sendToolBreakStatus(context.getHand()));
        return super.useOnBlock(context);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        attacker.removeStatusEffect(StatusEffects.BLINDNESS);
        attacker.removeStatusEffect(StatusEffects.DARKNESS);
        target.removeStatusEffect(StatusEffects.BLINDNESS);
        target.removeStatusEffect(StatusEffects.DARKNESS);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 2));
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 2));
        stack.damage(1, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return super.postHit(stack, target, attacker);
    }
}
