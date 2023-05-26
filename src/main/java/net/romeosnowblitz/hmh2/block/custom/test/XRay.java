package net.romeosnowblitz.hmh2.block.custom.test;

import net.minecraft.block.LichenGrower;
import net.minecraft.block.MultifaceGrowthBlock;

public class XRay extends MultifaceGrowthBlock {

    public XRay(Settings settings) {
        super(settings);
    }

    @Override
    public LichenGrower getGrower() {
        return null;
    }

}
