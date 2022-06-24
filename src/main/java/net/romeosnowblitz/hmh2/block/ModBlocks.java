package net.romeosnowblitz.hmh2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.ColorDyedCarpetBlock;
import net.romeosnowblitz.hmh2.block.custom.ModFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.block.LavaSponge;
import net.romeosnowblitz.hmh2.block.custom.block.ModCobwebBlock;
import net.romeosnowblitz.hmh2.block.custom.blockentity.Backpack;
import net.romeosnowblitz.hmh2.block.custom.blockentity.CheesePressBlock;
import net.romeosnowblitz.hmh2.block.custom.blockentity.FreezerBlock;
import net.romeosnowblitz.hmh2.block.custom.blockentity.IceCreamMakerBlock;
import net.romeosnowblitz.hmh2.block.custom.farm.BlueberryBushBlock;
import net.romeosnowblitz.hmh2.block.custom.farm.CrimsonFarmlandBlock;
import net.romeosnowblitz.hmh2.block.custom.farm.MidasTouchBlock;
import net.romeosnowblitz.hmh2.block.custom.wire.magic_dust.AmberDust;
import net.romeosnowblitz.hmh2.block.custom.woodworks.*;
import net.romeosnowblitz.hmh2.block.entity.ModBellBlock;
import net.romeosnowblitz.hmh2.entity.ModSignTypes;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.ModItemGroup;
import net.romeosnowblitz.hmh2.item.custom.ModDyeColor;
import net.romeosnowblitz.hmh2.sounds.ModSounds;
import net.romeosnowblitz.hmh2.world.feature.tree.*;

public class ModBlocks {

    public static final Block AMBER_DUST = resisterBlock("amber_dust", new AmberDust(FabricBlockSettings.of(Material.DECORATION).breakInstantly()), ModItemGroup.ITEM);
    public static final Block MOD_BLOCK = resisterBlock("mod_block", new ModBellBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.ITEM);
    public static final Block BACKPACK = resisterBlock("backpack", new Backpack(FabricBlockSettings.of(Material.WOOL).strength(0.5f)), ModItemGroup.ITEM);

