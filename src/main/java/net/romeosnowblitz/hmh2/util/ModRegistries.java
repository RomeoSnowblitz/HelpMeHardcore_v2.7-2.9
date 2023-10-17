package net.romeosnowblitz.hmh2.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ColoringBlocks;
import net.romeosnowblitz.hmh2.block.DecorationBlocks;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.entity.blazing_inferno.BlazingInfernoEntity;
import net.romeosnowblitz.hmh2.entity.cal.CalEntity;
import net.romeosnowblitz.hmh2.entity.lost_soul.LostSoulEntity;
import net.romeosnowblitz.hmh2.entity.mites.ashmite.AshmiteEntity;
import net.romeosnowblitz.hmh2.entity.mites.bloodmite.BloodmiteEntity;
import net.romeosnowblitz.hmh2.entity.mites.hellmite.HellmiteEntity;
import net.romeosnowblitz.hmh2.entity.mites.magmite.MagmiteEntity;
import net.romeosnowblitz.hmh2.entity.mites.warpmite.WarpmiteEntity;
import net.romeosnowblitz.hmh2.entity.penguin.PenguinEntity;
import net.romeosnowblitz.hmh2.entity.mites.sculkmite.SculkmiteEntity;
import net.romeosnowblitz.hmh2.entity.soldier_bee.SoldierBeeEntity;
import net.romeosnowblitz.hmh2.entity.queen_bee.QueenBeeEntity;
import net.romeosnowblitz.hmh2.entity.shadow_creature.ShadowCreatureEntity;
import net.romeosnowblitz.hmh2.entity.the_great_hunger.TheGreatHungerEntity;
import net.romeosnowblitz.hmh2.entity.wisp.WispEntity;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.item.SustenanceItems;
import net.romeosnowblitz.hmh2.item.WarfareItems;
import net.romeosnowblitz.hmh2.tag.ModItemTags;
import static net.romeosnowblitz.hmh2.util.MysteriousAlchemistTrades.registerMysteriousAlchemistTrades;

public class ModRegistries {

    public static void registerModStuffs() {
        registerModFuels();
        registerStrippables();
        registerFlammableBlock();
        registerCustomTrades();
        registerAttributes();
        registerMysteriousAlchemistTrades();
        registerModCompostables();
    }

    public static void registerModFuels() {
        System.out.println("Now registering Fuels for " + Hmh2.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItemTags.FUEL_ONE_HUNDRED, 100);
        registry.add(ModItemTags.FUEL_THREE_HUNDRED, 300);
        registry.add(ModItemTags.FUEL_SIXTEEN_THOUSAND, 16000);
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

        //FlattenableBlockRegistry.register(Blocks.STONE, Blocks.DIRT_PATH.getDefaultState());
        //OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.BEEF_BLOCK, ModBlocks.CHICKEN_BLOCK);
        //OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.ANDESITE_BRICKS, ModBlocks.DIORITE_BRICKS);
        instance.add(WoodworkBlocks.BANANA_LOG, 5, 5);instance.add(WoodworkBlocks.STRIPPED_BANANA_LOG, 5, 5);instance.add(WoodworkBlocks.BANANA_WOOD, 5, 5);
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
                            new ItemStack(SustenanceItems.CHERRIES, 4),
                            8,2,0.02f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(SustenanceItems.MANGO, 4),
                            8,2,0.02f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(SustenanceItems.BANANAS, 4),
                            8,2,0.02f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(SustenanceItems.ORANGE, 4),
                            8,2,0.02f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH,2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 10),
                        new ItemStack(WarfareItems.CUTLASS, 1),
                        8, 4, 0.0f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH,3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(WarfareItems.SICKEL, 1),
                            8, 4, 0.0f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD,5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(WarfareItems.SHEER_DAGGER, 1),
                            8, 4, 0.0f)));
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.ASHMITE, AshmiteEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.BLAZING_INFERNO, BlazingInfernoEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.BLOODMITE, BloodmiteEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.CAL, CalEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.DEMON, CalEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.HEADLESS_HORSEMAN, HellmiteEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.HELLMITE, HellmiteEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.LOST_SOUL, LostSoulEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.MAGMITE, MagmiteEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.PENGUIN, PenguinEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.QUEEN_BEE, QueenBeeEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.SCULKMITE, SculkmiteEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.SHADOW_CREATURE, ShadowCreatureEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.SOLDIER_BEE, SoldierBeeEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.THE_GREAT_HUNGER, TheGreatHungerEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.WARPMITE, WarpmiteEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.WISP, WispEntity.setAttributes());
    }

    private static void registerModCompostables(){
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ASHES, 0.1f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.BURNT_EGGSHELL, 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.BURNT_TOAST, 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.HOOF_POWDER, 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.CHEESE_SLICE, 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.RENNET, 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.FLOUR, 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.BUTTER, 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ENDER_CORN_SEEDS, 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.SLICED_BREAD, 0.5F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.LIGHT_TOAST, 0.5F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORK, 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.BANANAS, 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.BLUEBERRIES, 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.CHEESE, 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.CHERRIES, 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CONE, 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.TOAST, 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.MANGO, 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.ORANGE, 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.STRAWBERRIES, 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.CHOCOLATE_ICE_CREAM, 0.85F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.BLUEBERRY_JAM, 0.85F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.STRAWBERRY_JAM, 0.85F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(SustenanceItems.BUTTERED_TOAST, 0.85F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WarfareItems.BANANA_HELMET, 1.0F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WarfareItems.BANANA_CHESTPLATE, 1.0F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WarfareItems.BANANA_LEGGINGS, 1.0F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WarfareItems.BANANA_BOOTS, 1.0F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WarfareItems.BANANA_HORSE_ARMOR, 1.0F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WarfareItems.BANANA_PICKAXE, 1.0F);
        //Blocks can not be Composter???
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WoodworkBlocks.BANANA_SAPLING.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WoodworkBlocks.CHERRY_SAPLING.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WoodworkBlocks.CORK_OAK_SAPLING.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WoodworkBlocks.JACARANDA_SAPLING.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WoodworkBlocks.MAHOE_SAPLING.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WoodworkBlocks.MANGO_SAPLING.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WoodworkBlocks.WILLOW_SAPLING.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WoodworkBlocks.BANANA_LEAVES.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WoodworkBlocks.CHERRY_LEAVES.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WoodworkBlocks.CORK_OAK_LEAVES.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WoodworkBlocks.JACARANDA_LEAVES.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WoodworkBlocks.MAHOE_LEAVES.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WoodworkBlocks.MANGO_LEAVES.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(WoodworkBlocks.WILLOW_LEAVES.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.POISON_GRASS.asItem(), 0.3F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.BANANA_PEEL.asItem(), 0.5F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ColoringBlocks.BLUE_SPIDER_LILY.asItem(), 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ColoringBlocks.ROSE.asItem(), 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ColoringBlocks.WOLFSBANE.asItem(), 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.CARVED_MELON.asItem(), 0.65F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.PEAT.asItem(), 1.0F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(DecorationBlocks.CORK_BLOCK.asItem(), 1.0F);
    }
}