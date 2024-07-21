package net.romeosnowblitz.hmh2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.block.SandSculk;
import net.romeosnowblitz.hmh2.block.custom.block.*;
import net.romeosnowblitz.hmh2.block.custom.farm.*;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonExtensionBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonHeadBlock;
import net.romeosnowblitz.hmh2.block.custom.summon.*;
import net.romeosnowblitz.hmh2.block.custom.block.BananaPeel;
import net.romeosnowblitz.hmh2.block.custom.summon.InfestedBlock;
import net.romeosnowblitz.hmh2.block.custom.test.*;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor;
import net.romeosnowblitz.hmh2.particle.ModParticleTypes;
import net.romeosnowblitz.hmh2.sounds.ModSounds;

import java.util.function.ToIntFunction;

public class ModBlocks {


    public static final Block SPAWN_BLOCK = registerBlock("spawn_block", new SpawnBlock(AbstractBlock.Settings.create()), true);
    public static final Block EGG_SHELL = registerBlock("egg_shell", new EggShell(100, AbstractBlock.Settings.create()), true);

    public static final Block AA = registerBlock("aa", new AA(AbstractBlock.Settings.create()), true);
    public static final Block JAIZ_BLOCK = registerBlock("jaiz_block", new JaizFlower(AbstractBlock.Settings.create().noCollision()), true);

    public static final Block TEMPORARY_LIGHT = registerBlock("temporary_light", new TemporaryLight(FabricBlockSettings.copy(Blocks.LIGHT).ticksRandomly()), true);

