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
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.block.*;
import net.romeosnowblitz.hmh2.block.custom.blockentity.*;
import net.romeosnowblitz.hmh2.block.custom.farm.BlueberryBushBlock;
import net.romeosnowblitz.hmh2.block.custom.farm.CrimsonFarmlandBlock;
import net.romeosnowblitz.hmh2.block.custom.farm.MidasTouchBlock;
import net.romeosnowblitz.hmh2.block.custom.farm.StrawberryBushBlock;
import net.romeosnowblitz.hmh2.block.custom.test.XRay;
import net.romeosnowblitz.hmh2.block.custom.woodworks.*;
import net.romeosnowblitz.hmh2.block.entity.ModBellBlock;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.ModItemGroup;
import net.romeosnowblitz.hmh2.item.custom.ModDyeColor;
import net.romeosnowblitz.hmh2.sounds.ModSounds;

import static net.romeosnowblitz.hmh2.item.custom.ModDyeColor.*;

public class ModBlocks {

    public static final Block MOD_BLOCK = resisterBlock("mod_block", new ModBellBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.ITEM);
    public static final Block BACKPACK = resisterBlock("backpack", new Backpack(FabricBlockSettings.of(Material.WOOL).strength(0.5f)), ModItemGroup.ITEM);

    //Obtained from Crafting (8)
    public static final Block ANDESITE_BRICKS = resisterBlock("andesite_bricks", new Block(FabricBlockSettings.of(Material.STONE)), ModItemGroup.ITEM);
    public static final Block BLOCK = resisterBlock("block", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f)), ModItemGroup.ITEM);
    public static final Block CORK_BLOCK = resisterBlock("cork_block", new Block(FabricBlockSettings.of(Material.SPONGE).strength(1.0f)), ModItemGroup.ITEM);
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
    public static final Block STRAWBERRY_BUSH = resisterBlock("strawberry_bush", new StrawberryBushBlock(AbstractBlock.Settings.of(Material.PLANT).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ModItemGroup.ITEM);
    public static final Block CRIMSON_FARMLAND = resisterBlock("crimson_farmland", new CrimsonFarmlandBlock(AbstractBlock.Settings.of(Material.SOIL).ticksRandomly().strength(0.6f).sounds(BlockSoundGroup.GRAVEL)), ModItemGroup.ITEM);
    public static final Block MIDAS_TOUCH = resisterBlock(("midas_touch"), new MidasTouchBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()), ModItemGroup.ITEM);

    //Flower Generation / Color Category
    public static final Block POISON_GRASS = resisterBlock("poison_grass", new PoisonGrass((StatusEffects.POISON), AbstractBlock.Settings.copy(Blocks.WITHER_ROSE).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).nonOpaque()), ModItemGroup.ITEM);

    public static final Block BLUE_SPIDER_LILY = resisterBlock("blue_spider_lily", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()), ModItemGroup.ITEM);
    public static final Block ULTRAMARINE_CANDLE = resisterBlock("ultramarine_candle", new CandleBlock(AbstractBlock.Settings.of(Material.DECORATION, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL).luminance(CandleBlock.STATE_TO_LUMINANCE)), ModItemGroup.ITEM);
    public static final Block ULTRAMARINE_CARPET = resisterBlock("ultramarine_carpet", new ColorDyedCarpetBlock(ULTRAMARINE, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block ULTRAMARINE_CONCRETE = resisterBlock("ultramarine_concrete", new Block(AbstractBlock.Settings.of(Material.AGGREGATE).requiresTool().strength(1.8f)), ModItemGroup.ITEM);
    public static final Block ULTRAMARINE_CONCRETE_POWDER = resisterBlock("ultramarine_concrete_powder", new ConcretePowderBlock(ULTRAMARINE_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE, MapColor.WHITE).strength(0.5f).sounds(BlockSoundGroup.SAND)), ModItemGroup.ITEM);
    public static final Block ULTRAMARINE_GLAZED_TERRACOTTA = resisterBlock("ultramarine_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block ULTRAMARINE_SHULKER_BOX = resisterBlock ("ultramarine_shulker_box", new ModShulkerBox(ULTRAMARINE, FabricBlockSettings.of(Material.SHULKER_BOX).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block ULTRAMARINE_STAINED_GLASS = resisterBlock ("ultramarine_stained_glass", new GlassBlock(FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f)), ModItemGroup.ITEM);
    public static final Block ULTRAMARINE_STAINED_GLASS_PANE = resisterBlock ("ultramarine_stained_glass_pane", new ModStainedGlassPane(ULTRAMARINE, FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f)), ModItemGroup.ITEM);
    public static final Block ULTRAMARINE_TERRACOTTA = resisterBlock("ultramarine_terracotta", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block ULTRAMARINE_WOOL = resisterBlock("ultramarine_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block ROSE = resisterBlock("rose", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()), ModItemGroup.ITEM);
    public static final Block ROSE_CANDLE = resisterBlock("rose_candle", new CandleBlock(AbstractBlock.Settings.of(Material.DECORATION, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL).luminance(CandleBlock.STATE_TO_LUMINANCE)), ModItemGroup.ITEM);
    public static final Block ROSE_CARPET = resisterBlock("rose_carpet", new ColorDyedCarpetBlock(ModDyeColor.ROSE, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block ROSE_CONCRETE = resisterBlock("rose_concrete", new Block(AbstractBlock.Settings.of(Material.AGGREGATE).requiresTool().strength(1.8f)), ModItemGroup.ITEM);
    public static final Block ROSE_CONCRETE_POWDER = resisterBlock("rose_concrete_powder", new ConcretePowderBlock(ROSE_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE, MapColor.WHITE).strength(0.5f).sounds(BlockSoundGroup.SAND)), ModItemGroup.ITEM);
    public static final Block ROSE_GLAZED_TERRACOTTA = resisterBlock("rose_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block ROSE_SHULKER_BOX = resisterBlock ("rose_shulker_box", new ModShulkerBox(ModDyeColor.ROSE, FabricBlockSettings.of(Material.SHULKER_BOX).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block ROSE_STAINED_GLASS = resisterBlock ("rose_stained_glass", new GlassBlock(FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f)), ModItemGroup.ITEM);
    public static final Block ROSE_STAINED_GLASS_PANE = resisterBlock ("rose_stained_glass_pane", new ModStainedGlassPane(ModDyeColor.ROSE, FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f)), ModItemGroup.ITEM);
    public static final Block ROSE_TERRACOTTA = resisterBlock("rose_terracotta", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block ROSE_WOOL = resisterBlock("rose_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block WOLFSBANE = resisterBlock("wolfsbane", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()), ModItemGroup.ITEM);
    public static final Block VIOLET_CANDLE = resisterBlock("violet_candle", new CandleBlock(AbstractBlock.Settings.of(Material.DECORATION, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL).luminance(CandleBlock.STATE_TO_LUMINANCE)), ModItemGroup.ITEM);
    public static final Block VIOLET_CARPET = resisterBlock("violet_carpet", new ColorDyedCarpetBlock(ModDyeColor.VIOLET, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block VIOLET_CONCRETE = resisterBlock("violet_concrete", new Block(AbstractBlock.Settings.of(Material.AGGREGATE).requiresTool().strength(1.8f)), ModItemGroup.ITEM);
    public static final Block VIOLET_CONCRETE_POWDER = resisterBlock("violet_concrete_powder", new ConcretePowderBlock(VIOLET_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE, MapColor.WHITE).strength(0.5f).sounds(BlockSoundGroup.SAND)), ModItemGroup.ITEM);
    public static final Block VIOLET_GLAZED_TERRACOTTA = resisterBlock("violet_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block VIOLET_SHULKER_BOX = resisterBlock ("violet_shulker_box", new ModShulkerBox(VIOLET, FabricBlockSettings.of(Material.SHULKER_BOX).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block VIOLET_STAINED_GLASS = resisterBlock ("violet_stained_glass", new GlassBlock(FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f)), ModItemGroup.ITEM);
    public static final Block VIOLET_STAINED_GLASS_PANE = resisterBlock ("violet_stained_glass_pane", new ModStainedGlassPane(ModDyeColor.VIOLET, FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f)), ModItemGroup.ITEM);
    public static final Block VIOLET_TERRACOTTA = resisterBlock("violet_terracotta", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block VIOLET_WOOL = resisterBlock("violet_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block NEW_GREEN_CANDLE = resisterBlock("new_green_candle", new CandleBlock(AbstractBlock.Settings.of(Material.DECORATION, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL).luminance(CandleBlock.STATE_TO_LUMINANCE)), ModItemGroup.ITEM);
    public static final Block NEW_GREEN_CARPET = resisterBlock("new_green_carpet", new ColorDyedCarpetBlock(ModDyeColor.NEW_GREEN, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block NEW_GREEN_CONCRETE = resisterBlock("new_green_concrete", new Block(AbstractBlock.Settings.of(Material.AGGREGATE).requiresTool().strength(1.8f)), ModItemGroup.ITEM);
    public static final Block NEW_GREEN_CONCRETE_POWDER = resisterBlock("new_green_concrete_powder", new ConcretePowderBlock(NEW_GREEN_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE, MapColor.WHITE).strength(0.5f).sounds(BlockSoundGroup.SAND)), ModItemGroup.ITEM);
    public static final Block NEW_GREEN_GLAZED_TERRACOTTA = resisterBlock("new_green_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block NEW_GREEN_SHULKER_BOX = resisterBlock ("new_green_shulker_box", new ModShulkerBox(NEW_GREEN, FabricBlockSettings.of(Material.SHULKER_BOX).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block NEW_GREEN_STAINED_GLASS = resisterBlock ("new_green_stained_glass", new GlassBlock(FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f)), ModItemGroup.ITEM);
    public static final Block NEW_GREEN_STAINED_GLASS_PANE = resisterBlock ("new_green_stained_glass_pane", new ModStainedGlassPane(ModDyeColor.NEW_GREEN, FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f)), ModItemGroup.ITEM);
    public static final Block NEW_GREEN_TERRACOTTA = resisterBlock("new_green_terracotta", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block NEW_GREEN_WOOL = resisterBlock("new_green_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block SPRING_GREEN_CANDLE = resisterBlock("spring_green_candle", new CandleBlock(AbstractBlock.Settings.of(Material.DECORATION, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL).luminance(CandleBlock.STATE_TO_LUMINANCE)), ModItemGroup.ITEM);
    public static final Block SPRING_GREEN_CARPET = resisterBlock("spring_green_carpet", new ColorDyedCarpetBlock(ModDyeColor.SPRING_GREEN, AbstractBlock.Settings.of(Material.CARPET, MapColor.WHITE).strength(0.1f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);
    public static final Block SPRING_GREEN_CONCRETE = resisterBlock("spring_green_concrete", new Block(AbstractBlock.Settings.of(Material.AGGREGATE).requiresTool().strength(1.8f)), ModItemGroup.ITEM);
    public static final Block SPRING_GREEN_CONCRETE_POWDER = resisterBlock("spring_green_concrete_powder", new ConcretePowderBlock(SPRING_GREEN_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE, MapColor.WHITE).strength(0.5f).sounds(BlockSoundGroup.SAND)), ModItemGroup.ITEM);
    public static final Block SPRING_GREEN_GLAZED_TERRACOTTA = resisterBlock("spring_green_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block SPRING_GREEN_SHULKER_BOX = resisterBlock ("spring_green_shulker_box", new ModShulkerBox(SPRING_GREEN, FabricBlockSettings.of(Material.SHULKER_BOX).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block SPRING_GREEN_STAINED_GLASS = resisterBlock ("spring_green_stained_glass", new GlassBlock(FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f)), ModItemGroup.ITEM);
    public static final Block SPRING_GREEN_STAINED_GLASS_PANE = resisterBlock ("spring_green_stained_glass_pane", new ModStainedGlassPane(ModDyeColor.SPRING_GREEN, FabricBlockSettings.of(Material.GLASS).nonOpaque().strength(0.5f)), ModItemGroup.ITEM);
    public static final Block SPRING_GREEN_TERRACOTTA = resisterBlock("spring_green_terracotta", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block SPRING_GREEN_WOOL = resisterBlock("spring_green_wool", new Block(AbstractBlock.Settings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL)), ModItemGroup.ITEM);

    //Stones
    public static final Block DIABASE = resisterBlock("diabase", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block PUMICE = resisterBlock("pumice", new LavaSponge(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block HOT_PUMICE = resisterBlock("hot_pumice", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block LIMESTONE = resisterBlock("limestone", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block SALT_BLOCK = resisterBlock("salt_block", new FallingBlock(FabricBlockSettings.of(Material.STONE).strength(0.2f).requiresTool()), ModItemGroup.ITEM);
    public static final Block SHALE = resisterBlock("shale", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);


    public static final Block MARBLE = resisterBlock("marble", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block MARBLE_STAIRS = resisterBlock("marble_stairs", new ModStairsBlock(ModBlocks.MARBLE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block MARBLE_SLAB = resisterBlock("marble_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block MARBLE_WALL = resisterBlock("marble_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block MARBLE_BRICKS = resisterBlock("marble_bricks", new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);
    public static final Block MARBLE_BRICK_STAIRS = resisterBlock("marble_brick_stairs", new ModStairsBlock(ModBlocks.MARBLE_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block MARBLE_BRICK_SLAB = resisterBlock("marble_brick_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(1.0f)), ModItemGroup.ITEM);
    public static final Block MARBLE_BRICK_WALL = resisterBlock("marble_brick_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool()), ModItemGroup.ITEM);


    //Ore Generation (7)
    public static final Block BEEF_ORE = resisterBlock("beef_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block CHICKEN_NUGGET_ORE = resisterBlock("chicken_nugget_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_SILVER_ORE = resisterBlock("deepslate_silver_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block DEEPSLATE_TIN_ORE = resisterBlock("deepslate_tin_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block GRAPHITE_BLOCK = resisterBlock("graphite_block", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block LIFE_ORE = resisterBlock("life_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool().sounds(ModSounds.ORE_SCREAM_SOUNDS)), ModItemGroup.ITEM);
    public static final Block LUCKY_ORE = resisterBlock("lucky_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block HELLSTONE_BLOCK = resisterBlock("hellstone_block", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block RAW_PLATINUM_BLOCK = resisterBlock("raw_platinum_block", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block QUAERITE = resisterBlock("quaerite", new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block RAW_BEEF_ORE = resisterBlock("raw_beef_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block RAW_CHICKEN_NUGGET_ORE = resisterBlock("raw_chicken_nugget_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block SILVER_ORE = resisterBlock("silver_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block TIN_ORE = resisterBlock("tin_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.ITEM);
    public static final Block RAW_TITANIUM_BLOCK = resisterBlock("raw_titanium_block", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.ITEM);

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

    public static final Block XRAY = resisterBlock("xray", new XRay(FabricBlockSettings.of(Material.DECORATION).breakInstantly()), ModItemGroup.ITEM);

    private static Boolean always(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return true;
    }

    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
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
