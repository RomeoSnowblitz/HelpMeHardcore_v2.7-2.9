package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;

public class SightlessnessEffect extends StatusEffect {
    public SightlessnessEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == CustomEffects.SIGHTLESSSNESS && entity.hasStatusEffect(StatusEffects.NIGHT_VISION)) {
            entity.removeStatusEffect(StatusEffects.NIGHT_VISION);
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return this == CustomEffects.SIGHTLESSSNESS;
    }
}
