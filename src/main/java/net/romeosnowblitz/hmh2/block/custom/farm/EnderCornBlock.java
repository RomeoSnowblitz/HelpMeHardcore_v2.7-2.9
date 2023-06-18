/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1935
 *  net.minecraft.class_2302
 *  net.minecraft.class_4970$class_2251
 */
package net.romeosnowblitz.hmh2.block.custom.farm;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.romeosnowblitz.hmh2.item.ModItems;

public class EnderCornBlock
extends CropBlock {
    public EnderCornBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.ENDER_CORN_SEEDS;
    }
}

