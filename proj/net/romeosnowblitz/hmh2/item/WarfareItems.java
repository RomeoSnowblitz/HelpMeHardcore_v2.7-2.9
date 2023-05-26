/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.item.v1.FabricItemSettings
 *  net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
 *  net.minecraft.class_1738
 *  net.minecraft.class_1738$class_8051
 *  net.minecraft.class_1741
 *  net.minecraft.class_1743
 *  net.minecraft.class_1761
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1794
 *  net.minecraft.class_1810
 *  net.minecraft.class_1821
 *  net.minecraft.class_1829
 *  net.minecraft.class_1832
 *  net.minecraft.class_1935
 *  net.minecraft.class_2378
 *  net.minecraft.class_2960
 *  net.minecraft.class_4059
 *  net.minecraft.class_7923
 */
package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.class_1738;
import net.minecraft.class_1741;
import net.minecraft.class_1743;
import net.minecraft.class_1761;
import net.minecraft.class_1792;
import net.minecraft.class_1794;
import net.minecraft.class_1810;
import net.minecraft.class_1821;
import net.minecraft.class_1829;
import net.minecraft.class_1832;
import net.minecraft.class_1935;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_4059;
import net.minecraft.class_7923;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.item.ModArmorMaterial;
import net.romeosnowblitz.hmh2.item.ModItemGroup;
import net.romeosnowblitz.hmh2.item.ModToolMaterial;
import net.romeosnowblitz.hmh2.item.custom.magic.perks.EmeraldPerk;
import net.romeosnowblitz.hmh2.item.custom.magic.perks.HeartPerk;
import net.romeosnowblitz.hmh2.item.custom.magic.perks.QuaeritePerk;
import net.romeosnowblitz.hmh2.item.custom.magic.perks.single.FurPerk;
import net.romeosnowblitz.hmh2.item.custom.magic.perks.single.HellstonePerk;
import net.romeosnowblitz.hmh2.item.custom.magic.perks.single.QueenBeePerk;
import net.romeosnowblitz.hmh2.item.custom.magic.swords.AnchorItem;
import net.romeosnowblitz.hmh2.item.custom.magic.swords.ClayHawk;
import net.romeosnowblitz.hmh2.item.custom.magic.swords.HawkHeart;
import net.romeosnowblitz.hmh2.item.custom.magic.swords.HeartStealerSword;
import net.romeosnowblitz.hmh2.item.custom.magic.swords.PoisonSword;
import net.romeosnowblitz.hmh2.item.custom.magic.swords.SlownessSword;
import net.romeosnowblitz.hmh2.item.custom.tools.ModCarver;

