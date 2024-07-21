package net.romeosnowblitz.hmh2.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> FUEL_ONE_HUNDRED = of("fuel_one_hundred");
    public static final TagKey<Item> FUEL_THREE_HUNDRED = of("fuel_three_hundred");
    public static final TagKey<Item> FUEL_SIXTEEN_THOUSAND = of("fuel_sixteen_thousand");


    public static final TagKey<Item> DCC_TEST = of("dcc_test");
    public static final TagKey<Item> LIGHTS = of("lights");


    public static final TagKey<Item> AQUATIC_CHARISMA_ARMOR = of("aquatic_charisma_armor");
    public static final TagKey<Item> AQUATIC_HEALTH_ARMOR = of("aquatic_health_armor");
    public static final TagKey<Item> AQUATIC_MOVEMENT_ARMOR = of("aquatic_movement_armor");
    public static final TagKey<Item> AQUATIC_NOURISHMENT_ARMOR = of("aquatic_nourishment_armor");
    public static final TagKey<Item> AQUATIC_SIGHT_ARMOR = of("aquatic_sight_armor");
    public static final TagKey<Item> ARIAL_CHARISMA_ARMOR = of("arial_charisma_armor");
    public static final TagKey<Item> ARIAL_HEALTH_ARMOR = of("arial_health_armor");
    public static final TagKey<Item> ARIAL_MOVEMENT_ARMOR = of("arial_movement_armor");
    public static final TagKey<Item> ARIAL_NOURISHMENT_ARMOR = of("arial_nourishment_armor");
    public static final TagKey<Item> ARIAL_SIGHT_ARMOR = of("arial_sight_armor");
    public static final TagKey<Item> NETHER_CHARISMA_ARMOR = of("nether_charisma_armor");
    public static final TagKey<Item> NETHER_HEALTH_ARMOR = of("nether_health_armor");
    public static final TagKey<Item> NETHER_MOVEMENT_ARMOR = of("nether_movement_armor");
    public static final TagKey<Item> NETHER_NOURISHMENT_ARMOR = of("nether_nourishment_armor");
    public static final TagKey<Item> NETHER_SIGHT_ARMOR = of("nether_sight_armor");
    public static final TagKey<Item> UNDERGROUND_CHARISMA_ARMOR = of("underground_charisma_armor");
    public static final TagKey<Item> UNDERGROUND_HEALTH_ARMOR = of("underground_health_armor");
    public static final TagKey<Item> UNDERGROUND_MOVEMENT_ARMOR = of("underground_movement_armor");
    public static final TagKey<Item> UNDERGROUND_NOURISHMENT_ARMOR = of("underground_nourishment_armor");
    public static final TagKey<Item> UNDERGROUND_SIGHT_ARMOR = of("underground_sight_armor");
    public static final TagKey<Item> VOID_CHARISMA_ARMOR = of("void_charisma_armor");
    public static final TagKey<Item> VOID_HEALTH_ARMOR = of("void_health_armor");
    public static final TagKey<Item> VOID_MOVEMENT_ARMOR = of("void_movement_armor");
    public static final TagKey<Item> VOID_NOURISHMENT_ARMOR = of("void_nourishment_armor");
    public static final TagKey<Item> VOID_SIGHT_ARMOR = of("void_sight_armor");

    public static final TagKey<Item> AQUATIC_CHARISMA_ITEM = of("aquatic_charisma_item");
    public static final TagKey<Item> AQUATIC_HEALTH_ITEM = of("aquatic_health_item");
    public static final TagKey<Item> AQUATIC_MOVEMENT_ITEM = of("aquatic_movement_item");
    public static final TagKey<Item> AQUATIC_NOURISHMENT_ITEM = of("aquatic_nourishment_item");
    public static final TagKey<Item> AQUATIC_SIGHT_ITEM = of("aquatic_sight_item");
    public static final TagKey<Item> ARIAL_CHARISMA_ITEM = of("arial_charisma_item");
    public static final TagKey<Item> ARIAL_HEALTH_ITEM = of("arial_health_item");
    public static final TagKey<Item> ARIAL_MOVEMENT_ITEM = of("arial_movement_item");
    public static final TagKey<Item> ARIAL_NOURISHMENT_ITEM = of("arial_nourishment_item");
    public static final TagKey<Item> ARIAL_SIGHT_ITEM = of("arial_sight_item");
    public static final TagKey<Item> NETHER_CHARISMA_ITEM = of("nether_charisma_item");
    public static final TagKey<Item> NETHER_HEALTH_ITEM = of("nether_health_item");
    public static final TagKey<Item> NETHER_MOVEMENT_ITEM = of("nether_movement_item");
    public static final TagKey<Item> NETHER_NOURISHMENT_ITEM = of("nether_nourishment_item");
    public static final TagKey<Item> NETHER_SIGHT_ITEM = of("nether_sight_item");
    public static final TagKey<Item> UNDERGROUND_CHARISMA_ITEM = of("underground_charisma_item");
    public static final TagKey<Item> UNDERGROUND_HEALTH_ITEM = of("underground_health_item");
    public static final TagKey<Item> UNDERGROUND_MOVEMENT_ITEM = of("underground_movement_item");
    public static final TagKey<Item> UNDERGROUND_NOURISHMENT_ITEM = of("underground_nourishment_item");
    public static final TagKey<Item> UNDERGROUND_SIGHT_ITEM = of("underground_sight_item");
    public static final TagKey<Item> VOID_CHARISMA_ITEM = of("void_charisma_item");
    public static final TagKey<Item> VOID_HEALTH_ITEM = of("void_health_item");
    public static final TagKey<Item> VOID_MOVEMENT_ITEM = of("void_movement_item");
    public static final TagKey<Item> VOID_NOURISHMENT_ITEM = of("void_nourishment_item");
    public static final TagKey<Item> VOID_SIGHT_ITEM = of("void_sight_item");

    private ModItemTags() {
    }

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(id));
    }
}
