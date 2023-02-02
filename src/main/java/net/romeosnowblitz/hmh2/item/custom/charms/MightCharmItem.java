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
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class MightCharmItem extends Item {
    public MightCharmItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND){
            user.removeStatusEffect(StatusEffects.HUNGER);
            user.removeStatusEffect(StatusEffects.NAUSEA);
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK,1200,2));
            user.getMainHandStack().damage(5, user, p -> p.sendToolBreakStatus(hand));
        }
        return super.use(world, user, hand);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        attacker.removeStatusEffect(StatusEffects.HUNGER);
        attacker.removeStatusEffect(StatusEffects.NAUSEA);
        target.removeStatusEffect(StatusEffects.HUNGER);
        target.removeStatusEffect(StatusEffects.NAUSEA);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 2));
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 2));
        stack.damage(10, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return super.postHit(stack, target, attacker);
    }
}
