package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.entity.MobEntities;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.custom.dyes.*;
import net.romeosnowblitz.hmh2.item.custom.food.*;
import net.romeosnowblitz.hmh2.item.custom.test.*;

import static net.minecraft.item.Items.BUCKET;
import static net.minecraft.item.Items.GLASS_BOTTLE;

public class ModItems {

    //あなたの名前

    /*/Test
    public static final Item TEST_ITEM = registerItem("test_item", new TestItem(10, 1, 10, new Item.Settings().maxDamage(1000)));
     */

    //New Items
    public static final Item FORTRESS_SEEKER = registerItem("fortress_seeker", new FortressSeeker(new FabricItemSettings()));
    public static final Item SUN_STONE = registerItem("sun_stone", new SunStone(new FabricItemSettings()));
    public static final Item REVIVAL_STONE = registerItem("revival_stone", new RevivalStone(new FabricItemSettings()));
    public static final Item GLUE = registerItem("glue", new Item(new FabricItemSettings()));
    public static final Item FLOUR = registerItem("flour", new Item(new FabricItemSettings()));
    public static final Item DISC_FRAGMENT = registerItem("disc_fragment", new Disc_Fragment(new FabricItemSettings()));
    public static final Item NULL_PASSER = registerItem("null_passer", new NullPasser(new FabricItemSettings().maxDamage(3)));

    //Bows
    public static final Item BAMBOO_BOW = registerItem("bamboo_bow", new BowItem(new FabricItemSettings().maxDamage(192)));
    public static final Item BAMBOO_SHIELD = registerItem("bamboo_shield", new ShieldItem(new FabricItemSettings().maxDamage(192)));

