package net.romeosnowblitz.hmh2.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.custom.PenguinEntity;

public class ModEntities {
    public static final EntityType<PenguinEntity> PENGUIN = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "penguin"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PenguinEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build());

}
