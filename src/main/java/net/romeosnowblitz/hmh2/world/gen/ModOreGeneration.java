package net.romeosnowblitz.hmh2.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.romeosnowblitz.hmh2.world.feature.ModPlacedFeatures;
import net.romeosnowblitz.hmh2.world.feature.jewels.ModJewelPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres() {
        //Ores
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.BEEF_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CHICKEN_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRAPHITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIFE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUKEWARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIMESTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_LUKEWARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIMESTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIMESTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIMESTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIMESTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.STONY_SHORE), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIMESTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RAW_PLATINUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RAW_TITANIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.RAW_GENERATION, ModPlacedFeatures.MARBLE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PUMICE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PEAT_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MANGROVE_SWAMP), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PEAT_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SALT_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SHALE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SILVER_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TIN_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DIABASE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.NETHER_WASTES), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_HELLSTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_HELLSTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_HELLSTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_HELLSTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BASALT_DELTAS), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_HELLSTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_QUAERITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.EMERALD_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.BEE_GEODE_PLACED_KEY);

        //Jewels
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.AMBER_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BAMBOO_JUNGLE), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.PERIDOT_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.OPAL_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TSAVORITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.COLD_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.OPAL_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.AMBER_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.DIOPSIDE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_COLD_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.ANDALUSITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_DARK), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.GARNET_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_FROZEN_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_LUKEWARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.AQUAMARINE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TOPAZ_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TSAVORITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPHENE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.RUBY_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FROZEN_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.MOONSTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JAGGED_PEAKS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.CHARCOAL_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FROZEN_RIVER), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_HILLS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.ZIRCON_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.ICE_SPIKES), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.DIOPSIDE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.CITRINE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FROZEN_PEAKS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.ZIRCON_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUKEWARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.AQUAMARINE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUSH_CAVES), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.MALICHITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.RUBY_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MUSHROOM_FIELDS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SMOKY_QUARTZ_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MANGROVE_SWAMP), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPESSARITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TANZANITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_BIRCH_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.CHARCOAL_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.CHARCOAL_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TSAVORITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.PREHNITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.RIVER), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPHENE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.HESSONITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TORMALINE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA_PLATEAU), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.HESSONITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_BEACH), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TOPAZ_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_PLAINS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.MOONSTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_SLOPES), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.ANDALUSITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPINEL_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.STONY_PEAKS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SMOKY_QUARTZ_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.STONY_SHORE), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.MALICHITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.GROVE), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.PERIDOT_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPINEL_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TORMALINE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.PREHNITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_GRAVELLY_HILLS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.CHARCOAL_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.CITRINE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_SAVANNA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPESSARITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WOODED_BADLANDS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.GARNET_ORE_PLACED_KEY);
    }
}
