package net.romeosnowblitz.hmh2.effect;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.MathHelper;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.tag.ModBiomeTags;

public class HellBoundEffect extends StatusEffect {
    public HellBoundEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public static int t = 0;
    public static int k = 120;
    public static int p = 0;

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity instanceof PlayerEntity player){
            if(amplifier==0){t=0;k=120;p=0;player.addStatusEffect(new StatusEffectInstance(this, player.getStatusEffect(this).getDuration(), 1));}
            if(amplifier<=1 && !player.getWorld().getDimension().ultrawarm()){t++;
                if(t==k){t=0;k=k-1;p=p+1;
                    player.damage(player.getWorld().getDamageSources().create(ModDamageTypes.KILLED_BY_DEMONS_CURSE), p/5);
                    player.addExhaustion(p);
                }
            }
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
