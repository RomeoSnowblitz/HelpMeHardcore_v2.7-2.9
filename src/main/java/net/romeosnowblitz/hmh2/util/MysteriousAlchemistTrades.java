package net.romeosnowblitz.hmh2.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.romeosnowblitz.hmh2.block.DecorationBlocks;
import net.romeosnowblitz.hmh2.block.MagicBlocks;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.villager.ModVillagers;

public class MysteriousAlchemistTrades extends ModRegistries{
    public static void registerMysteriousAlchemistTrades(){
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MYSTERIOUS_ALCHEMIST,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LARGE_FERN, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.LARGE_FERN, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.TALL_GRASS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.TALL_GRASS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEAD_BUSH, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEAD_BUSH, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SPORE_BLOSSOM, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SPORE_BLOSSOM, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BUDDING_AMETHYST, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.BUDDING_AMETHYST, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.INFESTED_CHISELED_STONE_BRICKS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.INFESTED_CHISELED_STONE_BRICKS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.INFESTED_COBBLESTONE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.INFESTED_COBBLESTONE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.INFESTED_CRACKED_STONE_BRICKS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.INFESTED_CRACKED_STONE_BRICKS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.INFESTED_DEEPSLATE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.INFESTED_DEEPSLATE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.INFESTED_STONE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.INFESTED_STONE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.INFESTED_MOSSY_STONE_BRICKS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.INFESTED_MOSSY_STONE_BRICKS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.INFESTED_STONE_BRICKS, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.INFESTED_STONE_BRICKS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_DIAMOND_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_DIAMOND_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_EMERALD_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_EMERALD_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHER_GOLD_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHER_GOLD_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHER_QUARTZ_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.NETHER_QUARTZ_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_COAL_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_COAL_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_IRON_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_IRON_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_REDSTONE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_REDSTONE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_LAPIS_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_LAPIS_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_GOLD_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_GOLD_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEEPSLATE_COPPER_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DEEPSLATE_COPPER_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DIAMOND_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.EMERALD_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COAL_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.COAL_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.IRON_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.REDSTONE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.REDSTONE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LAPIS_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.LAPIS_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.GOLD_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COPPER_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.COPPER_ORE, 1),
                            64,1,0.0f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.MYSTERIOUS_ALCHEMIST,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.AXOLOTL_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.AXOLOTL_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BAT_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.BAT_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BEE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.BEE_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.CAT_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.CAT_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.CAVE_SPIDER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.CAVE_SPIDER_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.CHICKEN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.CHICKEN_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COD_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.COD_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COW_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.COW_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.CREEPER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.CREEPER_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DOLPHIN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DOLPHIN_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DONKEY_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DROWNED_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.DROWNED_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ELDER_GUARDIAN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ELDER_GUARDIAN_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ENDERMAN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ENDERMAN_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ENDERMITE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ENDERMITE_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EVOKER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.EVOKER_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.FOX_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.FOX_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GLOW_SQUID_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.GLOW_SQUID_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOAT_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.GOAT_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GUARDIAN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.GUARDIAN_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.HORSE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.HORSE_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.HUSK_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.HUSK_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LLAMA_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.LLAMA_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.MOOSHROOM_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.MOOSHROOM_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.MULE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.MULE_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.OCELOT_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.OCELOT_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PANDA_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PANDA_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PARROT_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PARROT_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PHANTOM_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PHANTOM_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PIG_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PIG_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PIGLIN_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PILLAGER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PILLAGER_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.POLAR_BEAR_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.POLAR_BEAR_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PUFFERFISH_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.PUFFERFISH_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.RABBIT_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.RABBIT_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.RAVAGER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.RAVAGER_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SALMON_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SALMON_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SHEEP_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SHEEP_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SILVERFISH_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SILVERFISH_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SKELETON_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SKELETON_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SKELETON_HORSE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SKELETON_HORSE_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SLIME_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SLIME_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SPIDER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SPIDER_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SQUID_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.SQUID_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.STRAY_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.STRAY_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.TRADER_LLAMA_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.TRADER_LLAMA_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.TROPICAL_FISH_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.TROPICAL_FISH_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.TURTLE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.TURTLE_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.VEX_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.VEX_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.VILLAGER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.VILLAGER_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.VINDICATOR_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.VINDICATOR_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.WANDERING_TRADER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.WANDERING_TRADER_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.WITCH_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.WITCH_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.WOLF_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.WOLF_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ZOMBIE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ZOMBIE_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ZOMBIE_HORSE_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ZOMBIE_HORSE_SPAWN_EGG, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ZOMBIE_VILLAGER_SPAWN_EGG, 1),
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 1),
                            new ItemStack(Items.ZOMBIE_VILLAGER_SPAWN_EGG, 1),
                            64,1,0.0f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.MYSTERIOUS_ALCHEMIST,3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_WHITE_DEBRIS, 3),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.HEART_OF_THE_SEA, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(Items.HEART_OF_THE_SEA, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.RAW_BEEF_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.RAW_BEEF_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.BEEF_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.BEEF_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.RAW_CHICKEN_NUGGET_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.RAW_CHICKEN_NUGGET_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.CHICKEN_NUGGET_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.CHICKEN_NUGGET_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(DecorationBlocks.MARBLE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(DecorationBlocks.MARBLE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(DecorationBlocks.PUMICE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(DecorationBlocks.PUMICE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(DecorationBlocks.HOT_PUMICE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(DecorationBlocks.HOT_PUMICE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.GRAPHITE_BLOCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.GRAPHITE_BLOCK, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.RAW_PLATINUM_BLOCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.RAW_PLATINUM_BLOCK, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.RAW_TITANIUM_BLOCK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.RAW_TITANIUM_BLOCK, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.PEAT, 1),
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 1),
                            new ItemStack(ModBlocks.PEAT, 1),
                            64,1,0.0f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.MYSTERIOUS_ALCHEMIST,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_YELLOW_DEBRIS, 3),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.MUSIC_DISC_OTHERSIDE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(Items.MUSIC_DISC_OTHERSIDE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.MUSIC_DISC_PIGSTEP, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(Items.MUSIC_DISC_PIGSTEP, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.AMBER_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.AMBER_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_AMBER_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_AMBER_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.ANDALUSITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.ANDALUSITE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_ANDALUSITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_ANDALUSITE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.AQUAMARINE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.AQUAMARINE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_AQUAMARINE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_AQUAMARINE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.CITRINE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.CITRINE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_CITRINE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_CITRINE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DIOPSIDE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DIOPSIDE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_DIOPSIDE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_DIOPSIDE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.HESSONITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.HESSONITE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_HESSONITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_HESSONITE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.MALICHITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.MALICHITE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_MALICHITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_MALICHITE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.MOONSTONE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.MOONSTONE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_MOONSTONE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_MOONSTONE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.OPAL_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.OPAL_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_OPAL_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_OPAL_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.PERIDOT_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.PERIDOT_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_PERIDOT_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_PERIDOT_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.PREHNITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.PREHNITE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_PREHNITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_PREHNITE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.SAPPHIRE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.SAPPHIRE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_SAPPHIRE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_SAPPHIRE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.SMOKY_QUARTZ_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.SMOKY_QUARTZ_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_SMOKY_QUARTZ_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_SMOKY_QUARTZ_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.SPHENE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.SPHENE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_SPHENE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_SPHENE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.SPINEL_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.SPINEL_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_SPINEL_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_SPINEL_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.TANZANITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.TANZANITE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_TANZANITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_TANZANITE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.TOPAZ_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.TOPAZ_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_TOPAZ_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_TOPAZ_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.TORMALINE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.TORMALINE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_TORMALINE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_TORMALINE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.TSAVORITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.TSAVORITE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_TSAVORITE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_TSAVORITE_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.ZIRCON_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.ZIRCON_ORE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(MagicBlocks.DEEPSLATE_ZIRCON_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 1),
                            new ItemStack(MagicBlocks.DEEPSLATE_ZIRCON_ORE, 1),
                            64,1,0.0f));
                });


        TradeOfferHelper.registerVillagerOffers(ModVillagers.MYSTERIOUS_ALCHEMIST,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_CYAN_DEBRIS, 3),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DEBUG_STICK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(Items.DEBUG_STICK, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.KNOWLEDGE_BOOK, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(Items.KNOWLEDGE_BOOK, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModBlocks.LIFE_ORE, 1),
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            64,1,0.0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MYSTERIOUS_MAGENTA_DEBRIS, 1),
                            new ItemStack(ModBlocks.LIFE_ORE, 1),
                            64,1,0.0f));
                });
    }
}
