package net.romeosnowblitz.hmh2.block.custom.farm;


import net.minecraft.item.ItemConvertible;
import net.romeosnowblitz.hmh2.item.ModItems;

public class MidasTouchBlock extends ModCropBlock {
    public MidasTouchBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.MIDAS_SEEDS;
    }
}
