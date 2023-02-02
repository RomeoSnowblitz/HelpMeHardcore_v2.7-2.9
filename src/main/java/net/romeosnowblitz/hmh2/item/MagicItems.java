package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.item.custom.amulets.*;
import net.romeosnowblitz.hmh2.item.custom.charms.*;

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
    public static final Item AMULET_OF_ACCELERATION = registerItem("amulet_of_acceleration", new SpeedAmuletItem(new FabricItemSettings()));
    public static final Item AMULET_OF_ANTIGRAVITY = registerItem("amulet_of_antigravity", new LevitationAmuletItem(new FabricItemSettings().maxDamage(100)));
    public static final Item AMULET_OF_ARTHRITIS = registerItem("amulet_of_arthritis", new MiningFatigueAmuletItem(new FabricItemSettings().maxDamage(100)));
    public static final Item AMULET_OF_BAD_LUCK = registerItem("amulet_of_bad_luck", new UnLuckAmuletItem(new FabricItemSettings().maxDamage(64)));
    public static final Item AMULET_OF_BRICKS = registerItem("amulet_of_bricks", new InstantDamageAmuletItem(new FabricItemSettings().maxDamage(10)));
    public static final Item AMULET_OF_BRO_YOU_GOTTA_TRY_THIS = registerItem("amulet_of_bro_you_gotta_try_this", new NauseaAmuletItem(new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_BUBBLES = registerItem("amulet_of_bubbles", new WaterBreathingAmuletItem(new FabricItemSettings()));
    public static final Item AMULET_OF_CLOAKING = registerItem("amulet_of_cloaking", new InvisibilityAmuletItem(new FabricItemSettings().maxDamage(100)));
    public static final Item AMULET_OF_CLOSED_EYES = registerItem("amulet_of_closed_eyes", new BlindnessAmuletItem(new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_CLOVERS = registerItem("amulet_of_clovers", new LuckAmuletItem(new FabricItemSettings().maxDamage(64)));
    public static final Item AMULET_OF_DECAY = registerItem("amulet_of_decay", new WitherAmuletItem(new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_ENDURANCE = registerItem("amulet_of_endurance", new AbsorptionAmuletItem(new FabricItemSettings().maxDamage(100)));
    public static final Item AMULET_OF_EXCAVATION = registerItem("amulet_of_excavation", new HasteAmuletItem(new FabricItemSettings()));
    public static final Item AMULET_OF_EXTRA_LOVE = registerItem("amulet_of_extra_love", new HealthBoostAmuletItem(new FabricItemSettings().maxDamage(100)));
    public static final Item AMULET_OF_FLAMELESSNESS = registerItem("amulet_of_flamelessness", new FireResistanceAmuletItem(new FabricItemSettings().maxDamage(128)));
    public static final Item AMULET_OF_FRAILTY = registerItem("amulet_of_frailty", new WeaknessAmuletItem(new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_GILLS = registerItem("amulet_of_gills", new ConduitPowerAmuletItem(new FabricItemSettings()));
    public static final Item AMULET_OF_GLUTTONY = registerItem("amulet_of_gluttony", new HungerAmuletItem(new FabricItemSettings().maxDamage(64)));
    public static final Item AMULET_OF_HEALING = registerItem("amulet_of_healing", new RegenerationAmuletItem(new FabricItemSettings().maxDamage(32)));
    public static final Item AMULET_OF_HERCULES = registerItem("amulet_of_hercules", new StrengthAmuletItem(new FabricItemSettings().maxDamage(10)));
    public static final Item AMULET_OF_ILLUMINATION = registerItem("amulet_of_illumination", new GlowingAmuletItem(new FabricItemSettings()));
    public static final Item AMULET_OF_LEAPING = registerItem("amulet_of_leaping", new JumpBoostAmuletItem(new FabricItemSettings().maxDamage(128)));
    public static final Item AMULET_OF_NIGHT_SIGHT = registerItem("amulet_of_night_sight", new NightVisionAmuletItem(new FabricItemSettings()));
    public static final Item AMULET_OF_NOURISHMENT = registerItem("amulet_of_nourishment", new SaturationAmuletItem(new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_OLYMPIC_SWIMMING = registerItem("amulet_of_olympic_swimming", new DolphinsGraceAmuletItem(new FabricItemSettings()));
    public static final Item AMULET_OF_RAIDS = registerItem("amulet_of_raids", new BadOmenAmuletItem(new FabricItemSettings().maxDamage(32)));
    public static final Item AMULET_OF_REJUVINATION = registerItem("amulet_of_rejuvination", new InstantHealthAmuletItem(new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_SHADOWS = registerItem("amulet_of_shadows", new DarknessAmuletItem(new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_SHIELDING = registerItem("amulet_of_shielding", new ResistanceAmuletItem(new FabricItemSettings().maxDamage(32)));
    public static final Item AMULET_OF_SICKENING = registerItem("amulet_of_sickening", new PoisonAmuletItem(new FabricItemSettings().maxDamage(16)));
    public static final Item AMULET_OF_THE_PHANTOM = registerItem("amulet_of_the_phantom", new SlowFallingAmuletItem(new FabricItemSettings()));
    public static final Item AMULET_OF_THE_TORTISE = registerItem("amulet_of_the_tortise", new SlownessAmuletItem(new FabricItemSettings().maxDamage(64)));
    public static final Item AMULET_OF_THE_VILLAGE_HERO = registerItem("amulet_of_the_village_hero", new HeroOfTheVilliageAmuletItem(new FabricItemSettings().maxDamage(100)));

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



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Hmh2.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.MAGIC, AMBER);
        addToItemGroup(ModItemGroup.MAGIC, ANDALUSITE);
        addToItemGroup(ModItemGroup.MAGIC, AQUAMARINE);
        addToItemGroup(ModItemGroup.MAGIC, CITRINE);
        addToItemGroup(ModItemGroup.MAGIC, DIOPSIDE);
        addToItemGroup(ModItemGroup.MAGIC, GARNET);
        addToItemGroup(ModItemGroup.MAGIC, HESSONITE);
        addToItemGroup(ModItemGroup.MAGIC, MALICHITE);
        addToItemGroup(ModItemGroup.MAGIC, MOONSTONE);
        addToItemGroup(ModItemGroup.MAGIC, OPAL);
        addToItemGroup(ModItemGroup.MAGIC, PERIDOT);
        addToItemGroup(ModItemGroup.MAGIC, PREHNITE);
        addToItemGroup(ModItemGroup.MAGIC, RUBY);
        addToItemGroup(ModItemGroup.MAGIC, SAPPHIRE);
        addToItemGroup(ModItemGroup.MAGIC, SMOKY_QUARTZ);
        addToItemGroup(ModItemGroup.MAGIC, SPESSARITE);
        addToItemGroup(ModItemGroup.MAGIC, SPHENE);
        addToItemGroup(ModItemGroup.MAGIC, SPINEL);
        addToItemGroup(ModItemGroup.MAGIC, TANZANITE);
        addToItemGroup(ModItemGroup.MAGIC, TOPAZ);
        addToItemGroup(ModItemGroup.MAGIC, TORMALINE);
        addToItemGroup(ModItemGroup.MAGIC, TSAVORITE);
        addToItemGroup(ModItemGroup.MAGIC, ZIRCON);
        addToItemGroup(ModItemGroup.MAGIC, AMBER_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, ANDALUSITE_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, AQUAMARINE_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, CITRINE_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, DIOPSIDE_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, GARNET_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, HESSONITE_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, MALICHITE_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, MOONSTONE_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, OPAL_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, PERIDOT_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, PREHNITE_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, RUBY_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, SAPPHIRE_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, SMOKY_QUARTZ_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, SPESSARITE_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, SPHENE_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, SPINEL_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, TANZANITE_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, TOPAZ_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, TORMALINE_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, TSAVORITE_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, ZIRCON_LOCKET);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_ACCELERATION);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_ANTIGRAVITY);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_ARTHRITIS);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_BAD_LUCK);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_BRICKS);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_BRO_YOU_GOTTA_TRY_THIS);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_BUBBLES);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_CLOAKING);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_CLOSED_EYES);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_CLOVERS);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_DECAY);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_ENDURANCE);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_EXCAVATION);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_EXTRA_LOVE);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_FLAMELESSNESS);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_FRAILTY);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_GILLS);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_GLUTTONY);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_HEALING);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_HERCULES);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_ILLUMINATION);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_LEAPING);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_NIGHT_SIGHT);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_NOURISHMENT);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_OLYMPIC_SWIMMING);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_RAIDS);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_REJUVINATION);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_SHADOWS);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_SHIELDING);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_SICKENING);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_THE_PHANTOM);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_THE_TORTISE);
        addToItemGroup(ModItemGroup.MAGIC, AMULET_OF_THE_VILLAGE_HERO);
        addToItemGroup(ModItemGroup.MAGIC, FIGHT_CHARM);
        addToItemGroup(ModItemGroup.MAGIC, LIGHT_CHARM);
        addToItemGroup(ModItemGroup.MAGIC, MIGHT_CHARM);
        addToItemGroup(ModItemGroup.MAGIC, SIGHT_CHARM);
        addToItemGroup(ModItemGroup.MAGIC, FLIGHT_CHARM);
        addToItemGroup(ModItemGroup.MAGIC, SLIGHT_CHARM);
        addToItemGroup(ModItemGroup.MAGIC, ALIGHT_CHARM);
        addToItemGroup(ModItemGroup.MAGIC, BLIGHT_CHARM);
        addToItemGroup(ModItemGroup.MAGIC, BRIGHT_CHARM);
        addToItemGroup(ModItemGroup.MAGIC, FRIGHT_CHARM);
        addToItemGroup(ModItemGroup.MAGIC, KNIGHT_CHARM);
    }

    public static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        Hmh2.LOGGER.info("Registering Mod Items for " + Hmh2.MOD_ID);
        addItemsToItemGroup();
    }

}
