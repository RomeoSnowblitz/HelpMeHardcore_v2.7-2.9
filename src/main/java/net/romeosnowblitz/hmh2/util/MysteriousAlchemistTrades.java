package net.romeosnowblitz.hmh2.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.MagicBlocks;
import net.romeosnowblitz.hmh2.item.MagicItems;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.item.WarfareItems;
import net.romeosnowblitz.hmh2.villager.ModVillagers;

public class MysteriousAlchemistTrades extends ModRegistries{

    public static void registerMysteriousAlchemistTrades(){

        TradeOfferHelper.registerVillagerOffers(ModVillagers.MYSTERIOUS_ALCHEMIST,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PIGLIN_BANNER_PATTERN, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PIGLIN_BANNER_PATTERN, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GILDED_BLACKSTONE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.GILDED_BLACKSTONE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LARGE_FERN, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.LARGE_FERN, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.TALL_GRASS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.TALL_GRASS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEAD_BUSH, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEAD_BUSH, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SPONGE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SPONGE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.WET_SPONGE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.WET_SPONGE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SPORE_BLOSSOM, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SPORE_BLOSSOM, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BUDDING_AMETHYST, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.BUDDING_AMETHYST, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.INFESTED_CHISELED_STONE_BRICKS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.INFESTED_CHISELED_STONE_BRICKS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.INFESTED_COBBLESTONE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.INFESTED_COBBLESTONE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.INFESTED_CRACKED_STONE_BRICKS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.INFESTED_CRACKED_STONE_BRICKS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.INFESTED_DEEPSLATE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.INFESTED_DEEPSLATE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.INFESTED_STONE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.INFESTED_STONE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.INFESTED_MOSSY_STONE_BRICKS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.INFESTED_MOSSY_STONE_BRICKS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.INFESTED_STONE_BRICKS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.INFESTED_STONE_BRICKS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SCULK_SENSOR, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SCULK_SENSOR, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.POTION, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.POTION, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_SCRAP, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHERITE_SCRAP, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_INGOT, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHERITE_INGOT, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_HELMET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHERITE_HELMET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_CHESTPLATE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHERITE_CHESTPLATE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_LEGGINGS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHERITE_LEGGINGS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_BOOTS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHERITE_BOOTS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_SWORD, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHERITE_SWORD, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_PICKAXE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHERITE_PICKAXE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_AXE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHERITE_AXE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_SHOVEL, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHERITE_SHOVEL, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_HOE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHERITE_HOE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LODESTONE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.LODESTONE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_DIAMOND_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_DIAMOND_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_EMERALD_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_EMERALD_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHER_GOLD_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHER_GOLD_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHER_QUARTZ_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHER_QUARTZ_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_COAL_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_COAL_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_IRON_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_IRON_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_REDSTONE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_REDSTONE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_LAPIS_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_LAPIS_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_GOLD_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_GOLD_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_COPPER_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_COPPER_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DIAMOND, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ENCHANTING_TABLE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ENCHANTING_TABLE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.JUKEBOX, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.JUKEBOX, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DIAMOND_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.EMERALD_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COAL_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.COAL_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.IRON_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.REDSTONE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.REDSTONE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LAPIS_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.LAPIS_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.GOLD_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COPPER_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.COPPER_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.RAW_COPPER, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.RAW_COPPER, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.RAW_GOLD, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.RAW_GOLD, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.RAW_IRON, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.RAW_IRON, 1),
                            64,16,0.0f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.MYSTERIOUS_ALCHEMIST,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.AXOLOTL_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.AXOLOTL_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BAT_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.BAT_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BEE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.BEE_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BLAZE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.BLAZE_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.CAT_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.CAT_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.CAVE_SPIDER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.CAVE_SPIDER_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.CHICKEN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.CHICKEN_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COD_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.COD_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COW_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.COW_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.CREEPER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.CREEPER_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DOLPHIN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DOLPHIN_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DONKEY_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DROWNED_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DROWNED_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ELDER_GUARDIAN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ELDER_GUARDIAN_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ENDERMAN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ENDERMAN_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ENDERMITE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ENDERMITE_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EVOKER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.EVOKER_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.FOX_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.FOX_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GHAST_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.GHAST_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GLOW_SQUID_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.GLOW_SQUID_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOAT_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.GOAT_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GUARDIAN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.GUARDIAN_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.HOGLIN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.HOGLIN_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.HORSE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.HORSE_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.HUSK_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.HUSK_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LLAMA_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.LLAMA_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.MAGMA_CUBE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.MAGMA_CUBE_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.MOOSHROOM_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.MOOSHROOM_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.MULE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.MULE_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.OCELOT_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.OCELOT_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PANDA_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PANDA_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PARROT_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PARROT_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PHANTOM_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PHANTOM_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PIG_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PIG_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PIGLIN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PIGLIN_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PIGLIN_BRUTE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PIGLIN_BRUTE_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PILLAGER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PILLAGER_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.POLAR_BEAR_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.POLAR_BEAR_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PUFFERFISH_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PUFFERFISH_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.RABBIT_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.RABBIT_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.RAVAGER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.RAVAGER_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SALMON_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SALMON_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SHEEP_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SHEEP_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SHULKER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SHULKER_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SILVERFISH_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SILVERFISH_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SKELETON_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SKELETON_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SKELETON_HORSE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SKELETON_HORSE_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SLIME_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SLIME_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SPIDER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SPIDER_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SQUID_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SQUID_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.STRAY_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.STRAY_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.STRIDER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.STRIDER_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.TRADER_LLAMA_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.TRADER_LLAMA_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.TROPICAL_FISH_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.TROPICAL_FISH_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.TURTLE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.TURTLE_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.VEX_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.VEX_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.VILLAGER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.VILLAGER_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.VINDICATOR_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.VINDICATOR_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.WANDERING_TRADER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.WANDERING_TRADER_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.WITCH_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.WITCH_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.WITHER_SKELETON_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.WITHER_SKELETON_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.WOLF_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.WOLF_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ZOGLIN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ZOGLIN_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ZOMBIE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ZOMBIE_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ZOMBIE_HORSE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ZOMBIE_HORSE_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ZOMBIE_VILLAGER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ZOMBIE_VILLAGER_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ZOMBIFIED_PIGLIN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ZOMBIFIED_PIGLIN_SPAWN_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.PENGUIN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(ModItems.PENGUIN_SPAWN_EGG, 1),
                            64,16,0.0f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.MYSTERIOUS_ALCHEMIST,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 3),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 2),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 3),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 2),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DRAGON_HEAD, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(Items.DRAGON_HEAD, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ELYTRA, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(Items.ELYTRA, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.HEART_OF_THE_SEA, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(Items.HEART_OF_THE_SEA, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.LUCKY_PIECE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.LUCKY_PIECE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.QUAERITE_FRAGMENT, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.QUAERITE_FRAGMENT, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.LIFE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.LIFE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.LUCKY_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.LUCKY_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.BLUE_SPIDER_LILY, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.BLUE_SPIDER_LILY, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.POISON_GRASS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.POISON_GRASS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.ROSE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.ROSE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.WOLFSBANE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.WOLFSBANE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.ROSE_WOOL, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.ROSE_WOOL, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ROSE_DYE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.ROSE_DYE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.ULTRAMARINE_WOOL, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.ULTRAMARINE_WOOL, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ULTRAMARINE_DYE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.ULTRAMARINE_DYE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.VIOLET_WOOL, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.VIOLET_WOOL, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.VIOLET_DYE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.VIOLET_DYE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.RAW_BEEF_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.RAW_BEEF_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.BEEF_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.BEEF_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.RAW_CHICKEN_NUGGET_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.RAW_CHICKEN_NUGGET_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.CHICKEN_NUGGET_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.CHICKEN_NUGGET_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.GRAPHITE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.GRAPHITE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RAW_PLATINUM, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.RAW_PLATINUM, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RAW_TITANIUM, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.RAW_TITANIUM, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.MARBLE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.MARBLE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.PUMICE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.PUMICE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.HEART, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.HEART, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.HELLSTONE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.HELLSTONE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.SALT, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.SALT, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.WOODED_DIAMOND, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.WOODED_DIAMOND, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.TOOTHPASTE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModItems.TOOTHPASTE, 1),
                            64,16,0.0f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.MYSTERIOUS_ALCHEMIST,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 3),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 3),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 3),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 3),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.CONDUIT, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(Items.CONDUIT, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.MUSIC_DISC_OTHERSIDE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(Items.MUSIC_DISC_OTHERSIDE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.MUSIC_DISC_PIGSTEP, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(Items.MUSIC_DISC_OTHERSIDE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND_BLOCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(Items.DIAMOND_BLOCK, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_BLOCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(Items.NETHERITE_BLOCK, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.RAW_COPPER_BLOCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(Items.RAW_COPPER_BLOCK, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.RAW_GOLD_BLOCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(Items.RAW_GOLD_BLOCK, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.RAW_IRON_BLOCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(Items.RAW_IRON_BLOCK, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMBER, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.AMBER, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.AMBER_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.AMBER_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_AMBER_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_AMBER_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.ANDALUSITE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.ANDALUSITE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.ANDALUSITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.ANDALUSITE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_ANDALUSITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_ANDALUSITE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AQUAMARINE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.AQUAMARINE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.AQUAMARINE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.AQUAMARINE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_AQUAMARINE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_AQUAMARINE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.CITRINE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.CITRINE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.CITRINE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.CITRINE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_CITRINE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_CITRINE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.DIOPSIDE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.DIOPSIDE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DIOPSIDE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DIOPSIDE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_DIOPSIDE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_DIOPSIDE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.GARNET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.GARNET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.GARNET_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.GARNET_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_GARNET_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_GARNET_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.HESSONITE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.HESSONITE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.HESSONITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.HESSONITE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_HESSONITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_HESSONITE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.MALICHITE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.MALICHITE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.MALICHITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.MALICHITE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_MALICHITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_MALICHITE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.MOONSTONE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.MOONSTONE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.MOONSTONE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.MOONSTONE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_MOONSTONE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_MOONSTONE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.OPAL, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.OPAL, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.OPAL_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.OPAL_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_OPAL_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_OPAL_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.PERIDOT, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.PERIDOT, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.PERIDOT_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.PERIDOT_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_PERIDOT_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_PERIDOT_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.PREHNITE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.PREHNITE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.PREHNITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.PREHNITE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_PREHNITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_PREHNITE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.SPESSARITE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.SPESSARITE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.SPESSARITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.SPESSARITE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_SPESSARITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_SPESSARITE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.RUBY, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.RUBY, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.RUBY_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.RUBY_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_RUBY_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_RUBY_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.SAPPHIRE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.SAPPHIRE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.SAPPHIRE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.SAPPHIRE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_SAPPHIRE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_SAPPHIRE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.SMOKY_QUARTZ, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.SMOKY_QUARTZ, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.SMOKY_QUARTZ_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.SMOKY_QUARTZ_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_SMOKY_QUARTZ_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_SMOKY_QUARTZ_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.SPHENE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.SPHENE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.SPHENE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.SPHENE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_SPHENE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_SPHENE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.SPINEL, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.SPINEL, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.SPINEL_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.SPINEL_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_SPINEL_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_SPINEL_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.TANZANITE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.TANZANITE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.TANZANITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.TANZANITE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_TANZANITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_TANZANITE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.TOPAZ, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.TOPAZ, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.TOPAZ_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.TOPAZ_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_TOPAZ_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_TOPAZ_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.TORMALINE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.TORMALINE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.TORMALINE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.TORMALINE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_TORMALINE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_TORMALINE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.TSAVORITE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.TSAVORITE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.TSAVORITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.TSAVORITE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_TSAVORITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_TSAVORITE_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.ZIRCON, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicItems.ZIRCON, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.ZIRCON_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.ZIRCON_ORE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_ZIRCON_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_ZIRCON_ORE, 1),
                            64,16,0.0f));
                });


        TradeOfferHelper.registerVillagerOffers(ModVillagers.MYSTERIOUS_ALCHEMIST,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 3),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 3),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 3),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 3),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.MOJANG_BANNER_PATTERN, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(Items.MOJANG_BANNER_PATTERN, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DRAGON_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(Items.DRAGON_EGG, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEBUG_STICK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(Items.DEBUG_STICK, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.KNOWLEDGE_BOOK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(Items.KNOWLEDGE_BOOK, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.LUCKY_ITEM, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModBlocks.LUCKY_ITEM, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.LUCKY_BLOCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModBlocks.LUCKY_BLOCK, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(WarfareItems.LIFE_HELMET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(WarfareItems.LIFE_HELMET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(WarfareItems.LIFE_CHESTPLATE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(WarfareItems.LIFE_CHESTPLATE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(WarfareItems.LIFE_LEGGINGS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(WarfareItems.LIFE_LEGGINGS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(WarfareItems.LIFE_BOOTS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(WarfareItems.LIFE_BOOTS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(WarfareItems.QUAERITE_HELMET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(WarfareItems.QUAERITE_HELMET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(WarfareItems.QUAERITE_CHESTPLATE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(WarfareItems.QUAERITE_CHESTPLATE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(WarfareItems.QUAERITE_LEGGINGS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(WarfareItems.QUAERITE_LEGGINGS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(WarfareItems.QUAERITE_BOOTS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(WarfareItems.QUAERITE_BOOTS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(WarfareItems.QUAERITE_SWORD, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(WarfareItems.QUAERITE_SWORD, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(WarfareItems.QUAERITE_PICKAXE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(WarfareItems.QUAERITE_PICKAXE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(WarfareItems.QUAERITE_AXE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(WarfareItems.QUAERITE_AXE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(WarfareItems.QUAERITE_SHOVEL, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(WarfareItems.QUAERITE_SHOVEL, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(WarfareItems.QUAERITE_HOE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(WarfareItems.QUAERITE_HOE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ENDER_SHARD, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModItems.ENDER_SHARD, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ENDER_INGOT, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModItems.ENDER_INGOT, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ENDER_DUST, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModItems.ENDER_DUST, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.HELLSTONE_BLOCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModBlocks.HELLSTONE_BLOCK, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.QUAERITE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModBlocks.QUAERITE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.SALT_BLOCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModBlocks.SALT_BLOCK, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.HOT_PUMICE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModBlocks.HOT_PUMICE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.GRAPHITE_BLOCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModBlocks.GRAPHITE_BLOCK, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.RAW_PLATINUM_BLOCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModBlocks.RAW_PLATINUM_BLOCK, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.RAW_TITANIUM_BLOCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModBlocks.RAW_TITANIUM_BLOCK, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMBER_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMBER_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.ANDALUSITE_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.ANDALUSITE_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AQUAMARINE_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AQUAMARINE_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.CITRINE_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.CITRINE_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.DIAMOND_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.DIAMOND_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.DIOPSIDE_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.DIOPSIDE_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.GARNET_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.GARNET_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.HESSONITE_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.HESSONITE_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.MALICHITE_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.MALICHITE_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.MOONSTONE_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.MOONSTONE_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.OPAL_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.OPAL_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.PERIDOT_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.PERIDOT_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.PREHNITE_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.PREHNITE_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.SPESSARITE_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.SPESSARITE_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.RUBY_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.RUBY_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.SAPPHIRE_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.SAPPHIRE_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.SMOKY_QUARTZ_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.SMOKY_QUARTZ_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.SPHENE_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.SPHENE_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.SPINEL_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.SPINEL_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.TANZANITE_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.TANZANITE_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.TOPAZ_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.TOPAZ_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.TORMALINE_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.TORMALINE_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.TSAVORITE_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.TSAVORITE_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.ZIRCON_LOCKET, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.ZIRCON_LOCKET, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_ARTHRITIS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_ARTHRITIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_BAD_LUCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_BAD_LUCK, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_BRICKS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_BRICKS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_BUBBLES, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_BUBBLES, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_CLOVERS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_CLOVERS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_DECAY, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_DECAY, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_EXTRA_LOVE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_EXTRA_LOVE, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_FLAMELESSNESS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_FLAMELESSNESS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_GILLS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_GILLS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_GLUTTONY, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_GLUTTONY, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_HEALING, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_HEALING, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_HERCULES, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_HERCULES, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_ILLUMINATION, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_ILLUMINATION, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_LEAPING, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_LEAPING, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_NIGHT_SIGHT, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_NIGHT_SIGHT, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_NOURISHMENT, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_NOURISHMENT, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_OLYMPIC_SWIMMING, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_OLYMPIC_SWIMMING, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_RAIDS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_RAIDS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_REJUVINATION, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_REJUVINATION, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_SHIELDING, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_SHIELDING, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_SICKENING, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_SICKENING, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_THE_PHANTOM, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_THE_PHANTOM, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicItems.AMULET_OF_THE_TORTISE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,16,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(MagicItems.AMULET_OF_THE_TORTISE, 1),
                            64,16,0.0f));
                });

    }
}
