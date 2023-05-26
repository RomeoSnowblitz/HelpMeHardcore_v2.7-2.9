/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
 *  net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
 *  net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator$Pack
 *  net.minecraft.class_7877
 *  net.minecraft.class_7924
 */
package net.romeosnowblitz.hmh2.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.class_7877;
import net.minecraft.class_7924;
import net.romeosnowblitz.hmh2.datagen.ModLootTableGenerator;
import net.romeosnowblitz.hmh2.datagen.ModModelProvider;
import net.romeosnowblitz.hmh2.datagen.ModWorldGenerator;
import net.romeosnowblitz.hmh2.world.feature.ModConfiguredFeatures;

public class ModDataGeneration
implements DataGeneratorEntrypoint {
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModLootTableGenerator::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModWorldGenerator::new);
    }

    public void buildRegistry(class_7877 registryBuilder) {
        registryBuilder.method_46777(class_7924.field_41239, ModConfiguredFeatures::bootstrap);
    }
}

