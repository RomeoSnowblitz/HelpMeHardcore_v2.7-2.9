package net.romeosnowblitz.hmh2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.SandSculk;
import net.romeosnowblitz.hmh2.block.custom.block.*;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonExtensionBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonHeadBlock;
import net.romeosnowblitz.hmh2.block.custom.blockentity.*;
import net.romeosnowblitz.hmh2.block.custom.farm.*;
import net.romeosnowblitz.hmh2.block.custom.summon.BeeInfestedBlock;
import net.romeosnowblitz.hmh2.block.custom.summon.QueenBeeSummonBlock;
import net.romeosnowblitz.hmh2.block.custom.test.XRay;
import net.romeosnowblitz.hmh2.block.custom.woodworks.*;
import net.romeosnowblitz.hmh2.block.entity.ModBellBlock;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.ModItemGroup;
import net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor;

import static net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor.*;

public class ModBlocks {

    //New Blocks
    public static final Block MOD_COMPOSTER = resisterBlock("mod_composter", new ModComposterBlock(AbstractBlock.Settings.of(Material.WOOD).strength(0.6F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.MOD);
    public static final Block SAND_SCULK = resisterBlock("sand_sculk", new SandSculk(AbstractBlock.Settings.of(Material.SCULK).strength(1.0f)), ModItemGroup.MOD);

    public static final Block PEAT = resisterBlock("peat", new Block(AbstractBlock.Settings.of(Material.SOIL).strength(1.0f)), ModItemGroup.MOD);
    public static final Block NETHER_PRISMARINE = resisterBlock("nether_prismarine", new CustomLightBlock(AbstractBlock.Settings.of(Material.STONE).strength(0.5f).luminance(state -> 7)), ModItemGroup.MOD);
    public static final Block HELLSTONE_BRICKS = resisterBlock("hellstone_bricks", new Block(AbstractBlock.Settings.of(Material.STONE).strength(0.5f)), ModItemGroup.MOD);
    public static final Block GLUEY_PISTON = resisterBlock("gluey_piston", ModBlocks.createPistonBlock(true), ModItemGroup.MOD);
    public static final Block ICED_BUCKET = resisterBlock("iced_bucket", new Block(AbstractBlock.Settings.of(Material.ICE).nonOpaque().strength(1.0f).sounds(BlockSoundGroup.GLASS)), ModItemGroup.MOD);


    //Obtained from Crafting (8)
    public static final Block ANDESITE_BRICKS = resisterBlock("andesite_bricks", new Block(FabricBlockSettings.of(Material.STONE)), ModItemGroup.MOD);
    public static final Block BLOCK = resisterBlock("block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.MOD);
    public static final Block CORK_BLOCK = resisterBlock("cork_block", new Block(FabricBlockSettings.of(Material.SPONGE).strength(1.0f)), ModItemGroup.MOD);
    public static final Block BAMBOO_BLOCK = resisterBlock("bamboo_block", new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(0.5f)), ModItemGroup.MOD);
    public static final Block DIORITE_BRICKS = resisterBlock("diorite_bricks", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block END_CRYSTAL_BLOCK = resisterBlock("end_crystal_block", new Block(FabricBlockSettings.of(Material.PLANT).strength(1.0f)), ModItemGroup.MOD);
    public static final Block GRANITE_BRICKS = resisterBlock("granite_bricks", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block LUCKY_ITEM = resisterBlock("lucky_item", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block LUCKY_BLOCK = resisterBlock("lucky_block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block QUICKSAND = resisterBlock("quicksand", new ModCobwebBlock(AbstractBlock.Settings.of(Material.WOOL).strength(0.25f).suffocates(ModBlocks::always).noCollision()), ModItemGroup.TESTING);
    public static final Block SNOW_BRICKS = resisterBlock("snow_bricks", new Block(AbstractBlock.Settings.of(Material.STONE).strength(0.5f).sounds(BlockSoundGroup.SNOW).requiresTool()), ModItemGroup.MOD);

    //Crop Block
    public static final Block BLUEBERRY_BUSH = resisterBlock("blueberry_bush", new BlueberryBushBlock(AbstractBlock.Settings.of(Material.PLANT).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ModItemGroup.TESTING);
    public static final Block STRAWBERRY_BUSH = resisterBlock("strawberry_bush", new StrawberryBushBlock(AbstractBlock.Settings.of(Material.PLANT).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ModItemGroup.TESTING);
    public static final Block CRIMSON_FARMLAND = resisterBlock("crimson_farmland", new CrimsonFarmlandBlock(AbstractBlock.Settings.of(Material.SOIL).ticksRandomly().strength(0.6f).sounds(BlockSoundGroup.GRAVEL)), ModItemGroup.MOD);
    public static final Block MIDAS_TOUCH = resisterBlock(("midas_touch"), new MidasTouchBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()), ModItemGroup.TESTING);
    public static final Block WARPED_FARMLAND = resisterBlock("warped_farmland", new WarpedFarmlandBlock(AbstractBlock.Settings.of(Material.SOIL).ticksRandomly().strength(0.6f).sounds(BlockSoundGroup.GRAVEL)), ModItemGroup.MOD);

    //Flower Generation / Color Category
    public static final Block POISON_GRASS = resisterBlock("poison_grass", new PoisonGrass((StatusEffects.POISON), AbstractBlock.Settings.copy(Blocks.WITHER_ROSE).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).nonOpaque()), ModItemGroup.MOD);

    public static final Block BLUE_SPIDER_LILY = resisterBlock("blue_spider_lily", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()), ModItemGroup.MOD);
    public static final Block ULTRAMARINE_CANDLE = resisterBlock("ultramarine_candle", new CandleBlock(AbstractBlock.Settings.of(Material.DECORATION, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL).luminance(CandleBlock.STATE_TO_LUMINANCE)), ModItemGroup.MOD);
    public static final Block ULTRAMARINE_CARPET = resisterBlock("ultramarine_carpet", new ColorDyedCarpetBlock(ULTRAMARINE, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.MOD);
    public static final Block ULTRAMARINE_CONCRETE = resisterBlock("ultramarine_concrete", new Block(AbstractBlock.Settings.of(Material.AGGREGATE).requiresTool().strength(1.8f)), ModItemGroup.MOD);
    public static final Block ULTRAMARINE_CONCRETE_POWDER = resisterBlock("ultramarine_concrete_powder", new ConcretePowderBlock(ULTRAMARINE_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE, MapColor.WHITE).strength(0.5f).sounds(BlockSoundGroup.SAND)), ModItemGroup.MOD);
    public static final Block ULTRAMARINE_GLAZED_TERRACOTTA = resisterBlock("ultramarine_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block ULTRAMARINE_STAINED_GLASS = resisterBlock ("ultramarine_stained_glass", new GlassBlock(FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(BlockSoundGroup.GLASS)), ModItemGroup.MOD);
    public static final Block ULTRAMARINE_STAINED_GLASS_PANE = resisterBlock ("ultramarine_stained_glass_pane", new ModStainedGlassPane(ULTRAMARINE, FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(BlockSoundGroup.GLASS)), ModItemGroup.MOD);
    public static final Block ULTRAMARINE_TERRACOTTA = resisterBlock("ultramarine_terracotta", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block ULTRAMARINE_WOOL = resisterBlock("ultramarine_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.MOD);
    public static final Block ROSE = resisterBlock("rose", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()), ModItemGroup.MOD);
    public static final Block ROSE_CANDLE = resisterBlock("rose_candle", new CandleBlock(AbstractBlock.Settings.of(Material.DECORATION, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL).luminance(CandleBlock.STATE_TO_LUMINANCE)), ModItemGroup.MOD);
    public static final Block ROSE_CARPET = resisterBlock("rose_carpet", new ColorDyedCarpetBlock(ModDyeColor.ROSE, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.MOD);
    public static final Block ROSE_CONCRETE = resisterBlock("rose_concrete", new Block(AbstractBlock.Settings.of(Material.AGGREGATE).requiresTool().strength(1.8f)), ModItemGroup.MOD);
    public static final Block ROSE_CONCRETE_POWDER = resisterBlock("rose_concrete_powder", new ConcretePowderBlock(ROSE_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE, MapColor.WHITE).strength(0.5f).sounds(BlockSoundGroup.SAND)), ModItemGroup.MOD);
    public static final Block ROSE_GLAZED_TERRACOTTA = resisterBlock("rose_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block ROSE_STAINED_GLASS = resisterBlock ("rose_stained_glass", new GlassBlock(FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(BlockSoundGroup.GLASS)), ModItemGroup.MOD);
    public static final Block ROSE_STAINED_GLASS_PANE = resisterBlock ("rose_stained_glass_pane", new ModStainedGlassPane(ModDyeColor.ROSE, FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(BlockSoundGroup.GLASS)), ModItemGroup.MOD);
    public static final Block ROSE_TERRACOTTA = resisterBlock("rose_terracotta", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block ROSE_WOOL = resisterBlock("rose_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.MOD);
    public static final Block WOLFSBANE = resisterBlock("wolfsbane", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()), ModItemGroup.MOD);
    public static final Block VIOLET_CANDLE = resisterBlock("violet_candle", new CandleBlock(AbstractBlock.Settings.of(Material.DECORATION, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL).luminance(CandleBlock.STATE_TO_LUMINANCE)), ModItemGroup.MOD);
    public static final Block VIOLET_CARPET = resisterBlock("violet_carpet", new ColorDyedCarpetBlock(ModDyeColor.VIOLET, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.MOD);
    public static final Block VIOLET_CONCRETE = resisterBlock("violet_concrete", new Block(AbstractBlock.Settings.of(Material.AGGREGATE).requiresTool().strength(1.8f)), ModItemGroup.MOD);
    public static final Block VIOLET_CONCRETE_POWDER = resisterBlock("violet_concrete_powder", new ConcretePowderBlock(VIOLET_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE, MapColor.WHITE).strength(0.5f).sounds(BlockSoundGroup.SAND)), ModItemGroup.MOD);
    public static final Block VIOLET_GLAZED_TERRACOTTA = resisterBlock("violet_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block VIOLET_STAINED_GLASS = resisterBlock ("violet_stained_glass", new GlassBlock(FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(BlockSoundGroup.GLASS)), ModItemGroup.MOD);
    public static final Block VIOLET_STAINED_GLASS_PANE = resisterBlock ("violet_stained_glass_pane", new ModStainedGlassPane(ModDyeColor.VIOLET, FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(BlockSoundGroup.GLASS)), ModItemGroup.MOD);
    public static final Block VIOLET_TERRACOTTA = resisterBlock("violet_terracotta", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block VIOLET_WOOL = resisterBlock("violet_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.MOD);
    public static final Block NEW_GREEN_CANDLE = resisterBlock("new_green_candle", new CandleBlock(AbstractBlock.Settings.of(Material.DECORATION, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL).luminance(CandleBlock.STATE_TO_LUMINANCE)), ModItemGroup.MOD);
    public static final Block NEW_GREEN_CARPET = resisterBlock("new_green_carpet", new ColorDyedCarpetBlock(NEW_GREEN, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.MOD);
    public static final Block NEW_GREEN_CONCRETE = resisterBlock("new_green_concrete", new Block(AbstractBlock.Settings.of(Material.AGGREGATE).requiresTool().strength(1.8f)), ModItemGroup.MOD);
    public static final Block NEW_GREEN_CONCRETE_POWDER = resisterBlock("new_green_concrete_powder", new ConcretePowderBlock(NEW_GREEN_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE, MapColor.WHITE).strength(0.5f).sounds(BlockSoundGroup.SAND)), ModItemGroup.MOD);
    public static final Block NEW_GREEN_GLAZED_TERRACOTTA = resisterBlock("new_green_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block NEW_GREEN_STAINED_GLASS = resisterBlock ("new_green_stained_glass", new GlassBlock(FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(BlockSoundGroup.GLASS)), ModItemGroup.MOD);
    public static final Block NEW_GREEN_STAINED_GLASS_PANE = resisterBlock ("new_green_stained_glass_pane", new ModStainedGlassPane(NEW_GREEN, FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(BlockSoundGroup.GLASS)), ModItemGroup.MOD);
    public static final Block NEW_GREEN_TERRACOTTA = resisterBlock("new_green_terracotta", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block NEW_GREEN_WOOL = resisterBlock("new_green_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.MOD);
    public static final Block SPRING_GREEN_CANDLE = resisterBlock("spring_green_candle", new CandleBlock(AbstractBlock.Settings.of(Material.DECORATION, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL).luminance(CandleBlock.STATE_TO_LUMINANCE)), ModItemGroup.MOD);
    public static final Block SPRING_GREEN_CARPET = resisterBlock("spring_green_carpet", new ColorDyedCarpetBlock(SPRING_GREEN, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.MOD);
    public static final Block SPRING_GREEN_CONCRETE = resisterBlock("spring_green_concrete", new Block(AbstractBlock.Settings.of(Material.AGGREGATE).requiresTool().strength(1.8f)), ModItemGroup.MOD);
    public static final Block SPRING_GREEN_CONCRETE_POWDER = resisterBlock("spring_green_concrete_powder", new ConcretePowderBlock(SPRING_GREEN_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE, MapColor.WHITE).strength(0.5f).sounds(BlockSoundGroup.SAND)), ModItemGroup.MOD);
    public static final Block SPRING_GREEN_GLAZED_TERRACOTTA = resisterBlock("spring_green_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block SPRING_GREEN_STAINED_GLASS = resisterBlock ("spring_green_stained_glass", new GlassBlock(FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(BlockSoundGroup.GLASS)), ModItemGroup.MOD);
    public static final Block SPRING_GREEN_STAINED_GLASS_PANE = resisterBlock ("spring_green_stained_glass_pane", new ModStainedGlassPane(SPRING_GREEN, FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(BlockSoundGroup.GLASS)), ModItemGroup.MOD);
    public static final Block SPRING_GREEN_TERRACOTTA = resisterBlock("spring_green_terracotta", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block SPRING_GREEN_WOOL = resisterBlock("spring_green_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.MOD);

    //Stones
    public static final Block DIABASE = resisterBlock("diabase", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block PUMICE = resisterBlock("pumice", new LavaSponge(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block HOT_PUMICE = resisterBlock("hot_pumice", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block LIMESTONE = resisterBlock("limestone", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block SALT_BLOCK = resisterBlock("salt_block", new FallingBlock(FabricBlockSettings.of(Material.STONE).strength(0.2f).requiresTool()), ModItemGroup.MOD);
    public static final Block SHALE = resisterBlock("shale", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);

    public static final Block MARBLE = resisterBlock("marble", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block MARBLE_STAIRS = resisterBlock("marble_stairs", new ModStairsBlock(ModBlocks.MARBLE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.0f)), ModItemGroup.MOD);
    public static final Block MARBLE_SLAB = resisterBlock("marble_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.0f)), ModItemGroup.MOD);
    public static final Block MARBLE_WALL = resisterBlock("marble_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block CHISELED_MARBLE_BRICKS = resisterBlock("chiseled_marble_bricks", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block MARBLE_BRICKS = resisterBlock("marble_bricks", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final Block MARBLE_BRICK_STAIRS = resisterBlock("marble_brick_stairs", new ModStairsBlock(ModBlocks.MARBLE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.0f)), ModItemGroup.MOD);
    public static final Block MARBLE_BRICK_SLAB = resisterBlock("marble_brick_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.0f)), ModItemGroup.MOD);
    public static final Block MARBLE_BRICK_WALL = resisterBlock("marble_brick_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.MOD);


    //Ore Generation (7)
    public static final Block BEEF_ORE = resisterBlock("beef_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final Block CHICKEN_NUGGET_ORE = resisterBlock("chicken_nugget_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final Block DEEPSLATE_SILVER_ORE = resisterBlock("deepslate_silver_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.MOD);
    public static final Block DEEPSLATE_TIN_ORE = resisterBlock("deepslate_tin_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.MOD);
    public static final Block GRAPHITE_BLOCK = resisterBlock("graphite_block", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final Block LIFE_ORE = resisterBlock("life_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final Block LUCKY_ORE = resisterBlock("lucky_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final Block HELLSTONE_BLOCK = resisterBlock("hellstone_block", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final Block RAW_PLATINUM_BLOCK = resisterBlock("raw_platinum_block", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.MOD);
    public static final Block QUAERITE = resisterBlock("quaerite", new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.MOD);
    public static final Block RAW_BEEF_ORE = resisterBlock("raw_beef_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final Block RAW_CHICKEN_NUGGET_ORE = resisterBlock("raw_chicken_nugget_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final Block SILVER_ORE = resisterBlock("silver_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.MOD);
    public static final Block TIN_ORE = resisterBlock("tin_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.MOD);
    public static final Block RAW_TITANIUM_BLOCK = resisterBlock("raw_titanium_block", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.MOD);

    //Block Entity
    public static final Block CHEESE_PRESS = resisterBlock("cheese_press", new CheesePressBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()), ModItemGroup.MOD);
    public static final Block FREEZER = resisterBlock("freezer", new FreezerBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).nonOpaque()), ModItemGroup.MOD);

    //Special Blocks (4)
    public static final Block CHOCOLATE_MILK_FLUID_BLOCK = registerBlockWithoutBlockItem("chocolate_milk_fluid_block", new ModFluidBlock(ModFluids.CHOCOLATE_MILK_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MOD);
    public static final Block HEATED_OIL_FLUID_BLOCK = registerBlockWithoutBlockItem("heated_oil_fluid_block", new ModFluidBlock(ModFluids.HEATED_OIL_STILL, FabricBlockSettings.of(Material.WATER).ticksRandomly().noCollision().nonOpaque().dropsNothing()), ModItemGroup.MOD);
    public static final Block HONEY_FLUID_BLOCK = registerBlockWithoutBlockItem("honey_fluid_block", new ModFluidBlock(ModFluids.HONEY_FLOWING, FabricBlockSettings.of(Material.WATER).ticksRandomly().noCollision().nonOpaque().dropsNothing()), ModItemGroup.MOD);
    public static final Block OIL_FLUID_BLOCK = registerBlockWithoutBlockItem("oil_fluid_block", new ModFluidBlock(ModFluids.OIL_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MOD);

    public static final Block CHICKEN_BLOCK = resisterBlock("chicken_block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.MOD);
    public static final Block CHICKEN_SLAB = resisterBlock("chicken_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.MOD);
    public static final Block RAW_CHICKEN_BLOCK = resisterBlock("raw_chicken_block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.MOD);
    public static final Block RAW_CHICKEN_SLAB = resisterBlock("raw_chicken_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.MOD);

    public static final Block BEEF_BLOCK = resisterBlock("beef_block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.MOD);
    public static final Block BEEF_SLAB = resisterBlock("beef_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.MOD);
    public static final Block RAW_BEEF_BLOCK = resisterBlock("raw_beef_block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.MOD);
    public static final Block RAW_BEEF_SLAB = resisterBlock("raw_beef_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.MOD);

    public static final Block INFESTED_HONEYCOMB_BLOCK = resisterBlock("infested_honeycomb_block", new BeeInfestedBlock(Blocks.HONEYCOMB_BLOCK, FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(0.5f)), ModItemGroup.MOD);
    public static final Block HONEY_HIVE = resisterBlock("honey_hive", new QueenBeeSummonBlock(AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT).strength(0.5f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.MOD);
    public static final Block ROYAL_JELLY = resisterBlock ("royal_jelly", new HoneyBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).nonOpaque().strength(2.0f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(BlockSoundGroup.HONEY)), ModItemGroup.MOD);
    public static final Block XRAY = resisterBlock("xray", new XRay(FabricBlockSettings.of(Material.DECORATION).breakInstantly()), ModItemGroup.MOD);

    //Buggy Blocks
    public static final Block MOD_BLOCK = resisterBlock("mod_block", new ModBellBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.TESTING);
    public static final Block BACKPACK = resisterBlock("backpack", new Backpack(FabricBlockSettings.of(Material.WOOL).strength(0.5f)), ModItemGroup.TESTING);

    public static final Block MOD_PISTON_HEAD = resisterBlock("mod_piston_head", new ModPistonHeadBlock(AbstractBlock.Settings.of(Material.PISTON).strength(1.5f).dropsNothing()), ModItemGroup.TESTING);
    public static final Block MOD_MOVING_PISTON = resisterBlock("mod_moving_piston", new ModPistonExtensionBlock(AbstractBlock.Settings.of(Material.PISTON).strength(-1.0f).dynamicBounds().dropsNothing().nonOpaque().solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)), ModItemGroup.TESTING);

    private static Boolean always(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return true;
    }

    private static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registries.BLOCK, new Identifier(Hmh2.MOD_ID, name), block);
    }

    private static ShulkerBoxBlock createShulkerBoxBlock(DyeColor color, AbstractBlock.Settings settings) {
        AbstractBlock.ContextPredicate contextPredicate = (state, world, pos) -> {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (!(blockEntity instanceof ShulkerBoxBlockEntity)) {
                return true;
            }
            ShulkerBoxBlockEntity shulkerBoxBlockEntity = (ShulkerBoxBlockEntity)blockEntity;
            return shulkerBoxBlockEntity.suffocates();
        };
        return new ShulkerBoxBlock(color, settings.strength(2.0f).dynamicBounds().nonOpaque().suffocates(contextPredicate).blockVision(contextPredicate));
    }

    private static ModPistonBlock createPistonBlock(boolean gluey) {
        AbstractBlock.ContextPredicate contextPredicate = (state, world, pos) -> state.get(ModPistonBlock.EXTENDED) == false;
        return new ModPistonBlock(gluey, AbstractBlock.Settings.of(Material.PISTON).strength(1.5f).suffocates(contextPredicate).blockVision(contextPredicate));
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
