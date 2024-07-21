package net.romeosnowblitz.hmh2.block.custom.summon;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.block.pattern.BlockPatternBuilder;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.predicate.block.BlockStatePredicate;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.entity.boss.queen_bee.QueenBeeEntity;
import net.romeosnowblitz.hmh2.entity.boss.soldier_bee.SoldierBeeEntity;

import java.util.function.Predicate;

public class QueenBeeSummonBlock extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    private BlockPattern soldierBeePattern;
    private BlockPattern queenBeePattern;
    private static final Predicate<BlockState> IS_GOLEM_HEAD_PREDICATE = state -> state != null && (state.isOf(ModBlocks.HONEY_HIVE));

    public QueenBeeSummonBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (oldState.isOf(state.getBlock())) {
            return;
        }
        this.trySpawnEntity(world, pos);
    }

    private void trySpawnEntity(World world, BlockPos pos) {
        block9: {
            BlockPattern.Result result;
            block8: {
                result = this.getSoldierBeePattern().searchAround(world, pos);
                if (result == null) break block8;
                for (int i = 0; i < this.getSoldierBeePattern().getHeight(); ++i) {
                    CachedBlockPosition cachedBlockPosition = result.translate(0, i, 0);
                    world.setBlockState(cachedBlockPosition.getBlockPos(), Blocks.AIR.getDefaultState(), Block.NOTIFY_LISTENERS);
                    world.syncWorldEvent(WorldEvents.BLOCK_BROKEN, cachedBlockPosition.getBlockPos(), Block.getRawIdFromState(cachedBlockPosition.getBlockState()));
                }
                SoldierBeeEntity soldierBeeEntity = ModEntities.SOLDIER_BEE.create(world);
                BlockPos blockPos = result.translate(0, 2, 0).getBlockPos();
                soldierBeeEntity.refreshPositionAndAngles((double)blockPos.getX() + 0.5, (double)blockPos.getY() + 0.05, (double)blockPos.getZ() + 0.5, 0.0f, 0.0f);
                world.spawnEntity(soldierBeeEntity);
                for (ServerPlayerEntity serverPlayerEntity : world.getNonSpectatingEntities(ServerPlayerEntity.class, soldierBeeEntity.getBoundingBox().expand(5.0))) {
                    Criteria.SUMMONED_ENTITY.trigger(serverPlayerEntity, soldierBeeEntity);
                }
                for (int j = 0; j < this.getSoldierBeePattern().getHeight(); ++j) {
                    CachedBlockPosition cachedBlockPosition2 = result.translate(0, j, 0);
                    world.updateNeighbors(cachedBlockPosition2.getBlockPos(), Blocks.AIR);
                }
                break block9;
            }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            result = this.getQueenBeePattern().searchAround(world, pos);
            if (result == null) break block9;
            for (int i = 0; i < this.getQueenBeePattern().getWidth(); ++i) {
                for (int k = 0; k < this.getQueenBeePattern().getHeight(); ++k) {
                    CachedBlockPosition cachedBlockPosition3 = result.translate(i, k, 0);
                    world.setBlockState(cachedBlockPosition3.getBlockPos(), Blocks.AIR.getDefaultState(), Block.NOTIFY_LISTENERS);
                    world.syncWorldEvent(WorldEvents.BLOCK_BROKEN, cachedBlockPosition3.getBlockPos(), Block.getRawIdFromState(cachedBlockPosition3.getBlockState()));
                }
            }
            BlockPos blockPos2 = result.translate(1, 2, 0).getBlockPos();
            QueenBeeEntity summoningEntity = ModEntities.QUEEN_BEE.create(world);
            summoningEntity.refreshPositionAndAngles((double)blockPos2.getX() + 0.5, (double)blockPos2.getY() + 0.05, (double)blockPos2.getZ() + 0.5, 0.0f, 0.0f);
            world.spawnEntity(summoningEntity);
            for (ServerPlayerEntity serverPlayerEntity : world.getNonSpectatingEntities(ServerPlayerEntity.class, summoningEntity.getBoundingBox().expand(5.0))) {
                Criteria.SUMMONED_ENTITY.trigger(serverPlayerEntity, summoningEntity);
            }
            for (int j = 0; j < this.getQueenBeePattern().getWidth(); ++j) {
                for (int l = 0; l < this.getQueenBeePattern().getHeight(); ++l) {
                    CachedBlockPosition cachedBlockPosition4 = result.translate(j, l, 0);
                    world.updateNeighbors(cachedBlockPosition4.getBlockPos(), Blocks.AIR);
                }
            }
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    private BlockPattern getSoldierBeePattern() {
        if (this.soldierBeePattern == null) {
            this.soldierBeePattern = BlockPatternBuilder.start().aisle("^", "#", "~").where('^', CachedBlockPosition.matchesBlockState(IS_GOLEM_HEAD_PREDICATE)).where('#', CachedBlockPosition.matchesBlockState(BlockStatePredicate.forBlock(ModBlocks.ROYAL_JELLY))).where('~', CachedBlockPosition.matchesBlockState(BlockStatePredicate.forBlock(Blocks.AIR))).build();
        }
        return this.soldierBeePattern;
    }

    private BlockPattern getQueenBeePattern() {
        if (this.queenBeePattern == null) {
            this.queenBeePattern = BlockPatternBuilder.start().aisle("^", "#", "#", "#").where('^', CachedBlockPosition.matchesBlockState(IS_GOLEM_HEAD_PREDICATE)).where('#', CachedBlockPosition.matchesBlockState(BlockStatePredicate.forBlock(ModBlocks.ROYAL_JELLY))).where('~', CachedBlockPosition.matchesBlockState(BlockStatePredicate.forBlock(Blocks.AIR))).build();
        }
        return this.queenBeePattern;
    }

}
