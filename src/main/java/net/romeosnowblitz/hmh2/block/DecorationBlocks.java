package net.romeosnowblitz.hmh2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.block.CustomLightBlock;
import net.romeosnowblitz.hmh2.block.custom.block.pumice.*;

public class DecorationBlocks {
    public static final Block CORK_BLOCK = resisterBlock("cork_block", new Block(FabricBlockSettings.create().strength(1.0f)));
    public static final Block CORK_STAIRS = resisterBlock("cork_stairs", new StairsBlock(DecorationBlocks.CORK_BLOCK.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block CORK_SLAB = resisterBlock("cork_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block CORK_WALL = resisterBlock("cork_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f)));
    public static final Block CORK_CHISELED_BRICKS = resisterBlock("cork_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block CORK_BRICKS = resisterBlock("cork_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block CORK_BRICK_STAIRS = resisterBlock("cork_brick_stairs", new StairsBlock(DecorationBlocks.CORK_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block CORK_BRICK_SLAB = resisterBlock("cork_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block CORK_BRICK_WALL = resisterBlock("cork_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block DIABASE = resisterBlock("diabase", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block DIABASE_STAIRS = resisterBlock("diabase_stairs", new StairsBlock(DecorationBlocks.DIABASE.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block DIABASE_SLAB = resisterBlock("diabase_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block DIABASE_WALL = resisterBlock("diabase_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block DIABASE_CHISELED_BRICKS = resisterBlock("diabase_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block DIABASE_BRICKS = resisterBlock("diabase_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block DIABASE_BRICK_STAIRS = resisterBlock("diabase_brick_stairs", new StairsBlock(DecorationBlocks.DIABASE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block DIABASE_BRICK_SLAB = resisterBlock("diabase_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block DIABASE_BRICK_WALL = resisterBlock("diabase_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block PUMICE = resisterBlock("pumice", new Pumice(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block PUMICE_STAIRS = resisterBlock("pumice_stairs", new PumiceStairs(DecorationBlocks.PUMICE.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block PUMICE_SLAB = resisterBlock("pumice_slab", new PumiceSlab(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block PUMICE_WALL = resisterBlock("pumice_wall", new PumiceWall(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block PUMICE_CHISELED_BRICKS = resisterBlock("pumice_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block PUMICE_BRICKS = resisterBlock("pumice_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block PUMICE_BRICK_STAIRS = resisterBlock("pumice_brick_stairs", new StairsBlock(DecorationBlocks.PUMICE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block PUMICE_BRICK_SLAB = resisterBlock("pumice_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block PUMICE_BRICK_WALL = resisterBlock("pumice_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block HOT_PUMICE = resisterBlock("hot_pumice", new HotPumice(PUMICE, FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block HOT_PUMICE_STAIRS = resisterBlock("hot_pumice_stairs", new HotPumiceStairs(DecorationBlocks.PUMICE_STAIRS, DecorationBlocks.HOT_PUMICE.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block HOT_PUMICE_SLAB = resisterBlock("hot_pumice_slab", new HotPumiceSlab(DecorationBlocks.PUMICE_SLAB, FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block HOT_PUMICE_WALL = resisterBlock("hot_pumice_wall", new HotPumiceWall(DecorationBlocks.PUMICE_WALL, FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block HOT_PUMICE_CHISELED_BRICKS = resisterBlock("hot_pumice_chiseled_bricks", new HotPumice(DecorationBlocks.PUMICE_CHISELED_BRICKS, FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block HOT_PUMICE_BRICKS = resisterBlock("hot_pumice_bricks", new HotPumice(DecorationBlocks.PUMICE_BRICKS, FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block HOT_PUMICE_BRICK_STAIRS = resisterBlock("hot_pumice_brick_stairs", new HotPumiceStairs(DecorationBlocks.PUMICE_STAIRS, DecorationBlocks.HOT_PUMICE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block HOT_PUMICE_BRICK_SLAB = resisterBlock("hot_pumice_brick_slab", new HotPumiceSlab(DecorationBlocks.PUMICE_BRICK_SLAB, FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block HOT_PUMICE_BRICK_WALL = resisterBlock("hot_pumice_brick_wall", new HotPumiceWall(DecorationBlocks.PUMICE_BRICK_WALL, FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block LIMESTONE = resisterBlock("limestone", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block LIMESTONE_STAIRS = resisterBlock("limestone_stairs", new StairsBlock(DecorationBlocks.LIMESTONE.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block LIMESTONE_SLAB = resisterBlock("limestone_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block LIMESTONE_WALL = resisterBlock("limestone_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block LIMESTONE_CHISELED_BRICKS = resisterBlock("limestone_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block LIMESTONE_BRICKS = resisterBlock("limestone_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block LIMESTONE_BRICK_STAIRS = resisterBlock("limestone_brick_stairs", new StairsBlock(DecorationBlocks.LIMESTONE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block LIMESTONE_BRICK_SLAB = resisterBlock("limestone_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block LIMESTONE_BRICK_WALL = resisterBlock("limestone_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block MARBLE = resisterBlock("marble", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block MARBLE_STAIRS = resisterBlock("marble_stairs", new StairsBlock(DecorationBlocks.MARBLE.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block MARBLE_SLAB = resisterBlock("marble_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block MARBLE_WALL = resisterBlock("marble_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block MARBLE_CHISELED_BRICKS = resisterBlock("marble_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block MARBLE_BRICKS = resisterBlock("marble_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block MARBLE_BRICK_STAIRS = resisterBlock("marble_brick_stairs", new StairsBlock(DecorationBlocks.MARBLE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block MARBLE_BRICK_SLAB = resisterBlock("marble_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block MARBLE_BRICK_WALL = resisterBlock("marble_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block SALT_BLOCK = resisterBlock("salt_block", new FallingBlock(FabricBlockSettings.create().strength(0.2f).requiresTool()));
    public static final Block SALT_STAIRS = resisterBlock("salt_stairs", new StairsBlock(DecorationBlocks.SALT_BLOCK.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SALT_SLAB = resisterBlock("salt_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SALT_WALL = resisterBlock("salt_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SALT_CHISELED_BRICKS = resisterBlock("salt_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SALT_BRICKS = resisterBlock("salt_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SALT_BRICK_STAIRS = resisterBlock("salt_brick_stairs", new StairsBlock(DecorationBlocks.SALT_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SALT_BRICK_SLAB = resisterBlock("salt_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SALT_BRICK_WALL = resisterBlock("salt_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block SHALE = resisterBlock("shale", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SHALE_STAIRS = resisterBlock("shale_stairs", new StairsBlock(DecorationBlocks.SHALE.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SHALE_SLAB = resisterBlock("shale_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SHALE_WALL = resisterBlock("shale_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SHALE_CHISELED_BRICKS = resisterBlock("shale_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SHALE_BRICKS = resisterBlock("shale_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SHALE_BRICK_STAIRS = resisterBlock("shale_brick_stairs", new StairsBlock(DecorationBlocks.SHALE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SHALE_BRICK_SLAB = resisterBlock("shale_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SHALE_BRICK_WALL = resisterBlock("shale_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block HELLSTONE_BRICKS = resisterBlock("hellstone_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block HELLSTONE_CHISELED_BRICKS = resisterBlock("hellstone_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block HELLSTONE_BRICK_STAIRS = resisterBlock("hellstone_brick_stairs", new StairsBlock(DecorationBlocks.HELLSTONE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block HELLSTONE_BRICK_SLAB = resisterBlock("hellstone_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block HELLSTONE_BRICK_WALL = resisterBlock("hellstone_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block NETHER_PRISMARINE = resisterBlock("nether_prismarine", new CustomLightBlock(AbstractBlock.Settings.create().strength(0.5f).requiresTool().luminance(state -> 7)));
    public static final Block NETHER_PRISMARINE_STAIRS = resisterBlock("nether_prismarine_stairs", new StairsBlock(DecorationBlocks.NETHER_PRISMARINE.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block NETHER_PRISMARINE_SLAB = resisterBlock("nether_prismarine_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block NETHER_PRISMARINE_WALL = resisterBlock("nether_prismarine_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block NETHER_PRISMARINE_CHISELED_BRICKS = resisterBlock("nether_prismarine_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block NETHER_PRISMARINE_BRICKS = resisterBlock("nether_prismarine_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block NETHER_PRISMARINE_BRICK_STAIRS = resisterBlock("nether_prismarine_brick_stairs", new StairsBlock(DecorationBlocks.NETHER_PRISMARINE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block NETHER_PRISMARINE_BRICK_SLAB = resisterBlock("nether_prismarine_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block NETHER_PRISMARINE_BRICK_WALL = resisterBlock("nether_prismarine_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block ANDESITE_BRICKS = resisterBlock("andesite_bricks", new Block(FabricBlockSettings.create()));
    public static final Block ANDESITE_CHISELED_BRICKS = resisterBlock("andesite_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block ANDESITE_BRICK_STAIRS = resisterBlock("andesite_brick_stairs", new StairsBlock(DecorationBlocks.ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block ANDESITE_BRICK_SLAB = resisterBlock("andesite_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block ANDESITE_BRICK_WALL = resisterBlock("andesite_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block DIORITE_BRICKS = resisterBlock("diorite_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block DIORITE_CHISELED_BRICKS = resisterBlock("diorite_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block DIORITE_BRICK_STAIRS = resisterBlock("diorite_brick_stairs", new StairsBlock(DecorationBlocks.DIABASE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block DIORITE_BRICK_SLAB = resisterBlock("diorite_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block DIORITE_BRICK_WALL = resisterBlock("diorite_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block GRANITE_BRICKS = resisterBlock("granite_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block GRANITE_CHISELED_BRICKS = resisterBlock("granite_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block GRANITE_BRICK_STAIRS = resisterBlock("granite_brick_stairs", new StairsBlock(DecorationBlocks.GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block GRANITE_BRICK_SLAB = resisterBlock("granite_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block GRANITE_BRICK_WALL = resisterBlock("granite_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block SNOW_BRICKS = resisterBlock("snow_bricks", new Block(AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.SNOW).requiresTool()));
    public static final Block SNOW_CHISELED_BRICKS = resisterBlock("snow_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SNOW_BRICK_STAIRS = resisterBlock("snow_brick_stairs", new StairsBlock(DecorationBlocks.SNOW_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SNOW_BRICK_SLAB = resisterBlock("snow_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SNOW_BRICK_WALL = resisterBlock("snow_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    private static Block resisterBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Hmh2.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        Item item = Registry.register((Registries.ITEM), new Identifier(Hmh2.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerDecorationBlocks() {
        Hmh2.LOGGER.info("Registering Decoration Blocks for " + Hmh2.MOD_ID);
    }
}
