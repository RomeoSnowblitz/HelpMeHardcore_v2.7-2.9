/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry
 *  net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler
 *  net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry
 *  net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry
 *  net.minecraft.class_1921
 *  net.minecraft.class_3611
 */
package net.romeosnowblitz.hmh2;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.class_1921;
import net.minecraft.class_3611;
import net.romeosnowblitz.hmh2.block.MagicBlocks;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.entity.MobEntities;
import net.romeosnowblitz.hmh2.entity.client.CalRenderer;
import net.romeosnowblitz.hmh2.entity.client.HellmiteRenderer;
import net.romeosnowblitz.hmh2.entity.client.MagmiteRenderer;
import net.romeosnowblitz.hmh2.entity.client.PenguinRenderer;
import net.romeosnowblitz.hmh2.entity.client.QueenBeeRenderer;
import net.romeosnowblitz.hmh2.entity.client.SculkmiteRenderer;
import net.romeosnowblitz.hmh2.entity.client.ShadowCreatureRenderer;
import net.romeosnowblitz.hmh2.entity.client.SoldierBeeRenderer;
import net.romeosnowblitz.hmh2.entity.client.TheGreatHungerRenderer;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.screen.BackpackScreen;
import net.romeosnowblitz.hmh2.screen.ModScreenHandlers;
import net.romeosnowblitz.hmh2.util.ModModelPredicateProvider;

