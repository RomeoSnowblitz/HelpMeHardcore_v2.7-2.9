package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;

public class ModItemGroup {

    public static final ItemGroup ITEM = FabricItemGroupBuilder.build(new Identifier(Hmh2.MOD_ID, "item"), () -> new ItemStack(ModItems.ITEM));
    public static final ItemGroup MAGIC = FabricItemGroupBuilder.build(new Identifier(Hmh2.MOD_ID, "magic"), () -> new ItemStack(MagicItems.KNIGHT_CHARM));
    public static final ItemGroup WAREFARE = FabricItemGroupBuilder.build(new Identifier(Hmh2.MOD_ID, "warfare"), () -> new ItemStack(WarfareItems.FIREBRAND));
    public static final ItemGroup WOODWORKS = FabricItemGroupBuilder.build(new Identifier(Hmh2.MOD_ID, "woodworks"), () -> new ItemStack(WoodworkBlocks.CHERRY_SAPLING));
}
