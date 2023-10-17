package net.romeosnowblitz.hmh2.util;

import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeRegistry;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModWoodTypes {
    public static final WoodType BANANA = WoodTypeRegistry.register(new Identifier(Hmh2.MOD_ID, "banana"), BlockSetType.OAK);
    public static final WoodType CHERRY = WoodTypeRegistry.register(new Identifier(Hmh2.MOD_ID, "cherry"), BlockSetType.OAK);
    public static final WoodType CORK_OAK = WoodTypeRegistry.register(new Identifier(Hmh2.MOD_ID, "cork_oak"), BlockSetType.OAK);
    public static final WoodType JACARANDA = WoodTypeRegistry.register(new Identifier(Hmh2.MOD_ID, "jacaranda"), BlockSetType.OAK);
    public static final WoodType MANGO = WoodTypeRegistry.register(new Identifier(Hmh2.MOD_ID, "mango"), BlockSetType.OAK);
    public static final WoodType MAHOE = WoodTypeRegistry.register(new Identifier(Hmh2.MOD_ID, "mahoe"), BlockSetType.OAK);
    public static final WoodType WILLOW = WoodTypeRegistry.register(new Identifier(Hmh2.MOD_ID, "willow"), BlockSetType.OAK);
}
