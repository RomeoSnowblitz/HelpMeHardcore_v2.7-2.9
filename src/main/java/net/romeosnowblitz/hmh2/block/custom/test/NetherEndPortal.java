package net.romeosnowblitz.hmh2.block.custom.test;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.PositionFlag;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.*;
import net.minecraft.world.dimension.NetherPortal;

import java.util.Collections;
import java.util.Random;
import java.util.Set;

public class NetherEndPortal extends Block {
    public static final EnumProperty<Direction.Axis> AXIS;
    protected static final int field_31196 = 2;
    protected static final VoxelShape X_SHAPE;
    protected static final VoxelShape Z_SHAPE;
    public static int t = 0;

    public NetherEndPortal(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(AXIS, Direction.Axis.X));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch(state.get(AXIS)) {
            case Z:
                return Z_SHAPE;
            case X:
            default:
                return X_SHAPE;
        }
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        Direction.Axis axis = direction.getAxis();
        Direction.Axis axis2 = state.get(AXIS);
        boolean bl = axis2 != axis && axis.isHorizontal();
        return !bl && !neighborState.isOf(this) && !(new NetherPortal(world, pos, axis2)).wasAlreadyValid() ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        t++;if (world instanceof ServerWorld serverWorld && t>=100){t=0;
            Random random = new Random();int x = random.nextInt(3)+1;
            if(x==1){entity.teleport(serverWorld.getServer().getWorld(World.OVERWORLD), entity.getX(), entity.getY(), entity.getZ(), Set.of(), entity.getYaw(), entity.getPitch());}
            if(x==2){entity.teleport(serverWorld.getServer().getWorld(World.NETHER), entity.getX(), entity.getY(), entity.getZ(), Set.of(), entity.getYaw(), entity.getPitch());}
            if(x==3){entity.teleport(serverWorld.getServer().getWorld(World.END), entity.getX(), entity.getY(), entity.getZ(), Set.of(), entity.getYaw(), entity.getPitch());}
        }
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(100) == 0) {
            world.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_PORTAL_AMBIENT, SoundCategory.BLOCKS, 0.5F, random.nextFloat() * 0.4F + 0.8F, false);
        }

        for(int i = 0; i < 4; ++i) {
            double d = (double)pos.getX() + random.nextDouble();
            double e = (double)pos.getY() + random.nextDouble();
            double f = (double)pos.getZ() + random.nextDouble();
            double g = ((double)random.nextFloat() - 0.5D) * 0.5D;
            double h = ((double)random.nextFloat() - 0.5D) * 0.5D;
            double j = ((double)random.nextFloat() - 0.5D) * 0.5D;
            int k = random.nextInt(2) * 2 - 1;
            if (!world.getBlockState(pos.west()).isOf(this) && !world.getBlockState(pos.east()).isOf(this)) {
                d = (double)pos.getX() + 0.5D + 0.25D * (double)k;
                g = random.nextFloat() * 2.0F * (float)k;
            } else {
                f = (double)pos.getZ() + 0.5D + 0.25D * (double)k;
                j = random.nextFloat() * 2.0F * (float)k;
            }

            world.addParticle(ParticleTypes.PORTAL, d, e, f, g, h, j);
        }

    }

    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return ItemStack.EMPTY;
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        switch(rotation) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch(state.get(AXIS)) {
                    case Z:
                        return state.with(AXIS, Direction.Axis.X);
                    case X:
                        return state.with(AXIS, Direction.Axis.Z);
                    default:
                        return state;
                }
            default:
                return state;
        }
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AXIS);
    }

    static {
        AXIS = Properties.HORIZONTAL_AXIS;
        X_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 6.0D, 16.0D, 16.0D, 10.0D);
        Z_SHAPE = Block.createCuboidShape(6.0D, 0.0D, 0.0D, 10.0D, 16.0D, 16.0D);
    }
}
