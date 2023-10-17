package net.romeosnowblitz.hmh2.fluid;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.fluid.magic_fluids.*;

public class ModFluids {
    public static final FlowableFluid CHOCOLATE_MILK_STILL = register("chocolate_milk_still", new ChocolateMilkFluid.Still());
    public static final FlowableFluid CHOCOLATE_MILK_FLOWING = register("chocolate_milk_flowing", new ChocolateMilkFluid.Flowing());
    public static final FlowableFluid HEATED_OIL_STILL = register("heated_oil_still", new HeatedOilFluid.Still());
    public static final FlowableFluid HEATED_OIL_FLOWING = register("heated_oil_flowing", new HeatedOilFluid.Flowing());
    public static final FlowableFluid HONEY_STILL = register("honey_still", new HoneyFluid.Still());
    public static final FlowableFluid HONEY_FLOWING = register("honey_flowing", new HoneyFluid.Flowing());
    public static final FlowableFluid OIL_STILL = register("oil_still", new OilFluid.Still());
    public static final FlowableFluid OIL_FLOWING = register("oil_flowing", new OilFluid.Flowing());
    public static final FlowableFluid QUICKSAND_STILL = register("quicksand_still", new QuickSandFluid.Still());
    public static final FlowableFluid QUICKSAND_FLOWING = register("quicksand_flowing", new QuickSandFluid.Flowing());

