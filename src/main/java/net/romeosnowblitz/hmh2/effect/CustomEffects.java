package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class CustomEffects {
    public static StatusEffect ANCHORED = registerAnchoredStatusEffect("anchored");
    public static StatusEffect ASH_LUNG = registerAshLungStatusEffect("ash_lung");
    public static StatusEffect BLOOD_FEVER = registerBloodFeverStatusEffect("blood_fever");
    public static StatusEffect CONDUIT_FAILURE = registerConduitFailureStatusEffect("conduit_failure");
    public static StatusEffect DOLPHINS_CURSE = registerDolphinsCurseStatusEffect("dolphins_curse");
    public static StatusEffect ENDER_SKIN = registerEnderSkinStatusEffect("ender_skin");
    public static StatusEffect HEALTH_SHRINKAGE = registerHealthShrinkageStatusEffect("health_shrinkage");
    public static StatusEffect HELL_BOUND = registerHellBoundStatusEffect("hell_bound");
    public static StatusEffect KINDLING = registerKindlingStatusEffect("kindling");
    public static StatusEffect LUNAR_WOLF_PERCEPTION = registerLunarWolfPerceptionStatusEffect("lunar_wolf_perception");
    public static StatusEffect POISON_IMMUNITY = registerPoisonImmunityStatusEffect("poison_immunity");
    public static StatusEffect SAVING_GRACE = registerSavingGraceStatusEffect("saving_grace");
    public static StatusEffect SIGHTLESSSNESS = registerSightlessnessStatusEffect("sightlessness");
    public static StatusEffect SLIME_LUNG = registerSlimeLungEffect("slime_lung");
    public static StatusEffect SPIDER_EFFECT = registerSpiderEffect("spider_effect");
    public static StatusEffect INSUSCEPTIBILITY = registerInsusceptibilityStatusEffect("insusceptibility");

    public static StatusEffect NORMIE = registerNormieClass("normie");
    public static StatusEffect NECROMANCER = registerNecromancerClass("necromancer");
    public static StatusEffect SORCERER = registerSorcererClass("sorcerer");

    public static StatusEffect START = registerStatusEffect("start", new ModEffect(StatusEffectCategory.NEUTRAL,11184810));
    public static StatusEffect COMPLETE = registerStatusEffect("complete", new ModEffect(StatusEffectCategory.NEUTRAL,11184810));

    public static StatusEffect registerAnchoredStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new AnchoredEffect(StatusEffectCategory.HARMFUL, 11184810));
    }

    public static StatusEffect registerAshLungStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new AshLungEffect(StatusEffectCategory.HARMFUL, 11184810));
    }

    public static StatusEffect registerBloodFeverStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new BloodFeverEffect(StatusEffectCategory.HARMFUL, 11141120)
                        .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH,
                                "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC",
                                -1.0, EntityAttributeModifier.Operation.ADDITION));
    }
    public static StatusEffect registerConduitFailureStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new EffectPreventer(StatusEffects.CONDUIT_POWER, StatusEffectCategory.HARMFUL, 11184810));
    }
    public static StatusEffect registerDolphinsCurseStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new EffectPreventer(StatusEffects.DOLPHINS_GRACE, StatusEffectCategory.HARMFUL, 11184810));
    }
    public static StatusEffect registerEnderSkinStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new EnderSkinEffect(StatusEffectCategory.HARMFUL, 11141290));
    }
    public static StatusEffect registerHealthShrinkageStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new ModEffect(StatusEffectCategory.HARMFUL, 11141120)
                        .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH,
                                "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC",
                                -1.0, EntityAttributeModifier.Operation.ADDITION));
    }
    public static StatusEffect registerHellBoundStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new HellBoundEffect(StatusEffectCategory.BENEFICIAL, 11141120));
    }
    public static StatusEffect registerInsusceptibilityStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new EffectPreventer(StatusEffects.NAUSEA, StatusEffectCategory.BENEFICIAL, 11184810));
    }
    public static StatusEffect registerKindlingStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new KindlingEffect(StatusEffectCategory.HARMFUL, 16777045));
    }
    public static StatusEffect registerLunarWolfPerceptionStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new LunarWolfPerceptionEffect(StatusEffectCategory.BENEFICIAL, 170));
    }
    public static StatusEffect registerPoisonImmunityStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new EffectPreventer(StatusEffects.POISON, StatusEffectCategory.BENEFICIAL, 11184810));
    }
    public static StatusEffect registerSavingGraceStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new ModEffect(StatusEffectCategory.BENEFICIAL, 1121057));
    }
    public static StatusEffect registerSightlessnessStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new EffectPreventer(StatusEffects.NIGHT_VISION, StatusEffectCategory.HARMFUL, 11184810));
    }
    public static StatusEffect registerSlimeLungEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new SlimeLungEffect(StatusEffectCategory.BENEFICIAL, 5467216));
    }
    public static StatusEffect registerSpiderEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new SpiderEffect(StatusEffectCategory.BENEFICIAL, 4011053));
    }

    public static StatusEffect registerNormieClass(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new NormieEffect(StatusEffectCategory.BENEFICIAL, 148537));
    }
    public static StatusEffect registerNecromancerClass(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new NecromancerEffect(StatusEffectCategory.BENEFICIAL, 148537));
    }
    public static StatusEffect registerSorcererClass(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new SorcererEffect(StatusEffectCategory.BENEFICIAL, 148537));
    }
    public static StatusEffect registerStatusEffect(String name, StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name), effect);
    }

    public static void registerEffects() {
    }
}
