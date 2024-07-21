package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.Util;
import net.minecraft.util.math.Direction;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.custom.dyes.*;
import net.romeosnowblitz.hmh2.item.custom.food.*;
import net.romeosnowblitz.hmh2.item.custom.test.*;
import net.romeosnowblitz.hmh2.item.custom.tools.*;
import net.romeosnowblitz.hmh2.potion.EndPortalBottle;
import net.romeosnowblitz.hmh2.potion.NetherPortalBottle;
import net.romeosnowblitz.hmh2.sounds.ModSounds;

import static net.minecraft.item.Items.*;

public class ModItems {

    public static final Item SAMPLE = registerItem("sample", new SampleItem(new FabricItemSettings().maxCount(1)));
    public static final Item HEART_OF_THE_KRAKEN = registerItem("heart_of_the_kraken", new KrakenHeart(new FabricItemSettings().food(new FoodComponent.Builder().hunger(0).build())));
    public static final Item BLOOD_COMPASS = registerItem("blood_compass", new BloodCompass(new FabricItemSettings().maxCount(1)));
    public static final Item FLOWER_CROWN = registerItem("flower_crown", new FlowerCrown(ModArmorMaterials.FLOWER, ArmorItem.Type.HELMET, new FabricItemSettings().maxDamage(1)));

    public static final Item NETHER_PORTAL_BOTTLE = registerItem("nether_portal_bottle", new NetherPortalBottle(40, SoundEvents.ITEM_HONEY_BOTTLE_DRINK, Items.GLASS_BOTTLE.getDefaultStack(), new FabricItemSettings().maxCount(1).food(new FoodComponent.Builder().build())));
    public static final Item END_PORTAL_BOTTLE = registerItem("end_portal_bottle", new EndPortalBottle(40, SoundEvents.ITEM_HONEY_BOTTLE_DRINK, Items.GLASS_BOTTLE.getDefaultStack(), new FabricItemSettings().maxCount(1).food(new FoodComponent.Builder().build())));
    public static final Item LURED_ROD = registerItem("lured_rod", new FishingRodItem(new FabricItemSettings()));

    //NewItem
    public static final Item TEST = registerItem("test", new LootBox(new FabricItemSettings()));

    public static final Item PURPLE_TORCH_ITEM = registerItem("purple_torch_item", new PurpleTorch(ModBlocks.PURPLE_TORCH, ModBlocks.WALL_PURPLE_TORCH, new Item.Settings(), Direction.DOWN));
    public static final Item LAMP_TORCH_ITEM = registerItem("lamp_torch_item", new VerticallyAttachableBlockItem(ModBlocks.LAMP_TORCH, ModBlocks.LAMP_WALL_TORCH, new Item.Settings(), Direction.DOWN));
    public static final Item ROSE_BED_ITEM = registerItem("rose_bed_item", new BedItem(ModBlocks.ROSE_BED, (new Item.Settings()).maxCount(1)));
    public static final Item TRAVELERS_DREAM = registerItem("travelers_dream", new TravelersDream(new FabricItemSettings()));
    public static final Item LIFE_ESSENCE = registerItem("life_essence", new LifeEssence(new FabricItemSettings().food(new FoodComponent.Builder().hunger(0).saturationModifier(-1f).alwaysEdible().snack().build())));
    public static final Item WITHER_BONE = registerItem("wither_bone", new Item(new FabricItemSettings()));

    public static final Item SERVER_KEY = registerItem("server_key", new Item(new FabricItemSettings()));
    //public static final Item NEW_ITEM = registerItem("new_item", new PlusOne(new FabricItemSettings()));

