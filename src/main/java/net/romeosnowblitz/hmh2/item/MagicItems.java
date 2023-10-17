package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.crafting.BaseCharmItem;
import net.romeosnowblitz.hmh2.crafting.JewelsCC;
import net.romeosnowblitz.hmh2.crafting.MixCharm;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.custom.magic.*;

import static net.minecraft.item.Items.BUCKET;

public class MagicItems {

    public static final Item SOUL_ESSENCE = registerItem("soul_essence", new Item(new FabricItemSettings()));
    public static final Item SUMMONING_POWDER = registerItem("summoning_powder", new SummoningPowder(new FabricItemSettings()));
    public static final Item BLUE_MAGIC_PASTE = registerItem("blue_magic_paste", new BluePaste(new FabricItemSettings()));
    public static final Item PURPLE_MAGIC_PASTE = registerItem("purple_magic_paste", new PurplePaste(new FabricItemSettings()));

    //Amulets
    public static final Item LOCKET = registerItem("locket", new Item(new FabricItemSettings()));
    public static final Item AMULET = registerItem("amulet", new Item(new FabricItemSettings()));
    public static final Item SPEED_AMULET = registerItem("amulet_of_acceleration", new MagicAmulet(StatusEffects.SPEED, 200, new FabricItemSettings()));
    public static final Item LEVITATION_AMULET = registerItem("amulet_of_antigravity", new MagicAmulet(StatusEffects.LEVITATION, 200, new FabricItemSettings().maxDamage(100)));
    public static final Item MINING_FATIGUE_AMULET = registerItem("amulet_of_arthritis", new MagicAmulet(StatusEffects.MINING_FATIGUE, 200, new FabricItemSettings().maxDamage(100)));
    public static final Item UNLUCK_AMULET = registerItem("amulet_of_bad_luck", new MagicAmulet(StatusEffects.UNLUCK, 200, new FabricItemSettings().maxDamage(64)));
    public static final Item INSTANT_DAMAGE_AMULET = registerItem("amulet_of_bricks", new MagicAmulet(StatusEffects.INSTANT_DAMAGE, 200, new FabricItemSettings().maxDamage(10)));
    public static final Item NAUSEA_AMULET = registerItem("amulet_of_bro_you_gotta_try_this", new MagicAmulet(StatusEffects.NAUSEA, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item WATER_BREATHING_AMULET = registerItem("amulet_of_bubbles", new MagicAmulet(StatusEffects.WATER_BREATHING, 200, new FabricItemSettings()));
    public static final Item INVISIBILITY_AMULET = registerItem("amulet_of_cloaking", new MagicAmulet(StatusEffects.INVISIBILITY, 200, new FabricItemSettings().maxDamage(100)));
    public static final Item BLINDNESS_AMULET = registerItem("amulet_of_closed_eyes", new MagicAmulet(StatusEffects.BLINDNESS, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item LUCK_AMULET = registerItem("amulet_of_clovers", new MagicAmulet(StatusEffects.LUCK, 200, new FabricItemSettings().maxDamage(64)));
    public static final Item WITHER_AMULET = registerItem("amulet_of_decay", new MagicAmulet(StatusEffects.WITHER, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item ABSORPTION_AMULET = registerItem("amulet_of_endurance", new MagicAmulet(StatusEffects.ABSORPTION, 200, new FabricItemSettings().maxDamage(100)));
    public static final Item HASTE_AMULET = registerItem("amulet_of_excavation", new MagicAmulet(StatusEffects.HASTE, 200, new FabricItemSettings()));
    public static final Item HEALTH_BOOST_AMULET = registerItem("amulet_of_extra_love", new MagicAmulet(StatusEffects.HEALTH_BOOST, 200, new FabricItemSettings().maxDamage(100)));
    public static final Item FIRE_IMMUNITY_AMULET = registerItem("amulet_of_flamelessness", new MagicAmulet(StatusEffects.FIRE_RESISTANCE, 200, new FabricItemSettings().maxDamage(128)));
    public static final Item WEAKNESS_AMULET = registerItem("amulet_of_frailty", new MagicAmulet(StatusEffects.WEAKNESS, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item CONDUIT_POWER_AMULET = registerItem("amulet_of_gills", new MagicAmulet(StatusEffects.CONDUIT_POWER, 200, new FabricItemSettings()));
    public static final Item HUNGER_AMULET = registerItem("amulet_of_gluttony", new MagicAmulet(StatusEffects.HUNGER, 200, new FabricItemSettings().maxDamage(64)));
    public static final Item REGENERATION_AMULET = registerItem("amulet_of_healing", new MagicAmulet(StatusEffects.REGENERATION, 200, new FabricItemSettings().maxDamage(32)));
    public static final Item STRENGTH_AMULET = registerItem("amulet_of_hercules", new MagicAmulet(StatusEffects.STRENGTH, 200, new FabricItemSettings().maxDamage(10)));
    public static final Item GLOWING_AMULET = registerItem("amulet_of_illumination", new MagicAmulet(StatusEffects.GLOWING, 200, new FabricItemSettings()));
    public static final Item JUMP_BOOST_AMULET = registerItem("amulet_of_leaping", new MagicAmulet(StatusEffects.JUMP_BOOST, 200, new FabricItemSettings().maxDamage(128)));
    public static final Item NIGHT_VISION_AMULET = registerItem("amulet_of_night_sight", new MagicAmulet(StatusEffects.NIGHT_VISION, 200, new FabricItemSettings()));
    public static final Item SATURATION_AMULET = registerItem("amulet_of_nourishment", new MagicAmulet(StatusEffects.SATURATION, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item DOLPHINS_GRACE_AMULET = registerItem("amulet_of_olympic_swimming", new MagicAmulet(StatusEffects.DOLPHINS_GRACE, 200, new FabricItemSettings()));
    public static final Item BAD_OMEN_AMULET = registerItem("amulet_of_raids", new MagicAmulet(StatusEffects.BAD_OMEN, 200, new FabricItemSettings().maxDamage(32)));
    public static final Item INSTANT_HEALTH_AMULET = registerItem("amulet_of_rejuvination", new MagicAmulet(StatusEffects.INSTANT_HEALTH, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item DARKNESS_AMULET = registerItem("amulet_of_shadows", new MagicAmulet(StatusEffects.DARKNESS, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item RESISTANCE_AMULET = registerItem("amulet_of_shielding", new MagicAmulet(StatusEffects.RESISTANCE, 200, new FabricItemSettings().maxDamage(32)));
    public static final Item POISON_AMULET = registerItem("amulet_of_sickening", new MagicAmulet(StatusEffects.POISON, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item SLOW_FALLING_AMULET = registerItem("amulet_of_the_phantom", new MagicAmulet(StatusEffects.SLOW_FALLING, 200, new FabricItemSettings()));
    public static final Item SLOWNESS_AMULET = registerItem("amulet_of_the_tortise", new MagicAmulet(StatusEffects.SLOWNESS, 200, new FabricItemSettings().maxDamage(64)));
    public static final Item VILLAGE_HERO_AMULET = registerItem("amulet_of_the_village_hero", new MagicAmulet(StatusEffects.HERO_OF_THE_VILLAGE, 200, new FabricItemSettings().maxDamage(100)));

    public static final Item ABSORPTION_FLUID = registerItem("absorption_fluid", new MagicBucket(StatusEffects.ABSORPTION, ModFluids.ABSORPTION_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item BAD_LUCK_FLUID = registerItem("bad_luck_fluid", new MagicBucket(StatusEffects.UNLUCK, ModFluids.BAD_LUCK_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item BAD_OMEN_FLUID = registerItem("bad_omen_fluid", new MagicBucket(StatusEffects.BAD_OMEN, ModFluids.BAD_OMEN_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item BLINDNESS_FLUID = registerItem("blindness_fluid", new MagicBucket(StatusEffects.BLINDNESS, ModFluids.BLINDNESS_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item CONDUIT_POWER_FLUID = registerItem("conduit_power_fluid", new MagicBucket(StatusEffects.CONDUIT_POWER, ModFluids.CONDUIT_POWER_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item DARKNESS_FLUID = registerItem("darkness_fluid", new MagicBucket(StatusEffects.DARKNESS, ModFluids.DARKNESS_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item DOLPHINS_GRACE_FLUID = registerItem("dolphins_grace_fluid", new MagicBucket(StatusEffects.DOLPHINS_GRACE, ModFluids.DOLPHINS_GRACE_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item FIRE_IMMUNITY_FLUID = registerItem("fire_immunity_fluid", new MagicBucket(StatusEffects.FIRE_RESISTANCE, ModFluids.FIRE_IMMUNITY_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item GLOWING_FLUID = registerItem("glowing_fluid", new MagicBucket(StatusEffects.GLOWING, ModFluids.GLOWING_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item HASTE_FLUID = registerItem("haste_fluid", new MagicBucket(StatusEffects.HASTE, ModFluids.HASTE_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item HEALTH_BOOST_FLUID = registerItem("health_boost_fluid", new MagicBucket(StatusEffects.HEALTH_BOOST, ModFluids.HEALTH_BOOST_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item HUNGER_FLUID = registerItem("hunger_fluid", new MagicBucket(StatusEffects.HUNGER, ModFluids.HUNGER_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item INSTANT_DAMAGE_FLUID = registerItem("instant_damage_fluid", new MagicBucket(StatusEffects.INSTANT_DAMAGE, ModFluids.INSTANT_DAMAGE_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item INSTANT_HEALTH_FLUID = registerItem("instant_health_fluid", new MagicBucket(StatusEffects.INSTANT_HEALTH, ModFluids.INSTANT_HEALTH_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item INVISIBILITY_FLUID = registerItem("invisibility_fluid", new MagicBucket(StatusEffects.INVISIBILITY, ModFluids.INVISIBILITY_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item JUMP_BOOST_FLUID = registerItem("jump_boost_fluid", new MagicBucket(StatusEffects.JUMP_BOOST, ModFluids.JUMP_BOOST_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item LEVITATION_FLUID = registerItem("levitation_fluid", new MagicBucket(StatusEffects.LEVITATION, ModFluids.LEVITATION_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item LUCK_FLUID = registerItem("luck_fluid", new MagicBucket(StatusEffects.LUCK, ModFluids.LUCK_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item MINING_FATIGUE_FLUID = registerItem("mining_fatigue_fluid", new MagicBucket(StatusEffects.MINING_FATIGUE, ModFluids.MINING_FATIGUE_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item NAUSEA_FLUID = registerItem("nausea_fluid", new MagicBucket(StatusEffects.NAUSEA, ModFluids.NAUSEA_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item NIGHT_VISION_FLUID = registerItem("night_vision_fluid", new MagicBucket(StatusEffects.NIGHT_VISION, ModFluids.NIGHT_VISION_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item POISON_FLUID = registerItem("poison_fluid", new MagicBucket(StatusEffects.POISON, ModFluids.POISON_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item REGENERATION_FLUID = registerItem("regeneration_fluid", new MagicBucket(StatusEffects.REGENERATION, ModFluids.REGENERATION_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item RESISTANCE_FLUID = registerItem("resistance_fluid", new MagicBucket(StatusEffects.RESISTANCE, ModFluids.RESISTANCE_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item SATURATION_FLUID = registerItem("saturation_fluid", new MagicBucket(StatusEffects.SATURATION, ModFluids.SATURATION_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item SLOW_FALLING_FLUID = registerItem("slow_falling_fluid", new MagicBucket(StatusEffects.SLOW_FALLING, ModFluids.SLOW_FALLING_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item SLOWNESS_FLUID = registerItem("slowness_fluid", new MagicBucket(StatusEffects.SLOWNESS, ModFluids.SLOWNESS_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item SPEED_FLUID = registerItem("speed_fluid", new MagicBucket(StatusEffects.SPEED, ModFluids.SPEED_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item STRENGTH_FLUID = registerItem("strength_fluid", new MagicBucket(StatusEffects.STRENGTH, ModFluids.STRENGTH_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item VILLAGE_HERO_FLUID = registerItem("village_hero_fluid", new MagicBucket(StatusEffects.HERO_OF_THE_VILLAGE, ModFluids.VILLAGE_HERO_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item WATER_BREATHING_FLUID = registerItem("water_breathing_fluid", new MagicBucket(StatusEffects.WATER_BREATHING, ModFluids.WATER_BREATHING_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item WEAKNESS_FLUID = registerItem("weakness_fluid", new MagicBucket(StatusEffects.WEAKNESS, ModFluids.WEAKNESS_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item WITHER_FLUID = registerItem("wither_fluid", new MagicBucket(StatusEffects.WITHER, ModFluids.WITHER_FLUID_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));

    //Gems (23)
    public static final Item AMBER = registerItem("amber", new JewelsCC(MagicItems.FIRE_IMMUNITY_AMULET, MagicItems.FIRE_IMMUNITY_FLUID, new FabricItemSettings()));
    public static final Item ANDALUSITE = registerItem("andalusite", new JewelsCC(MagicItems.MINING_FATIGUE_AMULET, MagicItems.MINING_FATIGUE_FLUID, new FabricItemSettings()));
    public static final Item AQUAMARINE = registerItem("aquamarine", new JewelsCC(MagicItems.DOLPHINS_GRACE_AMULET, MagicItems.DOLPHINS_GRACE_FLUID, new FabricItemSettings()));
    public static final Item CITRINE = registerItem("citrine", new JewelsCC(MagicItems.HEALTH_BOOST_AMULET, MagicItems.HEALTH_BOOST_FLUID, new FabricItemSettings()));
    public static final Item DIOPSIDE = registerItem("diopside", new JewelsCC(MagicItems.BAD_OMEN_AMULET, MagicItems.BAD_OMEN_FLUID, new FabricItemSettings()));
    public static final Item GARNET = registerItem("garnet", new JewelsCC(MagicItems.INSTANT_DAMAGE_AMULET, MagicItems.INSTANT_DAMAGE_FLUID, new FabricItemSettings()));
    public static final Item HESSONITE = registerItem("hessonite", new JewelsCC(MagicItems.STRENGTH_AMULET, MagicItems.STRENGTH_FLUID,  new FabricItemSettings()));
    public static final Item MALICHITE = registerItem("malichite", new JewelsCC(MagicItems.HUNGER_AMULET, MagicItems.HUNGER_FLUID, new FabricItemSettings()));
    public static final Item MOONSTONE = registerItem("moonstone", new JewelsCC(MagicItems.SLOWNESS_AMULET, MagicItems.SLOWNESS_FLUID, new FabricItemSettings()));
    public static final Item OPAL = registerItem("opal", new JewelsCC(MagicItems.CONDUIT_POWER_AMULET, MagicItems.CONDUIT_POWER_FLUID, new FabricItemSettings()));
    public static final Item PERIDOT = registerItem("peridot", new JewelsCC(MagicItems.JUMP_BOOST_AMULET, MagicItems.JUMP_BOOST_FLUID, new FabricItemSettings()));
    public static final Item PREHNITE = registerItem("prehnite", new JewelsCC(MagicItems.POISON_AMULET, MagicItems.POISON_FLUID, new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new JewelsCC(MagicItems.SATURATION_AMULET, MagicItems.SATURATION_FLUID, new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new JewelsCC(MagicItems.NIGHT_VISION_AMULET, MagicItems.NIGHT_VISION_FLUID, new FabricItemSettings()));
    public static final Item SMOKY_QUARTZ = registerItem("smoky_quartz", new JewelsCC(MagicItems.WITHER_AMULET, MagicItems.WITHER_FLUID, new FabricItemSettings()));
    public static final Item SPESSARITE = registerItem("spessarite", new JewelsCC(MagicItems.INSTANT_HEALTH_AMULET, MagicItems.INSTANT_HEALTH_FLUID, new FabricItemSettings()));
    public static final Item SPHENE = registerItem("sphene", new JewelsCC(MagicItems.LUCK_AMULET, MagicItems.LUCK_FLUID,  new FabricItemSettings()));
    public static final Item SPINEL = registerItem("spinel", new JewelsCC(MagicItems.RESISTANCE_AMULET, MagicItems.RESISTANCE_FLUID, new FabricItemSettings()));
    public static final Item TANZANITE = registerItem("tanzanite", new JewelsCC(MagicItems.WATER_BREATHING_AMULET, MagicItems.WATER_BREATHING_FLUID, new FabricItemSettings()));
    public static final Item TOPAZ = registerItem("topaz", new JewelsCC(MagicItems.UNLUCK_AMULET, MagicItems.BAD_LUCK_FLUID, new FabricItemSettings()));
    public static final Item TORMALINE = registerItem("tormaline", new JewelsCC(MagicItems.REGENERATION_AMULET, MagicItems.REGENERATION_FLUID, new FabricItemSettings()));
    public static final Item TSAVORITE = registerItem("tsavorite", new JewelsCC(MagicItems.GLOWING_AMULET, MagicItems.GLOWING_FLUID, new FabricItemSettings()));
    public static final Item ZIRCON = registerItem("zircon", new JewelsCC(MagicItems.SLOW_FALLING_AMULET, MagicItems.SLOW_FALLING_FLUID, new FabricItemSettings()));

    //Charms
    public static final Item FIGHT_CHARM = registerItem("fight_charm", new BaseCharmItem(StatusEffects.POISON, StatusEffects.WITHER, new FabricItemSettings()));
    public static final Item LIGHT_CHARM = registerItem("light_charm", new BaseCharmItem(StatusEffects.MINING_FATIGUE, StatusEffects.SLOWNESS, new FabricItemSettings()));
    public static final Item MIGHT_CHARM = registerItem("might_charm", new BaseCharmItem(StatusEffects.HUNGER, StatusEffects.NAUSEA, new FabricItemSettings()));
    public static final Item SIGHT_CHARM = registerItem("sight_charm", new BaseCharmItem(StatusEffects.BLINDNESS, StatusEffects.DARKNESS, new FabricItemSettings()));
    public static final Item FLIGHT_CHARM = registerItem("flight_charm", new MixCharm(new FabricItemSettings()));
    public static final Item SLIGHT_CHARM = registerItem("slight_charm", new MixCharm(new FabricItemSettings()));
    public static final Item ALIGHT_CHARM = registerItem("alight_charm", new MixCharm(new FabricItemSettings()));
    public static final Item BLIGHT_CHARM = registerItem("blight_charm", new MixCharm(new FabricItemSettings()));
    public static final Item BRIGHT_CHARM = registerItem("bright_charm", new MixCharm(new FabricItemSettings()));
    public static final Item FRIGHT_CHARM = registerItem("fright_charm", new MixCharm(new FabricItemSettings()));
    public static final Item KNIGHT_CHARM = registerItem("knight_charm", new KnightCharmItem(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Hmh2.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Hmh2.LOGGER.info("Registering Mod Items for " + Hmh2.MOD_ID);
    }

}
