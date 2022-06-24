package net.romeosnowblitz.hmh2.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;

public class ModBlockEntities {
    public static BlockEntityType<CheesePressBlockEntity> CHEESE_PRESS;
    public static BlockEntityType<FreezerBlockEntity> FREEZER;
    public static BlockEntityType<IceCreamMakerBlockEntity> ICE_CREAM_MAKER;
    public static BlockEntityType<BackpackEntity> BACKPACK;


    public static void registerAllBlockEntities() {

        CHEESE_PRESS = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "cheese_press"), FabricBlockEntityTypeBuilder.create(CheesePressBlockEntity::new, ModBlocks.CHEESE_PRESS).build(null));
        FREEZER = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "freezer"), FabricBlockEntityTypeBuilder.create(FreezerBlockEntity::new, ModBlocks.FREEZER).build(null));
        ICE_CREAM_MAKER = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "ice_cream_maker"), FabricBlockEntityTypeBuilder.create(IceCreamMakerBlockEntity::new, ModBlocks.ICE_CREAM_MAKER).build(null));
        BACKPACK = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "backpack"), FabricBlockEntityTypeBuilder.create(BackpackEntity::new, ModBlocks.BACKPACK).build(null));

    }
}
