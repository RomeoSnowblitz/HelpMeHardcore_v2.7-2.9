package net.romeosnowblitz.hmh2.worldgen;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.romeosnowblitz.hmh2.Hmh2;

import java.util.List;

public class ModConfiguredFeatures {

    //public static final RegistryKey<ConfiguredFeature<?, ?>> DRIFTWOOD_KEY = registerKey("driftwood");
    public final RegistryEntryList<Block> canPlaceOn;

    public ModConfiguredFeatures(RegistryEntryList<Block> canPlaceOn) {
        this.canPlaceOn = canPlaceOn;
    }

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RegistryEntryList<Block> canPlaceOn = RegistryEntryList.of(Block::getRegistryEntry, List.of(Blocks.STONE, Blocks.ANDESITE, Blocks.DIORITE,
                Blocks.GRANITE, Blocks.DRIPSTONE_BLOCK, Blocks.CALCITE,Blocks.TUFF, Blocks.DEEPSLATE, Blocks.OAK_WOOD, Blocks.MOSS_BLOCK));
        //register(context, registerKey("test"), ModFeatures.TEST, TestFC);
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Hmh2.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
