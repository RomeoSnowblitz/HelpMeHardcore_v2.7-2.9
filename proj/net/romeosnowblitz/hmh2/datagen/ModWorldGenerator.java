/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
 *  net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider
 *  net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider$Entries
 *  net.minecraft.class_7225$class_7874
 *  net.minecraft.class_7924
 */
package net.romeosnowblitz.hmh2.datagen;

import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.class_7225;
import net.minecraft.class_7924;

public class ModWorldGenerator
extends FabricDynamicRegistryProvider {
    public ModWorldGenerator(FabricDataOutput output, CompletableFuture<class_7225.class_7874> registriesFuture) {
        super(output, registriesFuture);
    }

    protected void configure(class_7225.class_7874 registries, FabricDynamicRegistryProvider.Entries entries) {
        entries.addAll(registries.method_46762(class_7924.field_41239));
        entries.addAll(registries.method_46762(class_7924.field_41245));
    }

    public String method_10321() {
        return "hmh2";
    }
}

