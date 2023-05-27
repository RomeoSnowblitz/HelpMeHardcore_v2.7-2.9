package net.romeosnowblitz.hmh2.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.MagicBlocks;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.mixin.BrewingRecipeRegistryMixin;

public class ModPotions {
    public static Potion HASTE_POTION;
    public static Potion LONG_HASTE_POTION;
    public static Potion STRONG_HASTE_POTION;
    public static Potion MINING_FATIGUE_POTION;
    public static Potion LONG_MINING_FATIGUE_POTION;
    public static Potion STRONG_MINING_FATIGUE_POTION;
    public static Potion LEVITATION_POTION;
    public static Potion LONG_LEVITATION_POTION;
    public static Potion STRONG_LEVITATION_POTION;
    public static Potion BLINDNESS_POTION;
    public static Potion LONG_BLINDNESS_POTION;
    public static Potion GLOWING_POTION;
    public static Potion LONG_GLOWING_POTION;
    public static Potion BAD_LUCK_POTION;
    public static Potion LONG_BAD_LUCK_POTION;
    public static Potion STRONG_BAD_LUCK_POTION;
    public static Potion LUCK_POTION;
    public static Potion LONG_LUCK_POTION;
    public static Potion STRONG_LUCK_POTION;
    public static Potion HUNGER_POTION;
    public static Potion LONG_HUNGER_POTION;
    public static Potion STRONG_HUNGER_POTION;
    public static Potion SATURATION_POTION;
    public static Potion LONG_SATURATION_POTION;
    public static Potion STRONG_SATURATION_POTION;
    public static Potion BAD_OMEN_POTION;
    public static Potion LONG_BAD_OMEN_POTION;
    public static Potion STRONG_BAD_OMEN_POTION;
    public static Potion VILLAGE_HERO_POTION;
    public static Potion LONG_VILLAGE_HERO_POTION;
    public static Potion STRONG_VILLAGE_HERO_POTION;
    public static Potion NAUSEA_POTION;
    public static Potion LONG_NAUSEA_POTION;
    public static Potion STRONG_NAUSEA_POTION;
    public static Potion DOLPHINS_GRACE_POTION;
    public static Potion LONG_DOLPHINS_GRACE_POTION;
    public static Potion STRONG_DOLPHINS_GRACE_POTION;
    public static Potion WITHER_POTION;
    public static Potion LONG_WITHER_POTION;
    public static Potion STRONG_WITHER_POTION;
    public static Potion RESISTANCE_POTION;
    public static Potion LONG_RESISTANCE_POTION;
    public static Potion STRONG_RESISTANCE_POTION;
    public static Potion HEALTH_BOOST_POTION;
    public static Potion LONG_HEALTH_BOOST_POTION;
    public static Potion STRONG_HEALTH_BOOST_POTION;
    public static Potion ABSORPTION_POTION;
    public static Potion LONG_ABSORPTION_POTION;
    public static Potion STRONG_ABSORPTION_POTION;
    public static Potion CONDUIT_POTION;
    public static Potion LONG_CONDUIT_POTION;
    public static Potion STRONG_CONDUIT_POTION;
    public static Potion DARKNESS_POTION;
    public static Potion LONG_DARKNESS_POTION;

