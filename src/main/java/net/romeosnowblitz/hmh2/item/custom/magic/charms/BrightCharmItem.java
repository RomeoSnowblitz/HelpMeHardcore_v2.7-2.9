package net.romeosnowblitz.hmh2.item.custom.magic.charms;

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

public class BrightCharmItem extends Item {
    public BrightCharmItem(Settings settings) {
        super(settings);
    }


    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND){
            user.removeStatusEffect(StatusEffects.HUNGER);
            user.removeStatusEffect(StatusEffects.NAUSEA);
            user.removeStatusEffect(StatusEffects.BLINDNESS);
            user.removeStatusEffect(StatusEffects.DARKNESS);
            user.removeStatusEffect(StatusEffects.WEAKNESS);
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK,1200,4));
            user.getMainHandStack().damage(10, user, p -> p.sendToolBreakStatus(hand));
        }
        return super.use(world, user, hand);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        attacker.removeStatusEffect(StatusEffects.HUNGER);
        attacker.removeStatusEffect(StatusEffects.NAUSEA);
        target.removeStatusEffect(StatusEffects.HUNGER);
        target.removeStatusEffect(StatusEffects.NAUSEA);
        attacker.removeStatusEffect(StatusEffects.BLINDNESS);
        attacker.removeStatusEffect(StatusEffects.DARKNESS);
        target.removeStatusEffect(StatusEffects.BLINDNESS);
        target.removeStatusEffect(StatusEffects.DARKNESS);
        attacker.removeStatusEffect(StatusEffects.WEAKNESS);
        target.removeStatusEffect(StatusEffects.WEAKNESS);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 4));
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 4));
        stack.damage(20, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return super.postHit(stack, target, attacker);
    }
}
