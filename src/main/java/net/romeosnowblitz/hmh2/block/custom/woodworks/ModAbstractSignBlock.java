package net.romeosnowblitz.hmh2.block.custom.woodworks;

import net.minecraft.block.*;
import net.minecraft.block.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SignChangingItem;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.LiteralTextContent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.UUID;

public abstract class ModAbstractSignBlock extends BlockWithEntity implements Waterloggable {
    public static final BooleanProperty WATERLOGGED;
    protected static final float field_31243 = 4.0F;
    protected static final VoxelShape SHAPE;
    private final ModWoodType type;

    protected ModAbstractSignBlock(Settings settings, ModWoodType type) {
        super(settings);
        this.type = type;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if ((Boolean)state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public boolean canMobSpawnInside(BlockState state) {
        return true;
    }

    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SignBlockEntity(pos, state);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        Item item = itemStack.getItem();
        Item var11 = itemStack.getItem();
        SignChangingItem var10000;
        if (var11 instanceof SignChangingItem) {
            SignChangingItem signChangingItem = (SignChangingItem)var11;
            var10000 = signChangingItem;
        } else {
            var10000 = null;
        }

        SignChangingItem signChangingItem2 = var10000;
        boolean bl = signChangingItem2 != null && player.canModifyBlocks();
        BlockEntity var12 = world.getBlockEntity(pos);
        if (var12 instanceof SignBlockEntity) {
            SignBlockEntity signBlockEntity = (SignBlockEntity)var12;
            if (!world.isClient) {
                boolean bl2 = signBlockEntity.isPlayerFacingFront(player);
                SignText signText = signBlockEntity.getText(bl2);
                boolean bl3 = signBlockEntity.runCommandClickEvent(player, world, pos, bl2);
                if (signBlockEntity.isWaxed()) {
                    world.playSound((PlayerEntity)null, signBlockEntity.getPos(), SoundEvents.BLOCK_SIGN_WAXED_INTERACT_FAIL, SoundCategory.BLOCKS);
                    return ActionResult.PASS;
                } else if (bl && !this.isOtherPlayerEditing(player, signBlockEntity) && signChangingItem2.canUseOnSignText(signText, player) && signChangingItem2.useOnSign(world, signBlockEntity, bl2, player)) {
                    if (!player.isCreative()) {
                        itemStack.decrement(1);
                    }

                    world.emitGameEvent(GameEvent.BLOCK_CHANGE, signBlockEntity.getPos(), GameEvent.Emitter.of(player, signBlockEntity.getCachedState()));
                    player.incrementStat(Stats.USED.getOrCreateStat(item));
                    return ActionResult.SUCCESS;
                } else if (bl3) {
                    return ActionResult.SUCCESS;
                } else if (!this.isOtherPlayerEditing(player, signBlockEntity) && player.canModifyBlocks() && this.isTextLiteralOrEmpty(player, signBlockEntity, bl2)) {
                    this.openEditScreen(player, signBlockEntity, bl2);
                    return ActionResult.SUCCESS;
                } else {
                    return ActionResult.PASS;
                }
            } else {
                return !bl && !signBlockEntity.isWaxed() ? ActionResult.CONSUME : ActionResult.SUCCESS;
            }
        } else {
            return ActionResult.PASS;
        }
    }

    private boolean isTextLiteralOrEmpty(PlayerEntity player, SignBlockEntity blockEntity, boolean front) {
        SignText signText = blockEntity.getText(front);
        return Arrays.stream(signText.getMessages(player.shouldFilterText())).allMatch((message) -> {
            return message.equals(ScreenTexts.EMPTY) || message.getContent() instanceof LiteralTextContent;
        });
    }

    public abstract float getRotationDegrees(BlockState state);

    public Vec3d getCenter(BlockState state) {
        return new Vec3d(0.5D, 0.5D, 0.5D);
    }

    public FluidState getFluidState(BlockState state) {
        return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public ModWoodType getWoodType() {
        return this.type;
    }

    public static ModWoodType getWoodType(Block block) {
        ModWoodType woodType;
        if (block instanceof ModAbstractSignBlock) {
            woodType = ((ModAbstractSignBlock)block).getWoodType();
        } else {
            woodType = ModWoodType.OAK;
        }

        return woodType;
    }

    public void openEditScreen(PlayerEntity player, SignBlockEntity blockEntity, boolean front) {
        blockEntity.setEditor(player.getUuid());
        player.openEditSignScreen(blockEntity, front);
    }

    private boolean isOtherPlayerEditing(PlayerEntity player, SignBlockEntity blockEntity) {
        UUID uUID = blockEntity.getEditor();
        return uUID != null && !uUID.equals(player.getUuid());
    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, BlockEntityType.SIGN, SignBlockEntity::tick);
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
        SHAPE = Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);
    }
}
