package net.romeosnowblitz.hmh2.blotty;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.block.custom.piston.ModPistonBlockEntity;

public class ModBlockEntities {
    public static BlockEntityType<ModPistonBlockEntity> MOD_PISTON  = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "piston"), FabricBlockEntityTypeBuilder.create(ModPistonBlockEntity::new, ModBlocks.MOD_MOVING_PISTON).build(null));

    public static BlockEntityType<ModSignBlockEntity> MOD_SIGN_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "mod_sign_entity"), FabricBlockEntityTypeBuilder.create(ModSignBlockEntity::new,
            WoodworkBlocks.BANANA_SIGN, WoodworkBlocks.BANANA_WALL_SIGN,
            WoodworkBlocks.CHERRY_SIGN, WoodworkBlocks.CHERRY_WALL_SIGN,
            WoodworkBlocks.CORK_OAK_SIGN, WoodworkBlocks.CORK_OAK_WALL_SIGN,
            WoodworkBlocks.JACARANDA_SIGN, WoodworkBlocks.JACARANDA_WALL_SIGN,
            WoodworkBlocks.MAHOE_SIGN, WoodworkBlocks.MAHOE_WALL_SIGN,
            WoodworkBlocks.MANGO_SIGN, WoodworkBlocks.MANGO_WALL_SIGN,
            WoodworkBlocks.WILLOW_SIGN, WoodworkBlocks.WILLOW_WALL_SIGN
    ).build());
    public static BlockEntityType<ModHangingSignBlockEntity> MOD_HANGING_SIGN_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "mod_hanging_sign_entity"), FabricBlockEntityTypeBuilder.create(ModHangingSignBlockEntity::new,
            WoodworkBlocks.BANANA_HANGING_SIGN, WoodworkBlocks.BANANA_HANGING_WALL_SIGN,
            WoodworkBlocks.CHERRY_HANGING_SIGN, WoodworkBlocks.CHERRY_HANGING_WALL_SIGN,
            WoodworkBlocks.CORK_OAK_HANGING_SIGN, WoodworkBlocks.CORK_OAK_HANGING_WALL_SIGN,
            WoodworkBlocks.JACARANDA_HANGING_SIGN, WoodworkBlocks.JACARANDA_HANGING_WALL_SIGN,
            WoodworkBlocks.MAHOE_HANGING_SIGN, WoodworkBlocks.MAHOE_HANGING_WALL_SIGN,
            WoodworkBlocks.MANGO_HANGING_SIGN, WoodworkBlocks.MANGO_HANGING_WALL_SIGN,
            WoodworkBlocks.WILLOW_HANGING_SIGN, WoodworkBlocks.WILLOW_HANGING_WALL_SIGN
            ).build());



    public static void registerAllBlockEntities() {

    }
}
