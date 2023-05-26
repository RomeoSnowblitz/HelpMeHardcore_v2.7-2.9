/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
 *  net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
 *  net.minecraft.class_1935
 */
package net.romeosnowblitz.hmh2.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.class_1935;
import net.romeosnowblitz.hmh2.block.ModBlocks;

public class ModLootTableGenerator
extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public void method_10379() {
        this.method_46006(ModBlocks.HELLSTONE_BRICKS, (class_1935)ModBlocks.CARVED_MELON);
    }
}