    public static final Block ROSE_BED = registerBlock("rose_bed", new NewBedBlock(ModDyeColor.ROSE, AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(0.2F).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY)), true);
    public static final Block PURPLE_TORCH = registerBlock("purple_torch", new TorchBlock(
            AbstractBlock.Settings.create().noCollision().breakInstantly().luminance((state) -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY), ModParticleTypes.PURPLE_FLAME), false);
    public static final Block WALL_PURPLE_TORCH = registerBlock("wall_purple_torch", new WallTorchBlock(
            AbstractBlock.Settings.create().noCollision().breakInstantly().luminance((state) -> 14).sounds(BlockSoundGroup.WOOD).dropsLike(PURPLE_TORCH).pistonBehavior(PistonBehavior.DESTROY), ModParticleTypes.PURPLE_FLAME), false);
    public static final Block LAMP_TORCH = registerBlock("lamp_torch", new LampTorch(AbstractBlock.Settings.create()
            .noCollision().breakInstantly().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY)), false);
    public static final Block LAMP_WALL_TORCH = registerBlock("lamp_wall_torch", new WallLampTorch(AbstractBlock.Settings.create()
            .noCollision().breakInstantly().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.WOOD).dropsLike(LAMP_TORCH).pistonBehavior(PistonBehavior.DESTROY)), false);
    public static final Block NEW_BLOCk = registerBlock("new_block", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK)), true);
    public static final Block ASH_BLOCK = registerBlock("ash_block", new Block(FabricBlockSettings.copy(Blocks.SAND)), true);

    //New Blocks
    public static final Block BANANA_PEEL = registerBlock("banana_peel", new BananaPeel(FabricBlockSettings.create().nonOpaque().strength(0.5f)), true);
    public static final Block SAND_SCULK = registerBlock("sand_sculk", new SandSculk(AbstractBlock.Settings.create().strength(1.0f)), true);
    public static final Block PEAT = registerBlock("peat", new Block(AbstractBlock.Settings.create().strength(1.0f)), true);
    public static final Block GLUEY_PISTON = registerBlock("gluey_piston", ModBlocks.createPistonBlock(), true);
    public static final Block ICED_BUCKET = registerBlock("iced_bucket", new Block(AbstractBlock.Settings.create().nonOpaque().strength(1.0f).sounds(BlockSoundGroup.GLASS)), true);

    //Obtained from Crafting (8)
    public static final Block BLOCK = registerBlock("block", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)), true);
    public static final Block END_CRYSTAL_BLOCK = registerBlock("end_crystal_block", new EnderCrystalBlock(FabricBlockSettings.create().strength(1.0f)), true);
    public static final Block LUCKY_ITEM = registerBlock("lucky_item", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()), true);
    public static final Block LUCKY_BLOCK = registerBlock("lucky_block", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()), true);

    //Crop Block
    public static final Block BLUEBERRY_BUSH = registerBlock("blueberry_bush", new HarvestableBushBlock(AbstractBlock.Settings.create().ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), true);
    public static final Block STRAWBERRY_BUSH = registerBlock("strawberry_bush", new HarvestableBushBlock(AbstractBlock.Settings.create().ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), true);
    public static final Block CRIMSON_FARMLAND = registerBlock("crimson_farmland", new NetherFarmlandBlock(AbstractBlock.Settings.create().ticksRandomly().strength(0.6f).sounds(BlockSoundGroup.GRAVEL), Blocks.CRIMSON_NYLIUM), true);
    public static final Block MIDAS_TOUCH = registerBlock("midas_touch", new ModCropBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()), true);
    public static final Block WARPED_FARMLAND = registerBlock("warped_farmland", new NetherFarmlandBlock(AbstractBlock.Settings.create().ticksRandomly().strength(0.6f).sounds(BlockSoundGroup.GRAVEL), Blocks.WARPED_NYLIUM), true);
    public static final Block ENDER_CORN_BLOCK = registerBlock("ender_corn_block", new CropBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()){public ItemConvertible getSeedsItem() {return ModItems.ENDER_CORN_SEEDS;}}, true);
    public static final Block CARVED_MELON = ModBlocks.registerBlock("carved_melon", new CarvedMelonBlock(FabricBlockSettings.create().strength(0.5f)), true);

    //Flower Generation
    public static final Block POISON_GRASS = registerBlock("poison_grass", new PoisonGrass((StatusEffects.POISON), AbstractBlock.Settings.copy(Blocks.WITHER_ROSE).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).nonOpaque()), true);

    //Ore Generation (7)
    public static final Block BEEF_ORE = registerBlock("beef_ore", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool()), true);
    public static final Block CHICKEN_NUGGET_ORE = registerBlock("chicken_nugget_ore", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool()), true);
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.DEEPSLATE).strength(3.0f, 3.0f).requiresTool()), true);
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.DEEPSLATE).strength(3.0f, 3.0f).requiresTool()), true);
    public static final Block GRAPHITE_BLOCK = registerBlock("graphite_block", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool()), true);
    public static final Block GALLIUM_ORE = registerBlock("gallium_ore", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool()), true);
    public static final Block LIFE_ORE = registerBlock("life_ore", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool().sounds(ModSounds.ORE_SCREAM_SOUNDS)), true);
    public static final Block HELLSTONE_BLOCK = registerBlock("hellstone_block", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool()), true);
    public static final Block RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block", new Block(FabricBlockSettings.create().strength(3.0f, 3.0f).requiresTool()), true);
    public static final Block QUAERITE = registerBlock("quaerite", new Block(FabricBlockSettings.create().strength(4.0f).requiresTool()), true);
    public static final Block RAW_BEEF_ORE = registerBlock("raw_beef_ore", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool()), true);
    public static final Block RAW_CHICKEN_NUGGET_ORE = registerBlock("raw_chicken_nugget_ore", new Block(FabricBlockSettings.create().strength(1.0f).requiresTool()), true);
    public static final Block SILVER_ORE = registerBlock("silver_ore", new Block(FabricBlockSettings.create().strength(3.0f, 3.0f).requiresTool()), true);
    public static final Block TIN_ORE = registerBlock("tin_ore", new Block(FabricBlockSettings.create().strength(3.0f, 3.0f).requiresTool()), true);
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block", new Block(FabricBlockSettings.create().strength(3.0f, 3.0f).requiresTool()), true);

    /*/Block Entity
    public static final Block CHEESE_PRESS = registerBlock("cheese_press", new CheesePressBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()), true);
    public static final Block FREEZER = registerBlock("freezer", new FreezerBlock(FabricBlockSettings.of(Material.METAL).strength(0.5f).nonOpaque()), true);
     */

    //Special Blocks (4)
    public static final Block CHOCOLATE_MILK_FLUID_BLOCK = registerBlock("chocolate_milk_fluid_block", new FluidBlock(ModFluids.CHOCOLATE_MILK_STILL, FabricBlockSettings.create().noCollision().nonOpaque().dropsNothing().replaceable()), false);
    public static final Block HEATED_OIL_FLUID_BLOCK = registerBlock("heated_oil_fluid_block", new FluidBlock(ModFluids.HEATED_OIL_STILL, FabricBlockSettings.create().ticksRandomly().noCollision().nonOpaque().dropsNothing().replaceable()), false);
    public static final Block HONEY_FLUID_BLOCK = registerBlock("honey_fluid_block", new FluidBlock(ModFluids.HONEY_FLOWING, FabricBlockSettings.create().ticksRandomly().noCollision().nonOpaque().dropsNothing().replaceable()), false);
    public static final Block OIL_FLUID_BLOCK = registerBlock("oil_fluid_block", new FluidBlock(ModFluids.OIL_STILL, FabricBlockSettings.create().noCollision().nonOpaque().dropsNothing().replaceable()), false);
    public static final Block QUICKSAND_FLUID_BLOCK = registerBlock("quicksand_fluid_block", new QuicksandFluidBlock(ModFluids.QUICKSAND_STILL, FabricBlockSettings.create().noCollision().nonOpaque().dropsNothing().replaceable()), false);

    public static final Block CHICKEN_BLOCK = registerBlock("chicken_block", new Block(FabricBlockSettings.create().strength(0.5f)), true);
    public static final Block CHICKEN_SLAB = registerBlock("chicken_slab", new SlabBlock(FabricBlockSettings.create().strength(0.5f)), true);
    public static final Block RAW_CHICKEN_BLOCK = registerBlock("raw_chicken_block", new Block(FabricBlockSettings.create().strength(0.5f)), true);
    public static final Block RAW_CHICKEN_SLAB = registerBlock("raw_chicken_slab", new SlabBlock(FabricBlockSettings.create().strength(0.5f)), true);

    public static final Block BEEF_BLOCK = registerBlock("beef_block", new Block(FabricBlockSettings.create().strength(0.5f)), true);
    public static final Block BEEF_SLAB = registerBlock("beef_slab", new SlabBlock(FabricBlockSettings.create().strength(0.5f)), true);
    public static final Block RAW_BEEF_BLOCK = registerBlock("raw_beef_block", new Block(FabricBlockSettings.create().strength(0.5f)), true);
    public static final Block RAW_BEEF_SLAB = registerBlock("raw_beef_slab", new SlabBlock(FabricBlockSettings.create().strength(0.5f)), true);

    public static final Block INFESTED_MAGMA_BLOCK = ModBlocks.registerBlock("infested_magma_block", new MagmiteInfestedBlock(ModEntities.MAGMITE, FabricBlockSettings.create().strength(0.5f)), true);
    public static final Block INFESTED_SCULK_BLOCK = ModBlocks.registerBlock("infested_sculk_block", new InfestedBlock(ModEntities.SCULKMITE, FabricBlockSettings.create().strength(0.5f)), true);
    public static final Block INFESTED_NETHERRACK_BLOCK = ModBlocks.registerBlock("infested_netherrack_block", new InfestedBlock(ModEntities.HELLMITE, FabricBlockSettings.create().strength(0.5f)), true);
    public static final Block INFESTED_HONEYCOMB_BLOCK = registerBlock("infested_honeycomb_block", new BeeInfestedBlock(FabricBlockSettings.copy(Blocks.HONEYCOMB_BLOCK)), true);
    public static final Block HONEY_HIVE = registerBlock("honey_hive", new QueenBeeSummonBlock(AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.WOOD)), true);
    public static final Block ROYAL_JELLY = registerBlock ("royal_jelly", new HoneyBlock(FabricBlockSettings.create().nonOpaque().strength(2.0f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(BlockSoundGroup.HONEY)), true);
    public static final Block XRAY = registerBlock("xray", new MultifaceGrowthBlock(FabricBlockSettings.create().breakInstantly()) {@Override public LichenGrower getGrower() {return null;}}, true);

    public static final Block MOD_PISTON_HEAD = registerBlock("mod_piston_head", new ModPistonHeadBlock(AbstractBlock.Settings.create().strength(1.5f).dropsNothing()), true);
    public static final Block MOD_MOVING_PISTON = registerBlock("mod_moving_piston", new ModPistonExtensionBlock(AbstractBlock.Settings.create()
            .strength(-1.0f).dynamicBounds().dropsNothing().nonOpaque().solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)), true);

    private static Boolean always(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return true;
    }

    private static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    private static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int litLevel) {
        return (state) -> (Boolean)state.get(Properties.LIT) ? litLevel : 0;
    }

    private static ModPistonBlock createPistonBlock() {
        AbstractBlock.ContextPredicate contextPredicate = (state, world, pos) -> !state.get(ModPistonBlock.EXTENDED);
        return new ModPistonBlock(true, AbstractBlock.Settings.create().strength(1.5f).suffocates(contextPredicate).blockVision(contextPredicate));
    }

    private static Block registerBlock(String name, Block block, boolean item) {
        if(item){Registry.register(Registries.ITEM, new Identifier(Hmh2.MOD_ID, name), new ModBlockItem(block, new FabricItemSettings(), name));}
        return Registry.register(Registries.BLOCK, new Identifier(Hmh2.MOD_ID, name), block);
    }


}
