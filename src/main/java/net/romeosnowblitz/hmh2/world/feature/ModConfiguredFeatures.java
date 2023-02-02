package net.romeosnowblitz.hmh2.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?,?>> BANANA_KEY = registerKey("banana");
    public static final RegistryKey<ConfiguredFeature<?,?>> BANANA_SPAWN_KEY = registerKey("banana_spawn");
    public static final RegistryKey<ConfiguredFeature<?,?>> CHERRY_KEY = registerKey("cherry");
    public static final RegistryKey<ConfiguredFeature<?,?>> CHERRY_SPAWN_KEY = registerKey("cherry_spawn");
    public static final RegistryKey<ConfiguredFeature<?,?>> CORK_OAK_KEY = registerKey("cork_oak");
    public static final RegistryKey<ConfiguredFeature<?,?>> CORK_OAK_SPAWN_KEY = registerKey("cork_oak_spawn");
    public static final RegistryKey<ConfiguredFeature<?,?>> JACARANDA_KEY = registerKey("jacaranda");
    public static final RegistryKey<ConfiguredFeature<?,?>> JACARANDA_SPAWN_KEY = registerKey("jacaranda_spawn");
    public static final RegistryKey<ConfiguredFeature<?,?>> MAHOE_KEY = registerKey("mahoe");
    public static final RegistryKey<ConfiguredFeature<?,?>> MAHOE_SPAWN_KEY = registerKey("mahoe_spawn");
    public static final RegistryKey<ConfiguredFeature<?,?>> MANGO_KEY = registerKey("mango");
    public static final RegistryKey<ConfiguredFeature<?,?>> MANGO_SPAWN_KEY = registerKey("mango_spawn");
    public static final RegistryKey<ConfiguredFeature<?,?>> WILLOW_KEY = registerKey("willow");
    public static final RegistryKey<ConfiguredFeature<?,?>> WILLOW_SPAWN_KEY = registerKey("willow_spawn");
    public static final RegistryKey<ConfiguredFeature<?,?>> UNBREAKABLE_KEY = registerKey("unbreakable");
    public static final RegistryKey<ConfiguredFeature<?,?>> UNBREAKABLE_SPAWN_KEY = registerKey("unbreakable_spawn");

    public static final RegistryKey<ConfiguredFeature<?,?>> BEEF_ORE_KEY = registerKey("beef_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> CHICKEN_ORE_KEY = registerKey("chicken_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> DIABASE_ORE_KEY = registerKey("diabase_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> GRAPHITE_ORE_KEY = registerKey("graphite_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> LIFE_ORE_KEY = registerKey("life_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> LIMESTONE_ORE_KEY = registerKey("limestone_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> MARBLE_ORE_KEY = registerKey("marble_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> PEAT_ORE_KEY = registerKey("peat_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> PUMICE_ORE_KEY = registerKey("pumice_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> SALT_ORE_KEY = registerKey("salt_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> SHALE_ORE_KEY = registerKey("shale_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> SILVER_ORE_KEY = registerKey("silver_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> TIN_ORE_KEY = registerKey("tin_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> HELLSTONE_ORE_KEY = registerKey("hellstone_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> QUAERITE_ORE_KEY = registerKey("quaerite_ore");

    public static final RegistryKey<ConfiguredFeature<?,?>> BEE_GEODE_KEY = registerKey("bee_geode");
    public static final RegistryKey<ConfiguredFeature<?,?>> EMERALD_GEODE_KEY = registerKey("emerald_geode");

    public static final RegistryKey<ConfiguredFeature<?,?>> BLUE_SPIDER_LILY_KEY = registerKey("blue_spider_lily");
    public static final RegistryKey<ConfiguredFeature<?,?>> POISON_GRASS_KEY = registerKey("poison_grass");
    public static final RegistryKey<ConfiguredFeature<?,?>> ROSE_KEY = registerKey("rose");
    public static final RegistryKey<ConfiguredFeature<?,?>> WOLFSBANE_KEY = registerKey("wolfsbane");
    public static final RegistryKey<ConfiguredFeature<?,?>> BLUEBERRY_BUSH_KEY = registerKey("blueberry_bush");
    public static final RegistryKey<ConfiguredFeature<?,?>> STRAWBERRY_BUSH_KEY = registerKey("strawberry_bush");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        var placedFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endstoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldBeefOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RAW_BEEF_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.BEEF_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldChickenOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RAW_CHICKEN_NUGGET_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.CHICKEN_NUGGET_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDiabaseOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.DIABASE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DIABASE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldGraphiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.GRAPHITE_BLOCK.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.GRAPHITE_BLOCK.getDefaultState()));
        List<OreFeatureConfig.Target> overworldLifeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.LIFE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.LIFE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldLimestoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.LIMESTONE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.LIMESTONE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldMarbleOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.MARBLE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.MARBLE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPeatOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.PEAT.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.PEAT.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPlatinumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RAW_PLATINUM_BLOCK.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.RAW_PLATINUM_BLOCK.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPumiceOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.PUMICE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.PUMICE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSaltOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SALT_BLOCK.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.SALT_BLOCK.getDefaultState()));
        List<OreFeatureConfig.Target> overworldShaleOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SHALE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.SHALE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSilverOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SILVER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTinOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TIN_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_TIN_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTitaniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RAW_TITANIUM_BLOCK.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.RAW_TITANIUM_BLOCK.getDefaultState()));
        List<OreFeatureConfig.Target> netherHellstoneOres = List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.HELLSTONE_BLOCK.getDefaultState()));
        List<OreFeatureConfig.Target> enderQuaeriteOres = List.of(OreFeatureConfig.createTarget(endstoneReplaceables, ModBlocks.QUAERITE.getDefaultState()));


        register(context, BANANA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.BANANA_LOG), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.BANANA_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, BANANA_SPAWN_KEY, Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.BANANA_PLACED_KEY), 1.0f)), placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.BANANA_PLACED_KEY)));

        register(context, CHERRY_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.CHERRY_LOG), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.CHERRY_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, CHERRY_SPAWN_KEY, Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.CHERRY_PLACED_KEY), 1.0f)), placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.CHERRY_PLACED_KEY)));
        register(context, CORK_OAK_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.CORK_OAK_LOG), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.CORK_OAK_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, CORK_OAK_SPAWN_KEY, Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.CORK_OAK_PLACED_KEY), 1.0f)), placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.CORK_OAK_PLACED_KEY)));
        register(context, JACARANDA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.JACARANDA_LOG), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.JACARANDA_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, JACARANDA_SPAWN_KEY, Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.JACARANDA_PLACED_KEY), 1.0f)), placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.JACARANDA_PLACED_KEY)));
        register(context, MAHOE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.MAHOE_LOG), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.MAHOE_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, MAHOE_SPAWN_KEY, Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.MAHOE_PLACED_KEY), 1.0f)), placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.MAHOE_PLACED_KEY)));
        register(context, MANGO_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.MANGO_LOG), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.MANGO_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, MANGO_SPAWN_KEY, Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.MANGO_PLACED_KEY), 1.0f)), placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.MANGO_PLACED_KEY)));
        register(context, WILLOW_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.WILLOW_LOG), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.WILLOW_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, WILLOW_SPAWN_KEY, Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.WILLOW_PLACED_KEY), 1.0f)), placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.WILLOW_PLACED_KEY)));
        register(context, UNBREAKABLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.UNBREAKABLE_BLOCK), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.UNBREAKABLE_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, UNBREAKABLE_SPAWN_KEY, Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.UNBREAKABLE_PLACED_KEY), 1.0f)), placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.UNBREAKABLE_PLACED_KEY)));

        register(context, BEEF_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldBeefOres, 6));
        register(context, CHICKEN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldChickenOres, 6));
        register(context, DIABASE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDiabaseOres, 48));
        register(context, GRAPHITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldGraphiteOres, 3));
        register(context, LIFE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldLifeOres, 3));
        register(context, LIMESTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldLimestoneOres, 32));
        register(context, MARBLE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMarbleOres, 12));
        register(context, PEAT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPeatOres, 32));
        register(context, PLATINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPlatinumOres, 12));
        register(context, PUMICE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPumiceOres, 8));
        register(context, SALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSaltOres, 16));
        register(context, SHALE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldShaleOres, 64));
        register(context, SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSilverOres, 8));
        register(context, TIN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTinOres, 8));
        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTitaniumOres, 8));
        register(context, HELLSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherHellstoneOres, 4));
        register(context, QUAERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(enderQuaeriteOres, 4));

        register(context, EMERALD_GEODE_KEY, Feature.GEODE ,
                new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                        BlockStateProvider.of(Blocks.STONE),
                        BlockStateProvider.of(Blocks.EMERALD_ORE),
                        BlockStateProvider.of(ModBlocks.MARBLE),
                        BlockStateProvider.of(Blocks.DEEPSLATE),
                        List.of(Blocks.EMERALD_BLOCK.getDefaultState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7D, 1.2D, 2.5D, 3.5D),
                        new GeodeCrackConfig(0.25D, 1.5D, 1),
                        0.5D, 0.1D,
                        true, UniformIntProvider.create(3, 8),
                        UniformIntProvider.create(2, 6), UniformIntProvider.create(1, 2),
                        -18, 18, 0.075D, 1));

        register(context, BEE_GEODE_KEY, Feature.GEODE ,
                new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                        BlockStateProvider.of(Blocks.HONEY_BLOCK),
                        BlockStateProvider.of(Blocks.BEE_NEST),
                        BlockStateProvider.of(ModBlocks.INFESTED_HONEYCOMB_BLOCK),
                        BlockStateProvider.of(Blocks.HONEYCOMB_BLOCK),
                        List.of(ModBlocks.HONEY_FLUID_BLOCK.getDefaultState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7D, 1.2D, 2.5D, 3.5D),
                        new GeodeCrackConfig(0.25D, 1.5D, 1),
                        0.5D, 0.1D,
                        true, UniformIntProvider.create(3, 8),
                        UniformIntProvider.create(2, 6), UniformIntProvider.create(1, 2),
                        -18, 18, 0.075D, 1));

        register(context, BLUE_SPIDER_LILY_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_SPIDER_LILY)))));
        register(context, POISON_GRASS_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.POISON_GRASS)))));
        register(context, ROSE_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ROSE)))));
        register(context, WOLFSBANE_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WOLFSBANE)))));
        register(context, BLUEBERRY_BUSH_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(4, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUEBERRY_BUSH)))));
        register(context, STRAWBERRY_BUSH_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(4, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.STRAWBERRY_BUSH)))));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Hmh2.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
