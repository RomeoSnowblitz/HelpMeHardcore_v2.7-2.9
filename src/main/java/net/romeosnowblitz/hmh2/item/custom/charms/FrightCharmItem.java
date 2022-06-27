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

public class FrightCharmItem extends Item {
    public FrightCharmItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity playerEntity = context.getPlayer();
        playerEntity.removeStatusEffect(StatusEffects.POISON);
        playerEntity.removeStatusEffect(StatusEffects.WITHER);
        playerEntity.removeStatusEffect(StatusEffects.BLINDNESS);
        playerEntity.removeStatusEffect(StatusEffects.DARKNESS);
        playerEntity.removeStatusEffect(StatusEffects.WEAKNESS);
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK,1200,4));
        context.getStack().damage(1, playerEntity, p -> p.sendToolBreakStatus(context.getHand()));
        return super.useOnBlock(context);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        attacker.removeStatusEffect(StatusEffects.POISON);
        attacker.removeStatusEffect(StatusEffects.WITHER);
        target.removeStatusEffect(StatusEffects.POISON);
        target.removeStatusEffect(StatusEffects.WITHER);
        attacker.removeStatusEffect(StatusEffects.BLINDNESS);
        attacker.removeStatusEffect(StatusEffects.DARKNESS);
        target.removeStatusEffect(StatusEffects.BLINDNESS);
        target.removeStatusEffect(StatusEffects.DARKNESS);
        attacker.removeStatusEffect(StatusEffects.WEAKNESS);
        target.removeStatusEffect(StatusEffects.WEAKNESS);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 4));
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 4));
        stack.damage(1, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return super.postHit(stack, target, attacker);
    }
}
