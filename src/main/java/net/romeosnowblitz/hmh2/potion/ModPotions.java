package net.romeosnowblitz.hmh2.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.mixin.BrewingRecipeRegistryMixin;

public class ModPotions {
    public static Potion HASTE_POTION;
    public static Potion MINING_FATIGUE_POTION;
    public static Potion LEVITATION_POTION;
    public static Potion BLINDNESS_POTION;
    public static Potion GLOWING_POTION;
    public static Potion BAD_LUCK_POTION;
    public static Potion LUCK_POTION;
    public static Potion HUNGER_POTION;
    public static Potion SATURATION_POTION;
    public static Potion BAD_OMEN_POTION;
    public static Potion VILLAGE_HERO_POTION;
    public static Potion NAUSEA_POTION;
    public static Potion DOLPHINS_GRACE_POTION;
    public static Potion WITHER_POTION;
    public static Potion RESISTANCE_POTION;
    public static Potion HEALTH_BOOST_POTION;
    public static Potion ABSORPTION_POTION;
    public static Potion CONDUIT_POTION;

    public static Potion registerHastePotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HASTE, 9600, 0)));}
    public static Potion registerMiningFatiguePotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 9600, 0)));}
    public static Potion registerLevitationPotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 300, 0)));}
    public static Potion registerBlindnessPotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.BLINDNESS, 300, 0)));}
    public static Potion registerGlowingPotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.GLOWING, 600, 0)));}
    public static Potion registerBadLuckPotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 12000, 0)));}
    public static Potion registerLuckPotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.LUCK, 12000, 0)));}
    public static Potion registerHungerPotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HUNGER, 300, 0)));}
    public static Potion registerSaturationPotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.SATURATION, 300, 0)));}
    public static Potion registerBadOmenPotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.BAD_OMEN, 200, 0)));}
    public static Potion registerVillageHeroPotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 6000, 0)));}
    public static Potion registerNauseaPotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 0)));}
    public static Potion registerDolphinsGracePotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 9600, 0)));}
    public static Potion registerWitherPotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.WITHER, 400, 0)));}
    public static Potion registerResistancePotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0)));}
    public static Potion registerHealthBoostPotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 3000, 0)));}
    public static Potion registerAbsorptionPotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, 3000, 0)));}
    public static Potion registerConduitPotion(String name) {return Registry.register(Registry.POTION, new Identifier(Hmh2.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 4800, 0)));}


    public static void registerPotions() {
        HASTE_POTION = registerHastePotion("haste_potion");
        MINING_FATIGUE_POTION = registerMiningFatiguePotion("mining_fatigue_potion");
        LEVITATION_POTION = registerLevitationPotion("levitation_potion");
        BLINDNESS_POTION = registerBlindnessPotion("blindness_potion");
        GLOWING_POTION = registerGlowingPotion("glowing_potion");
        BAD_LUCK_POTION = registerBadLuckPotion("bad_luck_potion");
        LUCK_POTION = registerLuckPotion("luck_potion");
        HUNGER_POTION = registerHungerPotion("hunger_potion");
        SATURATION_POTION = registerSaturationPotion("saturation_potion");
        BAD_OMEN_POTION = registerBadOmenPotion("bad_omen_potion");
        VILLAGE_HERO_POTION = registerVillageHeroPotion("village_hero_potion");
        NAUSEA_POTION = registerNauseaPotion("nausea_potion");
        DOLPHINS_GRACE_POTION = registerDolphinsGracePotion("dolphins_grace_potion");
        WITHER_POTION = registerWitherPotion("wither_potion");
        RESISTANCE_POTION = registerResistancePotion("resistance_potion");
        HEALTH_BOOST_POTION = registerHealthBoostPotion("health_boost_potion");
        ABSORPTION_POTION = registerAbsorptionPotion("absorption_potion");
        CONDUIT_POTION = registerConduitPotion("conduit_potion");

        registerPotionRecipes();
    }

    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.OBSIDIAN, ModPotions.MINING_FATIGUE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.MINING_FATIGUE_POTION, Items.GOLD_INGOT, ModPotions.HASTE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.SLOW_FALLING, Items.ENDER_PEARL, ModPotions.LEVITATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.WITHER_SKELETON_SKULL, ModPotions.BLINDNESS_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BLINDNESS_POTION, Items.GLOWSTONE, ModPotions.GLOWING_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.BELL, ModPotions.BAD_LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BAD_LUCK_POTION, Items.ENDER_EYE, ModPotions.LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.ROTTEN_FLESH, ModPotions.HUNGER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HUNGER_POTION, Items.BLUE_ORCHID, ModPotions.SATURATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.CACTUS, ModPotions.BAD_OMEN_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BAD_OMEN_POTION, Items.EMERALD_BLOCK, ModPotions.VILLAGE_HERO_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.WET_SPONGE, ModPotions.NAUSEA_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.NAUSEA_POTION, Items.PRISMARINE_SHARD, ModPotions.DOLPHINS_GRACE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.REGENERATION, Items.NETHERITE_SCRAP, ModPotions.WITHER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.NETHER_WART, ModPotions.RESISTANCE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.HONEY_BLOCK, ModPotions.HEALTH_BOOST_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.HEART, ModPotions.ABSORPTION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.NAUTILUS_SHELL, ModPotions.CONDUIT_POTION);
    }
}
