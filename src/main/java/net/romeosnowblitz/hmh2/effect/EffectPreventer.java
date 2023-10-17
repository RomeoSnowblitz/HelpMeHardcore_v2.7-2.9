package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;

public class EffectPreventer extends StatusEffect {

    protected static StatusEffect EFFECT;

    public EffectPreventer(StatusEffect effect, StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
        EFFECT = effect;
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.hasStatusEffect(EFFECT)) {entity.removeStatusEffect(EFFECT);}
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}