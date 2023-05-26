package net.romeosnowblitz.hmh2.block.custom;

import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SpongeBlock;
import net.minecraft.util.Pair;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;

import java.util.LinkedList;


public class SandSculk extends SpongeBlock {
    public static final int field_31250 = 6;
    public static final int field_31251 = 64;

    public SandSculk(Settings settings) {
        super(settings);
    }
    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (oldState.isOf(state.getBlock())) {
            return;
        }
        this.update(world, pos);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        this.update(world, pos);
        super.neighborUpdate(state, world, pos, block, fromPos, notify);
    }

    protected void update(World world, BlockPos pos) {
        if (this.absorbSouls(world, pos)) {
            world.setBlockState(pos, Blocks.SOUL_SOIL.getDefaultState(), Block.NOTIFY_LISTENERS);
            world.syncWorldEvent(WorldEvents.BLOCK_BROKEN, pos, Block.getRawIdFromState(Blocks.WATER.getDefaultState()));
        }
    }

    private boolean absorbSouls(World world, BlockPos pos) {
        LinkedList<Pair<BlockPos, Integer>> queue = Lists.newLinkedList();
        queue.add(new Pair<BlockPos, Integer>(pos, 0));
        int i = 0;
        while (!queue.isEmpty()) {
            Pair pair = (Pair)queue.poll();
            BlockPos blockPos = (BlockPos)pair.getLeft();

            int j = (Integer)pair.getRight();
            for (Direction direction : Direction.values()) {
                BlockPos blockPos2 = blockPos.offset(direction);
                BlockState blockState = world.getBlockState(blockPos2);
                if (!blockState.isOf(Blocks.BONE_BLOCK)) continue;
                world.setBlockState(blockPos2, Blocks.SCULK_CATALYST.getDefaultState(), Block.NOTIFY_ALL);
                ++i;
                if (j >= 0) continue;
                queue.add(new Pair<BlockPos, Integer>(blockPos2, j));
            }
            if (i <= 1) continue;
            break;
        }
        return i > 0;
    }
}
