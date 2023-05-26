/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.item.v1.FabricItemSettings
 *  net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
 *  net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings
 *  net.minecraft.class_1299
 *  net.minecraft.class_1747
 *  net.minecraft.class_1761
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1922
 *  net.minecraft.class_1935
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2378
 *  net.minecraft.class_2431
 *  net.minecraft.class_2680
 *  net.minecraft.class_2960
 *  net.minecraft.class_3614
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_6017
 *  net.minecraft.class_6019
 *  net.minecraft.class_7923
 */
package net.romeosnowblitz.hmh2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.class_1299;
import net.minecraft.class_1747;
import net.minecraft.class_1761;
import net.minecraft.class_1792;
import net.minecraft.class_1922;
import net.minecraft.class_1935;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2378;
import net.minecraft.class_2431;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_3614;
import net.minecraft.class_4970;
import net.minecraft.class_6017;
import net.minecraft.class_6019;
import net.minecraft.class_7923;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.AmberDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.AmethystDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.AndalusiteDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.AquamarineDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.CharcoalDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.CitrineDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.CoalDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.CopperDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.DiamondDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.DiopsideDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.EmeraldDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.FlintDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.GarnetDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.GoldDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.HessoniteDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.IronDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.LapisDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.MalichiteDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.MoonstoneDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.OpalDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.PeridotDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.PreniteDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.RubyDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.SapphireDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.SmokyQuartzDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.SpessariteDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.SpheneDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.SpinelDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.TanzaniteDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.TopazDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.TormalineDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.TsavoriteDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_dust.ZirconDust;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.AbsorptionFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.BadLuckFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.BadOmenFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.BlindnessFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.ConduitPowerFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.DarknessFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.DolphinsGraceFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.FireImmunityFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.GlowingFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.HasteFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.HealthBoostFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.HungerFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.InstantDamageFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.InstantHealthFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.InvisibilityFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.JumpBoostFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.LevitationFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.LuckFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.MiningFatigueFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.NauseaFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.NightVisionFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.PoisonFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.RegenerationFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.ResistanceFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.SaturationFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.SlowFallingFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.SlownessFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.SpeedFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.StrengthFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.VillageHeroFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.WaterBreathingFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.WeaknessFluidBlock;
import net.romeosnowblitz.hmh2.block.custom.magic.magic_fluid.WitherFluidBlock;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.ModItemGroup;

