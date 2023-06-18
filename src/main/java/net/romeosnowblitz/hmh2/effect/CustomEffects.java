package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class CustomEffects {
    public static StatusEffect ANCHORED;
    public static StatusEffect CONDUIT_FAILURE;
    public static StatusEffect DOLPHINS_CURSE;
    public static StatusEffect ENDER_SKIN;
    public static StatusEffect HEALTH_SHRINKAGE;
    public static StatusEffect NORMIE;
    public static StatusEffect KINDLING;
    public static StatusEffect LUNAR_WOLF_PERCEPTION;
    public static StatusEffect POISON_IMMUNITY;
    public static StatusEffect SIGHTLESSSNESS;
    public static StatusEffect INSUSCEPTIBILITY;

    public static StatusEffect registerAnchoredStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new AnchoredEffect(StatusEffectCategory.HARMFUL, 11184810));
    }
    public static StatusEffect registerConduitFailureStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new ConduitFailureEffect(StatusEffectCategory.HARMFUL, 11184810));
    }
    public static StatusEffect registerDolphinsCurseStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new DolphinsCurseEffect(StatusEffectCategory.HARMFUL, 11184810));
    }
    public static StatusEffect registerEnderSkinStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new EnderSkinEffect(StatusEffectCategory.HARMFUL, 11141290));
    }
    public static StatusEffect registerHealthShrinkageStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new HealthShrikageEffect(StatusEffectCategory.HARMFUL, 11141120)
                        .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH,
                                "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC",
                                -1.0, EntityAttributeModifier.Operation.ADDITION));
    }

    public static StatusEffect registerInsusceptibilityStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new InsusceptibilityEffect(StatusEffectCategory.BENEFICIAL, 11184810));
    }
    public static StatusEffect registerKindlingStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new KindlingEffect(StatusEffectCategory.HARMFUL, 16777045));
    }
    public static StatusEffect registerLunarWolfPerceptionStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new LunarWolfPerceptionEffect(StatusEffectCategory.BENEFICIAL, 170));
    }
    public static StatusEffect registerNormieStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new NormieEffect(StatusEffectCategory.NEUTRAL, 1485372));
    }
    public static StatusEffect registerPoisonImmunityStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new PoisonImmunityEffect(StatusEffectCategory.BENEFICIAL, 11184810));
    }
    public static StatusEffect registerSightlessnessStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Hmh2.MOD_ID, name),
                new SightlessnessEffect(StatusEffectCategory.HARMFUL, 11184810));
    }

    public static void registerEffects() {
        ANCHORED = registerAnchoredStatusEffect("anchored");
        CONDUIT_FAILURE = registerConduitFailureStatusEffect("conduit_failure");
        DOLPHINS_CURSE = registerDolphinsCurseStatusEffect("dolphins_curse");
        ENDER_SKIN = registerEnderSkinStatusEffect("ender_skin");
        HEALTH_SHRINKAGE = registerHealthShrinkageStatusEffect("health_shrinkage");
        INSUSCEPTIBILITY = registerInsusceptibilityStatusEffect("insusceptibility");
        KINDLING = registerKindlingStatusEffect("kindling");
        LUNAR_WOLF_PERCEPTION = registerLunarWolfPerceptionStatusEffect("lunar_wolf_perception");
        NORMIE = registerNormieStatusEffect("normie");
        POISON_IMMUNITY = registerPoisonImmunityStatusEffect("poison_immunity");
        SIGHTLESSSNESS = registerSightlessnessStatusEffect("sightlessness");

    }
}
