/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.item.v1.FabricItemSettings
 *  net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
 *  net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings
 *  net.minecraft.class_1294
 *  net.minecraft.class_1299
 *  net.minecraft.class_1747
 *  net.minecraft.class_1761
 *  net.minecraft.class_1767
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1922
 *  net.minecraft.class_1935
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2292
 *  net.minecraft.class_2338
 *  net.minecraft.class_2346
 *  net.minecraft.class_2356
 *  net.minecraft.class_2366
 *  net.minecraft.class_2368
 *  net.minecraft.class_2378
 *  net.minecraft.class_2465
 *  net.minecraft.class_2480
 *  net.minecraft.class_2482
 *  net.minecraft.class_2498
 *  net.minecraft.class_2510
 *  net.minecraft.class_2544
 *  net.minecraft.class_2586
 *  net.minecraft.class_2627
 *  net.minecraft.class_2680
 *  net.minecraft.class_2769
 *  net.minecraft.class_2960
 *  net.minecraft.class_3614
 *  net.minecraft.class_3620
 *  net.minecraft.class_4622
 *  net.minecraft.class_4970
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_4970$class_4973
 *  net.minecraft.class_5544
 *  net.minecraft.class_6801
 *  net.minecraft.class_7923
 */
package net.romeosnowblitz.hmh2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.class_1294;
import net.minecraft.class_1299;
import net.minecraft.class_1747;
import net.minecraft.class_1761;
import net.minecraft.class_1767;
import net.minecraft.class_1792;
import net.minecraft.class_1922;
import net.minecraft.class_1935;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2292;
import net.minecraft.class_2338;
import net.minecraft.class_2346;
import net.minecraft.class_2356;
import net.minecraft.class_2366;
import net.minecraft.class_2368;
import net.minecraft.class_2378;
import net.minecraft.class_2465;
import net.minecraft.class_2480;
import net.minecraft.class_2482;
import net.minecraft.class_2498;
import net.minecraft.class_2510;
import net.minecraft.class_2544;
import net.minecraft.class_2586;
import net.minecraft.class_2627;
import net.minecraft.class_2680;
import net.minecraft.class_2769;
import net.minecraft.class_2960;
import net.minecraft.class_3614;
import net.minecraft.class_3620;
import net.minecraft.class_4622;
import net.minecraft.class_4970;
import net.minecraft.class_5544;
import net.minecraft.class_6801;
import net.minecraft.class_7923;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.BlockOne;
import net.romeosnowblitz.hmh2.block.custom.BlockThree;
import net.romeosnowblitz.hmh2.block.custom.BlockTwo;
import net.romeosnowblitz.hmh2.block.custom.SandSculk;
import net.romeosnowblitz.hmh2.block.custom.block.ColorDyedCarpetBlock;
import net.romeosnowblitz.hmh2.block.custom.block.CustomLightBlock;
import net.romeosnowblitz.hmh2.block.custom.block.EnderCrystalBlock;
import net.romeosnowblitz.hmh2.block.custom.block.LavaSponge;
import net.romeosnowblitz.hmh2.block.custom.block.ModCobwebBlock;
import net.romeosnowblitz.hmh2.block.custom.block.ModComposterBlock;
import net.romeosnowblitz.hmh2.block.custom.block.ModFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.block.ModStainedGlassPane;
import net.romeosnowblitz.hmh2.block.custom.block.PoisonGrass;
import net.romeosnowblitz.hmh2.block.custom.blockentity.Backpack;
import net.romeosnowblitz.hmh2.block.custom.farm.BlueberryBushBlock;
import net.romeosnowblitz.hmh2.block.custom.farm.CrimsonFarmlandBlock;
import net.romeosnowblitz.hmh2.block.custom.farm.EnderCornBlock;
import net.romeosnowblitz.hmh2.block.custom.farm.MidasTouchBlock;
import net.romeosnowblitz.hmh2.block.custom.farm.StrawberryBushBlock;
import net.romeosnowblitz.hmh2.block.custom.farm.WarpedFarmlandBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonExtensionBlock;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonHeadBlock;
import net.romeosnowblitz.hmh2.block.custom.summon.BeeInfestedBlock;
import net.romeosnowblitz.hmh2.block.custom.summon.CarvedMelonBlock;
import net.romeosnowblitz.hmh2.block.custom.summon.HellmiteInfestedBlock;
import net.romeosnowblitz.hmh2.block.custom.summon.MagmiteInfestedBlock;
import net.romeosnowblitz.hmh2.block.custom.summon.QueenBeeSummonBlock;
import net.romeosnowblitz.hmh2.block.custom.summon.SculkmiteInfestedBlock;
import net.romeosnowblitz.hmh2.block.custom.test.RandomBlock;
import net.romeosnowblitz.hmh2.block.custom.test.RevivePoint;
import net.romeosnowblitz.hmh2.block.custom.test.TestBlock;
import net.romeosnowblitz.hmh2.block.custom.test.XRay;
import net.romeosnowblitz.hmh2.block.entity.ModBellBlock;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.ModItemGroup;
import net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor;
import net.romeosnowblitz.hmh2.sounds.ModSounds;