    //Magic
    public static final FlowableFluid ABSORPTION_FLUID_STILL = register("absorption_still", new AbsorptionFluid.Still());
    public static final FlowableFluid ABSORPTION_FLUID_FLOWING = register("absorption_flowing", new AbsorptionFluid.Flowing());
    public static final FlowableFluid BAD_LUCK_FLUID_STILL = register("bad_luck_still", new BadLuckFluid.Still());
    public static final FlowableFluid BAD_LUCK_FLUID_FLOWING = register("bad_luck_flowing", new BadLuckFluid.Flowing());
    public static final FlowableFluid BAD_OMEN_FLUID_STILL = register("bad_omen_still", new BadOmenFluid.Still());
    public static final FlowableFluid BAD_OMEN_FLUID_FLOWING = register("bad_omen_flowing", new BadOmenFluid.Flowing());
    public static final FlowableFluid BLINDNESS_FLUID_STILL = register("blindness_still", new BlindnessFluid.Still());
    public static final FlowableFluid BLINDNESS_FLUID_FLOWING = register("blindness_flowing", new BlindnessFluid.Flowing());
    public static final FlowableFluid CONDUIT_POWER_FLUID_STILL = register("conduit_power_still", new ConduitPowerFluid.Still());
    public static final FlowableFluid CONDUIT_POWER_FLUID_FLOWING = register("conduit_power_flowing", new ConduitPowerFluid.Flowing());
    public static final FlowableFluid DARKNESS_FLUID_STILL = register("darkness_still", new DarknessFluid.Still());
    public static final FlowableFluid DARKNESS_FLUID_FLOWING = register("darkness_flowing", new DarknessFluid.Flowing());
    public static final FlowableFluid DOLPHINS_GRACE_FLUID_STILL = register("dolphins_grace_still", new DolphinsGraceFluid.Still());
    public static final FlowableFluid DOLPHINS_GRACE_FLUID_FLOWING = register("dolphins_grace_flowing", new DolphinsGraceFluid.Flowing());
    public static final FlowableFluid FIRE_IMMUNITY_FLUID_STILL = register("fire_immunity_still", new FireImmunityFluid.Still());
    public static final FlowableFluid FIRE_IMMUNITY_FLUID_FLOWING = register("fire_immunity_flowing", new FireImmunityFluid.Flowing());
    public static final FlowableFluid GLOWING_FLUID_STILL = register("glowing_still", new GlowingFluid.Still());
    public static final FlowableFluid GLOWING_FLUID_FLOWING = register("glowing_flowing", new GlowingFluid.Flowing());
    public static final FlowableFluid HASTE_FLUID_STILL = register("haste_still", new HasteFluid.Still());
    public static final FlowableFluid HASTE_FLUID_FLOWING = register("haste_flowing", new HasteFluid.Flowing());
    public static final FlowableFluid HEALTH_BOOST_FLUID_STILL = register("health_boost_still", new HealthBoostFluid.Still());
    public static final FlowableFluid HEALTH_BOOST_FLUID_FLOWING = register("health_boost_flowing", new HealthBoostFluid.Flowing());
    public static final FlowableFluid HUNGER_FLUID_STILL = register("hunger_still", new HungerFluid.Still());
    public static final FlowableFluid HUNGER_FLUID_FLOWING = register("hunger_flowing", new HungerFluid.Flowing());
    public static final FlowableFluid INSTANT_DAMAGE_FLUID_STILL = register("instant_damage_still", new InstantDamageFluid.Still());
    public static final FlowableFluid INSTANT_DAMAGE_FLUID_FLOWING = register("instant_damage_flowing", new InstantDamageFluid.Flowing());
    public static final FlowableFluid INSTANT_HEALTH_FLUID_STILL = register("instant_health_still", new InstantHealthFluid.Still());
    public static final FlowableFluid INSTANT_HEALTH_FLUID_FLOWING = register("instant_health_flowing", new InstantHealthFluid.Flowing());
    public static final FlowableFluid INVISIBILITY_FLUID_STILL = register("invisibility_still", new InvisibilityFluid.Still());
    public static final FlowableFluid INVISIBILITY_FLUID_FLOWING = register("invisibility_flowing", new InvisibilityFluid.Flowing());
    public static final FlowableFluid JUMP_BOOST_FLUID_STILL = register("jump_boost_still", new JumpBoostFluid.Still());
    public static final FlowableFluid JUMP_BOOST_FLUID_FLOWING = register("jump_boost_flowing", new JumpBoostFluid.Flowing());
    public static final FlowableFluid LEVITATION_FLUID_STILL = register("levitation_still", new LevetationFluid.Still());
    public static final FlowableFluid LEVITATION_FLUID_FLOWING = register("levitation_flowing", new LevetationFluid.Flowing());
    public static final FlowableFluid LUCK_FLUID_STILL = register("luck_still", new LuckFluid.Still());
    public static final FlowableFluid LUCK_FLUID_FLOWING = register("luck_flowing", new LuckFluid.Flowing());
    public static final FlowableFluid MINING_FATIGUE_FLUID_STILL = register("mining_fatigue_still", new MiningFatigueFluid.Still());
    public static final FlowableFluid MINING_FATIGUE_FLUID_FLOWING = register("mining_fatigue_flowing", new MiningFatigueFluid.Flowing());
    public static final FlowableFluid NAUSEA_FLUID_STILL = register("nausea_still", new NauseaFluid.Still());
    public static final FlowableFluid NAUSEA_FLUID_FLOWING = register("nausea_flowing", new NauseaFluid.Flowing());
    public static final FlowableFluid NIGHT_VISION_FLUID_STILL = register("night_vision_still", new NightVisionFluid.Still());
    public static final FlowableFluid NIGHT_VISION_FLUID_FLOWING = register("night_vision_flowing", new NightVisionFluid.Flowing());
    public static final FlowableFluid POISON_FLUID_STILL = register("poison_still", new PoisonFluid.Still());
    public static final FlowableFluid POISON_FLUID_FLOWING = register("poison_flowing", new PoisonFluid.Flowing());
    public static final FlowableFluid REGENERATION_FLUID_STILL = register("regeneration_still", new RegenerationFluid.Still());
    public static final FlowableFluid REGENERATION_FLUID_FLOWING = register("regeneration_flowing", new RegenerationFluid.Flowing());
    public static final FlowableFluid RESISTANCE_FLUID_STILL = register("resistance_still", new ResistanceFluid.Still());
    public static final FlowableFluid RESISTANCE_FLUID_FLOWING = register("resistance_flowing", new ResistanceFluid.Flowing());
    public static final FlowableFluid SATURATION_FLUID_STILL = register("saturation_still", new SaturationFluid.Still());
    public static final FlowableFluid SATURATION_FLUID_FLOWING = register("saturation_flowing", new SaturationFluid.Flowing());
    public static final FlowableFluid SLOW_FALLING_FLUID_STILL = register("slow_falling_still", new SlowFallingFluid.Still());
    public static final FlowableFluid SLOW_FALLING_FLUID_FLOWING = register("slow_falling_flowing", new SlowFallingFluid.Flowing());
    public static final FlowableFluid SLOWNESS_FLUID_STILL = register("slowness_still", new SlownessFluid.Still());
    public static final FlowableFluid SLOWNESS_FLUID_FLOWING = register("slowness_flowing", new SlownessFluid.Flowing());
    public static final FlowableFluid SPEED_FLUID_STILL = register("speed_still", new SpeedFluid.Still());
    public static final FlowableFluid SPEED_FLUID_FLOWING = register("speed_flowing", new SpeedFluid.Flowing());
    public static final FlowableFluid STRENGTH_FLUID_STILL = register("strength_still", new StrengthFluid.Still());
    public static final FlowableFluid STRENGTH_FLUID_FLOWING = register("strength_flowing", new StrengthFluid.Flowing());
    public static final FlowableFluid VILLAGE_HERO_FLUID_STILL = register("village_hero_still", new VillageHeroFluid.Still());
    public static final FlowableFluid VILLAGE_HERO_FLUID_FLOWING = register("village_hero_flowing", new VillageHeroFluid.Flowing());
    public static final FlowableFluid WATER_BREATHING_FLUID_STILL = register("water_breathing_still", new WaterBreathingFluid.Still());
    public static final FlowableFluid WATER_BREATHING_FLUID_FLOWING = register("water_breathing_flowing", new WaterBreathingFluid.Flowing());
    public static final FlowableFluid WEAKNESS_FLUID_STILL = register("weakness_still", new WeaknessFluid.Still());
    public static final FlowableFluid WEAKNESS_FLUID_FLOWING = register("weakness_flowing", new WeaknessFluid.Flowing());
    public static final FlowableFluid WITHER_FLUID_STILL = register("wither_still", new WitherFluid.Still());
    public static final FlowableFluid WITHER_FLUID_FLOWING = register("wither_flowing", new WitherFluid.Flowing());

    private static FlowableFluid register(String name, FlowableFluid flowableFluid) {
        return Registry.register(Registries.FLUID, new Identifier(Hmh2.MOD_ID, name), flowableFluid);
    }


}
