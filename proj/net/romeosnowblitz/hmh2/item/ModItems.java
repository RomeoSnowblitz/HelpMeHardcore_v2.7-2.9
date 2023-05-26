/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.item.v1.FabricItemSettings
 *  net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1753
 *  net.minecraft.class_1755
 *  net.minecraft.class_1761
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1798
 *  net.minecraft.class_1802
 *  net.minecraft.class_1814
 *  net.minecraft.class_1819
 *  net.minecraft.class_1822
 *  net.minecraft.class_1826
 *  net.minecraft.class_1935
 *  net.minecraft.class_2378
 *  net.minecraft.class_2960
 *  net.minecraft.class_3611
 *  net.minecraft.class_4174$class_4175
 *  net.minecraft.class_4176
 *  net.minecraft.class_4480
 *  net.minecraft.class_7923
 */
package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1753;
import net.minecraft.class_1755;
import net.minecraft.class_1761;
import net.minecraft.class_1792;
import net.minecraft.class_1798;
import net.minecraft.class_1802;
import net.minecraft.class_1814;
import net.minecraft.class_1819;
import net.minecraft.class_1822;
import net.minecraft.class_1826;
import net.minecraft.class_1935;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_3611;
import net.minecraft.class_4174;
import net.minecraft.class_4176;
import net.minecraft.class_4480;
import net.minecraft.class_7923;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.entity.MobEntities;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.ModItemGroup;
import net.romeosnowblitz.hmh2.item.custom.dyes.BlueDyeItem;
import net.romeosnowblitz.hmh2.item.custom.dyes.CyanDyeItem;
import net.romeosnowblitz.hmh2.item.custom.dyes.GreenDyeItem;
import net.romeosnowblitz.hmh2.item.custom.dyes.PurpleDyeItem;
import net.romeosnowblitz.hmh2.item.custom.dyes.RedDyeItem;
import net.romeosnowblitz.hmh2.item.custom.food.ConsumeLeaveBottle;
import net.romeosnowblitz.hmh2.item.custom.food.ConsumeLeaveSheetPan;
import net.romeosnowblitz.hmh2.item.custom.food.EnderSkinConsumableLong;
import net.romeosnowblitz.hmh2.item.custom.food.EnderSkinConsumableShort;
import net.romeosnowblitz.hmh2.item.custom.food.MultiPurposeHoneyBucket;
import net.romeosnowblitz.hmh2.item.custom.test.Disc_Fragment;
import net.romeosnowblitz.hmh2.item.custom.test.FortressSeeker;
import net.romeosnowblitz.hmh2.item.custom.test.GrannyLotion;
import net.romeosnowblitz.hmh2.item.custom.test.NullPasser;
import net.romeosnowblitz.hmh2.item.custom.test.RevivalStone;
import net.romeosnowblitz.hmh2.item.custom.test.SunStone;
import net.romeosnowblitz.hmh2.item.custom.tools.SpearItem;

