package net.romeosnowblitz.hmh2.block.custom.summon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;

public class BeeInfestedBlock extends Block {

    public BeeInfestedBlock(Settings settings) {
        super(settings);
    }

        /*
    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
        super.afterBreak(world, player, pos, state, blockEntity, stack);
        BeeEntity beeEntity = (BeeEntity) world.getEntitiesByType(EntityType.BEE, new Box(pos).expand(15.0, 40.0, 15.0), EntityPredicates.VALID_ENTITY);
        beeEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100));
        beeEntity.setTarget(player);
    }
     */

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack, boolean dropExperience) {
        super.onStacksDropped(state, world, pos, stack, dropExperience);
        if (world.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            EntityType.BEE.spawn(world, pos, SpawnReason.MOB_SUMMONED);
        }
    }

}
