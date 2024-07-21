package net.romeosnowblitz.hmh2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.test.ModBlockItem;

public class ColoringBlocks {
    public static final Block BLUE_SPIDER_LILY = registerBlock("blue_spider_lily", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()));
    public static final Block ULTRAMARINE_CANDLE = registerBlock("ultramarine_candle", new CandleBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.CANDLE).luminance(CandleBlock.STATE_TO_LUMINANCE)));
    public static final Block ULTRAMARINE_CARPET = registerBlock("ultramarine_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.WOOL)));
    public static final Block ULTRAMARINE_CONCRETE = registerBlock("ultramarine_concrete", new Block(AbstractBlock.Settings.create().requiresTool().strength(1.8f)));
    public static final Block ULTRAMARINE_CONCRETE_POWDER = registerBlock("ultramarine_concrete_powder", new ConcretePowderBlock(ULTRAMARINE_CONCRETE, AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.SAND)));
    public static final Block ULTRAMARINE_GLAZED_TERRACOTTA = registerBlock("ultramarine_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block ULTRAMARINE_STAINED_GLASS = registerBlock ("ultramarine_stained_glass", new GlassBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block ULTRAMARINE_STAINED_GLASS_PANE = registerBlock ("ultramarine_stained_glass_pane", new PaneBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block ULTRAMARINE_TERRACOTTA = registerBlock("ultramarine_terracotta", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block ULTRAMARINE_WOOL = registerBlock("ultramarine_wool", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)));
    public static final Block ROSE = registerBlock("rose", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()));
    public static final Block ROSE_CANDLE = registerBlock("rose_candle", new CandleBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.CANDLE).luminance(CandleBlock.STATE_TO_LUMINANCE)));
    public static final Block ROSE_CARPET = registerBlock("rose_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.WOOL)));
    public static final Block ROSE_CONCRETE = registerBlock("rose_concrete", new Block(AbstractBlock.Settings.create().requiresTool().strength(1.8f)));
    public static final Block ROSE_CONCRETE_POWDER = registerBlock("rose_concrete_powder", new ConcretePowderBlock(ROSE_CONCRETE, AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.SAND)));
    public static final Block ROSE_GLAZED_TERRACOTTA = registerBlock("rose_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block ROSE_STAINED_GLASS = registerBlock ("rose_stained_glass", new GlassBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block ROSE_STAINED_GLASS_PANE = registerBlock ("rose_stained_glass_pane", new PaneBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block ROSE_TERRACOTTA = registerBlock("rose_terracotta", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block ROSE_WOOL = registerBlock("rose_wool", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)));
    public static final Block WOLFSBANE = registerBlock("wolfsbane", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()));
    public static final Block VIOLET_CANDLE = registerBlock("violet_candle", new CandleBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.CANDLE).luminance(CandleBlock.STATE_TO_LUMINANCE)));
    public static final Block VIOLET_CARPET = registerBlock("violet_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.WOOL)));
    public static final Block VIOLET_CONCRETE = registerBlock("violet_concrete", new Block(AbstractBlock.Settings.create().requiresTool().strength(1.8f)));
    public static final Block VIOLET_CONCRETE_POWDER = registerBlock("violet_concrete_powder", new ConcretePowderBlock(VIOLET_CONCRETE, AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.SAND)));
    public static final Block VIOLET_GLAZED_TERRACOTTA = registerBlock("violet_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block VIOLET_STAINED_GLASS = registerBlock ("violet_stained_glass", new GlassBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block VIOLET_STAINED_GLASS_PANE = registerBlock ("violet_stained_glass_pane", new PaneBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block VIOLET_TERRACOTTA = registerBlock("violet_terracotta", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block VIOLET_WOOL = registerBlock("violet_wool", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)));
    public static final Block NEW_GREEN_CANDLE = registerBlock("new_green_candle", new CandleBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.CANDLE).luminance(CandleBlock.STATE_TO_LUMINANCE)));
    public static final Block NEW_GREEN_CARPET = registerBlock("new_green_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.WOOL)));
    public static final Block NEW_GREEN_CONCRETE = registerBlock("new_green_concrete", new Block(AbstractBlock.Settings.create().requiresTool().strength(1.8f)));
    public static final Block NEW_GREEN_CONCRETE_POWDER = registerBlock("new_green_concrete_powder", new ConcretePowderBlock(NEW_GREEN_CONCRETE, AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.SAND)));
    public static final Block NEW_GREEN_GLAZED_TERRACOTTA = registerBlock("new_green_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block NEW_GREEN_STAINED_GLASS = registerBlock ("new_green_stained_glass", new GlassBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block NEW_GREEN_STAINED_GLASS_PANE = registerBlock ("new_green_stained_glass_pane", new PaneBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block NEW_GREEN_TERRACOTTA = registerBlock("new_green_terracotta", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block NEW_GREEN_WOOL = registerBlock("new_green_wool", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)));
    public static final Block SPRING_GREEN_CANDLE = registerBlock("spring_green_candle", new CandleBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.CANDLE).luminance(CandleBlock.STATE_TO_LUMINANCE)));
    public static final Block SPRING_GREEN_CARPET = registerBlock("spring_green_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.WOOL)));
    public static final Block SPRING_GREEN_CONCRETE = registerBlock("spring_green_concrete", new Block(AbstractBlock.Settings.create().requiresTool().strength(1.8f)));
    public static final Block SPRING_GREEN_CONCRETE_POWDER = registerBlock("spring_green_concrete_powder", new ConcretePowderBlock(SPRING_GREEN_CONCRETE, AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.SAND)));
    public static final Block SPRING_GREEN_GLAZED_TERRACOTTA = registerBlock("spring_green_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SPRING_GREEN_STAINED_GLASS = registerBlock ("spring_green_stained_glass", new GlassBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block SPRING_GREEN_STAINED_GLASS_PANE = registerBlock ("spring_green_stained_glass_pane", new PaneBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block SPRING_GREEN_TERRACOTTA = registerBlock("spring_green_terracotta", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SPRING_GREEN_WOOL = registerBlock("spring_green_wool", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)));

    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    private static Block registerBlock(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(Hmh2.MOD_ID, name), new ModBlockItem(block, new FabricItemSettings(), name));
        return Registry.register(Registries.BLOCK, new Identifier(Hmh2.MOD_ID, name), block);
    }
}
