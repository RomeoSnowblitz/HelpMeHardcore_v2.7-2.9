package net.romeosnowblitz.hmh2.world.feature;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?,?>> BANANA_KEY = registerKey("tree_banana");
    public static final RegistryKey<ConfiguredFeature<?,?>> CHERRY_KEY = registerKey("tree_cherry");
    public static final RegistryKey<ConfiguredFeature<?,?>> CORK_OAK_KEY = registerKey("tree_cork_oak");
    public static final RegistryKey<ConfiguredFeature<?,?>> JACARANDA_KEY = registerKey("tree_jacaranda");
    public static final RegistryKey<ConfiguredFeature<?,?>> MAHOE_KEY = registerKey("tree_mahoe");
    public static final RegistryKey<ConfiguredFeature<?,?>> MANGO_KEY = registerKey("tree_mango");
    public static final RegistryKey<ConfiguredFeature<?,?>> WILLOW_KEY = registerKey("tree_willow");

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Hmh2.MOD_ID, name));
    }


}
