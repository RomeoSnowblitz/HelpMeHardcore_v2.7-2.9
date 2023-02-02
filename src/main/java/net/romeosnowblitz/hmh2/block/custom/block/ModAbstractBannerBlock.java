package net.romeosnowblitz.hmh2.block.custom.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor;
import org.jetbrains.annotations.Nullable;

public class ModAbstractBannerBlock
        extends BlockWithEntity {
    private final ModDyeColor color;

    protected ModAbstractBannerBlock(ModDyeColor color, AbstractBlock.Settings settings) {
        super(settings);
        this.color = color;
    }

    @Override
    public boolean canMobSpawnInside() {
        return true;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ModBannerBlockEntity(pos, state, this.color);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if (world.isClient) {
            world.getBlockEntity(pos, BlockEntityType.BANNER).ifPresent(blockEntity -> blockEntity.readFrom(itemStack));
        } else if (itemStack.hasCustomName()) {
            world.getBlockEntity(pos, BlockEntityType.BANNER).ifPresent(blockEntity -> blockEntity.setCustomName(itemStack.getName()));
        }
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof ModBannerBlockEntity) {
            return ((ModBannerBlockEntity)blockEntity).getPickStack();
        }
        return super.getPickStack(world, pos, state);
    }

    public ModDyeColor getColor() {
        return this.color;
    }

}
