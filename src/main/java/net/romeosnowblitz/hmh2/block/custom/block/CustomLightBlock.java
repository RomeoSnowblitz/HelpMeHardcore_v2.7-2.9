package net.romeosnowblitz.hmh2.block.custom.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.function.ToIntFunction;

public class CustomLightBlock extends Block {
    public static final IntProperty LEVEL_15 = Properties.LEVEL_15;
    public static final ToIntFunction<BlockState> STATE_TO_LUMINANCE = state -> state.get(LEVEL_15);

    public CustomLightBlock(Settings settings) {
        super(settings);
        this.setDefaultState((this.stateManager.getDefaultState()).with(LEVEL_15, 15));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LEVEL_15);
    }

    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1.0f;
    }

    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        ItemStack itemStack = super.getPickStack(world, pos, state);
        if (state.get(LEVEL_15) != 15) {
            NbtCompound nbtCompound = new NbtCompound();
            nbtCompound.putString(LEVEL_15.getName(), String.valueOf(state.get(LEVEL_15)));
            itemStack.setSubNbt("BlockStateTag", nbtCompound);
        }
        return itemStack;
    }
}
