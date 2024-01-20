package net.romeosnowblitz.hmh2.entity;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.blazing_inferno.BlazingInfernoEntity;
import net.romeosnowblitz.hmh2.entity.cal.CalEntity;
import net.romeosnowblitz.hmh2.entity.demon.DemonEntity;
import net.romeosnowblitz.hmh2.entity.headless_horseman.HeadlessHorsemanEntity;
import net.romeosnowblitz.hmh2.entity.lost_soul.LostSoulEntity;
import net.romeosnowblitz.hmh2.entity.mites.ashmite.AshmiteEntity;
import net.romeosnowblitz.hmh2.entity.mites.bloodmite.BloodmiteEntity;
import net.romeosnowblitz.hmh2.entity.mites.hellmite.HellmiteEntity;
import net.romeosnowblitz.hmh2.entity.mites.magmite.MagmiteEntity;
import net.romeosnowblitz.hmh2.entity.mites.warpmite.WarpmiteEntity;
import net.romeosnowblitz.hmh2.entity.penguin.PenguinEntity;
import net.romeosnowblitz.hmh2.entity.mites.sculkmite.SculkmiteEntity;
import net.romeosnowblitz.hmh2.entity.projectile.ModProjectileEntity;
import net.romeosnowblitz.hmh2.entity.soldier_bee.SoldierBeeEntity;
import net.romeosnowblitz.hmh2.entity.queen_bee.QueenBeeEntity;
import net.romeosnowblitz.hmh2.entity.shadow_creature.ShadowCreatureEntity;
import net.romeosnowblitz.hmh2.entity.the_great_hunger.TheGreatHungerEntity;
import net.romeosnowblitz.hmh2.entity.wisp.WispEntity;

public class ModEntities {

    public static final EntityType<AshmiteEntity> ASHMITE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "ashmite"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, AshmiteEntity::new)
                    .specificSpawnBlocks(Blocks.BASALT).fireImmune()
                    .dimensions(EntityDimensions.fixed(0.75f, 0.5f)).build());

    public static final EntityType<BlazingInfernoEntity> BLAZING_INFERNO = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "blazing_inferno"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, BlazingInfernoEntity::new).fireImmune()
                    .dimensions(EntityDimensions.fixed(1.3f, 1.5f)).build());

    public static final EntityType<BloodmiteEntity> BLOODMITE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "bloodmite"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, BloodmiteEntity::new)
                    .specificSpawnBlocks(Blocks.CRIMSON_NYLIUM).fireImmune()
                    .dimensions(EntityDimensions.fixed(0.75f, 0.5f)).build());

    public static final EntityType<CalEntity> CAL = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "cal"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CalEntity::new)
                    .dimensions(EntityDimensions.fixed(0.8f, 1.9f)).build());

    public static final EntityType<DemonEntity> DEMON = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "demon"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, DemonEntity::new).fireImmune()
                    .dimensions(EntityDimensions.fixed(0.6f, 0.9f)).build());

    public static final EntityType<HeadlessHorsemanEntity> HEADLESS_HORSEMAN = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "headless_horseman"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, HeadlessHorsemanEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75f, 0.5f)).build());

    public static final EntityType<HellmiteEntity> HELLMITE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "hellmite"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, HellmiteEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75f, 0.5f)).build());

    public static final EntityType<LostSoulEntity> LOST_SOUL = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "lost_soul"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, LostSoulEntity::new).fireImmune()
                    .dimensions(EntityDimensions.fixed(0.75f, 2f)).build());

    public static final EntityType<MagmiteEntity> MAGMITE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "magmite"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MagmiteEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75f, 0.5f)).build());

    public static final EntityType<PenguinEntity> PENGUIN = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "penguin"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PenguinEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build());

    public static final EntityType<QueenBeeEntity> QUEEN_BEE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "queen_bee"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, QueenBeeEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 3.0f)).build());

    public static final EntityType<SculkmiteEntity> SCULKMITE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "sculkmite"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SculkmiteEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75f, 0.5f)).build());

    public static final EntityType<ShadowCreatureEntity> SHADOW_CREATURE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "shadow_creature"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ShadowCreatureEntity::new)
                    .specificSpawnBlocks(Blocks.GRASS, Blocks.STONE, Blocks.DEEPSLATE, Blocks.SAND)
                    .dimensions(EntityDimensions.fixed(0.85f, 0.15f)).build());

    public static final EntityType<SoldierBeeEntity> SOLDIER_BEE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "soldier_bee"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SoldierBeeEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 0.6f)).build());

    public static final EntityType<TheGreatHungerEntity> THE_GREAT_HUNGER = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "the_great_hunger"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TheGreatHungerEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 0.6f)).build());

    public static final EntityType<WarpmiteEntity> WARPMITE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "warpmite"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, WarpmiteEntity::new)
                    .specificSpawnBlocks(Blocks.WARPED_NYLIUM).fireImmune()
                    .dimensions(EntityDimensions.fixed(0.75f, 0.5f)).build());

    public static final EntityType<WispEntity> WISP = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Hmh2.MOD_ID, "wisp"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, WispEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 0.6f)).build());

    public static final EntityType<ModProjectileEntity> MOD_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Hmh2.MOD_ID, "mod_projectile"),
            FabricEntityTypeBuilder.<ModProjectileEntity>create(SpawnGroup.MISC, ModProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());

    public static void addSpawns(){
        SpawnRestriction.register(ModEntities.ASHMITE, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.WORLD_SURFACE, HostileEntity::canSpawnIgnoreLightLevel);
        SpawnRestriction.register(ModEntities.BLOODMITE, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.WORLD_SURFACE, HostileEntity::canSpawnIgnoreLightLevel);
        SpawnRestriction.register(ModEntities.DEMON, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.WORLD_SURFACE, HostileEntity::canSpawnIgnoreLightLevel);
        SpawnRestriction.register(ModEntities.LOST_SOUL, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.WORLD_SURFACE, HostileEntity::canSpawnIgnoreLightLevel);
        SpawnRestriction.register(ModEntities.SHADOW_CREATURE, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.WORLD_SURFACE, HostileEntity::canMobSpawn);
        SpawnRestriction.register(ModEntities.WARPMITE, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.WORLD_SURFACE, HostileEntity::canSpawnIgnoreLightLevel);
    }

    public static void registerModEntities() {

    }
}
