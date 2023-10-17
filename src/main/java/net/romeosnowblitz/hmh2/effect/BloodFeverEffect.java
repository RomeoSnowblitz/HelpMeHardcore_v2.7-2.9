package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.*;

public class BloodFeverEffect extends StatusEffect {
    public BloodFeverEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(24>>amplifier/4>0){if (entity.getStatusEffect(CustomEffects.BLOOD_FEVER).getDuration()%(24>>amplifier/4)==0){
                if (entity.getHealth() < entity.getMaxHealth()) {entity.heal(1.0F);}}}
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, entity.getStatusEffect(CustomEffects.BLOOD_FEVER).getDuration(), amplifier/4));
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

}
