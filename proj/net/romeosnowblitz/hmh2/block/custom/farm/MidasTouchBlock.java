/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1935
 *  net.minecraft.class_4970$class_2251
 */
package net.romeosnowblitz.hmh2.block.custom.farm;

import net.minecraft.class_1935;
import net.minecraft.class_4970;
import net.romeosnowblitz.hmh2.block.custom.farm.ModCropBlock;
import net.romeosnowblitz.hmh2.item.ModItems;

public class MidasTouchBlock
extends ModCropBlock {
    public MidasTouchBlock(class_4970.class_2251 settings) {
        super(settings);
    }

    @Override
    protected class_1935 method_9832() {
        return ModItems.ENDER_CORN_SEEDS;
    }
}

