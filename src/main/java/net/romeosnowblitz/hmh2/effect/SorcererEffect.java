package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.romeosnowblitz.hmh2.tag.ModBiomeTags;
import net.romeosnowblitz.hmh2.util.ModStats;

public class SorcererEffect extends StatusEffect {
    public SorcererEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public static int t = 0;

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if(entity instanceof ServerPlayerEntity player){
            player.increaseStat(ModStats.CLASS_ID, 2);
            if(player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID)) != 2){
                player.increaseStat(ModStats.CLASS_ID, -2);
            }
        }
        if(entity.hasStatusEffect(CustomEffects.NECROMANCER)) {
            entity.removeStatusEffect(CustomEffects.SORCERER);
        } else {
            entity.removeStatusEffect(CustomEffects.NECROMANCER);
            entity.addStatusEffect(new StatusEffectInstance(CustomEffects.SORCERER,  -1,  0, false, false, false));
        }
        if(entity instanceof PlayerEntity player){

            if(player.getWorld().getBiome(player.getBlockPos()).isIn(ModBiomeTags.IS_BASALT_DELTAS)){++t;} else {t = 0;}
            if (t>600 && t % 200 == 0) {player.addStatusEffect(new StatusEffectInstance(CustomEffects.ASH_LUNG, 600));}
        }
        super.onApplied(entity, attributes, amplifier);
    }

}
