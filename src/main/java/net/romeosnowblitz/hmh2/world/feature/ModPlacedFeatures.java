package net.romeosnowblitz.hmh2.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;

import java.util.List;

import static net.romeosnowblitz.hmh2.world.feature.ModOreFeatures.modifiersWithCount;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> BANANA_CHECKED_KEY = registerKey("banana_checked");
    public static final RegistryKey<PlacedFeature> BANANA_PLACED_KEY = registerKey("banana_placed");
    public static final RegistryKey<PlacedFeature> CHERRY_CHECKED_KEY = registerKey("cherry_checked");
    public static final RegistryKey<PlacedFeature> CHERRY_PLACED_KEY = registerKey("cherry_placed");
    public static final RegistryKey<PlacedFeature> CORK_OAK_CHECKED_KEY = registerKey("cork_oak_checked");
    public static final RegistryKey<PlacedFeature> CORK_OAK_PLACED_KEY = registerKey("cork_oak_placed");
    public static final RegistryKey<PlacedFeature> JACARANDA_CHECKED_KEY = registerKey("jacaranda_checked");
    public static final RegistryKey<PlacedFeature> JACARANDA_PLACED_KEY = registerKey("jacaranda_placed");
    public static final RegistryKey<PlacedFeature> MAHOE_CHECKED_KEY = registerKey("mahoe_checked");
    public static final RegistryKey<PlacedFeature> MAHOE_PLACED_KEY = registerKey("mahoe_placed");
    public static final RegistryKey<PlacedFeature> MANGO_CHECKED_KEY = registerKey("mango_checked");
    public static final RegistryKey<PlacedFeature> MANGO_PLACED_KEY = registerKey("mango_placed");
    public static final RegistryKey<PlacedFeature> WILLOW_CHECKED_KEY = registerKey("willow_checked");
    public static final RegistryKey<PlacedFeature> WILLOW_PLACED_KEY = registerKey("willow_placed");
    public static final RegistryKey<PlacedFeature> UNBREAKABLE_CHECKED_KEY = registerKey("unbreakable_checked");
    public static final RegistryKey<PlacedFeature> UNBREAKABLE_PLACED_KEY = registerKey("unbreakable_placed");

    public static final RegistryKey<PlacedFeature> BEEF_ORE_PLACED_KEY = registerKey("beef_ore_placed");
    public static final RegistryKey<PlacedFeature> CHICKEN_ORE_PLACED_KEY = registerKey("chicken_ore_placed");
    public static final RegistryKey<PlacedFeature> DIABASE_ORE_PLACED_KEY = registerKey("diabase_ore_placed");
    public static final RegistryKey<PlacedFeature> GRAPHITE_ORE_PLACED_KEY = registerKey("graphite_ore_placed");
    public static final RegistryKey<PlacedFeature> LIFE_ORE_PLACED_KEY = registerKey("life_ore_placed");
    public static final RegistryKey<PlacedFeature> LIMESTONE_ORE_PLACED_KEY = registerKey("limestone_ore_placed");
    public static final RegistryKey<PlacedFeature> MARBLE_ORE_PLACED_KEY = registerKey("marble_ore_placed");
    public static final RegistryKey<PlacedFeature> PEAT_ORE_PLACED_KEY = registerKey("peat_ore_placed");
    public static final RegistryKey<PlacedFeature> RAW_PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final RegistryKey<PlacedFeature> PUMICE_ORE_PLACED_KEY = registerKey("pumice_ore_placed");
    public static final RegistryKey<PlacedFeature> SALT_ORE_PLACED_KEY = registerKey("salt_ore_placed");
    public static final RegistryKey<PlacedFeature> SHALE_ORE_PLACED_KEY = registerKey("shale_ore_placed");
    public static final RegistryKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final RegistryKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final RegistryKey<PlacedFeature> RAW_TITANIUM_ORE_PLACED_KEY = registerKey("titanium_ore_placed");

    public static final RegistryKey<PlacedFeature> NETHER_HELLSTONE_ORE_PLACED_KEY = registerKey("nether_hellstone_ore_placed");
    public static final RegistryKey<PlacedFeature> END_QUAERITE_ORE_PLACED_KEY = registerKey("end_quaerite_ore_placed");

    public static final RegistryKey<PlacedFeature> BEE_GEODE_PLACED_KEY = registerKey("bee_geode_placed");
    public static final RegistryKey<PlacedFeature> EMERALD_GEODE_PLACED_KEY = registerKey("emerald_geode_placed");

    public static final RegistryKey<PlacedFeature> BLUE_SPIDER_LILY_PLACED_KEY = registerKey("blue_spider_lily_placed");
    public static final RegistryKey<PlacedFeature> POISON_GRASS_PLACED_KEY = registerKey("poison_grass_placed");
    public static final RegistryKey<PlacedFeature> ROSE_PLACED_KEY = registerKey("rose_placed");
    public static final RegistryKey<PlacedFeature> WOLFSBANE_PLACED_KEY = registerKey("wolfsbane_placed");
    public static final RegistryKey<PlacedFeature> BLUEBERRY_BUSH_PLACED_KEY = registerKey("blueberry_bush_placed");
    public static final RegistryKey<PlacedFeature> STRAWBERRY_BUSH_PLACED_KEY = registerKey("strawberry_bush_placed");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, BANANA_CHECKED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BANANA_KEY),
                List.of(PlacedFeatures.wouldSurvive(WoodworkBlocks.BANANA_SAPLING)));
        register(context, BANANA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BANANA_KEY),
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));
        register(context, CHERRY_CHECKED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CHERRY_KEY),
                List.of(PlacedFeatures.wouldSurvive(WoodworkBlocks.CHERRY_SAPLING)));
        register(context, CHERRY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CHERRY_KEY),
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));
        register(context, CORK_OAK_CHECKED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CORK_OAK_KEY),
                List.of(PlacedFeatures.wouldSurvive(WoodworkBlocks.CORK_OAK_SAPLING)));
        register(context, CORK_OAK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CORK_OAK_KEY),
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));
        register(context, JACARANDA_CHECKED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.JACARANDA_KEY),
                List.of(PlacedFeatures.wouldSurvive(WoodworkBlocks.JACARANDA_SAPLING)));
        register(context, JACARANDA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.JACARANDA_KEY),
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));
        register(context, MAHOE_CHECKED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MAHOE_KEY),
                List.of(PlacedFeatures.wouldSurvive(WoodworkBlocks.MAHOE_SAPLING)));
        register(context, MAHOE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MAHOE_KEY),
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));
        register(context, MANGO_CHECKED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MANGO_KEY),
                List.of(PlacedFeatures.wouldSurvive(WoodworkBlocks.MANGO_SAPLING)));
        register(context, MANGO_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MANGO_KEY),
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));
        register(context, WILLOW_CHECKED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WILLOW_KEY),
                List.of(PlacedFeatures.wouldSurvive(WoodworkBlocks.WILLOW_SAPLING)));
        register(context, WILLOW_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WILLOW_KEY),
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0)));
        register(context, UNBREAKABLE_CHECKED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.UNBREAKABLE_KEY),
                List.of(PlacedFeatures.wouldSurvive(ModBlocks.BLOCK)));
        register(context, UNBREAKABLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.UNBREAKABLE_KEY),
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));


        register(context, BEEF_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BEEF_ORE_KEY), modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, CHICKEN_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CHICKEN_ORE_KEY), modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, DIABASE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DIABASE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(1), YOffset.aboveBottom(3))));
        register(context, GRAPHITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GRAPHITE_ORE_KEY), modifiersWithCount(5, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, LIFE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LIFE_ORE_KEY), modifiersWithCount(10, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, LIMESTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LIMESTONE_ORE_KEY), modifiersWithCount(32, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(64), YOffset.aboveBottom(256))));
        register(context, MARBLE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MARBLE_ORE_KEY), modifiersWithCount(16, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(256))));
        register(context, PEAT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PEAT_ORE_KEY), modifiersWithCount(18, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(96), YOffset.aboveBottom(160))));
        register(context, RAW_PLATINUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PLATINUM_ORE_KEY), modifiersWithCount(8, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, PUMICE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PUMICE_ORE_KEY), modifiersWithCount(8, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(64))));
        register(context, SALT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SALT_ORE_KEY), modifiersWithCount(4, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(64), YOffset.aboveBottom(128))));
        register(context, SHALE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SHALE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(128), YOffset.aboveBottom(320))));
        register(context, SILVER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SILVER_ORE_KEY), modifiersWithCount(8, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, TIN_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TIN_ORE_KEY), modifiersWithCount(8, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, RAW_TITANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TITANIUM_ORE_KEY), modifiersWithCount(8, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, NETHER_HELLSTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.HELLSTONE_ORE_KEY), modifiersWithCount(32, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, END_QUAERITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUAERITE_ORE_KEY), modifiersWithCount(8, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));

        register(context, BEE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BEE_GEODE_KEY),
                RarityFilterPlacementModifier.of(42), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(32),
                        YOffset.aboveBottom(104)), BiomePlacementModifier.of());
        register(context, EMERALD_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.EMERALD_GEODE_KEY),
                RarityFilterPlacementModifier.of(42), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.aboveBottom(50)), BiomePlacementModifier.of());

        register(context, BLUE_SPIDER_LILY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUE_SPIDER_LILY_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, POISON_GRASS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.POISON_GRASS_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, ROSE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ROSE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WOLFSBANE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WOLFSBANE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, BLUEBERRY_BUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUEBERRY_BUSH_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, STRAWBERRY_BUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.STRAWBERRY_BUSH_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Hmh2.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

}