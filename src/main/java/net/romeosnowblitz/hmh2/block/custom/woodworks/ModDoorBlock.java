package net.romeosnowblitz.hmh2.block.custom.woodworks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.Direction;

public class ModDoorBlock extends DoorBlock {
    public ModDoorBlock(Settings settings, SoundEvent closeSound, SoundEvent openSound) {
        super(settings, closeSound, openSound);
    }
}