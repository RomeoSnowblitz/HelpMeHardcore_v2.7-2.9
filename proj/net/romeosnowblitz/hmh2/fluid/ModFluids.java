/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2378
 *  net.minecraft.class_2960
 *  net.minecraft.class_3609
 *  net.minecraft.class_7923
 */
package net.romeosnowblitz.hmh2.fluid;

import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_3609;
import net.minecraft.class_7923;
import net.romeosnowblitz.hmh2.fluid.ChocolateMilkFluid;
import net.romeosnowblitz.hmh2.fluid.HeatedOilFluid;
import net.romeosnowblitz.hmh2.fluid.HoneyFluid;
import net.romeosnowblitz.hmh2.fluid.OilFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.AbsorptionFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.BadLuckFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.BadOmenFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.BlindnessFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.ConduitPowerFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.DarknessFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.DolphinsGraceFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.FireImmunityFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.GlowingFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.HasteFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.HealthBoostFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.HungerFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.InstantDamageFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.InstantHealthFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.InvisibilityFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.JumpBoostFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.LevetationFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.LuckFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.MiningFatigueFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.NauseaFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.NightVisionFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.PoisonFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.RegenerationFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.ResistanceFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.SaturationFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.SlowFallingFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.SlownessFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.SpeedFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.StrengthFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.VillageHeroFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.WaterBreathingFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.WeaknessFluid;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.WitherFluid;

