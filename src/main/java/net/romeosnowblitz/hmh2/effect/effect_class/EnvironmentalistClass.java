package net.romeosnowblitz.hmh2.effect.effect_class;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import net.romeosnowblitz.hmh2.tag.ModItemTags;
import net.romeosnowblitz.hmh2.util.ModStats;

public class EnvironmentalistClass extends StatusEffect {
    public EnvironmentalistClass(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if(entity instanceof ServerPlayerEntity serverPlayer && serverPlayer.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID))==0){
            serverPlayer.getStatHandler().setStat(serverPlayer, Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID), 3);
        }
        super.onApplied(entity, attributes, amplifier);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity instanceof ServerPlayerEntity player && player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID)) == 0){
            player.getStatHandler().setStat(player, Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID), 3);
        }
        LivingEntity closestEntity = entity.getWorld().getClosestEntity(LivingEntity.class, TargetPredicate.DEFAULT, entity, entity.getX(), entity.getY(), entity.getZ(), new Box(entity.getPos().add(4, 4, 4), entity.getPos().add(-4, -4, -4)) );
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20,  0, false, false, false));entity.removeStatusEffect(CustomEffects.HEALTH_SHRINKAGE);
        if(entity.isWet()){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 20,  0, false, false, false));}
        if(entity.isOnFire()){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20,  0, false, false, false));}
        if(entity.getHealth() != entity.getMaxHealth() && entity.getWorld().getTimeOfDay() % 200 == 0){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 60,  0, false, false, false));}
        if(entity instanceof ServerPlayerEntity player && player.getHungerManager().isNotFull() && entity.getWorld().getTimeOfDay() % 200 == 0){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 20,  0, false, false, false));}
        if(!entity.getEquippedStack(EquipmentSlot.CHEST).isOf(Items.ELYTRA) &&  entity.fallDistance >=3 && entity.isSneaking() || entity.hasStatusEffect(StatusEffects.LEVITATION) && entity.isSneaking()){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 20,  0, false, false, false)); entity.removeStatusEffect(StatusEffects.LEVITATION);}
        if(!entity.getEquippedStack(EquipmentSlot.CHEST).isOf(Items.ELYTRA) && entity.fallDistance >=3 && !entity.isSneaking() || entity.hasStatusEffect(StatusEffects.LEVITATION) && !entity.isSneaking()) {entity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20,  0, false, false, false)); entity.removeStatusEffect(CustomEffects.SPIDER_EFFECT);}
        if(entity.isOnGround()) {entity.removeStatusEffect(StatusEffects.SLOW_FALLING);entity.removeStatusEffect(StatusEffects.REGENERATION); entity.removeStatusEffect(CustomEffects.SPIDER_EFFECT);}
        if(entity.isOnGround() && entity.isSneaking()){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 20,  0, false, false, false));}
        if(entity.horizontalCollision) {entity.addStatusEffect(new StatusEffectInstance(CustomEffects.SPIDER_EFFECT, 20,  0, false, false, false));}
        if(!entity.getSteppingBlockState().isAir()){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20,  0, false, false, false));}
        if(entity.isSprinting()){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20,  0, false, false, false));}
        if(entity.getWorld().getBiome(entity.getBlockPos()).isIn(BiomeTags.IS_OCEAN)) {entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 20,  0, false, false, false));}
        if(closestEntity instanceof VillagerEntity){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 20,  0, false, false, false));}
        if(entity.hasStatusEffect(StatusEffects.SLOWNESS)){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, entity.getStatusEffect(StatusEffects.SLOWNESS).getDuration(), entity.getStatusEffect(StatusEffects.SLOWNESS).getAmplifier()*2, false, false, false));entity.removeStatusEffect(StatusEffects.SLOWNESS);}
        if(entity.hasStatusEffect(StatusEffects.INSTANT_DAMAGE)){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, entity.getStatusEffect(StatusEffects.INSTANT_DAMAGE).getDuration(), entity.getStatusEffect(StatusEffects.INSTANT_DAMAGE).getAmplifier()*2, false, false, false));entity.removeStatusEffect(StatusEffects.INSTANT_DAMAGE);}
        if(entity.hasStatusEffect(StatusEffects.WEAKNESS)){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, entity.getStatusEffect(StatusEffects.WEAKNESS).getDuration(), entity.getStatusEffect(StatusEffects.WEAKNESS).getAmplifier()*2, false, false, false));entity.removeStatusEffect(StatusEffects.WEAKNESS);}
        if(entity.hasStatusEffect(StatusEffects.MINING_FATIGUE)){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, entity.getStatusEffect(StatusEffects.MINING_FATIGUE).getDuration(), entity.getStatusEffect(StatusEffects.MINING_FATIGUE).getAmplifier()*2, false, false, false));entity.removeStatusEffect(StatusEffects.MINING_FATIGUE);}
        if(entity.hasStatusEffect(StatusEffects.UNLUCK)){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, entity.getStatusEffect(StatusEffects.UNLUCK).getDuration(), entity.getStatusEffect(StatusEffects.UNLUCK).getAmplifier()*2, false, false, false));entity.removeStatusEffect(StatusEffects.UNLUCK);}
        if(entity.hasStatusEffect(StatusEffects.HUNGER)){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, entity.getStatusEffect(StatusEffects.HUNGER).getDuration(), entity.getStatusEffect(StatusEffects.HUNGER).getAmplifier()*2, false, false, false));entity.removeStatusEffect(StatusEffects.HUNGER);}
        if(entity.hasStatusEffect(StatusEffects.BAD_OMEN)){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, entity.getStatusEffect(StatusEffects.BAD_OMEN).getDuration(), entity.getStatusEffect(StatusEffects.BAD_OMEN).getAmplifier()*2, false, false, false));entity.removeStatusEffect(StatusEffects.BAD_OMEN);}
        if(entity.hasStatusEffect(StatusEffects.DARKNESS)){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, entity.getStatusEffect(StatusEffects.DARKNESS).getDuration(), entity.getStatusEffect(StatusEffects.DARKNESS).getAmplifier()*2, false, false, false));entity.removeStatusEffect(StatusEffects.DARKNESS);}
        if(entity.hasStatusEffect(CustomEffects.ANCHORED)){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, entity.getStatusEffect(CustomEffects.ANCHORED).getDuration(), entity.getStatusEffect(CustomEffects.ANCHORED).getAmplifier()*2, false, false, false));entity.removeStatusEffect(CustomEffects.ANCHORED);}
        if(entity.hasStatusEffect(CustomEffects.ASH_LUNG)){entity.addStatusEffect(new StatusEffectInstance(CustomEffects.SLIME_LUNG, entity.getStatusEffect(CustomEffects.ASH_LUNG).getDuration(), entity.getStatusEffect(CustomEffects.ASH_LUNG).getAmplifier()*2, false, false, false));entity.removeStatusEffect(CustomEffects.ASH_LUNG);}
        if(entity.hasStatusEffect(CustomEffects.KINDLING)){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, entity.getStatusEffect(CustomEffects.KINDLING).getDuration(), entity.getStatusEffect(CustomEffects.KINDLING).getAmplifier()*2, false, false, false));entity.removeStatusEffect(CustomEffects.KINDLING);}
        if(entity.hasStatusEffect(StatusEffects.BLINDNESS)){entity.addStatusEffect(new StatusEffectInstance(CustomEffects.LUNAR_WOLF_PERCEPTION, entity.getStatusEffect(StatusEffects.BLINDNESS).getDuration(), entity.getStatusEffect(StatusEffects.BLINDNESS).getAmplifier()*2, false, false, false));entity.removeStatusEffect(StatusEffects.BLINDNESS);}
        if(entity.hasStatusEffect(StatusEffects.NAUSEA)){entity.addStatusEffect(new StatusEffectInstance(CustomEffects.TIPSY, entity.getStatusEffect(StatusEffects.NAUSEA).getDuration(), entity.getStatusEffect(StatusEffects.NAUSEA).getAmplifier()*2, false, false, false));entity.removeStatusEffect(StatusEffects.NAUSEA);}
        if(entity.hasStatusEffect(StatusEffects.POISON)){entity.addStatusEffect(new StatusEffectInstance(CustomEffects.POISON_IMMUNITY, entity.getStatusEffect(StatusEffects.POISON).getDuration(), entity.getStatusEffect(StatusEffects.POISON).getAmplifier()*2, false, false, false));entity.removeStatusEffect(StatusEffects.POISON);}
        if(entity.hasStatusEffect(StatusEffects.WITHER)){entity.addStatusEffect(new StatusEffectInstance(CustomEffects.WITHER_IMMUNITY, entity.getStatusEffect(StatusEffects.WITHER).getDuration(), entity.getStatusEffect(StatusEffects.WITHER).getAmplifier()*2, false, false, false));entity.removeStatusEffect(StatusEffects.WITHER);}
        if(entity.hasStatusEffect(CustomEffects.BLOOD_FEVER)){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, entity.getStatusEffect(CustomEffects.BLOOD_FEVER).getDuration(), entity.getStatusEffect(CustomEffects.BLOOD_FEVER).getAmplifier()*2, false, false, false));entity.removeStatusEffect(CustomEffects.BLOOD_FEVER);entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, entity.getStatusEffect(CustomEffects.BLOOD_FEVER).getDuration(), entity.getStatusEffect(CustomEffects.BLOOD_FEVER).getAmplifier()*2, false, false, false));entity.removeStatusEffect(CustomEffects.BLOOD_FEVER);}
        if(entity.isBlocking()){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20,  0, false, false, false));}
        if(entity.getRecentDamageSource() != null) {entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200,  0, false, false, false));entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200,  0, false, false, false));entity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200,  0, false, false, false));entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 200,  0, false, false, false));}
        if(entity.hasStatusEffect(CustomEffects.HELL_BOUND) && !entity.getWorld().getDimension().ultrawarm()){entity.getWorld().createExplosion(entity, entity.getBlockPos().getX(), entity.getPos().getY(), entity.getBlockPos().getZ(), 10.0f, World.ExplosionSourceType.MOB);entity.damage(entity.getWorld().getDamageSources().create(ModDamageTypes.KILLED_BY_DEMONS_CURSE), 10);}
        if(entity.getMainHandStack().isIn(ModItemTags.LIGHTS) || entity.getOffHandStack().isIn(ModItemTags.LIGHTS)){entity.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20,  0, false, false, false));if(entity.getWorld().getBlockState(entity.getBlockPos()).isAir() || entity.getWorld().getBlockState(entity.getBlockPos()).isOf(ModBlocks.TEMPORARY_LIGHT)) entity.getWorld().setBlockState(entity.getBlockPos(), ModBlocks.TEMPORARY_LIGHT.getDefaultState());}
        if(entity instanceof ServerPlayerEntity player){player.getStatHandler().setStat(player, Stats.CUSTOM.getOrCreateStat(ModStats.HEALTH_ADJUSTMENT), entity.getArmor());}
        //game panel (Night Vision, Quantum Lock, Ender Skin)
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