    //Materials
    public static final Item CORK = registerItem("cork", new Item(new FabricItemSettings()));
    public static final Item GRAPHITE = registerItem("graphite", new Item(new FabricItemSettings()));
    public static final Item HEART = registerItem("heart", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 60, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,60,0), 1F).alwaysEdible().build())));
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
    public static final Item BANANA_PEEL = registerItem("banana_peel", new Item(new FabricItemSettings()));
    public static final Item BONE_PLATE = registerItem("bone_plate", new Item(new FabricItemSettings()));
    public static final Item CHAINED_MESH = registerItem("chained_mesh", new Item(new FabricItemSettings()));
    public static final Item CLOTH = registerItem("cloth", new Item(new FabricItemSettings()));
    public static final Item HOOF_POWDER = registerItem("hoof_powder", new Item(new FabricItemSettings()));
    public static final Item CONE = registerItem("cone", new Item(new FabricItemSettings()));
    public static final Item ENDER_SHARD = registerItem("ender_shard", new Item(new FabricItemSettings()));
    public static final Item ENDER_DUST = registerItem("ender_dust", new Item(new FabricItemSettings()));
    public static final Item ENDER_INGOT = registerItem("ender_ingot", new Item(new FabricItemSettings()));
    public static final Item FROZEN_MILK = registerItem("frozen_milk", new Item(new FabricItemSettings()));
    public static final Item ITEM = registerItem("item", new Item(new FabricItemSettings()));
    public static final Item OIL_BALL = registerItem("oil_ball", new Item(new FabricItemSettings()));
    public static final Item PENCIL = registerItem("pencil", new Item(new FabricItemSettings()));
    public static final Item SILK = registerItem("silk", new Item(new FabricItemSettings()));
    public static final Item SHEET_PAN = registerItem("sheet_pan", new Item(new FabricItemSettings()));
    public static final Item VEGAN_LEATHER = registerItem("vegan_leather", new Item(new FabricItemSettings()));
    public static final Item WOODED_DIAMOND = registerItem("wooded_diamond", new Item(new FabricItemSettings()));
    public static final Item GRANNY_LOTION = registerItem("granny_lotion", new GrannyLotion(new FabricItemSettings().maxDamage(14)));

    public static final Item ROSE_DYE = registerItem("rose_dye", new RedDyeItem(new FabricItemSettings()));
    public static final Item ULTRAMARINE_DYE = registerItem("ultramarine_dye", new BlueDyeItem(new FabricItemSettings()));
    public static final Item NEW_GREEN_DYE = registerItem("new_green_dye", new GreenDyeItem(new FabricItemSettings()));
    public static final Item SPRING_GREEN_DYE = registerItem("spring_green_dye", new CyanDyeItem(new FabricItemSettings()));
    public static final Item VIOLET_DYE = registerItem("violet_dye", new PurpleDyeItem(new FabricItemSettings()));
    //Seeds
    public static final Item MIDAS_SEEDS = registerItem("midas_seeds", new AliasedBlockItem((ModBlocks.MIDAS_TOUCH), new FabricItemSettings()));
    public static final Item ENDER_CORN_SEEDS = registerItem("ender_corn_seeds", new AliasedBlockItem((ModBlocks.ENDER_CORN_BLOCK), new FabricItemSettings()));
    public static final Item ENDER_CORN = ModItems.registerItem("ender_corn", new EnderSkinConsumableShort(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build())));

    public static final Item BANANA_SIGN = registerItem("banana_sign", new SignItem(new FabricItemSettings().maxCount(16), WoodworkBlocks.BANANA_SIGN_BLOCK, WoodworkBlocks.BANANA_WALL_SIGN_BLOCK));
    public static final Item CHERRY_SIGN = registerItem("cherry_sign", new SignItem(new FabricItemSettings().maxCount(16), WoodworkBlocks.CHERRY_SIGN_BLOCK, WoodworkBlocks.CHERRY_WALL_SIGN_BLOCK));
    public static final Item CORK_OAK_SIGN = registerItem("cork_oak_sign", new SignItem(new FabricItemSettings().maxCount(16), WoodworkBlocks.CORK_OAK_SIGN_BLOCK, WoodworkBlocks.CORK_OAK_WALL_SIGN_BLOCK));
    public static final Item JACARANDA_SIGN = registerItem("jacaranda_sign", new SignItem(new FabricItemSettings().maxCount(16), WoodworkBlocks.JACARANDA_SIGN_BLOCK, WoodworkBlocks.JACARANDA_WALL_SIGN_BLOCK));
    public static final Item MAHOE_SIGN = registerItem("mahoe_sign", new SignItem(new FabricItemSettings().maxCount(16), WoodworkBlocks.MAHOE_SIGN_BLOCK, WoodworkBlocks.MAHOE_WALL_SIGN_BLOCK));
    public static final Item MANGO_SIGN = registerItem("mango_sign", new SignItem(new FabricItemSettings().maxCount(16), WoodworkBlocks.MANGO_SIGN_BLOCK, WoodworkBlocks.MANGO_WALL_SIGN_BLOCK));
    public static final Item WILLOW_SIGN = registerItem("willow_sign", new SignItem(new FabricItemSettings().maxCount(16), WoodworkBlocks.WILLOW_SIGN_BLOCK, WoodworkBlocks.WILLOW_WALL_SIGN_BLOCK));

    //Food (16)
    public static final Item APPLE_JUICE = registerItem("apple_juice", (Item)new HoneyBottleItem(new Item.Settings().recipeRemainder(GLASS_BOTTLE).food(FoodComponents.HONEY_BOTTLE).maxCount(16)));
    public static final Item APPLE_PIE = registerItem("apple_pie", new ConsumeLeaveSheetPan(new FabricItemSettings().recipeRemainder(BUCKET).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build())));
    public static final Item BACON = registerItem("bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build())));
    public static final Item BANANAS = registerItem("bananas", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build())));
    public static final Item BEEF_JERKY = registerItem("beef_jerky", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())));
    public static final Item BLUEBERRIES = registerItem("blueberries", (Item)new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH, new Item.Settings().food(FoodComponents.SWEET_BERRIES)));
    public static final Item BLUEBERRY_JAM = registerItem("blueberry_jam", new ConsumeLeaveBottle(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
    public static final Item BLUEBERRY_PIE = registerItem("blueberry_pie", new ConsumeLeaveSheetPan(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build())));
    public static final Item BURNT_TOAST = registerItem("burnt_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.3f).build())));
    public static final Item BUTTERED_TOAST = registerItem("buttered_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(2.0f).build())));
    public static final Item CHEESE = registerItem("cheese", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.9f).build())));
    public static final Item CHEESE_SLICE = registerItem("cheese_slice", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build())));
    public static final Item CHERRIES = registerItem("cherries", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build())));
    public static final Item CHERRY_PIE = registerItem("cherry_pie", new ConsumeLeaveSheetPan(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build())));
    public static final Item CHICKEN_NUGGET = registerItem("chicken_nugget", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().snack().hunger(1).saturationModifier(0.3f).build())));
    public static final Item CHICKEN_SANDWICH = registerItem("chicken_sandwich", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build())));
    public static final Item CHOCOLATE_ICE_CREAM = registerItem("chocolate_ice_cream",(Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).maxCount(1)));
    public static final Item DOUGH = ModItems.registerItem("dough", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())));
    public static final Item ENDCHILADA = ModItems.registerItem("endchilada", new EnderSkinConsumableLong(new FabricItemSettings().food(new FoodComponent.Builder().hunger(20).saturationModifier(2.0f).build())));
    public static final Item GOLDEN_SALMON = registerItem("golden_salmon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2f).build())));
    public static final Item LIGHT_TOAST = registerItem("light_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).build())));
    public static final Item MANGO = registerItem("mango", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build())));
    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build())));
    public static final Item ORANGE_JUICE = registerItem("orange_juice", (Item)new HoneyBottleItem(new Item.Settings().recipeRemainder(GLASS_BOTTLE).food(FoodComponents.HONEY_BOTTLE).maxCount(16)));
    public static final Item RAW_BACON= registerItem("raw_bacon", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3f).meat().build())));
    public static final Item RAW_CHICKEN_NUGGET = registerItem("raw_chicken_nugget", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().snack().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3f).meat().build())));
    public static final Item SLICED_BREAD = registerItem("sliced_bread", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build())));
    public static final Item SASHIMI = registerItem("sashimi", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build())));
    public static final Item STRAWBERRIES = registerItem("strawberries", (Item)new AliasedBlockItem(ModBlocks.STRAWBERRY_BUSH, new Item.Settings().food(FoodComponents.SWEET_BERRIES)));
    public static final Item STRAWBERRY_JAM = registerItem("strawberry_jam", new ConsumeLeaveBottle(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
    public static final Item STRAWBERRY_PIE = registerItem("strawberry_pie", new ConsumeLeaveSheetPan(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build())));
    public static final Item TOOTHPASTE = registerItem("toothpaste", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300,255), 1.0F).build())));
    public static final Item TOAST = registerItem("toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.0f).build())));
    public static final Item TORTILLA = ModItems.registerItem("tortilla", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build())));

    //Special Items
    public static final Item CHOCOLATE_MILK = registerItem("chocolate_milk", new BucketItem(ModFluids.CHOCOLATE_MILK_STILL, new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).recipeRemainder(BUCKET).maxCount(1)));
    public static final Item HEATED_OIL_BUCKET = registerItem("heated_oil_bucket", new BucketItem(ModFluids.HEATED_OIL_STILL, new FabricItemSettings().recipeRemainder(BUCKET).maxCount(1)));
    public static final Item HONEY_BUCKET = registerItem("honey_bucket", new MultiPurposeHoneyBucket(ModFluids.HONEY_STILL, new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).recipeRemainder(BUCKET).maxCount(1)));
    public static final Item OIL_BUCKET = registerItem("oil_bucket", new BucketItem(ModFluids.OIL_STILL, new FabricItemSettings().maxCount(1)));

    //spawn eggs
    public static final Item PENGUIN_SPAWN_EGG = registerItem("penguin_spawn_egg", new SpawnEggItem(MobEntities.PENGUIN,0x0d0d0d, 0xffffff, new FabricItemSettings().maxCount(1)));
    public static final Item SHADOW_CREATURE_SPAWN_EGG = registerItem("shadow_creature_spawn_egg", new SpawnEggItem(MobEntities.SHADOW_CREATURE,0x0d0d0d, 0xffffff, new FabricItemSettings().maxCount(1)));
    public static final Item THE_GREAT_HUNGER_SPAWN_EGG = registerItem("the_great_hunger_spawn_egg", new SpawnEggItem(MobEntities.THE_GREAT_HUNGER,0x092306, 0x147e23, new FabricItemSettings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register (Registries.ITEM, new Identifier(Hmh2.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ModItemGroup.ITEM, DISC_FRAGMENT);
        addToItemGroup(ModItemGroup.ITEM, FORTRESS_SEEKER);
        addToItemGroup(ModItemGroup.ITEM, SUN_STONE);
        addToItemGroup(ModItemGroup.TESTING, REVIVAL_STONE);
        addToItemGroup(ModItemGroup.ITEM, GLUE);
        addToItemGroup(ModItemGroup.ITEM, FLOUR);


        addToItemGroup(ModItemGroup.ITEM, BAMBOO_BOW);
        addToItemGroup(ModItemGroup.ITEM, BAMBOO_SHIELD);
        addToItemGroup(ModItemGroup.ITEM, CORK);
        addToItemGroup(ModItemGroup.ITEM, GRAPHITE);
        addToItemGroup(ModItemGroup.ITEM, HEART);
        addToItemGroup(ModItemGroup.ITEM, HELLSTONE);
        addToItemGroup(ModItemGroup.ITEM, LUCKY_PIECE);
        addToItemGroup(ModItemGroup.ITEM, QUAERITE_FRAGMENT);
        addToItemGroup(ModItemGroup.ITEM, RAW_PLATINUM);
        addToItemGroup(ModItemGroup.ITEM, RAW_SILVER);
        addToItemGroup(ModItemGroup.ITEM, RAW_TIN);
        addToItemGroup(ModItemGroup.ITEM, RAW_TITANIUM);
        addToItemGroup(ModItemGroup.ITEM, SALT);
        addToItemGroup(ModItemGroup.ITEM, ASHES);
        addToItemGroup(ModItemGroup.ITEM, BURNT_EGGSHELL);
        addToItemGroup(ModItemGroup.ITEM, HEAVY_CREAM);
        addToItemGroup(ModItemGroup.ITEM, PLASTIC);
        addToItemGroup(ModItemGroup.ITEM, RESIN);
        addToItemGroup(ModItemGroup.ITEM, PLATINUM_INGOT);
        addToItemGroup(ModItemGroup.ITEM, SILVER_INGOT);
        addToItemGroup(ModItemGroup.ITEM, TIN_INGOT);
        addToItemGroup(ModItemGroup.ITEM, TITANIUM_INGOT);
        addToItemGroup(ModItemGroup.ITEM, BRONZE_INGOT);
        addToItemGroup(ModItemGroup.ITEM, BUTTER);
        addToItemGroup(ModItemGroup.ITEM, MYSTERIOUS_WHITE_DEBRIS);
        addToItemGroup(ModItemGroup.ITEM, MYSTERIOUS_YELLOW_DEBRIS);
        addToItemGroup(ModItemGroup.ITEM, MYSTERIOUS_CYAN_DEBRIS);
        addToItemGroup(ModItemGroup.ITEM, MYSTERIOUS_MAGENTA_DEBRIS);
        addToItemGroup(ModItemGroup.ITEM, HOOF);
        addToItemGroup(ModItemGroup.ITEM, FUR_PELT);
        addToItemGroup(ModItemGroup.ITEM, POISON_SAC);
        addToItemGroup(ModItemGroup.ITEM, RENNET);
        addToItemGroup(ModItemGroup.ITEM, BANANA_PEEL);
        addToItemGroup(ModItemGroup.ITEM, BONE_PLATE);
        addToItemGroup(ModItemGroup.ITEM, CHAINED_MESH);
        addToItemGroup(ModItemGroup.ITEM, CLOTH);
        addToItemGroup(ModItemGroup.ITEM, HOOF_POWDER);
        addToItemGroup(ModItemGroup.ITEM, CONE);
        addToItemGroup(ModItemGroup.ITEM, ENDER_SHARD);
        addToItemGroup(ModItemGroup.ITEM, ENDER_DUST);
        addToItemGroup(ModItemGroup.ITEM, ENDER_INGOT);
        addToItemGroup(ModItemGroup.ITEM, FROZEN_MILK);
        addToItemGroup(ModItemGroup.ITEM, ITEM);
        addToItemGroup(ModItemGroup.ITEM, OIL_BALL);
        addToItemGroup(ModItemGroup.ITEM, PENCIL);
        addToItemGroup(ModItemGroup.ITEM, SILK);
        addToItemGroup(ModItemGroup.ITEM, SHEET_PAN);
        addToItemGroup(ModItemGroup.ITEM, VEGAN_LEATHER);
        addToItemGroup(ModItemGroup.ITEM, WOODED_DIAMOND);
        addToItemGroup(ModItemGroup.ITEM, GRANNY_LOTION);
        addToItemGroup(ModItemGroup.ITEM, ROSE_DYE);
        addToItemGroup(ModItemGroup.ITEM, ULTRAMARINE_DYE);
        addToItemGroup(ModItemGroup.ITEM, NEW_GREEN_DYE);
        addToItemGroup(ModItemGroup.ITEM, SPRING_GREEN_DYE);
        addToItemGroup(ModItemGroup.ITEM, VIOLET_DYE);
        addToItemGroup(ModItemGroup.ITEM, MIDAS_SEEDS);
        addToItemGroup(ModItemGroup.WOODWORKS, BANANA_SIGN);
        addToItemGroup(ModItemGroup.WOODWORKS, CHERRY_SIGN);
        addToItemGroup(ModItemGroup.WOODWORKS, CORK_OAK_SIGN);
        addToItemGroup(ModItemGroup.WOODWORKS, JACARANDA_SIGN);
        addToItemGroup(ModItemGroup.WOODWORKS, MAHOE_SIGN);
        addToItemGroup(ModItemGroup.WOODWORKS, MANGO_SIGN);
        addToItemGroup(ModItemGroup.WOODWORKS, WILLOW_SIGN);
        addToItemGroup(ModItemGroup.ITEM, APPLE_JUICE);
        addToItemGroup(ModItemGroup.ITEM, APPLE_PIE);
        addToItemGroup(ModItemGroup.ITEM, BACON);
        addToItemGroup(ModItemGroup.ITEM, BANANAS);
        addToItemGroup(ModItemGroup.ITEM, BEEF_JERKY);
        addToItemGroup(ModItemGroup.ITEM, BLUEBERRIES);
        addToItemGroup(ModItemGroup.ITEM, BLUEBERRY_JAM);
        addToItemGroup(ModItemGroup.ITEM, BLUEBERRY_PIE);
        addToItemGroup(ModItemGroup.ITEM, BURNT_TOAST);
        addToItemGroup(ModItemGroup.ITEM, BUTTERED_TOAST);
        addToItemGroup(ModItemGroup.ITEM, CHEESE);
        addToItemGroup(ModItemGroup.ITEM, CHEESE_SLICE);
        addToItemGroup(ModItemGroup.ITEM, CHERRIES);
        addToItemGroup(ModItemGroup.ITEM, CHERRY_PIE);
        addToItemGroup(ModItemGroup.ITEM, CHICKEN_NUGGET);
        addToItemGroup(ModItemGroup.ITEM, CHICKEN_SANDWICH);
        addToItemGroup(ModItemGroup.ITEM, CHOCOLATE_ICE_CREAM);
        addToItemGroup(ModItemGroup.ITEM, GOLDEN_SALMON);
        addToItemGroup(ModItemGroup.ITEM, LIGHT_TOAST);
        addToItemGroup(ModItemGroup.ITEM, MANGO);
        addToItemGroup(ModItemGroup.ITEM, ORANGE);
        addToItemGroup(ModItemGroup.ITEM, ORANGE_JUICE);
        addToItemGroup(ModItemGroup.ITEM, RAW_BACON);
        addToItemGroup(ModItemGroup.ITEM, RAW_CHICKEN_NUGGET);
        addToItemGroup(ModItemGroup.ITEM, SLICED_BREAD);
        addToItemGroup(ModItemGroup.ITEM, SASHIMI);
        addToItemGroup(ModItemGroup.ITEM, STRAWBERRIES);
        addToItemGroup(ModItemGroup.ITEM, STRAWBERRY_JAM);
        addToItemGroup(ModItemGroup.ITEM, STRAWBERRY_PIE);
        addToItemGroup(ModItemGroup.ITEM, TOOTHPASTE);
        addToItemGroup(ModItemGroup.ITEM, TOAST);
        addToItemGroup(ModItemGroup.ITEM, CHOCOLATE_MILK);
        addToItemGroup(ModItemGroup.ITEM, HEATED_OIL_BUCKET);
        addToItemGroup(ModItemGroup.ITEM, HONEY_BUCKET);
        addToItemGroup(ModItemGroup.ITEM, OIL_BUCKET);
        addToItemGroup(ModItemGroup.ITEM, PENGUIN_SPAWN_EGG);
        addToItemGroup(ModItemGroup.ITEM, SHADOW_CREATURE_SPAWN_EGG);
        addToItemGroup(ModItemGroup.ITEM, THE_GREAT_HUNGER_SPAWN_EGG);
    }

    public static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        Hmh2.LOGGER.info("Registering Mod Items for " + Hmh2.MOD_ID);
        addItemsToItemGroup();
    }
}
