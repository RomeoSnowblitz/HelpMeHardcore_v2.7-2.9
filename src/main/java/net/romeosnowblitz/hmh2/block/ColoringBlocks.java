package net.romeosnowblitz.hmh2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.block.ColorDyedCarpetBlock;
import net.romeosnowblitz.hmh2.block.custom.block.ModStainedGlassPane;
import net.romeosnowblitz.hmh2.item.ModItemGroup;
import net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor;

import static net.romeosnowblitz.hmh2.item.ModItemGroup.COLORING;
import static net.romeosnowblitz.hmh2.item.ModItemGroup.DECORATION;
import static net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor.*;
import static net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor.SPRING_GREEN;

public class ColoringBlocks {

    public static final Block BLUE_SPIDER_LILY = resisterBlock("blue_spider_lily", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()));
    public static final Block ULTRAMARINE_CANDLE = resisterBlock("ultramarine_candle", new CandleBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.CANDLE).luminance(CandleBlock.STATE_TO_LUMINANCE)));
    public static final Block ULTRAMARINE_CARPET = resisterBlock("ultramarine_carpet", new ColorDyedCarpetBlock(ULTRAMARINE, AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.WOOL)));
    public static final Block ULTRAMARINE_CONCRETE = resisterBlock("ultramarine_concrete", new Block(AbstractBlock.Settings.create().requiresTool().strength(1.8f)));
    public static final Block ULTRAMARINE_CONCRETE_POWDER = resisterBlock("ultramarine_concrete_powder", new ConcretePowderBlock(ULTRAMARINE_CONCRETE, AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.SAND)));
    public static final Block ULTRAMARINE_GLAZED_TERRACOTTA = resisterBlock("ultramarine_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block ULTRAMARINE_STAINED_GLASS = resisterBlock ("ultramarine_stained_glass", new GlassBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block ULTRAMARINE_STAINED_GLASS_PANE = resisterBlock ("ultramarine_stained_glass_pane", new ModStainedGlassPane(ULTRAMARINE, FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block ULTRAMARINE_TERRACOTTA = resisterBlock("ultramarine_terracotta", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block ULTRAMARINE_WOOL = resisterBlock("ultramarine_wool", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)));
    public static final Block ROSE = resisterBlock("rose", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()));
    public static final Block ROSE_CANDLE = resisterBlock("rose_candle", new CandleBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.CANDLE).luminance(CandleBlock.STATE_TO_LUMINANCE)));
    public static final Block ROSE_CARPET = resisterBlock("rose_carpet", new ColorDyedCarpetBlock(ModDyeColor.ROSE, AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.WOOL)));
    public static final Block ROSE_CONCRETE = resisterBlock("rose_concrete", new Block(AbstractBlock.Settings.create().requiresTool().strength(1.8f)));
    public static final Block ROSE_CONCRETE_POWDER = resisterBlock("rose_concrete_powder", new ConcretePowderBlock(ROSE_CONCRETE, AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.SAND)));
    public static final Block ROSE_GLAZED_TERRACOTTA = resisterBlock("rose_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block ROSE_STAINED_GLASS = resisterBlock ("rose_stained_glass", new GlassBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block ROSE_STAINED_GLASS_PANE = resisterBlock ("rose_stained_glass_pane", new ModStainedGlassPane(ModDyeColor.ROSE, FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block ROSE_TERRACOTTA = resisterBlock("rose_terracotta", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block ROSE_WOOL = resisterBlock("rose_wool", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)));
    public static final Block WOLFSBANE = resisterBlock("wolfsbane", new FlowerBlock(StatusEffects.LUCK, 12, FabricBlockSettings.copy(Blocks.DANDELION).breakInstantly().nonOpaque()));
    public static final Block VIOLET_CANDLE = resisterBlock("violet_candle", new CandleBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.CANDLE).luminance(CandleBlock.STATE_TO_LUMINANCE)));
    public static final Block VIOLET_CARPET = resisterBlock("violet_carpet", new ColorDyedCarpetBlock(ModDyeColor.VIOLET, AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.WOOL)));
    public static final Block VIOLET_CONCRETE = resisterBlock("violet_concrete", new Block(AbstractBlock.Settings.create().requiresTool().strength(1.8f)));
    public static final Block VIOLET_CONCRETE_POWDER = resisterBlock("violet_concrete_powder", new ConcretePowderBlock(VIOLET_CONCRETE, AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.SAND)));
    public static final Block VIOLET_GLAZED_TERRACOTTA = resisterBlock("violet_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block VIOLET_STAINED_GLASS = resisterBlock ("violet_stained_glass", new GlassBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block VIOLET_STAINED_GLASS_PANE = resisterBlock ("violet_stained_glass_pane", new ModStainedGlassPane(ModDyeColor.VIOLET, FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block VIOLET_TERRACOTTA = resisterBlock("violet_terracotta", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block VIOLET_WOOL = resisterBlock("violet_wool", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)));
    public static final Block NEW_GREEN_CANDLE = resisterBlock("new_green_candle", new CandleBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.CANDLE).luminance(CandleBlock.STATE_TO_LUMINANCE)));
    public static final Block NEW_GREEN_CARPET = resisterBlock("new_green_carpet", new ColorDyedCarpetBlock(NEW_GREEN, AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.WOOL)));
    public static final Block NEW_GREEN_CONCRETE = resisterBlock("new_green_concrete", new Block(AbstractBlock.Settings.create().requiresTool().strength(1.8f)));
    public static final Block NEW_GREEN_CONCRETE_POWDER = resisterBlock("new_green_concrete_powder", new ConcretePowderBlock(NEW_GREEN_CONCRETE, AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.SAND)));
    public static final Block NEW_GREEN_GLAZED_TERRACOTTA = resisterBlock("new_green_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block NEW_GREEN_STAINED_GLASS = resisterBlock ("new_green_stained_glass", new GlassBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block NEW_GREEN_STAINED_GLASS_PANE = resisterBlock ("new_green_stained_glass_pane", new ModStainedGlassPane(NEW_GREEN, FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block NEW_GREEN_TERRACOTTA = resisterBlock("new_green_terracotta", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block NEW_GREEN_WOOL = resisterBlock("new_green_wool", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)));
    public static final Block SPRING_GREEN_CANDLE = resisterBlock("spring_green_candle", new CandleBlock(AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.CANDLE).luminance(CandleBlock.STATE_TO_LUMINANCE)));
    public static final Block SPRING_GREEN_CARPET = resisterBlock("spring_green_carpet", new ColorDyedCarpetBlock(SPRING_GREEN, AbstractBlock.Settings.create().strength(0.1f).sounds(BlockSoundGroup.WOOL)));
    public static final Block SPRING_GREEN_CONCRETE = resisterBlock("spring_green_concrete", new Block(AbstractBlock.Settings.create().requiresTool().strength(1.8f)));
    public static final Block SPRING_GREEN_CONCRETE_POWDER = resisterBlock("spring_green_concrete_powder", new ConcretePowderBlock(SPRING_GREEN_CONCRETE, AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.SAND)));
    public static final Block SPRING_GREEN_GLAZED_TERRACOTTA = resisterBlock("spring_green_glazed_terracotta", new GlazedTerracottaBlock(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SPRING_GREEN_STAINED_GLASS = resisterBlock ("spring_green_stained_glass", new GlassBlock(FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block SPRING_GREEN_STAINED_GLASS_PANE = resisterBlock ("spring_green_stained_glass_pane", new ModStainedGlassPane(SPRING_GREEN, FabricBlockSettings.create().nonOpaque().strength(0.5f).suffocates(ColoringBlocks::never).blockVision(ColoringBlocks::never).sounds(BlockSoundGroup.GLASS)));
    public static final Block SPRING_GREEN_TERRACOTTA = resisterBlock("spring_green_terracotta", new Block(FabricBlockSettings.create().strength(0.5f).requiresTool()));
    public static final Block SPRING_GREEN_WOOL = resisterBlock("spring_green_wool", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)));

    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
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

    public static void registerColoringBlocks() {
        Hmh2.LOGGER.info("Registering Coloring Blocks for " + Hmh2.MOD_ID);
    }
}
