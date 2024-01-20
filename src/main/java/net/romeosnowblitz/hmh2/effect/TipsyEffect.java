package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

public class TipsyEffect extends StatusEffect {

    protected TipsyEffect(StatusEffectCategory category, int color) { super(category, color);}


    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        Random random = new Random();
        if (amplifier >= 1 && entity.getStatusEffect(this).getDuration() == 20) {
            entity.addStatusEffect(new StatusEffectInstance(this, 200, amplifier - 1, false, false, true));
        }
        if (amplifier >= 5) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 10, 0, false, false, true));
        }
        entity.updateVelocity(0.1f, new Vec3d((random.nextFloat() - 0.5f) * (amplifier+1), 0, (random.nextFloat() - 0.5f) * (amplifier+1)));
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
