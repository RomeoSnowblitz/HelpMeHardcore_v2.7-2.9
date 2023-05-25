package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;

public class AnchoredEffect extends StatusEffect {
    public AnchoredEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == CustomEffects.ANCHORED && entity.isInsideWaterOrBubbleColumn()) {
            entity.setVelocity(0, -0.1, 0);
        }
        if (this == CustomEffects.ANCHORED && !entity.isInsideWaterOrBubbleColumn()) {
            entity.setVelocity(0, -2, 0);
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return this == CustomEffects.ANCHORED;
    }
}