public class ModBlocks {
    public static final class_2248 MOD_COMPOSTER = ModBlocks.resisterBlock("mod_composter", new ModComposterBlock(class_4970.class_2251.method_9637((class_3614)class_3614.field_15932).method_9632(0.6f).method_9626(class_2498.field_11547)), ModItemGroup.MOD);
    public static final class_2248 SAND_SCULK = ModBlocks.resisterBlock("sand_sculk", (class_2248)new SandSculk(class_4970.class_2251.method_9637((class_3614)class_3614.field_28242).method_9632(1.0f)), ModItemGroup.MOD);
    public static final class_2248 TEST_BLOCK = ModBlocks.resisterBlock("test_block", new TestBlock(class_4970.class_2251.method_9637((class_3614)class_3614.field_15948).method_9632(1.0E-10f).method_36557(1.0E-10f).method_36558(1.0E-10f).method_9640().method_26247(ModBlocks::always), class_6801.field_35790), ModItemGroup.MOD);
    public static final class_2248 GAME_BLOCK = ModBlocks.resisterBlock("game_block", new RevivePoint(class_4970.class_2251.method_9637((class_3614)class_3614.field_15941).method_9640()), ModItemGroup.MOD);
    public static final class_2248 MOD_BELL = ModBlocks.resisterBlock("mod_bell", (class_2248)new ModBellBlock(class_4970.class_2251.method_9639((class_3614)class_3614.field_15953, (class_3620)class_3620.field_15994).method_29292().method_9632(5.0f).method_9626(class_2498.field_11531)), ModItemGroup.MOD);
    public static final class_2248 BLOCK_ONE = ModBlocks.resisterBlock("block_one", (class_2248)new BlockOne(class_4970.class_2251.method_9637((class_3614)class_3614.field_28242).method_9640().method_9632(1.0f)), ModItemGroup.MOD);
    public static final class_2248 BLOCK_TWO = ModBlocks.resisterBlock("block_two", new BlockTwo(class_4970.class_2251.method_9637((class_3614)class_3614.field_28242).method_9640().method_9632(1.0f)), ModItemGroup.MOD);
    public static final class_2248 BLOCK_THREE = ModBlocks.resisterBlock("block_three", new BlockThree(class_4970.class_2251.method_9637((class_3614)class_3614.field_28242).method_9640().method_9632(1.0f)), ModItemGroup.MOD);
    public static final class_2248 PEAT = ModBlocks.resisterBlock("peat", new class_2248(class_4970.class_2251.method_9637((class_3614)class_3614.field_15941).method_9632(1.0f)), ModItemGroup.MOD);
    public static final class_2248 NETHER_PRISMARINE = ModBlocks.resisterBlock("nether_prismarine", new CustomLightBlock(class_4970.class_2251.method_9637((class_3614)class_3614.field_15914).method_9632(0.5f).method_9631(state -> 7)), ModItemGroup.MOD);
    public static final class_2248 HELLSTONE_BRICKS = ModBlocks.resisterBlock("hellstone_bricks", new class_2248(class_4970.class_2251.method_9637((class_3614)class_3614.field_15914).method_9632(0.5f)), ModItemGroup.MOD);
    public static final class_2248 GLUEY_PISTON = ModBlocks.resisterBlock("gluey_piston", (class_2248)ModBlocks.createPistonBlock(true), ModItemGroup.MOD);
    public static final class_2248 ICED_BUCKET = ModBlocks.resisterBlock("iced_bucket", new class_2248(class_4970.class_2251.method_9637((class_3614)class_3614.field_15958).method_22488().method_9632(1.0f).method_9626(class_2498.field_11537)), ModItemGroup.MOD);
    public static final class_2248 ANDESITE_BRICKS = ModBlocks.resisterBlock("andesite_bricks", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914)), ModItemGroup.MOD);
    public static final class_2248 BLOCK = ModBlocks.resisterBlock("block", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f)), ModItemGroup.MOD);
    public static final class_2248 CORK_BLOCK = ModBlocks.resisterBlock("cork_block", new RandomBlock((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15917).strength(1.0f)), ModItemGroup.MOD);
    public static final class_2248 BAMBOO_BLOCK = ModBlocks.resisterBlock("bamboo_block", (class_2248)new class_2465((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).strength(0.5f)), ModItemGroup.MOD);
    public static final class_2248 DIORITE_BRICKS = ModBlocks.resisterBlock("diorite_bricks", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 END_CRYSTAL_BLOCK = ModBlocks.resisterBlock("end_crystal_block", new EnderCrystalBlock((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15935).strength(1.0f)), ModItemGroup.MOD);
    public static final class_2248 GRANITE_BRICKS = ModBlocks.resisterBlock("granite_bricks", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 LUCKY_ITEM = ModBlocks.resisterBlock("lucky_item", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 LUCKY_BLOCK = ModBlocks.resisterBlock("lucky_block", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 QUICKSAND = ModBlocks.resisterBlock("quicksand", new ModCobwebBlock(class_4970.class_2251.method_9637((class_3614)class_3614.field_15931).method_9632(0.25f).method_26243(ModBlocks::always).method_9634()), ModItemGroup.TESTING);
    public static final class_2248 SNOW_BRICKS = ModBlocks.resisterBlock("snow_bricks", new class_2248(class_4970.class_2251.method_9637((class_3614)class_3614.field_15914).method_9632(0.5f).method_9626(class_2498.field_11548).method_29292()), ModItemGroup.MOD);
    public static final class_2248 BLUEBERRY_BUSH = ModBlocks.resisterBlock("blueberry_bush", (class_2248)new BlueberryBushBlock(class_4970.class_2251.method_9637((class_3614)class_3614.field_15935).method_9640().method_9634().method_9626(class_2498.field_17579)), ModItemGroup.TESTING);
    public static final class_2248 STRAWBERRY_BUSH = ModBlocks.resisterBlock("strawberry_bush", (class_2248)new StrawberryBushBlock(class_4970.class_2251.method_9637((class_3614)class_3614.field_15935).method_9640().method_9634().method_9626(class_2498.field_17579)), ModItemGroup.TESTING);
    public static final class_2248 CRIMSON_FARMLAND = ModBlocks.resisterBlock("crimson_farmland", new CrimsonFarmlandBlock(class_4970.class_2251.method_9637((class_3614)class_3614.field_15941).method_9640().method_9632(0.6f).method_9626(class_2498.field_11529)), ModItemGroup.MOD);
    public static final class_2248 MIDAS_TOUCH = ModBlocks.resisterBlock("midas_touch", (class_2248)new MidasTouchBlock(FabricBlockSettings.method_9630((class_4970)class_2246.field_10293).method_22488().method_9634()), ModItemGroup.TESTING);
    public static final class_2248 WARPED_FARMLAND = ModBlocks.resisterBlock("warped_farmland", new WarpedFarmlandBlock(class_4970.class_2251.method_9637((class_3614)class_3614.field_15941).method_9640().method_9632(0.6f).method_9626(class_2498.field_11529)), ModItemGroup.MOD);
    public static final class_2248 ENDER_CORN_BLOCK = ModBlocks.resisterBlock("ender_corn_block", (class_2248)new EnderCornBlock(FabricBlockSettings.method_9630((class_4970)class_2246.field_10293).method_22488().method_9634()), ModItemGroup.TESTING);
    public static final class_2248 CARVED_MELON = ModBlocks.resisterBlock("carved_melon", (class_2248)new CarvedMelonBlock(FabricBlockSettings.method_9630((class_4970)class_2246.field_10545)), ModItemGroup.MOD);
    public static final class_2248 POISON_GRASS = ModBlocks.resisterBlock("poison_grass", (class_2248)new PoisonGrass(class_1294.field_5899, class_4970.class_2251.method_9630((class_4970)class_2246.field_10606).method_9634().method_9618().method_9626(class_2498.field_11535).method_22488()), ModItemGroup.MOD);
    public static final class_2248 BLUE_SPIDER_LILY = ModBlocks.resisterBlock("blue_spider_lily", (class_2248)new class_2356(class_1294.field_5926, 12, FabricBlockSettings.method_9630((class_4970)class_2246.field_10182).method_9618().method_22488()), ModItemGroup.MOD);
    public static final class_2248 ULTRAMARINE_CANDLE = ModBlocks.resisterBlock("ultramarine_candle", (class_2248)new class_5544(class_4970.class_2251.method_9639((class_3614)class_3614.field_15924, (class_3620)class_3620.field_16022).method_9632(0.1f).method_9626(class_2498.field_11543).method_9631(class_5544.field_27177)), ModItemGroup.MOD);
    public static final class_2248 ULTRAMARINE_CARPET = ModBlocks.resisterBlock("ultramarine_carpet", (class_2248)new ColorDyedCarpetBlock(ModDyeColor.ULTRAMARINE, class_4970.class_2251.method_9639((class_3614)class_3614.field_15957, (class_3620)class_3620.field_16022).method_9632(0.1f).method_9626(class_2498.field_11543)), ModItemGroup.MOD);
    public static final class_2248 ULTRAMARINE_CONCRETE = ModBlocks.resisterBlock("ultramarine_concrete", new class_2248(class_4970.class_2251.method_9637((class_3614)class_3614.field_15916).method_29292().method_9632(1.8f)), ModItemGroup.MOD);
    public static final class_2248 ULTRAMARINE_CONCRETE_POWDER = ModBlocks.resisterBlock("ultramarine_concrete_powder", (class_2248)new class_2292(ULTRAMARINE_CONCRETE, class_4970.class_2251.method_9639((class_3614)class_3614.field_15916, (class_3620)class_3620.field_16022).method_9632(0.5f).method_9626(class_2498.field_11526)), ModItemGroup.MOD);
    public static final class_2248 ULTRAMARINE_GLAZED_TERRACOTTA = ModBlocks.resisterBlock("ultramarine_glazed_terracotta", (class_2248)new class_2366((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 ULTRAMARINE_STAINED_GLASS = ModBlocks.resisterBlock("ultramarine_stained_glass", (class_2248)new class_2368((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15942).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(class_2498.field_11537)), ModItemGroup.MOD);
    public static final class_2248 ULTRAMARINE_STAINED_GLASS_PANE = ModBlocks.resisterBlock("ultramarine_stained_glass_pane", (class_2248)new ModStainedGlassPane(ModDyeColor.ULTRAMARINE, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15942).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(class_2498.field_11537)), ModItemGroup.MOD);
    public static final class_2248 ULTRAMARINE_TERRACOTTA = ModBlocks.resisterBlock("ultramarine_terracotta", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 ULTRAMARINE_WOOL = ModBlocks.resisterBlock("ultramarine_wool", new class_2248(class_4970.class_2251.method_9637((class_3614)class_3614.field_15931).method_9626(class_2498.field_11543)), ModItemGroup.MOD);
    public static final class_2248 ROSE = ModBlocks.resisterBlock("rose", (class_2248)new class_2356(class_1294.field_5926, 12, FabricBlockSettings.method_9630((class_4970)class_2246.field_10182).method_9618().method_22488()), ModItemGroup.MOD);
    public static final class_2248 ROSE_CANDLE = ModBlocks.resisterBlock("rose_candle", (class_2248)new class_5544(class_4970.class_2251.method_9639((class_3614)class_3614.field_15924, (class_3620)class_3620.field_16022).method_9632(0.1f).method_9626(class_2498.field_11543).method_9631(class_5544.field_27177)), ModItemGroup.MOD);
    public static final class_2248 ROSE_CARPET = ModBlocks.resisterBlock("rose_carpet", (class_2248)new ColorDyedCarpetBlock(ModDyeColor.ROSE, class_4970.class_2251.method_9639((class_3614)class_3614.field_15957, (class_3620)class_3620.field_16022).method_9632(0.1f).method_9626(class_2498.field_11543)), ModItemGroup.MOD);
    public static final class_2248 ROSE_CONCRETE = ModBlocks.resisterBlock("rose_concrete", new class_2248(class_4970.class_2251.method_9637((class_3614)class_3614.field_15916).method_29292().method_9632(1.8f)), ModItemGroup.MOD);
    public static final class_2248 ROSE_CONCRETE_POWDER = ModBlocks.resisterBlock("rose_concrete_powder", (class_2248)new class_2292(ROSE_CONCRETE, class_4970.class_2251.method_9639((class_3614)class_3614.field_15916, (class_3620)class_3620.field_16022).method_9632(0.5f).method_9626(class_2498.field_11526)), ModItemGroup.MOD);
    public static final class_2248 ROSE_GLAZED_TERRACOTTA = ModBlocks.resisterBlock("rose_glazed_terracotta", (class_2248)new class_2366((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 ROSE_STAINED_GLASS = ModBlocks.resisterBlock("rose_stained_glass", (class_2248)new class_2368((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15942).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(class_2498.field_11537)), ModItemGroup.MOD);
    public static final class_2248 ROSE_STAINED_GLASS_PANE = ModBlocks.resisterBlock("rose_stained_glass_pane", (class_2248)new ModStainedGlassPane(ModDyeColor.ROSE, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15942).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(class_2498.field_11537)), ModItemGroup.MOD);
    public static final class_2248 ROSE_TERRACOTTA = ModBlocks.resisterBlock("rose_terracotta", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 ROSE_WOOL = ModBlocks.resisterBlock("rose_wool", new class_2248(class_4970.class_2251.method_9637((class_3614)class_3614.field_15931).method_9626(class_2498.field_11543)), ModItemGroup.MOD);
    public static final class_2248 WOLFSBANE = ModBlocks.resisterBlock("wolfsbane", (class_2248)new class_2356(class_1294.field_5926, 12, FabricBlockSettings.method_9630((class_4970)class_2246.field_10182).method_9618().method_22488()), ModItemGroup.MOD);
    public static final class_2248 VIOLET_CANDLE = ModBlocks.resisterBlock("violet_candle", (class_2248)new class_5544(class_4970.class_2251.method_9639((class_3614)class_3614.field_15924, (class_3620)class_3620.field_16022).method_9632(0.1f).method_9626(class_2498.field_11543).method_9631(class_5544.field_27177)), ModItemGroup.MOD);
    public static final class_2248 VIOLET_CARPET = ModBlocks.resisterBlock("violet_carpet", (class_2248)new ColorDyedCarpetBlock(ModDyeColor.VIOLET, class_4970.class_2251.method_9639((class_3614)class_3614.field_15957, (class_3620)class_3620.field_16022).method_9632(0.1f).method_9626(class_2498.field_11543)), ModItemGroup.MOD);
    public static final class_2248 VIOLET_CONCRETE = ModBlocks.resisterBlock("violet_concrete", new class_2248(class_4970.class_2251.method_9637((class_3614)class_3614.field_15916).method_29292().method_9632(1.8f)), ModItemGroup.MOD);
    public static final class_2248 VIOLET_CONCRETE_POWDER = ModBlocks.resisterBlock("violet_concrete_powder", (class_2248)new class_2292(VIOLET_CONCRETE, class_4970.class_2251.method_9639((class_3614)class_3614.field_15916, (class_3620)class_3620.field_16022).method_9632(0.5f).method_9626(class_2498.field_11526)), ModItemGroup.MOD);
    public static final class_2248 VIOLET_GLAZED_TERRACOTTA = ModBlocks.resisterBlock("violet_glazed_terracotta", (class_2248)new class_2366((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 VIOLET_STAINED_GLASS = ModBlocks.resisterBlock("violet_stained_glass", (class_2248)new class_2368((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15942).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(class_2498.field_11537)), ModItemGroup.MOD);
    public static final class_2248 VIOLET_STAINED_GLASS_PANE = ModBlocks.resisterBlock("violet_stained_glass_pane", (class_2248)new ModStainedGlassPane(ModDyeColor.VIOLET, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15942).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(class_2498.field_11537)), ModItemGroup.MOD);
    public static final class_2248 VIOLET_TERRACOTTA = ModBlocks.resisterBlock("violet_terracotta", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 VIOLET_WOOL = ModBlocks.resisterBlock("violet_wool", new class_2248(class_4970.class_2251.method_9637((class_3614)class_3614.field_15931).method_9626(class_2498.field_11543)), ModItemGroup.MOD);
    public static final class_2248 NEW_GREEN_CANDLE = ModBlocks.resisterBlock("new_green_candle", (class_2248)new class_5544(class_4970.class_2251.method_9639((class_3614)class_3614.field_15924, (class_3620)class_3620.field_16022).method_9632(0.1f).method_9626(class_2498.field_11543).method_9631(class_5544.field_27177)), ModItemGroup.MOD);
    public static final class_2248 NEW_GREEN_CARPET = ModBlocks.resisterBlock("new_green_carpet", (class_2248)new ColorDyedCarpetBlock(ModDyeColor.NEW_GREEN, class_4970.class_2251.method_9639((class_3614)class_3614.field_15957, (class_3620)class_3620.field_16022).method_9632(0.1f).method_9626(class_2498.field_11543)), ModItemGroup.MOD);
    public static final class_2248 NEW_GREEN_CONCRETE = ModBlocks.resisterBlock("new_green_concrete", new class_2248(class_4970.class_2251.method_9637((class_3614)class_3614.field_15916).method_29292().method_9632(1.8f)), ModItemGroup.MOD);
    public static final class_2248 NEW_GREEN_CONCRETE_POWDER = ModBlocks.resisterBlock("new_green_concrete_powder", (class_2248)new class_2292(NEW_GREEN_CONCRETE, class_4970.class_2251.method_9639((class_3614)class_3614.field_15916, (class_3620)class_3620.field_16022).method_9632(0.5f).method_9626(class_2498.field_11526)), ModItemGroup.MOD);
    public static final class_2248 NEW_GREEN_GLAZED_TERRACOTTA = ModBlocks.resisterBlock("new_green_glazed_terracotta", (class_2248)new class_2366((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 NEW_GREEN_STAINED_GLASS = ModBlocks.resisterBlock("new_green_stained_glass", (class_2248)new class_2368((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15942).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(class_2498.field_11537)), ModItemGroup.MOD);
    public static final class_2248 NEW_GREEN_STAINED_GLASS_PANE = ModBlocks.resisterBlock("new_green_stained_glass_pane", (class_2248)new ModStainedGlassPane(ModDyeColor.NEW_GREEN, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15942).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(class_2498.field_11537)), ModItemGroup.MOD);
    public static final class_2248 NEW_GREEN_TERRACOTTA = ModBlocks.resisterBlock("new_green_terracotta", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 NEW_GREEN_WOOL = ModBlocks.resisterBlock("new_green_wool", new class_2248(class_4970.class_2251.method_9637((class_3614)class_3614.field_15931).method_9626(class_2498.field_11543)), ModItemGroup.MOD);
    public static final class_2248 SPRING_GREEN_CANDLE = ModBlocks.resisterBlock("spring_green_candle", (class_2248)new class_5544(class_4970.class_2251.method_9639((class_3614)class_3614.field_15924, (class_3620)class_3620.field_16022).method_9632(0.1f).method_9626(class_2498.field_11543).method_9631(class_5544.field_27177)), ModItemGroup.MOD);
    public static final class_2248 SPRING_GREEN_CARPET = ModBlocks.resisterBlock("spring_green_carpet", (class_2248)new ColorDyedCarpetBlock(ModDyeColor.SPRING_GREEN, class_4970.class_2251.method_9639((class_3614)class_3614.field_15957, (class_3620)class_3620.field_16022).method_9632(0.1f).method_9626(class_2498.field_11543)), ModItemGroup.MOD);
    public static final class_2248 SPRING_GREEN_CONCRETE = ModBlocks.resisterBlock("spring_green_concrete", new class_2248(class_4970.class_2251.method_9637((class_3614)class_3614.field_15916).method_29292().method_9632(1.8f)), ModItemGroup.MOD);
    public static final class_2248 SPRING_GREEN_CONCRETE_POWDER = ModBlocks.resisterBlock("spring_green_concrete_powder", (class_2248)new class_2292(SPRING_GREEN_CONCRETE, class_4970.class_2251.method_9639((class_3614)class_3614.field_15916, (class_3620)class_3620.field_16022).method_9632(0.5f).method_9626(class_2498.field_11526)), ModItemGroup.MOD);
    public static final class_2248 SPRING_GREEN_GLAZED_TERRACOTTA = ModBlocks.resisterBlock("spring_green_glazed_terracotta", (class_2248)new class_2366((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 SPRING_GREEN_STAINED_GLASS = ModBlocks.resisterBlock("spring_green_stained_glass", (class_2248)new class_2368((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15942).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(class_2498.field_11537)), ModItemGroup.MOD);
    public static final class_2248 SPRING_GREEN_STAINED_GLASS_PANE = ModBlocks.resisterBlock("spring_green_stained_glass_pane", (class_2248)new ModStainedGlassPane(ModDyeColor.SPRING_GREEN, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15942).nonOpaque().strength(0.5f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(class_2498.field_11537)), ModItemGroup.MOD);
    public static final class_2248 SPRING_GREEN_TERRACOTTA = ModBlocks.resisterBlock("spring_green_terracotta", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 SPRING_GREEN_WOOL = ModBlocks.resisterBlock("spring_green_wool", new class_2248(class_4970.class_2251.method_9637((class_3614)class_3614.field_15931).method_9626(class_2498.field_11543)), ModItemGroup.MOD);
    public static final class_2248 DIABASE = ModBlocks.resisterBlock("diabase", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 PUMICE = ModBlocks.resisterBlock("pumice", new LavaSponge((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 HOT_PUMICE = ModBlocks.resisterBlock("hot_pumice", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 LIMESTONE = ModBlocks.resisterBlock("limestone", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 SALT_BLOCK = ModBlocks.resisterBlock("salt_block", (class_2248)new class_2346((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.2f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 SHALE = ModBlocks.resisterBlock("shale", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 MARBLE = ModBlocks.resisterBlock("marble", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 MARBLE_STAIRS = ModBlocks.resisterBlock("marble_stairs", (class_2248)new class_2510(MARBLE.method_9564(), (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).sounds(class_2498.field_11544).strength(1.0f)), ModItemGroup.MOD);
    public static final class_2248 MARBLE_SLAB = ModBlocks.resisterBlock("marble_slab", (class_2248)new class_2482((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).sounds(class_2498.field_11544).strength(1.0f)), ModItemGroup.MOD);
    public static final class_2248 MARBLE_WALL = ModBlocks.resisterBlock("marble_wall", (class_2248)new class_2544((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 CHISELED_MARBLE_BRICKS = ModBlocks.resisterBlock("chiseled_marble_bricks", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 MARBLE_BRICKS = ModBlocks.resisterBlock("marble_bricks", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 MARBLE_BRICK_STAIRS = ModBlocks.resisterBlock("marble_brick_stairs", (class_2248)new class_2510(MARBLE_BRICKS.method_9564(), (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).sounds(class_2498.field_11544).strength(1.0f)), ModItemGroup.MOD);
    public static final class_2248 MARBLE_BRICK_SLAB = ModBlocks.resisterBlock("marble_brick_slab", (class_2248)new class_2482((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).sounds(class_2498.field_11544).strength(1.0f)), ModItemGroup.MOD);
    public static final class_2248 MARBLE_BRICK_WALL = ModBlocks.resisterBlock("marble_brick_wall", (class_2248)new class_2544((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 BEEF_ORE = ModBlocks.resisterBlock("beef_ore", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 CHICKEN_NUGGET_ORE = ModBlocks.resisterBlock("chicken_nugget_ore", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 DEEPSLATE_SILVER_ORE = ModBlocks.resisterBlock("deepslate_silver_ore", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 DEEPSLATE_TIN_ORE = ModBlocks.resisterBlock("deepslate_tin_ore", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 GRAPHITE_BLOCK = ModBlocks.resisterBlock("graphite_block", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 LIFE_ORE = ModBlocks.resisterBlock("life_ore", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(1.0f).requiresTool().sounds(ModSounds.ORE_SCREAM_SOUNDS)), ModItemGroup.MOD);
    public static final class_2248 LUCKY_ORE = ModBlocks.resisterBlock("lucky_ore", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 HELLSTONE_BLOCK = ModBlocks.resisterBlock("hellstone_block", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 RAW_PLATINUM_BLOCK = ModBlocks.resisterBlock("raw_platinum_block", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 QUAERITE = ModBlocks.resisterBlock("quaerite", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(4.0f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 RAW_BEEF_ORE = ModBlocks.resisterBlock("raw_beef_ore", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 RAW_CHICKEN_NUGGET_ORE = ModBlocks.resisterBlock("raw_chicken_nugget_ore", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(1.0f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 SILVER_ORE = ModBlocks.resisterBlock("silver_ore", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 TIN_ORE = ModBlocks.resisterBlock("tin_ore", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 RAW_TITANIUM_BLOCK = ModBlocks.resisterBlock("raw_titanium_block", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool()), ModItemGroup.MOD);
    public static final class_2248 CHOCOLATE_MILK_FLUID_BLOCK = ModBlocks.registerBlockWithoutBlockItem("chocolate_milk_fluid_block", (class_2248)new ModFluidBlock(ModFluids.CHOCOLATE_MILK_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MOD);
    public static final class_2248 HEATED_OIL_FLUID_BLOCK = ModBlocks.registerBlockWithoutBlockItem("heated_oil_fluid_block", (class_2248)new ModFluidBlock(ModFluids.HEATED_OIL_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).ticksRandomly().noCollision().nonOpaque().dropsNothing()), ModItemGroup.MOD);
    public static final class_2248 HONEY_FLUID_BLOCK = ModBlocks.registerBlockWithoutBlockItem("honey_fluid_block", (class_2248)new ModFluidBlock(ModFluids.HONEY_FLOWING, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).ticksRandomly().noCollision().nonOpaque().dropsNothing()), ModItemGroup.MOD);
    public static final class_2248 OIL_FLUID_BLOCK = ModBlocks.registerBlockWithoutBlockItem("oil_fluid_block", (class_2248)new ModFluidBlock(ModFluids.OIL_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MOD);
    public static final class_2248 CHICKEN_BLOCK = ModBlocks.resisterBlock("chicken_block", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f)), ModItemGroup.MOD);
    public static final class_2248 CHICKEN_SLAB = ModBlocks.resisterBlock("chicken_slab", (class_2248)new class_2482((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f)), ModItemGroup.MOD);
    public static final class_2248 RAW_CHICKEN_BLOCK = ModBlocks.resisterBlock("raw_chicken_block", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f)), ModItemGroup.MOD);
    public static final class_2248 RAW_CHICKEN_SLAB = ModBlocks.resisterBlock("raw_chicken_slab", (class_2248)new class_2482((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f)), ModItemGroup.MOD);
    public static final class_2248 BEEF_BLOCK = ModBlocks.resisterBlock("beef_block", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f)), ModItemGroup.MOD);
    public static final class_2248 BEEF_SLAB = ModBlocks.resisterBlock("beef_slab", (class_2248)new class_2482((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f)), ModItemGroup.MOD);
    public static final class_2248 RAW_BEEF_BLOCK = ModBlocks.resisterBlock("raw_beef_block", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f)), ModItemGroup.MOD);
    public static final class_2248 RAW_BEEF_SLAB = ModBlocks.resisterBlock("raw_beef_slab", (class_2248)new class_2482((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f)), ModItemGroup.MOD);
    public static final class_2248 INFESTED_MAGMA_BLOCK = ModBlocks.resisterBlock("infested_magma_block", new MagmiteInfestedBlock(class_4970.class_2251.method_9637((class_3614)class_3614.field_15914)), ModItemGroup.MOD);
    public static final class_2248 INFESTED_SCULK_BLOCK = ModBlocks.resisterBlock("infested_sculk_block", new SculkmiteInfestedBlock(class_4970.class_2251.method_9637((class_3614)class_3614.field_15914)), ModItemGroup.MOD);
    public static final class_2248 INFESTED_NETHERRACK_BLOCK = ModBlocks.resisterBlock("infested_netherrack_block", new HellmiteInfestedBlock(class_4970.class_2251.method_9637((class_3614)class_3614.field_15914)), ModItemGroup.MOD);
    public static final class_2248 INFESTED_HONEYCOMB_BLOCK = ModBlocks.resisterBlock("infested_honeycomb_block", new BeeInfestedBlock(class_2246.field_21212, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15936).strength(0.5f)), ModItemGroup.MOD);
    public static final class_2248 HONEY_HIVE = ModBlocks.resisterBlock("honey_hive", (class_2248)new QueenBeeSummonBlock(class_4970.class_2251.method_9637((class_3614)class_3614.field_15936).method_9632(0.5f).method_9626(class_2498.field_11547)), ModItemGroup.MOD);
    public static final class_2248 ROYAL_JELLY = ModBlocks.resisterBlock("royal_jelly", (class_2248)new class_4622((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15936).nonOpaque().strength(2.0f).suffocates(ModBlocks::never).blockVision(ModBlocks::never).sounds(class_2498.field_21214)), ModItemGroup.MOD);
    public static final class_2248 XRAY = ModBlocks.resisterBlock("xray", (class_2248)new XRay((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).breakInstantly()), ModItemGroup.MOD);
    public static final class_2248 MOD_BLOCK = ModBlocks.resisterBlock("mod_block", (class_2248)new ModBellBlock((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(0.5f)), ModItemGroup.TESTING);
    public static final class_2248 BACKPACK = ModBlocks.resisterBlock("backpack", (class_2248)new Backpack((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15931).strength(0.5f)), ModItemGroup.TESTING);
    public static final class_2248 MOD_PISTON_HEAD = ModBlocks.resisterBlock("mod_piston_head", (class_2248)new ModPistonHeadBlock(class_4970.class_2251.method_9637((class_3614)class_3614.field_15933).method_9632(1.5f).method_42327()), ModItemGroup.TESTING);
    public static final class_2248 MOD_MOVING_PISTON = ModBlocks.resisterBlock("mod_moving_piston", (class_2248)new ModPistonExtensionBlock(class_4970.class_2251.method_9637((class_3614)class_3614.field_15933).method_9632(-1.0f).method_9624().method_42327().method_22488().method_26236(ModBlocks::never).method_26243(ModBlocks::never).method_26245(ModBlocks::never)), ModItemGroup.TESTING);

    private static Boolean always(class_2680 state, class_1922 world, class_2338 pos, class_1299<?> type) {
        return true;
    }

    private static boolean always(class_2680 state, class_1922 world, class_2338 pos) {
        return true;
    }

    private static boolean never(class_2680 state, class_1922 world, class_2338 pos) {
        return false;
    }

    private static class_2248 registerBlockWithoutBlockItem(String name, class_2248 block, class_1761 group) {
        return (class_2248)class_2378.method_10230((class_2378)class_7923.field_41175, (class_2960)new class_2960("hmh2", name), (Object)block);
    }

    private static class_2480 createShulkerBoxBlock(class_1767 color, class_4970.class_2251 settings) {
        class_4970.class_4973 contextPredicate = (state, world, pos) -> {
            class_2586 blockEntity = world.method_8321(pos);
            if (!(blockEntity instanceof class_2627)) {
                return true;
            }
            class_2627 shulkerBoxBlockEntity = (class_2627)blockEntity;
            return shulkerBoxBlockEntity.method_27093();
        };
        return new class_2480(color, settings.method_9632(2.0f).method_9624().method_22488().method_26243(contextPredicate).method_26245(contextPredicate));
    }

    private static ModPistonBlock createPistonBlock(boolean gluey) {
        class_4970.class_4973 contextPredicate = (state, world, pos) -> (Boolean)state.method_11654((class_2769)ModPistonBlock.EXTENDED) == false;
        return new ModPistonBlock(gluey, class_4970.class_2251.method_9637((class_3614)class_3614.field_15933).method_9632(1.5f).method_26243(contextPredicate).method_26245(contextPredicate));
    }

    private static class_2248 resisterBlock(String name, class_2248 block, class_1761 group) {
        ModBlocks.registerBlockItem(name, block, group);
        return (class_2248)class_2378.method_10230((class_2378)class_7923.field_41175, (class_2960)new class_2960("hmh2", name), (Object)block);
    }

    private static class_1792 registerBlockItem(String name, class_2248 block, class_1761 group) {
        class_1792 item = (class_1792)class_2378.method_10230((class_2378)class_7923.field_41178, (class_2960)new class_2960("hmh2", name), (Object)new class_1747(block, (class_1792.class_1793)new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent((class_1761)group).register(entries -> entries.method_45421((class_1935)item));
        return item;
    }

    public static void registerModBlock() {
        Hmh2.LOGGER.info("Registering ModBlocks for hmh2");
    }
}

