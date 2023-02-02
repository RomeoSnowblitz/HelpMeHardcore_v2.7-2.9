package net.romeosnowblitz.hmh2.world.feature.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.romeosnowblitz.hmh2.world.feature.ModConfiguredFeatures;

import javax.annotation.Nullable;


public class BananaSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.BANANA_KEY;
    }
}
