package net.romeosnowblitz.hmh2.block.custom.blockentity;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.entity.custom.ModShulkerEntity;
import net.romeosnowblitz.hmh2.item.custom.ModDyeColor;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModShulkerBox extends BlockWithEntity {
    public static final EnumProperty<Direction> FACING = FacingBlock.FACING;
    public static final Identifier CONTENTS = new Identifier("contents");
    @Nullable
    private final ModDyeColor color;

    public ModShulkerBox(@Nullable ModDyeColor color, AbstractBlock.Settings settings) {
        super(settings);
        this.color = color;
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.UP));
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ModShulkerBoxEntity(this.color, pos, state);
    }

    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return ModShulkerBox.checkType(type, BlockEntityType.SHULKER_BOX, ShulkerBoxBlockEntity::tick);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        }
        if (player.isSpectator()) {
            return ActionResult.CONSUME;
        }
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof ModShulkerBoxEntity) {
            ModShulkerBoxEntity modShulkerBoxEntity = (ModShulkerBoxEntity) blockEntity;
            if (ModShulkerBox.canOpen(state, world, pos, modShulkerBoxEntity)) {
                player.openHandledScreen(modShulkerBoxEntity);
                player.incrementStat(Stats.OPEN_SHULKER_BOX);
                PiglinBrain.onGuardedBlockInteracted(player, true);
            }
            return ActionResult.CONSUME;
        }
        return ActionResult.PASS;
    }

    private static boolean canOpen(BlockState state, World world, BlockPos pos, ModShulkerBoxEntity entity) {
        if (entity.getAnimationStage() != ModShulkerBoxEntity.AnimationStage.CLOSED) {
            return true;
        }
        Box box = ModShulkerEntity.calculateBoundingBox(state.get(FACING), 0.0f, 0.5f).offset(pos).contract(1.0E-6);
        return world.isSpaceEmpty(box);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getSide());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof ModShulkerBoxEntity) {
            ModShulkerBoxEntity modShulkerBoxEntity = (ModShulkerBoxEntity) blockEntity;
            if (!world.isClient && player.isCreative() && !modShulkerBoxEntity.isEmpty()) {
                ItemStack itemStack = ModShulkerBox.getItemStack(this.getColor());
                blockEntity.setStackNbt(itemStack);
                if (modShulkerBoxEntity.hasCustomName()) {
                    itemStack.setCustomName(modShulkerBoxEntity.getCustomName());
                }
                ItemEntity itemEntity = new ItemEntity(world, (double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5, itemStack);
                itemEntity.setToDefaultPickupDelay();
                world.spawnEntity(itemEntity);
            } else {
                modShulkerBoxEntity.checkLootInteraction(player);
            }
        }
        super.onBreak(world, pos, state, player);
    }

    @Override
    public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
        BlockEntity blockEntity = builder.getNullable(LootContextParameters.BLOCK_ENTITY);
        if (blockEntity instanceof ModShulkerBoxEntity) {
            ModShulkerBoxEntity modShulkerBoxEntity = (ModShulkerBoxEntity) blockEntity;
            builder = builder.putDrop(CONTENTS, (context, consumer) -> {
                for (int i = 0; i < modShulkerBoxEntity.size(); ++i) {
                    consumer.accept(modShulkerBoxEntity.getStack(i));
                }
            });
        }
        return super.getDroppedStacks(state, builder);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        BlockEntity blockEntity;
        if (itemStack.hasCustomName() && (blockEntity = world.getBlockEntity(pos)) instanceof ModShulkerBoxEntity) {
            ((ModShulkerBoxEntity)blockEntity).setCustomName(itemStack.getName());
        }
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.isOf(newState.getBlock())) {
            return;
        }
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof ModShulkerBoxEntity) {
            world.updateComparators(pos, state.getBlock());
        }
        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        super.appendTooltip(stack, world, tooltip, options);
        NbtCompound nbtCompound = BlockItem.getBlockEntityNbt(stack);
        if (nbtCompound != null) {
            if (nbtCompound.contains("LootTable", NbtElement.STRING_TYPE)) {
                tooltip.add(Text.literal("???????"));
            }
            if (nbtCompound.contains("Items", NbtElement.LIST_TYPE)) {
                DefaultedList<ItemStack> defaultedList = DefaultedList.ofSize(27, ItemStack.EMPTY);
                Inventories.readNbt(nbtCompound, defaultedList);
                int i = 0;
                int j = 0;
                for (ItemStack itemStack : defaultedList) {
                    if (itemStack.isEmpty()) continue;
                    ++j;
                    if (i > 4) continue;
                    ++i;
                    MutableText mutableText = itemStack.getName().copy();
                    mutableText.append(" x").append(String.valueOf(itemStack.getCount()));
                    tooltip.add(mutableText);
                }
                if (j - i > 0) {
                    tooltip.add(Text.translatable("container.shulkerBox.more", j - i).formatted(Formatting.ITALIC));
                }
            }
        }
    }

    @Override
    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.DESTROY;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof ModShulkerBoxEntity) {
            return VoxelShapes.cuboid(((ModShulkerBoxEntity)blockEntity).getBoundingBox(state));
        }
        return VoxelShapes.fullCube();
    }

    @Override
    public boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return ScreenHandler.calculateComparatorOutput((Inventory)((Object)world.getBlockEntity(pos)));
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        ItemStack itemStack = super.getPickStack(world, pos, state);
        world.getBlockEntity(pos, BlockEntityType.SHULKER_BOX).ifPresent(blockEntity -> blockEntity.setStackNbt(itemStack));
        return itemStack;
    }

    @Nullable
    public static ModDyeColor getColor(Item item) {
        return ModShulkerBox.getColor(Block.getBlockFromItem(item));
    }

    @Nullable
    public static ModDyeColor getColor(Block block) {
        if (block instanceof ModShulkerBox) {
            return ((ModShulkerBox)block).getColor();
        }
        return null;
    }

    public static Block get(@Nullable ModDyeColor dyeColor) {
        if (dyeColor == null) {
            return Blocks.SHULKER_BOX;
        }
        switch (dyeColor) {
            case ULTRAMARINE: {
                return ModBlocks.ULTRAMARINE_SHULKER_BOX;
            }
            case ROSE: {
                return ModBlocks.ROSE_SHULKER_BOX;
            }
            case VIOLET: {
                return ModBlocks.VIOLET_SHULKER_BOX;
            }
            case NEW_GREEN: {
                return ModBlocks.NEW_GREEN_SHULKER_BOX;
            }
            case SPRING_GREEN:
        }
        return ModBlocks.SPRING_GREEN_SHULKER_BOX;
    }

    @Nullable
    public ModDyeColor getColor() {
        return this.color;
    }

    public static ItemStack getItemStack(@Nullable ModDyeColor color) {
        return new ItemStack(ModShulkerBox.get(color));
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }
}