    public static Potion registerLuckPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.LUCK, 5120, 0)));}
    public static Potion registerLongLuckPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.LUCK, 10240, 0)));}
    public static Potion registerStrongLuckPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.LUCK, 2560, 1)));}
    public static Potion registerHastePotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HASTE, 5120, 0)));}
    public static Potion registerLongHastePotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HASTE, 10240, 0)));}
    public static Potion registerStrongHastePotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HASTE, 2560, 1)));}
    public static Potion registerMiningFatiguePotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 5120, 0)));}
    public static Potion registerLongMiningFatiguePotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 10240, 0)));}
    public static Potion registerStrongMiningFatiguePotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 2560, 1)));}
    public static Potion registerDolphinsGracePotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 5120, 0)));}
    public static Potion registerLongDolphinsGracePotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 10240, 0)));}
    public static Potion registerStrongDolphinsGracePotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 2560, 1)));}
    public static Potion registerResistancePotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.RESISTANCE, 5120, 0)));}
    public static Potion registerLongResistancePotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.RESISTANCE, 10240, 0)));}
    public static Potion registerStrongResistancePotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.RESISTANCE, 2560, 1)));}
    public static Potion registerConduitPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 5120, 0)));}
    public static Potion registerLongConduitPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 10240, 0)));}
    public static Potion registerStrongConduitPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 2560, 1)));}
    public static Potion registerVillageHeroPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 5120, 0)));}
    public static Potion registerLongVillageHeroPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 10240, 0)));}
    public static Potion registerStrongVillageHeroPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 2560, 1)));}
    public static Potion registerHealthBoostPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 5120, 0)));}
    public static Potion registerLongHealthBoostPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 10240, 0)));}
    public static Potion registerStrongHealthBoostPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2560, 1)));}
    public static Potion registerAbsorptionPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, 5120, 0)));}
    public static Potion registerLongAbsorptionPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, 10240, 0)));}
    public static Potion registerStrongAbsorptionPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, 2560, 1)));}
    public static Potion registerBadLuckPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 2560, 0)));}
    public static Potion registerLongBadLuckPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 5120, 0)));}
    public static Potion registerStrongBadLuckPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 1280, 1)));}
    public static Potion registerGlowingPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.GLOWING, 2560, 0)));}
    public static Potion registerLongGlowingPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.GLOWING, 5120, 0)));}
    public static Potion registerNauseaPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.NAUSEA, 1280, 0)));}
    public static Potion registerLongNauseaPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.NAUSEA, 2560, 0)));}
    public static Potion registerStrongNauseaPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.NAUSEA, 640, 1)));}
    public static Potion registerLevitationPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 1280, 0)));}
    public static Potion registerLongLevitationPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 2560, 0)));}
    public static Potion registerStrongLevitationPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 640, 1)));}
    public static Potion registerBlindnessPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.BLINDNESS, 1280, 0)));}
    public static Potion registerLongBlindnessPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.BLINDNESS, 2560, 0)));}
    public static Potion registerHungerPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HUNGER, 1280, 0)));}
    public static Potion registerLongHungerPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HUNGER, 2560, 0)));}
    public static Potion registerStrongHungerPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HUNGER, 640, 1)));}
    public static Potion registerSaturationPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.SATURATION, 1280, 0)));}
    public static Potion registerLongSaturationPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.SATURATION, 2560, 0)));}
    public static Potion registerStrongSaturationPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.SATURATION, 640, 1)));}
    public static Potion registerDarknessPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.DARKNESS, 1280, 0)));}
    public static Potion registerLongDarknessPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.DARKNESS, 2560, 0)));}
    public static Potion registerBadOmenPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.BAD_OMEN, 1280, 0)));}
    public static Potion registerLongBadOmenPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.BAD_OMEN, 2560, 0)));}
    public static Potion registerStrongBadOmenPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.BAD_OMEN, 640, 1)));}
    public static Potion registerWitherPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.WITHER, 1280, 0)));}
    public static Potion registerLongWitherPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.WITHER, 2560, 0)));}
    public static Potion registerStrongWitherPotion(String name) {return Registry.register(Registries.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.WITHER, 640, 1)));}

    public static void registerPotions() {
        HASTE_POTION = registerHastePotion("haste_potion");
        LONG_HASTE_POTION = registerLongHastePotion("long_haste_potion");
        STRONG_HASTE_POTION = registerStrongHastePotion("strong_haste_potion");
        MINING_FATIGUE_POTION = registerMiningFatiguePotion("mining_fatigue_potion");
        LONG_MINING_FATIGUE_POTION = registerLongMiningFatiguePotion("long_mining_fatigue_potion");
        STRONG_MINING_FATIGUE_POTION = registerStrongMiningFatiguePotion("strong_mining_fatigue_potion");
        LEVITATION_POTION = registerLevitationPotion("levitation_potion");
        LONG_LEVITATION_POTION = registerLongLevitationPotion("long_levitation_potion");
        STRONG_LEVITATION_POTION = registerStrongLevitationPotion("strong_levitation_potion");
        BLINDNESS_POTION = registerBlindnessPotion("blindness_potion");
        LONG_BLINDNESS_POTION = registerLongBlindnessPotion("long_blindness_potion");
        GLOWING_POTION = registerGlowingPotion("glowing_potion");
        LONG_GLOWING_POTION = registerLongGlowingPotion("long_glowing_potion");
        BAD_LUCK_POTION = registerBadLuckPotion("bad_luck_potion");
        LONG_BAD_LUCK_POTION = registerLongBadLuckPotion("long_bad_luck_potion");
        STRONG_BAD_LUCK_POTION = registerStrongBadLuckPotion("strong_bad_luck_potion");
        LUCK_POTION = registerLuckPotion("luck_potion");
        LONG_LUCK_POTION = registerLongLuckPotion("long_luck_potion");
        STRONG_LUCK_POTION = registerStrongLuckPotion("strong_luck_potion");
        HUNGER_POTION = registerHungerPotion("hunger_potion");
        LONG_HUNGER_POTION = registerLongHungerPotion("long_hunger_potion");
        STRONG_HUNGER_POTION = registerStrongHungerPotion("strong_hunger_potion");
        SATURATION_POTION = registerSaturationPotion("saturation_potion");
        LONG_SATURATION_POTION = registerLongSaturationPotion("long_saturation_potion");
        STRONG_SATURATION_POTION = registerStrongSaturationPotion("strong_saturation_potion");
        BAD_OMEN_POTION = registerBadOmenPotion("bad_omen_potion");
        LONG_BAD_OMEN_POTION = registerLongBadOmenPotion("long_bad_omen_potion");
        STRONG_BAD_OMEN_POTION = registerStrongBadOmenPotion("strong_bad_omen_potion");
        VILLAGE_HERO_POTION = registerVillageHeroPotion("village_hero_potion");
        LONG_VILLAGE_HERO_POTION = registerLongVillageHeroPotion("long_village_hero_potion");
        STRONG_VILLAGE_HERO_POTION = registerStrongVillageHeroPotion("strong_village_hero_potion");
        NAUSEA_POTION = registerNauseaPotion("nausea_potion");
        LONG_NAUSEA_POTION = registerLongNauseaPotion("long_nausea_potion");
        STRONG_NAUSEA_POTION = registerStrongNauseaPotion("strong_nausea_potion");
        DOLPHINS_GRACE_POTION = registerDolphinsGracePotion("dolphins_grace_potion");
        LONG_DOLPHINS_GRACE_POTION = registerLongDolphinsGracePotion("long_dolphins_grace_potion");
        STRONG_DOLPHINS_GRACE_POTION = registerStrongDolphinsGracePotion("strong_dolphins_grace_potion");
        WITHER_POTION = registerWitherPotion("wither_potion");
        LONG_WITHER_POTION = registerLongWitherPotion("long_wither_potion");
        STRONG_WITHER_POTION = registerStrongWitherPotion("strong_wither_potion");
        RESISTANCE_POTION = registerResistancePotion("resistance_potion");
        LONG_RESISTANCE_POTION = registerLongResistancePotion("long_resistance_potion");
        STRONG_RESISTANCE_POTION = registerStrongResistancePotion("strong_resistance_potion");
        HEALTH_BOOST_POTION = registerHealthBoostPotion("health_boost_potion");
        LONG_HEALTH_BOOST_POTION = registerLongHealthBoostPotion("long_health_boost_potion");
        STRONG_HEALTH_BOOST_POTION = registerStrongHealthBoostPotion("strong_health_boost_potion");
        ABSORPTION_POTION = registerAbsorptionPotion("absorption_potion");
        LONG_ABSORPTION_POTION = registerLongAbsorptionPotion("long_absorption_potion");
        STRONG_ABSORPTION_POTION = registerStrongAbsorptionPotion("strong_absorption_potion");
        CONDUIT_POTION = registerConduitPotion("conduit_potion");
        LONG_CONDUIT_POTION = registerLongConduitPotion("long_conduit_potion");
        STRONG_CONDUIT_POTION = registerStrongConduitPotion("strong_conduit_potion");
        DARKNESS_POTION = registerDarknessPotion("darkness_potion");
        LONG_DARKNESS_POTION = registerLongDarknessPotion("long_darkness_potion");
        registerPotionRecipes();
    }

    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.OBSIDIAN, ModPotions.MINING_FATIGUE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.MINING_FATIGUE_POTION, Items.REDSTONE, ModPotions.LONG_MINING_FATIGUE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.MINING_FATIGUE_POTION, Items.GLOWSTONE, ModPotions.STRONG_MINING_FATIGUE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.MINING_FATIGUE_POTION, Items.GOLD_INGOT, ModPotions.HASTE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE_POTION, Items.REDSTONE, ModPotions.LONG_HASTE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE_POTION, Items.GLOWSTONE, ModPotions.STRONG_HASTE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.SLOW_FALLING, Items.ENDER_PEARL, ModPotions.LEVITATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LEVITATION_POTION, Items.REDSTONE, ModPotions.LONG_LEVITATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LEVITATION_POTION, Items.GLOWSTONE, ModPotions.STRONG_LEVITATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.WITHER_SKELETON_SKULL, ModPotions.BLINDNESS_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BLINDNESS_POTION, Items.REDSTONE, ModPotions.LONG_BLINDNESS_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BLINDNESS_POTION, Items.GLOWSTONE, ModPotions.GLOWING_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.GLOWING_POTION, Items.REDSTONE, ModPotions.LONG_GLOWING_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.BELL, ModPotions.BAD_LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BAD_LUCK_POTION, Items.REDSTONE, ModPotions.LONG_BAD_LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BAD_LUCK_POTION, Items.GLOWSTONE, ModPotions.STRONG_BAD_LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BAD_LUCK_POTION, Items.ENDER_EYE, ModPotions.LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LUCK_POTION, Items.REDSTONE, ModPotions.LONG_LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LUCK_POTION, Items.GLOWSTONE, ModPotions.STRONG_LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.ROTTEN_FLESH, ModPotions.HUNGER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HUNGER_POTION, Items.REDSTONE, ModPotions.LONG_HUNGER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HUNGER_POTION, Items.GLOWSTONE, ModPotions.STRONG_HUNGER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HUNGER_POTION, Items.BLUE_ORCHID, ModPotions.SATURATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SATURATION_POTION, Items.REDSTONE, ModPotions.LONG_SATURATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SATURATION_POTION, Items.GLOWSTONE, ModPotions.STRONG_SATURATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.CACTUS, ModPotions.BAD_OMEN_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BAD_OMEN_POTION, Items.REDSTONE, ModPotions.LONG_BAD_OMEN_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BAD_OMEN_POTION, Items.GLOWSTONE, ModPotions.STRONG_BAD_OMEN_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BAD_OMEN_POTION, Items.EMERALD_BLOCK, ModPotions.VILLAGE_HERO_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.VILLAGE_HERO_POTION, Items.REDSTONE, ModPotions.LONG_VILLAGE_HERO_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.VILLAGE_HERO_POTION, Items.GLOWSTONE, ModPotions.STRONG_VILLAGE_HERO_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.WET_SPONGE, ModPotions.NAUSEA_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.NAUSEA_POTION, Items.REDSTONE, ModPotions.LONG_NAUSEA_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.NAUSEA_POTION, Items.GLOWSTONE, ModPotions.STRONG_NAUSEA_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.NAUSEA_POTION, Items.PRISMARINE_SHARD, ModPotions.DOLPHINS_GRACE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.DOLPHINS_GRACE_POTION, Items.REDSTONE, ModPotions.LONG_DOLPHINS_GRACE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.DOLPHINS_GRACE_POTION, Items.GLOWSTONE, ModPotions.STRONG_DOLPHINS_GRACE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.REGENERATION, Items.NETHERITE_SCRAP, ModPotions.WITHER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.WITHER_POTION, Items.REDSTONE, ModPotions.LONG_WITHER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.WITHER_POTION, Items.GLOWSTONE, ModPotions.STRONG_WITHER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.NETHER_WART, ModPotions.RESISTANCE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.RESISTANCE_POTION, Items.REDSTONE, ModPotions.LONG_RESISTANCE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.RESISTANCE_POTION, Items.GLOWSTONE, ModPotions.STRONG_RESISTANCE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.HONEY_BLOCK, ModPotions.HEALTH_BOOST_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HEALTH_BOOST_POTION, Items.REDSTONE, ModPotions.LONG_HEALTH_BOOST_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HEALTH_BOOST_POTION, Items.GLOWSTONE, ModPotions.STRONG_HEALTH_BOOST_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.HEART, ModPotions.ABSORPTION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ABSORPTION_POTION, Items.REDSTONE, ModPotions.LONG_ABSORPTION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ABSORPTION_POTION, Items.GLOWSTONE, ModPotions.STRONG_ABSORPTION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.NAUTILUS_SHELL, ModPotions.CONDUIT_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.CONDUIT_POTION, Items.REDSTONE, ModPotions.LONG_CONDUIT_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.CONDUIT_POTION, Items.GLOWSTONE, ModPotions.STRONG_CONDUIT_POTION);

        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.AMBER_DUST.asItem(), Potions.FIRE_RESISTANCE);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.ANDALUSITE_DUST.asItem(), ModPotions.MINING_FATIGUE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.AQUAMARINE_DUST.asItem(), ModPotions.DOLPHINS_GRACE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.CITRINE_DUST.asItem(), ModPotions.HEALTH_BOOST_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.DIOPSIDE_DUST.asItem(), ModPotions.BAD_OMEN_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.GARNET_DUST.asItem(), Potions.HARMING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.HESSONITE_DUST.asItem(), Potions.STRENGTH);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.MALICHITE_DUST.asItem(), ModPotions.HUNGER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.MOONSTONE_DUST.asItem(), Potions.SLOWNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.OPAL_DUST.asItem(), ModPotions.CONDUIT_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.PERIDOT_DUST.asItem(), Potions.LEAPING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.PREHNITE_DUST.asItem(), Potions.POISON);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.RUBY_DUST.asItem(), ModPotions.SATURATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.SAPPHIRE_DUST.asItem(), Potions.NIGHT_VISION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.SMOKY_QUARTZ_DUST.asItem(), ModPotions.WITHER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.SPESSARITE_DUST.asItem(), Potions.HEALING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.SPHENE_DUST.asItem(), ModPotions.LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.SPINEL_DUST.asItem(), ModPotions.RESISTANCE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.TANZANITE_DUST.asItem(), Potions.WATER_BREATHING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.TOPAZ_DUST.asItem(), ModPotions.BAD_LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.TORMALINE_DUST.asItem(), Potions.REGENERATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.TSAVORITE_DUST.asItem(), ModPotions.GLOWING_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.ZIRCON_DUST.asItem(), Potions.SLOW_FALLING);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.AMETHYST_DUST.asItem(), ModPotions.NAUSEA_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.CHARCOAL_DUST.asItem(), Potions.WEAKNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.COAL_DUST.asItem(), ModPotions.DARKNESS_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.COPPER_DUST.asItem(), ModPotions.LEVITATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.DIAMOND_DUST.asItem(), Potions.SWIFTNESS);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.EMERALD_DUST.asItem(), ModPotions.VILLAGE_HERO_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.FLINT_DUST.asItem(), ModPotions.BLINDNESS_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.GOLD_DUST.asItem(), ModPotions.HASTE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.IRON_DUST.asItem(), Potions.INVISIBILITY);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, MagicBlocks.LAPIS_DUST.asItem(), ModPotions.ABSORPTION_POTION);
    }
}
