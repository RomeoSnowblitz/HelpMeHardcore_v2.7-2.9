package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.item.custom.swords.HeartStealerSword;
import net.romeosnowblitz.hmh2.item.custom.swords.PoisonSword;
import net.romeosnowblitz.hmh2.item.custom.swords.SlownessSword;
import net.romeosnowblitz.hmh2.item.custom.perks.FullEmeraldPerk;
import net.romeosnowblitz.hmh2.item.custom.perks.FullHeartPerk;
import net.romeosnowblitz.hmh2.item.custom.perks.FullHellstonePerk;
import net.romeosnowblitz.hmh2.item.custom.perks.FullQuaeritePerk;
import net.romeosnowblitz.hmh2.item.custom.tools.ModAxeItem;
import net.romeosnowblitz.hmh2.item.custom.tools.ModHoeItem;
import net.romeosnowblitz.hmh2.item.custom.tools.ModPickaxeItem;

public class WarfareItems {

    //Armor (4) + Tools (2)  /   (28)
    public static final Item BANANA_HELMET = registerItem("banana_helmet",new ArmorItem(ModArmorMaterial.BANANA, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BANANA_CHESTPLATE = registerItem("banana_chestplate", new ArmorItem(ModArmorMaterial.BANANA, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BANANA_LEGGINGS = registerItem("banana_leggings", new ArmorItem(ModArmorMaterial.BANANA, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BANANA_BOOTS = registerItem("banana_boots", new ArmorItem(ModArmorMaterial.BANANA, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BANANA_HORSE_ARMOR= registerItem("banana_horse_armor", new HorseArmorItem(7,"banana", new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BANANA_PICKAXE = registerItem("banana_pickaxe", new ModPickaxeItem(ModToolMaterial.BANANA, 1, -2.8f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));

    public static final Item BONE_HELMET = registerItem("bone_helmet", new FullQuaeritePerk(ModArmorMaterial.BONE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BONE_CHESTPLATE = registerItem("bone_chestplate", new ArmorItem(ModArmorMaterial.BONE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BONE_LEGGINGS = registerItem("bone_leggings", new ArmorItem(ModArmorMaterial.BONE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BONE_BOOTS = registerItem("bone_boots", new ArmorItem(ModArmorMaterial.BONE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BONE_SWORD = registerItem("bone_sword", new SwordItem(ModToolMaterial.BONE, 7, -2.4f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BONE_SHOVEL = registerItem("bone_shovel", new ShovelItem(ModToolMaterial.BONE, 5, -2.8f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BONE_PICKAXE = registerItem("bone_pickaxe", new ModPickaxeItem(ModToolMaterial.BONE, 5, -2.8f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BONE_AXE = registerItem("bone_axe", new ModAxeItem(ModToolMaterial.BONE, 10, -3.1f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BONE_HOE = registerItem("bone_hoe", new ModHoeItem(ModToolMaterial.BONE, 2, -1f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));

    public static final Item EMERALD_HELMET = registerItem("emerald_helmet", new FullEmeraldPerk(ModArmorMaterial.EMERALD, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate", new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings", new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots", new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.WAREFARE)));

    public static final Item FUR_HELMET = registerItem("fur_helmet", new ArmorItem(ModArmorMaterial.FUR, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item FUR_CHESTPLATE = registerItem("fur_chestplate", new ArmorItem(ModArmorMaterial.FUR, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item FUR_LEGGINGS = registerItem("fur_leggings", new ArmorItem(ModArmorMaterial.FUR, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item FUR_BOOTS = registerItem("fur_boots", new ArmorItem(ModArmorMaterial.FUR, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.WAREFARE)));

    public static final Item HELLSTONE_HELMET = registerItem("hellstone_helmet", new FullHellstonePerk(ModArmorMaterial.HELLSTONE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item HELLSTONE_CHESTPLATE = registerItem("hellstone_chestplate", new ArmorItem(ModArmorMaterial.HELLSTONE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item HELLSTONE_LEGGINGS = registerItem("hellstone_leggings", new ArmorItem(ModArmorMaterial.HELLSTONE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item HELLSTONE_BOOTS = registerItem("hellstone_boots", new ArmorItem(ModArmorMaterial.HELLSTONE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item HELLSTONE_PICKAXE = registerItem("hellstone_pickaxe", new ModPickaxeItem(ModToolMaterial.HELLSTONE,4,3, new FabricItemSettings().group(ModItemGroup.WAREFARE)));

    public static final Item LIFE_HELMET = registerItem("life_helmet", new FullHeartPerk(ModArmorMaterial.LIFE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item LIFE_CHESTPLATE = registerItem("life_chestplate", new ArmorItem(ModArmorMaterial.LIFE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item LIFE_LEGGINGS = registerItem("life_leggings", new ArmorItem(ModArmorMaterial.LIFE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item LIFE_BOOTS = registerItem("life_boots", new ArmorItem(ModArmorMaterial.LIFE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.WAREFARE)));

    public static final Item QUAERITE_HELMET = registerItem("quaerite_helmet", new FullQuaeritePerk(ModArmorMaterial.QUAERITE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item QUAERITE_CHESTPLATE = registerItem("quaerite_chestplate", new ArmorItem(ModArmorMaterial.QUAERITE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item QUAERITE_LEGGINGS = registerItem("quaerite_leggings", new ArmorItem(ModArmorMaterial.QUAERITE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item QUAERITE_BOOTS = registerItem("quaerite_boots", new ArmorItem(ModArmorMaterial.QUAERITE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item QUAERITE_SWORD = registerItem("quaerite_sword", new SwordItem(ModToolMaterial.QUAERITE, 3, -2.4f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item QUAERITE_SHOVEL = registerItem("quaerite_shovel", new ShovelItem(ModToolMaterial.QUAERITE, 1, -2.8f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item QUAERITE_PICKAXE = registerItem("quaerite_pickaxe", new ModPickaxeItem(ModToolMaterial.QUAERITE, 1, -2.8f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item QUAERITE_AXE = registerItem("quaerite_axe", new ModAxeItem(ModToolMaterial.QUAERITE, 5, -3f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item QUAERITE_HOE = registerItem("quaerite_hoe", new ModHoeItem(ModToolMaterial.QUAERITE, -4, 0f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));

    //Extra Armor + Tools (2)
    public static final Item BLAZE_CUTTER = registerItem("blaze_cutter", new ModPickaxeItem(ModToolMaterial.BLAZE, -1, -1.485f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item CLUB = registerItem("club", new SwordItem(ModToolMaterial.CLUB, 8, -3.5f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));

    //MELEE WEAPONS +39 Melee Weapons
    public static final Item ANCHOR = registerItem("anchor", new SwordItem(ModToolMaterial.MOD_IRON, 12, -3.0f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BATTLESTAFF = registerItem("battlestaff", new SwordItem(ModToolMaterial.STICK, 2, -0.5f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BATTLESTAFF_OF_TERROR = registerItem("battlestaff_of_terror", new SwordItem(ModToolMaterial.ENDER_INGOT, 8, -2.0f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BONECLUB = registerItem("boneclub", new SwordItem(ModToolMaterial.BONE, 14, -3.5f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BROADSWORD = registerItem("broadsword", new SwordItem(ModToolMaterial.MOD_IRON, 11, -2.75f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BROKEN_SAWBLADE = registerItem("broken_sawblade", new SwordItem(ModToolMaterial.BONE, 8, -2.0f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item CHILL_GALE_KNIFE = registerItem("chill_gale_knife", new SwordItem(ModToolMaterial.MYSTERIOUS_DEBRIS, 8, -1.25f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item CLAYMORE = registerItem("claymore", new SwordItem(ModToolMaterial.MOD_IRON, 7, -1.75f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item CORAL_BLADE = registerItem("coral_blade", new SwordItem(ModToolMaterial.CORAL, 7, -1.70f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item CUTLASS = registerItem("cutlass", new SwordItem(ModToolMaterial.MOD_IRON, 2, -0.25f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item BREAD_KNIFE = registerItem("bread_knife", new SwordItem(ModToolMaterial.MOD_IRON, 1, -0.25f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item ENCRUSTED_ANCHOR = registerItem("encrusted_anchor", new SwordItem(ModToolMaterial.MOD_GOLD, 14, -3.25f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item ETERNAL_KNIFE = registerItem("eternal_knife", new SwordItem(ModToolMaterial.ENDER_INGOT, 14, -2.5f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item FROST_FANG = registerItem("frost_fang", new SlownessSword(ModToolMaterial.BLUE_ICE, 3, -0.50f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item FIREBRAND = registerItem("firebrand", new SwordItem(ModToolMaterial.HELLSTONE, 10, -2.50f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item GLAIVE = registerItem("glaive", new SwordItem(ModToolMaterial.MOD_IRON, 4, -0.75f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item GRAVE_BANE = registerItem("grave_bane", new SwordItem(ModToolMaterial.MOD_GOLD, 6, -1.25f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item GREAT_AXEBLADE = registerItem("great_axeblade", new SwordItem(ModToolMaterial.MOD_IRON, 8, -1.75f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item GROWING_STAFF = registerItem("growing_staff", new SwordItem(ModToolMaterial.STICK, 4, -0.75f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item HAWKBRAND = registerItem("hawkbrand", new SwordItem(ModToolMaterial.MOD_IRON, 6, -1.50f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item HEARTSTEALER = registerItem("heartstealer", new HeartStealerSword(ModToolMaterial.MOD_IRON, 9, -2.25f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item HIGHLAND_AXE = registerItem("highland_axe", new SwordItem(ModToolMaterial.MOD_IRON, 5, -1.25f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item MECHANIZED_SAWBLADE = registerItem("mechanized_sawblade", new SwordItem(ModToolMaterial.MOD_IRON, 10, 2.25f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item MOON_DAGGER = registerItem("moon_dagger", new SwordItem(ModToolMaterial.MOD_IRON, 3, -0.75f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item NAMELESS_BLADE = registerItem("nameless_blade", new SwordItem(ModToolMaterial.ENDER_DUST, 2, -0.5f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item NIGHTMARES_BITE = registerItem("nightmares_bite", new PoisonSword(ModToolMaterial.POISON_SAC, 5, -1.00f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item OBSIDIAN_CLAYMORE = registerItem("obsidian_claymore", new SwordItem(ModToolMaterial.ENDER_INGOT, 14, -3.0f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item RESOLUTE_TEMPEST_KNIFE = registerItem("resolute_tempest_knife", new SwordItem(ModToolMaterial.MYSTERIOUS_DEBRIS, 9, -1.50f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item SHEER_DAGGER = registerItem("sheer_dagger", new SwordItem(ModToolMaterial.MOD_IRON, 4, -1.0f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item SICKEL = registerItem("sickel", new SwordItem(ModToolMaterial.MOD_IRON, 4, -1.0f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item SOUL_KNIFE = registerItem("soul_knife", new SwordItem(ModToolMaterial.MOD_IRON, 7, -1.00f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item SPONGE_STRIKER = registerItem("sponge_striker", new SwordItem(ModToolMaterial.MOD_IRON, 9, -2.0f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item TEMPEST_KNIFE = registerItem("tempest_knife", new SwordItem(ModToolMaterial.MOD_IRON, 4, -0.50f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item THE_LAST_LAUGH = registerItem("the_last_laugh", new SwordItem(ModToolMaterial.MOD_GOLD, 6, -1.25f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item THE_STARLESS_NIGHT = registerItem("the_starless_night", new SwordItem(ModToolMaterial.ENDER_INGOT, 15, -3.5f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item TRUTHSEEKER = registerItem("truthseeker", new SwordItem(ModToolMaterial.MOD_IRON, 11, -1.75f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item VENOM_GLAIVE = registerItem("venom_glaive", new PoisonSword(ModToolMaterial.POISON_SAC, 5, -1.00f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item VINE_WHIP = registerItem("vine_whip", new SwordItem(ModToolMaterial.VINE, 4, -0.75f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));
    public static final Item WHIP = registerItem("whip", new SwordItem(ModToolMaterial.SILK, 3, -0.75f, new FabricItemSettings().group(ModItemGroup.WAREFARE)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Hmh2.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Hmh2.LOGGER.info("Registering Mod Items for " + Hmh2.MOD_ID);
    }
}
