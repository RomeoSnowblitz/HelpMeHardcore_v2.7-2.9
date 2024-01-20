package net.romeosnowblitz.hmh2.block.custom.test;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.enums.BedPart;
import net.minecraft.entity.Dismounting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.*;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.CollisionView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.explosion.ExplosionBehavior;
import net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

public class NewBedBlock extends HorizontalFacingBlock implements BlockEntityProvider {
    public static final EnumProperty<BedPart> PART;
    public static final BooleanProperty OCCUPIED;
    protected static final int field_31009 = 9;
    protected static final VoxelShape TOP_SHAPE;
    private static final int field_31010 = 3;
    protected static final VoxelShape LEG_1_SHAPE;
    protected static final VoxelShape LEG_2_SHAPE;
    protected static final VoxelShape LEG_3_SHAPE;
    protected static final VoxelShape LEG_4_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape EAST_SHAPE;
    private final ModDyeColor color;

    public NewBedBlock(ModDyeColor color, Settings settings) {
        super(settings);
        this.color = color;
        this.setDefaultState(this.stateManager.getDefaultState().with(PART, BedPart.FOOT).with(OCCUPIED, false));
    }

    @Nullable
    public static Direction getDirection(BlockView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos);
        return blockState.getBlock() instanceof BedBlock ? (Direction)blockState.get(FACING) : null;
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.CONSUME;
        } else {
            if (state.get(PART) != BedPart.HEAD) {
                pos = pos.offset(state.get(FACING));
                state = world.getBlockState(pos);
                if (!state.isOf(this)) {
                    return ActionResult.CONSUME;
                }
            }

            if (!isBedWorking(world)) {
                world.removeBlock(pos, false);
                BlockPos blockPos = pos.offset(state.get(FACING).getOpposite());
                if (world.getBlockState(blockPos).isOf(this)) {
                    world.removeBlock(blockPos, false);
                }

                Vec3d vec3d = pos.toCenterPos();
                world.createExplosion(null, world.getDamageSources().badRespawnPoint(vec3d), null, vec3d, 5.0F, true, World.ExplosionSourceType.BLOCK);
                return ActionResult.SUCCESS;
            } else if (state.get(OCCUPIED)) {
                if (!this.wakeVillager(world, pos)) {
                    player.sendMessage(Text.translatable("block.minecraft.bed.occupied"), true);
                }

                return ActionResult.SUCCESS;
            } else {
                player.trySleep(pos).ifLeft((reason) -> {
                    if (reason.getMessage() != null) {
                        player.sendMessage(reason.getMessage(), true);
                    }

                });
                return ActionResult.SUCCESS;
            }
        }
    }

    public static boolean isBedWorking(World world) {
        return world.getDimension().bedWorks();
    }

    private boolean wakeVillager(World world, BlockPos pos) {
        List<VillagerEntity> list = world.getEntitiesByClass(VillagerEntity.class, new Box(pos), LivingEntity::isSleeping);
        if (list.isEmpty()) {
            return false;
        } else {
            list.get(0).wakeUp();
            return true;
        }
    }

    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        super.onLandedUpon(world, state, pos, entity, fallDistance * 0.5F);
    }

    public void onEntityLand(BlockView world, Entity entity) {
        if (entity.bypassesLandingEffects()) {
            super.onEntityLand(world, entity);
        } else {
            this.bounceEntity(entity);
        }

    }

    private void bounceEntity(Entity entity) {
        Vec3d vec3d = entity.getVelocity();
        if (vec3d.y < 0.0D) {
            double d = entity instanceof LivingEntity ? 1.0D : 0.8D;
            entity.setVelocity(vec3d.x, -vec3d.y * 0.6600000262260437D * d, vec3d.z);
        }

    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction == getDirectionTowardsOtherPart(state.get(PART), state.get(FACING))) {
            return neighborState.isOf(this) && neighborState.get(PART) != state.get(PART) ? state.with(OCCUPIED, neighborState.get(OCCUPIED)) : Blocks.AIR.getDefaultState();
        } else {
            return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
        }
    }

    private static Direction getDirectionTowardsOtherPart(BedPart part, Direction direction) {
        return part == BedPart.FOOT ? direction : direction.getOpposite();
    }

    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient && player.isCreative()) {
            BedPart bedPart = state.get(PART);
            if (bedPart == BedPart.FOOT) {
                BlockPos blockPos = pos.offset(getDirectionTowardsOtherPart(bedPart, state.get(FACING)));
                BlockState blockState = world.getBlockState(blockPos);
                if (blockState.isOf(this) && blockState.get(PART) == BedPart.HEAD) {
                    world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 35);
                    world.syncWorldEvent(player, 2001, blockPos, Block.getRawIdFromState(blockState));
                }
            }
        }

        super.onBreak(world, pos, state, player);
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction direction = ctx.getHorizontalPlayerFacing();
        BlockPos blockPos = ctx.getBlockPos();
        BlockPos blockPos2 = blockPos.offset(direction);
        World world = ctx.getWorld();
        return world.getBlockState(blockPos2).canReplace(ctx) && world.getWorldBorder().contains(blockPos2) ? (BlockState)this.getDefaultState().with(FACING, direction) : null;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = getOppositePartDirection(state).getOpposite();
        switch(direction) {
            case NORTH:
                return NORTH_SHAPE;
            case SOUTH:
                return SOUTH_SHAPE;
            case WEST:
                return WEST_SHAPE;
            default:
                return EAST_SHAPE;
        }
    }

    public static Direction getOppositePartDirection(BlockState state) {
        Direction direction = state.get(FACING);
        return state.get(PART) == BedPart.HEAD ? direction.getOpposite() : direction;
    }

    public static DoubleBlockProperties.Type getBedPart(BlockState state) {
        BedPart bedPart = state.get(PART);
        return bedPart == BedPart.HEAD ? DoubleBlockProperties.Type.FIRST : DoubleBlockProperties.Type.SECOND;
    }

    private static boolean isBedBelow(BlockView world, BlockPos pos) {
        return world.getBlockState(pos.down()).getBlock() instanceof BedBlock;
    }

    public static Optional<Vec3d> findWakeUpPosition(EntityType<?> type, CollisionView world, BlockPos pos, Direction bedDirection, float spawnAngle) {
        Direction direction = bedDirection.rotateYClockwise();
        Direction direction2 = direction.pointsTo(spawnAngle) ? direction.getOpposite() : direction;
        if (isBedBelow(world, pos)) {
            return findWakeUpPosition(type, world, pos, bedDirection, direction2);
        } else {
            int[][] is = getAroundAndOnBedOffsets(bedDirection, direction2);
            Optional<Vec3d> optional = findWakeUpPosition(type, world, pos, is, true);
            return optional.isPresent() ? optional : findWakeUpPosition(type, world, pos, is, false);
        }
    }

    private static Optional<Vec3d> findWakeUpPosition(EntityType<?> type, CollisionView world, BlockPos pos, Direction bedDirection, Direction respawnDirection) {
        int[][] is = getAroundBedOffsets(bedDirection, respawnDirection);
        Optional<Vec3d> optional = findWakeUpPosition(type, world, pos, is, true);
        if (optional.isPresent()) {
            return optional;
        } else {
            BlockPos blockPos = pos.down();
            Optional<Vec3d> optional2 = findWakeUpPosition(type, world, blockPos, is, true);
            if (optional2.isPresent()) {
                return optional2;
            } else {
                int[][] js = getOnBedOffsets(bedDirection);
                Optional<Vec3d> optional3 = findWakeUpPosition(type, world, pos, js, true);
                if (optional3.isPresent()) {
                    return optional3;
                } else {
                    Optional<Vec3d> optional4 = findWakeUpPosition(type, world, pos, is, false);
                    if (optional4.isPresent()) {
                        return optional4;
                    } else {
                        Optional<Vec3d> optional5 = findWakeUpPosition(type, world, blockPos, is, false);
                        return optional5.isPresent() ? optional5 : findWakeUpPosition(type, world, pos, js, false);
                    }
                }
            }
        }
    }

    private static Optional<Vec3d> findWakeUpPosition(EntityType<?> type, CollisionView world, BlockPos pos, int[][] possibleOffsets, boolean ignoreInvalidPos) {
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        int[][] var6 = possibleOffsets;
        int var7 = possibleOffsets.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            int[] is = var6[var8];
            mutable.set(pos.getX() + is[0], pos.getY(), pos.getZ() + is[1]);
            Vec3d vec3d = Dismounting.findRespawnPos(type, world, mutable, ignoreInvalidPos);
            if (vec3d != null) {
                return Optional.of(vec3d);
            }
        }

        return Optional.empty();
    }

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, PART, OCCUPIED});
    }

    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new NewBedBlockEntity(pos, state, this.color);
    }

    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        if (!world.isClient) {
            BlockPos blockPos = pos.offset(state.get(FACING));
            world.setBlockState(blockPos, state.with(PART, BedPart.HEAD), 3);
            world.updateNeighbors(pos, Blocks.AIR);
            state.updateNeighbors(world, pos, 3);
        }

    }

    public ModDyeColor getColor() {
        return this.color;
    }

    public long getRenderingSeed(BlockState state, BlockPos pos) {
        BlockPos blockPos = pos.offset(state.get(FACING), state.get(PART) == BedPart.HEAD ? 0 : 1);
        return MathHelper.hashCode(blockPos.getX(), pos.getY(), blockPos.getZ());
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    private static int[][] getAroundAndOnBedOffsets(Direction bedDirection, Direction respawnDirection) {
        return ArrayUtils.addAll(getAroundBedOffsets(bedDirection, respawnDirection), getOnBedOffsets(bedDirection));
    }

    private static int[][] getAroundBedOffsets(Direction bedDirection, Direction respawnDirection) {
        return new int[][]{{respawnDirection.getOffsetX(), respawnDirection.getOffsetZ()}, {respawnDirection.getOffsetX() - bedDirection.getOffsetX(), respawnDirection.getOffsetZ() - bedDirection.getOffsetZ()}, {respawnDirection.getOffsetX() - bedDirection.getOffsetX() * 2, respawnDirection.getOffsetZ() - bedDirection.getOffsetZ() * 2}, {-bedDirection.getOffsetX() * 2, -bedDirection.getOffsetZ() * 2}, {-respawnDirection.getOffsetX() - bedDirection.getOffsetX() * 2, -respawnDirection.getOffsetZ() - bedDirection.getOffsetZ() * 2}, {-respawnDirection.getOffsetX() - bedDirection.getOffsetX(), -respawnDirection.getOffsetZ() - bedDirection.getOffsetZ()}, {-respawnDirection.getOffsetX(), -respawnDirection.getOffsetZ()}, {-respawnDirection.getOffsetX() + bedDirection.getOffsetX(), -respawnDirection.getOffsetZ() + bedDirection.getOffsetZ()}, {bedDirection.getOffsetX(), bedDirection.getOffsetZ()}, {respawnDirection.getOffsetX() + bedDirection.getOffsetX(), respawnDirection.getOffsetZ() + bedDirection.getOffsetZ()}};
    }

    private static int[][] getOnBedOffsets(Direction bedDirection) {
        return new int[][]{{0, 0}, {-bedDirection.getOffsetX(), -bedDirection.getOffsetZ()}};
    }

    static {
        PART = Properties.BED_PART;
        OCCUPIED = Properties.OCCUPIED;
        TOP_SHAPE = Block.createCuboidShape(0.0D, 3.0D, 0.0D, 16.0D, 9.0D, 16.0D);
        LEG_1_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 3.0D, 3.0D, 3.0D);
        LEG_2_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 13.0D, 3.0D, 3.0D, 16.0D);
        LEG_3_SHAPE = Block.createCuboidShape(13.0D, 0.0D, 0.0D, 16.0D, 3.0D, 3.0D);
        LEG_4_SHAPE = Block.createCuboidShape(13.0D, 0.0D, 13.0D, 16.0D, 3.0D, 16.0D);
        NORTH_SHAPE = VoxelShapes.union(TOP_SHAPE, new VoxelShape[]{LEG_1_SHAPE, LEG_3_SHAPE});
        SOUTH_SHAPE = VoxelShapes.union(TOP_SHAPE, new VoxelShape[]{LEG_2_SHAPE, LEG_4_SHAPE});
        WEST_SHAPE = VoxelShapes.union(TOP_SHAPE, new VoxelShape[]{LEG_1_SHAPE, LEG_2_SHAPE});
        EAST_SHAPE = VoxelShapes.union(TOP_SHAPE, new VoxelShape[]{LEG_3_SHAPE, LEG_4_SHAPE});
    }
}
