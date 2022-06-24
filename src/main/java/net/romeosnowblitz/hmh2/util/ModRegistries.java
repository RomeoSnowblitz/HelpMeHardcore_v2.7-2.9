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
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.entity.custom.PenguinEntity;
import net.romeosnowblitz.hmh2.item.ModItems;

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

        registry.add(ModItems.BANANA_PEEL, 200);
        registry.add(ModItems.HELLSTONE, 2000);
    }

    public static void registerStrippables(){
        StrippableBlockRegistry.register(ModBlocks.BANANA_LOG, ModBlocks.STRIPPED_BANANA_LOG);
        StrippableBlockRegistry.register(ModBlocks.BANANA_WOOD, ModBlocks.STRIPPED_BANANA_WOOD);
        StrippableBlockRegistry.register(ModBlocks.CHERRY_LOG, ModBlocks.STRIPPED_CHERRY_LOG);
        StrippableBlockRegistry.register(ModBlocks.CHERRY_WOOD, ModBlocks.STRIPPED_CHERRY_WOOD);
        StrippableBlockRegistry.register(ModBlocks.JACARANDA_LOG, ModBlocks.STRIPPED_JACARANDA_LOG);
        StrippableBlockRegistry.register(ModBlocks.JACARANDA_WOOD, ModBlocks.STRIPPED_JACARANDA_WOOD);
        StrippableBlockRegistry.register(ModBlocks.MANGO_LOG, ModBlocks.STRIPPED_MANGO_LOG);
        StrippableBlockRegistry.register(ModBlocks.MANGO_WOOD, ModBlocks.STRIPPED_MANGO_WOOD);
        StrippableBlockRegistry.register(ModBlocks.MAHOE_LOG, ModBlocks.STRIPPED_MAHOE_LOG);
        StrippableBlockRegistry.register(ModBlocks.MAHOE_WOOD, ModBlocks.STRIPPED_MAHOE_WOOD);
        StrippableBlockRegistry.register(ModBlocks.WILLOW_LOG, ModBlocks.STRIPPED_WILLOW_LOG);
        StrippableBlockRegistry.register(ModBlocks.WILLOW_WOOD, ModBlocks.STRIPPED_WILLOW_WOOD);
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.BANANA_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_BANANA_LOG, 5, 5);
        instance.add(ModBlocks.BANANA_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_BANANA_WOOD, 5, 5);
        instance.add(ModBlocks.BANANA_PLANKS, 5, 20);
        instance.add(ModBlocks.BANANA_LEAVES, 30, 60);

        instance.add(ModBlocks.MANGO_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_MANGO_LOG, 5, 5);
        instance.add(ModBlocks.MANGO_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_MANGO_WOOD, 5, 5);
        instance.add(ModBlocks.MANGO_PLANKS, 5, 20);
        instance.add(ModBlocks.MANGO_LEAVES, 30, 60);
    }

    public static void registerCustomTrades(){
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
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
    }


    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.PENGUIN, PenguinEntity.setAttributes());
    }


}