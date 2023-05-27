package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class NormieEffect extends StatusEffect {
    public NormieEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == CustomEffects.NORMIE) {
            entity.addStatusEffect(new StatusEffectInstance(CustomEffects.NORMIE, 1200));
        }
        if (this.hasAnyEffect(entity)) {
            entity.removeStatusEffect(CustomEffects.NORMIE);
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return this == CustomEffects.NORMIE;
    }

    public boolean hasAnyEffect(LivingEntity entity) {
        return entity.hasStatusEffect(StatusEffects.ABSORPTION) || entity.hasStatusEffect(StatusEffects.BAD_OMEN) ||
                entity.hasStatusEffect(StatusEffects.BLINDNESS) || entity.hasStatusEffect(StatusEffects.CONDUIT_POWER) ||
                entity.hasStatusEffect(StatusEffects.DARKNESS) || entity.hasStatusEffect(StatusEffects.DOLPHINS_GRACE) ||
                entity.hasStatusEffect(StatusEffects.FIRE_RESISTANCE) || entity.hasStatusEffect(StatusEffects.GLOWING) ||
                entity.hasStatusEffect(StatusEffects.HASTE) || entity.hasStatusEffect(StatusEffects.HEALTH_BOOST) ||
                entity.hasStatusEffect(StatusEffects.HUNGER) || entity.hasStatusEffect(StatusEffects.INSTANT_DAMAGE) ||
                entity.hasStatusEffect(StatusEffects.INSTANT_HEALTH) || entity.hasStatusEffect(StatusEffects.INVISIBILITY) ||
                entity.hasStatusEffect(StatusEffects.JUMP_BOOST) || entity.hasStatusEffect(StatusEffects.LEVITATION) ||
                entity.hasStatusEffect(StatusEffects.LUCK) || entity.hasStatusEffect(StatusEffects.MINING_FATIGUE) ||
                entity.hasStatusEffect(StatusEffects.NAUSEA) || entity.hasStatusEffect(StatusEffects.NIGHT_VISION) ||
                entity.hasStatusEffect(StatusEffects.POISON) || entity.hasStatusEffect(StatusEffects.REGENERATION) ||
                entity.hasStatusEffect(StatusEffects.RESISTANCE) || entity.hasStatusEffect(StatusEffects.SATURATION) ||
                entity.hasStatusEffect(StatusEffects.SLOW_FALLING) || entity.hasStatusEffect(StatusEffects.SLOWNESS) ||
                entity.hasStatusEffect(StatusEffects.SPEED) || entity.hasStatusEffect(StatusEffects.STRENGTH) ||
                entity.hasStatusEffect(StatusEffects.HERO_OF_THE_VILLAGE) || entity.hasStatusEffect(StatusEffects.WATER_BREATHING) ||
                entity.hasStatusEffect(StatusEffects.WEAKNESS) || entity.hasStatusEffect(StatusEffects.WITHER) ||
                entity.hasStatusEffect(CustomEffects.ANCHORED) || entity.hasStatusEffect(CustomEffects.CONDUIT_FAILURE) ||
                entity.hasStatusEffect(CustomEffects.DOLPHINS_CURSE) || entity.hasStatusEffect(CustomEffects.ENDER_SKIN) ||
                entity.hasStatusEffect(CustomEffects.HEALTH_SHRINKAGE) || entity.hasStatusEffect(CustomEffects.INSUSCEPTIBILITY) ||
                entity.hasStatusEffect(CustomEffects.KINDLING) || entity.hasStatusEffect(CustomEffects.LUNAR_WOLF_PERCEPTION) ||
                entity.hasStatusEffect(CustomEffects.POISON_IMMUNITY) || entity.hasStatusEffect(CustomEffects.SIGHTLESSSNESS);
    }
}
