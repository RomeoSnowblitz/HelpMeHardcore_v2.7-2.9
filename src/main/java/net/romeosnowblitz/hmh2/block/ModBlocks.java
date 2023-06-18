package net.romeosnowblitz.hmh2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.SandSculk;
import net.romeosnowblitz.hmh2.block.custom.block.*;
import net.romeosnowblitz.hmh2.block.custom.blockentity.Backpack;
import net.romeosnowblitz.hmh2.block.custom.farm.*;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonExtensionBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonHeadBlock;
import net.romeosnowblitz.hmh2.block.custom.summon.*;
import net.romeosnowblitz.hmh2.block.custom.test.XRay;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.sounds.ModSounds;

public class ModBlocks {
    /*
    public static final Block TEST_BLOCK = resisterBlock("test_block", new TestBlock(AbstractBlock.Settings.of(Material.SNOW_LAYER).strength(0.0000000001f).hardness(0.0000000001f).resistance(0.0000000001f).ticksRandomly().postProcess(ModBlocks::always), UndergroundConfiguredFeatures.AMETHYST_GEODE));
    */
    //New Blocks
    public static final Block BANANA_PEEL = resisterBlock("banana_peel", new CarpetBlock(FabricBlockSettings.create().nonOpaque().velocityMultiplier(15).strength(0.5f)));
    public static final Block MOD_COMPOSTER = resisterBlock("mod_composter", new ModComposterBlock(AbstractBlock.Settings.create().strength(0.6F).sounds(BlockSoundGroup.WOOD)));
    public static final Block SAND_SCULK = resisterBlock("sand_sculk", new SandSculk(AbstractBlock.Settings.create().strength(1.0f)));
    public static final Block PEAT = resisterBlock("peat", new Block(AbstractBlock.Settings.create().strength(1.0f)));
    public static final Block GLUEY_PISTON = resisterBlock("gluey_piston", ModBlocks.createPistonBlock(true));
    public static final Block ICED_BUCKET = resisterBlock("iced_bucket", new Block(AbstractBlock.Settings.create().nonOpaque().strength(1.0f).sounds(BlockSoundGroup.GLASS)));