public class Hmh2ClientMod
implements ClientModInitializer {
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_SPIDER_LILY, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ULTRAMARINE_STAINED_GLASS, class_1921.method_23583());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ULTRAMARINE_STAINED_GLASS_PANE, class_1921.method_23583());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POISON_GRASS, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROSE, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROSE_STAINED_GLASS, class_1921.method_23583());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROSE_STAINED_GLASS_PANE, class_1921.method_23583());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WOLFSBANE, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VIOLET_STAINED_GLASS, class_1921.method_23583());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VIOLET_STAINED_GLASS_PANE, class_1921.method_23583());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NEW_GREEN_STAINED_GLASS, class_1921.method_23583());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NEW_GREEN_STAINED_GLASS_PANE, class_1921.method_23583());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRING_GREEN_STAINED_GLASS, class_1921.method_23583());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRING_GREEN_STAINED_GLASS_PANE, class_1921.method_23583());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUEBERRY_BUSH, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRAWBERRY_BUSH, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.AMBER_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.ANDALUSITE_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.AQUAMARINE_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.CITRINE_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.DIOPSIDE_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.GARNET_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.HESSONITE_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.MALICHITE_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.MOONSTONE_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.OPAL_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.PERIDOT_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.PREHNITE_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.RUBY_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.SAPPHIRE_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.SMOKY_QUARTZ_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.SPESSARITE_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.SPHENE_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.SPINEL_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.TANZANITE_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.TOPAZ_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.TORMALINE_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.TSAVORITE_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.ZIRCON_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.AMETHYST_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.CHARCOAL_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.COAL_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.COPPER_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.DIAMOND_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.EMERALD_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.FLINT_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.GOLD_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.IRON_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(MagicBlocks.LAPIS_DUST, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.XRAY, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MIDAS_TOUCH, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_CORN_BLOCK, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROYAL_JELLY, class_1921.method_23583());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICED_BUCKET, class_1921.method_23583());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.BANANA_SAPLING, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.BANANA_LEAVES, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.BANANA_DOOR, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.BANANA_TRAPDOOR, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CHERRY_SAPLING, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CHERRY_LEAVES, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CHERRY_DOOR, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CHERRY_TRAPDOOR, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CORK_OAK_SAPLING, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CORK_OAK_LEAVES, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CORK_OAK_DOOR, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.CORK_OAK_TRAPDOOR, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.JACARANDA_SAPLING, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.JACARANDA_LEAVES, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.JACARANDA_DOOR, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.JACARANDA_TRAPDOOR, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MAHOE_SAPLING, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MAHOE_LEAVES, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MAHOE_DOOR, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MAHOE_TRAPDOOR, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MANGO_SAPLING, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MANGO_LEAVES, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MANGO_DOOR, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.MANGO_TRAPDOOR, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.WILLOW_SAPLING, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.WILLOW_LEAVES, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.WILLOW_DOOR, class_1921.method_23581());
        BlockRenderLayerMap.INSTANCE.putBlock(WoodworkBlocks.WILLOW_TRAPDOOR, class_1921.method_23581());
        ModModelPredicateProvider.registerModModels();
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.CHOCOLATE_MILK_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 9922374));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.CHOCOLATE_MILK_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 9922374));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.HEATED_OIL_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 4340527));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.HEATED_OIL_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 4340527));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.HONEY_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 14513679));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.HONEY_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 14513679));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.OIL_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 4340527));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.OIL_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 4340527));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.ABSORPTION_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x2552A5));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.ABSORPTION_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x2552A5));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.BAD_LUCK_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 12624973));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.BAD_LUCK_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 12624973));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.BAD_OMEN_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 745784));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.BAD_OMEN_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 745784));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.BLINDNESS_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 2039587));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.BLINDNESS_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 2039587));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.CONDUIT_POWER_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 1950417));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.CONDUIT_POWER_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 1950417));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.DARKNESS_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 2696993));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.DARKNESS_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 2696993));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.DOLPHINS_GRACE_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 8954814));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.DOLPHINS_GRACE_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 8954814));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.FIRE_IMMUNITY_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 14981690));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.FIRE_IMMUNITY_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 14981690));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.GLOWING_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 9740385));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.GLOWING_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 9740385));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.HASTE_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 14270531));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.HASTE_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 14270531));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.HEALTH_BOOST_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 16284963));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.HEALTH_BOOST_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 16284963));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.HUNGER_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 5797459));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.HUNGER_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 5797459));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.INSTANT_DAMAGE_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 4393481));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.INSTANT_DAMAGE_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 4393481));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.INSTANT_HEALTH_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 16262179));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.INSTANT_HEALTH_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 16262179));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.INVISIBILITY_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 8356754));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.INVISIBILITY_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 8356754));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.JUMP_BOOST_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 2293580));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.JUMP_BOOST_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 2293580));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.LEVITATION_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xCEFFFF));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.LEVITATION_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0xCEFFFF));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.LUCK_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x339900));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.LUCK_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x339900));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.MINING_FATIGUE_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 4866583));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.MINING_FATIGUE_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 4866583));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.NAUSEA_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 5578058));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.NAUSEA_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 5578058));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.NIGHT_VISION_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x1F1FA1));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.NIGHT_VISION_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x1F1FA1));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.POISON_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 5149489));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.POISON_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 5149489));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.REGENERATION_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 13458603));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.REGENERATION_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 13458603));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.RESISTANCE_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 10044730));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.RESISTANCE_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 10044730));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.SATURATION_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 16262177));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.SATURATION_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 16262177));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.SLOW_FALLING_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 16773073));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.SLOW_FALLING_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 16773073));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.SLOWNESS_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 5926017));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.SLOWNESS_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 5926017));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.SPEED_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 8171462));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.SPEED_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 8171462));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.STRENGTH_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 9643043));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.STRENGTH_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 9643043));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.VILLAGE_HERO_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x44FF44));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.VILLAGE_HERO_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x44FF44));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.WATER_BREATHING_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 3035801));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.WATER_BREATHING_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 3035801));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.WEAKNESS_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x484D48));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.WEAKNESS_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 0x484D48));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.WITHER_FLUID_STILL, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 3484199));
        FluidRenderHandlerRegistry.INSTANCE.register((class_3611)ModFluids.WITHER_FLUID_FLOWING, (FluidRenderHandler)new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 3484199));
        EntityRendererRegistry.register(MobEntities.PENGUIN, PenguinRenderer::new);
        EntityRendererRegistry.register(MobEntities.QUEEN_BEE, QueenBeeRenderer::new);
        EntityRendererRegistry.register(MobEntities.SHADOW_CREATURE, ShadowCreatureRenderer::new);
        EntityRendererRegistry.register(MobEntities.SOLDIER_BEE, SoldierBeeRenderer::new);
        EntityRendererRegistry.register(MobEntities.THE_GREAT_HUNGER, TheGreatHungerRenderer::new);
        EntityRendererRegistry.register(MobEntities.HELLMITE, HellmiteRenderer::new);
        EntityRendererRegistry.register(MobEntities.MAGMITE, MagmiteRenderer::new);
        EntityRendererRegistry.register(MobEntities.CAL, CalRenderer::new);
        EntityRendererRegistry.register(MobEntities.SCULKMITE, SculkmiteRenderer::new);
        ScreenRegistry.register(ModScreenHandlers.BACKPACK_SCREEN_HANDLER, BackpackScreen::new);
    }
}