    //Obtained from Crafting (8)
    public static final Block ANDESITE_BRICKS = resisterBlock("andesite_bricks", new Block(FabricBlockSettings.of(Material.STONE)), ModItemGroup.ITEM);
    public static final Block BLOCK = resisterBlock("block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.ITEM);
    public static final Block BAMBOO_BLOCK = resisterBlock("bamboo_block", new Block(FabricBlockSettings.of(Material.WOOD).strength(0.5f)), ModItemGroup.ITEM);
    public static final Block DIORITE_BRICKS = resisterBlock("diorite_bricks", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block END_CRYSTAL_BLOCK = resisterBlock("end_crystal_block", new Block(FabricBlockSettings.of(Material.PLANT).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block GRANITE_BRICKS = resisterBlock("granite_bricks", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block LUCKY_ITEM = resisterBlock("lucky_item", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block LUCKY_BLOCK = resisterBlock("lucky_block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block QUICKSAND = resisterBlock("quicksand", new ModCobwebBlock(AbstractBlock.Settings.of(Material.WOOL).strength(0.25f).noCollision().dynamicBounds()), ModItemGroup.ITEM);
    public static final Block SNOW_BRICKS = resisterBlock("snow_bricks", new Block(AbstractBlock.Settings.of(Material.STONE).strength(0.5f).sounds(BlockSoundGroup.SNOW).requiresTool()), ModItemGroup.ITEM);

    //Crop Block
    public static final Block BLUEBERRY_BUSH = resisterBlock("blueberry_bush", new BlueberryBushBlock(AbstractBlock.Settings.of(Material.PLANT).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ModItemGroup.ITEM);
    public static final Block CRIMSON_FARMLAND = resisterBlock("crimson_farmland", new CrimsonFarmlandBlock(AbstractBlock.Settings.of(Material.SOIL).ticksRandomly().strength(0.6f).sounds(BlockSoundGroup.GRAVEL)), ModItemGroup.ITEM);
    public static final Block MIDAS_TOUCH = resisterBlock(("midas_touch"), new MidasTouchBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()), ModItemGroup.ITEM);

    //Flower Generation (1)
    public static final Block POISON_GRASS = resisterBlock("poison_grass", new WitherRoseBlock((StatusEffects.POISON), AbstractBlock.Settings.copy(Blocks.WITHER_ROSE).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).nonOpaque()), ModItemGroup.ITEM);

    public static final Block BLUE_SPIDER_LILY = resisterBlock("blue_spider_lily", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()), ModItemGroup.ITEM);
    public static final Block ULTRAMARINE_CARPET = resisterBlock("ultramarine_carpet", new ColorDyedCarpetBlock(ModDyeColor.ULTRAMARINE, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block ULTRAMARINE_WOOL = resisterBlock("ultramarine_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block ROSE = resisterBlock("rose", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()), ModItemGroup.ITEM);
    public static final Block ROSE_CARPET = resisterBlock("rose_carpet", new ColorDyedCarpetBlock(ModDyeColor.ROSE, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block ROSE_WOOL = resisterBlock("rose_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block WOLFSBANE = resisterBlock("wolfsbane", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()), ModItemGroup.ITEM);
    public static final Block VIOLET_CARPET = resisterBlock("violet_carpet", new ColorDyedCarpetBlock(ModDyeColor.VIOLET, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block VIOLET_WOOL = resisterBlock("violet_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block NEW_GREEN_CARPET = resisterBlock("new_green_carpet", new ColorDyedCarpetBlock(ModDyeColor.NEW_GREEN, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block NEW_GREEN_WOOL = resisterBlock("new_green_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block SPRING_GREEN_CARPET = resisterBlock("spring_green_carpet", new ColorDyedCarpetBlock(ModDyeColor.SPRING_GREEN, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block SPRING_GREEN_WOOL = resisterBlock("spring_green_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);


    //Ore Generation (7)
    public static final Block BEEF_ORE = resisterBlock("beef_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block CHICKEN_NUGGET_ORE = resisterBlock("chicken_nugget_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_SILVER_ORE = resisterBlock("deepslate_silver_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_TIN_ORE = resisterBlock("deepslate_tin_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block GRAPHITE_BLOCK = resisterBlock("graphite_block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block LIFE_ORE = resisterBlock("life_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool().sounds(ModSounds.ORE_SCREAM_SOUNDS)), ModItemGroup.ITEM);
    public static final Block LUCKY_ORE = resisterBlock("lucky_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block MARBLE = resisterBlock("marble", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block PUMICE = resisterBlock("pumice", new LavaSponge(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block HELLSTONE_BLOCK = resisterBlock("hellstone_block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block HOT_PUMICE = resisterBlock("hot_pumice", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block RAW_PLATINUM_BLOCK = resisterBlock("raw_platinum_block", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block QUAERITE = resisterBlock("quaerite", new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block RAW_BEEF_ORE = resisterBlock("raw_beef_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(0.2f).requiresTool()), ModItemGroup.ITEM);
    public static final Block RAW_CHICKEN_NUGGET_ORE = resisterBlock("raw_chicken_nugget_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(0.2f).requiresTool()), ModItemGroup.ITEM);
    public static final Block SALT_BLOCK = resisterBlock("salt_block", new FallingBlock(FabricBlockSettings.of(Material.STONE).strength(0.2f).requiresTool()), ModItemGroup.ITEM);
    public static final Block SILVER_ORE = resisterBlock("silver_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block TIN_ORE = resisterBlock("tin_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block RAW_TITANIUM_BLOCK = resisterBlock("raw_titanium_block", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.ITEM);

    //Gem Generation (~48)
    public static final Block AMBER_ORE = resisterBlock("amber_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block ANDALUSITE_ORE = resisterBlock("andalusite_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block AQUAMARINE_ORE = resisterBlock("aquamarine_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block CHARCOAL_ORE = resisterBlock("charcoal_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block CITRINE_ORE = resisterBlock("citrine_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DIOPSIDE_ORE = resisterBlock("diopside_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block GARNET_ORE = resisterBlock("garnet_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block HESSONITE_ORE = resisterBlock("hessonite_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block MALICHITE_ORE = resisterBlock("malichite_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block MOONSTONE_ORE = resisterBlock("moonstone_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block OPAL_ORE = resisterBlock("opal_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block PERIDOT_ORE = resisterBlock("peridot_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block PREHNITE_ORE = resisterBlock("prehnite_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block RUBY_ORE = resisterBlock("ruby_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block SAPPHIRE_ORE = resisterBlock("sapphire_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block SMOKY_QUARTZ_ORE = resisterBlock("smoky_quartz_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block SPESSARITE_ORE = resisterBlock("spessarite_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block SPHENE_ORE = resisterBlock("sphene_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block SPINEL_ORE = resisterBlock("spinel_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block TANZANITE_ORE = resisterBlock("tanzanite_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block TOPAZ_ORE = resisterBlock("topaz_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block TORMALINE_ORE = resisterBlock("tormaline_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block TSAVORITE_ORE = resisterBlock("tsavorite_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block ZIRCON_ORE = resisterBlock("zircon_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_AMBER_ORE = resisterBlock("deepslate_amber_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_ANDALUSITE_ORE = resisterBlock("deepslate_andalusite_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_AQUAMARINE_ORE = resisterBlock("deepslate_aquamarine_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_CHARCOAL_ORE = resisterBlock("deepslate_charcoal_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_CITRINE_ORE = resisterBlock("deepslate_citrine_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_DIOPSIDE_ORE = resisterBlock("deepslate_diopside_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_GARNET_ORE = resisterBlock("deepslate_garnet_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_HESSONITE_ORE = resisterBlock("deepslate_hessonite_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_MALICHITE_ORE = resisterBlock("deepslate_malichite_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_MOONSTONE_ORE = resisterBlock("deepslate_moonstone_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_OPAL_ORE = resisterBlock("deepslate_opal_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_PERIDOT_ORE = resisterBlock("deepslate_peridot_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_PREHNITE_ORE = resisterBlock("deepslate_prehnite_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_RUBY_ORE = resisterBlock("deepslate_ruby_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_SAPPHIRE_ORE = resisterBlock("deepslate_sapphire_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_SMOKY_QUARTZ_ORE = resisterBlock("deepslate_smoky_quartz_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_SPESSARITE_ORE = resisterBlock("deepslate_spessarite_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_SPHENE_ORE = resisterBlock("deepslate_sphene_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_SPINEL_ORE = resisterBlock("deepslate_spinel_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_TANZANITE_ORE = resisterBlock("deepslate_tanzanite_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_TOPAZ_ORE = resisterBlock("deepslate_topaz_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_TORMALINE_ORE = resisterBlock("deepslate_tormaline_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_TSAVORITE_ORE = resisterBlock("deepslate_tsavorite_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_ZIRCON_ORE = resisterBlock("deepslate_zircon_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.ITEM);

    //Trees (16)
    public static final Block BANANA_SAPLING = resisterBlock("banana_sapling", new ModSaplingBlock(new BananaSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.ITEM);
    public static final Block BANANA_LOG = resisterBlock("banana_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.ITEM);
    public static final Block BANANA_LEAVES = resisterBlock("banana_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.ITEM);
    public static final Block BANANA_PLANKS = resisterBlock("banana_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.ITEM);
    public static final Block BANANA_WOOD = resisterBlock("banana_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.ITEM);
    public static final Block STRIPPED_BANANA_LOG = resisterBlock("stripped_banana_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.ITEM);
    public static final Block STRIPPED_BANANA_WOOD = resisterBlock("stripped_banana_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.ITEM);
    public static final Block BANANA_SLAB = resisterBlock("banana_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block BANANA_STAIRS = resisterBlock("banana_stairs", new ModStairsBlock(ModBlocks.BANANA_LOG.getDefaultState(), FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block BANANA_DOOR = resisterBlock("banana_door", new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).nonOpaque()), ModItemGroup.ITEM);
    public static final Block BANANA_TRAPDOOR = resisterBlock("banana_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).nonOpaque()), ModItemGroup.ITEM);
    public static final Block BANANA_BUTTON = resisterBlock("banana_button", new ModStoneButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).noCollision()), ModItemGroup.ITEM);
    public static final Block BANANA_PRESSURE_PLATE = resisterBlock("banana_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block BANANA_FENCE = resisterBlock("banana_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block BANANA_FENCE_GATE = resisterBlock("banana_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block BANANA_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("banana_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.BANANA), ModItemGroup.ITEM);
    public static final Block BANANA_SIGN_BLOCK = registerBlockWithoutBlockItem("banana_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.BANANA), ModItemGroup.ITEM);

    public static final Block CHERRY_SAPLING = resisterBlock("cherry_sapling", new ModSaplingBlock(new CherrySaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.ITEM);
    public static final Block CHERRY_LOG = resisterBlock("cherry_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.ITEM);
    public static final Block CHERRY_LEAVES = resisterBlock("cherry_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.ITEM);
    public static final Block CHERRY_PLANKS = resisterBlock("cherry_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.ITEM);
    public static final Block CHERRY_WOOD = resisterBlock("cherry_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.ITEM);
    public static final Block STRIPPED_CHERRY_LOG = resisterBlock("stripped_cherry_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.ITEM);
    public static final Block STRIPPED_CHERRY_WOOD = resisterBlock("stripped_cherry_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.ITEM);
    public static final Block CHERRY_SLAB = resisterBlock("cherry_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block CHERRY_STAIRS = resisterBlock("cherry_stairs", new ModStairsBlock(ModBlocks.CHERRY_LOG.getDefaultState(), FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block CHERRY_DOOR = resisterBlock("cherry_door", new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).nonOpaque()), ModItemGroup.ITEM);
    public static final Block CHERRY_TRAPDOOR = resisterBlock("cherry_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).nonOpaque()), ModItemGroup.ITEM);
    public static final Block CHERRY_BUTTON = resisterBlock("cherry_button", new ModStoneButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).noCollision()), ModItemGroup.ITEM);
    public static final Block CHERRY_PRESSURE_PLATE = resisterBlock("cherry_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block CHERRY_FENCE = resisterBlock("cherry_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block CHERRY_FENCE_GATE = resisterBlock("cherry_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block CHERRY_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("cherry_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.CHERRY), ModItemGroup.ITEM);
    public static final Block CHERRY_SIGN_BLOCK = registerBlockWithoutBlockItem("cherry_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.CHERRY), ModItemGroup.ITEM);

    public static final Block JACARANDA_SAPLING = resisterBlock("jacaranda_sapling", new ModSaplingBlock(new JacarandaSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.ITEM);
    public static final Block JACARANDA_LOG = resisterBlock("jacaranda_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.ITEM);
    public static final Block JACARANDA_LEAVES = resisterBlock("jacaranda_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.ITEM);
    public static final Block JACARANDA_PLANKS = resisterBlock("jacaranda_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.ITEM);
    public static final Block JACARANDA_WOOD = resisterBlock("jacaranda_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.ITEM);
    public static final Block STRIPPED_JACARANDA_LOG = resisterBlock("stripped_jacaranda_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.ITEM);
    public static final Block STRIPPED_JACARANDA_WOOD = resisterBlock("stripped_jacaranda_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.ITEM);
    public static final Block JACARANDA_SLAB = resisterBlock("jacaranda_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block JACARANDA_STAIRS = resisterBlock("jacaranda_stairs", new ModStairsBlock(ModBlocks.JACARANDA_LOG.getDefaultState(), FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block JACARANDA_DOOR = resisterBlock("jacaranda_door", new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).nonOpaque()), ModItemGroup.ITEM);
    public static final Block JACARANDA_TRAPDOOR = resisterBlock("jacaranda_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).nonOpaque()), ModItemGroup.ITEM);
    public static final Block JACARANDA_BUTTON = resisterBlock("jacaranda_button", new ModStoneButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).noCollision()), ModItemGroup.ITEM);
    public static final Block JACARANDA_PRESSURE_PLATE = resisterBlock("jacaranda_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block JACARANDA_FENCE = resisterBlock("jacaranda_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block JACARANDA_FENCE_GATE = resisterBlock("jacaranda_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block JACARANDA_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("jacaranda_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.JACARANDA), ModItemGroup.ITEM);
    public static final Block JACARANDA_SIGN_BLOCK = registerBlockWithoutBlockItem("jacaranda_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.JACARANDA), ModItemGroup.ITEM);

    public static final Block MANGO_SAPLING = resisterBlock("mango_sapling", new ModSaplingBlock(new MangoSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.ITEM);
    public static final Block MANGO_LOG = resisterBlock("mango_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.ITEM);
    public static final Block MANGO_LEAVES = resisterBlock("mango_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.ITEM);
    public static final Block MANGO_PLANKS = resisterBlock("mango_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.ITEM);
    public static final Block MANGO_WOOD = resisterBlock("mango_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.ITEM);
    public static final Block STRIPPED_MANGO_LOG = resisterBlock("stripped_mango_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.ITEM);
    public static final Block STRIPPED_MANGO_WOOD = resisterBlock("stripped_mango_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.ITEM);
    public static final Block MANGO_SLAB = resisterBlock("mango_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block MANGO_STAIRS = resisterBlock("mango_stairs", new ModStairsBlock(ModBlocks.MANGO_LOG.getDefaultState(), FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block MANGO_DOOR = resisterBlock("mango_door", new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).nonOpaque()), ModItemGroup.ITEM);
    public static final Block MANGO_TRAPDOOR = resisterBlock("mango_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).nonOpaque()), ModItemGroup.ITEM);
    public static final Block MANGO_BUTTON = resisterBlock("mango_button", new ModStoneButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).noCollision()), ModItemGroup.ITEM);
    public static final Block MANGO_PRESSURE_PLATE = resisterBlock("mango_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block MANGO_FENCE = resisterBlock("mango_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block MANGO_FENCE_GATE = resisterBlock("mango_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block MANGO_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("mango_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.MANGO), ModItemGroup.ITEM);
    public static final Block MANGO_SIGN_BLOCK = registerBlockWithoutBlockItem("mango_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.MANGO), ModItemGroup.ITEM);

    public static final Block MAHOE_SAPLING = resisterBlock("mahoe_sapling", new ModSaplingBlock(new MahoeSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.ITEM);
    public static final Block MAHOE_LOG = resisterBlock("mahoe_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.ITEM);
    public static final Block MAHOE_LEAVES = resisterBlock("mahoe_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.ITEM);
    public static final Block MAHOE_PLANKS = resisterBlock("mahoe_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.ITEM);
    public static final Block MAHOE_WOOD = resisterBlock("mahoe_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.ITEM);
    public static final Block STRIPPED_MAHOE_LOG = resisterBlock("stripped_mahoe_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.ITEM);
    public static final Block STRIPPED_MAHOE_WOOD = resisterBlock("stripped_mahoe_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.ITEM);
    public static final Block MAHOE_SLAB = resisterBlock("mahoe_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block MAHOE_STAIRS = resisterBlock("mahoe_stairs", new ModStairsBlock(ModBlocks.MAHOE_LOG.getDefaultState(), FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block MAHOE_DOOR = resisterBlock("mahoe_door", new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).nonOpaque()), ModItemGroup.ITEM);
    public static final Block MAHOE_TRAPDOOR = resisterBlock("mahoe_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).nonOpaque()), ModItemGroup.ITEM);
    public static final Block MAHOE_BUTTON = resisterBlock("mahoe_button", new ModStoneButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).noCollision()), ModItemGroup.ITEM);
    public static final Block MAHOE_PRESSURE_PLATE = resisterBlock("mahoe_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block MAHOE_FENCE = resisterBlock("mahoe_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block MAHOE_FENCE_GATE = resisterBlock("mahoe_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block MAHOE_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("mahoe_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.MAHOE), ModItemGroup.ITEM);
    public static final Block MAHOE_SIGN_BLOCK = registerBlockWithoutBlockItem("mahoe_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.MAHOE), ModItemGroup.ITEM);

    public static final Block WILLOW_SAPLING = resisterBlock("willow_sapling", new ModSaplingBlock(new WillowSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.ITEM);
    public static final Block WILLOW_LOG = resisterBlock("willow_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.ITEM);
    public static final Block WILLOW_LEAVES = resisterBlock("willow_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.ITEM);
    public static final Block WILLOW_PLANKS = resisterBlock("willow_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.ITEM);
    public static final Block WILLOW_WOOD = resisterBlock("willow_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.ITEM);
    public static final Block STRIPPED_WILLOW_LOG = resisterBlock("stripped_willow_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.ITEM);
    public static final Block STRIPPED_WILLOW_WOOD = resisterBlock("stripped_willow_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.ITEM);
    public static final Block WILLOW_SLAB = resisterBlock("willow_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block WILLOW_STAIRS = resisterBlock("willow_stairs", new ModStairsBlock(ModBlocks.WILLOW_LOG.getDefaultState(), FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block WILLOW_DOOR = resisterBlock("willow_door", new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).nonOpaque()), ModItemGroup.ITEM);
    public static final Block WILLOW_TRAPDOOR = resisterBlock("willow_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).nonOpaque()), ModItemGroup.ITEM);
    public static final Block WILLOW_BUTTON = resisterBlock("willow_button", new ModStoneButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f).noCollision()), ModItemGroup.ITEM);
    public static final Block WILLOW_PRESSURE_PLATE = resisterBlock("willow_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block WILLOW_FENCE = resisterBlock("willow_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block WILLOW_FENCE_GATE = resisterBlock("willow_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block WILLOW_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("willow_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.WILLOW), ModItemGroup.ITEM);
    public static final Block WILLOW_SIGN_BLOCK = registerBlockWithoutBlockItem("willow_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.WILLOW), ModItemGroup.ITEM);

    public static final Block UNBREAKABLE_BLOCK = resisterBlock("unbreakable_block", new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f).dropsNothing()), ModItemGroup.ITEM);
    public static final Block UNBREAKABLE_LEAVES = resisterBlock("unbreakable_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).strength(-1.0f,3600000.0f).dropsNothing()), ModItemGroup.ITEM);

    //Block Entity
    public static final Block CHEESE_PRESS = resisterBlock("cheese_press", new CheesePressBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()), ModItemGroup.ITEM);
    public static final Block FREEZER = resisterBlock("freezer", new FreezerBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()), ModItemGroup.ITEM);
    public static final Block ICE_CREAM_MAKER = resisterBlock("ice_cream_maker", new IceCreamMakerBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()), ModItemGroup.ITEM);

    //Special Blocks (4)
    public static final Block CHOCOLATE_MILK_FLUID_BLOCK = registerBlockWithoutBlockItem("chocolate_milk_fluid_block", new ModFluidBlock(ModFluids.CHOCOLATE_MILK_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.ITEM);
    public static final Block HEATED_OIL_FLUID_BLOCK = registerBlockWithoutBlockItem("heated_oil_fluid_block", new ModFluidBlock(ModFluids.HEATED_OIL_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.ITEM);
    public static final Block OIL_FLUID_BLOCK = registerBlockWithoutBlockItem("oil_fluid_block", new ModFluidBlock(ModFluids.OIL_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.ITEM);

    public static final Block CHICKEN_BLOCK = resisterBlock("chicken_block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.ITEM);
    public static final Block CHICKEN_SLAB = resisterBlock("chicken_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.ITEM);
    public static final Block RAW_CHICKEN_BLOCK = resisterBlock("raw_chicken_block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.ITEM);
    public static final Block RAW_CHICKEN_SLAB = resisterBlock("raw_chicken_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.ITEM);

    public static final Block BEEF_BLOCK = resisterBlock("beef_block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.ITEM);
    public static final Block BEEF_SLAB = resisterBlock("beef_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.ITEM);
    public static final Block RAW_BEEF_BLOCK = resisterBlock("raw_beef_block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.ITEM);
    public static final Block RAW_BEEF_SLAB = resisterBlock("raw_beef_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.ITEM);

    private static Boolean always(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return true;
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(Hmh2.MOD_ID, name), block);
    }

    private static Block resisterBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Hmh2.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(Hmh2.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlock() {
        Hmh2.LOGGER.info("Registering ModBlocks for " + Hmh2.MOD_ID);
    }
}
