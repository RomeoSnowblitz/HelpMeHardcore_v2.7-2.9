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
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.BEEF.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CHICKEN.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.GRAPHITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIFE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUKEWARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIMESTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_LUKEWARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIMESTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIMESTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIMESTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIMESTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.STONY_SHORE), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LIMESTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LUCKY_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RAW_PLATINUM.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RAW_TITANIUM.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.RAW_GENERATION, ModPlacedFeatures.MARBLE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PUMICE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SALT.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SHALE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SILVER.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TIN.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DIABASE.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.NETHER_WASTES), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.HELLSTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.HELLSTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.HELLSTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.HELLSTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BASALT_DELTAS), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.HELLSTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.QUAERITE.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.EMERALD_GEODE_PLACED.getKey().get());


        //Jewels
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.AMBER.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BAMBOO_JUNGLE), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.PERIDOT.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.OPAL.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TSAVORITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.COLD_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.OPAL.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.AMBER.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.DIOPSIDE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_COLD_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.ANDALUSITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_DARK), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.GARNET.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_FROZEN_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SAPPHIRE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_LUKEWARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.AQUAMARINE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TOPAZ.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TSAVORITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPHENE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.RUBY.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FROZEN_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.MOONSTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JAGGED_PEAKS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.CHARCOAL.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FROZEN_RIVER), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SAPPHIRE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_HILLS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.ZIRCON.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.ICE_SPIKES), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.DIOPSIDE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.CITRINE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FROZEN_PEAKS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.ZIRCON.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUKEWARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.AQUAMARINE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUSH_CAVES), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.MALICHITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.RUBY.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MUSHROOM_FIELDS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SMOKY_QUARTZ.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MANGROVE_SWAMP), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPESSARITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TANZANITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_BIRCH_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.CHARCOAL.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.CHARCOAL.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TSAVORITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.PREHNITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.RIVER), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPHENE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.HESSONITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TORMALINE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA_PLATEAU), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.HESSONITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_BEACH), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TOPAZ.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_PLAINS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.MOONSTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_SLOPES), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.ANDALUSITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPINEL.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.STONY_PEAKS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SMOKY_QUARTZ.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.STONY_SHORE), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.MALICHITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.GROVE), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.PERIDOT.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPINEL.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.TORMALINE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.PREHNITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_GRAVELLY_HILLS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.CHARCOAL.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.CITRINE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_SAVANNA), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.SPESSARITE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WOODED_BADLANDS), GenerationStep.Feature.UNDERGROUND_ORES, ModJewelPlacedFeatures.GARNET.getKey().get());
    }
}
