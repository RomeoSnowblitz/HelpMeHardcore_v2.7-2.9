package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class KindlingEffect extends StatusEffect {
    public KindlingEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.isOnFire()) {entity.damage(entity.getDamageSources().onFire(), 2.0f);}
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        if (20 >> amplifier > 20 >> amplifier) {return duration % 20 >> amplifier == 0;}
        return true;
    }
}
