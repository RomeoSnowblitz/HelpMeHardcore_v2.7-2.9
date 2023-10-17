package net.romeosnowblitz.hmh2;

import net.fabricmc.api.ModInitializer;
import net.romeosnowblitz.hmh2.block.*;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.blotty.ModBlockEntities;
import net.romeosnowblitz.hmh2.item.*;
import net.romeosnowblitz.hmh2.painting.ModPaintings;
import net.romeosnowblitz.hmh2.potion.ModPotions;
import net.romeosnowblitz.hmh2.sounds.ModSounds;
import net.romeosnowblitz.hmh2.util.ModEvents;
import net.romeosnowblitz.hmh2.keys.ModNetworking;
import net.romeosnowblitz.hmh2.util.ModRegistries;
import net.romeosnowblitz.hmh2.util.ModStats;
import net.romeosnowblitz.hmh2.villager.ModVillagers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hmh2 implements ModInitializer {
	public static final String MOD_ID = "hmh2";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();
		MagicItems.registerModItems();
		WarfareItems.registerModItems();
		SustenanceItems.registerSustenanceItems();
		ModPaintings.registerPaintings();
		ModRegistries.registerModStuffs();
		ModPotions.registerPotionRecipes();
		CustomEffects.registerEffects();
		ModBlockEntities.registerAllBlockEntities();
		ModVillagers.registerVillagers();
		ModVillagers.registerVillagerTrades();
		ModSounds.registerSounds();
		ModEvents.registerModEvents();
		ModEntities.registerModEntities();
		ModStats.registerCustomStats();
		ModEntities.addSpawns();
		ModNetworking.registerC2SPackets();
	}
}
