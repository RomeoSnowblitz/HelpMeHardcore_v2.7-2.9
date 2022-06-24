package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModItemGroup {

    public static final ItemGroup ITEM = FabricItemGroupBuilder.build(new Identifier(Hmh2.MOD_ID, "item"),
            () -> new ItemStack(ModItems.ITEM));
}
