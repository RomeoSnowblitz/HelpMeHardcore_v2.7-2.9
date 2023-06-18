package net.romeosnowblitz.hmh2;

import net.fabricmc.api.ModInitializer;
import net.romeosnowblitz.hmh2.block.*;
import net.romeosnowblitz.hmh2.block.custom.block.ModComposterBlock;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModBlockEntities;
import net.romeosnowblitz.hmh2.item.*;
import net.romeosnowblitz.hmh2.painting.ModPaintings;
import net.romeosnowblitz.hmh2.potion.ModPotions;
import net.romeosnowblitz.hmh2.sounds.ModSounds;
import net.romeosnowblitz.hmh2.test.ModEvents;
import net.romeosnowblitz.hmh2.util.ModRegistries;
import net.romeosnowblitz.hmh2.villager.ModVillagers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hmh2 implements ModInitializer {
	public static final String MOD_ID = "hmh2";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroup.registerItemGroup();
		ModComposterBlock.registerDefaultCompostableItems();

		ModItems.registerModItems();
		MagicItems.registerModItems();
		WarfareItems.registerModItems();
		SustenanceItems.registerSustenanceItems();
		ModBlocks.registerModBlock();
		ColoringBlocks.registerColoringBlocks();
		DecorationBlocks.registerDecorationBlocks();
		MagicBlocks.registerModBlock();
		WoodworkBlocks.registerModBlock();

		ModPaintings.registerPaintings();
		ModRegistries.registerModStuffs();

		ModPotions.registerPotions();
		CustomEffects.registerEffects();
		ModBlockEntities.registerAllBlockEntities();

		ModVillagers.registerVillagers();
		ModVillagers.registerVillagerTrades();
		ModSounds.registerSounds();
		ModEvents.registerModEvents();

	}
}