public class ModItems {
    public static final class_1792 FORTRESS_SEEKER = ModItems.registerItem("fortress_seeker", new FortressSeeker((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 SUN_STONE = ModItems.registerItem("sun_stone", new SunStone((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 REVIVAL_STONE = ModItems.registerItem("revival_stone", new RevivalStone((class_1792.class_1793)new FabricItemSettings().rarity(class_1814.field_8904).maxDamage(1)));
    public static final class_1792 GLUE = ModItems.registerItem("glue", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 FLOUR = ModItems.registerItem("flour", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(1).method_19237(0.1f).method_19242())));
    public static final class_1792 DISC_FRAGMENT = ModItems.registerItem("disc_fragment", new Disc_Fragment((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 NULL_PASSER = ModItems.registerItem("null_passer", new NullPasser((class_1792.class_1793)new FabricItemSettings().maxDamage(3)));
    public static final class_1792 SPEAR = ModItems.registerItem("spear", new SpearItem((class_1792.class_1793)new FabricItemSettings().maxDamage(500)));
    public static final class_1792 BAMBOO_BOW = ModItems.registerItem("bamboo_bow", (class_1792)new class_1753((class_1792.class_1793)new FabricItemSettings().maxDamage(192)));
    public static final class_1792 BAMBOO_SHIELD = ModItems.registerItem("bamboo_shield", (class_1792)new class_1819((class_1792.class_1793)new FabricItemSettings().maxDamage(192)));
    public static final class_1792 CORK = ModItems.registerItem("cork", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 GRAPHITE = ModItems.registerItem("graphite", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 HEART = ModItems.registerItem("heart", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(2).method_19237(1.0f).method_19239(new class_1293(class_1294.field_5898, 60, 0), 1.0f).method_19239(new class_1293(class_1294.field_5924, 60, 0), 1.0f).method_19240().method_19242())));
    public static final class_1792 HELLSTONE = ModItems.registerItem("hellstone", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 LUCKY_PIECE = ModItems.registerItem("lucky_piece", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 QUAERITE_FRAGMENT = ModItems.registerItem("quaerite_fragment", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 RAW_PLATINUM = ModItems.registerItem("raw_platinum", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 RAW_TITANIUM = ModItems.registerItem("raw_titanium", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 SALT = ModItems.registerItem("salt", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 RAW_SILVER = ModItems.registerItem("raw_silver", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 RAW_TIN = ModItems.registerItem("raw_tin", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 ASHES = ModItems.registerItem("ashes", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BURNT_EGGSHELL = ModItems.registerItem("burnt_eggshell", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 HEAVY_CREAM = ModItems.registerItem("heavy_cream", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 PLASTIC = ModItems.registerItem("plastic", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 PLATINUM_INGOT = ModItems.registerItem("platinum_ingot", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 RESIN = ModItems.registerItem("resin", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 SILVER_INGOT = ModItems.registerItem("silver_ingot", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 TIN_INGOT = ModItems.registerItem("tin_ingot", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 TITANIUM_INGOT = ModItems.registerItem("titanium_ingot", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BRONZE_INGOT = ModItems.registerItem("bronze_ingot", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BUTTER = ModItems.registerItem("butter", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 MYSTERIOUS_WHITE_DEBRIS = ModItems.registerItem("mysterious_white_debris", new class_1792((class_1792.class_1793)new FabricItemSettings().rarity(class_1814.field_8906).food(new class_4174.class_4175().method_19238(4).method_19237(0.3f).method_19239(new class_1293(class_1294.field_38092, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5920, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5898, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_16595, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5919, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5927, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5900, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5918, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5912, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5917, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5914, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_18980, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5903, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5921, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5915, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5905, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5913, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5902, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5926, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5901, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5916, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5925, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5899, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5924, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5907, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5922, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5909, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5906, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5904, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5910, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5908, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5923, 600, 0), 0.05f).method_19239(new class_1293(class_1294.field_5911, 600, 0), 0.05f).method_19240().method_19242())));
    public static final class_1792 MYSTERIOUS_YELLOW_DEBRIS = ModItems.registerItem("mysterious_yellow_debris", new class_1792((class_1792.class_1793)new FabricItemSettings().rarity(class_1814.field_8907).food(new class_4174.class_4175().method_19238(4).method_19237(0.3f).method_19239(new class_1293(class_1294.field_38092, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5920, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5898, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_16595, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5919, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5927, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5900, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5918, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5912, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5917, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5914, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_18980, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5903, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5921, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5915, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5905, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5913, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5902, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5926, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5901, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5916, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5925, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5899, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5924, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5907, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5922, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5909, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5906, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5904, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5910, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5908, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5923, 600, 0), 0.15f).method_19239(new class_1293(class_1294.field_5911, 600, 0), 0.15f).method_19240().method_19242())));
    public static final class_1792 MYSTERIOUS_CYAN_DEBRIS = ModItems.registerItem("mysterious_cyan_debris", new class_1792((class_1792.class_1793)new FabricItemSettings().rarity(class_1814.field_8903).food(new class_4174.class_4175().method_19238(4).method_19237(0.3f).method_19239(new class_1293(class_1294.field_38092, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5920, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5898, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_16595, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5919, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5927, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5900, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5918, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5912, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5917, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5914, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_18980, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5903, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5921, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5915, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5905, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5913, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5902, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5926, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5901, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5916, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5925, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5899, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5924, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5907, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5922, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5909, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5906, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5904, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5910, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5908, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5923, 600, 0), 0.35f).method_19239(new class_1293(class_1294.field_5911, 600, 0), 0.35f).method_19240().method_19242())));
    public static final class_1792 MYSTERIOUS_MAGENTA_DEBRIS = ModItems.registerItem("mysterious_magenta_debris", new class_1792((class_1792.class_1793)new FabricItemSettings().rarity(class_1814.field_8904).food(new class_4174.class_4175().method_19238(4).method_19237(0.3f).method_19239(new class_1293(class_1294.field_38092, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5920, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5898, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_16595, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5919, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5927, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5900, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5918, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5912, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5917, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5914, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_18980, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5903, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5921, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5915, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5905, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5913, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5902, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5926, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5901, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5916, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5925, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5899, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5924, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5907, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5922, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5909, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5906, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5904, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5910, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5908, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5923, 600, 0), 0.75f).method_19239(new class_1293(class_1294.field_5911, 600, 0), 0.75f).method_19240().method_19242())));
    public static final class_1792 HOOF = ModItems.registerItem("hoof", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 FUR_PELT = ModItems.registerItem("fur_pelt", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 POISON_SAC = ModItems.registerItem("poison_sac", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 RENNET = ModItems.registerItem("rennet", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BANANA_PEEL = ModItems.registerItem("banana_peel", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 BONE_PLATE = ModItems.registerItem("bone_plate", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 CHAINED_MESH = ModItems.registerItem("chained_mesh", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 CLOTH = ModItems.registerItem("cloth", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 HOOF_POWDER = ModItems.registerItem("hoof_powder", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 CONE = ModItems.registerItem("cone", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 ENDER_SHARD = ModItems.registerItem("ender_shard", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 ENDER_DUST = ModItems.registerItem("ender_dust", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 ENDER_INGOT = ModItems.registerItem("ender_ingot", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 FROZEN_MILK = ModItems.registerItem("frozen_milk", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 ITEM = ModItems.registerItem("item", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 OIL_BALL = ModItems.registerItem("oil_ball", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 PENCIL = ModItems.registerItem("pencil", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 SILK = ModItems.registerItem("silk", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 SHEET_PAN = ModItems.registerItem("sheet_pan", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 VEGAN_LEATHER = ModItems.registerItem("vegan_leather", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 WOODED_DIAMOND = ModItems.registerItem("wooded_diamond", new class_1792((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 GRANNY_LOTION = ModItems.registerItem("granny_lotion", new GrannyLotion((class_1792.class_1793)new FabricItemSettings().maxDamage(14)));
    public static final class_1792 ROSE_DYE = ModItems.registerItem("rose_dye", new RedDyeItem((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 ULTRAMARINE_DYE = ModItems.registerItem("ultramarine_dye", new BlueDyeItem((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 NEW_GREEN_DYE = ModItems.registerItem("new_green_dye", new GreenDyeItem((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 SPRING_GREEN_DYE = ModItems.registerItem("spring_green_dye", new CyanDyeItem((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 VIOLET_DYE = ModItems.registerItem("violet_dye", new PurpleDyeItem((class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 MIDAS_SEEDS = ModItems.registerItem("midas_seeds", (class_1792)new class_1798(ModBlocks.MIDAS_TOUCH, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 ENDER_CORN_SEEDS = ModItems.registerItem("ender_corn_seeds", (class_1792)new class_1798(ModBlocks.ENDER_CORN_BLOCK, (class_1792.class_1793)new FabricItemSettings()));
    public static final class_1792 ENDER_CORN = ModItems.registerItem("ender_corn", new EnderSkinConsumableShort((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(4).method_19237(0.5f).method_19242())));
    public static final class_1792 BANANA_SIGN = ModItems.registerItem("banana_sign", (class_1792)new class_1822((class_1792.class_1793)new FabricItemSettings().maxCount(16), WoodworkBlocks.BANANA_SIGN_BLOCK, WoodworkBlocks.BANANA_WALL_SIGN_BLOCK));
    public static final class_1792 CHERRY_SIGN = ModItems.registerItem("cherry_sign", (class_1792)new class_1822((class_1792.class_1793)new FabricItemSettings().maxCount(16), WoodworkBlocks.CHERRY_SIGN_BLOCK, WoodworkBlocks.CHERRY_WALL_SIGN_BLOCK));
    public static final class_1792 CORK_OAK_SIGN = ModItems.registerItem("cork_oak_sign", (class_1792)new class_1822((class_1792.class_1793)new FabricItemSettings().maxCount(16), WoodworkBlocks.CORK_OAK_SIGN_BLOCK, WoodworkBlocks.CORK_OAK_WALL_SIGN_BLOCK));
    public static final class_1792 JACARANDA_SIGN = ModItems.registerItem("jacaranda_sign", (class_1792)new class_1822((class_1792.class_1793)new FabricItemSettings().maxCount(16), WoodworkBlocks.JACARANDA_SIGN_BLOCK, WoodworkBlocks.JACARANDA_WALL_SIGN_BLOCK));
    public static final class_1792 MAHOE_SIGN = ModItems.registerItem("mahoe_sign", (class_1792)new class_1822((class_1792.class_1793)new FabricItemSettings().maxCount(16), WoodworkBlocks.MAHOE_SIGN_BLOCK, WoodworkBlocks.MAHOE_WALL_SIGN_BLOCK));
    public static final class_1792 MANGO_SIGN = ModItems.registerItem("mango_sign", (class_1792)new class_1822((class_1792.class_1793)new FabricItemSettings().maxCount(16), WoodworkBlocks.MANGO_SIGN_BLOCK, WoodworkBlocks.MANGO_WALL_SIGN_BLOCK));
    public static final class_1792 WILLOW_SIGN = ModItems.registerItem("willow_sign", (class_1792)new class_1822((class_1792.class_1793)new FabricItemSettings().maxCount(16), WoodworkBlocks.WILLOW_SIGN_BLOCK, WoodworkBlocks.WILLOW_WALL_SIGN_BLOCK));
    public static final class_1792 APPLE_JUICE = ModItems.registerItem("apple_juice", (class_1792)new class_4480(new class_1792.class_1793().method_7896(class_1802.field_8469).method_19265(class_4176.field_20381).method_7889(16)));
    public static final class_1792 APPLE_PIE = ModItems.registerItem("apple_pie", new ConsumeLeaveSheetPan((class_1792.class_1793)new FabricItemSettings().recipeRemainder(class_1802.field_8550).food(new class_4174.class_4175().method_19238(8).method_19237(0.3f).method_19242())));
    public static final class_1792 BACON = ModItems.registerItem("bacon", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(4).method_19237(0.5f).method_19242())));
    public static final class_1792 BANANAS = ModItems.registerItem("bananas", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(4).method_19237(0.3f).method_19242())));
    public static final class_1792 BEEF_JERKY = ModItems.registerItem("beef_jerky", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(2).method_19237(0.2f).method_19242())));
    public static final class_1792 BLUEBERRIES = ModItems.registerItem("blueberries", (class_1792)new class_1798(ModBlocks.BLUEBERRY_BUSH, new class_1792.class_1793().method_19265(class_4176.field_18636)));
    public static final class_1792 BLUEBERRY_JAM = ModItems.registerItem("blueberry_jam", new ConsumeLeaveBottle((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(4).method_19237(0.4f).method_19242())));
    public static final class_1792 BLUEBERRY_PIE = ModItems.registerItem("blueberry_pie", new ConsumeLeaveSheetPan((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(8).method_19237(0.3f).method_19242())));
    public static final class_1792 BURNT_TOAST = ModItems.registerItem("burnt_toast", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(1).method_19237(0.3f).method_19242())));
    public static final class_1792 BUTTERED_TOAST = ModItems.registerItem("buttered_toast", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(5).method_19237(2.0f).method_19242())));
    public static final class_1792 CHEESE = ModItems.registerItem("cheese", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(5).method_19237(0.9f).method_19242())));
    public static final class_1792 CHEESE_SLICE = ModItems.registerItem("cheese_slice", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(2).method_19237(0.3f).method_19242())));
    public static final class_1792 CHERRIES = ModItems.registerItem("cherries", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(2).method_19237(0.3f).method_19242())));
    public static final class_1792 CHERRY_PIE = ModItems.registerItem("cherry_pie", new ConsumeLeaveSheetPan((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(8).method_19237(0.3f).method_19242())));
    public static final class_1792 CHICKEN_NUGGET = ModItems.registerItem("chicken_nugget", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19241().method_19238(1).method_19237(0.3f).method_19242())));
    public static final class_1792 CHICKEN_SANDWICH = ModItems.registerItem("chicken_sandwich", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(4).method_19237(0.8f).method_19242())));
    public static final class_1792 CHOCOLATE_ICE_CREAM = ModItems.registerItem("chocolate_ice_cream", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(6).method_19237(0.4f).method_19242()).maxCount(1)));
    public static final class_1792 DOUGH = ModItems.registerItem("dough", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(2).method_19237(0.2f).method_19242())));
    public static final class_1792 ENDCHILADA = ModItems.registerItem("endchilada", new EnderSkinConsumableLong((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(20).method_19237(2.0f).method_19242())));
    public static final class_1792 GOLDEN_SALMON = ModItems.registerItem("golden_salmon", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(6).method_19237(1.2f).method_19242())));
    public static final class_1792 LIGHT_TOAST = ModItems.registerItem("light_toast", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(3).method_19237(0.8f).method_19242())));
    public static final class_1792 MANGO = ModItems.registerItem("mango", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(4).method_19237(0.3f).method_19242())));
    public static final class_1792 ORANGE = ModItems.registerItem("orange", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(4).method_19237(0.3f).method_19242())));
    public static final class_1792 ORANGE_JUICE = ModItems.registerItem("orange_juice", (class_1792)new class_4480(new class_1792.class_1793().method_7896(class_1802.field_8469).method_19265(class_4176.field_20381).method_7889(16)));
    public static final class_1792 RAW_BACON = ModItems.registerItem("raw_bacon", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(3).method_19237(0.3f).method_19239(new class_1293(class_1294.field_5903, 600, 0), 0.3f).method_19236().method_19242())));
    public static final class_1792 RAW_CHICKEN_NUGGET = ModItems.registerItem("raw_chicken_nugget", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19241().method_19238(1).method_19237(0.1f).method_19239(new class_1293(class_1294.field_5903, 600, 0), 0.3f).method_19236().method_19242())));
    public static final class_1792 SLICED_BREAD = ModItems.registerItem("sliced_bread", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(2).method_19237(0.6f).method_19242())));
    public static final class_1792 SASHIMI = ModItems.registerItem("sashimi", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(2).method_19237(0.6f).method_19242())));
    public static final class_1792 STRAWBERRIES = ModItems.registerItem("strawberries", (class_1792)new class_1798(ModBlocks.STRAWBERRY_BUSH, new class_1792.class_1793().method_19265(class_4176.field_18636)));
    public static final class_1792 STRAWBERRY_JAM = ModItems.registerItem("strawberry_jam", new ConsumeLeaveBottle((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(4).method_19237(0.4f).method_19242())));
    public static final class_1792 STRAWBERRY_PIE = ModItems.registerItem("strawberry_pie", new ConsumeLeaveSheetPan((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(8).method_19237(0.3f).method_19242())));
    public static final class_1792 TOOTHPASTE = ModItems.registerItem("toothpaste", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(4).method_19237(0.3f).method_19239(new class_1293(class_1294.field_5916, 300, 255), 1.0f).method_19242())));
    public static final class_1792 TOAST = ModItems.registerItem("toast", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(4).method_19237(1.0f).method_19242())));
    public static final class_1792 TORTILLA = ModItems.registerItem("tortilla", new class_1792((class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(1).method_19237(0.2f).method_19242())));
    public static final class_1792 CHOCOLATE_MILK = ModItems.registerItem("chocolate_milk", (class_1792)new class_1755((class_3611)ModFluids.CHOCOLATE_MILK_STILL, (class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(6).method_19237(0.4f).method_19242()).recipeRemainder(class_1802.field_8550).maxCount(1)));
    public static final class_1792 HEATED_OIL_BUCKET = ModItems.registerItem("heated_oil_bucket", (class_1792)new class_1755((class_3611)ModFluids.HEATED_OIL_STILL, (class_1792.class_1793)new FabricItemSettings().recipeRemainder(class_1802.field_8550).maxCount(1)));
    public static final class_1792 HONEY_BUCKET = ModItems.registerItem("honey_bucket", new MultiPurposeHoneyBucket((class_3611)ModFluids.HONEY_STILL, (class_1792.class_1793)new FabricItemSettings().food(new class_4174.class_4175().method_19238(6).method_19237(0.4f).method_19242()).recipeRemainder(class_1802.field_8550).maxCount(1)));
    public static final class_1792 OIL_BUCKET = ModItems.registerItem("oil_bucket", (class_1792)new class_1755((class_3611)ModFluids.OIL_STILL, (class_1792.class_1793)new FabricItemSettings().maxCount(1)));
    public static final class_1792 PENGUIN_SPAWN_EGG = ModItems.registerItem("penguin_spawn_egg", (class_1792)new class_1826(MobEntities.PENGUIN, 855309, 0xFFFFFF, (class_1792.class_1793)new FabricItemSettings().maxCount(1)));
    public static final class_1792 SHADOW_CREATURE_SPAWN_EGG = ModItems.registerItem("shadow_creature_spawn_egg", (class_1792)new class_1826(MobEntities.SHADOW_CREATURE, 855309, 0xFFFFFF, (class_1792.class_1793)new FabricItemSettings().maxCount(1)));
    public static final class_1792 THE_GREAT_HUNGER_SPAWN_EGG = ModItems.registerItem("the_great_hunger_spawn_egg", (class_1792)new class_1826(MobEntities.THE_GREAT_HUNGER, 598790, 1343011, (class_1792.class_1793)new FabricItemSettings().maxCount(1)));

    private static class_1792 registerItem(String name, class_1792 item) {
        return (class_1792)class_2378.method_10230((class_2378)class_7923.field_41178, (class_2960)new class_2960("hmh2", name), (Object)item);
    }

    public static void addItemsToItemGroup() {
        ModItems.addToItemGroup(ModItemGroup.ITEM, ENDCHILADA);
        ModItems.addToItemGroup(ModItemGroup.ITEM, TORTILLA);
        ModItems.addToItemGroup(ModItemGroup.ITEM, DOUGH);
        ModItems.addToItemGroup(ModItemGroup.ITEM, ENDER_CORN_SEEDS);
        ModItems.addToItemGroup(ModItemGroup.ITEM, ENDER_CORN);
        ModItems.addToItemGroup(ModItemGroup.ITEM, DISC_FRAGMENT);
        ModItems.addToItemGroup(ModItemGroup.ITEM, FORTRESS_SEEKER);
        ModItems.addToItemGroup(ModItemGroup.ITEM, SUN_STONE);
        ModItems.addToItemGroup(ModItemGroup.TESTING, REVIVAL_STONE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, GLUE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, FLOUR);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BAMBOO_BOW);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BAMBOO_SHIELD);
        ModItems.addToItemGroup(ModItemGroup.ITEM, CORK);
        ModItems.addToItemGroup(ModItemGroup.ITEM, GRAPHITE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, HEART);
        ModItems.addToItemGroup(ModItemGroup.ITEM, HELLSTONE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, LUCKY_PIECE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, QUAERITE_FRAGMENT);
        ModItems.addToItemGroup(ModItemGroup.ITEM, RAW_PLATINUM);
        ModItems.addToItemGroup(ModItemGroup.ITEM, RAW_SILVER);
        ModItems.addToItemGroup(ModItemGroup.ITEM, RAW_TIN);
        ModItems.addToItemGroup(ModItemGroup.ITEM, RAW_TITANIUM);
        ModItems.addToItemGroup(ModItemGroup.ITEM, SALT);
        ModItems.addToItemGroup(ModItemGroup.ITEM, ASHES);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BURNT_EGGSHELL);
        ModItems.addToItemGroup(ModItemGroup.ITEM, HEAVY_CREAM);
        ModItems.addToItemGroup(ModItemGroup.ITEM, PLASTIC);
        ModItems.addToItemGroup(ModItemGroup.ITEM, RESIN);
        ModItems.addToItemGroup(ModItemGroup.ITEM, PLATINUM_INGOT);
        ModItems.addToItemGroup(ModItemGroup.ITEM, SILVER_INGOT);
        ModItems.addToItemGroup(ModItemGroup.ITEM, TIN_INGOT);
        ModItems.addToItemGroup(ModItemGroup.ITEM, TITANIUM_INGOT);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BRONZE_INGOT);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BUTTER);
        ModItems.addToItemGroup(ModItemGroup.ITEM, MYSTERIOUS_WHITE_DEBRIS);
        ModItems.addToItemGroup(ModItemGroup.ITEM, MYSTERIOUS_YELLOW_DEBRIS);
        ModItems.addToItemGroup(ModItemGroup.ITEM, MYSTERIOUS_CYAN_DEBRIS);
        ModItems.addToItemGroup(ModItemGroup.ITEM, MYSTERIOUS_MAGENTA_DEBRIS);
        ModItems.addToItemGroup(ModItemGroup.ITEM, HOOF);
        ModItems.addToItemGroup(ModItemGroup.ITEM, FUR_PELT);
        ModItems.addToItemGroup(ModItemGroup.ITEM, POISON_SAC);
        ModItems.addToItemGroup(ModItemGroup.ITEM, RENNET);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BANANA_PEEL);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BONE_PLATE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, CHAINED_MESH);
        ModItems.addToItemGroup(ModItemGroup.ITEM, CLOTH);
        ModItems.addToItemGroup(ModItemGroup.ITEM, HOOF_POWDER);
        ModItems.addToItemGroup(ModItemGroup.ITEM, CONE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, ENDER_SHARD);
        ModItems.addToItemGroup(ModItemGroup.ITEM, ENDER_DUST);
        ModItems.addToItemGroup(ModItemGroup.ITEM, ENDER_INGOT);
        ModItems.addToItemGroup(ModItemGroup.ITEM, FROZEN_MILK);
        ModItems.addToItemGroup(ModItemGroup.ITEM, ITEM);
        ModItems.addToItemGroup(ModItemGroup.ITEM, OIL_BALL);
        ModItems.addToItemGroup(ModItemGroup.ITEM, PENCIL);
        ModItems.addToItemGroup(ModItemGroup.ITEM, SILK);
        ModItems.addToItemGroup(ModItemGroup.ITEM, SHEET_PAN);
        ModItems.addToItemGroup(ModItemGroup.ITEM, VEGAN_LEATHER);
        ModItems.addToItemGroup(ModItemGroup.ITEM, WOODED_DIAMOND);
        ModItems.addToItemGroup(ModItemGroup.ITEM, GRANNY_LOTION);
        ModItems.addToItemGroup(ModItemGroup.ITEM, ROSE_DYE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, ULTRAMARINE_DYE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, NEW_GREEN_DYE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, SPRING_GREEN_DYE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, VIOLET_DYE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, MIDAS_SEEDS);
        ModItems.addToItemGroup(ModItemGroup.WOODWORKS, BANANA_SIGN);
        ModItems.addToItemGroup(ModItemGroup.WOODWORKS, CHERRY_SIGN);
        ModItems.addToItemGroup(ModItemGroup.WOODWORKS, CORK_OAK_SIGN);
        ModItems.addToItemGroup(ModItemGroup.WOODWORKS, JACARANDA_SIGN);
        ModItems.addToItemGroup(ModItemGroup.WOODWORKS, MAHOE_SIGN);
        ModItems.addToItemGroup(ModItemGroup.WOODWORKS, MANGO_SIGN);
        ModItems.addToItemGroup(ModItemGroup.WOODWORKS, WILLOW_SIGN);
        ModItems.addToItemGroup(ModItemGroup.ITEM, APPLE_JUICE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, APPLE_PIE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BACON);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BANANAS);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BEEF_JERKY);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BLUEBERRIES);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BLUEBERRY_JAM);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BLUEBERRY_PIE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BURNT_TOAST);
        ModItems.addToItemGroup(ModItemGroup.ITEM, BUTTERED_TOAST);
        ModItems.addToItemGroup(ModItemGroup.ITEM, CHEESE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, CHEESE_SLICE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, CHERRIES);
        ModItems.addToItemGroup(ModItemGroup.ITEM, CHERRY_PIE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, CHICKEN_NUGGET);
        ModItems.addToItemGroup(ModItemGroup.ITEM, CHICKEN_SANDWICH);
        ModItems.addToItemGroup(ModItemGroup.ITEM, CHOCOLATE_ICE_CREAM);
        ModItems.addToItemGroup(ModItemGroup.ITEM, GOLDEN_SALMON);
        ModItems.addToItemGroup(ModItemGroup.ITEM, LIGHT_TOAST);
        ModItems.addToItemGroup(ModItemGroup.ITEM, MANGO);
        ModItems.addToItemGroup(ModItemGroup.ITEM, ORANGE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, ORANGE_JUICE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, RAW_BACON);
        ModItems.addToItemGroup(ModItemGroup.ITEM, RAW_CHICKEN_NUGGET);
        ModItems.addToItemGroup(ModItemGroup.ITEM, SLICED_BREAD);
        ModItems.addToItemGroup(ModItemGroup.ITEM, SASHIMI);
        ModItems.addToItemGroup(ModItemGroup.ITEM, STRAWBERRIES);
        ModItems.addToItemGroup(ModItemGroup.ITEM, STRAWBERRY_JAM);
        ModItems.addToItemGroup(ModItemGroup.ITEM, STRAWBERRY_PIE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, TOOTHPASTE);
        ModItems.addToItemGroup(ModItemGroup.ITEM, TOAST);
        ModItems.addToItemGroup(ModItemGroup.ITEM, CHOCOLATE_MILK);
        ModItems.addToItemGroup(ModItemGroup.ITEM, HEATED_OIL_BUCKET);
        ModItems.addToItemGroup(ModItemGroup.ITEM, HONEY_BUCKET);
        ModItems.addToItemGroup(ModItemGroup.ITEM, OIL_BUCKET);
        ModItems.addToItemGroup(ModItemGroup.ITEM, PENGUIN_SPAWN_EGG);
        ModItems.addToItemGroup(ModItemGroup.ITEM, SHADOW_CREATURE_SPAWN_EGG);
        ModItems.addToItemGroup(ModItemGroup.ITEM, THE_GREAT_HUNGER_SPAWN_EGG);
    }

    public static void addToItemGroup(class_1761 group, class_1792 item) {
        ItemGroupEvents.modifyEntriesEvent((class_1761)group).register(entries -> entries.method_45421((class_1935)item));
    }

    public static void registerModItems() {
        Hmh2.LOGGER.info("Registering Mod Items for hmh2");
        ModItems.addItemsToItemGroup();
    }
}

