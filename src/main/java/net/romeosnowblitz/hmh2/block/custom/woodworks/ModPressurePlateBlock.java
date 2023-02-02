package net.romeosnowblitz.hmh2.block.custom.woodworks;

import net.minecraft.block.PressurePlateBlock;
import net.minecraft.sound.SoundEvent;

public class ModPressurePlateBlock extends PressurePlateBlock {
    public ModPressurePlateBlock(ActivationRule type, Settings settings, SoundEvent depressSound, SoundEvent pressSound) {
        super(type, settings, depressSound, pressSound);
    }
}
