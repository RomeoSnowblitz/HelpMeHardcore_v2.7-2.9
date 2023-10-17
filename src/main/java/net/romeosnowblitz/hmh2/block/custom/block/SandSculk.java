package net.romeosnowblitz.hmh2.block.custom.block;

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


public class SandSculk extends Block {

    public SandSculk(Settings settings) {super(settings);}

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {absorbSouls(world, pos);}

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        absorbSouls(world, pos);
    }

    public void absorbSouls (World world, BlockPos pos) {
        LinkedList<Pair<BlockPos, Integer>> queue = Lists.newLinkedList();
        queue.add(new Pair<>(pos, 0));
        int i = 0;
        while (!queue.isEmpty()) {
            Pair<BlockPos, Integer> pair = queue.poll();
            for (Direction direction : Direction.values()) {
                if (!world.getBlockState(pair.getLeft().offset(direction)).isOf(Blocks.BONE_BLOCK)) continue;
                world.setBlockState(pair.getLeft().offset(direction), Blocks.SCULK_CATALYST.getDefaultState(), Block.NOTIFY_ALL);
                ++i;
                if (pair.getRight() >= 0) continue;
                queue.add(new Pair<>(pair.getLeft().offset(direction), pair.getRight()));
            }
            if (i <= 1) continue;
            break;
        }
        boolean b =  i > 0;
        if (b) {
            world.setBlockState(pos, Blocks.SOUL_SOIL.getDefaultState(), Block.NOTIFY_LISTENERS);
            world.syncWorldEvent(WorldEvents.BLOCK_BROKEN, pos, Block.getRawIdFromState(Blocks.WATER.getDefaultState()));
        }
    }


}