public class WarfareItems {
    public static final class_1792 BANANA_HELMET = WarfareItems.registerItem("banana_helmet", (class_1792)new class_1738((class_1741)ModArmorMaterial.BANANA, class_1738.class_8051.field_41934, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BANANA_CHESTPLATE = WarfareItems.registerItem("banana_chestplate", (class_1792)new class_1738((class_1741)ModArmorMaterial.BANANA, class_1738.class_8051.field_41935, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BANANA_LEGGINGS = WarfareItems.registerItem("banana_leggings", (class_1792)new class_1738((class_1741)ModArmorMaterial.BANANA, class_1738.class_8051.field_41936, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BANANA_BOOTS = WarfareItems.registerItem("banana_boots", (class_1792)new class_1738((class_1741)ModArmorMaterial.BANANA, class_1738.class_8051.field_41937, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BANANA_HORSE_ARMOR = WarfareItems.registerItem("banana_horse_armor", (class_1792)new class_4059(7, "banana", (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BANANA_PICKAXE = WarfareItems.registerItem("banana_pickaxe", (class_1792)new class_1810((class_1832)ModToolMaterial.BANANA, 1, -2.8f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUEEN_BEE_HELMET = WarfareItems.registerItem("queen_bee_helmet", (class_1792)new QueenBeePerk(ModArmorMaterial.BEE, class_1738.class_8051.field_41934, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUEEN_BEE_CHESTPLATE = WarfareItems.registerItem("queen_bee_chestplate", (class_1792)new QueenBeePerk(ModArmorMaterial.BEE, class_1738.class_8051.field_41935, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUEEN_BEE_LEGGINGS = WarfareItems.registerItem("queen_bee_leggings", (class_1792)new QueenBeePerk(ModArmorMaterial.BEE, class_1738.class_8051.field_41936, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUEEN_BEE_BOOTS = WarfareItems.registerItem("queen_bee_boots", (class_1792)new QueenBeePerk(ModArmorMaterial.BEE, class_1738.class_8051.field_41937, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUEEN_BEE_STINGER = WarfareItems.registerItem("queen_bee_stinger", (class_1792)new PoisonSword(ModToolMaterial.POISON_SAC, 7, -2.4f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BONE_HELMET = WarfareItems.registerItem("bone_helmet", (class_1792)new class_1738((class_1741)ModArmorMaterial.BONE, class_1738.class_8051.field_41934, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BONE_CHESTPLATE = WarfareItems.registerItem("bone_chestplate", (class_1792)new class_1738((class_1741)ModArmorMaterial.BONE, class_1738.class_8051.field_41935, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BONE_LEGGINGS = WarfareItems.registerItem("bone_leggings", (class_1792)new class_1738((class_1741)ModArmorMaterial.BONE, class_1738.class_8051.field_41936, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BONE_BOOTS = WarfareItems.registerItem("bone_boots", (class_1792)new class_1738((class_1741)ModArmorMaterial.BONE, class_1738.class_8051.field_41937, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BONE_SWORD = WarfareItems.registerItem("bone_sword", (class_1792)new class_1829((class_1832)ModToolMaterial.BONE, 7, -2.4f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BONE_SHOVEL = WarfareItems.registerItem("bone_shovel", (class_1792)new class_1821((class_1832)ModToolMaterial.BONE, 5.0f, -2.8f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BONE_PICKAXE = WarfareItems.registerItem("bone_pickaxe", (class_1792)new class_1810((class_1832)ModToolMaterial.BONE, 5, -2.8f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BONE_AXE = WarfareItems.registerItem("bone_axe", (class_1792)new class_1743((class_1832)ModToolMaterial.BONE, 10.0f, -3.1f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BONE_HOE = WarfareItems.registerItem("bone_hoe", (class_1792)new class_1794((class_1832)ModToolMaterial.BONE, 2, -1.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 EMERALD_HELMET = WarfareItems.registerItem("emerald_helmet", (class_1792)new EmeraldPerk(ModArmorMaterial.EMERALD, class_1738.class_8051.field_41934, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 EMERALD_CHESTPLATE = WarfareItems.registerItem("emerald_chestplate", (class_1792)new EmeraldPerk(ModArmorMaterial.EMERALD, class_1738.class_8051.field_41935, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 EMERALD_LEGGINGS = WarfareItems.registerItem("emerald_leggings", (class_1792)new EmeraldPerk(ModArmorMaterial.EMERALD, class_1738.class_8051.field_41936, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 EMERALD_BOOTS = WarfareItems.registerItem("emerald_boots", (class_1792)new EmeraldPerk(ModArmorMaterial.EMERALD, class_1738.class_8051.field_41937, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 FUR_HELMET = WarfareItems.registerItem("fur_helmet", (class_1792)new FurPerk(ModArmorMaterial.FUR, class_1738.class_8051.field_41934, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 FUR_CHESTPLATE = WarfareItems.registerItem("fur_chestplate", (class_1792)new FurPerk(ModArmorMaterial.FUR, class_1738.class_8051.field_41935, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 FUR_LEGGINGS = WarfareItems.registerItem("fur_leggings", (class_1792)new FurPerk(ModArmorMaterial.FUR, class_1738.class_8051.field_41936, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 FUR_BOOTS = WarfareItems.registerItem("fur_boots", (class_1792)new FurPerk(ModArmorMaterial.FUR, class_1738.class_8051.field_41937, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 HELLSTONE_HELMET = WarfareItems.registerItem("hellstone_helmet", (class_1792)new HellstonePerk(ModArmorMaterial.HELLSTONE, class_1738.class_8051.field_41934, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 HELLSTONE_CHESTPLATE = WarfareItems.registerItem("hellstone_chestplate", (class_1792)new HellstonePerk(ModArmorMaterial.HELLSTONE, class_1738.class_8051.field_41935, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 HELLSTONE_LEGGINGS = WarfareItems.registerItem("hellstone_leggings", (class_1792)new HellstonePerk(ModArmorMaterial.HELLSTONE, class_1738.class_8051.field_41936, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 HELLSTONE_BOOTS = WarfareItems.registerItem("hellstone_boots", (class_1792)new HellstonePerk(ModArmorMaterial.HELLSTONE, class_1738.class_8051.field_41937, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 HELLSTONE_PICKAXE = WarfareItems.registerItem("hellstone_pickaxe", (class_1792)new class_1810((class_1832)ModToolMaterial.HELLSTONE, 4, 3.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 LIFE_HELMET = WarfareItems.registerItem("life_helmet", (class_1792)new HeartPerk(ModArmorMaterial.LIFE, class_1738.class_8051.field_41934, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 LIFE_CHESTPLATE = WarfareItems.registerItem("life_chestplate", (class_1792)new HeartPerk(ModArmorMaterial.LIFE, class_1738.class_8051.field_41935, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 LIFE_LEGGINGS = WarfareItems.registerItem("life_leggings", (class_1792)new HeartPerk(ModArmorMaterial.LIFE, class_1738.class_8051.field_41936, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 LIFE_BOOTS = WarfareItems.registerItem("life_boots", (class_1792)new HeartPerk(ModArmorMaterial.LIFE, class_1738.class_8051.field_41937, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUAERITE_HELMET = WarfareItems.registerItem("quaerite_helmet", (class_1792)new QuaeritePerk(ModArmorMaterial.QUAERITE, class_1738.class_8051.field_41934, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUAERITE_CHESTPLATE = WarfareItems.registerItem("quaerite_chestplate", (class_1792)new QuaeritePerk(ModArmorMaterial.QUAERITE, class_1738.class_8051.field_41935, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUAERITE_LEGGINGS = WarfareItems.registerItem("quaerite_leggings", (class_1792)new QuaeritePerk(ModArmorMaterial.QUAERITE, class_1738.class_8051.field_41936, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUAERITE_BOOTS = WarfareItems.registerItem("quaerite_boots", (class_1792)new QuaeritePerk(ModArmorMaterial.QUAERITE, class_1738.class_8051.field_41937, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUAERITE_SWORD = WarfareItems.registerItem("quaerite_sword", (class_1792)new class_1829((class_1832)ModToolMaterial.QUAERITE, 3, -2.4f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUAERITE_SHOVEL = WarfareItems.registerItem("quaerite_shovel", (class_1792)new class_1821((class_1832)ModToolMaterial.QUAERITE, 1.0f, -2.8f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUAERITE_PICKAXE = WarfareItems.registerItem("quaerite_pickaxe", (class_1792)new class_1810((class_1832)ModToolMaterial.QUAERITE, 1, -2.8f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUAERITE_AXE = WarfareItems.registerItem("quaerite_axe", (class_1792)new class_1743((class_1832)ModToolMaterial.QUAERITE, 5.0f, -3.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUAERITE_HOE = WarfareItems.registerItem("quaerite_hoe", (class_1792)new class_1794((class_1832)ModToolMaterial.QUAERITE, -4, 0.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BLAZE_CUTTER = WarfareItems.registerItem("blaze_cutter", (class_1792)new class_1810((class_1832)ModToolMaterial.BLAZE, -1, -1.485f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 CLUB = WarfareItems.registerItem("club", (class_1792)new class_1829((class_1832)ModToolMaterial.CLUB, 8, -3.5f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 ANCHOR = WarfareItems.registerItem("anchor", (class_1792)new AnchorItem(ModToolMaterial.MOD_IRON, 11, -3.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BATTLESTAFF = WarfareItems.registerItem("battlestaff", (class_1792)new class_1829((class_1832)ModToolMaterial.STICK, 2, -0.5f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BATTLESTAFF_OF_TERROR = WarfareItems.registerItem("battlestaff_of_terror", (class_1792)new class_1829((class_1832)ModToolMaterial.ENDER_INGOT, 8, -2.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BONECLUB = WarfareItems.registerItem("boneclub", (class_1792)new class_1829((class_1832)ModToolMaterial.BONE, 14, -3.5f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BROADSWORD = WarfareItems.registerItem("broadsword", (class_1792)new class_1829((class_1832)ModToolMaterial.MOD_IRON, 11, -3.25f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BROKEN_SAWBLADE = WarfareItems.registerItem("broken_sawblade", (class_1792)new class_1829((class_1832)ModToolMaterial.BONE, 8, -3.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 CHILL_GALE_KNIFE = WarfareItems.registerItem("chill_gale_knife", (class_1792)new class_1829((class_1832)ModToolMaterial.MYSTERIOUS_DEBRIS, 8, -1.25f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 CLAYMORE = WarfareItems.registerItem("claymore", (class_1792)new ClayHawk(ModToolMaterial.MOD_IRON, 7, -3.75f, (class_1792.class_1793)new FabricItemSettings(), 20));
    public static final class_1792 CORAL_BLADE = WarfareItems.registerItem("coral_blade", (class_1792)new class_1829((class_1832)ModToolMaterial.CORAL, 7, -1.7f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 CUTLASS = WarfareItems.registerItem("cutlass", (class_1792)new class_1829((class_1832)ModToolMaterial.MOD_IRON, 2, -0.25f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BREAD_KNIFE = WarfareItems.registerItem("bread_knife", new ModCarver(1, -0.25f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 ENCRUSTED_ANCHOR = WarfareItems.registerItem("encrusted_anchor", (class_1792)new class_1829((class_1832)ModToolMaterial.MOD_GOLD, 14, -3.25f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 ETERNAL_KNIFE = WarfareItems.registerItem("eternal_knife", (class_1792)new class_1829((class_1832)ModToolMaterial.ENDER_INGOT, 14, -2.5f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 FROST_FANG = WarfareItems.registerItem("frost_fang", (class_1792)new SlownessSword(ModToolMaterial.BLUE_ICE, 3, -0.5f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 FIREBRAND = WarfareItems.registerItem("firebrand", (class_1792)new class_1743((class_1832)ModToolMaterial.HELLSTONE, 10.0f, -2.5f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 GLAIVE = WarfareItems.registerItem("glaive", (class_1792)new class_1829((class_1832)ModToolMaterial.MOD_IRON, 4, -0.75f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 GRAVE_BANE = WarfareItems.registerItem("grave_bane", (class_1792)new class_1829((class_1832)ModToolMaterial.MOD_GOLD, 6, -1.25f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 GREAT_AXEBLADE = WarfareItems.registerItem("great_axeblade", (class_1792)new class_1743((class_1832)ModToolMaterial.MOD_IRON, 10.0f, -3.15f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 GROWING_STAFF = WarfareItems.registerItem("growing_staff", (class_1792)new class_1829((class_1832)ModToolMaterial.STICK, 4, -0.75f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 HAWKBRAND = WarfareItems.registerItem("hawkbrand", (class_1792)new HawkHeart(ModToolMaterial.MOD_IRON, 6, -1.5f, (class_1792.class_1793)new FabricItemSettings(), 20));
    public static final class_1792 HEARTSTEALER = WarfareItems.registerItem("heartstealer", (class_1792)new HeartStealerSword(ModToolMaterial.MOD_IRON, 9, -2.25f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 HIGHLAND_AXE = WarfareItems.registerItem("highland_axe", (class_1792)new class_1743((class_1832)ModToolMaterial.MOD_IRON, 5.0f, -1.25f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 MECHANIZED_SAWBLADE = WarfareItems.registerItem("mechanized_sawblade", (class_1792)new class_1829((class_1832)ModToolMaterial.MOD_IRON, 10, -2.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 MOON_DAGGER = WarfareItems.registerItem("moon_dagger", (class_1792)new class_1829((class_1832)ModToolMaterial.MOD_IRON, 3, -0.75f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 NAMELESS_BLADE = WarfareItems.registerItem("nameless_blade", (class_1792)new class_1829((class_1832)ModToolMaterial.ENDER_DUST, 2, -0.5f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 NIGHTMARES_BITE = WarfareItems.registerItem("nightmares_bite", (class_1792)new PoisonSword(ModToolMaterial.POISON_SAC, 5, -1.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 OBSIDIAN_CLAYMORE = WarfareItems.registerItem("obsidian_claymore", (class_1792)new class_1829((class_1832)ModToolMaterial.ENDER_INGOT, 14, -3.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 RESOLUTE_TEMPEST_KNIFE = WarfareItems.registerItem("resolute_tempest_knife", (class_1792)new class_1829((class_1832)ModToolMaterial.MYSTERIOUS_DEBRIS, 9, -1.5f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 SHEER_DAGGER = WarfareItems.registerItem("sheer_dagger", (class_1792)new class_1829((class_1832)ModToolMaterial.MOD_IRON, 4, -1.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 SICKEL = WarfareItems.registerItem("sickel", (class_1792)new class_1829((class_1832)ModToolMaterial.MOD_IRON, 4, -1.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 SOUL_KNIFE = WarfareItems.registerItem("soul_knife", (class_1792)new class_1829((class_1832)ModToolMaterial.MOD_IRON, 7, -1.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 SPONGE_STRIKER = WarfareItems.registerItem("sponge_striker", (class_1792)new class_1829((class_1832)ModToolMaterial.MOD_IRON, 9, -2.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 TEMPEST_KNIFE = WarfareItems.registerItem("tempest_knife", (class_1792)new class_1829((class_1832)ModToolMaterial.MOD_IRON, 4, -0.5f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 THE_LAST_LAUGH = WarfareItems.registerItem("the_last_laugh", (class_1792)new class_1829((class_1832)ModToolMaterial.MOD_GOLD, 6, -1.25f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 THE_STARLESS_NIGHT = WarfareItems.registerItem("the_starless_night", (class_1792)new class_1829((class_1832)ModToolMaterial.ENDER_INGOT, 15, -3.5f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 TRUTHSEEKER = WarfareItems.registerItem("truthseeker", (class_1792)new class_1829((class_1832)ModToolMaterial.MOD_IRON, 11, -1.75f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 VENOM_GLAIVE = WarfareItems.registerItem("venom_glaive", (class_1792)new PoisonSword(ModToolMaterial.POISON_SAC, 5, -1.0f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 VINE_WHIP = WarfareItems.registerItem("vine_whip", (class_1792)new class_1829((class_1832)ModToolMaterial.VINE, 4, -0.75f, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 WHIP = WarfareItems.registerItem("whip", (class_1792)new class_1829((class_1832)ModToolMaterial.SILK, 3, -0.75f, (class_1792.class_1793)new FabricItemSettings()));

    private static class_1792 registerItem(String name, class_1792 item) {
        return (class_1792)class_2378.method_10230((class_2378)class_7923.field_41178, (class_2960)new class_2960("hmh2", name), (Object)item);
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
        WarfareItems.addToItemGroup(ModItemGroup.WARFARE, QUAERITE_BOOTS);
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

    public static void addToItemGroup(class_1761 group, class_1792 item) {
        ItemGroupEvents.modifyEntriesEvent((class_1761)group).register(entries -> entries.method_45421((class_1935)item));
    }

    public static void registerModItems() {
        Hmh2.LOGGER.info("Registering Mod Items for hmh2");
        WarfareItems.addItemsToItemGroup();
    }
}

