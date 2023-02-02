package net.romeosnowblitz.hmh2.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.entity.MobEntities;
import net.romeosnowblitz.hmh2.entity.mob.*;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.item.WarfareItems;

import static net.romeosnowblitz.hmh2.util.MysteriousAlchemistTrades.registerMysteriousAlchemistTrades;

public class ModRegistries {

    public static void registerModStuffs() {
        registerModFuels();
        registerStrippables();
        registerFlammableBlock();
        registerCustomTrades();
        registerAttributes();
        registerMysteriousAlchemistTrades();
    }

    public static void registerModFuels() {
        System.out.println("Now registering Fuels for " + Hmh2.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
    }

    public static void registerStrippables(){
        StrippableBlockRegistry.register(WoodworkBlocks.BANANA_LOG, WoodworkBlocks.STRIPPED_BANANA_LOG);
        StrippableBlockRegistry.register(WoodworkBlocks.BANANA_WOOD, WoodworkBlocks.STRIPPED_BANANA_WOOD);
        StrippableBlockRegistry.register(WoodworkBlocks.CHERRY_LOG, WoodworkBlocks.STRIPPED_CHERRY_LOG);
        StrippableBlockRegistry.register(WoodworkBlocks.CHERRY_WOOD, WoodworkBlocks.STRIPPED_CHERRY_WOOD);
        StrippableBlockRegistry.register(WoodworkBlocks.CORK_OAK_LOG, WoodworkBlocks.STRIPPED_CORK_OAK_LOG);
        StrippableBlockRegistry.register(WoodworkBlocks.CORK_OAK_WOOD, WoodworkBlocks.STRIPPED_CORK_OAK_WOOD);
        StrippableBlockRegistry.register(WoodworkBlocks.JACARANDA_LOG, WoodworkBlocks.STRIPPED_JACARANDA_LOG);
        StrippableBlockRegistry.register(WoodworkBlocks.JACARANDA_WOOD, WoodworkBlocks.STRIPPED_JACARANDA_WOOD);
        StrippableBlockRegistry.register(WoodworkBlocks.MANGO_LOG, WoodworkBlocks.STRIPPED_MANGO_LOG);
        StrippableBlockRegistry.register(WoodworkBlocks.MANGO_WOOD, WoodworkBlocks.STRIPPED_MANGO_WOOD);
        StrippableBlockRegistry.register(WoodworkBlocks.MAHOE_LOG, WoodworkBlocks.STRIPPED_MAHOE_LOG);
        StrippableBlockRegistry.register(WoodworkBlocks.MAHOE_WOOD, WoodworkBlocks.STRIPPED_MAHOE_WOOD);
        StrippableBlockRegistry.register(WoodworkBlocks.WILLOW_LOG, WoodworkBlocks.STRIPPED_WILLOW_LOG);
        StrippableBlockRegistry.register(WoodworkBlocks.WILLOW_WOOD, WoodworkBlocks.STRIPPED_WILLOW_WOOD);
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(WoodworkBlocks.BANANA_LOG, 5, 5); instance.add(WoodworkBlocks.STRIPPED_BANANA_LOG, 5, 5);instance.add(WoodworkBlocks.BANANA_WOOD, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_BANANA_WOOD, 5, 5); instance.add(WoodworkBlocks.BANANA_PLANKS, 5, 20); instance.add(WoodworkBlocks.BANANA_LEAVES, 30, 60);
        instance.add(WoodworkBlocks.CHERRY_LOG, 5, 5); instance.add(WoodworkBlocks.STRIPPED_CHERRY_LOG, 5, 5);instance.add(WoodworkBlocks.CHERRY_WOOD, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_CHERRY_WOOD, 5, 5); instance.add(WoodworkBlocks.CHERRY_PLANKS, 5, 20); instance.add(WoodworkBlocks.CHERRY_LEAVES, 30, 60);
        instance.add(WoodworkBlocks.CORK_OAK_LOG, 5, 5); instance.add(WoodworkBlocks.STRIPPED_CORK_OAK_LOG, 5, 5);instance.add(WoodworkBlocks.CORK_OAK_WOOD, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_CORK_OAK_WOOD, 5, 5); instance.add(WoodworkBlocks.CORK_OAK_PLANKS, 5, 20); instance.add(WoodworkBlocks.CORK_OAK_LEAVES, 30, 60);
        instance.add(WoodworkBlocks.JACARANDA_LOG, 5, 5); instance.add(WoodworkBlocks.STRIPPED_JACARANDA_LOG, 5, 5); instance.add(WoodworkBlocks.JACARANDA_WOOD, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_JACARANDA_WOOD, 5, 5);instance.add(WoodworkBlocks.JACARANDA_PLANKS, 5, 20); instance.add(WoodworkBlocks.JACARANDA_LEAVES, 30, 60);
        instance.add(WoodworkBlocks.MAHOE_LOG, 5, 5); instance.add(WoodworkBlocks.STRIPPED_MAHOE_LOG, 5, 5);instance.add(WoodworkBlocks.MAHOE_WOOD, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_MAHOE_WOOD, 5, 5);instance.add(WoodworkBlocks.MAHOE_PLANKS, 5, 20); instance.add(WoodworkBlocks.MAHOE_LEAVES, 30, 60);
        instance.add(WoodworkBlocks.MANGO_LOG, 5, 5); instance.add(WoodworkBlocks.STRIPPED_MANGO_LOG, 5, 5);instance.add(WoodworkBlocks.MANGO_WOOD, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_MANGO_WOOD, 5, 5);instance.add(WoodworkBlocks.MANGO_PLANKS, 5, 20); instance.add(WoodworkBlocks.MANGO_LEAVES, 30, 60);
        instance.add(WoodworkBlocks.WILLOW_LOG, 5, 5); instance.add(WoodworkBlocks.STRIPPED_WILLOW_LOG, 5, 5);instance.add(WoodworkBlocks.WILLOW_WOOD, 5, 5);
        instance.add(WoodworkBlocks.STRIPPED_WILLOW_WOOD, 5, 5);instance.add(WoodworkBlocks.WILLOW_PLANKS, 5, 20); instance.add(WoodworkBlocks.WILLOW_LEAVES, 30, 60);
    }

    public static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers
                (VillagerProfession.FARMER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.CHERRIES, 4),
                            8,2,0.02f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.MANGO, 4),
                            8,2,0.02f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.BANANAS, 4),
                            8,2,0.02f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.ORANGE, 4),
                            8,2,0.02f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(WarfareItems.CUTLASS, 1),
                            8, 4, 0.0f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(WarfareItems.SICKEL, 1),
                            8, 4, 0.0f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(WarfareItems.SHEER_DAGGER, 1),
                            8, 4, 0.0f));
                });
    }


    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(MobEntities.PENGUIN, PenguinEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(MobEntities.QUEEN_BEE, QueenBeeEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(MobEntities.SHADOW_CREATURE, ShadowCreatureEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(MobEntities.SOLDIER_BEE, SoldierBeeEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(MobEntities.THE_GREAT_HUNGER, TheGreatHungerEntity.setAttributes());
    }


}