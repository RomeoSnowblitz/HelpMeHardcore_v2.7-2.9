package net.romeosnowblitz.hmh2.item.custom.amulets;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class DolphinsGraceAmuletItem extends Item {
    public DolphinsGraceAmuletItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity playerEntity = context.getPlayer();
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,200,2));
        context.getStack().damage(1, playerEntity, p -> p.sendToolBreakStatus(context.getHand()));
        return super.useOnBlock(context);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 200, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 200, 0), target);
        stack.damage(1, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return super.postHit(stack, target, attacker);
    }
}