    //Obtained from Crafting (8)
    public static final Block BLOCK = resisterBlock("block", new Block(FabricBlockSettings.create().strength(0.5f)));
    public static final Block END_CRYSTAL_BLOCK = resisterBlock("end_crystal_block", new EnderCrystalBlock(FabricBlockSettings.create().strength(1.0f)));
    public static final Block LUCKY_ITEM = resisterBlock("lucky_item", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block LUCKY_BLOCK = resisterBlock("lucky_block", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block QUICKSAND = resisterBlock("quicksand", new ModCobwebBlock(AbstractBlock.Settings.create().strength(0.25f).suffocates(ModBlocks::always).noCollision()));

    //Crop Block
    public static final Block BLUEBERRY_BUSH = resisterBlock("blueberry_bush", new BlueberryBushBlock(AbstractBlock.Settings.create().ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));
    public static final Block STRAWBERRY_BUSH = resisterBlock("strawberry_bush", new StrawberryBushBlock(AbstractBlock.Settings.create().ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));
    public static final Block CRIMSON_FARMLAND = resisterBlock("crimson_farmland", new CrimsonFarmlandBlock(AbstractBlock.Settings.create().ticksRandomly().strength(0.6f).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block MIDAS_TOUCH = resisterBlock(("midas_touch"), new MidasTouchBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block WARPED_FARMLAND = resisterBlock("warped_farmland", new WarpedFarmlandBlock(AbstractBlock.Settings.create().ticksRandomly().strength(0.6f).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block ENDER_CORN_BLOCK = ModBlocks.resisterBlock("ender_corn_block", (Block)new EnderCornBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block CARVED_MELON = ModBlocks.resisterBlock("carved_melon", (Block)new CarvedMelonBlock(FabricBlockSettings.create().strength(0.5f)));

    //Flower Generation
    public static final Block POISON_GRASS = resisterBlock("poison_grass", new PoisonGrass((StatusEffects.POISON), AbstractBlock.Settings.copy(Blocks.WITHER_ROSE).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).nonOpaque()));

    //Ore Generation (7)
    public static final Block BEEF_ORE = resisterBlock("beef_ore", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool()));
    public static final Block CHICKEN_NUGGET_ORE = resisterBlock("chicken_nugget_ore", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool()));
    public static final Block DEEPSLATE_SILVER_ORE = resisterBlock("deepslate_silver_ore", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.DEEPSLATE).strength(3.0f, 3.0f).requiresTool()));
    public static final Block DEEPSLATE_TIN_ORE = resisterBlock("deepslate_tin_ore", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.DEEPSLATE).strength(3.0f, 3.0f).requiresTool()));
    public static final Block GRAPHITE_BLOCK = resisterBlock("graphite_block", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool()));
    public static final Block LIFE_ORE = resisterBlock("life_ore", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool().sounds(ModSounds.ORE_SCREAM_SOUNDS)));
    public static final Block LUCKY_ORE = resisterBlock("lucky_ore", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool()));
    public static final Block HELLSTONE_BLOCK = resisterBlock("hellstone_block", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool()));
    public static final Block RAW_PLATINUM_BLOCK = resisterBlock("raw_platinum_block", new Block(FabricBlockSettings.create().strength(3.0f, 3.0f).requiresTool()));
    public static final Block QUAERITE = resisterBlock("quaerite", new Block(FabricBlockSettings.create().strength(4.0f).requiresTool()));
    public static final Block RAW_BEEF_ORE = resisterBlock("raw_beef_ore", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool()));
    public static final Block RAW_CHICKEN_NUGGET_ORE = resisterBlock("raw_chicken_nugget_ore", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool()));
    public static final Block SILVER_ORE = resisterBlock("silver_ore", new Block(FabricBlockSettings.create().strength(3.0f, 3.0f).requiresTool()));
    public static final Block TIN_ORE = resisterBlock("tin_ore", new Block(FabricBlockSettings.create().strength(3.0f, 3.0f).requiresTool()));
    public static final Block RAW_TITANIUM_BLOCK = resisterBlock("raw_titanium_block", new Block(FabricBlockSettings.create().strength(3.0f, 3.0f).requiresTool()));

    /*/Block Entity
    public static final Block CHEESE_PRESS = resisterBlock("cheese_press", new CheesePressBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()));
    public static final Block FREEZER = resisterBlock("freezer", new FreezerBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).nonOpaque()));
     */

    //Special Blocks (4)
    public static final Block CHOCOLATE_MILK_FLUID_BLOCK = registerBlockWithoutBlockItem("chocolate_milk_fluid_block", new ModFluidBlock(ModFluids.CHOCOLATE_MILK_STILL, FabricBlockSettings.create().noCollision().nonOpaque().dropsNothing()));
    public static final Block HEATED_OIL_FLUID_BLOCK = registerBlockWithoutBlockItem("heated_oil_fluid_block", new ModFluidBlock(ModFluids.HEATED_OIL_STILL, FabricBlockSettings.create().ticksRandomly().noCollision().nonOpaque().dropsNothing()));
    public static final Block HONEY_FLUID_BLOCK = registerBlockWithoutBlockItem("honey_fluid_block", new ModFluidBlock(ModFluids.HONEY_FLOWING, FabricBlockSettings.create().ticksRandomly().noCollision().nonOpaque().dropsNothing()));
    public static final Block OIL_FLUID_BLOCK = registerBlockWithoutBlockItem("oil_fluid_block", new ModFluidBlock(ModFluids.OIL_STILL, FabricBlockSettings.create().noCollision().nonOpaque().dropsNothing()));

    public static final Block CHICKEN_BLOCK = resisterBlock("chicken_block", new Block(FabricBlockSettings.create().strength(0.5f)));
    public static final Block CHICKEN_SLAB = resisterBlock("chicken_slab", new SlabBlock(FabricBlockSettings.create().strength(0.5f)));
    public static final Block RAW_CHICKEN_BLOCK = resisterBlock("raw_chicken_block", new Block(FabricBlockSettings.create().strength(0.5f)));
    public static final Block RAW_CHICKEN_SLAB = resisterBlock("raw_chicken_slab", new SlabBlock(FabricBlockSettings.create().strength(0.5f)));

    public static final Block BEEF_BLOCK = resisterBlock("beef_block", new Block(FabricBlockSettings.create().strength(0.5f)));
    public static final Block BEEF_SLAB = resisterBlock("beef_slab", new SlabBlock(FabricBlockSettings.create().strength(0.5f)));
    public static final Block RAW_BEEF_BLOCK = resisterBlock("raw_beef_block", new Block(FabricBlockSettings.create().strength(0.5f)));
    public static final Block RAW_BEEF_SLAB = resisterBlock("raw_beef_slab", new SlabBlock(FabricBlockSettings.create().strength(0.5f)));

    public static final Block INFESTED_MAGMA_BLOCK = ModBlocks.resisterBlock("infested_magma_block", new MagmiteInfestedBlock(FabricBlockSettings.create().strength(0.5f)));
    public static final Block INFESTED_SCULK_BLOCK = ModBlocks.resisterBlock("infested_sculk_block", new SculkmiteInfestedBlock(FabricBlockSettings.create().strength(0.5f)));
    public static final Block INFESTED_NETHERRACK_BLOCK = ModBlocks.resisterBlock("infested_netherrack_block", new HellmiteInfestedBlock(FabricBlockSettings.create().strength(0.5f)));
    public static final Block INFESTED_HONEYCOMB_BLOCK = resisterBlock("infested_honeycomb_block", new BeeInfestedBlock(Blocks.HONEYCOMB_BLOCK, FabricBlockSettings.create().strength(0.5f)));
    public static final Block HONEY_HIVE = resisterBlock("honey_hive", new QueenBeeSummonBlock(AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.WOOD)));
    public static final Block ROYAL_JELLY = resisterBlock ("royal_jelly", new HoneyBlock(FabricBlockSettings.create().nonOpaque().strength(2.0f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(BlockSoundGroup.HONEY)));
    public static final Block XRAY = resisterBlock("xray", new XRay(FabricBlockSettings.create().breakInstantly()));

    //Buggy Blocks
    public static final Block BACKPACK = resisterBlock("backpack", new Backpack(FabricBlockSettings.create().strength(0.5f)));

    public static final Block MOD_PISTON_HEAD = resisterBlock("mod_piston_head", new ModPistonHeadBlock(AbstractBlock.Settings.create().strength(1.5f).dropsNothing()));
    public static final Block MOD_MOVING_PISTON = resisterBlock("mod_moving_piston", new ModPistonExtensionBlock(AbstractBlock.Settings.create()
            .strength(-1.0f).dynamicBounds().dropsNothing().nonOpaque().solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)));

    private static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Hmh2.MOD_ID, name), block);
    }

    private static ModPistonBlock createPistonBlock(boolean gluey) {
        AbstractBlock.ContextPredicate contextPredicate = (state, world, pos) -> state.get(ModPistonBlock.EXTENDED) == false;
        return new ModPistonBlock(gluey, AbstractBlock.Settings.create().strength(1.5f).suffocates(contextPredicate).blockVision(contextPredicate));
    }

    private static Block resisterBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Hmh2.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        Item item = Registry.register((Registries.ITEM), new Identifier(Hmh2.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlock() {
        Hmh2.LOGGER.info("Registering ModBlocks for " + Hmh2.MOD_ID);
    }
}
