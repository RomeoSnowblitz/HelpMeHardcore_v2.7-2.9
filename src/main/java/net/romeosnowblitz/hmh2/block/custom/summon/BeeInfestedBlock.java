package net.romeosnowblitz.hmh2.block.custom.summon;

import com.google.common.collect.Maps;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BeehiveBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SilverfishEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class BeeInfestedBlock extends Block {
    private final Block regularBlock;
    private static final Map<Block, Block> REGULAR_TO_BEE_INFESTED_BLOCK = Maps.newIdentityHashMap();
    private static final Map<BlockState, BlockState> REGULAR_TO_BEE_INFESTED_STATE = Maps.newIdentityHashMap();
    private static final Map<BlockState, BlockState> BEE_INFESTED_TO_REGULAR_STATE = Maps.newIdentityHashMap();

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
        super.afterBreak(world, player, pos, state, blockEntity, stack);
        if (!world.isClient && blockEntity instanceof BeehiveBlockEntity) {
            BeehiveBlockEntity beehiveBlockEntity = (BeehiveBlockEntity)blockEntity;
            if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
                beehiveBlockEntity.angerBees(player, state, BeehiveBlockEntity.BeeState.EMERGENCY);
                world.updateComparators(pos, this);
                this.angerNearbyBees(world, pos);
            }
            Criteria.BEE_NEST_DESTROYED.trigger((ServerPlayerEntity)player, state, stack, beehiveBlockEntity.getBeeCount());
        }
    }

    private void angerNearbyBees(World world, BlockPos pos) {
        List<BeeEntity> list = world.getNonSpectatingEntities(BeeEntity.class, new Box(pos).expand(8.0, 6.0, 8.0));
        if (!list.isEmpty()) {
            List<PlayerEntity> list2 = world.getNonSpectatingEntities(PlayerEntity.class, new Box(pos).expand(8.0, 6.0, 8.0));
            int i = list2.size();
            for (BeeEntity beeEntity : list) {
                if (beeEntity.getTarget() != null) continue;
                beeEntity.setTarget(list2.get(world.random.nextInt(i)));
            }
        }
    }

    public BeeInfestedBlock(Block regularBlock, AbstractBlock.Settings settings) {
        super(settings.hardness(regularBlock.getHardness() / 2.0f).resistance(0.75f));
        this.regularBlock = regularBlock;
        REGULAR_TO_BEE_INFESTED_BLOCK.put(regularBlock, this);
    }

    public Block getRegularBlock() {
        return this.regularBlock;
    }

    public static boolean isInfestable(BlockState block) {
        return REGULAR_TO_BEE_INFESTED_BLOCK.containsKey(block.getBlock());
    }

    private void spawnSilverfish(ServerWorld world, BlockPos pos) {
        BeeEntity beeEntity = EntityType.BEE.create(world);
        beeEntity.refreshPositionAndAngles((double)pos.getX() + 0.5, pos.getY(), (double)pos.getZ() + 0.5, 0.0f, 0.0f);
        world.spawnEntity(beeEntity);
        beeEntity.playSpawnEffects();
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack, boolean dropExperience) {
        super.onStacksDropped(state, world, pos, stack, dropExperience);
        if (world.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            this.spawnSilverfish(world, pos);
        }
    }

    public static BlockState fromRegularState(BlockState regularState) {
        return BeeInfestedBlock.copyProperties(REGULAR_TO_BEE_INFESTED_STATE, regularState, () -> REGULAR_TO_BEE_INFESTED_BLOCK.get(regularState.getBlock()).getDefaultState());
    }

    public BlockState toRegularState(BlockState infestedState) {
        return BeeInfestedBlock.copyProperties(BEE_INFESTED_TO_REGULAR_STATE, infestedState, () -> this.getRegularBlock().getDefaultState());
    }

    private static BlockState copyProperties(Map<BlockState, BlockState> stateMap, BlockState fromState, Supplier<BlockState> toStateSupplier) {
        return stateMap.computeIfAbsent(fromState, infestedState -> {
            BlockState blockState = (BlockState)toStateSupplier.get();
            for (Property<?> property : infestedState.getProperties()) {
                blockState = blockState.contains(property) ? (BlockState)blockState : blockState;
            }
            return blockState;
        });
    }
}
