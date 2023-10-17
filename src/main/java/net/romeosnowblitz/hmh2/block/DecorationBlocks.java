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
import net.romeosnowblitz.hmh2.block.custom.block.pumice.*;

public class DecorationBlocks {
    public static final Block CORK_BLOCK = registerBlock("cork_block", new Block(FabricBlockSettings.create().strength(1.0f)));
    public static final Block CORK_STAIRS = registerBlock("cork_stairs", new StairsBlock(DecorationBlocks.CORK_BLOCK.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block CORK_SLAB = registerBlock("cork_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block CORK_WALL = registerBlock("cork_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f)));
    public static final Block CORK_CHISELED_BRICKS = registerBlock("cork_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block CORK_BRICKS = registerBlock("cork_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block CORK_BRICK_STAIRS = registerBlock("cork_brick_stairs", new StairsBlock(DecorationBlocks.CORK_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block CORK_BRICK_SLAB = registerBlock("cork_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f)));
    public static final Block CORK_BRICK_WALL = registerBlock("cork_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block DIABASE = registerBlock("diabase", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block DIABASE_STAIRS = registerBlock("diabase_stairs", new StairsBlock(DecorationBlocks.DIABASE.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block DIABASE_SLAB = registerBlock("diabase_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block DIABASE_WALL = registerBlock("diabase_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block DIABASE_CHISELED_BRICKS = registerBlock("diabase_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block DIABASE_BRICKS = registerBlock("diabase_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block DIABASE_BRICK_STAIRS = registerBlock("diabase_brick_stairs", new StairsBlock(DecorationBlocks.DIABASE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block DIABASE_BRICK_SLAB = registerBlock("diabase_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block DIABASE_BRICK_WALL = registerBlock("diabase_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block PUMICE = registerBlock("pumice", new Pumice(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block PUMICE_STAIRS = registerBlock("pumice_stairs", new PumiceStairs(DecorationBlocks.PUMICE.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block PUMICE_SLAB = registerBlock("pumice_slab", new PumiceSlab(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block PUMICE_WALL = registerBlock("pumice_wall", new PumiceWall(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block PUMICE_CHISELED_BRICKS = registerBlock("pumice_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block PUMICE_BRICKS = registerBlock("pumice_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block PUMICE_BRICK_STAIRS = registerBlock("pumice_brick_stairs", new StairsBlock(DecorationBlocks.PUMICE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block PUMICE_BRICK_SLAB = registerBlock("pumice_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block PUMICE_BRICK_WALL = registerBlock("pumice_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block HOT_PUMICE = registerBlock("hot_pumice", new HotPumice(PUMICE, FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block HOT_PUMICE_STAIRS = registerBlock("hot_pumice_stairs", new HotPumiceStairs(DecorationBlocks.PUMICE_STAIRS, DecorationBlocks.HOT_PUMICE.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block HOT_PUMICE_SLAB = registerBlock("hot_pumice_slab", new HotPumiceSlab(DecorationBlocks.PUMICE_SLAB, FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block HOT_PUMICE_WALL = registerBlock("hot_pumice_wall", new HotPumiceWall(DecorationBlocks.PUMICE_WALL, FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block HOT_PUMICE_CHISELED_BRICKS = registerBlock("hot_pumice_chiseled_bricks", new HotPumice(DecorationBlocks.PUMICE_CHISELED_BRICKS, FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block HOT_PUMICE_BRICKS = registerBlock("hot_pumice_bricks", new HotPumice(DecorationBlocks.PUMICE_BRICKS, FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block HOT_PUMICE_BRICK_STAIRS = registerBlock("hot_pumice_brick_stairs", new HotPumiceStairs(DecorationBlocks.PUMICE_STAIRS, DecorationBlocks.HOT_PUMICE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block HOT_PUMICE_BRICK_SLAB = registerBlock("hot_pumice_brick_slab", new HotPumiceSlab(DecorationBlocks.PUMICE_BRICK_SLAB, FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block HOT_PUMICE_BRICK_WALL = registerBlock("hot_pumice_brick_wall", new HotPumiceWall(DecorationBlocks.PUMICE_BRICK_WALL, FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block LIMESTONE = registerBlock("limestone", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block LIMESTONE_STAIRS = registerBlock("limestone_stairs", new StairsBlock(DecorationBlocks.LIMESTONE.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block LIMESTONE_SLAB = registerBlock("limestone_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block LIMESTONE_WALL = registerBlock("limestone_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block LIMESTONE_CHISELED_BRICKS = registerBlock("limestone_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block LIMESTONE_BRICKS = registerBlock("limestone_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block LIMESTONE_BRICK_STAIRS = registerBlock("limestone_brick_stairs", new StairsBlock(DecorationBlocks.LIMESTONE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block LIMESTONE_BRICK_SLAB = registerBlock("limestone_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block LIMESTONE_BRICK_WALL = registerBlock("limestone_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block MARBLE = registerBlock("marble", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block MARBLE_STAIRS = registerBlock("marble_stairs", new StairsBlock(DecorationBlocks.MARBLE.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block MARBLE_SLAB = registerBlock("marble_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block MARBLE_WALL = registerBlock("marble_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block MARBLE_CHISELED_BRICKS = registerBlock("marble_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block MARBLE_BRICKS = registerBlock("marble_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block MARBLE_BRICK_STAIRS = registerBlock("marble_brick_stairs", new StairsBlock(DecorationBlocks.MARBLE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block MARBLE_BRICK_SLAB = registerBlock("marble_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block MARBLE_BRICK_WALL = registerBlock("marble_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block SALT_BLOCK = registerBlock("salt_block", new FallingBlock(FabricBlockSettings.create().strength(0.2f).requiresTool()));
    public static final Block SALT_STAIRS = registerBlock("salt_stairs", new StairsBlock(DecorationBlocks.SALT_BLOCK.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SALT_SLAB = registerBlock("salt_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SALT_WALL = registerBlock("salt_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SALT_CHISELED_BRICKS = registerBlock("salt_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SALT_BRICKS = registerBlock("salt_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SALT_BRICK_STAIRS = registerBlock("salt_brick_stairs", new StairsBlock(DecorationBlocks.SALT_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SALT_BRICK_SLAB = registerBlock("salt_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SALT_BRICK_WALL = registerBlock("salt_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block SHALE = registerBlock("shale", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SHALE_STAIRS = registerBlock("shale_stairs", new StairsBlock(DecorationBlocks.SHALE.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SHALE_SLAB = registerBlock("shale_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SHALE_WALL = registerBlock("shale_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SHALE_CHISELED_BRICKS = registerBlock("shale_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SHALE_BRICKS = registerBlock("shale_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SHALE_BRICK_STAIRS = registerBlock("shale_brick_stairs", new StairsBlock(DecorationBlocks.SHALE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SHALE_BRICK_SLAB = registerBlock("shale_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SHALE_BRICK_WALL = registerBlock("shale_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block HELLSTONE_BRICKS = registerBlock("hellstone_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block HELLSTONE_CHISELED_BRICKS = registerBlock("hellstone_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block HELLSTONE_BRICK_STAIRS = registerBlock("hellstone_brick_stairs", new StairsBlock(DecorationBlocks.HELLSTONE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block HELLSTONE_BRICK_SLAB = registerBlock("hellstone_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block HELLSTONE_BRICK_WALL = registerBlock("hellstone_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block NETHER_PRISMARINE = registerBlock("nether_prismarine", new Block(AbstractBlock.Settings.create().strength(0.5f).requiresTool().luminance(state -> 7)));
    public static final Block NETHER_PRISMARINE_STAIRS = registerBlock("nether_prismarine_stairs", new StairsBlock(DecorationBlocks.NETHER_PRISMARINE.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block NETHER_PRISMARINE_SLAB = registerBlock("nether_prismarine_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block NETHER_PRISMARINE_WALL = registerBlock("nether_prismarine_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block NETHER_PRISMARINE_CHISELED_BRICKS = registerBlock("nether_prismarine_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block NETHER_PRISMARINE_BRICKS = registerBlock("nether_prismarine_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block NETHER_PRISMARINE_BRICK_STAIRS = registerBlock("nether_prismarine_brick_stairs", new StairsBlock(DecorationBlocks.NETHER_PRISMARINE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block NETHER_PRISMARINE_BRICK_SLAB = registerBlock("nether_prismarine_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block NETHER_PRISMARINE_BRICK_WALL = registerBlock("nether_prismarine_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks", new Block(FabricBlockSettings.create()));
    public static final Block ANDESITE_CHISELED_BRICKS = registerBlock("andesite_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs", new StairsBlock(DecorationBlocks.ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block DIORITE_CHISELED_BRICKS = registerBlock("diorite_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs", new StairsBlock(DecorationBlocks.DIABASE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block GRANITE_CHISELED_BRICKS = registerBlock("granite_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs", new StairsBlock(DecorationBlocks.GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    public static final Block SNOW_BRICKS = registerBlock("snow_bricks", new Block(AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.SNOW).requiresTool()));
    public static final Block SNOW_CHISELED_BRICKS = registerBlock("snow_chiseled_bricks", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs", new StairsBlock(DecorationBlocks.SNOW_BRICKS.getDefaultState(), FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(1.0f).requiresTool()));
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall", new WallBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        Registry.register((Registries.ITEM), new Identifier(Hmh2.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        return Registry.register(Registries.BLOCK, new Identifier(Hmh2.MOD_ID, name), block);
    }
}
