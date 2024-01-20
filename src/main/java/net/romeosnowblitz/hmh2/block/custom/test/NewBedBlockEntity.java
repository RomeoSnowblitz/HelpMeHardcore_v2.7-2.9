package net.romeosnowblitz.hmh2.block.custom.test;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.romeosnowblitz.hmh2.blotty.ModBlockEntities;
import net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor;

public class NewBedBlockEntity extends BlockEntity {
    private ModDyeColor color;

    public NewBedBlockEntity(BlockPos pos, BlockState state, ModDyeColor color) {
        super(ModBlockEntities.ROSE_BED, pos, state);
        this.color = color;
    }

    public BlockEntityUpdateS2CPacket toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    public ModDyeColor getColor() {
        return this.color;
    }

    public void setColor(ModDyeColor color) {
        this.color = color;
    }
}
