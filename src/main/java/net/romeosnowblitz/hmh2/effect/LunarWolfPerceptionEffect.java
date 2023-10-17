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
        if (entity.hasStatusEffect(StatusEffects.BLINDNESS) || entity.hasStatusEffect(StatusEffects.DARKNESS)) {
            entity.removeStatusEffect(StatusEffects.BLINDNESS);
            entity.removeStatusEffect(StatusEffects.DARKNESS);
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

}
