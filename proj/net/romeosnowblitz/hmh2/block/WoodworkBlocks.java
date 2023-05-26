/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.item.v1.FabricItemSettings
 *  net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
 *  net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings
 *  net.minecraft.class_1299
 *  net.minecraft.class_1747
 *  net.minecraft.class_1761
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1922
 *  net.minecraft.class_1935
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2269
 *  net.minecraft.class_2323
 *  net.minecraft.class_2338
 *  net.minecraft.class_2349
 *  net.minecraft.class_2354
 *  net.minecraft.class_2378
 *  net.minecraft.class_2397
 *  net.minecraft.class_2440
 *  net.minecraft.class_2440$class_2441
 *  net.minecraft.class_2465
 *  net.minecraft.class_2473
 *  net.minecraft.class_2482
 *  net.minecraft.class_2498
 *  net.minecraft.class_2508
 *  net.minecraft.class_2510
 *  net.minecraft.class_2533
 *  net.minecraft.class_2551
 *  net.minecraft.class_2647
 *  net.minecraft.class_2680
 *  net.minecraft.class_2960
 *  net.minecraft.class_2975
 *  net.minecraft.class_3614
 *  net.minecraft.class_3620
 *  net.minecraft.class_4719
 *  net.minecraft.class_4970
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5321
 *  net.minecraft.class_5819
 *  net.minecraft.class_7923
 *  net.minecraft.class_8177
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.class_1299;
import net.minecraft.class_1747;
import net.minecraft.class_1761;
import net.minecraft.class_1792;
import net.minecraft.class_1922;
import net.minecraft.class_1935;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2269;
import net.minecraft.class_2323;
import net.minecraft.class_2338;
import net.minecraft.class_2349;
import net.minecraft.class_2354;
import net.minecraft.class_2378;
import net.minecraft.class_2397;
import net.minecraft.class_2440;
import net.minecraft.class_2465;
import net.minecraft.class_2473;
import net.minecraft.class_2482;
import net.minecraft.class_2498;
import net.minecraft.class_2508;
import net.minecraft.class_2510;
import net.minecraft.class_2533;
import net.minecraft.class_2551;
import net.minecraft.class_2647;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_2975;
import net.minecraft.class_3614;
import net.minecraft.class_3620;
import net.minecraft.class_4719;
import net.minecraft.class_4970;
import net.minecraft.class_5321;
import net.minecraft.class_5819;
import net.minecraft.class_7923;
import net.minecraft.class_8177;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.item.ModItemGroup;
import net.romeosnowblitz.hmh2.world.feature.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class WoodworkBlocks {
    public static final class_2248 BANANA_SAPLING = WoodworkBlocks.resisterBlock("banana_sapling", (class_2248)new class_2473(new class_2647(){

        @Nullable
        protected class_5321<class_2975<?, ?>> method_11430(class_5819 random, boolean bees) {
            return ModConfiguredFeatures.BANANA_KEY;
        }
    }, FabricBlockSettings.method_9630((class_4970)class_2246.field_10394).method_9626(class_2498.field_11535)), ModItemGroup.WOODWORKS);
    public static final class_2248 BANANA_LOG = WoodworkBlocks.resisterBlock("banana_log", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10431)), ModItemGroup.WOODWORKS);
    public static final class_2248 BANANA_LEAVES = WoodworkBlocks.resisterBlock("banana_leaves", (class_2248)new class_2397(FabricBlockSettings.method_9630((class_4970)class_2246.field_10503).method_26243(WoodworkBlocks::never).method_26245(WoodworkBlocks::never)), ModItemGroup.WOODWORKS);
    public static final class_2248 BANANA_PLANKS = WoodworkBlocks.resisterBlock("banana_planks", new class_2248(FabricBlockSettings.method_9630((class_4970)class_2246.field_10161)), ModItemGroup.WOODWORKS);
    public static final class_2248 BANANA_WOOD = WoodworkBlocks.resisterBlock("banana_wood", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10126)), ModItemGroup.WOODWORKS);
    public static final class_2248 STRIPPED_BANANA_LOG = WoodworkBlocks.resisterBlock("stripped_banana_log", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10519)), ModItemGroup.WOODWORKS);
    public static final class_2248 STRIPPED_BANANA_WOOD = WoodworkBlocks.resisterBlock("stripped_banana_wood", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10250)), ModItemGroup.WOODWORKS);
    public static final class_2248 BANANA_SLAB = WoodworkBlocks.resisterBlock("banana_slab", (class_2248)new class_2482((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 BANANA_STAIRS = WoodworkBlocks.resisterBlock("banana_stairs", (class_2248)new class_2510(BANANA_LOG.method_9564(), (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 BANANA_DOOR = WoodworkBlocks.resisterBlock("banana_door", (class_2248)new class_2323((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932, (class_3620)class_2246.field_10161.method_26403()).strength(3.0f).sounds(class_2498.field_11547).nonOpaque(), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 BANANA_TRAPDOOR = WoodworkBlocks.resisterBlock("banana_trapdoor", (class_2248)new class_2533((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f).nonOpaque(), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 BANANA_BUTTON = WoodworkBlocks.resisterBlock("banana_button", (class_2248)WoodworkBlocks.createStoneButtonBlock(), ModItemGroup.WOODWORKS);
    public static final class_2248 BANANA_PRESSURE_PLATE = WoodworkBlocks.resisterBlock("banana_pressure_plate", (class_2248)new class_2440(class_2440.class_2441.field_11361, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 BANANA_FENCE = WoodworkBlocks.resisterBlock("banana_fence", (class_2248)new class_2354((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 BANANA_FENCE_GATE = WoodworkBlocks.resisterBlock("banana_fence_gate", (class_2248)new class_2349((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932, (class_3620)class_2246.field_10161.method_26403()).strength(2.0f, 3.0f).sounds(class_2498.field_11547), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 BANANA_WALL_SIGN_BLOCK = WoodworkBlocks.registerBlockWithoutBlockItem("banana_wall_sign", (class_2248)new class_2551(FabricBlockSettings.method_9630((class_4970)class_2246.field_10187), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 BANANA_SIGN_BLOCK = WoodworkBlocks.registerBlockWithoutBlockItem("banana_sign", (class_2248)new class_2508(FabricBlockSettings.method_9630((class_4970)class_2246.field_10121), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_SAPLING = WoodworkBlocks.resisterBlock("cherry_sapling", (class_2248)new class_2473(new class_2647(){

        @Nullable
        protected class_5321<class_2975<?, ?>> method_11430(class_5819 random, boolean bees) {
            return ModConfiguredFeatures.CHERRY_KEY;
        }
    }, FabricBlockSettings.method_9630((class_4970)class_2246.field_10394).method_9626(class_2498.field_11535)), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_LOG = WoodworkBlocks.resisterBlock("cherry_log", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10431)), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_LEAVES = WoodworkBlocks.resisterBlock("cherry_leaves", (class_2248)new class_2397(FabricBlockSettings.method_9630((class_4970)class_2246.field_10503).method_26243(WoodworkBlocks::never).method_26245(WoodworkBlocks::never)), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_PLANKS = WoodworkBlocks.resisterBlock("cherry_planks", new class_2248(FabricBlockSettings.method_9630((class_4970)class_2246.field_10161)), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_WOOD = WoodworkBlocks.resisterBlock("cherry_wood", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10126)), ModItemGroup.WOODWORKS);
    public static final class_2248 STRIPPED_CHERRY_LOG = WoodworkBlocks.resisterBlock("stripped_cherry_log", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10519)), ModItemGroup.WOODWORKS);
    public static final class_2248 STRIPPED_CHERRY_WOOD = WoodworkBlocks.resisterBlock("stripped_cherry_wood", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10250)), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_SLAB = WoodworkBlocks.resisterBlock("cherry_slab", (class_2248)new class_2482((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_STAIRS = WoodworkBlocks.resisterBlock("cherry_stairs", (class_2248)new class_2510(CHERRY_LOG.method_9564(), (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_DOOR = WoodworkBlocks.resisterBlock("cherry_door", (class_2248)new class_2323((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932, (class_3620)class_2246.field_10161.method_26403()).strength(3.0f).sounds(class_2498.field_11547).nonOpaque(), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_TRAPDOOR = WoodworkBlocks.resisterBlock("cherry_trapdoor", (class_2248)new class_2533((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f).nonOpaque(), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_BUTTON = WoodworkBlocks.resisterBlock("cherry_button", (class_2248)WoodworkBlocks.createStoneButtonBlock(), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_PRESSURE_PLATE = WoodworkBlocks.resisterBlock("cherry_pressure_plate", (class_2248)new class_2440(class_2440.class_2441.field_11361, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_FENCE = WoodworkBlocks.resisterBlock("cherry_fence", (class_2248)new class_2354((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_FENCE_GATE = WoodworkBlocks.resisterBlock("cherry_fence_gate", (class_2248)new class_2349((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932, (class_3620)class_2246.field_10161.method_26403()).strength(2.0f, 3.0f).sounds(class_2498.field_11547), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_WALL_SIGN_BLOCK = WoodworkBlocks.registerBlockWithoutBlockItem("cherry_wall_sign", (class_2248)new class_2551(FabricBlockSettings.method_9630((class_4970)class_2246.field_10187), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 CHERRY_SIGN_BLOCK = WoodworkBlocks.registerBlockWithoutBlockItem("cherry_sign", (class_2248)new class_2508(FabricBlockSettings.method_9630((class_4970)class_2246.field_10121), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_SAPLING = WoodworkBlocks.resisterBlock("cork_oak_sapling", (class_2248)new class_2473(new class_2647(){

        @Nullable
        protected class_5321<class_2975<?, ?>> method_11430(class_5819 random, boolean bees) {
            return ModConfiguredFeatures.CORK_OAK_KEY;
        }
    }, FabricBlockSettings.method_9630((class_4970)class_2246.field_10394).method_9626(class_2498.field_11535)), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_LOG = WoodworkBlocks.resisterBlock("cork_oak_log", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10431)), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_LEAVES = WoodworkBlocks.resisterBlock("cork_oak_leaves", (class_2248)new class_2397(FabricBlockSettings.method_9630((class_4970)class_2246.field_10503).method_26243(WoodworkBlocks::never).method_26245(WoodworkBlocks::never)), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_PLANKS = WoodworkBlocks.resisterBlock("cork_oak_planks", new class_2248(FabricBlockSettings.method_9630((class_4970)class_2246.field_10161)), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_WOOD = WoodworkBlocks.resisterBlock("cork_oak_wood", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10126)), ModItemGroup.WOODWORKS);
    public static final class_2248 STRIPPED_CORK_OAK_LOG = WoodworkBlocks.resisterBlock("stripped_cork_oak_log", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10519)), ModItemGroup.WOODWORKS);
    public static final class_2248 STRIPPED_CORK_OAK_WOOD = WoodworkBlocks.resisterBlock("stripped_cork_oak_wood", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10250)), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_SLAB = WoodworkBlocks.resisterBlock("cork_oak_slab", (class_2248)new class_2482((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_STAIRS = WoodworkBlocks.resisterBlock("cork_oak_stairs", (class_2248)new class_2510(CORK_OAK_LOG.method_9564(), (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_DOOR = WoodworkBlocks.resisterBlock("cork_oak_door", (class_2248)new class_2323((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932, (class_3620)class_2246.field_10161.method_26403()).strength(3.0f).sounds(class_2498.field_11547).nonOpaque(), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_TRAPDOOR = WoodworkBlocks.resisterBlock("cork_oak_trapdoor", (class_2248)new class_2533((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f).nonOpaque(), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_BUTTON = WoodworkBlocks.resisterBlock("cork_oak_button", (class_2248)WoodworkBlocks.createStoneButtonBlock(), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_PRESSURE_PLATE = WoodworkBlocks.resisterBlock("cork_oak_pressure_plate", (class_2248)new class_2440(class_2440.class_2441.field_11361, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_FENCE = WoodworkBlocks.resisterBlock("cork_oak_fence", (class_2248)new class_2354((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_FENCE_GATE = WoodworkBlocks.resisterBlock("cork_oak_fence_gate", (class_2248)new class_2349((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932, (class_3620)class_2246.field_10161.method_26403()).strength(2.0f, 3.0f).sounds(class_2498.field_11547), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_WALL_SIGN_BLOCK = WoodworkBlocks.registerBlockWithoutBlockItem("cork_oak_wall_sign", (class_2248)new class_2551(FabricBlockSettings.method_9630((class_4970)class_2246.field_10187), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 CORK_OAK_SIGN_BLOCK = WoodworkBlocks.registerBlockWithoutBlockItem("cork_oak_sign", (class_2248)new class_2508(FabricBlockSettings.method_9630((class_4970)class_2246.field_10121), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_SAPLING = WoodworkBlocks.resisterBlock("jacaranda_sapling", (class_2248)new class_2473(new class_2647(){

        @Nullable
        protected class_5321<class_2975<?, ?>> method_11430(class_5819 random, boolean bees) {
            return ModConfiguredFeatures.JACARANDA_KEY;
        }
    }, FabricBlockSettings.method_9630((class_4970)class_2246.field_10394).method_9626(class_2498.field_11535)), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_LOG = WoodworkBlocks.resisterBlock("jacaranda_log", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10431)), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_LEAVES = WoodworkBlocks.resisterBlock("jacaranda_leaves", (class_2248)new class_2397(FabricBlockSettings.method_9630((class_4970)class_2246.field_10503).method_26243(WoodworkBlocks::never).method_26245(WoodworkBlocks::never)), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_PLANKS = WoodworkBlocks.resisterBlock("jacaranda_planks", new class_2248(FabricBlockSettings.method_9630((class_4970)class_2246.field_10161)), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_WOOD = WoodworkBlocks.resisterBlock("jacaranda_wood", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10126)), ModItemGroup.WOODWORKS);
    public static final class_2248 STRIPPED_JACARANDA_LOG = WoodworkBlocks.resisterBlock("stripped_jacaranda_log", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10519)), ModItemGroup.WOODWORKS);
    public static final class_2248 STRIPPED_JACARANDA_WOOD = WoodworkBlocks.resisterBlock("stripped_jacaranda_wood", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10250)), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_SLAB = WoodworkBlocks.resisterBlock("jacaranda_slab", (class_2248)new class_2482((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_STAIRS = WoodworkBlocks.resisterBlock("jacaranda_stairs", (class_2248)new class_2510(JACARANDA_LOG.method_9564(), (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_DOOR = WoodworkBlocks.resisterBlock("jacaranda_door", (class_2248)new class_2323((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932, (class_3620)class_2246.field_10161.method_26403()).strength(3.0f).sounds(class_2498.field_11547).nonOpaque(), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_TRAPDOOR = WoodworkBlocks.resisterBlock("jacaranda_trapdoor", (class_2248)new class_2533((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f).nonOpaque(), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_BUTTON = WoodworkBlocks.resisterBlock("jacaranda_button", (class_2248)WoodworkBlocks.createStoneButtonBlock(), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_PRESSURE_PLATE = WoodworkBlocks.resisterBlock("jacaranda_pressure_plate", (class_2248)new class_2440(class_2440.class_2441.field_11361, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_FENCE = WoodworkBlocks.resisterBlock("jacaranda_fence", (class_2248)new class_2354((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_FENCE_GATE = WoodworkBlocks.resisterBlock("jacaranda_fence_gate", (class_2248)new class_2349((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932, (class_3620)class_2246.field_10161.method_26403()).strength(2.0f, 3.0f).sounds(class_2498.field_11547), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_WALL_SIGN_BLOCK = WoodworkBlocks.registerBlockWithoutBlockItem("jacaranda_wall_sign", (class_2248)new class_2551(FabricBlockSettings.method_9630((class_4970)class_2246.field_10187), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 JACARANDA_SIGN_BLOCK = WoodworkBlocks.registerBlockWithoutBlockItem("jacaranda_sign", (class_2248)new class_2508(FabricBlockSettings.method_9630((class_4970)class_2246.field_10121), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_SAPLING = WoodworkBlocks.resisterBlock("mango_sapling", (class_2248)new class_2473(new class_2647(){

        @Nullable
        protected class_5321<class_2975<?, ?>> method_11430(class_5819 random, boolean bees) {
            return ModConfiguredFeatures.MANGO_KEY;
        }
    }, FabricBlockSettings.method_9630((class_4970)class_2246.field_10394).method_9626(class_2498.field_11535)), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_LOG = WoodworkBlocks.resisterBlock("mango_log", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10431)), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_LEAVES = WoodworkBlocks.resisterBlock("mango_leaves", (class_2248)new class_2397(FabricBlockSettings.method_9630((class_4970)class_2246.field_10503).method_26243(WoodworkBlocks::never).method_26245(WoodworkBlocks::never)), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_PLANKS = WoodworkBlocks.resisterBlock("mango_planks", new class_2248(FabricBlockSettings.method_9630((class_4970)class_2246.field_10161)), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_WOOD = WoodworkBlocks.resisterBlock("mango_wood", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10126)), ModItemGroup.WOODWORKS);
    public static final class_2248 STRIPPED_MANGO_LOG = WoodworkBlocks.resisterBlock("stripped_mango_log", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10519)), ModItemGroup.WOODWORKS);
    public static final class_2248 STRIPPED_MANGO_WOOD = WoodworkBlocks.resisterBlock("stripped_mango_wood", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10250)), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_SLAB = WoodworkBlocks.resisterBlock("mango_slab", (class_2248)new class_2482((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_STAIRS = WoodworkBlocks.resisterBlock("mango_stairs", (class_2248)new class_2510(MANGO_LOG.method_9564(), (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_DOOR = WoodworkBlocks.resisterBlock("mango_door", (class_2248)new class_2323((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932, (class_3620)class_2246.field_10161.method_26403()).strength(3.0f).sounds(class_2498.field_11547).nonOpaque(), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_TRAPDOOR = WoodworkBlocks.resisterBlock("mango_trapdoor", (class_2248)new class_2533((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f).nonOpaque(), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_BUTTON = WoodworkBlocks.resisterBlock("mango_button", (class_2248)WoodworkBlocks.createStoneButtonBlock(), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_PRESSURE_PLATE = WoodworkBlocks.resisterBlock("mango_pressure_plate", (class_2248)new class_2440(class_2440.class_2441.field_11361, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_FENCE = WoodworkBlocks.resisterBlock("mango_fence", (class_2248)new class_2354((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_FENCE_GATE = WoodworkBlocks.resisterBlock("mango_fence_gate", (class_2248)new class_2349((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932, (class_3620)class_2246.field_10161.method_26403()).strength(2.0f, 3.0f).sounds(class_2498.field_11547), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_WALL_SIGN_BLOCK = WoodworkBlocks.registerBlockWithoutBlockItem("mango_wall_sign", (class_2248)new class_2551(FabricBlockSettings.method_9630((class_4970)class_2246.field_10187), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 MANGO_SIGN_BLOCK = WoodworkBlocks.registerBlockWithoutBlockItem("mango_sign", (class_2248)new class_2508(FabricBlockSettings.method_9630((class_4970)class_2246.field_10121), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_SAPLING = WoodworkBlocks.resisterBlock("mahoe_sapling", (class_2248)new class_2473(new class_2647(){

        @Nullable
        protected class_5321<class_2975<?, ?>> method_11430(class_5819 random, boolean bees) {
            return ModConfiguredFeatures.MAHOE_KEY;
        }
    }, FabricBlockSettings.method_9630((class_4970)class_2246.field_10394).method_9626(class_2498.field_11535)), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_LOG = WoodworkBlocks.resisterBlock("mahoe_log", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10431)), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_LEAVES = WoodworkBlocks.resisterBlock("mahoe_leaves", (class_2248)new class_2397(FabricBlockSettings.method_9630((class_4970)class_2246.field_10503).method_26243(WoodworkBlocks::never).method_26245(WoodworkBlocks::never)), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_PLANKS = WoodworkBlocks.resisterBlock("mahoe_planks", new class_2248(FabricBlockSettings.method_9630((class_4970)class_2246.field_10161)), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_WOOD = WoodworkBlocks.resisterBlock("mahoe_wood", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10126)), ModItemGroup.WOODWORKS);
    public static final class_2248 STRIPPED_MAHOE_LOG = WoodworkBlocks.resisterBlock("stripped_mahoe_log", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10519)), ModItemGroup.WOODWORKS);
    public static final class_2248 STRIPPED_MAHOE_WOOD = WoodworkBlocks.resisterBlock("stripped_mahoe_wood", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10250)), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_SLAB = WoodworkBlocks.resisterBlock("mahoe_slab", (class_2248)new class_2482((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_STAIRS = WoodworkBlocks.resisterBlock("mahoe_stairs", (class_2248)new class_2510(MAHOE_LOG.method_9564(), (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_DOOR = WoodworkBlocks.resisterBlock("mahoe_door", (class_2248)new class_2323((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932, (class_3620)class_2246.field_10161.method_26403()).strength(3.0f).sounds(class_2498.field_11547).nonOpaque(), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_TRAPDOOR = WoodworkBlocks.resisterBlock("mahoe_trapdoor", (class_2248)new class_2533((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f).nonOpaque(), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_BUTTON = WoodworkBlocks.resisterBlock("mahoe_button", (class_2248)WoodworkBlocks.createStoneButtonBlock(), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_PRESSURE_PLATE = WoodworkBlocks.resisterBlock("mahoe_pressure_plate", (class_2248)new class_2440(class_2440.class_2441.field_11361, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_FENCE = WoodworkBlocks.resisterBlock("mahoe_fence", (class_2248)new class_2354((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_FENCE_GATE = WoodworkBlocks.resisterBlock("mahoe_fence_gate", (class_2248)new class_2349((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932, (class_3620)class_2246.field_10161.method_26403()).strength(2.0f, 3.0f).sounds(class_2498.field_11547), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_WALL_SIGN_BLOCK = WoodworkBlocks.registerBlockWithoutBlockItem("mahoe_wall_sign", (class_2248)new class_2551(FabricBlockSettings.method_9630((class_4970)class_2246.field_10187), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 MAHOE_SIGN_BLOCK = WoodworkBlocks.registerBlockWithoutBlockItem("mahoe_sign", (class_2248)new class_2508(FabricBlockSettings.method_9630((class_4970)class_2246.field_10121), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_SAPLING = WoodworkBlocks.resisterBlock("willow_sapling", (class_2248)new class_2473(new class_2647(){

        @Nullable
        protected class_5321<class_2975<?, ?>> method_11430(class_5819 random, boolean bees) {
            return ModConfiguredFeatures.WILLOW_KEY;
        }
    }, FabricBlockSettings.method_9630((class_4970)class_2246.field_10394).method_9626(class_2498.field_11535)), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_LOG = WoodworkBlocks.resisterBlock("willow_log", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10431)), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_LEAVES = WoodworkBlocks.resisterBlock("willow_leaves", (class_2248)new class_2397(FabricBlockSettings.method_9630((class_4970)class_2246.field_10503).method_26243(WoodworkBlocks::never).method_26245(WoodworkBlocks::never)), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_PLANKS = WoodworkBlocks.resisterBlock("willow_planks", new class_2248(FabricBlockSettings.method_9630((class_4970)class_2246.field_10161)), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_WOOD = WoodworkBlocks.resisterBlock("willow_wood", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10126)), ModItemGroup.WOODWORKS);
    public static final class_2248 STRIPPED_WILLOW_LOG = WoodworkBlocks.resisterBlock("stripped_willow_log", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10519)), ModItemGroup.WOODWORKS);
    public static final class_2248 STRIPPED_WILLOW_WOOD = WoodworkBlocks.resisterBlock("stripped_willow_wood", (class_2248)new class_2465(FabricBlockSettings.method_9630((class_4970)class_2246.field_10250)), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_SLAB = WoodworkBlocks.resisterBlock("willow_slab", (class_2248)new class_2482((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_STAIRS = WoodworkBlocks.resisterBlock("willow_stairs", (class_2248)new class_2510(WILLOW_LOG.method_9564(), (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_DOOR = WoodworkBlocks.resisterBlock("willow_door", (class_2248)new class_2323((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932, (class_3620)class_2246.field_10161.method_26403()).strength(3.0f).sounds(class_2498.field_11547).nonOpaque(), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_TRAPDOOR = WoodworkBlocks.resisterBlock("willow_trapdoor", (class_2248)new class_2533((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f).nonOpaque(), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_BUTTON = WoodworkBlocks.resisterBlock("willow_button", (class_2248)WoodworkBlocks.createStoneButtonBlock(), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_PRESSURE_PLATE = WoodworkBlocks.resisterBlock("willow_pressure_plate", (class_2248)new class_2440(class_2440.class_2441.field_11361, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f), class_8177.field_42823), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_FENCE = WoodworkBlocks.resisterBlock("willow_fence", (class_2248)new class_2354((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932).sounds(class_2498.field_11547).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_FENCE_GATE = WoodworkBlocks.resisterBlock("willow_fence_gate", (class_2248)new class_2349((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15932, (class_3620)class_2246.field_10161.method_26403()).strength(2.0f, 3.0f).sounds(class_2498.field_11547), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_WALL_SIGN_BLOCK = WoodworkBlocks.registerBlockWithoutBlockItem("willow_wall_sign", (class_2248)new class_2551(FabricBlockSettings.method_9630((class_4970)class_2246.field_10187), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 WILLOW_SIGN_BLOCK = WoodworkBlocks.registerBlockWithoutBlockItem("willow_sign", (class_2248)new class_2508(FabricBlockSettings.method_9630((class_4970)class_2246.field_10121), class_4719.field_21676), ModItemGroup.WOODWORKS);
    public static final class_2248 UNBREAKABLE_BLOCK = WoodworkBlocks.resisterBlock("unbreakable_block", new class_2248((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(-1.0f, 3600000.0f).dropsNothing()), ModItemGroup.WOODWORKS);
    public static final class_2248 UNBREAKABLE_LEAVES = WoodworkBlocks.resisterBlock("unbreakable_leaves", (class_2248)new class_2397(FabricBlockSettings.method_9630((class_4970)class_2246.field_10503).method_9629(-1.0f, 3600000.0f).method_42327()), ModItemGroup.WOODWORKS);

    private static Boolean always(class_2680 state, class_1922 world, class_2338 pos, class_1299<?> type) {
        return true;
    }

    private static boolean never(class_2680 state, class_1922 world, class_2338 pos) {
        return false;
    }

    private static class_2248 registerBlockWithoutBlockItem(String name, class_2248 block, class_1761 group) {
        return (class_2248)class_2378.method_10230((class_2378)class_7923.field_41175, (class_2960)new class_2960("hmh2", name), (Object)block);
    }

    private static class_2248 resisterBlock(String name, class_2248 block, class_1761 group) {
        WoodworkBlocks.registerBlockItem(name, block, group);
        return (class_2248)class_2378.method_10230((class_2378)class_7923.field_41175, (class_2960)new class_2960("hmh2", name), (Object)block);
    }

    private static class_1792 registerBlockItem(String name, class_2248 block, class_1761 group) {
        class_1792 item = (class_1792)class_2378.method_10230((class_2378)class_7923.field_41178, (class_2960)new class_2960("hmh2", name), (Object)new class_1747(block, (class_1792.class_1793)new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent((class_1761)group).register(entries -> entries.method_45421((class_1935)item));
        return item;
    }

    private static class_2269 createStoneButtonBlock() {
        return new class_2269(class_4970.class_2251.method_9637((class_3614)class_3614.field_15924).method_9634().method_9632(0.5f).method_9626(class_2498.field_11544), class_8177.field_42823, 20, false);
    }

    public static void registerModBlock() {
        Hmh2.LOGGER.info("Registering ModBlocks for hmh2");
    }
}

