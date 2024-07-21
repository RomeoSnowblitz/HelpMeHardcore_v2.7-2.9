package net.romeosnowblitz.hmh2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.test.ModBlockItem;
import net.romeosnowblitz.hmh2.blotty.ModHangingSignBlockEntity;
import net.romeosnowblitz.hmh2.blotty.ModSignBlockEntity;
import net.romeosnowblitz.hmh2.util.ModWoodTypes;

public class WoodworkBlocks {

    //cannot convert .json
    public static final Block JAIZ_SAPLING = registerBlock("jaiz_sapling", new SaplingBlock(new SaplingGenerator() {
        @Override protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
            return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Hmh2.MOD_ID, "jaiz_config"));}},
            FabricBlockSettings.create().ticksRandomly().sounds(BlockSoundGroup.GRASS).noCollision()), true);

    //Trees (16)
    public static final Block BANANA_SAPLING = registerBlock("banana_sapling", new SaplingBlock(new SaplingGenerator() {@Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,
            new Identifier(Hmh2.MOD_ID, "tree_banana"));}}, FabricBlockSettings.create().ticksRandomly().sounds(BlockSoundGroup.GRASS).noCollision()), true);
    public static final Block BANANA_LOG = registerBlock("banana_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), true);
    public static final Block BANANA_LEAVES = registerBlock("banana_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).suffocates(WoodworkBlocks::never).blockVision(WoodworkBlocks::never)), true);
    public static final Block BANANA_PLANKS = registerBlock("banana_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), true);
    public static final Block BANANA_WOOD = registerBlock("banana_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), true);
    public static final Block STRIPPED_BANANA_LOG = registerBlock("stripped_banana_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), true);
    public static final Block STRIPPED_BANANA_WOOD = registerBlock("stripped_banana_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), true);
    public static final Block BANANA_SLAB = registerBlock("banana_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block BANANA_STAIRS = registerBlock("banana_stairs", new StairsBlock(WoodworkBlocks.BANANA_LOG.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block BANANA_DOOR = registerBlock("banana_door", new DoorBlock(FabricBlockSettings.create().strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.OAK), true);
    public static final Block BANANA_TRAPDOOR = registerBlock("banana_trapdoor", new TrapdoorBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f).nonOpaque(), BlockSetType.OAK), true);
    public static final Block BANANA_BUTTON = registerBlock("banana_button", new ButtonBlock(AbstractBlock.Settings.create().noCollision().strength(0.5F), BlockSetType.STONE, 20, false), true);
    public static final Block BANANA_PRESSURE_PLATE = registerBlock("banana_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f), BlockSetType.OAK), true);
    public static final Block BANANA_FENCE = registerBlock("banana_fence", new FenceBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block BANANA_FENCE_GATE = registerBlock("banana_fence_gate", new FenceGateBlock(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK), true);
    public static final Block BANANA_SIGN = registerBlock("banana_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModWoodTypes.BANANA)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block BANANA_HANGING_SIGN = registerBlock("banana_hanging_sign", new HangingSignBlock(FabricBlockSettings.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BANANA)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModHangingSignBlockEntity(pos, state);}}, false);
    public static final Block BANANA_WALL_SIGN = registerBlock("banana_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BANANA)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block BANANA_HANGING_WALL_SIGN = registerBlock("banana_hanging_wall_sign", new WallHangingSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BANANA)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModHangingSignBlockEntity(pos, state);}}, false);


    public static final Block CHERRY_SAPLING = registerBlock ("cherry_sapling", new SaplingBlock(new SaplingGenerator() {@Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,
            new Identifier(Hmh2.MOD_ID, "tree_cherry"));}}, FabricBlockSettings.create().ticksRandomly().sounds(BlockSoundGroup.GRASS).noCollision()), true);
    public static final Block CHERRY_LOG = registerBlock("cherry_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), true);
    public static final Block CHERRY_LEAVES = registerBlock("cherry_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).suffocates(WoodworkBlocks::never).blockVision(WoodworkBlocks::never)), true);
    public static final Block CHERRY_PLANKS = registerBlock("cherry_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), true);
    public static final Block CHERRY_WOOD = registerBlock("cherry_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), true);
    public static final Block STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), true);
    public static final Block STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), true);
    public static final Block CHERRY_SLAB = registerBlock("cherry_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block CHERRY_STAIRS = registerBlock("cherry_stairs", new StairsBlock(WoodworkBlocks.CHERRY_LOG.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block CHERRY_DOOR = registerBlock("cherry_door", new DoorBlock(FabricBlockSettings.create().strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.OAK), true);
    public static final Block CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor", new TrapdoorBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f).nonOpaque(), BlockSetType.OAK), true);
    public static final Block CHERRY_BUTTON = registerBlock("cherry_button", new ButtonBlock(AbstractBlock.Settings.create().noCollision().strength(0.5F), BlockSetType.STONE, 20, false), true);
    public static final Block CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f),BlockSetType.OAK), true);
    public static final Block CHERRY_FENCE = registerBlock("cherry_fence", new FenceBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate", new FenceGateBlock(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK), true);
    public static final Block CHERRY_SIGN = registerBlock("cherry_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModWoodTypes.CHERRY)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block CHERRY_HANGING_SIGN = registerBlock("cherry_hanging_sign", new HangingSignBlock(FabricBlockSettings.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.CHERRY)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModHangingSignBlockEntity(pos, state);}}, false);
    public static final Block CHERRY_WALL_SIGN = registerBlock("cherry_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.CHERRY)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block CHERRY_HANGING_WALL_SIGN = registerBlock("cherry_hanging_wall_sign", new WallHangingSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.CHERRY)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModHangingSignBlockEntity(pos, state);}}, false);

    public static final Block CORK_OAK_SAPLING = registerBlock("cork_oak_sapling", new SaplingBlock(new SaplingGenerator() {@Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,
            new Identifier(Hmh2.MOD_ID, "tree_cork_oak"));}}, FabricBlockSettings.create().ticksRandomly().sounds(BlockSoundGroup.GRASS).noCollision()), true);
    public static final Block CORK_OAK_LOG = registerBlock("cork_oak_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), true);
    public static final Block CORK_OAK_LEAVES = registerBlock("cork_oak_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).suffocates(WoodworkBlocks::never).blockVision(WoodworkBlocks::never)), true);
    public static final Block CORK_OAK_PLANKS = registerBlock("cork_oak_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), true);
    public static final Block CORK_OAK_WOOD = registerBlock("cork_oak_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), true);
    public static final Block STRIPPED_CORK_OAK_LOG = registerBlock("stripped_cork_oak_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), true);
    public static final Block STRIPPED_CORK_OAK_WOOD = registerBlock("stripped_cork_oak_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), true);
    public static final Block CORK_OAK_SLAB = registerBlock("cork_oak_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block CORK_OAK_STAIRS = registerBlock("cork_oak_stairs", new StairsBlock(WoodworkBlocks.CORK_OAK_LOG.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block CORK_OAK_DOOR = registerBlock("cork_oak_door", new DoorBlock(FabricBlockSettings.create().strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.OAK), true);
    public static final Block CORK_OAK_TRAPDOOR = registerBlock("cork_oak_trapdoor", new TrapdoorBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f).nonOpaque(), BlockSetType.OAK), true);
    public static final Block CORK_OAK_BUTTON = registerBlock("cork_oak_button", new ButtonBlock(AbstractBlock.Settings.create().noCollision().strength(0.5F), BlockSetType.STONE, 20, false), true);
    public static final Block CORK_OAK_PRESSURE_PLATE = registerBlock("cork_oak_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f),BlockSetType.OAK), true);
    public static final Block CORK_OAK_FENCE = registerBlock("cork_oak_fence", new FenceBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block CORK_OAK_FENCE_GATE = registerBlock("cork_oak_fence_gate", new FenceGateBlock(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK), true);
    public static final Block CORK_OAK_SIGN = registerBlock("cork_oak_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModWoodTypes.CORK_OAK)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block CORK_OAK_HANGING_SIGN = registerBlock("cork_oak_hanging_sign", new HangingSignBlock(FabricBlockSettings.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.CORK_OAK)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModHangingSignBlockEntity(pos, state);}}, false);
    public static final Block CORK_OAK_WALL_SIGN = registerBlock("cork_oak_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.CORK_OAK)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block CORK_OAK_HANGING_WALL_SIGN = registerBlock("cork_oak_hanging_wall_sign", new WallHangingSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.CORK_OAK)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModHangingSignBlockEntity(pos, state);}}, false);

    public static final Block JACARANDA_SAPLING = registerBlock("jacaranda_sapling", new SaplingBlock(new SaplingGenerator() {@Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,
            new Identifier(Hmh2.MOD_ID, "tree_jacaranda"));}}, FabricBlockSettings.create().ticksRandomly().sounds(BlockSoundGroup.GRASS).noCollision()), true);
    public static final Block JACARANDA_LOG = registerBlock("jacaranda_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), true);
    public static final Block JACARANDA_LEAVES = registerBlock("jacaranda_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).suffocates(WoodworkBlocks::never).blockVision(WoodworkBlocks::never)), true);
    public static final Block JACARANDA_PLANKS = registerBlock("jacaranda_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), true);
    public static final Block JACARANDA_WOOD = registerBlock("jacaranda_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), true);
    public static final Block STRIPPED_JACARANDA_LOG = registerBlock("stripped_jacaranda_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), true);
    public static final Block STRIPPED_JACARANDA_WOOD = registerBlock("stripped_jacaranda_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), true);
    public static final Block JACARANDA_SLAB = registerBlock("jacaranda_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block JACARANDA_STAIRS = registerBlock("jacaranda_stairs", new StairsBlock(WoodworkBlocks.JACARANDA_LOG.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block JACARANDA_DOOR = registerBlock("jacaranda_door", new DoorBlock(FabricBlockSettings.create().strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.OAK), true);
    public static final Block JACARANDA_TRAPDOOR = registerBlock("jacaranda_trapdoor", new TrapdoorBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f).nonOpaque(), BlockSetType.OAK), true);
    public static final Block JACARANDA_BUTTON = registerBlock("jacaranda_button", new ButtonBlock(AbstractBlock.Settings.create().noCollision().strength(0.5F), BlockSetType.STONE, 20, false), true);
    public static final Block JACARANDA_PRESSURE_PLATE = registerBlock("jacaranda_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f),BlockSetType.OAK), true);
    public static final Block JACARANDA_FENCE = registerBlock("jacaranda_fence", new FenceBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block JACARANDA_FENCE_GATE = registerBlock("jacaranda_fence_gate", new FenceGateBlock(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK), true);
    public static final Block JACARANDA_SIGN = registerBlock("jacaranda_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModWoodTypes.JACARANDA)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block JACARANDA_HANGING_SIGN = registerBlock("jacaranda_hanging_sign", new HangingSignBlock(FabricBlockSettings.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.JACARANDA)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block JACARANDA_WALL_SIGN = registerBlock("jacaranda_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.JACARANDA)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block JACARANDA_HANGING_WALL_SIGN = registerBlock("jacaranda_hanging_wall_sign", new WallHangingSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.JACARANDA)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);

    public static final Block MANGO_SAPLING = registerBlock("mango_sapling", new SaplingBlock(new SaplingGenerator() {@Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,
            new Identifier(Hmh2.MOD_ID, "tree_mango"));}}, FabricBlockSettings.create().ticksRandomly().sounds(BlockSoundGroup.GRASS).noCollision()), true);
    public static final Block MANGO_LOG = registerBlock("mango_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), true);
    public static final Block MANGO_LEAVES = registerBlock("mango_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).suffocates(WoodworkBlocks::never).blockVision(WoodworkBlocks::never)), true);
    public static final Block MANGO_PLANKS = registerBlock("mango_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), true);
    public static final Block MANGO_WOOD = registerBlock("mango_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), true);
    public static final Block STRIPPED_MANGO_LOG = registerBlock("stripped_mango_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), true);
    public static final Block STRIPPED_MANGO_WOOD = registerBlock("stripped_mango_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), true);
    public static final Block MANGO_SLAB = registerBlock("mango_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block MANGO_STAIRS = registerBlock("mango_stairs", new StairsBlock(WoodworkBlocks.MANGO_LOG.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block MANGO_DOOR = registerBlock("mango_door", new DoorBlock(FabricBlockSettings.create().strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.OAK), true);
    public static final Block MANGO_TRAPDOOR = registerBlock("mango_trapdoor", new TrapdoorBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f).nonOpaque(), BlockSetType.OAK), true);
    public static final Block MANGO_BUTTON = registerBlock("mango_button", new ButtonBlock(AbstractBlock.Settings.create().noCollision().strength(0.5F), BlockSetType.STONE, 20, false), true);
    public static final Block MANGO_PRESSURE_PLATE = registerBlock("mango_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f),BlockSetType.OAK), true);
    public static final Block MANGO_FENCE = registerBlock("mango_fence", new FenceBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block MANGO_FENCE_GATE = registerBlock("mango_fence_gate", new FenceGateBlock(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK), true);
    public static final Block MANGO_SIGN = registerBlock("mango_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModWoodTypes.MANGO)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block MANGO_HANGING_SIGN = registerBlock("mango_hanging_sign", new HangingSignBlock(FabricBlockSettings.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.MANGO)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block MANGO_WALL_SIGN = registerBlock("mango_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.MANGO)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block MANGO_HANGING_WALL_SIGN = registerBlock("mango_hanging_wall_sign", new WallHangingSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.MANGO)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);

    public static final Block MAHOE_SAPLING = registerBlock("mahoe_sapling", new SaplingBlock(new SaplingGenerator() {@Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,
            new Identifier(Hmh2.MOD_ID, "tree_mahoe"));}}, FabricBlockSettings.create().ticksRandomly().sounds(BlockSoundGroup.GRASS).noCollision()), true);
    public static final Block MAHOE_LOG = registerBlock("mahoe_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), true);
    public static final Block MAHOE_LEAVES = registerBlock("mahoe_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).suffocates(WoodworkBlocks::never).blockVision(WoodworkBlocks::never)), true);
    public static final Block MAHOE_PLANKS = registerBlock("mahoe_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), true);
    public static final Block MAHOE_WOOD = registerBlock("mahoe_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), true);
    public static final Block STRIPPED_MAHOE_LOG = registerBlock("stripped_mahoe_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), true);
    public static final Block STRIPPED_MAHOE_WOOD = registerBlock("stripped_mahoe_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), true);
    public static final Block MAHOE_SLAB = registerBlock("mahoe_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block MAHOE_STAIRS = registerBlock("mahoe_stairs", new StairsBlock(WoodworkBlocks.MAHOE_LOG.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block MAHOE_DOOR = registerBlock("mahoe_door", new DoorBlock(FabricBlockSettings.create().strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.OAK), true);
    public static final Block MAHOE_TRAPDOOR = registerBlock("mahoe_trapdoor", new TrapdoorBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f).nonOpaque(), BlockSetType.OAK), true);
    public static final Block MAHOE_BUTTON = registerBlock("mahoe_button", new ButtonBlock(AbstractBlock.Settings.create().noCollision().strength(0.5F), BlockSetType.STONE, 20, false), true);
    public static final Block MAHOE_PRESSURE_PLATE = registerBlock("mahoe_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f),BlockSetType.OAK), true);
    public static final Block MAHOE_FENCE = registerBlock("mahoe_fence", new FenceBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block MAHOE_FENCE_GATE = registerBlock("mahoe_fence_gate", new FenceGateBlock(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK), true);
    public static final Block MAHOE_SIGN = registerBlock("mahoe_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModWoodTypes.MAHOE)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block MAHOE_HANGING_SIGN = registerBlock("mahoe_hanging_sign", new HangingSignBlock(FabricBlockSettings.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.MAHOE)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block MAHOE_WALL_SIGN = registerBlock("mahoe_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.MAHOE)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block MAHOE_HANGING_WALL_SIGN = registerBlock("mahoe_hanging_wall_sign", new WallHangingSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.MAHOE)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);

    public static final Block WILLOW_SAPLING = registerBlock("willow_sapling", new SaplingBlock(new SaplingGenerator() {@Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,
            new Identifier(Hmh2.MOD_ID, "tree_willow"));}}, FabricBlockSettings.create().ticksRandomly().sounds(BlockSoundGroup.GRASS).noCollision()), true);
    public static final Block WILLOW_LOG = registerBlock("willow_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), true);
    public static final Block WILLOW_LEAVES = registerBlock("willow_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).suffocates(WoodworkBlocks::never).blockVision(WoodworkBlocks::never)), true);
    public static final Block WILLOW_PLANKS = registerBlock("willow_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), true);
    public static final Block WILLOW_WOOD = registerBlock("willow_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), true);
    public static final Block STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), true);
    public static final Block STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), true);
    public static final Block WILLOW_SLAB = registerBlock("willow_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block WILLOW_STAIRS = registerBlock("willow_stairs", new StairsBlock(WoodworkBlocks.WILLOW_LOG.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block WILLOW_DOOR = registerBlock("willow_door", new DoorBlock(FabricBlockSettings.create().strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque(), BlockSetType.OAK), true);
    public static final Block WILLOW_TRAPDOOR = registerBlock("willow_trapdoor", new TrapdoorBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f).nonOpaque(), BlockSetType.OAK), true);
    public static final Block WILLOW_BUTTON = registerBlock("willow_button", new ButtonBlock(AbstractBlock.Settings.create().noCollision().strength(0.5F), BlockSetType.STONE, 20, false), true);
    public static final Block WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f),BlockSetType.OAK), true);
    public static final Block WILLOW_FENCE = registerBlock("willow_fence", new FenceBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0f)), true);
    public static final Block WILLOW_FENCE_GATE = registerBlock("willow_fence_gate", new FenceGateBlock(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK), true);
    public static final Block WILLOW_SIGN = registerBlock("willow_sign", new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModWoodTypes.WILLOW)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block WILLOW_HANGING_SIGN = registerBlock("willow_hanging_sign", new HangingSignBlock(FabricBlockSettings.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.WILLOW)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block WILLOW_WALL_SIGN = registerBlock("willow_wall_sign", new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.WILLOW)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);
    public static final Block WILLOW_HANGING_WALL_SIGN = registerBlock("willow_hanging_wall_sign", new WallHangingSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.WILLOW)
    {public BlockEntity createBlockEntity(BlockPos pos, BlockState state){return new ModSignBlockEntity(pos, state);}}, false);

    public static final Block UNBREAKABLE_BLOCK = registerBlock("unbreakable_block", new Block(FabricBlockSettings.create().strength(-1.0f, 3600000.0f).dropsNothing()), true);
    public static final Block UNBREAKABLE_LEAVES = registerBlock("unbreakable_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).strength(-1.0f,3600000.0f).dropsNothing()), true);

    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    private static Block registerBlock(String name, Block block, boolean item) {
        if(item){Registry.register(Registries.ITEM, new Identifier(Hmh2.MOD_ID, name), new ModBlockItem(block, new FabricItemSettings(), name));}
        return Registry.register(Registries.BLOCK, new Identifier(Hmh2.MOD_ID, name), block);
    }

}
