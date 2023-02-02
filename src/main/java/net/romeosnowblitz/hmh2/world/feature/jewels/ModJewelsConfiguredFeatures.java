package net.romeosnowblitz.hmh2.world.feature.jewels;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.MagicBlocks;
import net.romeosnowblitz.hmh2.world.feature.ModConfiguredFeatures;

import java.util.List;

public class ModJewelsConfiguredFeatures extends ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?,?>> AMBER_ORE_KEY = registerKey("amber_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> ANDALUSITE_ORE_KEY = registerKey("andalusite_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> AQUAMARINE_ORE_KEY = registerKey("aquamarine_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> CHARCOAL_ORE_KEY = registerKey("charcoal_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> CITRINE_ORE_KEY = registerKey("citrine_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> DIOPSIDE_ORE_KEY = registerKey("diopside_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> GARNET_ORE_KEY = registerKey("garnet_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> HESSONITE_ORE_KEY = registerKey("hessonite_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> MALICHITE_ORE_KEY = registerKey("malichite_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> MOONSTONE_ORE_KEY = registerKey("moonstone_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> OPAL_ORE_KEY = registerKey("opal_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> PERIDOT_ORE_KEY = registerKey("peridot_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> PREHNITE_ORE_KEY = registerKey("prehnite_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> SMOKY_QUARTZ_ORE_KEY = registerKey("smoky_quartz_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> SPESSARITE_ORE_KEY = registerKey("spessarite_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> SPHENE_ORE_KEY = registerKey("sphene_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> SPINEL_ORE_KEY = registerKey("spinel_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> TANZANITE_ORE_KEY = registerKey("tanzanite_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> TOPAZ_ORE_KEY = registerKey("topaz_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> TORMALINE_ORE_KEY = registerKey("tormaline_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> TSAVORITE_ORE_KEY = registerKey("tsavorite_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> ZIRCON_ORE_KEY = registerKey("zircon_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        var placedFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endstoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldAmberOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.AMBER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_AMBER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldAndalusiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.ANDALUSITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_ANDALUSITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldAquamarineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.AQUAMARINE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_AQUAMARINE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldCharcoalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.CHARCOAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_CHARCOAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldCitrineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.CITRINE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_CITRINE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDiopsideOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.DIOPSIDE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_DIOPSIDE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldGarnetOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.GARNET_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_GARNET_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldHessoniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.HESSONITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_HESSONITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldMalichiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.MALICHITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_MALICHITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldMoonstoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.MOONSTONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_MOONSTONE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldOpalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.OPAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_OPAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPeridotOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.PERIDOT_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_PERIDOT_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPrehniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.PREHNITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_PREHNITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSapphireOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.SAPPHIRE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSmokyQuartzOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.SMOKY_QUARTZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_SMOKY_QUARTZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSpessariteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.SPESSARITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_SPESSARITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSpheneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.SPHENE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_SPHENE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSpinelOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.SPINEL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_SPINEL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTanzaniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.TANZANITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_TANZANITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTopazOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.TOPAZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTormalineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.TORMALINE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_TORMALINE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTsavoriteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.TSAVORITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_TSAVORITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldZirconOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MagicBlocks.ZIRCON_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MagicBlocks.DEEPSLATE_ZIRCON_ORE.getDefaultState()));

        register(context, AMBER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAmberOres, 3));
        register(context, ANDALUSITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAndalusiteOres, 3));
        register(context, AQUAMARINE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAquamarineOres, 3));
        register(context, CHARCOAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCharcoalOres, 3));
        register(context, CITRINE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCitrineOres, 3));
        register(context, DIOPSIDE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDiopsideOres, 3));
        register(context, GARNET_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldGarnetOres, 3));
        register(context, HESSONITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldHessoniteOres, 3));
        register(context, MALICHITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMalichiteOres, 3));
        register(context, MOONSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMoonstoneOres, 3));
        register(context, OPAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOpalOres, 3));
        register(context, PERIDOT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPeridotOres, 3));
        register(context, PREHNITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPrehniteOres, 3));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 3));
        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 3));
        register(context, SMOKY_QUARTZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSmokyQuartzOres, 3));
        register(context, SPESSARITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSpessariteOres, 3));
        register(context, SPHENE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSpheneOres, 3));
        register(context, SPINEL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSpinelOres, 3));
        register(context, TANZANITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTanzaniteOres, 3));
        register(context, TOPAZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTopazOres, 3));
        register(context, TORMALINE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTormalineOres, 3));
        register(context, TSAVORITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTsavoriteOres, 3));
        register(context, ZIRCON_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldZirconOres, 3));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Hmh2.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
