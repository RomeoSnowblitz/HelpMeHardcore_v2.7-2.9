package net.romeosnowblitz.hmh2.block.custom.test;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class WallLampTorch extends LampTorch {
    public static final DirectionProperty FACING;
    public static final BooleanProperty LIT;

    public WallLampTorch(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(LIT, false));
    }

    public String getTranslationKey() {
        return this.asItem().getTranslationKey();
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return WallTorchBlock.getBoundingShape(state);
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return Blocks.WALL_TORCH.canPlaceAt(state, world, pos);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return Blocks.WALL_TORCH.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = Blocks.WALL_TORCH.getPlacementState(ctx);
        return blockState == null ? null : this.getDefaultState().with(FACING, blockState.get(FACING));
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (state.get(LIT)) {
            Direction direction = state.get(FACING).getOpposite();
            double e = (double)pos.getX() + 0.5D + (random.nextDouble() - 0.5D) * 0.2D + 0.27D * (double)direction.getOffsetX();
            double f = (double)pos.getY() + 0.7D + (random.nextDouble() - 0.5D) * 0.2D + 0.22D;
            double g = (double)pos.getZ() + 0.5D + (random.nextDouble() - 0.5D) * 0.2D + 0.27D * (double)direction.getOffsetZ();
            world.addParticle(this.particle, e, f, g, 0.0D, 0.0D, 0.0D);
        }
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return Blocks.WALL_TORCH.rotate(state, rotation);
    }

    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return Blocks.WALL_TORCH.mirror(state, mirror);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, LIT);
    }

    static {
        FACING = HorizontalFacingBlock.FACING;
        LIT = RedstoneTorchBlock.LIT;
    }
}