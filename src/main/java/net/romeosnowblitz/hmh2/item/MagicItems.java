package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.item.custom.amulets.*;
import net.romeosnowblitz.hmh2.item.custom.charms.*;

public class MagicItems {

    //Gems (23)
    public static final Item AMBER = registerItem("amber", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item ANDALUSITE = registerItem("andalusite", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item AQUAMARINE = registerItem("aquamarine", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item CITRINE = registerItem("citrine", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item DIOPSIDE = registerItem("diopside", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item GARNET = registerItem("garnet", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item HESSONITE = registerItem("hessonite", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item MALICHITE = registerItem("malichite", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item MOONSTONE = registerItem("moonstone", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item OPAL = registerItem("opal", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item PERIDOT = registerItem("peridot", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item PREHNITE = registerItem("prehnite", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item SMOKY_QUARTZ = registerItem("smoky_quartz", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item SPESSARITE = registerItem("spessarite", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item SPHENE = registerItem("sphene", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item SPINEL = registerItem("spinel", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item TANZANITE = registerItem("tanzanite", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item TORMALINE = registerItem("tormaline", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item TSAVORITE = registerItem("tsavorite", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item ZIRCON = registerItem("zircon", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));

    //Lockets
    public static final Item AMBER_LOCKET = registerItem("amber_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item AMETHYST_LOCKET = registerItem("amethyst_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item ANDALUSITE_LOCKET = registerItem("andalusite_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item AQUAMARINE_LOCKET = registerItem("aquamarine_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item CHARCOAL_LOCKET = registerItem("charcoal_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item CITRINE_LOCKET = registerItem("citrine_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item COAL_LOCKET = registerItem("coal_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item COPPER_LOCKET = registerItem("copper_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item DIAMOND_LOCKET = registerItem("diamond_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item DIOPSIDE_LOCKET = registerItem("diopside_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item EMERALD_LOCKET = registerItem("emerald_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item FLINT_LOCKET = registerItem("flint_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item GARNET_LOCKET = registerItem("garnet_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item GOLD_LOCKET = registerItem("gold_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item HESSONITE_LOCKET = registerItem("hessonite_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item IRON_LOCKET = registerItem("iron_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item LAPIS_LOCKET = registerItem("lapis_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item MALICHITE_LOCKET = registerItem("malichite_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item MOONSTONE_LOCKET = registerItem("moonstone_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item OPAL_LOCKET = registerItem("opal_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item PERIDOT_LOCKET = registerItem("peridot_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item PREHNITE_LOCKET = registerItem("prehnite_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item SPESSARITE_LOCKET = registerItem("spessarite_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item RUBY_LOCKET = registerItem("ruby_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item SAPPHIRE_LOCKET = registerItem("sapphire_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item SMOKY_QUARTZ_LOCKET = registerItem("smoky_quartz_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item SPHENE_LOCKET = registerItem("sphene_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item SPINEL_LOCKET = registerItem("spinel_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item TANZANITE_LOCKET = registerItem("tanzanite_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item TOPAZ_LOCKET = registerItem("topaz_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item TORMALINE_LOCKET = registerItem("tormaline_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item TSAVORITE_LOCKET = registerItem("tsavorite_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item ZIRCON_LOCKET = registerItem("zircon_locket", new Item(new FabricItemSettings().group(ModItemGroup.MAGIC)));

    //Amulets
    public static final Item AMULET_OF_ACCELERATION = registerItem("amulet_of_acceleration", new SpeedAmuletItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_ANTIGRAVITY = registerItem("amulet_of_antigravity", new LevitationAmuletItem(new FabricItemSettings().maxDamage(100).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_ARTHRITIS = registerItem("amulet_of_arthritis", new MiningFatigueAmuletItem(new FabricItemSettings().maxDamage(100).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_BAD_LUCK = registerItem("amulet_of_bad_luck", new UnLuckAmuletItem(new FabricItemSettings().maxDamage(64).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_BRICKS = registerItem("amulet_of_bricks", new InstantDamageAmuletItem(new FabricItemSettings().maxDamage(10).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_BRO_YOU_GOTTA_TRY_THIS = registerItem("amulet_of_bro_you_gotta_try_this", new NauseaAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_BUBBLES = registerItem("amulet_of_bubbles", new WaterBreathingAmuletItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_CLOAKING = registerItem("amulet_of_cloaking", new InvisibilityAmuletItem(new FabricItemSettings().maxDamage(100).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_CLOSED_EYES = registerItem("amulet_of_closed_eyes", new BlindnessAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_CLOVERS = registerItem("amulet_of_clovers", new LuckAmuletItem(new FabricItemSettings().maxDamage(64).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_DECAY = registerItem("amulet_of_decay", new WitherAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_ENDURANCE = registerItem("amulet_of_endurance", new AbsorptionAmuletItem(new FabricItemSettings().maxDamage(100).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_EXCAVATION = registerItem("amulet_of_excavation", new HasteAmuletItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_EXTRA_LOVE = registerItem("amulet_of_extra_love", new HealthBoostAmuletItem(new FabricItemSettings().maxDamage(100).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_FLAMELESSNESS = registerItem("amulet_of_flamelessness", new FireResistanceAmuletItem(new FabricItemSettings().maxDamage(128).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_FRAILTY = registerItem("amulet_of_frailty", new WeaknessAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_GILLS = registerItem("amulet_of_gills", new ConduitPowerAmuletItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_GLUTTONY = registerItem("amulet_of_gluttony", new HungerAmuletItem(new FabricItemSettings().maxDamage(64).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_HEALING = registerItem("amulet_of_healing", new RegenerationAmuletItem(new FabricItemSettings().maxDamage(32).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_HERCULES = registerItem("amulet_of_hercules", new StrengthAmuletItem(new FabricItemSettings().maxDamage(10).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_ILLUMINATION = registerItem("amulet_of_illumination", new GlowingAmuletItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_LEAPING = registerItem("amulet_of_leaping", new JumpBoostAmuletItem(new FabricItemSettings().maxDamage(128).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_NIGHT_SIGHT = registerItem("amulet_of_night_sight", new NightVisionAmuletItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_NOURISHMENT = registerItem("amulet_of_nourishment", new SaturationAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_OLYMPIC_SWIMMING = registerItem("amulet_of_olympic_swimming", new DolphinsGraceAmuletItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_RAIDS = registerItem("amulet_of_raids", new BadOmenAmuletItem(new FabricItemSettings().maxDamage(32).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_REJUVINATION = registerItem("amulet_of_rejuvination", new InstantHealthAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_SHADOWS = registerItem("amulet_of_shadows", new DarknessAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_SHIELDING = registerItem("amulet_of_shielding", new ResistanceAmuletItem(new FabricItemSettings().maxDamage(32).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_SICKENING = registerItem("amulet_of_sickening", new PoisonAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_THE_PHANTOM = registerItem("amulet_of_the_phantom", new SlowFallingAmuletItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_THE_TORTISE = registerItem("amulet_of_the_tortise", new SlownessAmuletItem(new FabricItemSettings().maxDamage(64).group(ModItemGroup.MAGIC)));
    public static final Item AMULET_OF_THE_VILLAGE_HERO = registerItem("amulet_of_the_village_hero", new HeroOfTheVilliageAmuletItem(new FabricItemSettings().maxDamage(100).group(ModItemGroup.MAGIC)));

    //Charms
    public static final Item FIGHT_CHARM = registerItem("fight_charm", new FightCharmItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item LIGHT_CHARM = registerItem("light_charm", new LightCharmItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item MIGHT_CHARM = registerItem("might_charm", new MightCharmItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item SIGHT_CHARM = registerItem("sight_charm", new SightCharmItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item FLIGHT_CHARM = registerItem("flight_charm", new FlightCharmItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item SLIGHT_CHARM = registerItem("slight_charm", new SlightCharmItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item ALIGHT_CHARM = registerItem("alight_charm", new AlightCharmItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item BLIGHT_CHARM = registerItem("blight_charm", new BlightCharmItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item BRIGHT_CHARM = registerItem("bright_charm", new BrightCharmItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item FRIGHT_CHARM = registerItem("fright_charm", new FrightCharmItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));
    public static final Item KNIGHT_CHARM = registerItem("knight_charm", new KnightCharmItem(new FabricItemSettings().group(ModItemGroup.MAGIC)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Hmh2.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Hmh2.LOGGER.info("Registering Mod Items for " + Hmh2.MOD_ID);
    }

}
