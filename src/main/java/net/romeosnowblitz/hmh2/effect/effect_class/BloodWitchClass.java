package net.romeosnowblitz.hmh2.effect.effect_class;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.romeosnowblitz.hmh2.util.ModStats;

public class BloodWitchClass extends StatusEffect {
    public BloodWitchClass(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if(entity instanceof ServerPlayerEntity serverPlayer && serverPlayer.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID))==0){
            serverPlayer.getStatHandler().setStat(serverPlayer, Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID), 4);
        }
        super.onApplied(entity, attributes, amplifier);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
