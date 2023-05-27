package net.romeosnowblitz.hmh2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.BlockView;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.*;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.*;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.ModItemGroup;

public class MagicBlocks {

    //Gem Generation (~48)
    public static final Block AMBER_ORE = resisterBlock("amber_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block ANDALUSITE_ORE = resisterBlock("andalusite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block AQUAMARINE_ORE = resisterBlock("aquamarine_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block CHARCOAL_ORE = resisterBlock("charcoal_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block CITRINE_ORE = resisterBlock("citrine_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DIOPSIDE_ORE = resisterBlock("diopside_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block GARNET_ORE = resisterBlock("garnet_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block HESSONITE_ORE = resisterBlock("hessonite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block MALICHITE_ORE = resisterBlock("malichite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block MOONSTONE_ORE = resisterBlock("moonstone_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block OPAL_ORE = resisterBlock("opal_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block PERIDOT_ORE = resisterBlock("peridot_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block PREHNITE_ORE = resisterBlock("prehnite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block RUBY_ORE = resisterBlock("ruby_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block SAPPHIRE_ORE = resisterBlock("sapphire_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block SMOKY_QUARTZ_ORE = resisterBlock("smoky_quartz_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block SPESSARITE_ORE = resisterBlock("spessarite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block SPHENE_ORE = resisterBlock("sphene_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block SPINEL_ORE = resisterBlock("spinel_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block TANZANITE_ORE = resisterBlock("tanzanite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block TOPAZ_ORE = resisterBlock("topaz_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block TORMALINE_ORE = resisterBlock("tormaline_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block TSAVORITE_ORE = resisterBlock("tsavorite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block ZIRCON_ORE = resisterBlock("zircon_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_AMBER_ORE = resisterBlock("deepslate_amber_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_ANDALUSITE_ORE = resisterBlock("deepslate_andalusite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_AQUAMARINE_ORE = resisterBlock("deepslate_aquamarine_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_CHARCOAL_ORE = resisterBlock("deepslate_charcoal_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_CITRINE_ORE = resisterBlock("deepslate_citrine_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_DIOPSIDE_ORE = resisterBlock("deepslate_diopside_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_GARNET_ORE = resisterBlock("deepslate_garnet_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_HESSONITE_ORE = resisterBlock("deepslate_hessonite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_MALICHITE_ORE = resisterBlock("deepslate_malichite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_MOONSTONE_ORE = resisterBlock("deepslate_moonstone_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_OPAL_ORE = resisterBlock("deepslate_opal_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_PERIDOT_ORE = resisterBlock("deepslate_peridot_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_PREHNITE_ORE = resisterBlock("deepslate_prehnite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_RUBY_ORE = resisterBlock("deepslate_ruby_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SAPPHIRE_ORE = resisterBlock("deepslate_sapphire_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SMOKY_QUARTZ_ORE = resisterBlock("deepslate_smoky_quartz_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SPESSARITE_ORE = resisterBlock("deepslate_spessarite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SPHENE_ORE = resisterBlock("deepslate_sphene_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SPINEL_ORE = resisterBlock("deepslate_spinel_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_TANZANITE_ORE = resisterBlock("deepslate_tanzanite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_TOPAZ_ORE = resisterBlock("deepslate_topaz_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_TORMALINE_ORE = resisterBlock("deepslate_tormaline_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_TSAVORITE_ORE = resisterBlock("deepslate_tsavorite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_ZIRCON_ORE = resisterBlock("deepslate_zircon_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);

    public static final Block AMBER_DUST = resisterBlock("amber_dust", new AmberDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block ANDALUSITE_DUST = resisterBlock("andalusite_dust", new AndalusiteDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block AQUAMARINE_DUST = resisterBlock("aquamarine_dust", new AquamarineDust(AbstractBlock.Settings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block CITRINE_DUST = resisterBlock("citrine_dust", new CitrineDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block DIOPSIDE_DUST = resisterBlock("diopside_dust", new DiopsideDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block GARNET_DUST = resisterBlock("garnet_dust", new GarnetDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block HESSONITE_DUST = resisterBlock("hessonite_dust", new HessoniteDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block MALICHITE_DUST = resisterBlock("malichite_dust", new MalichiteDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block MOONSTONE_DUST = resisterBlock("moonstone_dust", new MoonstoneDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block OPAL_DUST = resisterBlock("opal_dust", new OpalDust(AbstractBlock.Settings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block PERIDOT_DUST = resisterBlock("peridot_dust", new PeridotDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block PREHNITE_DUST = resisterBlock("prehnite_dust", new PreniteDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block RUBY_DUST = resisterBlock("ruby_dust", new RubyDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SAPPHIRE_DUST = resisterBlock("sapphire_dust", new SapphireDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SMOKY_QUARTZ_DUST = resisterBlock("smoky_quartz_dust", new SmokyQuartzDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SPESSARITE_DUST = resisterBlock("spessarite_dust", new SpessariteDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SPHENE_DUST = resisterBlock("sphene_dust", new SpheneDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SPINEL_DUST = resisterBlock("spinel_dust", new SpinelDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block TANZANITE_DUST = resisterBlock("tanzanite_dust", new TanzaniteDust(AbstractBlock.Settings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block TOPAZ_DUST = resisterBlock("topaz_dust", new TopazDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block TORMALINE_DUST = resisterBlock("tormaline_dust", new TormalineDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block TSAVORITE_DUST = resisterBlock("tsavorite_dust", new TsavoriteDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block ZIRCON_DUST = resisterBlock("zircon_dust", new ZirconDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block AMETHYST_DUST = resisterBlock("amethyst_dust", new AmethystDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block CHARCOAL_DUST = resisterBlock("charcoal_dust", new CharcoalDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block COAL_DUST = resisterBlock("coal_dust", new CoalDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block COPPER_DUST = resisterBlock("copper_dust", new CopperDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block DIAMOND_DUST = resisterBlock("diamond_dust", new DiamondDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block EMERALD_DUST = resisterBlock("emerald_dust", new EmeraldDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block FLINT_DUST = resisterBlock("flint_dust", new FlintDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block GOLD_DUST = resisterBlock("gold_dust", new GoldDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block IRON_DUST = resisterBlock("iron_dust", new IronDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block LAPIS_DUST = resisterBlock("lapis_dust", new LapisDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);

    public static final Block ABSORPTION_FLUID_BLOCK = registerBlockWithoutBlockItem("absorption_fluid_block", new AbsorptionFluidBlock(ModFluids.ABSORPTION_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block BAD_LUCK_FLUID_BLOCK = registerBlockWithoutBlockItem("bad_luck_fluid_block", new BadLuckFluidBlock(ModFluids.BAD_LUCK_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block BAD_OMEN_FLUID_BLOCK = registerBlockWithoutBlockItem("bad_omen_fluid_block", new BadOmenFluidBlock(ModFluids.BAD_OMEN_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block BLINDNESS_FLUID_BLOCK = registerBlockWithoutBlockItem("blindness_fluid_block", new BlindnessFluidBlock(ModFluids.BLINDNESS_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block CONDUIT_POWER_FLUID_BLOCK = registerBlockWithoutBlockItem("conduit_power_fluid_block", new ConduitPowerFluidBlock(ModFluids.CONDUIT_POWER_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block DARKNESS_FLUID_BLOCK = registerBlockWithoutBlockItem("darkness_fluid_block", new DarknessFluidBlock(ModFluids.DARKNESS_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block DOLPHINS_GRACE_FLUID_BLOCK = registerBlockWithoutBlockItem("dolphins_grace_fluid_block", new DolphinsGraceFluidBlock(ModFluids.DOLPHINS_GRACE_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block FIRE_IMMUNITY_FLUID_BLOCK = registerBlockWithoutBlockItem("fire_immunity_fluid_block", new FireImmunityFluidBlock(ModFluids.FIRE_IMMUNITY_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block GLOWING_FLUID_BLOCK = registerBlockWithoutBlockItem("glowing_fluid_block", new GlowingFluidBlock(ModFluids.GLOWING_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block HASTE_FLUID_BLOCK = registerBlockWithoutBlockItem("haste_fluid_block", new HasteFluidBlock(ModFluids.HASTE_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block HEALTH_BOOST_FLUID_BLOCK = registerBlockWithoutBlockItem("health_boost_fluid_block", new HealthBoostFluidBlock(ModFluids.HEALTH_BOOST_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block HUNGER_FLUID_BLOCK = registerBlockWithoutBlockItem("hunger_fluid_block", new HungerFluidBlock(ModFluids.HUNGER_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block INSTANT_DAMAGE_FLUID_BLOCK = registerBlockWithoutBlockItem("instant_damage_fluid_block", new InstantDamageFluidBlock(ModFluids.INSTANT_DAMAGE_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block INSTANT_HEALTH_FLUID_BLOCK = registerBlockWithoutBlockItem("instant_health_fluid_block", new InstantHealthFluidBlock(ModFluids.INSTANT_HEALTH_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block INVISIBILITY_FLUID_BLOCK = registerBlockWithoutBlockItem("invisibility_fluid_block", new InvisibilityFluidBlock(ModFluids.INVISIBILITY_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block JUMP_BOOST_FLUID_BLOCK = registerBlockWithoutBlockItem("jump_boost_fluid_block", new JumpBoostFluidBlock(ModFluids.JUMP_BOOST_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block LEVITATION_FLUID_BLOCK = registerBlockWithoutBlockItem("levitation_fluid_block", new LevitationFluidBlock(ModFluids.LEVITATION_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block LUCK_FLUID_BLOCK = registerBlockWithoutBlockItem("luck_fluid_block", new LuckFluidBlock(ModFluids.LUCK_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block MINING_FATIGUE_FLUID_BLOCK = registerBlockWithoutBlockItem("mining_fatigue_fluid_block", new MiningFatigueFluidBlock(ModFluids.MINING_FATIGUE_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block NAUSEA_FLUID_BLOCK = registerBlockWithoutBlockItem("nausea_fluid_block", new NauseaFluidBlock(ModFluids.NAUSEA_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block NIGHT_VISION_FLUID_BLOCK = registerBlockWithoutBlockItem("night_vision_fluid_block", new NightVisionFluidBlock(ModFluids.NIGHT_VISION_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block POISON_FLUID_BLOCK = registerBlockWithoutBlockItem("poison_fluid_block", new PoisonFluidBlock(ModFluids.POISON_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block REGENERATION_FLUID_BLOCK = registerBlockWithoutBlockItem("regeneration_fluid_block", new RegenerationFluidBlock(ModFluids.REGENERATION_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block RESISTANCE_FLUID_BLOCK = registerBlockWithoutBlockItem("resistance_fluid_block", new ResistanceFluidBlock(ModFluids.RESISTANCE_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block SATURATION_FLUID_BLOCK = registerBlockWithoutBlockItem("saturation_fluid_block", new SaturationFluidBlock(ModFluids.SATURATION_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block SLOW_FALLING_FLUID_BLOCK = registerBlockWithoutBlockItem("slow_falling_fluid_block", new SlowFallingFluidBlock(ModFluids.SLOW_FALLING_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block SLOWNESS_FLUID_BLOCK = registerBlockWithoutBlockItem("slowness_fluid_block", new SlownessFluidBlock(ModFluids.SLOWNESS_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block SPEED_FLUID_BLOCK = registerBlockWithoutBlockItem("speed_fluid_block", new SpeedFluidBlock(ModFluids.SPEED_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block STRENGTH_FLUID_BLOCK = registerBlockWithoutBlockItem("strength_fluid_block", new StrengthFluidBlock(ModFluids.STRENGTH_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block VILLAGE_HERO_FLUID_BLOCK = registerBlockWithoutBlockItem("village_hero_fluid_block", new VillageHeroFluidBlock(ModFluids.VILLAGE_HERO_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block WATER_BREATHING_FLUID_BLOCK = registerBlockWithoutBlockItem("water_breathing_fluid_block", new WaterBreathingFluidBlock(ModFluids.WATER_BREATHING_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block WEAKNESS_FLUID_BLOCK = registerBlockWithoutBlockItem("weakness_fluid_block", new WeaknessFluidBlock(ModFluids.WEAKNESS_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block WITHER_FLUID_BLOCK = registerBlockWithoutBlockItem("wither_fluid_block", new WitherFluidBlock(ModFluids.WITHER_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);


    private static Boolean always(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return true;
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registries.BLOCK, new Identifier(Hmh2.MOD_ID, name), block);
    }

    private static Block resisterBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Hmh2.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        Item item = Registry.register((Registries.ITEM), new Identifier(Hmh2.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlock() {
        Hmh2.LOGGER.info("Registering ModBlocks for " + Hmh2.MOD_ID);
    }
}
