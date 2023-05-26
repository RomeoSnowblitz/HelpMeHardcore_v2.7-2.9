/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
 *  net.minecraft.class_1761
 *  net.minecraft.class_1799
 *  net.minecraft.class_1935
 *  net.minecraft.class_2246
 *  net.minecraft.class_2561
 *  net.minecraft.class_2960
 */
package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.class_1761;
import net.minecraft.class_1799;
import net.minecraft.class_1935;
import net.minecraft.class_2246;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.item.MagicItems;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.item.WarfareItems;

public class ModItemGroup {
    public static class_1761 ITEM;
    public static class_1761 MAGIC;
    public static class_1761 MOD;
    public static class_1761 TESTING;
    public static class_1761 WARFARE;
    public static class_1761 WOODWORKS;

    public static void registerItemGroup() {
        ITEM = FabricItemGroup.builder((class_2960)new class_2960("hmh2", "items")).method_47321((class_2561)class_2561.method_43470((String)"Mod Items")).method_47320(() -> new class_1799((class_1935)ModItems.ITEM)).method_47324();
        MOD = FabricItemGroup.builder((class_2960)new class_2960("hmh2", "mod")).method_47321((class_2561)class_2561.method_43470((String)"Mod Blocks")).method_47320(() -> new class_1799((class_1935)ModBlocks.BLOCK)).method_47324();
        MAGIC = FabricItemGroup.builder((class_2960)new class_2960("hmh2", "magic")).method_47321((class_2561)class_2561.method_43470((String)"Magic")).method_47320(() -> new class_1799((class_1935)MagicItems.KNIGHT_CHARM)).method_47324();
        WARFARE = FabricItemGroup.builder((class_2960)new class_2960("hmh2", "warfare")).method_47321((class_2561)class_2561.method_43470((String)"Warfare")).method_47320(() -> new class_1799((class_1935)WarfareItems.FIREBRAND)).method_47324();
        WOODWORKS = FabricItemGroup.builder((class_2960)new class_2960("hmh2", "woodworks")).method_47321((class_2561)class_2561.method_43470((String)"Woodworks")).method_47320(() -> new class_1799((class_1935)WoodworkBlocks.CHERRY_SAPLING)).method_47324();
        TESTING = FabricItemGroup.builder((class_2960)new class_2960("hmh2", "testing")).method_47321((class_2561)class_2561.method_43470((String)"Testing")).method_47320(() -> new class_1799((class_1935)class_2246.field_10499)).method_47324();
    }
}

