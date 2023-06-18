package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.custom.magic.MagicAmulet;
import net.romeosnowblitz.hmh2.item.custom.magic.MagicBucket;
import net.romeosnowblitz.hmh2.item.custom.magic.charms.*;

import static net.minecraft.item.Items.BUCKET;

public class MagicItems {

    //Gems (23)
    public static final Item AMBER = registerItem("amber", new Item(new FabricItemSettings()));
    public static final Item ANDALUSITE = registerItem("andalusite", new Item(new FabricItemSettings()));
    public static final Item AQUAMARINE = registerItem("aquamarine", new Item(new FabricItemSettings()));
    public static final Item CITRINE = registerItem("citrine", new Item(new FabricItemSettings()));
    public static final Item DIOPSIDE = registerItem("diopside", new Item(new FabricItemSettings()));
    public static final Item GARNET = registerItem("garnet", new Item(new FabricItemSettings()));
    public static final Item HESSONITE = registerItem("hessonite", new Item(new FabricItemSettings()));
    public static final Item MALICHITE = registerItem("malichite", new Item(new FabricItemSettings()));
    public static final Item MOONSTONE = registerItem("moonstone", new Item(new FabricItemSettings()));
    public static final Item OPAL = registerItem("opal", new Item(new FabricItemSettings()));
    public static final Item PERIDOT = registerItem("peridot", new Item(new FabricItemSettings()));
    public static final Item PREHNITE = registerItem("prehnite", new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item SMOKY_QUARTZ = registerItem("smoky_quartz", new Item(new FabricItemSettings()));
    public static final Item SPESSARITE = registerItem("spessarite", new Item(new FabricItemSettings()));
    public static final Item SPHENE = registerItem("sphene", new Item(new FabricItemSettings()));
    public static final Item SPINEL = registerItem("spinel", new Item(new FabricItemSettings()));
    public static final Item TANZANITE = registerItem("tanzanite", new Item(new FabricItemSettings()));
    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings()));
    public static final Item TORMALINE = registerItem("tormaline", new Item(new FabricItemSettings()));
    public static final Item TSAVORITE = registerItem("tsavorite", new Item(new FabricItemSettings()));
    public static final Item ZIRCON = registerItem("zircon", new Item(new FabricItemSettings()));

    //Lockets
    public static final Item AMBER_LOCKET = registerItem("amber_locket", new Item(new FabricItemSettings()));
    public static final Item AMETHYST_LOCKET = registerItem("amethyst_locket", new Item(new FabricItemSettings()));
    public static final Item ANDALUSITE_LOCKET = registerItem("andalusite_locket", new Item(new FabricItemSettings()));
    public static final Item AQUAMARINE_LOCKET = registerItem("aquamarine_locket", new Item(new FabricItemSettings()));
    public static final Item CHARCOAL_LOCKET = registerItem("charcoal_locket", new Item(new FabricItemSettings()));
    public static final Item CITRINE_LOCKET = registerItem("citrine_locket", new Item(new FabricItemSettings()));
    public static final Item COAL_LOCKET = registerItem("coal_locket", new Item(new FabricItemSettings()));
    public static final Item COPPER_LOCKET = registerItem("copper_locket", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_LOCKET = registerItem("diamond_locket", new Item(new FabricItemSettings()));
    public static final Item DIOPSIDE_LOCKET = registerItem("diopside_locket", new Item(new FabricItemSettings()));
    public static final Item EMERALD_LOCKET = registerItem("emerald_locket", new Item(new FabricItemSettings()));
    public static final Item FLINT_LOCKET = registerItem("flint_locket", new Item(new FabricItemSettings()));
    public static final Item GARNET_LOCKET = registerItem("garnet_locket", new Item(new FabricItemSettings()));
    public static final Item GOLD_LOCKET = registerItem("gold_locket", new Item(new FabricItemSettings()));
    public static final Item HESSONITE_LOCKET = registerItem("hessonite_locket", new Item(new FabricItemSettings()));
    public static final Item IRON_LOCKET = registerItem("iron_locket", new Item(new FabricItemSettings()));
    public static final Item LAPIS_LOCKET = registerItem("lapis_locket", new Item(new FabricItemSettings()));
    public static final Item MALICHITE_LOCKET = registerItem("malichite_locket", new Item(new FabricItemSettings()));
    public static final Item MOONSTONE_LOCKET = registerItem("moonstone_locket", new Item(new FabricItemSettings()));
    public static final Item OPAL_LOCKET = registerItem("opal_locket", new Item(new FabricItemSettings()));
    public static final Item PERIDOT_LOCKET = registerItem("peridot_locket", new Item(new FabricItemSettings()));
    public static final Item PREHNITE_LOCKET = registerItem("prehnite_locket", new Item(new FabricItemSettings()));
    public static final Item SPESSARITE_LOCKET = registerItem("spessarite_locket", new Item(new FabricItemSettings()));
    public static final Item RUBY_LOCKET = registerItem("ruby_locket", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE_LOCKET = registerItem("sapphire_locket", new Item(new FabricItemSettings()));
    public static final Item SMOKY_QUARTZ_LOCKET = registerItem("smoky_quartz_locket", new Item(new FabricItemSettings()));
    public static final Item SPHENE_LOCKET = registerItem("sphene_locket", new Item(new FabricItemSettings()));
    public static final Item SPINEL_LOCKET = registerItem("spinel_locket", new Item(new FabricItemSettings()));
    public static final Item TANZANITE_LOCKET = registerItem("tanzanite_locket", new Item(new FabricItemSettings()));
    public static final Item TOPAZ_LOCKET = registerItem("topaz_locket", new Item(new FabricItemSettings()));
    public static final Item TORMALINE_LOCKET = registerItem("tormaline_locket", new Item(new FabricItemSettings()));
    public static final Item TSAVORITE_LOCKET = registerItem("tsavorite_locket", new Item(new FabricItemSettings()));
    public static final Item ZIRCON_LOCKET = registerItem("zircon_locket", new Item(new FabricItemSettings()));

    //Amulets
    public static final Item AMULET_OF_ACCELERATION = registerItem("amulet_of_acceleration", new MagicAmulet(StatusEffects.SPEED, 200, new FabricItemSettings()));
    public static final Item AMULET_OF_ANTIGRAVITY = registerItem("amulet_of_antigravity", new MagicAmulet(StatusEffects.LEVITATION, 200, new FabricItemSettings().maxDamage(100)));
    public static final Item AMULET_OF_ARTHRITIS = registerItem("amulet_of_arthritis", new MagicAmulet(StatusEffects.MINING_FATIGUE, 200, new FabricItemSettings().maxDamage(100)));
    public static final Item AMULET_OF_BAD_LUCK = registerItem("amulet_of_bad_luck", new MagicAmulet(StatusEffects.UNLUCK, 200, new FabricItemSettings().maxDamage(64)));
    public static final Item AMULET_OF_BRICKS = registerItem("amulet_of_bricks", new MagicAmulet(StatusEffects.INSTANT_DAMAGE, 200, new FabricItemSettings().maxDamage(10)));
    public static final Item AMULET_OF_BRO_YOU_GOTTA_TRY_THIS = registerItem("amulet_of_bro_you_gotta_try_this", new MagicAmulet(StatusEffects.NAUSEA, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_BUBBLES = registerItem("amulet_of_bubbles", new MagicAmulet(StatusEffects.WATER_BREATHING, 200, new FabricItemSettings()));
    public static final Item AMULET_OF_CLOAKING = registerItem("amulet_of_cloaking", new MagicAmulet(StatusEffects.INVISIBILITY, 200, new FabricItemSettings().maxDamage(100)));
    public static final Item AMULET_OF_CLOSED_EYES = registerItem("amulet_of_closed_eyes", new MagicAmulet(StatusEffects.BLINDNESS, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_CLOVERS = registerItem("amulet_of_clovers", new MagicAmulet(StatusEffects.LUCK, 200, new FabricItemSettings().maxDamage(64)));
    public static final Item AMULET_OF_DECAY = registerItem("amulet_of_decay", new MagicAmulet(StatusEffects.WITHER, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_ENDURANCE = registerItem("amulet_of_endurance", new MagicAmulet(StatusEffects.ABSORPTION, 200, new FabricItemSettings().maxDamage(100)));
    public static final Item AMULET_OF_EXCAVATION = registerItem("amulet_of_excavation", new MagicAmulet(StatusEffects.HASTE, 200, new FabricItemSettings()));
    public static final Item AMULET_OF_EXTRA_LOVE = registerItem("amulet_of_extra_love", new MagicAmulet(StatusEffects.HEALTH_BOOST, 200, new FabricItemSettings().maxDamage(100)));
    public static final Item AMULET_OF_FLAMELESSNESS = registerItem("amulet_of_flamelessness", new MagicAmulet(StatusEffects.FIRE_RESISTANCE, 200, new FabricItemSettings().maxDamage(128)));
    public static final Item AMULET_OF_FRAILTY = registerItem("amulet_of_frailty", new MagicAmulet(StatusEffects.WEAKNESS, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_GILLS = registerItem("amulet_of_gills", new MagicAmulet(StatusEffects.CONDUIT_POWER, 200, new FabricItemSettings()));
    public static final Item AMULET_OF_GLUTTONY = registerItem("amulet_of_gluttony", new MagicAmulet(StatusEffects.HUNGER, 200, new FabricItemSettings().maxDamage(64)));
    public static final Item AMULET_OF_HEALING = registerItem("amulet_of_healing", new MagicAmulet(StatusEffects.REGENERATION, 200, new FabricItemSettings().maxDamage(32)));
    public static final Item AMULET_OF_HERCULES = registerItem("amulet_of_hercules", new MagicAmulet(StatusEffects.STRENGTH, 200, new FabricItemSettings().maxDamage(10)));
    public static final Item AMULET_OF_ILLUMINATION = registerItem("amulet_of_illumination", new MagicAmulet(StatusEffects.GLOWING, 200, new FabricItemSettings()));
    public static final Item AMULET_OF_LEAPING = registerItem("amulet_of_leaping", new MagicAmulet(StatusEffects.JUMP_BOOST, 200, new FabricItemSettings().maxDamage(128)));
    public static final Item AMULET_OF_NIGHT_SIGHT = registerItem("amulet_of_night_sight", new MagicAmulet(StatusEffects.NIGHT_VISION, 200, new FabricItemSettings()));
    public static final Item AMULET_OF_NOURISHMENT = registerItem("amulet_of_nourishment", new MagicAmulet(StatusEffects.SATURATION, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_OLYMPIC_SWIMMING = registerItem("amulet_of_olympic_swimming", new MagicAmulet(StatusEffects.DOLPHINS_GRACE, 200, new FabricItemSettings()));
    public static final Item AMULET_OF_RAIDS = registerItem("amulet_of_raids", new MagicAmulet(StatusEffects.BAD_OMEN, 200, new FabricItemSettings().maxDamage(32)));
    public static final Item AMULET_OF_REJUVINATION = registerItem("amulet_of_rejuvination", new MagicAmulet(StatusEffects.INSTANT_HEALTH, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_SHADOWS = registerItem("amulet_of_shadows", new MagicAmulet(StatusEffects.DARKNESS, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_SHIELDING = registerItem("amulet_of_shielding", new MagicAmulet(StatusEffects.RESISTANCE, 200, new FabricItemSettings().maxDamage(32)));
    public static final Item AMULET_OF_SICKENING = registerItem("amulet_of_sickening", new MagicAmulet(StatusEffects.POISON, 200, new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_THE_PHANTOM = registerItem("amulet_of_the_phantom", new MagicAmulet(StatusEffects.SLOW_FALLING, 200, new FabricItemSettings()));
    public static final Item AMULET_OF_THE_TORTISE = registerItem("amulet_of_the_tortise", new MagicAmulet(StatusEffects.SLOWNESS, 200, new FabricItemSettings().maxDamage(64)));
    public static final Item AMULET_OF_THE_VILLAGE_HERO = registerItem("amulet_of_the_village_hero", new MagicAmulet(StatusEffects.HERO_OF_THE_VILLAGE, 200, new FabricItemSettings().maxDamage(100)));

    //Charms
    public static final Item FIGHT_CHARM = registerItem("fight_charm", new FightCharmItem(new FabricItemSettings()));
    public static final Item LIGHT_CHARM = registerItem("light_charm", new LightCharmItem(new FabricItemSettings()));
    public static final Item MIGHT_CHARM = registerItem("might_charm", new MightCharmItem(new FabricItemSettings()));
    public static final Item SIGHT_CHARM = registerItem("sight_charm", new SightCharmItem(new FabricItemSettings()));
    public static final Item FLIGHT_CHARM = registerItem("flight_charm", new FlightCharmItem(new FabricItemSettings()));
    public static final Item SLIGHT_CHARM = registerItem("slight_charm", new SlightCharmItem(new FabricItemSettings()));
    public static final Item ALIGHT_CHARM = registerItem("alight_charm", new AlightCharmItem(new FabricItemSettings()));
    public static final Item BLIGHT_CHARM = registerItem("blight_charm", new BlightCharmItem(new FabricItemSettings()));
    public static final Item BRIGHT_CHARM = registerItem("bright_charm", new BrightCharmItem(new FabricItemSettings()));
    public static final Item FRIGHT_CHARM = registerItem("fright_charm", new FrightCharmItem(new FabricItemSettings()));
    public static final Item KNIGHT_CHARM = registerItem("knight_charm", new KnightCharmItem(new FabricItemSettings()));

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

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Hmh2.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Hmh2.LOGGER.info("Registering Mod Items for " + Hmh2.MOD_ID);
    }

}