public class ModFluids {
    public static final class_3609 CHOCOLATE_MILK_STILL = ModFluids.register("chocolate_milk_still", new ChocolateMilkFluid.Still());
    public static final class_3609 CHOCOLATE_MILK_FLOWING = ModFluids.register("chocolate_milk_flowing", new ChocolateMilkFluid.Flowing());
    public static final class_3609 HEATED_OIL_STILL = ModFluids.register("heated_oil_still", new HeatedOilFluid.Still());
    public static final class_3609 HEATED_OIL_FLOWING = ModFluids.register("heated_oil_flowing", new HeatedOilFluid.Flowing());
    public static final class_3609 HONEY_STILL = ModFluids.register("honey_still", new HoneyFluid.Still());
    public static final class_3609 HONEY_FLOWING = ModFluids.register("honey_flowing", new HoneyFluid.Flowing());
    public static final class_3609 OIL_STILL = ModFluids.register("oil_still", new OilFluid.Still());
    public static final class_3609 OIL_FLOWING = ModFluids.register("oil_flowing", new OilFluid.Flowing());
    public static final class_3609 ABSORPTION_FLUID_STILL = ModFluids.register("absorption_still", new AbsorptionFluid.Still());
    public static final class_3609 ABSORPTION_FLUID_FLOWING = ModFluids.register("absorption_flowing", new AbsorptionFluid.Flowing());
    public static final class_3609 BAD_LUCK_FLUID_STILL = ModFluids.register("bad_luck_still", new BadLuckFluid.Still());
    public static final class_3609 BAD_LUCK_FLUID_FLOWING = ModFluids.register("bad_luck_flowing", new BadLuckFluid.Flowing());
    public static final class_3609 BAD_OMEN_FLUID_STILL = ModFluids.register("bad_omen_still", new BadOmenFluid.Still());
    public static final class_3609 BAD_OMEN_FLUID_FLOWING = ModFluids.register("bad_omen_flowing", new BadOmenFluid.Flowing());
    public static final class_3609 BLINDNESS_FLUID_STILL = ModFluids.register("blindness_still", new BlindnessFluid.Still());
    public static final class_3609 BLINDNESS_FLUID_FLOWING = ModFluids.register("blindness_flowing", new BlindnessFluid.Flowing());
    public static final class_3609 CONDUIT_POWER_FLUID_STILL = ModFluids.register("conduit_power_still", new ConduitPowerFluid.Still());
    public static final class_3609 CONDUIT_POWER_FLUID_FLOWING = ModFluids.register("conduit_power_flowing", new ConduitPowerFluid.Flowing());
    public static final class_3609 DARKNESS_FLUID_STILL = ModFluids.register("darkness_still", new DarknessFluid.Still());
    public static final class_3609 DARKNESS_FLUID_FLOWING = ModFluids.register("darkness_flowing", new DarknessFluid.Flowing());
    public static final class_3609 DOLPHINS_GRACE_FLUID_STILL = ModFluids.register("dolphins_grace_still", new DolphinsGraceFluid.Still());
    public static final class_3609 DOLPHINS_GRACE_FLUID_FLOWING = ModFluids.register("dolphins_grace_flowing", new DolphinsGraceFluid.Flowing());
    public static final class_3609 FIRE_IMMUNITY_FLUID_STILL = ModFluids.register("fire_immunity_still", new FireImmunityFluid.Still());
    public static final class_3609 FIRE_IMMUNITY_FLUID_FLOWING = ModFluids.register("fire_immunity_flowing", new FireImmunityFluid.Flowing());
    public static final class_3609 GLOWING_FLUID_STILL = ModFluids.register("glowing_still", new GlowingFluid.Still());
    public static final class_3609 GLOWING_FLUID_FLOWING = ModFluids.register("glowing_flowing", new GlowingFluid.Flowing());
    public static final class_3609 HASTE_FLUID_STILL = ModFluids.register("haste_still", new HasteFluid.Still());
    public static final class_3609 HASTE_FLUID_FLOWING = ModFluids.register("haste_flowing", new HasteFluid.Flowing());
    public static final class_3609 HEALTH_BOOST_FLUID_STILL = ModFluids.register("health_boost_still", new HealthBoostFluid.Still());
    public static final class_3609 HEALTH_BOOST_FLUID_FLOWING = ModFluids.register("health_boost_flowing", new HealthBoostFluid.Flowing());
    public static final class_3609 HUNGER_FLUID_STILL = ModFluids.register("hunger_still", new HungerFluid.Still());
    public static final class_3609 HUNGER_FLUID_FLOWING = ModFluids.register("hunger_flowing", new HungerFluid.Flowing());
    public static final class_3609 INSTANT_DAMAGE_FLUID_STILL = ModFluids.register("instant_damage_still", new InstantDamageFluid.Still());
    public static final class_3609 INSTANT_DAMAGE_FLUID_FLOWING = ModFluids.register("instant_damage_flowing", new InstantDamageFluid.Flowing());
    public static final class_3609 INSTANT_HEALTH_FLUID_STILL = ModFluids.register("instant_health_still", new InstantHealthFluid.Still());
    public static final class_3609 INSTANT_HEALTH_FLUID_FLOWING = ModFluids.register("instant_health_flowing", new InstantHealthFluid.Flowing());
    public static final class_3609 INVISIBILITY_FLUID_STILL = ModFluids.register("invisibility_still", new InvisibilityFluid.Still());
    public static final class_3609 INVISIBILITY_FLUID_FLOWING = ModFluids.register("invisibility_flowing", new InvisibilityFluid.Flowing());
    public static final class_3609 JUMP_BOOST_FLUID_STILL = ModFluids.register("jump_boost_still", new JumpBoostFluid.Still());
    public static final class_3609 JUMP_BOOST_FLUID_FLOWING = ModFluids.register("jump_boost_flowing", new JumpBoostFluid.Flowing());
    public static final class_3609 LEVITATION_FLUID_STILL = ModFluids.register("levitation_still", new LevetationFluid.Still());
    public static final class_3609 LEVITATION_FLUID_FLOWING = ModFluids.register("levitation_flowing", new LevetationFluid.Flowing());
    public static final class_3609 LUCK_FLUID_STILL = ModFluids.register("luck_still", new LuckFluid.Still());
    public static final class_3609 LUCK_FLUID_FLOWING = ModFluids.register("luck_flowing", new LuckFluid.Flowing());
    public static final class_3609 MINING_FATIGUE_FLUID_STILL = ModFluids.register("mining_fatigue_still", new MiningFatigueFluid.Still());
    public static final class_3609 MINING_FATIGUE_FLUID_FLOWING = ModFluids.register("mining_fatigue_flowing", new MiningFatigueFluid.Flowing());
    public static final class_3609 NAUSEA_FLUID_STILL = ModFluids.register("nausea_still", new NauseaFluid.Still());
    public static final class_3609 NAUSEA_FLUID_FLOWING = ModFluids.register("nausea_flowing", new NauseaFluid.Flowing());
    public static final class_3609 NIGHT_VISION_FLUID_STILL = ModFluids.register("night_vision_still", new NightVisionFluid.Still());
    public static final class_3609 NIGHT_VISION_FLUID_FLOWING = ModFluids.register("night_vision_flowing", new NightVisionFluid.Flowing());
    public static final class_3609 POISON_FLUID_STILL = ModFluids.register("poison_still", new PoisonFluid.Still());
    public static final class_3609 POISON_FLUID_FLOWING = ModFluids.register("poison_flowing", new PoisonFluid.Flowing());
    public static final class_3609 REGENERATION_FLUID_STILL = ModFluids.register("regeneration_still", new RegenerationFluid.Still());
    public static final class_3609 REGENERATION_FLUID_FLOWING = ModFluids.register("regeneration_flowing", new RegenerationFluid.Flowing());
    public static final class_3609 RESISTANCE_FLUID_STILL = ModFluids.register("resistance_still", new ResistanceFluid.Still());
    public static final class_3609 RESISTANCE_FLUID_FLOWING = ModFluids.register("resistance_flowing", new ResistanceFluid.Flowing());
    public static final class_3609 SATURATION_FLUID_STILL = ModFluids.register("saturation_still", new SaturationFluid.Still());
    public static final class_3609 SATURATION_FLUID_FLOWING = ModFluids.register("saturation_flowing", new SaturationFluid.Flowing());
    public static final class_3609 SLOW_FALLING_FLUID_STILL = ModFluids.register("slow_falling_still", new SlowFallingFluid.Still());
    public static final class_3609 SLOW_FALLING_FLUID_FLOWING = ModFluids.register("slow_falling_flowing", new SlowFallingFluid.Flowing());
    public static final class_3609 SLOWNESS_FLUID_STILL = ModFluids.register("slowness_still", new SlownessFluid.Still());
    public static final class_3609 SLOWNESS_FLUID_FLOWING = ModFluids.register("slowness_flowing", new SlownessFluid.Flowing());
    public static final class_3609 SPEED_FLUID_STILL = ModFluids.register("speed_still", new SpeedFluid.Still());
    public static final class_3609 SPEED_FLUID_FLOWING = ModFluids.register("speed_flowing", new SpeedFluid.Flowing());
    public static final class_3609 STRENGTH_FLUID_STILL = ModFluids.register("strength_still", new StrengthFluid.Still());
    public static final class_3609 STRENGTH_FLUID_FLOWING = ModFluids.register("strength_flowing", new StrengthFluid.Flowing());
    public static final class_3609 VILLAGE_HERO_FLUID_STILL = ModFluids.register("village_hero_still", new VillageHeroFluid.Still());
    public static final class_3609 VILLAGE_HERO_FLUID_FLOWING = ModFluids.register("village_hero_flowing", new VillageHeroFluid.Flowing());
    public static final class_3609 WATER_BREATHING_FLUID_STILL = ModFluids.register("water_breathing_still", new WaterBreathingFluid.Still());
    public static final class_3609 WATER_BREATHING_FLUID_FLOWING = ModFluids.register("water_breathing_flowing", new WaterBreathingFluid.Flowing());
    public static final class_3609 WEAKNESS_FLUID_STILL = ModFluids.register("weakness_still", new WeaknessFluid.Still());
    public static final class_3609 WEAKNESS_FLUID_FLOWING = ModFluids.register("weakness_flowing", new WeaknessFluid.Flowing());
    public static final class_3609 WITHER_FLUID_STILL = ModFluids.register("wither_still", new WitherFluid.Still());
    public static final class_3609 WITHER_FLUID_FLOWING = ModFluids.register("wither_flowing", new WitherFluid.Flowing());

    private static class_3609 register(String name, class_3609 flowableFluid) {
        return (class_3609)class_2378.method_10230((class_2378)class_7923.field_41173, (class_2960)new class_2960("hmh2", name), (Object)flowableFluid);
    }
}

