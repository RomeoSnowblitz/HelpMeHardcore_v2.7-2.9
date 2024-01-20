package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFrameItem;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.stat.Stat;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.romeosnowblitz.hmh2.block.MagicBlocks;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.item.MagicItems;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.tag.ModBiomeTags;
import net.romeosnowblitz.hmh2.util.ModStats;

public class NormieEffect extends StatusEffect {
    public NormieEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity instanceof ServerPlayerEntity player){
            int stat = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID));
            if(stat == 1){player.addStatusEffect(new StatusEffectInstance(CustomEffects.NECROMANCER, 20));}
            if(stat == 2){player.addStatusEffect(new StatusEffectInstance(CustomEffects.SORCERER, 20));}
        }
        if (entity.hasStatusEffect(CustomEffects.NECROMANCER) || entity.hasStatusEffect(CustomEffects.SORCERER)) {
            entity.removeStatusEffect(CustomEffects.NORMIE);
        } else {
            entity.addStatusEffect(new StatusEffectInstance(CustomEffects.NORMIE,  -1,  0, false, false, true));
        }
        if(entity.hasStatusEffect(StatusEffects.ABSORPTION)&& entity.hasStatusEffect(StatusEffects.BAD_OMEN)&& entity.hasStatusEffect(StatusEffects.BLINDNESS)&& entity.hasStatusEffect(StatusEffects.CONDUIT_POWER) &&
                entity.hasStatusEffect(StatusEffects.DARKNESS)&& entity.hasStatusEffect(StatusEffects.DOLPHINS_GRACE)&& entity.hasStatusEffect(StatusEffects.FIRE_RESISTANCE)&& entity.hasStatusEffect(StatusEffects.GLOWING) &&
                entity.hasStatusEffect(StatusEffects.HASTE)&& entity.hasStatusEffect(StatusEffects.HERO_OF_THE_VILLAGE)&& entity.hasStatusEffect(StatusEffects.HUNGER)&& entity.hasStatusEffect(StatusEffects.INVISIBILITY)&&
                entity.hasStatusEffect(StatusEffects.JUMP_BOOST)&& entity.hasStatusEffect(StatusEffects.LEVITATION)&& entity.hasStatusEffect(StatusEffects.MINING_FATIGUE)&& entity.hasStatusEffect(StatusEffects.NAUSEA)&&
                entity.hasStatusEffect(StatusEffects.NIGHT_VISION)&& entity.hasStatusEffect(StatusEffects.POISON)&& entity.hasStatusEffect(StatusEffects.REGENERATION)&& entity.hasStatusEffect(StatusEffects.RESISTANCE)&&
                entity.hasStatusEffect(StatusEffects.SLOW_FALLING)&& entity.hasStatusEffect(StatusEffects.SLOWNESS)&& entity.hasStatusEffect(StatusEffects.SPEED)&& entity.hasStatusEffect(StatusEffects.STRENGTH)&&
                entity.hasStatusEffect(StatusEffects.WATER_BREATHING)&& entity.hasStatusEffect(StatusEffects.WEAKNESS)&& entity.hasStatusEffect(StatusEffects.WITHER)&&
                entity.hasStatusEffect(CustomEffects.NORMIE) &&
                entity.hasStatusEffect(CustomEffects.ANCHORED)&& entity.hasStatusEffect(CustomEffects.ASH_LUNG)
                && entity.hasStatusEffect(CustomEffects.BLOOD_FEVER) && entity.hasStatusEffect(CustomEffects.ENDER_SKIN) &&
                entity.hasStatusEffect(CustomEffects.HELL_BOUND) && entity.hasStatusEffect(CustomEffects.KINDLING)
                 && entity.hasStatusEffect(CustomEffects.SLIME_LUNG) && entity.hasStatusEffect(CustomEffects.SPIDER_EFFECT)){
            entity.addStatusEffect(new StatusEffectInstance(CustomEffects.SORCERER,  -1,  0, false, false, true));
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

}