public class MagicBlocks {
    public static final class_2248 AMBER_ORE = MagicBlocks.resisterBlock("amber_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 ANDALUSITE_ORE = MagicBlocks.resisterBlock("andalusite_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 AQUAMARINE_ORE = MagicBlocks.resisterBlock("aquamarine_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 CHARCOAL_ORE = MagicBlocks.resisterBlock("charcoal_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 CITRINE_ORE = MagicBlocks.resisterBlock("citrine_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DIOPSIDE_ORE = MagicBlocks.resisterBlock("diopside_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 GARNET_ORE = MagicBlocks.resisterBlock("garnet_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 HESSONITE_ORE = MagicBlocks.resisterBlock("hessonite_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 MALICHITE_ORE = MagicBlocks.resisterBlock("malichite_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 MOONSTONE_ORE = MagicBlocks.resisterBlock("moonstone_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 OPAL_ORE = MagicBlocks.resisterBlock("opal_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 PERIDOT_ORE = MagicBlocks.resisterBlock("peridot_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 PREHNITE_ORE = MagicBlocks.resisterBlock("prehnite_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 RUBY_ORE = MagicBlocks.resisterBlock("ruby_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 SAPPHIRE_ORE = MagicBlocks.resisterBlock("sapphire_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 SMOKY_QUARTZ_ORE = MagicBlocks.resisterBlock("smoky_quartz_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 SPESSARITE_ORE = MagicBlocks.resisterBlock("spessarite_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 SPHENE_ORE = MagicBlocks.resisterBlock("sphene_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 SPINEL_ORE = MagicBlocks.resisterBlock("spinel_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 TANZANITE_ORE = MagicBlocks.resisterBlock("tanzanite_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 TOPAZ_ORE = MagicBlocks.resisterBlock("topaz_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 TORMALINE_ORE = MagicBlocks.resisterBlock("tormaline_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 TSAVORITE_ORE = MagicBlocks.resisterBlock("tsavorite_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 ZIRCON_ORE = MagicBlocks.resisterBlock("zircon_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_AMBER_ORE = MagicBlocks.resisterBlock("deepslate_amber_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_ANDALUSITE_ORE = MagicBlocks.resisterBlock("deepslate_andalusite_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_AQUAMARINE_ORE = MagicBlocks.resisterBlock("deepslate_aquamarine_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_CHARCOAL_ORE = MagicBlocks.resisterBlock("deepslate_charcoal_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_CITRINE_ORE = MagicBlocks.resisterBlock("deepslate_citrine_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_DIOPSIDE_ORE = MagicBlocks.resisterBlock("deepslate_diopside_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_GARNET_ORE = MagicBlocks.resisterBlock("deepslate_garnet_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_HESSONITE_ORE = MagicBlocks.resisterBlock("deepslate_hessonite_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_MALICHITE_ORE = MagicBlocks.resisterBlock("deepslate_malichite_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_MOONSTONE_ORE = MagicBlocks.resisterBlock("deepslate_moonstone_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_OPAL_ORE = MagicBlocks.resisterBlock("deepslate_opal_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_PERIDOT_ORE = MagicBlocks.resisterBlock("deepslate_peridot_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_PREHNITE_ORE = MagicBlocks.resisterBlock("deepslate_prehnite_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_RUBY_ORE = MagicBlocks.resisterBlock("deepslate_ruby_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_SAPPHIRE_ORE = MagicBlocks.resisterBlock("deepslate_sapphire_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_SMOKY_QUARTZ_ORE = MagicBlocks.resisterBlock("deepslate_smoky_quartz_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_SPESSARITE_ORE = MagicBlocks.resisterBlock("deepslate_spessarite_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_SPHENE_ORE = MagicBlocks.resisterBlock("deepslate_sphene_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_SPINEL_ORE = MagicBlocks.resisterBlock("deepslate_spinel_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_TANZANITE_ORE = MagicBlocks.resisterBlock("deepslate_tanzanite_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_TOPAZ_ORE = MagicBlocks.resisterBlock("deepslate_topaz_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_TORMALINE_ORE = MagicBlocks.resisterBlock("deepslate_tormaline_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_TSAVORITE_ORE = MagicBlocks.resisterBlock("deepslate_tsavorite_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 DEEPSLATE_ZIRCON_ORE = MagicBlocks.resisterBlock("deepslate_zircon_ore", (class_2248)new class_2431((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15914).strength(3.0f, 3.0f).requiresTool(), (class_6017)class_6019.method_35017((int)2, (int)6)), ModItemGroup.MAGIC);
    public static final class_2248 AMBER_DUST = MagicBlocks.resisterBlock("amber_dust", (class_2248)new AmberDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 ANDALUSITE_DUST = MagicBlocks.resisterBlock("andalusite_dust", (class_2248)new AndalusiteDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 AQUAMARINE_DUST = MagicBlocks.resisterBlock("aquamarine_dust", (class_2248)new AquamarineDust(class_4970.class_2251.method_9637((class_3614)class_3614.field_15924).method_22488().method_9618()), ModItemGroup.MAGIC);
    public static final class_2248 CITRINE_DUST = MagicBlocks.resisterBlock("citrine_dust", (class_2248)new CitrineDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 DIOPSIDE_DUST = MagicBlocks.resisterBlock("diopside_dust", (class_2248)new DiopsideDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 GARNET_DUST = MagicBlocks.resisterBlock("garnet_dust", (class_2248)new GarnetDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 HESSONITE_DUST = MagicBlocks.resisterBlock("hessonite_dust", (class_2248)new HessoniteDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 MALICHITE_DUST = MagicBlocks.resisterBlock("malichite_dust", (class_2248)new MalichiteDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 MOONSTONE_DUST = MagicBlocks.resisterBlock("moonstone_dust", (class_2248)new MoonstoneDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 OPAL_DUST = MagicBlocks.resisterBlock("opal_dust", (class_2248)new OpalDust(class_4970.class_2251.method_9637((class_3614)class_3614.field_15924).method_22488().method_9618()), ModItemGroup.MAGIC);
    public static final class_2248 PERIDOT_DUST = MagicBlocks.resisterBlock("peridot_dust", (class_2248)new PeridotDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 PREHNITE_DUST = MagicBlocks.resisterBlock("prehnite_dust", (class_2248)new PreniteDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 RUBY_DUST = MagicBlocks.resisterBlock("ruby_dust", (class_2248)new RubyDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 SAPPHIRE_DUST = MagicBlocks.resisterBlock("sapphire_dust", (class_2248)new SapphireDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 SMOKY_QUARTZ_DUST = MagicBlocks.resisterBlock("smoky_quartz_dust", (class_2248)new SmokyQuartzDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 SPESSARITE_DUST = MagicBlocks.resisterBlock("spessarite_dust", (class_2248)new SpessariteDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 SPHENE_DUST = MagicBlocks.resisterBlock("sphene_dust", (class_2248)new SpheneDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 SPINEL_DUST = MagicBlocks.resisterBlock("spinel_dust", (class_2248)new SpinelDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 TANZANITE_DUST = MagicBlocks.resisterBlock("tanzanite_dust", (class_2248)new TanzaniteDust(class_4970.class_2251.method_9637((class_3614)class_3614.field_15924).method_22488().method_9618()), ModItemGroup.MAGIC);
    public static final class_2248 TOPAZ_DUST = MagicBlocks.resisterBlock("topaz_dust", (class_2248)new TopazDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 TORMALINE_DUST = MagicBlocks.resisterBlock("tormaline_dust", (class_2248)new TormalineDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 TSAVORITE_DUST = MagicBlocks.resisterBlock("tsavorite_dust", (class_2248)new TsavoriteDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 ZIRCON_DUST = MagicBlocks.resisterBlock("zircon_dust", (class_2248)new ZirconDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 AMETHYST_DUST = MagicBlocks.resisterBlock("amethyst_dust", (class_2248)new AmethystDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 CHARCOAL_DUST = MagicBlocks.resisterBlock("charcoal_dust", (class_2248)new CharcoalDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 COAL_DUST = MagicBlocks.resisterBlock("coal_dust", (class_2248)new CoalDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 COPPER_DUST = MagicBlocks.resisterBlock("copper_dust", (class_2248)new CopperDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 DIAMOND_DUST = MagicBlocks.resisterBlock("diamond_dust", (class_2248)new DiamondDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 EMERALD_DUST = MagicBlocks.resisterBlock("emerald_dust", (class_2248)new EmeraldDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 FLINT_DUST = MagicBlocks.resisterBlock("flint_dust", (class_2248)new FlintDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 GOLD_DUST = MagicBlocks.resisterBlock("gold_dust", (class_2248)new GoldDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 IRON_DUST = MagicBlocks.resisterBlock("iron_dust", (class_2248)new IronDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 LAPIS_DUST = MagicBlocks.resisterBlock("lapis_dust", (class_2248)new LapisDust((class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15924).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final class_2248 ABSORPTION_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("absorption_fluid_block", (class_2248)new AbsorptionFluidBlock(ModFluids.ABSORPTION_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 BAD_LUCK_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("bad_luck_fluid_block", (class_2248)new BadLuckFluidBlock(ModFluids.BAD_LUCK_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 BAD_OMEN_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("bad_omen_fluid_block", (class_2248)new BadOmenFluidBlock(ModFluids.BAD_OMEN_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 BLINDNESS_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("blindness_fluid_block", (class_2248)new BlindnessFluidBlock(ModFluids.BLINDNESS_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 CONDUIT_POWER_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("conduit_power_fluid_block", (class_2248)new ConduitPowerFluidBlock(ModFluids.CONDUIT_POWER_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 DARKNESS_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("darkness_fluid_block", (class_2248)new DarknessFluidBlock(ModFluids.DARKNESS_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 DOLPHINS_GRACE_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("dolphins_grace_fluid_block", (class_2248)new DolphinsGraceFluidBlock(ModFluids.DOLPHINS_GRACE_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 FIRE_IMMUNITY_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("fire_immunity_fluid_block", (class_2248)new FireImmunityFluidBlock(ModFluids.FIRE_IMMUNITY_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 GLOWING_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("glowing_fluid_block", (class_2248)new GlowingFluidBlock(ModFluids.GLOWING_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 HASTE_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("haste_fluid_block", (class_2248)new HasteFluidBlock(ModFluids.HASTE_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 HEALTH_BOOST_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("health_boost_fluid_block", (class_2248)new HealthBoostFluidBlock(ModFluids.HEALTH_BOOST_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 HUNGER_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("hunger_fluid_block", (class_2248)new HungerFluidBlock(ModFluids.HUNGER_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 INSTANT_DAMAGE_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("instant_damage_fluid_block", (class_2248)new InstantDamageFluidBlock(ModFluids.INSTANT_DAMAGE_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 INSTANT_HEALTH_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("instant_health_fluid_block", (class_2248)new InstantHealthFluidBlock(ModFluids.INSTANT_HEALTH_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 INVISIBILITY_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("invisibility_fluid_block", (class_2248)new InvisibilityFluidBlock(ModFluids.INVISIBILITY_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 JUMP_BOOST_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("jump_boost_fluid_block", (class_2248)new JumpBoostFluidBlock(ModFluids.JUMP_BOOST_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 LEVITATION_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("levitation_fluid_block", (class_2248)new LevitationFluidBlock(ModFluids.LEVITATION_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 LUCK_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("luck_fluid_block", (class_2248)new LuckFluidBlock(ModFluids.LUCK_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 MINING_FATIGUE_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("mining_fatigue_fluid_block", (class_2248)new MiningFatigueFluidBlock(ModFluids.MINING_FATIGUE_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 NAUSEA_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("nausea_fluid_block", (class_2248)new NauseaFluidBlock(ModFluids.NAUSEA_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 NIGHT_VISION_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("night_vision_fluid_block", (class_2248)new NightVisionFluidBlock(ModFluids.NIGHT_VISION_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 POISON_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("poison_fluid_block", (class_2248)new PoisonFluidBlock(ModFluids.POISON_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 REGENERATION_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("regeneration_fluid_block", (class_2248)new RegenerationFluidBlock(ModFluids.REGENERATION_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 RESISTANCE_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("resistance_fluid_block", (class_2248)new ResistanceFluidBlock(ModFluids.RESISTANCE_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 SATURATION_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("saturation_fluid_block", (class_2248)new SaturationFluidBlock(ModFluids.SATURATION_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 SLOW_FALLING_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("slow_falling_fluid_block", (class_2248)new SlowFallingFluidBlock(ModFluids.SLOW_FALLING_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 SLOWNESS_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("slowness_fluid_block", (class_2248)new SlownessFluidBlock(ModFluids.SLOWNESS_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 SPEED_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("speed_fluid_block", (class_2248)new SpeedFluidBlock(ModFluids.SPEED_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 STRENGTH_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("strength_fluid_block", (class_2248)new StrengthFluidBlock(ModFluids.STRENGTH_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 VILLAGE_HERO_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("village_hero_fluid_block", (class_2248)new VillageHeroFluidBlock(ModFluids.VILLAGE_HERO_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 WATER_BREATHING_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("water_breathing_fluid_block", (class_2248)new WaterBreathingFluidBlock(ModFluids.WATER_BREATHING_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 WEAKNESS_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("weakness_fluid_block", (class_2248)new WeaknessFluidBlock(ModFluids.WEAKNESS_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);
    public static final class_2248 WITHER_FLUID_BLOCK = MagicBlocks.registerBlockWithoutBlockItem("wither_fluid_block", (class_2248)new WitherFluidBlock(ModFluids.WITHER_FLUID_STILL, (class_4970.class_2251)FabricBlockSettings.of((class_3614)class_3614.field_15920).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MAGIC);

    private static Boolean always(class_2680 state, class_1922 world, class_2338 pos, class_1299<?> type) {
        return true;
    }

    private static class_2248 registerBlockWithoutBlockItem(String name, class_2248 block, class_1761 group) {
        return (class_2248)class_2378.method_10230((class_2378)class_7923.field_41175, (class_2960)new class_2960("hmh2", name), (Object)block);
    }

    private static class_2248 resisterBlock(String name, class_2248 block, class_1761 group) {
        MagicBlocks.registerBlockItem(name, block, group);
        return (class_2248)class_2378.method_10230((class_2378)class_7923.field_41175, (class_2960)new class_2960("hmh2", name), (Object)block);
    }

    private static class_1792 registerBlockItem(String name, class_2248 block, class_1761 group) {
        class_1792 item = (class_1792)class_2378.method_10230((class_2378)class_7923.field_41178, (class_2960)new class_2960("hmh2", name), (Object)new class_1747(block, (class_1792.class_1793)new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent((class_1761)group).register(entries -> entries.method_45421((class_1935)item));
        return item;
    }

    public static void registerModBlock() {
        Hmh2.LOGGER.info("Registering ModBlocks for hmh2");
    }
}

