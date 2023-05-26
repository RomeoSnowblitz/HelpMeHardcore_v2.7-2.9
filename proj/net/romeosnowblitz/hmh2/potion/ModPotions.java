/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1802
 *  net.minecraft.class_1842
 *  net.minecraft.class_1847
 *  net.minecraft.class_2378
 *  net.minecraft.class_2960
 *  net.minecraft.class_7923
 */
package net.romeosnowblitz.hmh2.potion;

import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1802;
import net.minecraft.class_1842;
import net.minecraft.class_1847;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_7923;
import net.romeosnowblitz.hmh2.block.MagicBlocks;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.mixin.BrewingRecipeRegistryMixin;

public class ModPotions {
    public static class_1842 HASTE_POTION;
    public static class_1842 LONG_HASTE_POTION;
    public static class_1842 STRONG_HASTE_POTION;
    public static class_1842 MINING_FATIGUE_POTION;
    public static class_1842 LONG_MINING_FATIGUE_POTION;
    public static class_1842 STRONG_MINING_FATIGUE_POTION;
    public static class_1842 LEVITATION_POTION;
    public static class_1842 LONG_LEVITATION_POTION;
    public static class_1842 STRONG_LEVITATION_POTION;
    public static class_1842 BLINDNESS_POTION;
    public static class_1842 LONG_BLINDNESS_POTION;
    public static class_1842 GLOWING_POTION;
    public static class_1842 LONG_GLOWING_POTION;
    public static class_1842 BAD_LUCK_POTION;
    public static class_1842 LONG_BAD_LUCK_POTION;
    public static class_1842 STRONG_BAD_LUCK_POTION;
    public static class_1842 LUCK_POTION;
    public static class_1842 LONG_LUCK_POTION;
    public static class_1842 STRONG_LUCK_POTION;
    public static class_1842 HUNGER_POTION;
    public static class_1842 LONG_HUNGER_POTION;
    public static class_1842 STRONG_HUNGER_POTION;
    public static class_1842 SATURATION_POTION;
    public static class_1842 LONG_SATURATION_POTION;
    public static class_1842 STRONG_SATURATION_POTION;
    public static class_1842 BAD_OMEN_POTION;
    public static class_1842 LONG_BAD_OMEN_POTION;
    public static class_1842 STRONG_BAD_OMEN_POTION;
    public static class_1842 VILLAGE_HERO_POTION;
    public static class_1842 LONG_VILLAGE_HERO_POTION;
    public static class_1842 STRONG_VILLAGE_HERO_POTION;
    public static class_1842 NAUSEA_POTION;
    public static class_1842 LONG_NAUSEA_POTION;
    public static class_1842 STRONG_NAUSEA_POTION;
    public static class_1842 DOLPHINS_GRACE_POTION;
    public static class_1842 LONG_DOLPHINS_GRACE_POTION;
    public static class_1842 STRONG_DOLPHINS_GRACE_POTION;
    public static class_1842 WITHER_POTION;
    public static class_1842 LONG_WITHER_POTION;
    public static class_1842 STRONG_WITHER_POTION;
    public static class_1842 RESISTANCE_POTION;
    public static class_1842 LONG_RESISTANCE_POTION;
    public static class_1842 STRONG_RESISTANCE_POTION;
    public static class_1842 HEALTH_BOOST_POTION;
    public static class_1842 LONG_HEALTH_BOOST_POTION;
    public static class_1842 STRONG_HEALTH_BOOST_POTION;
    public static class_1842 ABSORPTION_POTION;
    public static class_1842 LONG_ABSORPTION_POTION;
    public static class_1842 STRONG_ABSORPTION_POTION;
    public static class_1842 CONDUIT_POTION;
    public static class_1842 LONG_CONDUIT_POTION;
    public static class_1842 STRONG_CONDUIT_POTION;
    public static class_1842 DARKNESS_POTION;
    public static class_1842 LONG_DARKNESS_POTION;

