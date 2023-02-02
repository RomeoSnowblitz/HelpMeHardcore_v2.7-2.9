package net.romeosnowblitz.hmh2.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonBlockEntity;
import net.romeosnowblitz.hmh2.entity.block.BackpackEntity;
import net.romeosnowblitz.hmh2.entity.block.CheesePressBlockEntity;
import net.romeosnowblitz.hmh2.entity.block.FreezerBlockEntity;

public class ModBlockEntities {
    public static BlockEntityType<ModPistonBlockEntity> MOD_PISTON;
    public static BlockEntityType<CheesePressBlockEntity> CHEESE_PRESS;
    public static BlockEntityType<FreezerBlockEntity> FREEZER;
    public static BlockEntityType<BackpackEntity> BACKPACK;

    public static void registerAllBlockEntities() {
        MOD_PISTON = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "piston"), FabricBlockEntityTypeBuilder.create(ModPistonBlockEntity::new, ModBlocks.MOD_MOVING_PISTON).build(null));
        CHEESE_PRESS = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "cheese_press"), FabricBlockEntityTypeBuilder.create(CheesePressBlockEntity::new, ModBlocks.CHEESE_PRESS).build(null));
        FREEZER = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "freezer"), FabricBlockEntityTypeBuilder.create(FreezerBlockEntity::new, ModBlocks.FREEZER).build(null));
        BACKPACK = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "backpack"), FabricBlockEntityTypeBuilder.create(BackpackEntity::new, ModBlocks.BACKPACK).build(null));
    }
}
