package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.tag.ModBiomeTags;

public class HellBoundEffect extends StatusEffect {
    public HellBoundEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public static int t = 0;

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity instanceof PlayerEntity player){
            if(!player.getWorld().getDimension().ultrawarm()){++t;} else {t = 0;}
            if (t>80 && t % 40 == 0) {
                player.damage(player.getWorld().getDamageSources().create(ModDamageTypes.KILLED_BY_DEMONS_CURSE), 1.0F);
                player.addExhaustion(10f);
            }
        }
    }

}
