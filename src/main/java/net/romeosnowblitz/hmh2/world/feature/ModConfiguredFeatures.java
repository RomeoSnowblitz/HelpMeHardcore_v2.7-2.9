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
    public static final RegistryKey<ConfiguredFeature<?,?>> CHERRY_KEY = registerKey("cherry");
    public static final RegistryKey<ConfiguredFeature<?,?>> CORK_OAK_KEY = registerKey("cork_oak");
    public static final RegistryKey<ConfiguredFeature<?,?>> JACARANDA_KEY = registerKey("jacaranda");
    public static final RegistryKey<ConfiguredFeature<?,?>> MAHOE_KEY = registerKey("mahoe");
    public static final RegistryKey<ConfiguredFeature<?,?>> MANGO_KEY = registerKey("mango");
    public static final RegistryKey<ConfiguredFeature<?,?>> WILLOW_KEY = registerKey("willow");
    public static final RegistryKey<ConfiguredFeature<?,?>> UNBREAKABLE_KEY = registerKey("unbreakable");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, BANANA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.BANANA_LOG), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.BANANA_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, CHERRY_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.CHERRY_LOG), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.CHERRY_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, CORK_OAK_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.CORK_OAK_LOG), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.CORK_OAK_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, JACARANDA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.JACARANDA_LOG), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.JACARANDA_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, MAHOE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.MAHOE_LOG), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.MAHOE_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, MANGO_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.MANGO_LOG), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.MANGO_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, WILLOW_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.WILLOW_LOG), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.WILLOW_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
        register(context, UNBREAKABLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(WoodworkBlocks.UNBREAKABLE_BLOCK), new StraightTrunkPlacer(3, 3, 2),
                BlockStateProvider.of(WoodworkBlocks.UNBREAKABLE_LEAVES), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4), new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Hmh2.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
