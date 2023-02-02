package net.romeosnowblitz.hmh2.world.feature.jewels;

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
import net.romeosnowblitz.hmh2.world.feature.ModConfiguredFeatures;
import net.romeosnowblitz.hmh2.world.feature.ModOreFeatures;
import net.romeosnowblitz.hmh2.world.feature.ModPlacedFeatures;

import java.util.List;

import static net.romeosnowblitz.hmh2.world.feature.ModOreFeatures.modifiersWithCount;

public class ModJewelPlacedFeatures extends ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> AMBER_ORE_PLACED_KEY = registerKey("amber_ore_placed");
    public static final RegistryKey<PlacedFeature> ANDALUSITE_ORE_PLACED_KEY = registerKey("andalusite_ore_placed");
    public static final RegistryKey<PlacedFeature> AQUAMARINE_ORE_PLACED_KEY = registerKey("aquamarine_ore_placed");
    public static final RegistryKey<PlacedFeature> CHARCOAL_ORE_PLACED_KEY = registerKey("charcoal_ore_placed");
    public static final RegistryKey<PlacedFeature> CITRINE_ORE_PLACED_KEY = registerKey("citrine_ore_placed");
    public static final RegistryKey<PlacedFeature> DIOPSIDE_ORE_PLACED_KEY = registerKey("diopside_ore_placed");
    public static final RegistryKey<PlacedFeature> GARNET_ORE_PLACED_KEY = registerKey("garnet_ore_placed");
    public static final RegistryKey<PlacedFeature> HESSONITE_ORE_PLACED_KEY = registerKey("hessonite_ore_placed");
    public static final RegistryKey<PlacedFeature> MALICHITE_ORE_PLACED_KEY = registerKey("malichite_ore_placed");
    public static final RegistryKey<PlacedFeature> MOONSTONE_ORE_PLACED_KEY = registerKey("moonstone_ore_placed");
    public static final RegistryKey<PlacedFeature> OPAL_ORE_PLACED_KEY = registerKey("opal_ore_placed");
    public static final RegistryKey<PlacedFeature> PERIDOT_ORE_PLACED_KEY = registerKey("peridot_ore_placed");
    public static final RegistryKey<PlacedFeature> PREHNITE_ORE_PLACED_KEY = registerKey("prehnite_ore_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> SMOKY_QUARTZ_ORE_PLACED_KEY = registerKey("smoky_quartz_ore_placed");
    public static final RegistryKey<PlacedFeature> SPESSARITE_ORE_PLACED_KEY = registerKey("spessarite_ore_placed");
    public static final RegistryKey<PlacedFeature> SPHENE_ORE_PLACED_KEY = registerKey("sphene_ore_placed");
    public static final RegistryKey<PlacedFeature> SPINEL_ORE_PLACED_KEY = registerKey("spinel_ore_placed");
    public static final RegistryKey<PlacedFeature> TANZANITE_ORE_PLACED_KEY = registerKey("tanzanite_ore_placed");
    public static final RegistryKey<PlacedFeature> TOPAZ_ORE_PLACED_KEY = registerKey("topaz_ore_placed");
    public static final RegistryKey<PlacedFeature> TORMALINE_ORE_PLACED_KEY = registerKey("tormaline_ore_placed");
    public static final RegistryKey<PlacedFeature> TSAVORITE_ORE_PLACED_KEY = registerKey("tsavorite_ore_placed");
    public static final RegistryKey<PlacedFeature> ZIRCON_ORE_PLACED_KEY = registerKey("zircon_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, AMBER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.AMBER_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, ANDALUSITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.ANDALUSITE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, AQUAMARINE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.AQUAMARINE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, CHARCOAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.CHARCOAL_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, CITRINE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.CITRINE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, DIOPSIDE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.DIOPSIDE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, GARNET_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.GARNET_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, HESSONITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.HESSONITE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, MALICHITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.MALICHITE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, MOONSTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.MOONSTONE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, OPAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.OPAL_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, PERIDOT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.PERIDOT_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, PREHNITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.PREHNITE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.RUBY_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.SAPPHIRE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, SMOKY_QUARTZ_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.SMOKY_QUARTZ_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, SPESSARITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.SPESSARITE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, SPHENE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.SPHENE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, SPINEL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.SPINEL_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, TANZANITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.TANZANITE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, TOPAZ_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.TOPAZ_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, TORMALINE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.TORMALINE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, TSAVORITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.TSAVORITE_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
        register(context, ZIRCON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModJewelsConfiguredFeatures.ZIRCON_ORE_KEY), modifiersWithCount(64, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(128))));
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
