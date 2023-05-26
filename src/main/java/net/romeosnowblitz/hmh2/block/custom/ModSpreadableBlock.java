package net.romeosnowblitz.hmh2.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowBlock;
import net.minecraft.block.SnowyBlock;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;
import net.romeosnowblitz.hmh2.block.ModBlocks;



public class ModSpreadableBlock extends SnowyBlock {

    protected ModSpreadableBlock(Settings settings) {
        super(settings);
    }

    private static boolean canSurvive(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPosUp = pos.up();
        BlockPos blockPosDown = pos.up();
        BlockPos blockPosNorth = pos.up();
        BlockPos blockPosSouth = pos.up();
        BlockPos blockPosEast = pos.up();
        BlockPos blockPosWest = pos.up();
        BlockState blockStateUp = world.getBlockState(blockPosUp);
        BlockState blockStateDown = world.getBlockState(blockPosDown);
        BlockState blockStateNorth = world.getBlockState(blockPosNorth);
        BlockState blockStateSouth = world.getBlockState(blockPosSouth);
        BlockState blockStateEast = world.getBlockState(blockPosEast);
        BlockState blockStateWest = world.getBlockState(blockPosWest);
        if (
                blockStateUp.isOf(Blocks.SNOW) && (Integer)blockStateUp.get(SnowBlock.LAYERS) == 1 ||
                blockStateDown.isOf(Blocks.SNOW) && (Integer)blockStateDown.get(SnowBlock.LAYERS) == 1 ||
                blockStateNorth.isOf(Blocks.SNOW) && (Integer)blockStateNorth.get(SnowBlock.LAYERS) == 1 ||
                blockStateNorth.isOf(Blocks.SNOW) && (Integer)blockStateSouth.get(SnowBlock.LAYERS) == 1 ||
                blockStateNorth.isOf(Blocks.SNOW) && (Integer)blockStateEast.get(SnowBlock.LAYERS) == 1 ||
                blockStateNorth.isOf(Blocks.SNOW) && (Integer)blockStateWest.get(SnowBlock.LAYERS) == 1
        ) {return true;
        } else if (
                blockStateUp.getFluidState().getLevel() == 8 ||
                blockStateDown.getFluidState().getLevel() == 8 ||
                blockStateNorth.getFluidState().getLevel() == 8 ||
                blockStateSouth.getFluidState().getLevel() == 8 ||
                blockStateEast.getFluidState().getLevel() == 8 ||
                blockStateWest.getFluidState().getLevel() == 8
        )
        {
            return false;
        } else {
            int i = ChunkLightProvider.getRealisticOpacity(world, state, pos, blockStateUp, blockPosUp, Direction.UP, blockStateUp.getOpacity(world, blockPosUp));
            return i < world.getMaxLightLevel();
        }
    }

    private static boolean canSpread(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPosUp = pos.up();
        BlockPos blockPosDown = pos.down();
        BlockPos blockPosNorth = pos.north();
        BlockPos blockPosSouth = pos.south();
        BlockPos blockPosEast = pos.east();
        BlockPos blockPosWest = pos.west();
        return canSurvive(state, world, pos) &&
                !world.getFluidState(blockPosUp).isIn(FluidTags.WATER) ||
                !world.getFluidState(blockPosDown).isIn(FluidTags.WATER) ||
                !world.getFluidState(blockPosNorth).isIn(FluidTags.WATER) ||
                !world.getFluidState(blockPosSouth).isIn(FluidTags.WATER) ||
                !world.getFluidState(blockPosEast).isIn(FluidTags.WATER) ||
                !world.getFluidState(blockPosWest).isIn(FluidTags.WATER);
    }



    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canSurvive(state, world, pos)) {
            world.setBlockState(pos, ModBlocks.BLOCK_ONE.getDefaultState());
        } else {
            if (world.getLightLevel(pos.up()) >= 0) {
                BlockState blockState = this.getDefaultState();

                for(int i = 0; i < 4; ++i) {
                    BlockPos blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    if (world.getBlockState(blockPos).isOf(Blocks.GRASS_BLOCK) && canSpread(blockState, world, blockPos)) {
                        world.setBlockState(blockPos, (BlockState)blockState.with(SNOWY, world.getBlockState(blockPos.up()).isOf(Blocks.SNOW)));
                    }
                }
            }
        }
    }

}
