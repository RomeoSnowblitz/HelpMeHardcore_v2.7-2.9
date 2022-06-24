package net.romeosnowblitz.hmh2.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class ModPlacedFeatures {
    //Trees
    public static final RegistryEntry<PlacedFeature> BANANA_PLACED = PlacedFeatures.register("banana_placed", ModConfiguredFeatures.BANANA_SPAWN, VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));
    public static final RegistryEntry<PlacedFeature> CHERRY_PLACED = PlacedFeatures.register("cherry_placed", ModConfiguredFeatures.CHERRY_SPAWN, VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0 )));
    public static final RegistryEntry<PlacedFeature> JACARANDA_PLACED = PlacedFeatures.register("jacaranda_placed", ModConfiguredFeatures.JACARANDA_SPAWN, VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));
    public static final RegistryEntry<PlacedFeature> MAHOE_PLACED = PlacedFeatures.register("mahoe_placed", ModConfiguredFeatures.MAHOE_SPAWN, VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));
    public static final RegistryEntry<PlacedFeature> MANGO_PLACED = PlacedFeatures.register("mango_placed", ModConfiguredFeatures.MANGO_SPAWN, VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));
    public static final RegistryEntry<PlacedFeature> WILLOW_PLACED = PlacedFeatures.register("willow_placed", ModConfiguredFeatures.WILLOW_SPAWN, VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));
    public static final RegistryEntry<PlacedFeature> UNBREAKABLE_TREE_PLACED = PlacedFeatures.register("unbreakable_tree_placed", ModConfiguredFeatures.UNBREAKABLE_TREE_SPAWN, VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));

    //Flowers
    public static final RegistryEntry<PlacedFeature> BLUE_SPIDER_LILY = PlacedFeatures.register("blue_spider_lily", ModConfiguredFeatures.BLUE_SPIDER_LILY, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> POISON_GRASS = PlacedFeatures.register("poison_grass", ModConfiguredFeatures.POISON_GRASS, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> ROSE = PlacedFeatures.register("rose", ModConfiguredFeatures.ROSE, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> WOLFSBANE = PlacedFeatures.register("wolfsbane", ModConfiguredFeatures.WOLFSBANE, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> BLUEBERRY_BUSH = PlacedFeatures.register("blueberry_bush", ModConfiguredFeatures.BLUEBERRY_BUSH, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    //Ores
    public static final RegistryEntry<PlacedFeature> BEEF = PlacedFeatures.register("beef", ModConfiguredFeatures.BEEF, ModOreFeatures.modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
    public static final RegistryEntry<PlacedFeature> CHICKEN = PlacedFeatures.register("chicken", ModConfiguredFeatures.CHICKEN, ModOreFeatures.modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
    public static final RegistryEntry<PlacedFeature> GRAPHITE = PlacedFeatures.register("graphite", ModConfiguredFeatures.GRAPHITE, ModOreFeatures.modifiersWithCount(5, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
    public static final RegistryEntry<PlacedFeature> LIFE_ORE_PLACED = PlacedFeatures.register("life_ore_placed", ModConfiguredFeatures.LIFE_ORE, ModOreFeatures.modifiersWithCount(8, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
    public static final RegistryEntry<PlacedFeature> LUCKY_ORE_PLACED = PlacedFeatures.register("lucky_ore_placed", ModConfiguredFeatures.LUCKY_ORE, ModOreFeatures.modifiersWithCount(5, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
    public static final RegistryEntry<PlacedFeature> MARBLE = PlacedFeatures.register("marble", ModConfiguredFeatures.MARBLE, ModOreFeatures.modifiersWithCount(16, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(256))));
    public static final RegistryEntry<PlacedFeature> RAW_PLATINUM = PlacedFeatures.register("raw_platinum", ModConfiguredFeatures.RAW_PLATINUM, ModOreFeatures.modifiersWithCount(8, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
    public static final RegistryEntry<PlacedFeature> RAW_TITANIUM = PlacedFeatures.register("raw_titanium", ModConfiguredFeatures.RAW_TITANIUM, ModOreFeatures.modifiersWithCount(8, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
    public static final RegistryEntry<PlacedFeature> PUMICE = PlacedFeatures.register("pumice", ModConfiguredFeatures.PUMICE, ModOreFeatures.modifiersWithCount(8, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(64))));
    public static final RegistryEntry<PlacedFeature> SALT = PlacedFeatures.register("salt", ModConfiguredFeatures.SALT, ModOreFeatures.modifiersWithCount(4, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(64), YOffset.aboveBottom(128))));
    public static final RegistryEntry<PlacedFeature> SILVER = PlacedFeatures.register("silver", ModConfiguredFeatures.SILVER, ModOreFeatures.modifiersWithCount(8, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
    public static final RegistryEntry<PlacedFeature> TIN = PlacedFeatures.register("tin", ModConfiguredFeatures.TIN, ModOreFeatures.modifiersWithCount(8, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));

    public static final RegistryEntry<PlacedFeature> HELLSTONE = PlacedFeatures.register("hellstone", ModConfiguredFeatures.HELLSTONE, ModOreFeatures.modifiersWithCount(32, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
    public static final RegistryEntry<PlacedFeature> QUAERITE = PlacedFeatures.register("quaerite", ModConfiguredFeatures.QUAERITE, ModOreFeatures.modifiersWithCount(4, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));

    public static final RegistryEntry<PlacedFeature> ORICHALCUM_GEODE_PLACED = PlacedFeatures.register("orichalcum_geode_placed",
            ModConfiguredFeatures.ORICHALCUM_GEODE, RarityFilterPlacementModifier.of(42),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.aboveBottom(50)),
            BiomePlacementModifier.of());

}