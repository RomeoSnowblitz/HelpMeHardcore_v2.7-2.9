package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class SlimeLungEffect extends StatusEffect {
    public SlimeLungEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity player &&  player.hasStatusEffect(CustomEffects.ASH_LUNG)) {
            player.removeStatusEffect(CustomEffects.ASH_LUNG);
            player.getHungerManager().addExhaustion(1f);
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}