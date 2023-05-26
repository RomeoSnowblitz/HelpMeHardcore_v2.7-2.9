/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder
 *  net.minecraft.class_2248
 *  net.minecraft.class_2378
 *  net.minecraft.class_2591
 *  net.minecraft.class_2960
 *  net.minecraft.class_7923
 */
package net.romeosnowblitz.hmh2.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.class_2248;
import net.minecraft.class_2378;
import net.minecraft.class_2591;
import net.minecraft.class_2960;
import net.minecraft.class_7923;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonBlockEntity;
import net.romeosnowblitz.hmh2.block.entity.ModBellBlockEntity;
import net.romeosnowblitz.hmh2.entity.block.BackpackEntity;

public class ModBlockEntities {
    public static class_2591<ModPistonBlockEntity> MOD_PISTON;
    public static class_2591<ModBellBlockEntity> MOD_BELL;
    public static class_2591<BackpackEntity> BACKPACK;

    public static void registerAllBlockEntities() {
        MOD_PISTON = (class_2591)class_2378.method_10230((class_2378)class_7923.field_41181, (class_2960)new class_2960("hmh2", "piston"), (Object)FabricBlockEntityTypeBuilder.create(ModPistonBlockEntity::new, (class_2248[])new class_2248[]{ModBlocks.MOD_MOVING_PISTON}).build(null));
        MOD_BELL = (class_2591)class_2378.method_10230((class_2378)class_7923.field_41181, (class_2960)new class_2960("hmh2", "bell"), (Object)FabricBlockEntityTypeBuilder.create(ModBellBlockEntity::new, (class_2248[])new class_2248[]{ModBlocks.MOD_BELL}).build(null));
        BACKPACK = (class_2591)class_2378.method_10230((class_2378)class_7923.field_41181, (class_2960)new class_2960("hmh2", "backpack"), (Object)FabricBlockEntityTypeBuilder.create(BackpackEntity::new, (class_2248[])new class_2248[]{ModBlocks.BACKPACK}).build(null));
    }
}

