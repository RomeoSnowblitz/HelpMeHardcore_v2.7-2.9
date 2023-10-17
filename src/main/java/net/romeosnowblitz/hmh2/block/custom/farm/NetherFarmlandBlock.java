package net.romeosnowblitz.hmh2.block.custom.farm;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.*;
import net.romeosnowblitz.hmh2.block.ModBlocks;

public class NetherFarmlandBlock extends Block {

    protected static Block BLOCK;
    public static final IntProperty MOISTURE = Properties.MOISTURE;
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);

    public NetherFarmlandBlock(Settings settings, Block block) {
        super(settings);
        BLOCK = block;
        this.setDefaultState(this.stateManager.getDefaultState().with(MOISTURE, 0));
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction == Direction.UP && !state.canPlaceAt(world, pos)) {
            world.scheduleBlockTick(pos, this, 1);
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.up());
        return !blockState.isSolid() || blockState.getBlock() instanceof FenceGateBlock || blockState.getBlock() instanceof PistonExtensionBlock;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        if (!this.getDefaultState().canPlaceAt(ctx.getWorld(), ctx.getBlockPos())) {
            return BLOCK.getDefaultState();
        }
        return super.getPlacementState(ctx);
    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }


    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            setToNylium(state, world, pos);
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int i = state.get(MOISTURE);
        if (isLavaNearby(world, pos)) {
            if (i < 7) {
                world.setBlockState(pos, state.with(MOISTURE, 7), Block.NOTIFY_LISTENERS);
            }
        } else if (i > 0) {
            world.setBlockState(pos, state.with(MOISTURE, i - 1), Block.NOTIFY_LISTENERS);
        } else if (!hasModCrop(world, pos)) {
            setToNylium(state, world, pos);
        }
    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if (!world.isClient && world.random.nextFloat() < fallDistance - 0.5f && entity instanceof LivingEntity &&
                (entity instanceof PlayerEntity || world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING)) &&
                entity.getWidth() * entity.getWidth() * entity.getHeight() > 0.512f) {
            setToNylium(state, world, pos);
        }
        super.onLandedUpon(world, state, pos, entity, fallDistance);
    }

    public void setToNylium(BlockState state, World world, BlockPos pos) {
        if(this == ModBlocks.CRIMSON_FARMLAND){
            world.setBlockState(pos, Block.pushEntitiesUpBeforeBlockChange(state, Blocks.CRIMSON_NYLIUM.getDefaultState(), world, pos));
        }
        if(this == ModBlocks.WARPED_FARMLAND){
            world.setBlockState(pos, Block.pushEntitiesUpBeforeBlockChange(state, Blocks.WARPED_NYLIUM.getDefaultState(), world, pos));
        }
    }

    private static boolean hasModCrop(BlockView world, BlockPos pos) {
        Block block = world.getBlockState(pos.up()).getBlock();
        return block instanceof ModCropBlock;
    }

    private static boolean isLavaNearby(WorldView world, BlockPos pos) {
        for (BlockPos blockPos : BlockPos.iterate(pos.add(-4, 0, -4), pos.add(4, 1, 4))) {
            if (!world.getFluidState(blockPos).isIn(FluidTags.LAVA)) continue;
            return true;
        }
        return false;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(MOISTURE);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

}
