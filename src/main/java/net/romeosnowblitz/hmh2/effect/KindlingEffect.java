package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;

public class KindlingEffect extends StatusEffect {
    public KindlingEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == CustomEffects.KINDLING) {
            if (entity.isOnFire()) {
                entity.damage(entity.getDamageSources().generic(), 2);
            }
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        if (this == CustomEffects.KINDLING) {
            //the lower the number the faster it is
            int i = 20 >> amplifier;
            if (i > 0) {
                return duration % i == 0;
            }
            return true;
        }
        return false;
    }
}
