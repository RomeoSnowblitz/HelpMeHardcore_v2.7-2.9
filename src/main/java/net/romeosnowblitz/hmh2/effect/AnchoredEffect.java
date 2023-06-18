package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class AnchoredEffect
        extends StatusEffect {
    public AnchoredEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == CustomEffects.ANCHORED && entity.isWet()) {
            entity.setVelocity(0.0, -0.1, 0.0);
        }
        if (this == CustomEffects.ANCHORED && !entity.isWet()) {
            entity.setVelocity(0.0, -2.0, 0.0);
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return this == CustomEffects.ANCHORED;
    }
}
