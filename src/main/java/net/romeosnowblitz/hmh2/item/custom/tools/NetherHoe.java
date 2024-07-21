package net.romeosnowblitz.hmh2.item.custom.tools;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.block.ModBlocks;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static net.minecraft.item.HoeItem.createTillAction;
import static net.minecraft.item.HoeItem.createTillAndDropAction;

public class NetherHoe extends MiningToolItem {
    protected static final Map<Block, Pair<Predicate<ItemUsageContext>, Consumer<ItemUsageContext>>> TILLING_ACTIONS;

    public NetherHoe(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(attackDamage, attackSpeed, material, BlockTags.HOE_MINEABLE, settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        Pair pair = TILLING_ACTIONS.get(world.getBlockState(blockPos).getBlock());
        if (pair == null) {
            return ActionResult.PASS;
        } else {
            Predicate predicate = (Predicate) pair.getFirst();
            Consumer consumer = (Consumer) pair.getSecond();
            if (predicate.test(context)) {
                PlayerEntity playerEntity = context.getPlayer();
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                if (!world.isClient) {
                    consumer.accept(context);
                    if (playerEntity != null) {
                        context.getStack().damage(1, playerEntity, (p) -> p.sendToolBreakStatus(context.getHand()));
                    }
                }
                return ActionResult.success(world.isClient);
            } else {
                return ActionResult.PASS;
            }
        }
    }

    static {
        TILLING_ACTIONS = Maps.newHashMap(ImmutableMap.of(
                Blocks.CRIMSON_NYLIUM, Pair.of(HoeItem::canTillFarmland, createTillAction(ModBlocks.CRIMSON_FARMLAND.getDefaultState())),
                Blocks.WARPED_NYLIUM, Pair.of(HoeItem::canTillFarmland, createTillAction(ModBlocks.WARPED_FARMLAND.getDefaultState())),
                Blocks.GRASS_BLOCK, Pair.of(HoeItem::canTillFarmland, createTillAction(Blocks.FARMLAND.getDefaultState())),
                Blocks.DIRT_PATH, Pair.of(HoeItem::canTillFarmland, createTillAction(Blocks.FARMLAND.getDefaultState())),
                Blocks.DIRT, Pair.of(HoeItem::canTillFarmland, createTillAction(Blocks.FARMLAND.getDefaultState())),
                Blocks.COARSE_DIRT, Pair.of(HoeItem::canTillFarmland, createTillAction(Blocks.DIRT.getDefaultState())),
                Blocks.ROOTED_DIRT, Pair.of((itemUsageContext) -> true, createTillAndDropAction(Blocks.DIRT.getDefaultState(), Items.HANGING_ROOTS))));
    }
}
