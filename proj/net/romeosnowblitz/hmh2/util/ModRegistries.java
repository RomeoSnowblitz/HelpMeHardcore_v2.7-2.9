/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry
 *  net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper
 *  net.fabricmc.fabric.api.registry.FlammableBlockRegistry
 *  net.fabricmc.fabric.api.registry.StrippableBlockRegistry
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1914
 *  net.minecraft.class_1935
 *  net.minecraft.class_2248
 *  net.minecraft.class_3852
 *  net.minecraft.class_5132$class_5133
 */
package net.romeosnowblitz.hmh2.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1914;
import net.minecraft.class_1935;
import net.minecraft.class_2248;
import net.minecraft.class_3852;
import net.minecraft.class_5132;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.entity.MobEntities;
import net.romeosnowblitz.hmh2.entity.mob.CalEntity;
import net.romeosnowblitz.hmh2.entity.mob.HellmiteEntity;
import net.romeosnowblitz.hmh2.entity.mob.MagmiteEntity;
import net.romeosnowblitz.hmh2.entity.mob.PenguinEntity;
import net.romeosnowblitz.hmh2.entity.mob.QueenBeeEntity;
import net.romeosnowblitz.hmh2.entity.mob.SculkmiteEntity;
import net.romeosnowblitz.hmh2.entity.mob.ShadowCreatureEntity;
import net.romeosnowblitz.hmh2.entity.mob.SoldierBeeEntity;
import net.romeosnowblitz.hmh2.entity.mob.TheGreatHungerEntity;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.item.WarfareItems;
import net.romeosnowblitz.hmh2.util.MysteriousAlchemistTrades;

public class ModRegistries {
    public static void registerModStuffs() {
        ModRegistries.registerStrippables();
        ModRegistries.registerFlammableBlock();
        ModRegistries.registerCustomTrades();
        ModRegistries.registerAttributes();
        MysteriousAlchemistTrades.registerMysteriousAlchemistTrades();
    }

