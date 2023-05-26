package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;

public class ConduitFailureEffect extends StatusEffect {
    public ConduitFailureEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == CustomEffects.CONDUIT_FAILURE && entity.hasStatusEffect(StatusEffects.CONDUIT_POWER)) {
            entity.removeStatusEffect(StatusEffects.CONDUIT_POWER);
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return this == CustomEffects.CONDUIT_FAILURE;
    }
}
