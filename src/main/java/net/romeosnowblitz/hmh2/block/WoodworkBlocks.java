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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.woodworks.*;
import net.romeosnowblitz.hmh2.entity.ModSignTypes;
import net.romeosnowblitz.hmh2.item.ModItemGroup;
import net.romeosnowblitz.hmh2.world.feature.tree.*;

public class WoodworkBlocks {

    //Trees (16)
    public static final Block BANANA_SAPLING = resisterBlock("banana_sapling", new ModSaplingBlock(new BananaSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.WOODWORKS);
    public static final Block BANANA_LOG = resisterBlock("banana_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.WOODWORKS);
    public static final Block BANANA_LEAVES = resisterBlock("banana_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).suffocates(WoodworkBlocks::never).blockVision(WoodworkBlocks::never)), ModItemGroup.WOODWORKS);
    public static final Block BANANA_PLANKS = resisterBlock("banana_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.WOODWORKS);
    public static final Block BANANA_WOOD = resisterBlock("banana_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.WOODWORKS);
    public static final Block STRIPPED_BANANA_LOG = resisterBlock("stripped_banana_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.WOODWORKS);
    public static final Block STRIPPED_BANANA_WOOD = resisterBlock("stripped_banana_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.WOODWORKS);
    public static final Block BANANA_SLAB = resisterBlock("banana_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block BANANA_STAIRS = resisterBlock("banana_stairs", new ModStairsBlock(WoodworkBlocks.BANANA_LOG.getDefaultState(), FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block BANANA_DOOR = resisterBlock("banana_door", new ModDoorBlock(FabricBlockSettings.of(Material.WOOD, Blocks.OAK_PLANKS.getDefaultMapColor()).strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN), ModItemGroup.WOODWORKS);
    public static final Block BANANA_TRAPDOOR = resisterBlock("banana_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f).nonOpaque(), SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN), ModItemGroup.WOODWORKS);
    public static final Block BANANA_BUTTON = resisterBlock("banana_button", createStoneButtonBlock(), ModItemGroup.WOODWORKS);
    public static final Block BANANA_PRESSURE_PLATE = resisterBlock("banana_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f), SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON), ModItemGroup.WOODWORKS);
    public static final Block BANANA_FENCE = resisterBlock("banana_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block BANANA_FENCE_GATE = resisterBlock("banana_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD, Blocks.OAK_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN), ModItemGroup.WOODWORKS);
    public static final Block BANANA_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("banana_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.BANANA), ModItemGroup.WOODWORKS);
    public static final Block BANANA_SIGN_BLOCK = registerBlockWithoutBlockItem("banana_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.BANANA), ModItemGroup.WOODWORKS);

    public static final Block CHERRY_SAPLING = resisterBlock("cherry_sapling", new ModSaplingBlock(new CherrySaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.WOODWORKS);
    public static final Block CHERRY_LOG = resisterBlock("cherry_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.WOODWORKS);
    public static final Block CHERRY_LEAVES = resisterBlock("cherry_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).suffocates(WoodworkBlocks::never).blockVision(WoodworkBlocks::never)), ModItemGroup.WOODWORKS);
    public static final Block CHERRY_PLANKS = resisterBlock("cherry_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.WOODWORKS);
    public static final Block CHERRY_WOOD = resisterBlock("cherry_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.WOODWORKS);
    public static final Block STRIPPED_CHERRY_LOG = resisterBlock("stripped_cherry_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.WOODWORKS);
    public static final Block STRIPPED_CHERRY_WOOD = resisterBlock("stripped_cherry_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.WOODWORKS);
    public static final Block CHERRY_SLAB = resisterBlock("cherry_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block CHERRY_STAIRS = resisterBlock("cherry_stairs", new ModStairsBlock(WoodworkBlocks.CHERRY_LOG.getDefaultState(), FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block CHERRY_DOOR = resisterBlock("cherry_door", new ModDoorBlock(FabricBlockSettings.of(Material.WOOD, Blocks.OAK_PLANKS.getDefaultMapColor()).strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN), ModItemGroup.WOODWORKS);
    public static final Block CHERRY_TRAPDOOR = resisterBlock("cherry_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f).nonOpaque(), SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN), ModItemGroup.WOODWORKS);
    public static final Block CHERRY_BUTTON = resisterBlock("cherry_button", createStoneButtonBlock(), ModItemGroup.WOODWORKS);
    public static final Block CHERRY_PRESSURE_PLATE = resisterBlock("cherry_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f), SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON), ModItemGroup.WOODWORKS);
    public static final Block CHERRY_FENCE = resisterBlock("cherry_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block CHERRY_FENCE_GATE = resisterBlock("cherry_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD, Blocks.OAK_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN), ModItemGroup.WOODWORKS);
    public static final Block CHERRY_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("cherry_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.CHERRY), ModItemGroup.WOODWORKS);
    public static final Block CHERRY_SIGN_BLOCK = registerBlockWithoutBlockItem("cherry_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.CHERRY), ModItemGroup.WOODWORKS);

    public static final Block CORK_OAK_SAPLING = resisterBlock("cork_oak_sapling", new ModSaplingBlock(new CorkOakSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.WOODWORKS);
    public static final Block CORK_OAK_LOG = resisterBlock("cork_oak_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.WOODWORKS);
    public static final Block CORK_OAK_LEAVES = resisterBlock("cork_oak_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).suffocates(WoodworkBlocks::never).blockVision(WoodworkBlocks::never)), ModItemGroup.WOODWORKS);
    public static final Block CORK_OAK_PLANKS = resisterBlock("cork_oak_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.WOODWORKS);
    public static final Block CORK_OAK_WOOD = resisterBlock("cork_oak_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.WOODWORKS);
    public static final Block STRIPPED_CORK_OAK_LOG = resisterBlock("stripped_cork_oak_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.WOODWORKS);
    public static final Block STRIPPED_CORK_OAK_WOOD = resisterBlock("stripped_cork_oak_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.WOODWORKS);
    public static final Block CORK_OAK_SLAB = resisterBlock("cork_oak_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block CORK_OAK_STAIRS = resisterBlock("cork_oak_stairs", new ModStairsBlock(WoodworkBlocks.CORK_OAK_LOG.getDefaultState(), FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block CORK_OAK_DOOR = resisterBlock("cork_oak_door", new ModDoorBlock(FabricBlockSettings.of(Material.WOOD, Blocks.OAK_PLANKS.getDefaultMapColor()).strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN), ModItemGroup.WOODWORKS);
    public static final Block CORK_OAK_TRAPDOOR = resisterBlock("cork_oak_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f).nonOpaque(), SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN), ModItemGroup.WOODWORKS);
    public static final Block CORK_OAK_BUTTON = resisterBlock("cork_oak_button", createStoneButtonBlock(), ModItemGroup.WOODWORKS);
    public static final Block CORK_OAK_PRESSURE_PLATE = resisterBlock("cork_oak_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f), SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON), ModItemGroup.WOODWORKS);
    public static final Block CORK_OAK_FENCE = resisterBlock("cork_oak_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block CORK_OAK_FENCE_GATE = resisterBlock("cork_oak_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD, Blocks.OAK_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN), ModItemGroup.WOODWORKS);
    public static final Block CORK_OAK_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("cork_oak_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.CORK_OAK), ModItemGroup.WOODWORKS);
    public static final Block CORK_OAK_SIGN_BLOCK = registerBlockWithoutBlockItem("cork_oak_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.CORK_OAK), ModItemGroup.WOODWORKS);

    public static final Block JACARANDA_SAPLING = resisterBlock("jacaranda_sapling", new ModSaplingBlock(new JacarandaSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.WOODWORKS);
    public static final Block JACARANDA_LOG = resisterBlock("jacaranda_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.WOODWORKS);
    public static final Block JACARANDA_LEAVES = resisterBlock("jacaranda_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).suffocates(WoodworkBlocks::never).blockVision(WoodworkBlocks::never)), ModItemGroup.WOODWORKS);
    public static final Block JACARANDA_PLANKS = resisterBlock("jacaranda_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.WOODWORKS);
    public static final Block JACARANDA_WOOD = resisterBlock("jacaranda_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.WOODWORKS);
    public static final Block STRIPPED_JACARANDA_LOG = resisterBlock("stripped_jacaranda_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.WOODWORKS);
    public static final Block STRIPPED_JACARANDA_WOOD = resisterBlock("stripped_jacaranda_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.WOODWORKS);
    public static final Block JACARANDA_SLAB = resisterBlock("jacaranda_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block JACARANDA_STAIRS = resisterBlock("jacaranda_stairs", new ModStairsBlock(WoodworkBlocks.JACARANDA_LOG.getDefaultState(), FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block JACARANDA_DOOR = resisterBlock("jacaranda_door", new ModDoorBlock(FabricBlockSettings.of(Material.WOOD, Blocks.OAK_PLANKS.getDefaultMapColor()).strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN), ModItemGroup.WOODWORKS);
    public static final Block JACARANDA_TRAPDOOR = resisterBlock("jacaranda_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f).nonOpaque(), SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN), ModItemGroup.WOODWORKS);
    public static final Block JACARANDA_BUTTON = resisterBlock("jacaranda_button", createStoneButtonBlock(), ModItemGroup.WOODWORKS);
    public static final Block JACARANDA_PRESSURE_PLATE = resisterBlock("jacaranda_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f), SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON), ModItemGroup.WOODWORKS);
    public static final Block JACARANDA_FENCE = resisterBlock("jacaranda_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block JACARANDA_FENCE_GATE = resisterBlock("jacaranda_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD, Blocks.OAK_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN), ModItemGroup.WOODWORKS);
    public static final Block JACARANDA_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("jacaranda_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.JACARANDA), ModItemGroup.WOODWORKS);
    public static final Block JACARANDA_SIGN_BLOCK = registerBlockWithoutBlockItem("jacaranda_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.JACARANDA), ModItemGroup.WOODWORKS);

    public static final Block MANGO_SAPLING = resisterBlock("mango_sapling", new ModSaplingBlock(new MangoSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.WOODWORKS);
    public static final Block MANGO_LOG = resisterBlock("mango_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.WOODWORKS);
    public static final Block MANGO_LEAVES = resisterBlock("mango_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).suffocates(WoodworkBlocks::never).blockVision(WoodworkBlocks::never)), ModItemGroup.WOODWORKS);
    public static final Block MANGO_PLANKS = resisterBlock("mango_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.WOODWORKS);
    public static final Block MANGO_WOOD = resisterBlock("mango_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.WOODWORKS);
    public static final Block STRIPPED_MANGO_LOG = resisterBlock("stripped_mango_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.WOODWORKS);
    public static final Block STRIPPED_MANGO_WOOD = resisterBlock("stripped_mango_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.WOODWORKS);
    public static final Block MANGO_SLAB = resisterBlock("mango_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block MANGO_STAIRS = resisterBlock("mango_stairs", new ModStairsBlock(WoodworkBlocks.MANGO_LOG.getDefaultState(), FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block MANGO_DOOR = resisterBlock("mango_door", new ModDoorBlock(FabricBlockSettings.of(Material.WOOD, Blocks.OAK_PLANKS.getDefaultMapColor()).strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN), ModItemGroup.WOODWORKS);
    public static final Block MANGO_TRAPDOOR = resisterBlock("mango_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f).nonOpaque(), SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN), ModItemGroup.WOODWORKS);
    public static final Block MANGO_BUTTON = resisterBlock("mango_button", createStoneButtonBlock(), ModItemGroup.WOODWORKS);
    public static final Block MANGO_PRESSURE_PLATE = resisterBlock("mango_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f), SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON), ModItemGroup.WOODWORKS);
    public static final Block MANGO_FENCE = resisterBlock("mango_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block MANGO_FENCE_GATE = resisterBlock("mango_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD, Blocks.OAK_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN), ModItemGroup.WOODWORKS);
    public static final Block MANGO_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("mango_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.MANGO), ModItemGroup.WOODWORKS);
    public static final Block MANGO_SIGN_BLOCK = registerBlockWithoutBlockItem("mango_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.MANGO), ModItemGroup.WOODWORKS);

    public static final Block MAHOE_SAPLING = resisterBlock("mahoe_sapling", new ModSaplingBlock(new MahoeSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.WOODWORKS);
    public static final Block MAHOE_LOG = resisterBlock("mahoe_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.WOODWORKS);
    public static final Block MAHOE_LEAVES = resisterBlock("mahoe_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).suffocates(WoodworkBlocks::never).blockVision(WoodworkBlocks::never)), ModItemGroup.WOODWORKS);
    public static final Block MAHOE_PLANKS = resisterBlock("mahoe_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.WOODWORKS);
    public static final Block MAHOE_WOOD = resisterBlock("mahoe_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.WOODWORKS);
    public static final Block STRIPPED_MAHOE_LOG = resisterBlock("stripped_mahoe_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.WOODWORKS);
    public static final Block STRIPPED_MAHOE_WOOD = resisterBlock("stripped_mahoe_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.WOODWORKS);
    public static final Block MAHOE_SLAB = resisterBlock("mahoe_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block MAHOE_STAIRS = resisterBlock("mahoe_stairs", new ModStairsBlock(WoodworkBlocks.MAHOE_LOG.getDefaultState(), FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block MAHOE_DOOR = resisterBlock("mahoe_door", new ModDoorBlock(FabricBlockSettings.of(Material.WOOD, Blocks.OAK_PLANKS.getDefaultMapColor()).strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN), ModItemGroup.WOODWORKS);
    public static final Block MAHOE_TRAPDOOR = resisterBlock("mahoe_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f).nonOpaque(), SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN), ModItemGroup.WOODWORKS);
    public static final Block MAHOE_BUTTON = resisterBlock("mahoe_button", createStoneButtonBlock(), ModItemGroup.WOODWORKS);
    public static final Block MAHOE_PRESSURE_PLATE = resisterBlock("mahoe_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f), SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON), ModItemGroup.WOODWORKS);
    public static final Block MAHOE_FENCE = resisterBlock("mahoe_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block MAHOE_FENCE_GATE = resisterBlock("mahoe_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD, Blocks.OAK_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN), ModItemGroup.WOODWORKS);
    public static final Block MAHOE_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("mahoe_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.MAHOE), ModItemGroup.WOODWORKS);
    public static final Block MAHOE_SIGN_BLOCK = registerBlockWithoutBlockItem("mahoe_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.MAHOE), ModItemGroup.WOODWORKS);

    public static final Block WILLOW_SAPLING = resisterBlock("willow_sapling", new ModSaplingBlock(new WillowSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.WOODWORKS);
    public static final Block WILLOW_LOG = resisterBlock("willow_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.WOODWORKS);
    public static final Block WILLOW_LEAVES = resisterBlock("willow_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).suffocates(WoodworkBlocks::never).blockVision(WoodworkBlocks::never)), ModItemGroup.WOODWORKS);
    public static final Block WILLOW_PLANKS = resisterBlock("willow_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.WOODWORKS);
    public static final Block WILLOW_WOOD = resisterBlock("willow_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.WOODWORKS);
    public static final Block STRIPPED_WILLOW_LOG = resisterBlock("stripped_willow_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.WOODWORKS);
    public static final Block STRIPPED_WILLOW_WOOD = resisterBlock("stripped_willow_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.WOODWORKS);
    public static final Block WILLOW_SLAB = resisterBlock("willow_slab", new SlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block WILLOW_STAIRS = resisterBlock("willow_stairs", new ModStairsBlock(WoodworkBlocks.WILLOW_LOG.getDefaultState(), FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block WILLOW_DOOR = resisterBlock("willow_door", new ModDoorBlock(FabricBlockSettings.of(Material.WOOD, Blocks.OAK_PLANKS.getDefaultMapColor()).strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN), ModItemGroup.WOODWORKS);
    public static final Block WILLOW_TRAPDOOR = resisterBlock("willow_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f).nonOpaque(), SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN), ModItemGroup.WOODWORKS);
    public static final Block WILLOW_BUTTON = resisterBlock("willow_button", createStoneButtonBlock(), ModItemGroup.WOODWORKS);
    public static final Block WILLOW_PRESSURE_PLATE = resisterBlock("willow_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f), SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON), ModItemGroup.WOODWORKS);
    public static final Block WILLOW_FENCE = resisterBlock("willow_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.0f)), ModItemGroup.WOODWORKS);
    public static final Block WILLOW_FENCE_GATE = resisterBlock("willow_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD, Blocks.OAK_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN), ModItemGroup.WOODWORKS);
    public static final Block WILLOW_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("willow_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.WILLOW), ModItemGroup.WOODWORKS);
    public static final Block WILLOW_SIGN_BLOCK = registerBlockWithoutBlockItem("willow_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.WILLOW), ModItemGroup.WOODWORKS);

    public static final Block UNBREAKABLE_BLOCK = resisterBlock("unbreakable_block", new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f).dropsNothing()), ModItemGroup.WOODWORKS);
    public static final Block UNBREAKABLE_LEAVES = resisterBlock("unbreakable_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).strength(-1.0f,3600000.0f).dropsNothing()), ModItemGroup.WOODWORKS);

    private static Boolean always(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return true;
    }
    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
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

    private static ButtonBlock createStoneButtonBlock() {
        return new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5F).sounds(BlockSoundGroup.STONE), 20, false, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON);
    }

    public static void registerModBlock() {
        Hmh2.LOGGER.info("Registering ModBlocks for " + Hmh2.MOD_ID);
    }

}
