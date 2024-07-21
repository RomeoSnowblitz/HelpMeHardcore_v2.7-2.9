package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.*;

public class EffectPreventer extends StatusEffect {

    public EffectPreventer(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity.hasStatusEffect(CustomEffects.CONDUIT_FAILURE)){entity.removeStatusEffect(StatusEffects.CONDUIT_POWER);}
        if(entity.hasStatusEffect(CustomEffects.DOLPHINS_CURSE)){entity.removeStatusEffect(StatusEffects.DOLPHINS_GRACE);}
        if(entity.hasStatusEffect(CustomEffects.INSUSCEPTIBILITY)){entity.removeStatusEffect(StatusEffects.NAUSEA);}
        if(entity.hasStatusEffect(CustomEffects.POISON_IMMUNITY)){entity.removeStatusEffect(StatusEffects.POISON);}
        if(entity.hasStatusEffect(CustomEffects.SIGHTLESSSNESS)){entity.removeStatusEffect(StatusEffects.NIGHT_VISION);}
        if(entity.hasStatusEffect(CustomEffects.WITHER_IMMUNITY)){entity.removeStatusEffect(StatusEffects.WITHER);}
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}