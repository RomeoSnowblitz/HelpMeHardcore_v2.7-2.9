package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;

public class LunarWolfPerceptionEffect extends StatusEffect {
    public LunarWolfPerceptionEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == CustomEffects.LUNAR_WOLF_PERCEPTION && entity.hasStatusEffect(StatusEffects.BLINDNESS)) {
            entity.removeStatusEffect(StatusEffects.BLINDNESS);
        }
        if (this == CustomEffects.LUNAR_WOLF_PERCEPTION && entity.hasStatusEffect(StatusEffects.DARKNESS)) {
            entity.removeStatusEffect(StatusEffects.DARKNESS);
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return this == CustomEffects.LUNAR_WOLF_PERCEPTION;
    }
}
