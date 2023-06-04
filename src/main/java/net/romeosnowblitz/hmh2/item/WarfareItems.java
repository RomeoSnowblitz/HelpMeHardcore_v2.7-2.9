package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.item.custom.magic.perks.*;
import net.romeosnowblitz.hmh2.item.custom.magic.perks.single.FurPerk;
import net.romeosnowblitz.hmh2.item.custom.magic.perks.single.HellstonePerk;
import net.romeosnowblitz.hmh2.item.custom.magic.perks.single.QuaeritePerk;
import net.romeosnowblitz.hmh2.item.custom.magic.perks.single.QueenBeePerk;
import net.romeosnowblitz.hmh2.item.custom.magic.swords.*;
import net.romeosnowblitz.hmh2.item.custom.tools.ModCarver;

public class WarfareItems {

    //Armor (4) + Tools (2)  /   (28)
    public static final Item BANANA_HELMET = registerItem("banana_helmet",new ArmorItem(ModArmorMaterial.BANANA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BANANA_CHESTPLATE = registerItem("banana_chestplate", new ArmorItem(ModArmorMaterial.BANANA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BANANA_LEGGINGS = registerItem("banana_leggings", new ArmorItem(ModArmorMaterial.BANANA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BANANA_BOOTS = registerItem("banana_boots", new ArmorItem(ModArmorMaterial.BANANA, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item BANANA_HORSE_ARMOR= registerItem("banana_horse_armor", new HorseArmorItem(7,"banana", new FabricItemSettings()));
    public static final Item BANANA_PICKAXE = registerItem("banana_pickaxe", new PickaxeItem(ModToolMaterial.BANANA, 1, -2.8f, new FabricItemSettings()));

    public static final Item QUEEN_BEE_HELMET = registerItem("queen_bee_helmet", new QueenBeePerk(ModArmorMaterial.BEE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item QUEEN_BEE_CHESTPLATE = registerItem("queen_bee_chestplate", new QueenBeePerk(ModArmorMaterial.BEE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item QUEEN_BEE_LEGGINGS = registerItem("queen_bee_leggings", new QueenBeePerk(ModArmorMaterial.BEE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item QUEEN_BEE_BOOTS = registerItem("queen_bee_boots", new ArmorItem(ModArmorMaterial.BEE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item QUEEN_BEE_STINGER = registerItem("queen_bee_stinger", new PoisonSword(ModToolMaterial.POISON_SAC, 7, -2.4f, new FabricItemSettings()));

    public static final Item BONE_HELMET = registerItem("bone_helmet", new ArmorItem(ModArmorMaterial.BONE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BONE_CHESTPLATE = registerItem("bone_chestplate", new ArmorItem(ModArmorMaterial.BONE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BONE_LEGGINGS = registerItem("bone_leggings", new ArmorItem(ModArmorMaterial.BONE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BONE_BOOTS = registerItem("bone_boots", new ArmorItem(ModArmorMaterial.BONE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item BONE_SWORD = registerItem("bone_sword", new SwordItem(ModToolMaterial.BONE, 7, -2.4f, new FabricItemSettings()));
    public static final Item BONE_SHOVEL = registerItem("bone_shovel", new ShovelItem(ModToolMaterial.BONE, 5, -2.8f, new FabricItemSettings()));
    public static final Item BONE_PICKAXE = registerItem("bone_pickaxe", new PickaxeItem(ModToolMaterial.BONE, 5, -2.8f, new FabricItemSettings()));
    public static final Item BONE_AXE = registerItem("bone_axe", new AxeItem(ModToolMaterial.BONE, 10, -3.1f, new FabricItemSettings()));
    public static final Item BONE_HOE = registerItem("bone_hoe", new HoeItem(ModToolMaterial.BONE, 2, -1f, new FabricItemSettings()));

    public static final Item EMERALD_HELMET = registerItem("emerald_helmet", new EmeraldPerk(ModArmorMaterial.EMERALD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate", new EmeraldPerk(ModArmorMaterial.EMERALD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings", new EmeraldPerk(ModArmorMaterial.EMERALD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots", new EmeraldPerk(ModArmorMaterial.EMERALD, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item FUR_HELMET = registerItem("fur_helmet", new FurPerk(ModArmorMaterial.FUR, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item FUR_CHESTPLATE = registerItem("fur_chestplate", new FurPerk(ModArmorMaterial.FUR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item FUR_LEGGINGS = registerItem("fur_leggings", new FurPerk(ModArmorMaterial.FUR, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item FUR_BOOTS = registerItem("fur_boots", new FurPerk(ModArmorMaterial.FUR, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item HELLSTONE_HELMET = registerItem("hellstone_helmet", new HellstonePerk(ModArmorMaterial.HELLSTONE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item HELLSTONE_CHESTPLATE = registerItem("hellstone_chestplate", new HellstonePerk(ModArmorMaterial.HELLSTONE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item HELLSTONE_LEGGINGS = registerItem("hellstone_leggings", new HellstonePerk(ModArmorMaterial.HELLSTONE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item HELLSTONE_BOOTS = registerItem("hellstone_boots", new HellstonePerk(ModArmorMaterial.HELLSTONE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item HELLSTONE_PICKAXE = registerItem("hellstone_pickaxe", new PickaxeItem(ModToolMaterial.HELLSTONE,4,3, new FabricItemSettings()));

    public static final Item LIFE_HELMET = registerItem("life_helmet", new HeartPerk(ModArmorMaterial.LIFE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item LIFE_CHESTPLATE = registerItem("life_chestplate", new HeartPerk(ModArmorMaterial.LIFE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item LIFE_LEGGINGS = registerItem("life_leggings", new HeartPerk(ModArmorMaterial.LIFE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item LIFE_BOOTS = registerItem("life_boots", new HeartPerk(ModArmorMaterial.LIFE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item QUAERITE_HELMET = registerItem("quaerite_helmet", new QuaeritePerk(ModArmorMaterial.QUAERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item QUAERITE_CHESTPLATE = registerItem("quaerite_chestplate", new QuaeritePerk(ModArmorMaterial.QUAERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item QUAERITE_LEGGINGS = registerItem("quaerite_leggings", new QuaeritePerk(ModArmorMaterial.QUAERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item QUAERITE_BOOTS = registerItem("quaerite_boots", new QuaeritePerk(ModArmorMaterial.QUAERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item QUAERITE_SWORD = registerItem("quaerite_sword", new SwordItem(ModToolMaterial.QUAERITE, 3, -2.4f, new FabricItemSettings()));
    public static final Item QUAERITE_SHOVEL = registerItem("quaerite_shovel", new ShovelItem(ModToolMaterial.QUAERITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item QUAERITE_PICKAXE = registerItem("quaerite_pickaxe", new PickaxeItem(ModToolMaterial.QUAERITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item QUAERITE_AXE = registerItem("quaerite_axe", new AxeItem(ModToolMaterial.QUAERITE, 5, -3f, new FabricItemSettings()));
    public static final Item QUAERITE_HOE = registerItem("quaerite_hoe", new HoeItem(ModToolMaterial.QUAERITE, -4, 0f, new FabricItemSettings()));

    //Extra Armor + Tools (2)
    public static final Item BLAZE_CUTTER = registerItem("blaze_cutter", new PickaxeItem(ModToolMaterial.BLAZE, -1, -1.485f, new FabricItemSettings()));
    public static final Item CLUB = registerItem("club", new SwordItem(ModToolMaterial.CLUB, 8, -3.5f, new FabricItemSettings()));

    //MELEE WEAPONS +39 Melee Weapons
    public static final Item ANCHOR = registerItem("anchor", new AnchorItem(ModToolMaterial.MOD_IRON, 12, -3.0f, new FabricItemSettings()));
    public static final Item BATTLESTAFF = registerItem("battlestaff", new SwordItem(ModToolMaterial.STICK, 2, -0.5f, new FabricItemSettings()));
    public static final Item BATTLESTAFF_OF_TERROR = registerItem("battlestaff_of_terror", new SwordItem(ModToolMaterial.ENDER_INGOT, 8, -2.0f, new FabricItemSettings()));
    public static final Item BONECLUB = registerItem("boneclub", new SwordItem(ModToolMaterial.BONE, 14, -3.5f, new FabricItemSettings()));
    public static final Item BREAD_KNIFE = registerItem("bread_knife", new ModCarver( 1, -0.25f, new FabricItemSettings()));
    public static final Item BROADSWORD = registerItem("broadsword", new SwordItem(ModToolMaterial.MOD_IRON, 11, -3.25f, new FabricItemSettings()));
    public static final Item BROKEN_SAWBLADE = registerItem("broken_sawblade", new SwordItem(ModToolMaterial.BONE, 8, -3.0f, new FabricItemSettings()));
    public static final Item CHILL_GALE_KNIFE = registerItem("chill_gale_knife", new SwordItem(ModToolMaterial.MYSTERIOUS_DEBRIS, 8, -1.25f, new FabricItemSettings()));
    public static final Item CLAYMORE = registerItem("claymore", new ClayHawk(ModToolMaterial.MOD_IRON, 7, -3.75f, new FabricItemSettings(),20));
    public static final Item CORAL_BLADE = registerItem("coral_blade", new SwordItem(ModToolMaterial.CORAL, 7, -1.70f, new FabricItemSettings()));
    public static final Item CUTLASS = registerItem("cutlass", new SwordItem(ModToolMaterial.MOD_IRON, 2, -0.25f, new FabricItemSettings()));
    public static final Item ENCRUSTED_ANCHOR = registerItem("encrusted_anchor", new AnchorItem(ModToolMaterial.MOD_GOLD, 14, -3.25f, new FabricItemSettings()));
    public static final Item ETERNAL_KNIFE = registerItem("eternal_knife", new SwordItem(ModToolMaterial.ENDER_INGOT, 14, -2.5f, new FabricItemSettings()));
    public static final Item FROST_FANG = registerItem("frost_fang", new SlownessSword(ModToolMaterial.BLUE_ICE, 3, -0.50f, new FabricItemSettings()));
    public static final Item FIREBRAND = registerItem("firebrand", new AxeItem(ModToolMaterial.HELLSTONE, 10, -2.50f, new FabricItemSettings()));
    public static final Item GLAIVE = registerItem("glaive", new SwordItem(ModToolMaterial.MOD_IRON, 4, -0.75f, new FabricItemSettings()));
    public static final Item GRAVE_BANE = registerItem("grave_bane", new SwordItem(ModToolMaterial.MOD_GOLD, 6, -1.25f, new FabricItemSettings()));
    public static final Item GREAT_AXEBLADE = registerItem("great_axeblade", new AxeItem(ModToolMaterial.MOD_IRON, 10, -3.15f, new FabricItemSettings()));
    public static final Item GROWING_STAFF = registerItem("growing_staff", new SwordItem(ModToolMaterial.STICK, 4, -0.75f, new FabricItemSettings()));
    public static final Item HAWKBRAND = registerItem("hawkbrand", new HawkHeart(ModToolMaterial.MOD_IRON, 6, -1.50f, new FabricItemSettings(),20));
    public static final Item HEARTSTEALER = registerItem("heartstealer", new HeartStealerSword(ModToolMaterial.MOD_IRON, 9, -2.25f, new FabricItemSettings()));
    public static final Item HIGHLAND_AXE = registerItem("highland_axe", new AxeItem(ModToolMaterial.MOD_IRON, 5, -1.25f, new FabricItemSettings()));
    public static final Item MECHANIZED_SAWBLADE = registerItem("mechanized_sawblade", new SwordItem(ModToolMaterial.MOD_IRON, 10, -2.00f, new FabricItemSettings()));
    public static final Item MOON_DAGGER = registerItem("moon_dagger", new SwordItem(ModToolMaterial.MOD_IRON, 3, -0.75f, new FabricItemSettings()));
    public static final Item NAMELESS_BLADE = registerItem("nameless_blade", new SwordItem(ModToolMaterial.ENDER_DUST, 2, -0.5f, new FabricItemSettings()));
    public static final Item NIGHTMARES_BITE = registerItem("nightmares_bite", new PoisonSword(ModToolMaterial.POISON_SAC, 5, -1.00f, new FabricItemSettings()));
    public static final Item OBSIDIAN_CLAYMORE = registerItem("obsidian_claymore", new SwordItem(ModToolMaterial.ENDER_INGOT, 14, -3.0f, new FabricItemSettings()));
    public static final Item RESOLUTE_TEMPEST_KNIFE = registerItem("resolute_tempest_knife", new SwordItem(ModToolMaterial.MYSTERIOUS_DEBRIS, 9, -1.50f, new FabricItemSettings()));
    public static final Item SHEER_DAGGER = registerItem("sheer_dagger", new SwordItem(ModToolMaterial.MOD_IRON, 4, -1.0f, new FabricItemSettings()));
    public static final Item SICKEL = registerItem("sickel", new SwordItem(ModToolMaterial.MOD_IRON, 4, -1.0f, new FabricItemSettings()));
    public static final Item SOUL_KNIFE = registerItem("soul_knife", new SwordItem(ModToolMaterial.MOD_IRON, 7, -1.00f, new FabricItemSettings()));
    public static final Item SPONGE_STRIKER = registerItem("sponge_striker", new SwordItem(ModToolMaterial.MOD_IRON, 9, -2.0f, new FabricItemSettings()));
    public static final Item TEMPEST_KNIFE = registerItem("tempest_knife", new SwordItem(ModToolMaterial.MOD_IRON, 4, -0.50f, new FabricItemSettings()));
    public static final Item THE_LAST_LAUGH = registerItem("the_last_laugh", new SwordItem(ModToolMaterial.MOD_GOLD, 6, -1.25f, new FabricItemSettings()));
    public static final Item THE_STARLESS_NIGHT = registerItem("the_starless_night", new SwordItem(ModToolMaterial.ENDER_INGOT, 15, -3.5f, new FabricItemSettings()));
    public static final Item TRUTHSEEKER = registerItem("truthseeker", new SwordItem(ModToolMaterial.MOD_IRON, 11, -1.75f, new FabricItemSettings()));
    public static final Item VENOM_GLAIVE = registerItem("venom_glaive", new PoisonSword(ModToolMaterial.POISON_SAC, 5, -1.00f, new FabricItemSettings()));
    public static final Item VINE_WHIP = registerItem("vine_whip", new SwordItem(ModToolMaterial.VINE, 4, -0.75f, new FabricItemSettings()));
    public static final Item WHIP = registerItem("whip", new SwordItem(ModToolMaterial.SILK, 3, -0.75f, new FabricItemSettings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Hmh2.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BANANA_HELMET);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BANANA_CHESTPLATE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BANANA_LEGGINGS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BANANA_BOOTS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BANANA_HORSE_ARMOR);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BANANA_PICKAXE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUEEN_BEE_HELMET);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUEEN_BEE_CHESTPLATE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUEEN_BEE_LEGGINGS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUEEN_BEE_BOOTS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUEEN_BEE_STINGER);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BONE_HELMET);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BONE_CHESTPLATE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BONE_LEGGINGS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BONE_BOOTS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BONE_SWORD);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BONE_SHOVEL);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BONE_PICKAXE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BONE_AXE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BONE_HOE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, EMERALD_HELMET);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, EMERALD_CHESTPLATE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, EMERALD_LEGGINGS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, EMERALD_BOOTS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, FUR_HELMET);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, FUR_CHESTPLATE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, FUR_LEGGINGS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, FUR_BOOTS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, HELLSTONE_HELMET);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, HELLSTONE_CHESTPLATE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, HELLSTONE_LEGGINGS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, HELLSTONE_BOOTS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, LIFE_HELMET);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, LIFE_CHESTPLATE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, LIFE_LEGGINGS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, LIFE_BOOTS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUAERITE_HELMET);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUAERITE_CHESTPLATE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUAERITE_LEGGINGS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUAERITE_BOOTS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUAERITE_SWORD);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUAERITE_SHOVEL);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUAERITE_PICKAXE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUAERITE_AXE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUAERITE_HOE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BLAZE_CUTTER);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, CLUB);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, ANCHOR);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BATTLESTAFF);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BATTLESTAFF_OF_TERROR);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BONECLUB);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BROADSWORD);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BROKEN_SAWBLADE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, CHILL_GALE_KNIFE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, CLAYMORE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, CORAL_BLADE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, CUTLASS);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, BREAD_KNIFE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, ENCRUSTED_ANCHOR);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, ETERNAL_KNIFE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, FROST_FANG);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, FIREBRAND);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, GLAIVE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, GRAVE_BANE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, GREAT_AXEBLADE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, GROWING_STAFF);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, HAWKBRAND);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, HEARTSTEALER);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, HIGHLAND_AXE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, MECHANIZED_SAWBLADE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, MOON_DAGGER);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, NAMELESS_BLADE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, NIGHTMARES_BITE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, OBSIDIAN_CLAYMORE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, RESOLUTE_TEMPEST_KNIFE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, SHEER_DAGGER);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, SICKEL);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, SOUL_KNIFE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, SPONGE_STRIKER);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, TEMPEST_KNIFE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, THE_LAST_LAUGH);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, THE_STARLESS_NIGHT);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, TRUTHSEEKER);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, VENOM_GLAIVE);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, VINE_WHIP);
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, WHIP);
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        Hmh2.LOGGER.info("Registering Mod Items for " + Hmh2.MOD_ID);
        WarfareItems.addItemsToItemGroup();
    }
}
