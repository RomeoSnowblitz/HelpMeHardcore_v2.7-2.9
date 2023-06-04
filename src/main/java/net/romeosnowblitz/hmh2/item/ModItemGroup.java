package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.DecorationBlocks;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;

public class ModItemGroup {

    public static ItemGroup COLORING;
    public static ItemGroup DECORATION;
    public static ItemGroup ITEM;
    public static ItemGroup MAGIC;
    public static ItemGroup MOD;
    public static ItemGroup SUSTENANCE;
    public static ItemGroup TESTING;
    public static ItemGroup WARFARE;
    public static ItemGroup WOODWORKS;


    public static void registerItemGroup() {
        ITEM = FabricItemGroup.builder(new Identifier(Hmh2.MOD_ID, "items"))
                .displayName(Text.literal("Mod Items"))
                .icon(() -> new ItemStack(ModItems.ITEM)).build();

        MOD = FabricItemGroup.builder(new Identifier(Hmh2.MOD_ID, "mod"))
                .displayName(Text.literal("Mod Blocks"))
                .icon(() -> new ItemStack(ModBlocks.BLOCK)).build();

        MAGIC = FabricItemGroup.builder(new Identifier(Hmh2.MOD_ID, "magic"))
                .displayName(Text.literal("Magic"))
                .icon(() -> new ItemStack(MagicItems.KNIGHT_CHARM)).build();

        WARFARE = FabricItemGroup.builder(new Identifier(Hmh2.MOD_ID, "warfare"))
                .displayName(Text.literal("Warfare"))
                .icon(() -> new ItemStack(WarfareItems.FIREBRAND)).build();

        SUSTENANCE = FabricItemGroup.builder(new Identifier(Hmh2.MOD_ID, "sustenance"))
                .displayName(Text.literal("Sustenance"))
                .icon(() -> new ItemStack(SustenanceItems.GOLDEN_SALMON)).build();

        COLORING = FabricItemGroup.builder(new Identifier(Hmh2.MOD_ID, "coloring"))
                .displayName(Text.literal("Coloring"))
                .icon(() -> new ItemStack(ModItems.ULTRAMARINE_DYE)).build();

        WOODWORKS = FabricItemGroup.builder(new Identifier(Hmh2.MOD_ID, "woodworks"))
                .displayName(Text.literal("Woodworks"))
                .icon(() -> new ItemStack(WoodworkBlocks.CHERRY_SAPLING)).build();

        DECORATION = FabricItemGroup.builder(new Identifier(Hmh2.MOD_ID, "decoration"))
                .displayName(Text.literal("Decoration"))
                .icon(() -> new ItemStack(DecorationBlocks.MARBLE_BRICKS)).build();

        TESTING = FabricItemGroup.builder(new Identifier(Hmh2.MOD_ID, "testing"))
                .displayName(Text.literal("Testing"))
                .icon(() -> new ItemStack(Blocks.BARRIER)).build();
    }
}
