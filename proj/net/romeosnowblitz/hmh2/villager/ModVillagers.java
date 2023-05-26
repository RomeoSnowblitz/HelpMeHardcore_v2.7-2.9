/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder
 *  net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper
 *  net.minecraft.class_2248
 *  net.minecraft.class_2378
 *  net.minecraft.class_2960
 *  net.minecraft.class_3417
 *  net.minecraft.class_3852
 *  net.minecraft.class_4158
 *  net.minecraft.class_5321
 *  net.minecraft.class_7923
 */
package net.romeosnowblitz.hmh2.villager;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.class_2248;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_3417;
import net.minecraft.class_3852;
import net.minecraft.class_4158;
import net.minecraft.class_5321;
import net.minecraft.class_7923;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.util.MysteriousAlchemistTrades;

public class ModVillagers {
    public static final class_4158 MYSTERIOUS_POI = ModVillagers.registerPOI("mysterious_poi", ModBlocks.BLOCK);
    public static final class_3852 MYSTERIOUS_ALCHEMIST = ModVillagers.registerProfession("mysterious_alchemist", (class_5321<class_4158>)class_5321.method_29179((class_5321)class_7923.field_41128.method_30517(), (class_2960)new class_2960("hmh2", "mysterious_poi")));

    public static class_3852 registerProfession(String name, class_5321<class_4158> type) {
        return (class_3852)class_2378.method_10230((class_2378)class_7923.field_41195, (class_2960)new class_2960("hmh2", name), (Object)VillagerProfessionBuilder.create().id(new class_2960("hmh2", name)).workstation(type).workSound(class_3417.field_20669).build());
    }

    public static class_4158 registerPOI(String name, class_2248 block) {
        return PointOfInterestHelper.register((class_2960)new class_2960("hmh2", name), (int)1, (int)1, (Iterable)ImmutableSet.copyOf((Collection)block.method_9595().method_11662()));
    }

    public static void registerVillagers() {
        Hmh2.LOGGER.debug("Registering Villagers for hmh2");
    }

    public static void registerVillagerTrades() {
        MysteriousAlchemistTrades.registerMysteriousAlchemistTrades();
    }
}

