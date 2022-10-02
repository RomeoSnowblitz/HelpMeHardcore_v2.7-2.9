package net.romeosnowblitz.hmh2;

import net.fabricmc.api.ModInitializer;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.MagicBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.entity.ModBlockEntities;
import net.romeosnowblitz.hmh2.item.MagicItems;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.item.WarfareItems;
import net.romeosnowblitz.hmh2.painting.ModPaintings;
import net.romeosnowblitz.hmh2.potion.ModPotions;
import net.romeosnowblitz.hmh2.recipe.ModRecipes;
import net.romeosnowblitz.hmh2.screen.ModScreenHandlers;
import net.romeosnowblitz.hmh2.util.ModRegistries;
import net.romeosnowblitz.hmh2.villager.ModVillagers;
import net.romeosnowblitz.hmh2.world.feature.ModConfiguredFeatures;
import net.romeosnowblitz.hmh2.world.gen.ModWorldGen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hmh2 implements ModInitializer {
	public static final String MOD_ID = "hmh2";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		MagicItems.registerModItems();
		WarfareItems.registerModItems();
		ModBlocks.registerModBlock();
		MagicBlocks.registerModBlock();
		WoodworkBlocks.registerModBlock();

		ModPaintings.registerPaintings();
		ModRegistries.registerModStuffs();
		ModWorldGen.generateModWorldGen();

		ModPotions.registerPotions();
		ModBlockEntities.registerAllBlockEntities();
		ModRecipes.registerRecipes();
		ModScreenHandlers.registerAllScreenHandlers();

		ModVillagers.registerVillagers();
		ModVillagers.registerVillagerTrades();
	}
}
