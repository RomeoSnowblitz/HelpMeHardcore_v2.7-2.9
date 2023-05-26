/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
 *  net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
 *  net.minecraft.class_4910
 *  net.minecraft.class_4915
 *  net.minecraft.class_4943
 */
package net.romeosnowblitz.hmh2.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.class_4910;
import net.minecraft.class_4915;
import net.minecraft.class_4943;
import net.romeosnowblitz.hmh2.block.MagicBlocks;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.item.MagicItems;
import net.romeosnowblitz.hmh2.item.ModItems;

public class ModModelProvider
extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public void generateBlockStateModels(class_4910 blockStateModelGenerator) {
        blockStateModelGenerator.method_25650(MagicBlocks.AMBER_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.ANDALUSITE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.AQUAMARINE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.CHARCOAL_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.CITRINE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_AMBER_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_ANDALUSITE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_AQUAMARINE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_CHARCOAL_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_CITRINE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_DIOPSIDE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_GARNET_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_HESSONITE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_MALICHITE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_MOONSTONE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_OPAL_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_PERIDOT_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_PREHNITE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_SMOKY_QUARTZ_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_SPESSARITE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_SPHENE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_SPINEL_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_TANZANITE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_TOPAZ_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_TORMALINE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_TSAVORITE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DEEPSLATE_ZIRCON_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.DIOPSIDE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.GARNET_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.HESSONITE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.MALICHITE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.MOONSTONE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.OPAL_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.PERIDOT_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.PREHNITE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.RUBY_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.SMOKY_QUARTZ_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.SPESSARITE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.SPHENE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.SPINEL_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.TANZANITE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.TOPAZ_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.TORMALINE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.TSAVORITE_ORE);
        blockStateModelGenerator.method_25650(MagicBlocks.ZIRCON_ORE);
        blockStateModelGenerator.method_25650(ModBlocks.ANDESITE_BRICKS);
        blockStateModelGenerator.method_25650(ModBlocks.BEEF_BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.BEEF_ORE);
        blockStateModelGenerator.method_25650(ModBlocks.BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.CHICKEN_BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.CHICKEN_NUGGET_ORE);
        blockStateModelGenerator.method_25650(ModBlocks.CHISELED_MARBLE_BRICKS);
        blockStateModelGenerator.method_25650(ModBlocks.CORK_BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockStateModelGenerator.method_25650(ModBlocks.DEEPSLATE_TIN_ORE);
        blockStateModelGenerator.method_25650(ModBlocks.DIABASE);
        blockStateModelGenerator.method_25650(ModBlocks.DIORITE_BRICKS);
        blockStateModelGenerator.method_25650(ModBlocks.GRANITE_BRICKS);
        blockStateModelGenerator.method_25650(ModBlocks.GRAPHITE_BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.HELLSTONE_BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.HELLSTONE_BRICKS);
        blockStateModelGenerator.method_25650(ModBlocks.HOT_PUMICE);
        blockStateModelGenerator.method_25650(ModBlocks.ICED_BUCKET);
        blockStateModelGenerator.method_25650(ModBlocks.INFESTED_HONEYCOMB_BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.INFESTED_NETHERRACK_BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.INFESTED_MAGMA_BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.LIFE_ORE);
        blockStateModelGenerator.method_25650(ModBlocks.LIMESTONE);
        blockStateModelGenerator.method_25650(ModBlocks.LUCKY_BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.LUCKY_ITEM);
        blockStateModelGenerator.method_25650(ModBlocks.LUCKY_ORE);
        blockStateModelGenerator.method_25650(ModBlocks.MARBLE);
        blockStateModelGenerator.method_25650(ModBlocks.MARBLE_BRICKS);
        blockStateModelGenerator.method_25650(ModBlocks.NETHER_PRISMARINE);
        blockStateModelGenerator.method_25650(ModBlocks.NEW_GREEN_CONCRETE);
        blockStateModelGenerator.method_25650(ModBlocks.NEW_GREEN_CONCRETE_POWDER);
        blockStateModelGenerator.method_25650(ModBlocks.NEW_GREEN_STAINED_GLASS);
        blockStateModelGenerator.method_25650(ModBlocks.NEW_GREEN_TERRACOTTA);
        blockStateModelGenerator.method_25650(ModBlocks.NEW_GREEN_WOOL);
        blockStateModelGenerator.method_25650(ModBlocks.PEAT);
        blockStateModelGenerator.method_25650(ModBlocks.PUMICE);
        blockStateModelGenerator.method_25650(ModBlocks.QUAERITE);
        blockStateModelGenerator.method_25650(ModBlocks.QUICKSAND);
        blockStateModelGenerator.method_25650(ModBlocks.RAW_BEEF_BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.RAW_BEEF_ORE);
        blockStateModelGenerator.method_25650(ModBlocks.RAW_CHICKEN_BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.RAW_CHICKEN_NUGGET_ORE);
        blockStateModelGenerator.method_25650(ModBlocks.RAW_PLATINUM_BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.RAW_TITANIUM_BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.ROSE_CONCRETE);
        blockStateModelGenerator.method_25650(ModBlocks.ROSE_CONCRETE_POWDER);
        blockStateModelGenerator.method_25650(ModBlocks.ROSE_STAINED_GLASS);
        blockStateModelGenerator.method_25650(ModBlocks.ROSE_TERRACOTTA);
        blockStateModelGenerator.method_25650(ModBlocks.ROSE_WOOL);
        blockStateModelGenerator.method_25650(ModBlocks.ROYAL_JELLY);
        blockStateModelGenerator.method_25650(ModBlocks.SALT_BLOCK);
        blockStateModelGenerator.method_25650(ModBlocks.SHALE);
        blockStateModelGenerator.method_25650(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.method_25650(ModBlocks.SNOW_BRICKS);
        blockStateModelGenerator.method_25650(ModBlocks.SPRING_GREEN_CONCRETE);
        blockStateModelGenerator.method_25650(ModBlocks.SPRING_GREEN_CONCRETE_POWDER);
        blockStateModelGenerator.method_25650(ModBlocks.SPRING_GREEN_STAINED_GLASS);
        blockStateModelGenerator.method_25650(ModBlocks.SPRING_GREEN_TERRACOTTA);
        blockStateModelGenerator.method_25650(ModBlocks.SPRING_GREEN_WOOL);
        blockStateModelGenerator.method_25650(ModBlocks.TIN_ORE);
        blockStateModelGenerator.method_25650(ModBlocks.ULTRAMARINE_CONCRETE);
        blockStateModelGenerator.method_25650(ModBlocks.ULTRAMARINE_CONCRETE_POWDER);
        blockStateModelGenerator.method_25650(ModBlocks.ULTRAMARINE_STAINED_GLASS);
        blockStateModelGenerator.method_25650(ModBlocks.ULTRAMARINE_TERRACOTTA);
        blockStateModelGenerator.method_25650(ModBlocks.ULTRAMARINE_WOOL);
        blockStateModelGenerator.method_25650(ModBlocks.VIOLET_CONCRETE);
        blockStateModelGenerator.method_25650(ModBlocks.VIOLET_CONCRETE_POWDER);
        blockStateModelGenerator.method_25650(ModBlocks.VIOLET_STAINED_GLASS);
        blockStateModelGenerator.method_25650(ModBlocks.VIOLET_TERRACOTTA);
        blockStateModelGenerator.method_25650(ModBlocks.VIOLET_WOOL);
        blockStateModelGenerator.method_25650(WoodworkBlocks.BANANA_LEAVES);
        blockStateModelGenerator.method_25650(WoodworkBlocks.BANANA_PLANKS);
        blockStateModelGenerator.method_25650(WoodworkBlocks.CHERRY_LEAVES);
        blockStateModelGenerator.method_25650(WoodworkBlocks.CHERRY_PLANKS);
        blockStateModelGenerator.method_25650(WoodworkBlocks.CORK_OAK_LEAVES);
        blockStateModelGenerator.method_25650(WoodworkBlocks.CORK_OAK_PLANKS);
        blockStateModelGenerator.method_25650(WoodworkBlocks.JACARANDA_LEAVES);
        blockStateModelGenerator.method_25650(WoodworkBlocks.JACARANDA_PLANKS);
        blockStateModelGenerator.method_25650(WoodworkBlocks.MAHOE_LEAVES);
        blockStateModelGenerator.method_25650(WoodworkBlocks.MAHOE_PLANKS);
        blockStateModelGenerator.method_25650(WoodworkBlocks.MANGO_LEAVES);
        blockStateModelGenerator.method_25650(WoodworkBlocks.MANGO_PLANKS);
        blockStateModelGenerator.method_25650(WoodworkBlocks.WILLOW_LEAVES);
        blockStateModelGenerator.method_25650(WoodworkBlocks.WILLOW_PLANKS);
        blockStateModelGenerator.method_25650(WoodworkBlocks.UNBREAKABLE_LEAVES);
        blockStateModelGenerator.method_25658(WoodworkBlocks.BANANA_DOOR);
        blockStateModelGenerator.method_25658(WoodworkBlocks.CHERRY_DOOR);
        blockStateModelGenerator.method_25658(WoodworkBlocks.CORK_OAK_DOOR);
        blockStateModelGenerator.method_25658(WoodworkBlocks.JACARANDA_DOOR);
        blockStateModelGenerator.method_25658(WoodworkBlocks.MAHOE_DOOR);
        blockStateModelGenerator.method_25658(WoodworkBlocks.MANGO_DOOR);
        blockStateModelGenerator.method_25658(WoodworkBlocks.WILLOW_DOOR);
    }

    public void generateItemModels(class_4915 itemModelGenerator) {
        itemModelGenerator.method_25733(MagicItems.ALIGHT_CHARM, class_4943.field_22938);
        itemModelGenerator.method_25733(ModItems.FLOUR, class_4943.field_22938);
        itemModelGenerator.method_25733(ModItems.GLUE, class_4943.field_22938);
        itemModelGenerator.method_25733(ModItems.SUN_STONE, class_4943.field_22938);
    }
}

