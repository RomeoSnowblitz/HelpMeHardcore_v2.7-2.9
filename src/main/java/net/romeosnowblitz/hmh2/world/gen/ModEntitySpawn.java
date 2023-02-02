package net.romeosnowblitz.hmh2.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import net.romeosnowblitz.hmh2.entity.MobEntities;

public class ModEntitySpawn {
    public static void addEntitySpawn() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.ICE_SPIKES),
                SpawnGroup.CREATURE, MobEntities.PENGUIN, 90, 2, 5);
        SpawnRestriction.register(MobEntities.PENGUIN, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);

        BiomeModifications.addSpawn(BiomeSelectors.foundInOverworld(),
                SpawnGroup.MONSTER, MobEntities.SHADOW_CREATURE, 90, 2, 5);
        SpawnRestriction.register(MobEntities.SHADOW_CREATURE, SpawnRestriction.Location.NO_RESTRICTIONS,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canSpawnInDark);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE),
                SpawnGroup.CREATURE, MobEntities.THE_GREAT_HUNGER, 90, 2, 5);
        SpawnRestriction.register(MobEntities.THE_GREAT_HUNGER, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);
    }
}
