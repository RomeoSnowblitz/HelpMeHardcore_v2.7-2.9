package net.romeosnowblitz.hmh2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.BlockView;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.magic.MagicDust;
import net.romeosnowblitz.hmh2.block.custom.magic.MagicFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.WetMagicDust;
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
    public static final Block DEEPSLATE_AMBER_ORE = resisterBlock("deepslate_amber_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_ANDALUSITE_ORE = resisterBlock("deepslate_andalusite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_AQUAMARINE_ORE = resisterBlock("deepslate_aquamarine_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_CHARCOAL_ORE = resisterBlock("deepslate_charcoal_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_CITRINE_ORE = resisterBlock("deepslate_citrine_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_DIOPSIDE_ORE = resisterBlock("deepslate_diopside_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_GARNET_ORE = resisterBlock("deepslate_garnet_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_HESSONITE_ORE = resisterBlock("deepslate_hessonite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_MALICHITE_ORE = resisterBlock("deepslate_malichite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_MOONSTONE_ORE = resisterBlock("deepslate_moonstone_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_OPAL_ORE = resisterBlock("deepslate_opal_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_PERIDOT_ORE = resisterBlock("deepslate_peridot_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_PREHNITE_ORE = resisterBlock("deepslate_prehnite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_RUBY_ORE = resisterBlock("deepslate_ruby_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SAPPHIRE_ORE = resisterBlock("deepslate_sapphire_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SMOKY_QUARTZ_ORE = resisterBlock("deepslate_smoky_quartz_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SPESSARITE_ORE = resisterBlock("deepslate_spessarite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SPHENE_ORE = resisterBlock("deepslate_sphene_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SPINEL_ORE = resisterBlock("deepslate_spinel_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_TANZANITE_ORE = resisterBlock("deepslate_tanzanite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_TOPAZ_ORE = resisterBlock("deepslate_topaz_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_TORMALINE_ORE = resisterBlock("deepslate_tormaline_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_TSAVORITE_ORE = resisterBlock("deepslate_tsavorite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_ZIRCON_ORE = resisterBlock("deepslate_zircon_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);

    public static final Block AMBER_DUST = resisterBlock("amber_dust", new MagicDust(StatusEffects.FIRE_RESISTANCE, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block ANDALUSITE_DUST = resisterBlock("andalusite_dust", new MagicDust(StatusEffects.MINING_FATIGUE, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block AQUAMARINE_DUST = resisterBlock("aquamarine_dust", new WetMagicDust(StatusEffects.DOLPHINS_GRACE, AbstractBlock.Settings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block CITRINE_DUST = resisterBlock("citrine_dust", new MagicDust(StatusEffects.HEALTH_BOOST, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block DIOPSIDE_DUST = resisterBlock("diopside_dust", new MagicDust(StatusEffects.BAD_OMEN, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block GARNET_DUST = resisterBlock("garnet_dust", new MagicDust(StatusEffects.INSTANT_DAMAGE, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block HESSONITE_DUST = resisterBlock("hessonite_dust", new MagicDust(StatusEffects.STRENGTH, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block MALICHITE_DUST = resisterBlock("malichite_dust", new MagicDust(StatusEffects.HUNGER, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block MOONSTONE_DUST = resisterBlock("moonstone_dust", new MagicDust(StatusEffects.SLOWNESS, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block OPAL_DUST = resisterBlock("opal_dust", new WetMagicDust(StatusEffects.CONDUIT_POWER, AbstractBlock.Settings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block PERIDOT_DUST = resisterBlock("peridot_dust", new MagicDust(StatusEffects.JUMP_BOOST, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block PREHNITE_DUST = resisterBlock("prehnite_dust", new MagicDust(StatusEffects.POISON, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block RUBY_DUST = resisterBlock("ruby_dust", new MagicDust(StatusEffects.SATURATION, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SAPPHIRE_DUST = resisterBlock("sapphire_dust", new MagicDust(StatusEffects.NIGHT_VISION, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SMOKY_QUARTZ_DUST = resisterBlock("smoky_quartz_dust", new MagicDust(StatusEffects.WITHER, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SPESSARITE_DUST = resisterBlock("spessarite_dust", new MagicDust(StatusEffects.INSTANT_HEALTH, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SPHENE_DUST = resisterBlock("sphene_dust", new MagicDust(StatusEffects.LUCK, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SPINEL_DUST = resisterBlock("spinel_dust", new MagicDust(StatusEffects.RESISTANCE, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block TANZANITE_DUST = resisterBlock("tanzanite_dust", new WetMagicDust(StatusEffects.WATER_BREATHING, AbstractBlock.Settings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block TOPAZ_DUST = resisterBlock("topaz_dust", new MagicDust(StatusEffects.UNLUCK, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block TORMALINE_DUST = resisterBlock("tormaline_dust", new MagicDust(StatusEffects.REGENERATION, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block TSAVORITE_DUST = resisterBlock("tsavorite_dust", new MagicDust(StatusEffects.GLOWING, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block ZIRCON_DUST = resisterBlock("zircon_dust", new MagicDust(StatusEffects.SLOW_FALLING, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block AMETHYST_DUST = resisterBlock("amethyst_dust", new MagicDust(StatusEffects.NAUSEA, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block CHARCOAL_DUST = resisterBlock("charcoal_dust", new MagicDust(StatusEffects.WEAKNESS, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block COAL_DUST = resisterBlock("coal_dust", new MagicDust(StatusEffects.DARKNESS, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block COPPER_DUST = resisterBlock("copper_dust", new MagicDust(StatusEffects.LEVITATION, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block DIAMOND_DUST = resisterBlock("diamond_dust", new MagicDust(StatusEffects.SPEED, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block EMERALD_DUST = resisterBlock("emerald_dust", new MagicDust(StatusEffects.HERO_OF_THE_VILLAGE, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block FLINT_DUST = resisterBlock("flint_dust", new MagicDust(StatusEffects.BLINDNESS, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block GOLD_DUST = resisterBlock("gold_dust", new MagicDust(StatusEffects.HASTE, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block IRON_DUST = resisterBlock("iron_dust", new MagicDust(StatusEffects.INVISIBILITY, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block LAPIS_DUST = resisterBlock("lapis_dust", new MagicDust(StatusEffects.ABSORPTION, FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);

    public static final Block ABSORPTION_FLUID_BLOCK = registerBlockWithoutBlockItem("absorption_fluid_block", new MagicFluidBlock(StatusEffects.ABSORPTION, ModFluids.ABSORPTION_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block BAD_LUCK_FLUID_BLOCK = registerBlockWithoutBlockItem("bad_luck_fluid_block", new MagicFluidBlock(StatusEffects.UNLUCK, ModFluids.BAD_LUCK_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block BAD_OMEN_FLUID_BLOCK = registerBlockWithoutBlockItem("bad_omen_fluid_block", new MagicFluidBlock(StatusEffects.BAD_OMEN, ModFluids.BAD_OMEN_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block BLINDNESS_FLUID_BLOCK = registerBlockWithoutBlockItem("blindness_fluid_block", new MagicFluidBlock(StatusEffects.BLINDNESS, ModFluids.BLINDNESS_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block CONDUIT_POWER_FLUID_BLOCK = registerBlockWithoutBlockItem("conduit_power_fluid_block", new MagicFluidBlock(StatusEffects.CONDUIT_POWER, ModFluids.CONDUIT_POWER_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block DARKNESS_FLUID_BLOCK = registerBlockWithoutBlockItem("darkness_fluid_block", new MagicFluidBlock(StatusEffects.DARKNESS, ModFluids.DARKNESS_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block DOLPHINS_GRACE_FLUID_BLOCK = registerBlockWithoutBlockItem("dolphins_grace_fluid_block", new MagicFluidBlock(StatusEffects.DOLPHINS_GRACE, ModFluids.DOLPHINS_GRACE_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block FIRE_IMMUNITY_FLUID_BLOCK = registerBlockWithoutBlockItem("fire_immunity_fluid_block", new MagicFluidBlock(StatusEffects.FIRE_RESISTANCE, ModFluids.FIRE_IMMUNITY_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block GLOWING_FLUID_BLOCK = registerBlockWithoutBlockItem("glowing_fluid_block", new MagicFluidBlock(StatusEffects.GLOWING, ModFluids.GLOWING_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block HASTE_FLUID_BLOCK = registerBlockWithoutBlockItem("haste_fluid_block", new MagicFluidBlock(StatusEffects.HASTE, ModFluids.HASTE_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block HEALTH_BOOST_FLUID_BLOCK = registerBlockWithoutBlockItem("health_boost_fluid_block", new MagicFluidBlock(StatusEffects.HEALTH_BOOST, ModFluids.HEALTH_BOOST_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block HUNGER_FLUID_BLOCK = registerBlockWithoutBlockItem("hunger_fluid_block", new MagicFluidBlock(StatusEffects.HUNGER, ModFluids.HUNGER_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block INSTANT_DAMAGE_FLUID_BLOCK = registerBlockWithoutBlockItem("instant_damage_fluid_block", new MagicFluidBlock(StatusEffects.INSTANT_DAMAGE, ModFluids.INSTANT_DAMAGE_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block INSTANT_HEALTH_FLUID_BLOCK = registerBlockWithoutBlockItem("instant_health_fluid_block", new MagicFluidBlock(StatusEffects.INSTANT_HEALTH, ModFluids.INSTANT_HEALTH_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block INVISIBILITY_FLUID_BLOCK = registerBlockWithoutBlockItem("invisibility_fluid_block", new MagicFluidBlock(StatusEffects.INVISIBILITY, ModFluids.INVISIBILITY_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block JUMP_BOOST_FLUID_BLOCK = registerBlockWithoutBlockItem("jump_boost_fluid_block", new MagicFluidBlock(StatusEffects.JUMP_BOOST, ModFluids.JUMP_BOOST_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block LEVITATION_FLUID_BLOCK = registerBlockWithoutBlockItem("levitation_fluid_block", new MagicFluidBlock(StatusEffects.LEVITATION, ModFluids.LEVITATION_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block LUCK_FLUID_BLOCK = registerBlockWithoutBlockItem("luck_fluid_block", new MagicFluidBlock(StatusEffects.LUCK, ModFluids.LUCK_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block MINING_FATIGUE_FLUID_BLOCK = registerBlockWithoutBlockItem("mining_fatigue_fluid_block", new MagicFluidBlock(StatusEffects.MINING_FATIGUE, ModFluids.MINING_FATIGUE_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block NAUSEA_FLUID_BLOCK = registerBlockWithoutBlockItem("nausea_fluid_block", new MagicFluidBlock(StatusEffects.NAUSEA, ModFluids.NAUSEA_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block NIGHT_VISION_FLUID_BLOCK = registerBlockWithoutBlockItem("night_vision_fluid_block", new MagicFluidBlock(StatusEffects.NIGHT_VISION, ModFluids.NIGHT_VISION_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block POISON_FLUID_BLOCK = registerBlockWithoutBlockItem("poison_fluid_block", new MagicFluidBlock(StatusEffects.POISON, ModFluids.POISON_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block REGENERATION_FLUID_BLOCK = registerBlockWithoutBlockItem("regeneration_fluid_block", new MagicFluidBlock(StatusEffects.REGENERATION, ModFluids.REGENERATION_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block RESISTANCE_FLUID_BLOCK = registerBlockWithoutBlockItem("resistance_fluid_block", new MagicFluidBlock(StatusEffects.RESISTANCE, ModFluids.RESISTANCE_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block SATURATION_FLUID_BLOCK = registerBlockWithoutBlockItem("saturation_fluid_block", new MagicFluidBlock(StatusEffects.SATURATION, ModFluids.SATURATION_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block SLOW_FALLING_FLUID_BLOCK = registerBlockWithoutBlockItem("slow_falling_fluid_block", new MagicFluidBlock(StatusEffects.SLOW_FALLING, ModFluids.SLOW_FALLING_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block SLOWNESS_FLUID_BLOCK = registerBlockWithoutBlockItem("slowness_fluid_block", new MagicFluidBlock(StatusEffects.SLOWNESS, ModFluids.SLOWNESS_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block SPEED_FLUID_BLOCK = registerBlockWithoutBlockItem("speed_fluid_block", new MagicFluidBlock(StatusEffects.SPEED, ModFluids.SPEED_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block STRENGTH_FLUID_BLOCK = registerBlockWithoutBlockItem("strength_fluid_block", new MagicFluidBlock(StatusEffects.STRENGTH, ModFluids.STRENGTH_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block VILLAGE_HERO_FLUID_BLOCK = registerBlockWithoutBlockItem("village_hero_fluid_block", new MagicFluidBlock(StatusEffects.HERO_OF_THE_VILLAGE, ModFluids.VILLAGE_HERO_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block WATER_BREATHING_FLUID_BLOCK = registerBlockWithoutBlockItem("water_breathing_fluid_block", new MagicFluidBlock(StatusEffects.WATER_BREATHING, ModFluids.WATER_BREATHING_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block WEAKNESS_FLUID_BLOCK = registerBlockWithoutBlockItem("weakness_fluid_block", new MagicFluidBlock(StatusEffects.WEAKNESS, ModFluids.WEAKNESS_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final Block WITHER_FLUID_BLOCK = registerBlockWithoutBlockItem("wither_fluid_block", new MagicFluidBlock(StatusEffects.WITHER, ModFluids.WITHER_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);


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
