package net.romeosnowblitz.hmh2.effect;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.romeosnowblitz.hmh2.block.MagicBlocks;
import net.romeosnowblitz.hmh2.block.custom.magic.MagicDust;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import net.romeosnowblitz.hmh2.item.MagicItems;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.util.ModStats;

import javax.swing.*;

public class NecromancerEffect extends StatusEffect {
    public NecromancerEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity instanceof ServerPlayerEntity player){
            player.increaseStat(ModStats.CLASS_ID, 1);
            if(player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID)) != 1){player.increaseStat(ModStats.CLASS_ID, -1);}
        }
        entity.addStatusEffect(new StatusEffectInstance(CustomEffects.NECROMANCER,  -1,  0, false, false, true));
        entity.removeStatusEffect(CustomEffects.ASH_LUNG);
        //Sorcerer Class Preventer
        if(numberOfEffects(entity) >= 17  && entity instanceof PlayerEntity player){
            player.damage(player.getWorld().getDamageSources().create(ModDamageTypes.KILLED_BY_SORCERER_ATTEMPT), 200.0F);
        }

        //Health Bar
        if(entity instanceof PlayerEntity player) {
            Multimap<EntityAttribute, EntityAttributeModifier> subtractive_health;ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> subtractive_builder = ImmutableMultimap.builder(); subtractive_builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Health modifier", -1, EntityAttributeModifier.Operation.ADDITION));subtractive_health = subtractive_builder.build();
            Multimap<EntityAttribute, EntityAttributeModifier> additive_health;ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> additive_builder = ImmutableMultimap.builder(); additive_builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Health modifier", 1, EntityAttributeModifier.Operation.ADDITION));additive_health = additive_builder.build();
            if(player.experienceLevel >= 100 && player.getMaxHealth() < 20){player.getAttributes().addTemporaryModifiers(additive_health);}
            if(player.experienceLevel >= 95 && player.experienceLevel <= 99){if(player.getMaxHealth() < 19){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 20){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 90 && player.experienceLevel <= 94){if(player.getMaxHealth() < 18){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 19){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 85 && player.experienceLevel <= 89){if(player.getMaxHealth() < 17){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 18){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 80 && player.experienceLevel <= 84){if(player.getMaxHealth() < 16){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 17){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 75 && player.experienceLevel <= 79){if(player.getMaxHealth() < 15){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 16){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 70 && player.experienceLevel <= 74){if(player.getMaxHealth() < 14){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 15){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 65 && player.experienceLevel <= 69){if(player.getMaxHealth() < 13){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 14){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 60 && player.experienceLevel <= 64){if(player.getMaxHealth() < 12){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 13){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 55 && player.experienceLevel <= 59){if(player.getMaxHealth() < 11){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 12){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 50 && player.experienceLevel <= 54){if(player.getMaxHealth() < 10){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 11){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 45 && player.experienceLevel <= 49){if(player.getMaxHealth() < 9){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 10){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 40 && player.experienceLevel <= 44){if(player.getMaxHealth() < 8){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 9){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 35 && player.experienceLevel <= 39){if(player.getMaxHealth() < 7){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 8){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 30 && player.experienceLevel <= 34){if(player.getMaxHealth() < 6){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 7){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 25 && player.experienceLevel <= 29){if(player.getMaxHealth() < 5){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 6){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 20 && player.experienceLevel <= 24){if(player.getMaxHealth() < 4){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 5){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 15 && player.experienceLevel <= 19){if(player.getMaxHealth() < 3){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 4){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel >= 10 && player.experienceLevel <= 14){if(player.getMaxHealth() < 2){player.getAttributes().addTemporaryModifiers(additive_health);}if(player.getMaxHealth() >= 3){player.getAttributes().addTemporaryModifiers(subtractive_health);}}
            if(player.experienceLevel < 10 && player.getMaxHealth() > 1){player.getAttributes().addTemporaryModifiers(subtractive_health);}
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
