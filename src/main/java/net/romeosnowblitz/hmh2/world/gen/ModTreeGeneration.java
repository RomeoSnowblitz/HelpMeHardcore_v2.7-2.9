package net.romeosnowblitz.hmh2.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.romeosnowblitz.hmh2.world.feature.ModPlacedFeatures;

public class ModTreeGeneration {
    public static void generateTrees() {

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SPARSE_JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BANANA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CHERRY_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CORK_OAK_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_PLAINS), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.JACARANDA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MAHOE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SPARSE_JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MANGO_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WILLOW_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.UNBREAKABLE_PLACED_KEY);

    }
}
