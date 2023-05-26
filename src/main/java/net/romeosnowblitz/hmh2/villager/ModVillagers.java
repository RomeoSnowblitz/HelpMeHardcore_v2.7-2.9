package net.romeosnowblitz.hmh2.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.util.MysteriousAlchemistTrades;

public class ModVillagers {
    public static final PointOfInterestType MYSTERIOUS_POI = registerPOI("mysterious_poi", ModBlocks.BLOCK);
    public static final VillagerProfession MYSTERIOUS_ALCHEMIST = registerProfession("mysterious_alchemist",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Hmh2.MOD_ID, "mysterious_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(Hmh2.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(Hmh2.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(Hmh2.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void registerVillagers() {
        Hmh2.LOGGER.debug("Registering Villagers for " + Hmh2.MOD_ID);
    }

    public static void registerVillagerTrades() {
        MysteriousAlchemistTrades.registerMysteriousAlchemistTrades();
    }
}