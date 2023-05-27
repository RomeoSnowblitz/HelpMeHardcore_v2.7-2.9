package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;

public class InsusceptibilityEffect extends StatusEffect {
    public InsusceptibilityEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == CustomEffects.INSUSCEPTIBILITY && entity.hasStatusEffect(StatusEffects.NAUSEA)) {
            entity.removeStatusEffect(StatusEffects.NAUSEA);
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return this == CustomEffects.INSUSCEPTIBILITY;
    }
}