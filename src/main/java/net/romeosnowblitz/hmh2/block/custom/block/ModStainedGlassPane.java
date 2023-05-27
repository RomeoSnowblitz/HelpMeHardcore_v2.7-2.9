package net.romeosnowblitz.hmh2.block.custom.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor;

public class ModStainedGlassPane extends PaneBlock {
    private final ModDyeColor color;

    public ModStainedGlassPane(ModDyeColor color, Settings settings) {
        super(settings);
        this.color = color;
        this.setDefaultState((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(NORTH, false)).with(EAST, false)).with(SOUTH, false)).with(WEST, false)).with(WATERLOGGED, false));
    }

    public ModDyeColor getColor() {
        return this.color;
    }
}
