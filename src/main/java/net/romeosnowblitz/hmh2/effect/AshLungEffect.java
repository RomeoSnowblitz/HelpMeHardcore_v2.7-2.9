package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.stat.Stat;
import net.minecraft.text.Text;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;

import java.util.Objects;

public class AshLungEffect extends StatusEffect {
    public AshLungEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity.hasStatusEffect(CustomEffects.SAVING_GRACE) && entity.hasStatusEffect(CustomEffects.NORMIE) && entity.getHealth() < 2){
            entity.removeStatusEffect(this);
            entity.addStatusEffect(new StatusEffectInstance(CustomEffects.NECROMANCER,  -1,  0, false, false, true));
            entity.heal(entity.getStatusEffect(CustomEffects.SAVING_GRACE).getAmplifier());
            entity.removeStatusEffect(CustomEffects.SAVING_GRACE);
        }
        if(!entity.hasStatusEffect(CustomEffects.SLIME_LUNG)){
            entity.damage(entity.getDamageSources().create(ModDamageTypes.KILLED_BY_ASHLUNG), 1.0F);
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        if (40 >> amplifier > 0) {return duration % 40 >> amplifier == 0;
        } else {return true;}
    }
}