    public static final Item UMBRELLA = registerItem("umbrella", new Umbrella(ModToolMaterials.MOD_IRON, 1, 1, new FabricItemSettings().maxDamage(100)));
    public static final Item WAXED_CLOTH = registerItem("waxed_cloth", new Item(new FabricItemSettings()));
    public static final Item WARPED_WART = registerItem("warped_wart", new Item(new FabricItemSettings()));
    public static final Item PITCHFORK = registerItem("pitchfork", new SwordItem(ToolMaterials.IRON, 4, -2.9f, new FabricItemSettings()));
    public static final Item HELLFORK = registerItem("hellfork", new SwordItem(ModToolMaterials.HELLSTONE, 9, -2.9f, new FabricItemSettings()));
    public static final Item INFERNAL_DIAMOND = registerItem("infernal_diamond", new Item(new FabricItemSettings().fireproof()));
    public static final Item INFERNAL_HELLFORK = registerItem("infernal_hellfork", new Infernal_Hellfork(ModToolMaterials.HELLSTONE, 11, -2.9f, new FabricItemSettings().fireproof()));
    public static final Item SOLAR_FRAGMENT = registerItem("solar_fragment", new Item(new FabricItemSettings().fireproof()));

    //New Items
    public static final Item SUN_SEEKER = registerItem("sun_seeker", new SunSeeker(new FabricItemSettings().fireproof()));
    public static final Item SUN_STONE = registerItem("sun_stone", new SunStone(new FabricItemSettings().fireproof()));
    public static final Item REVIVAL_INGOT = registerItem("revival_ingot", new Item(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item REVIVAL_STONE = registerItem("revival_stone", new RevivalStone(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item UNIVERSAL_REVIVAL_STONE = registerItem("universal_revival_stone", new UniversalRevivalStone(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item GLUE = registerItem("glue", new Item(new FabricItemSettings()));
    public static final Item FLOUR = registerItem("flour", new Item(new FabricItemSettings()));
    public static final Item DISC_FRAGMENT = registerItem("disc_fragment", new Disc_Fragment(new FabricItemSettings().fireproof()));
    public static final Item NULL_PASSER = registerItem("null_passer", new NullPasser(new FabricItemSettings().maxDamage(16).fireproof()));

    //Bows
    public static final Item BAMBOO_BOW = registerItem("bamboo_bow", new BowItem(new FabricItemSettings().maxDamage(192)));
    public static final Item BAMBOO_SHIELD = registerItem("bamboo_shield", new ShieldItem(new FabricItemSettings().maxDamage(192)));

    //Materials
    public static final Item ASH_CREAM = registerItem("ash_cream", new Item(new FabricItemSettings()));
    public static final Item CORK = registerItem("cork", new Item(new FabricItemSettings()));
    public static final Item GRAPHITE = registerItem("graphite", new Item(new FabricItemSettings()));
    public static final Item HELLSTONE = registerItem("hellstone", new Item(new FabricItemSettings()));
    public static final Item LUCKY_PIECE = registerItem("lucky_piece", new Item(new FabricItemSettings()));
    public static final Item QUAERITE_FRAGMENT = registerItem("quaerite_fragment", new Item(new FabricItemSettings()));
    public static final Item RAW_PLATINUM = registerItem("raw_platinum", new Item(new FabricItemSettings()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new FabricItemSettings()));
    public static final Item SALT = registerItem("salt", new Item(new FabricItemSettings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new FabricItemSettings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));

    //Obtained from Smelting (3)
    public static final Item ASHES = registerItem("ashes", new Item(new FabricItemSettings()));
    public static final Item BURNT_EGGSHELL = registerItem("burnt_eggshell", new Item(new FabricItemSettings()));
    public static final Item GALLIUM_INGOT = registerItem("gallium_ingot", new Item(new FabricItemSettings()));
    public static final Item HEAVY_CREAM = registerItem("heavy_cream", new Item(new FabricItemSettings()));
    public static final Item PLASTIC = registerItem("plastic", new Item(new FabricItemSettings()));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new FabricItemSettings()));
    public static final Item RESIN = registerItem("resin", new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new FabricItemSettings()));


    //Obtained from Stonecutter/Smithing Table (1)
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item BUTTER = registerItem("butter", new Item(new FabricItemSettings()));
    public static final Item MYSTERIOUS_WHITE_DEBRIS = registerItem("mysterious_white_debris", new Item(new FabricItemSettings().rarity(Rarity.COMMON).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 600, 0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.WITHER,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,600,0), 0.05F).alwaysEdible().build())));
    public static final Item MYSTERIOUS_YELLOW_DEBRIS = registerItem("mysterious_yellow_debris", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 600, 0), 0.15F).statusEffect(new StatusEffectInstance(StatusEffects.WITHER,600,0),0.15F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER,600,0),0.15F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE,600,0),0.15F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE,600,0),0.15F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,600,0),0.15F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,600,0),0.15F)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,600,0),0.15F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600,0),0.15F)
            .statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,600,0),0.15F).statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,600,0),0.15F).alwaysEdible().build())));
    public static final Item MYSTERIOUS_CYAN_DEBRIS = registerItem("mysterious_cyan_debris", new Item(new FabricItemSettings().rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 600, 0), 0.35F).statusEffect(new StatusEffectInstance(StatusEffects.WITHER,600,0),0.35F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER,600,0),0.35F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE,600,0),0.35F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE,600,0),0.35F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,600,0),0.35F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,600,0),0.35F)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,600,0),0.35F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600,0),0.35F)
            .statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,600,0),0.35F).statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,600,0),0.35F).alwaysEdible().build())));
    public static final Item MYSTERIOUS_MAGENTA_DEBRIS = registerItem("mysterious_magenta_debris", new Item(new FabricItemSettings().rarity(Rarity.EPIC).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 600, 0), 0.75F).statusEffect(new StatusEffectInstance(StatusEffects.WITHER,600,0),0.75F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER,600,0),0.75F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE,600,0),0.75F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE,600,0),0.75F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,600,0),0.75F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,600,0),0.75F)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,600,0),0.75F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600,0),0.75F)
            .statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,600,0),0.75F).statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,600,0),0.75F).alwaysEdible().build())));

    //Obtained from Mob Loot (2)
    public static final Item HOOF = registerItem("hoof", new Item(new FabricItemSettings()));
    public static final Item FUR_PELT = registerItem("fur_pelt", new Item(new FabricItemSettings()));
    public static final Item POISON_SAC = registerItem("poison_sac", new Item(new FabricItemSettings()));
    public static final Item RENNET = registerItem("rennet", new Item(new FabricItemSettings()));

    //Obtained from Crafting (8)
    public static final Item BONE_PLATE = registerItem("bone_plate", new Item(new FabricItemSettings()));
    public static final Item CHAINED_MESH = registerItem("chained_mesh", new Item(new FabricItemSettings()));
    public static final Item CLOTH = registerItem("cloth", new Item(new FabricItemSettings()));
    public static final Item HOOF_POWDER = registerItem("hoof_powder", new Item(new FabricItemSettings()));
    public static final Item CONE = registerItem("cone", new Item(new FabricItemSettings()));
    public static final Item ENDER_SHARD = registerItem("ender_shard", new Item(new FabricItemSettings()));
    public static final Item ENDER_DUST = registerItem("ender_dust", new Item(new FabricItemSettings()));
    public static final Item ENDER_INGOT = registerItem("ender_ingot", new Item(new FabricItemSettings()));
    public static final Item FROZEN_MILK = registerItem("frozen_milk", new Item(new FabricItemSettings()));
    public static final Item ITEM = registerItem("item", new ClassResetter(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item OIL_BALL = registerItem("oil_ball", new Item(new FabricItemSettings()));
    public static final Item PENCIL = registerItem("pencil", new Item(new FabricItemSettings()));
    public static final Item SILK = registerItem("silk", new Item(new FabricItemSettings()));
    public static final Item SHEET_PAN = registerItem("sheet_pan", new Item(new FabricItemSettings()));
    public static final Item VEGAN_LEATHER = registerItem("vegan_leather", new Item(new FabricItemSettings()));
    public static final Item WOODED_DIAMOND = registerItem("wooded_diamond", new Item(new FabricItemSettings()));
    public static final Item GRANNY_LOTION = registerItem("granny_lotion", new GrannyLotion(new FabricItemSettings().maxDamage(128)));

    public static final Item ROSE_DYE = registerItem("rose_dye", new SheepDyeItem(DyeColor.RED, new FabricItemSettings()));
    public static final Item ULTRAMARINE_DYE = registerItem("ultramarine_dye", new SheepDyeItem(DyeColor.BLUE, new FabricItemSettings()));
    public static final Item NEW_GREEN_DYE = registerItem("new_green_dye", new SheepDyeItem(DyeColor.GREEN, new FabricItemSettings()));
    public static final Item SPRING_GREEN_DYE = registerItem("spring_green_dye", new SheepDyeItem(DyeColor.CYAN, new FabricItemSettings()));
    public static final Item VIOLET_DYE = registerItem("violet_dye", new SheepDyeItem(DyeColor.PURPLE, new FabricItemSettings()));

    //Seeds
    public static final Item MIDAS_SEEDS = registerItem("midas_seeds", new AliasedBlockItem((ModBlocks.MIDAS_TOUCH), new FabricItemSettings()));
    public static final Item ENDER_CORN_SEEDS = registerItem("ender_corn_seeds", new AliasedBlockItem((ModBlocks.ENDER_CORN_BLOCK), new FabricItemSettings()));
    public static final Item ENDER_CORN = ModItems.registerItem("ender_corn", new EnderSkinConsumableShort(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build())));

    public static final Item BANANA_SIGN = registerItem("banana_sign", new SignItem(new FabricItemSettings().maxCount(16), WoodworkBlocks.BANANA_SIGN, WoodworkBlocks.BANANA_WALL_SIGN));
    public static final Item BANANA_HANGING_SIGN = registerItem("banana_hanging_sign", new HangingSignItem(WoodworkBlocks.BANANA_HANGING_SIGN, WoodworkBlocks.BANANA_HANGING_WALL_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item CHERRY_SIGN = registerItem("cherry_sign", new SignItem(new FabricItemSettings().maxCount(16), WoodworkBlocks.CHERRY_SIGN, WoodworkBlocks.CHERRY_WALL_SIGN));
    public static final Item CHERRY_HANGING_SIGN = registerItem("cherry_hanging_sign", new HangingSignItem(WoodworkBlocks.CHERRY_HANGING_SIGN, WoodworkBlocks.CHERRY_HANGING_WALL_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item CORK_OAK_SIGN = registerItem("cork_oak_sign", new SignItem(new FabricItemSettings().maxCount(16), WoodworkBlocks.CORK_OAK_SIGN, WoodworkBlocks.CORK_OAK_WALL_SIGN));
    public static final Item CORK_OAK_HANGING_SIGN = registerItem("cork_oak_hanging_sign", new HangingSignItem(WoodworkBlocks.CORK_OAK_HANGING_SIGN, WoodworkBlocks.CORK_OAK_HANGING_WALL_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item JACARANDA_SIGN = registerItem("jacaranda_sign", new SignItem(new FabricItemSettings().maxCount(16), WoodworkBlocks.JACARANDA_SIGN, WoodworkBlocks.JACARANDA_WALL_SIGN));
    public static final Item JACARANDA_HANGING_SIGN = registerItem("jacaranda_hanging_sign", new HangingSignItem(WoodworkBlocks.JACARANDA_HANGING_SIGN, WoodworkBlocks.JACARANDA_HANGING_WALL_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item MAHOE_SIGN = registerItem("mahoe_sign", new SignItem(new FabricItemSettings().maxCount(16), WoodworkBlocks.MAHOE_SIGN, WoodworkBlocks.MAHOE_WALL_SIGN));
    public static final Item MAHOE_HANGING_SIGN = registerItem("mahoe_hanging_sign", new HangingSignItem(WoodworkBlocks.MAHOE_HANGING_SIGN, WoodworkBlocks.MAHOE_HANGING_WALL_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item MANGO_SIGN = registerItem("mango_sign", new SignItem(new FabricItemSettings().maxCount(16), WoodworkBlocks.MANGO_SIGN, WoodworkBlocks.MANGO_WALL_SIGN));
    public static final Item MANGO_HANGING_SIGN = registerItem("mango_hanging_sign", new HangingSignItem(WoodworkBlocks.MANGO_HANGING_SIGN, WoodworkBlocks.MANGO_HANGING_WALL_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item WILLOW_SIGN = registerItem("willow_sign", new SignItem(new FabricItemSettings().maxCount(16), WoodworkBlocks.WILLOW_SIGN, WoodworkBlocks.WILLOW_WALL_SIGN));
    public static final Item WILLOW_HANGING_SIGN = registerItem("willow_hanging_sign", new HangingSignItem(WoodworkBlocks.WILLOW_HANGING_SIGN, WoodworkBlocks.WILLOW_HANGING_WALL_SIGN, new FabricItemSettings().maxCount(16)));

    //Bucket Items
    public static final Item CHOCOLATE_MILK = registerItem("chocolate_milk", new BucketItem(ModFluids.CHOCOLATE_MILK_STILL, new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).recipeRemainder(BUCKET).maxCount(1)));
    public static final Item HEATED_OIL_BUCKET = registerItem("heated_oil_bucket", new BucketItem(ModFluids.HEATED_OIL_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item HONEY_BUCKET = registerItem("honey_bucket", new MultiPurposeHoneyBucket(ModFluids.HONEY_STILL, new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).recipeRemainder(BUCKET).maxCount(1)));
    public static final Item OIL_BUCKET = registerItem("oil_bucket", new BucketItem(ModFluids.OIL_STILL, new FabricItemSettings().maxCount(1)));
    public static final Item QUICKSAND_BUCKET = registerItem("quicksand_bucket", new BucketItem(ModFluids.QUICKSAND_STILL, new FabricItemSettings().maxCount(1)));

    //Spawn Eggs
    public static final Item ASHMITE_SPAWN_EGG = registerItem("ashmite_spawn_egg", new SpawnEggItem(ModEntities.ASHMITE,0x808080, 0x1b2632, new FabricItemSettings()));
    public static final Item BLAZING_INFERNO_SPAWN_EGG = registerItem("blazing_inferno_spawn_egg", new SpawnEggItem(ModEntities.BLAZING_INFERNO,0x5f0201, 0xffd528, new FabricItemSettings()));
    public static final Item BLOODMITE_SPAWN_EGG = registerItem("bloodmite_spawn_egg", new SpawnEggItem(ModEntities.BLOODMITE,0x652828, 0x7b0000, new FabricItemSettings()));
    public static final Item CAL_SPAWN_EGG = registerItem("cal_spawn_egg", new SpawnEggItem(ModEntities.CAL,0x000000, 0x00ff00, new FabricItemSettings()));
    public static final Item HELLMITE_SPAWN_EGG = registerItem("hellmite_spawn_egg", new SpawnEggItem(ModEntities.HELLMITE,0x652828, 0xac7c12, new FabricItemSettings()));
    public static final Item LOST_SOUL_SPAWN_EGG = registerItem("lost_soul_spawn_egg", new SpawnEggItem(ModEntities.LOST_SOUL,0xffffff, 0x000000, new FabricItemSettings()));
    public static final Item MAGMITE_SPAWN_EGG = registerItem("magmite_spawn_egg", new SpawnEggItem(ModEntities.MAGMITE,0x652828, 0xf48522, new FabricItemSettings()));
    public static final Item PENGUIN_SPAWN_EGG = registerItem("penguin_spawn_egg", new SpawnEggItem(ModEntities.PENGUIN,0x0d0d0d, 0xffffff, new FabricItemSettings()));
    public static final Item QUEEN_BEE_SPAWN_EGG = registerItem("queen_bee_spawn_egg", new SpawnEggItem(ModEntities.QUEEN_BEE,0xb27516, 0x010215, new FabricItemSettings()));
    public static final Item SCULKMITE_SPAWN_EGG = registerItem("sculkmite_spawn_egg", new SpawnEggItem(ModEntities.SCULKMITE,0x0b0e12, 0x29dfeb, new FabricItemSettings()));
    public static final Item SHADOW_CREATURE_SPAWN_EGG = registerItem("shadow_creature_spawn_egg", new SpawnEggItem(ModEntities.SHADOW_CREATURE,0xffffff, 0xffffff, new FabricItemSettings()));
    public static final Item SOLDIER_BEE_SPAWN_EGG = registerItem("soldier_bee_spawn_egg", new SpawnEggItem(ModEntities.SOLDIER_BEE,0xb27516, 0xe40018, new FabricItemSettings()));
    public static final Item THE_GREAT_HUNGER_SPAWN_EGG = registerItem("the_great_hunger_spawn_egg", new SpawnEggItem(ModEntities.THE_GREAT_HUNGER,0x092306, 0x147e23, new FabricItemSettings()));
    public static final Item WARPMITE_SPAWN_EGG = registerItem("warpmite_spawn_egg", new SpawnEggItem(ModEntities.WARPMITE,0x652828, 0x119b85, new FabricItemSettings()));

    public static final Item DEMON_SPAWN_EGG = registerItem("demon_spawn_egg", new SpawnEggItem(ModEntities.DEMON,0x650d00, 0x000000, new FabricItemSettings()));
    public static final Item WISP_SPAWN_EGG = registerItem("wisp_spawn_egg", new SpawnEggItem(ModEntities.WISP,0x01a7ac, 0x60f5fa, new FabricItemSettings()));
    public static final Item HEADLESS_HORSEMAN_SPAWN_EGG = registerItem("headless_horseman_spawn_egg", new SpawnEggItem(ModEntities.HEADLESS_HORSEMAN,0xFFFFFF, 0x000000, new FabricItemSettings()));

    public static final Item BLAZESTEP_DISC = registerItem("blazestep_disc", new MusicDiscItem(1, ModSounds.BLAZESTEP_DISC, new FabricItemSettings().maxCount(1), 199));
    public static final Item DARKNESS_DISC = registerItem("darkness_disc", new MusicDiscItem(2, ModSounds.DARKNESS_DISC, new FabricItemSettings().maxCount(1), 187));
    public static final Item FORTRESS_DISC = registerItem("fortress_disc", new MusicDiscItem(3, ModSounds.FORTRESS_DISC, new FabricItemSettings().maxCount(1), 222));
    public static final Item GAME_OVER_DISC = registerItem("game_over_disc", new MusicDiscItem(4, ModSounds.GAME_OVER_DISC, new FabricItemSettings().maxCount(1), 228));
    public static final Item VOID_DISC = registerItem("void_disc", new MusicDiscItem(5, ModSounds.VOID_DISC, new FabricItemSettings().maxCount(1), 144));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Hmh2.MOD_ID, name), item);
    }

    public static final Item ASDFG =
            Registry.register(
                    Registries.ITEM,
                    new Identifier(Hmh2.MOD_ID, "asdfg"),
                    new DecreasingItem(new FabricItemSettings()) {public String getTranslationKey() {return "Asdfg";}}
            );

    public static final Item ASDF = registerNewItem("asdf", new Item(new FabricItemSettings()));

    private static Item registerNewItem(String name, Item item) {
        String x = "asdf";
        if(item.getTranslationKey()==null){
            String b = Util.createTranslationKey(langName(name), new Identifier(Hmh2.MOD_ID));
            //x = langName(b);
        }
        return Registry.register(Registries.ITEM, new Identifier(Hmh2.MOD_ID, x), item);
    }

    public static String langName(String lang) {
        StringBuilder result = new StringBuilder();
        boolean capitalize = true;
        for (char character : lang.toCharArray()) {
            if (character == '_') {
                result.append(' ');
                capitalize = true;
            } else if (capitalize) {
                result.append(Character.toUpperCase(character));
                capitalize = false;
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
    
    public static void registerModItems() {

    }
}
