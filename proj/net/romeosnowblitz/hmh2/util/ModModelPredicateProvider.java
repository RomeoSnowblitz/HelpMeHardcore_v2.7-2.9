/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry
 *  net.minecraft.class_1792
 *  net.minecraft.class_2960
 */
package net.romeosnowblitz.hmh2.util;

import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.class_1792;
import net.minecraft.class_2960;
import net.romeosnowblitz.hmh2.item.ModItems;

public class ModModelPredicateProvider {
    public static void registerModModels() {
        ModModelPredicateProvider.registerBambooBow(ModItems.BAMBOO_BOW);
        ModModelPredicateProvider.registerSpear(ModItems.SPEAR);
        ModModelPredicateProvider.registerBambooShield(ModItems.BAMBOO_SHIELD);
    }

    private static void registerBambooBow(class_1792 bow) {
        FabricModelPredicateProviderRegistry.register((class_1792)bow, (class_2960)new class_2960("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0f;
            }
            if (entity.method_6030() != stack) {
                return 0.0f;
            }
            return (float)(stack.method_7935() - entity.method_6014()) / 10.0f;
        });
        FabricModelPredicateProviderRegistry.register((class_1792)bow, (class_2960)new class_2960("pulling"), (stack, world, entity, seed) -> entity != null && entity.method_6115() && entity.method_6030() == stack ? 1.0f : 0.0f);
    }

    private static void registerSpear(class_1792 spear) {
        FabricModelPredicateProviderRegistry.register((class_1792)spear, (class_2960)new class_2960("throwing"), (stack, world, entity, seed) -> entity != null && entity.method_6115() && entity.method_6030() == stack ? 1.0f : 0.0f);
    }

    private static void registerBambooShield(class_1792 shield) {
        FabricModelPredicateProviderRegistry.register((class_1792)shield, (class_2960)new class_2960("blocking"), (stack, world, entity, seed) -> entity != null && entity.method_6115() && entity.method_6030() == stack ? 1.0f : 0.0f);
    }
}