    public static class_1842 registerLuckPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5926, 5120, 0)}));
    }

    public static class_1842 registerLongLuckPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5926, 10240, 0)}));
    }

    public static class_1842 registerStrongLuckPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5926, 2560, 1)}));
    }

    public static class_1842 registerHastePotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5917, 5120, 0)}));
    }

    public static class_1842 registerLongHastePotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5917, 10240, 0)}));
    }

    public static class_1842 registerStrongHastePotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5917, 2560, 1)}));
    }

    public static class_1842 registerMiningFatiguePotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5901, 5120, 0)}));
    }

    public static class_1842 registerLongMiningFatiguePotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5901, 10240, 0)}));
    }

    public static class_1842 registerStrongMiningFatiguePotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5901, 2560, 1)}));
    }

    public static class_1842 registerDolphinsGracePotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5900, 5120, 0)}));
    }

    public static class_1842 registerLongDolphinsGracePotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5900, 10240, 0)}));
    }

    public static class_1842 registerStrongDolphinsGracePotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5900, 2560, 1)}));
    }

    public static class_1842 registerResistancePotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5907, 5120, 0)}));
    }

    public static class_1842 registerLongResistancePotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5907, 10240, 0)}));
    }

    public static class_1842 registerStrongResistancePotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5907, 2560, 1)}));
    }

    public static class_1842 registerConduitPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5927, 5120, 0)}));
    }

    public static class_1842 registerLongConduitPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5927, 10240, 0)}));
    }

    public static class_1842 registerStrongConduitPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5927, 2560, 1)}));
    }

    public static class_1842 registerVillageHeroPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_18980, 5120, 0)}));
    }

    public static class_1842 registerLongVillageHeroPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_18980, 10240, 0)}));
    }

    public static class_1842 registerStrongVillageHeroPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_18980, 2560, 1)}));
    }

    public static class_1842 registerHealthBoostPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5914, 5120, 0)}));
    }

    public static class_1842 registerLongHealthBoostPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5914, 10240, 0)}));
    }

    public static class_1842 registerStrongHealthBoostPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5914, 2560, 1)}));
    }

    public static class_1842 registerAbsorptionPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5898, 5120, 0)}));
    }

    public static class_1842 registerLongAbsorptionPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5898, 10240, 0)}));
    }

    public static class_1842 registerStrongAbsorptionPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5898, 2560, 1)}));
    }

    public static class_1842 registerBadLuckPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5908, 2560, 0)}));
    }

    public static class_1842 registerLongBadLuckPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5908, 5120, 0)}));
    }

    public static class_1842 registerStrongBadLuckPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5908, 1280, 1)}));
    }

    public static class_1842 registerGlowingPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5912, 2560, 0)}));
    }

    public static class_1842 registerLongGlowingPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5912, 5120, 0)}));
    }

    public static class_1842 registerNauseaPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5916, 1280, 0)}));
    }

    public static class_1842 registerLongNauseaPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5916, 2560, 0)}));
    }

    public static class_1842 registerStrongNauseaPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5916, 640, 1)}));
    }

    public static class_1842 registerLevitationPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5902, 1280, 0)}));
    }

    public static class_1842 registerLongLevitationPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5902, 2560, 0)}));
    }

    public static class_1842 registerStrongLevitationPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5902, 640, 1)}));
    }

    public static class_1842 registerBlindnessPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5919, 1280, 0)}));
    }

    public static class_1842 registerLongBlindnessPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5919, 2560, 0)}));
    }

    public static class_1842 registerHungerPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5903, 1280, 0)}));
    }

    public static class_1842 registerLongHungerPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5903, 2560, 0)}));
    }

    public static class_1842 registerStrongHungerPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5903, 640, 1)}));
    }

    public static class_1842 registerSaturationPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5922, 1280, 0)}));
    }

    public static class_1842 registerLongSaturationPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5922, 2560, 0)}));
    }

    public static class_1842 registerStrongSaturationPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5922, 640, 1)}));
    }

    public static class_1842 registerDarknessPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_38092, 1280, 0)}));
    }

    public static class_1842 registerLongDarknessPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_38092, 2560, 0)}));
    }

    public static class_1842 registerBadOmenPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_16595, 1280, 0)}));
    }

    public static class_1842 registerLongBadOmenPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_16595, 2560, 0)}));
    }

    public static class_1842 registerStrongBadOmenPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_16595, 640, 1)}));
    }

    public static class_1842 registerWitherPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5920, 1280, 0)}));
    }

    public static class_1842 registerLongWitherPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5920, 2560, 0)}));
    }

    public static class_1842 registerStrongWitherPotion(String name) {
        return (class_1842)class_2378.method_10230((class_2378)class_7923.field_41179, (class_2960)new class_2960("hmh2", name), (Object)new class_1842(new class_1293[]{new class_1293(class_1294.field_5920, 640, 1)}));
    }

    public static void registerPotions() {
        HASTE_POTION = ModPotions.registerHastePotion("haste_potion");
        LONG_HASTE_POTION = ModPotions.registerLongHastePotion("long_haste_potion");
        STRONG_HASTE_POTION = ModPotions.registerStrongHastePotion("strong_haste_potion");
        MINING_FATIGUE_POTION = ModPotions.registerMiningFatiguePotion("mining_fatigue_potion");
        LONG_MINING_FATIGUE_POTION = ModPotions.registerLongMiningFatiguePotion("long_mining_fatigue_potion");
        STRONG_MINING_FATIGUE_POTION = ModPotions.registerStrongMiningFatiguePotion("strong_mining_fatigue_potion");
        LEVITATION_POTION = ModPotions.registerLevitationPotion("levitation_potion");
        LONG_LEVITATION_POTION = ModPotions.registerLongLevitationPotion("long_levitation_potion");
        STRONG_LEVITATION_POTION = ModPotions.registerStrongLevitationPotion("strong_levitation_potion");
        BLINDNESS_POTION = ModPotions.registerBlindnessPotion("blindness_potion");
        LONG_BLINDNESS_POTION = ModPotions.registerLongBlindnessPotion("long_blindness_potion");
        GLOWING_POTION = ModPotions.registerGlowingPotion("glowing_potion");
        LONG_GLOWING_POTION = ModPotions.registerLongGlowingPotion("long_glowing_potion");
        BAD_LUCK_POTION = ModPotions.registerBadLuckPotion("bad_luck_potion");
        LONG_BAD_LUCK_POTION = ModPotions.registerLongBadLuckPotion("long_bad_luck_potion");
        STRONG_BAD_LUCK_POTION = ModPotions.registerStrongBadLuckPotion("strong_bad_luck_potion");
        LUCK_POTION = ModPotions.registerLuckPotion("luck_potion");
        LONG_LUCK_POTION = ModPotions.registerLongLuckPotion("long_luck_potion");
        STRONG_LUCK_POTION = ModPotions.registerStrongLuckPotion("strong_luck_potion");
        HUNGER_POTION = ModPotions.registerHungerPotion("hunger_potion");
        LONG_HUNGER_POTION = ModPotions.registerLongHungerPotion("long_hunger_potion");
        STRONG_HUNGER_POTION = ModPotions.registerStrongHungerPotion("strong_hunger_potion");
        SATURATION_POTION = ModPotions.registerSaturationPotion("saturation_potion");
        LONG_SATURATION_POTION = ModPotions.registerLongSaturationPotion("long_saturation_potion");
        STRONG_SATURATION_POTION = ModPotions.registerStrongSaturationPotion("strong_saturation_potion");
        BAD_OMEN_POTION = ModPotions.registerBadOmenPotion("bad_omen_potion");
        LONG_BAD_OMEN_POTION = ModPotions.registerLongBadOmenPotion("long_bad_omen_potion");
        STRONG_BAD_OMEN_POTION = ModPotions.registerStrongBadOmenPotion("strong_bad_omen_potion");
        VILLAGE_HERO_POTION = ModPotions.registerVillageHeroPotion("village_hero_potion");
        LONG_VILLAGE_HERO_POTION = ModPotions.registerLongVillageHeroPotion("long_village_hero_potion");
        STRONG_VILLAGE_HERO_POTION = ModPotions.registerStrongVillageHeroPotion("strong_village_hero_potion");
        NAUSEA_POTION = ModPotions.registerNauseaPotion("nausea_potion");
        LONG_NAUSEA_POTION = ModPotions.registerLongNauseaPotion("long_nausea_potion");
        STRONG_NAUSEA_POTION = ModPotions.registerStrongNauseaPotion("strong_nausea_potion");
        DOLPHINS_GRACE_POTION = ModPotions.registerDolphinsGracePotion("dolphins_grace_potion");
        LONG_DOLPHINS_GRACE_POTION = ModPotions.registerLongDolphinsGracePotion("long_dolphins_grace_potion");
        STRONG_DOLPHINS_GRACE_POTION = ModPotions.registerStrongDolphinsGracePotion("strong_dolphins_grace_potion");
        WITHER_POTION = ModPotions.registerWitherPotion("wither_potion");
        LONG_WITHER_POTION = ModPotions.registerLongWitherPotion("long_wither_potion");
        STRONG_WITHER_POTION = ModPotions.registerStrongWitherPotion("strong_wither_potion");
        RESISTANCE_POTION = ModPotions.registerResistancePotion("resistance_potion");
        LONG_RESISTANCE_POTION = ModPotions.registerLongResistancePotion("long_resistance_potion");
        STRONG_RESISTANCE_POTION = ModPotions.registerStrongResistancePotion("strong_resistance_potion");
        HEALTH_BOOST_POTION = ModPotions.registerHealthBoostPotion("health_boost_potion");
        LONG_HEALTH_BOOST_POTION = ModPotions.registerLongHealthBoostPotion("long_health_boost_potion");
        STRONG_HEALTH_BOOST_POTION = ModPotions.registerStrongHealthBoostPotion("strong_health_boost_potion");
        ABSORPTION_POTION = ModPotions.registerAbsorptionPotion("absorption_potion");
        LONG_ABSORPTION_POTION = ModPotions.registerLongAbsorptionPotion("long_absorption_potion");
        STRONG_ABSORPTION_POTION = ModPotions.registerStrongAbsorptionPotion("strong_absorption_potion");
        CONDUIT_POTION = ModPotions.registerConduitPotion("conduit_potion");
        LONG_CONDUIT_POTION = ModPotions.registerLongConduitPotion("long_conduit_potion");
        STRONG_CONDUIT_POTION = ModPotions.registerStrongConduitPotion("strong_conduit_potion");
        DARKNESS_POTION = ModPotions.registerDarknessPotion("darkness_potion");
        LONG_DARKNESS_POTION = ModPotions.registerLongDarknessPotion("long_darkness_potion");
        ModPotions.registerPotionRecipes();
    }

    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, class_1802.field_8281, MINING_FATIGUE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(MINING_FATIGUE_POTION, class_1802.field_8725, LONG_MINING_FATIGUE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(MINING_FATIGUE_POTION, class_1802.field_8801, STRONG_MINING_FATIGUE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(MINING_FATIGUE_POTION, class_1802.field_8695, HASTE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(HASTE_POTION, class_1802.field_8725, LONG_HASTE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(HASTE_POTION, class_1802.field_8801, STRONG_HASTE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8974, class_1802.field_8634, LEVITATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(LEVITATION_POTION, class_1802.field_8725, LONG_LEVITATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(LEVITATION_POTION, class_1802.field_8801, STRONG_LEVITATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, class_1802.field_8791, BLINDNESS_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(BLINDNESS_POTION, class_1802.field_8725, LONG_BLINDNESS_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(BLINDNESS_POTION, class_1802.field_8801, GLOWING_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(GLOWING_POTION, class_1802.field_8725, LONG_GLOWING_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, class_1802.field_16315, BAD_LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(BAD_LUCK_POTION, class_1802.field_8725, LONG_BAD_LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(BAD_LUCK_POTION, class_1802.field_8801, STRONG_BAD_LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(BAD_LUCK_POTION, class_1802.field_8449, LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(LUCK_POTION, class_1802.field_8725, LONG_LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(LUCK_POTION, class_1802.field_8801, STRONG_LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, class_1802.field_8511, HUNGER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(HUNGER_POTION, class_1802.field_8725, LONG_HUNGER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(HUNGER_POTION, class_1802.field_8801, STRONG_HUNGER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(HUNGER_POTION, class_1802.field_17499, SATURATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(SATURATION_POTION, class_1802.field_8725, LONG_SATURATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(SATURATION_POTION, class_1802.field_8801, STRONG_SATURATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, class_1802.field_17520, BAD_OMEN_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(BAD_OMEN_POTION, class_1802.field_8725, LONG_BAD_OMEN_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(BAD_OMEN_POTION, class_1802.field_8801, STRONG_BAD_OMEN_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(BAD_OMEN_POTION, class_1802.field_8733, VILLAGE_HERO_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(VILLAGE_HERO_POTION, class_1802.field_8725, LONG_VILLAGE_HERO_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(VILLAGE_HERO_POTION, class_1802.field_8801, STRONG_VILLAGE_HERO_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, class_1802.field_8554, NAUSEA_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(NAUSEA_POTION, class_1802.field_8725, LONG_NAUSEA_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(NAUSEA_POTION, class_1802.field_8801, STRONG_NAUSEA_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(NAUSEA_POTION, class_1802.field_8662, DOLPHINS_GRACE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(DOLPHINS_GRACE_POTION, class_1802.field_8725, LONG_DOLPHINS_GRACE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(DOLPHINS_GRACE_POTION, class_1802.field_8801, STRONG_DOLPHINS_GRACE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8986, class_1802.field_22021, WITHER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(WITHER_POTION, class_1802.field_8725, LONG_WITHER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(WITHER_POTION, class_1802.field_8801, STRONG_WITHER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, class_1802.field_8790, RESISTANCE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(RESISTANCE_POTION, class_1802.field_8725, LONG_RESISTANCE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(RESISTANCE_POTION, class_1802.field_8801, STRONG_RESISTANCE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, class_1802.field_21086, HEALTH_BOOST_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(HEALTH_BOOST_POTION, class_1802.field_8725, LONG_HEALTH_BOOST_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(HEALTH_BOOST_POTION, class_1802.field_8801, STRONG_HEALTH_BOOST_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, ModItems.HEART, ABSORPTION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ABSORPTION_POTION, class_1802.field_8725, LONG_ABSORPTION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ABSORPTION_POTION, class_1802.field_8801, STRONG_ABSORPTION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, class_1802.field_8864, CONDUIT_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(CONDUIT_POTION, class_1802.field_8725, LONG_CONDUIT_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(CONDUIT_POTION, class_1802.field_8801, STRONG_CONDUIT_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.AMBER_DUST.method_8389(), class_1847.field_8987);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.ANDALUSITE_DUST.method_8389(), MINING_FATIGUE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.AQUAMARINE_DUST.method_8389(), DOLPHINS_GRACE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.CITRINE_DUST.method_8389(), HEALTH_BOOST_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.DIOPSIDE_DUST.method_8389(), BAD_OMEN_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.GARNET_DUST.method_8389(), class_1847.field_9004);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.HESSONITE_DUST.method_8389(), class_1847.field_8978);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.MALICHITE_DUST.method_8389(), HUNGER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.MOONSTONE_DUST.method_8389(), class_1847.field_8996);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.OPAL_DUST.method_8389(), CONDUIT_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.PERIDOT_DUST.method_8389(), class_1847.field_8979);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.PREHNITE_DUST.method_8389(), class_1847.field_8982);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.RUBY_DUST.method_8389(), SATURATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.SAPPHIRE_DUST.method_8389(), class_1847.field_8968);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.SMOKY_QUARTZ_DUST.method_8389(), WITHER_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.SPESSARITE_DUST.method_8389(), class_1847.field_8963);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.SPHENE_DUST.method_8389(), LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.SPINEL_DUST.method_8389(), RESISTANCE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.TANZANITE_DUST.method_8389(), class_1847.field_8994);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.TOPAZ_DUST.method_8389(), BAD_LUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.TORMALINE_DUST.method_8389(), class_1847.field_8986);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.TSAVORITE_DUST.method_8389(), GLOWING_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.ZIRCON_DUST.method_8389(), class_1847.field_8974);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.AMETHYST_DUST.method_8389(), NAUSEA_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.CHARCOAL_DUST.method_8389(), class_1847.field_8975);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.COAL_DUST.method_8389(), DARKNESS_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.COPPER_DUST.method_8389(), LEVITATION_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.DIAMOND_DUST.method_8389(), class_1847.field_9005);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.EMERALD_DUST.method_8389(), VILLAGE_HERO_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.FLINT_DUST.method_8389(), BLINDNESS_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.GOLD_DUST.method_8389(), HASTE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.IRON_DUST.method_8389(), class_1847.field_8997);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(class_1847.field_8999, MagicBlocks.LAPIS_DUST.method_8389(), ABSORPTION_POTION);
    }
}

