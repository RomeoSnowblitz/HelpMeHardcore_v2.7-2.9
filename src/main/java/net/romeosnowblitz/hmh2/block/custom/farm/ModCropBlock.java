package net.romeosnowblitz.hmh2.block.custom.farm;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.RavagerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.romeosnowblitz.hmh2.block.ModBlocks;

public class ModCropBlock extends PlantBlock implements Fertilizable {

    public ModCropBlock(Settings settings) {
        super(settings);
        setDefaultState(stateManager.getDefaultState().with(Properties.AGE_7, 0));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return new VoxelShape[]{
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)}
                [state.get(Properties.AGE_7)];
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ModBlocks.CRIMSON_FARMLAND) || floor.isOf(ModBlocks.WARPED_FARMLAND);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return !(state.get(Properties.AGE_7) >= 7);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getBaseLightLevel(pos, 0) >= 9 && state.get(Properties.AGE_7) < 7 &&
                random.nextInt((int)(25.0f / (getAvailableMoisture(this, world, pos))) + 1) == 0) {
            world.setBlockState(pos, getDefaultState().with(Properties.AGE_7, (state.get(Properties.AGE_7) + 1)), Block.NOTIFY_LISTENERS);
        }
    }

    protected static float getAvailableMoisture(Block block, BlockView world, BlockPos pos) {
        float f = 1.0F;
        for(int i = -1; i <= 1; ++i) {
            for(int j = -1; j <= 1; ++j) {
                float g = 0.0F;
                if (world.getBlockState(pos.down().add(i, 0, j)).isOf(ModBlocks.CRIMSON_FARMLAND) ||
                        world.getBlockState(pos.down().add(i, 0, j)).isOf(ModBlocks.WARPED_FARMLAND)) {
                    g = 1.0F;
                    if (world.getBlockState(pos.down().add(i, 0, j)).get(Properties.MOISTURE) > 0) {
                        g = 3.0F;
                    }
                }
                if (i != 0 || j != 0) {
                    g /= 4.0F;
                }
                f += g;
            }
        }
        if (world.getBlockState(pos.west()).isOf(block) || world.getBlockState(pos.east()).isOf(block) &&
                world.getBlockState(pos.north()).isOf(block) || world.getBlockState(pos.south()).isOf(block)) {
            f /= 2.0F;
        } else {
            if (world.getBlockState(pos.west().north()).isOf(block) || world.getBlockState(pos.east().north()).isOf(block) ||
                    world.getBlockState(pos.east().south()).isOf(block) || world.getBlockState(pos.west().south()).isOf(block)) {
                f /= 2.0F;
            }
        }
        return f;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return (world.getBaseLightLevel(pos, 0) >= 8 || world.isSkyVisible(pos)) && super.canPlaceAt(state, world, pos);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity instanceof RavagerEntity && world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING)) {
            world.breakBlock(pos, true, entity);
        }
        super.onEntityCollision(state, world, pos, entity);
    }

    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state, boolean isClient) {
        return state.get(Properties.AGE_7) < 3;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        int i = state.get(Properties.AGE_7) + MathHelper.nextInt(world.random, 2, 5);
        if (i > 7) {
            i = 7;
        }
        world.setBlockState(pos, getDefaultState().with(Properties.AGE_7, i), Block.NOTIFY_LISTENERS);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.AGE_7);
    }
}
