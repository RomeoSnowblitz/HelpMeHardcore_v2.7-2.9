package net.romeosnowblitz.hmh2.effect.effect_class;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stat;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import net.romeosnowblitz.hmh2.item.MagicItems;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.item.SustenanceItems;
import net.romeosnowblitz.hmh2.util.ModStats;

public class NecromancerClass extends StatusEffect {
    public NecromancerClass(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if(entity instanceof ServerPlayerEntity serverPlayer && serverPlayer.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID))==0){
            serverPlayer.getStatHandler().setStat(serverPlayer, Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID), 1);
        }
        super.onApplied(entity, attributes, amplifier);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity instanceof ServerPlayerEntity player){
            player.increaseStat(ModStats.CLASS_ID, 1);
            if(player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID)) != 1){player.increaseStat(ModStats.CLASS_ID, -1);}
        }
        entity.removeStatusEffect(CustomEffects.ASH_LUNG);
        entity.removeStatusEffect(CustomEffects.BLOOD_FEVER);
        entity.removeStatusEffect(CustomEffects.HEALTH_SHRINKAGE);

        //Class Preventers
        if(numberOfEffects(entity) >= 30  && entity instanceof PlayerEntity player){
            player.damage(player.getWorld().getDamageSources().create(ModDamageTypes.KILLED_BY_SORCERER_ATTEMPT), 200.0F);
        }

        //Health Bar
        if(entity instanceof ServerPlayerEntity player) {
            entity.sendMessage(Text.literal(String.valueOf(entity.getMaxHealth())).formatted(Formatting.RED));
            entity.sendMessage(Text.literal(String.valueOf(entity.getMaxHealth()+player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.DEATHS)))).formatted(Formatting.GREEN));

            if(player.getWorld().getTimeOfDay() % 5 == 0){player.addExperience(1);player.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1, 0, false, false, false));}
            if(player.getWorld().getTimeOfDay() % 20 == 0){
                Multimap<EntityAttribute, EntityAttributeModifier> subtractive_health;ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> subtractive_builder = ImmutableMultimap.builder(); subtractive_builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Health modifier", -1, EntityAttributeModifier.Operation.ADDITION));subtractive_health = subtractive_builder.build();
                Multimap<EntityAttribute, EntityAttributeModifier > additive_health;ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> additive_builder = ImmutableMultimap.builder(); additive_builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Health modifier", 1, EntityAttributeModifier.Operation.ADDITION));additive_health = additive_builder.build();
                int numberOfDeaths = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(Stats.DEATHS));
                if(player.experienceLevel <= 210){
                    if(player.getMaxHealth()+numberOfDeaths < (player.experienceLevel/5)){player.getAttributes().addTemporaryModifiers(additive_health);}
                    if(player.getMaxHealth()+numberOfDeaths > (player.experienceLevel/5)+1){player.getAttributes().addTemporaryModifiers(subtractive_health);player.heal(1);}
                }
            }
            if(player.experienceLevel == 0){player.damage(player.getWorld().getDamageSources().create(ModDamageTypes.KILLED_BY_NECROMANCER_0XP), 200);}
        }

        //Custom Crafting
        if(entity instanceof PlayerEntity player){
            if(player.getMainHandStack().isOf(MagicItems.SOUL_ESSENCE) && player.getOffHandStack().isOf(ModItems.ASHES) && player.isSneaking() ||
                    player.getOffHandStack().isOf(MagicItems.SOUL_ESSENCE) && player.getMainHandStack().isOf(ModItems.ASHES) && player.isSneaking()){
                player.getMainHandStack().decrement(1);player.getOffHandStack().decrement(1);
                player.giveItemStack(MagicItems.SUMMONING_POWDER.getDefaultStack());
            }
            if(player.getMainHandStack().isOf(MagicItems.SUMMONING_POWDER) && player.getOffHandStack().isOf(ModItems.WARPED_WART) && player.isSneaking() ||
                    player.getOffHandStack().isOf(MagicItems.SUMMONING_POWDER) && player.getMainHandStack().isOf(ModItems.WARPED_WART) && player.isSneaking()){
                player.getMainHandStack().decrement(1);player.getOffHandStack().decrement(1);
                player.giveItemStack(MagicItems.BLUE_MAGIC_PASTE.getDefaultStack());
            }
            if(player.getMainHandStack().isOf(MagicItems.SUMMONING_POWDER) && player.getOffHandStack().isOf(Items.NETHER_WART) && player.isSneaking() ||
                    player.getOffHandStack().isOf(MagicItems.SUMMONING_POWDER) && player.getMainHandStack().isOf(Items.NETHER_WART) && player.isSneaking()){
                player.getMainHandStack().decrement(1);player.getOffHandStack().decrement(1);
                player.giveItemStack(MagicItems.PURPLE_MAGIC_PASTE.getDefaultStack());
            }
            if(player.getMainHandStack().isOf(MagicItems.SOUL_ESSENCE) && player.getOffHandStack().isOf(SustenanceItems.HEART) && player.isSneaking() ||
                    player.getOffHandStack().isOf(MagicItems.SOUL_ESSENCE) && player.getMainHandStack().isOf(SustenanceItems.HEART) && player.isSneaking()){
                player.getMainHandStack().decrement(1);player.getOffHandStack().decrement(1);
                player.giveItemStack(ModItems.LIFE_ESSENCE.getDefaultStack());
            }
            if(player.getMainHandStack().isOf(ModItems.ENDER_INGOT) && player.getOffHandStack().isOf(Items.NETHERITE_INGOT) && player.isSneaking() ||
                    player.getOffHandStack().isOf(ModItems.ENDER_INGOT) && player.getMainHandStack().isOf(Items.NETHERITE_INGOT) && player.isSneaking()){
                player.getMainHandStack().decrement(1);player.getOffHandStack().decrement(1);
                player.giveItemStack(ModItems.REVIVAL_INGOT.getDefaultStack());
            }
            if(player.getMainHandStack().isOf(ModItems.REVIVAL_INGOT) && player.getOffHandStack().isOf(Items.NETHER_STAR) && player.isSneaking() ||
                    player.getOffHandStack().isOf(ModItems.REVIVAL_INGOT) && player.getMainHandStack().isOf(Items.NETHER_STAR) && player.isSneaking()){
                player.getMainHandStack().decrement(1);player.getOffHandStack().decrement(1);
                player.giveItemStack(ModItems.REVIVAL_STONE.getDefaultStack());
            }
            if(player.getMainHandStack().isOf(ModItems.REVIVAL_STONE) && player.getOffHandStack().isOf(ModItems.REVIVAL_STONE)  && player.isSneaking()){
                player.getMainHandStack().decrement(1);player.getOffHandStack().decrement(1);
                player.giveItemStack(ModItems.UNIVERSAL_REVIVAL_STONE.getDefaultStack());
            }
        }
        super.applyUpdateEffect(entity, amplifier);
    }

    public int numberOfEffects(LivingEntity entity){
        int number = 0;
        if(entity.hasStatusEffect(StatusEffects.ABSORPTION)){number++;}
        if(entity.hasStatusEffect(StatusEffects.BAD_OMEN)){number++;}
        if(entity.hasStatusEffect(StatusEffects.BLINDNESS)){number++;}
        if(entity.hasStatusEffect(StatusEffects.CONDUIT_POWER)){number++;}
        if(entity.hasStatusEffect(StatusEffects.DARKNESS)){number++;}
        if(entity.hasStatusEffect(StatusEffects.DOLPHINS_GRACE)){number++;}
        if(entity.hasStatusEffect(StatusEffects.FIRE_RESISTANCE)){number++;}
        if(entity.hasStatusEffect(StatusEffects.GLOWING)){number++;}
        if(entity.hasStatusEffect(StatusEffects.HASTE)){number++;}
        if(entity.hasStatusEffect(StatusEffects.HERO_OF_THE_VILLAGE)){number++;}
        if(entity.hasStatusEffect(StatusEffects.HUNGER)){number++;}
        if(entity.hasStatusEffect(StatusEffects.INVISIBILITY)){number++;}
        if(entity.hasStatusEffect(StatusEffects.JUMP_BOOST)){number++;}
        if(entity.hasStatusEffect(StatusEffects.LEVITATION)){number++;}
        if(entity.hasStatusEffect(StatusEffects.MINING_FATIGUE)){number++;}
        if(entity.hasStatusEffect(StatusEffects.NAUSEA)){number++;}
        if(entity.hasStatusEffect(StatusEffects.NIGHT_VISION)){number++;}
        if(entity.hasStatusEffect(StatusEffects.POISON)){number++;}
        if(entity.hasStatusEffect(StatusEffects.REGENERATION)){number++;}
        if(entity.hasStatusEffect(StatusEffects.RESISTANCE)){number++;}
        if(entity.hasStatusEffect(StatusEffects.SLOW_FALLING)){number++;}
        if(entity.hasStatusEffect(StatusEffects.SLOWNESS)){number++;}
        if(entity.hasStatusEffect(StatusEffects.SPEED)){number++;}
        if(entity.hasStatusEffect(StatusEffects.STRENGTH)){number++;}
        if(entity.hasStatusEffect(StatusEffects.WATER_BREATHING)){number++;}
        if(entity.hasStatusEffect(StatusEffects.WEAKNESS)){number++;}
        if(entity.hasStatusEffect(StatusEffects.WITHER)){number++;}
        if(entity.hasStatusEffect(CustomEffects.ANCHORED)){number++;}
        if(entity.hasStatusEffect(CustomEffects.BLOOD_FEVER)){number++;}
        if(entity.hasStatusEffect(CustomEffects.CONDUIT_FAILURE)){number++;}
        if(entity.hasStatusEffect(CustomEffects.DOLPHINS_CURSE)){number++;}
        if(entity.hasStatusEffect(CustomEffects.ENDER_SKIN)){number++;}
        if(entity.hasStatusEffect(CustomEffects.HEALTH_SHRINKAGE)){number++;}
        if(entity.hasStatusEffect(CustomEffects.INSUSCEPTIBILITY)){number++;}
        if(entity.hasStatusEffect(CustomEffects.KINDLING)){number++;}
        if(entity.hasStatusEffect(CustomEffects.LUNAR_WOLF_PERCEPTION)){number++;}
        if(entity.hasStatusEffect(CustomEffects.POISON_IMMUNITY)){number++;}
        if(entity.hasStatusEffect(CustomEffects.SIGHTLESSSNESS)){number++;}
        if(entity.hasStatusEffect(CustomEffects.SORCERER)){number++;}
        return number;
    }


    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

}