    public static void registerStrippables() {
        StrippableBlockRegistry.register((class_2248)WoodworkBlocks.BANANA_LOG, (class_2248)WoodworkBlocks.STRIPPED_BANANA_LOG);
        StrippableBlockRegistry.register((class_2248)WoodworkBlocks.BANANA_WOOD, (class_2248)WoodworkBlocks.STRIPPED_BANANA_WOOD);
        StrippableBlockRegistry.register((class_2248)WoodworkBlocks.CHERRY_LOG, (class_2248)WoodworkBlocks.STRIPPED_CHERRY_LOG);
        StrippableBlockRegistry.register((class_2248)WoodworkBlocks.CHERRY_WOOD, (class_2248)WoodworkBlocks.STRIPPED_CHERRY_WOOD);
        StrippableBlockRegistry.register((class_2248)WoodworkBlocks.CORK_OAK_LOG, (class_2248)WoodworkBlocks.STRIPPED_CORK_OAK_LOG);
        StrippableBlockRegistry.register((class_2248)WoodworkBlocks.CORK_OAK_WOOD, (class_2248)WoodworkBlocks.STRIPPED_CORK_OAK_WOOD);
        StrippableBlockRegistry.register((class_2248)WoodworkBlocks.JACARANDA_LOG, (class_2248)WoodworkBlocks.STRIPPED_JACARANDA_LOG);
        StrippableBlockRegistry.register((class_2248)WoodworkBlocks.JACARANDA_WOOD, (class_2248)WoodworkBlocks.STRIPPED_JACARANDA_WOOD);
        StrippableBlockRegistry.register((class_2248)WoodworkBlocks.MANGO_LOG, (class_2248)WoodworkBlocks.STRIPPED_MANGO_LOG);
        StrippableBlockRegistry.register((class_2248)WoodworkBlocks.MANGO_WOOD, (class_2248)WoodworkBlocks.STRIPPED_MANGO_WOOD);
        StrippableBlockRegistry.register((class_2248)WoodworkBlocks.MAHOE_LOG, (class_2248)WoodworkBlocks.STRIPPED_MAHOE_LOG);
        StrippableBlockRegistry.register((class_2248)WoodworkBlocks.MAHOE_WOOD, (class_2248)WoodworkBlocks.STRIPPED_MAHOE_WOOD);
        StrippableBlockRegistry.register((class_2248)WoodworkBlocks.WILLOW_LOG, (class_2248)WoodworkBlocks.STRIPPED_WILLOW_LOG);
        StrippableBlockRegistry.register((class_2248)WoodworkBlocks.WILLOW_WOOD, (class_2248)WoodworkBlocks.STRIPPED_WILLOW_WOOD);
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();
        instance.add(WoodworkBlocks.BANANA_LOG, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_BANANA_LOG, 5, 5);
        instance.add(WoodworkBlocks.BANANA_WOOD, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_BANANA_WOOD, 5, 5);
        instance.add(WoodworkBlocks.BANANA_PLANKS, 5, 20);
        instance.add(WoodworkBlocks.BANANA_LEAVES, 30, 60);
        instance.add(WoodworkBlocks.CHERRY_LOG, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_CHERRY_LOG, 5, 5);
        instance.add(WoodworkBlocks.CHERRY_WOOD, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_CHERRY_WOOD, 5, 5);
        instance.add(WoodworkBlocks.CHERRY_PLANKS, 5, 20);
        instance.add(WoodworkBlocks.CHERRY_LEAVES, 30, 60);
        instance.add(WoodworkBlocks.CORK_OAK_LOG, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_CORK_OAK_LOG, 5, 5);
        instance.add(WoodworkBlocks.CORK_OAK_WOOD, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_CORK_OAK_WOOD, 5, 5);
        instance.add(WoodworkBlocks.CORK_OAK_PLANKS, 5, 20);
        instance.add(WoodworkBlocks.CORK_OAK_LEAVES, 30, 60);
        instance.add(WoodworkBlocks.JACARANDA_LOG, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_JACARANDA_LOG, 5, 5);
        instance.add(WoodworkBlocks.JACARANDA_WOOD, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_JACARANDA_WOOD, 5, 5);
        instance.add(WoodworkBlocks.JACARANDA_PLANKS, 5, 20);
        instance.add(WoodworkBlocks.JACARANDA_LEAVES, 30, 60);
        instance.add(WoodworkBlocks.MAHOE_LOG, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_MAHOE_LOG, 5, 5);
        instance.add(WoodworkBlocks.MAHOE_WOOD, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_MAHOE_WOOD, 5, 5);
        instance.add(WoodworkBlocks.MAHOE_PLANKS, 5, 20);
        instance.add(WoodworkBlocks.MAHOE_LEAVES, 30, 60);
        instance.add(WoodworkBlocks.MANGO_LOG, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_MANGO_LOG, 5, 5);
        instance.add(WoodworkBlocks.MANGO_WOOD, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_MANGO_WOOD, 5, 5);
        instance.add(WoodworkBlocks.MANGO_PLANKS, 5, 20);
        instance.add(WoodworkBlocks.MANGO_LEAVES, 30, 60);
        instance.add(WoodworkBlocks.WILLOW_LOG, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_WILLOW_LOG, 5, 5);
        instance.add(WoodworkBlocks.WILLOW_WOOD, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_WILLOW_WOOD, 5, 5);
        instance.add(WoodworkBlocks.WILLOW_PLANKS, 5, 20);
        instance.add(WoodworkBlocks.WILLOW_LEAVES, 30, 60);
    }

    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers((class_3852)class_3852.field_17056, (int)1, factories -> {
            factories.add((entity, random) -> new class_1914(new class_1799((class_1935)class_1802.field_8687, 2), new class_1799((class_1935)ModItems.CHERRIES, 4), 8, 2, 0.02f));
            factories.add((entity, random) -> new class_1914(new class_1799((class_1935)class_1802.field_8687, 2), new class_1799((class_1935)ModItems.MANGO, 4), 8, 2, 0.02f));
            factories.add((entity, random) -> new class_1914(new class_1799((class_1935)class_1802.field_8687, 2), new class_1799((class_1935)ModItems.BANANAS, 4), 8, 2, 0.02f));
            factories.add((entity, random) -> new class_1914(new class_1799((class_1935)class_1802.field_8687, 2), new class_1799((class_1935)ModItems.ORANGE, 4), 8, 2, 0.02f));
        });
        TradeOfferHelper.registerVillagerOffers((class_3852)class_3852.field_17065, (int)2, factories -> factories.add((entity, random) -> new class_1914(new class_1799((class_1935)class_1802.field_8687, 10), new class_1799((class_1935)WarfareItems.CUTLASS, 1), 8, 4, 0.0f)));
        TradeOfferHelper.registerVillagerOffers((class_3852)class_3852.field_17065, (int)3, factories -> factories.add((entity, random) -> new class_1914(new class_1799((class_1935)class_1802.field_8687, 15), new class_1799((class_1935)WarfareItems.SICKEL, 1), 8, 4, 0.0f)));
        TradeOfferHelper.registerVillagerOffers((class_3852)class_3852.field_17063, (int)5, factories -> factories.add((entity, random) -> new class_1914(new class_1799((class_1935)class_1802.field_8687, 20), new class_1799((class_1935)WarfareItems.SHEER_DAGGER, 1), 8, 4, 0.0f)));
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(MobEntities.PENGUIN, (class_5132.class_5133)PenguinEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(MobEntities.QUEEN_BEE, (class_5132.class_5133)QueenBeeEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(MobEntities.SHADOW_CREATURE, (class_5132.class_5133)ShadowCreatureEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(MobEntities.SOLDIER_BEE, (class_5132.class_5133)SoldierBeeEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(MobEntities.THE_GREAT_HUNGER, (class_5132.class_5133)TheGreatHungerEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(MobEntities.HELLMITE, (class_5132.class_5133)HellmiteEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(MobEntities.MAGMITE, (class_5132.class_5133)MagmiteEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(MobEntities.CAL, (class_5132.class_5133)CalEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(MobEntities.SCULKMITE, (class_5132.class_5133)SculkmiteEntity.setAttributes());
    }
}

