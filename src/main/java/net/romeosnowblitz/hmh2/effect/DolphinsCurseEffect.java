package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;

public class DolphinsCurseEffect extends StatusEffect {
    public DolphinsCurseEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == CustomEffects.DOLPHINS_CURSE && entity.hasStatusEffect(StatusEffects.DOLPHINS_GRACE)) {
            entity.removeStatusEffect(StatusEffects.DOLPHINS_GRACE);
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return this == CustomEffects.DOLPHINS_CURSE;
    }
}
