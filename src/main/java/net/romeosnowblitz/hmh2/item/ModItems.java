package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.WoodworkBlocks;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.custom.custom.FortressSeeker;
import net.romeosnowblitz.hmh2.item.custom.food.ConsumeLeaveBottle;
import net.romeosnowblitz.hmh2.item.custom.GrannyLotion;
import net.romeosnowblitz.hmh2.item.custom.food.ConsumeLeaveSheetPan;

import static net.minecraft.item.Items.BUCKET;
import static net.minecraft.item.Items.GLASS_BOTTLE;

public class ModItems {

    public static final Item FORTRESS_SEEKER = registerItem("fortress_seeker", new FortressSeeker(new FabricItemSettings().group(ModItemGroup.ITEM)));

    public static final Item BAMBOO_BOW = registerItem("bamboo_bow", new BowItem(new FabricItemSettings().group(ModItemGroup.ITEM).maxDamage(192)));

    public static final Item CORK = registerItem("cork", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item GRAPHITE = registerItem("graphite", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item HEART = registerItem("heart", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 60, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,60,0), 1F).alwaysEdible().build()).group(ModItemGroup.ITEM)));
    public static final Item HELLSTONE = registerItem("hellstone", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item LUCKY_PIECE = registerItem("lucky_piece", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item QUAERITE_FRAGMENT = registerItem("quaerite_fragment", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item RAW_PLATINUM = registerItem("raw_platinum", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SALT = registerItem("salt", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));

    //Obtained from Smelting (3)
    public static final Item ASHES = registerItem("ashes", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BURNT_EGGSHELL = registerItem("burnt_eggshell", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item HEAVY_CREAM = registerItem("heavy_cream", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600,0), 0.05F)
            .statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,600,0), 0.05F).statusEffect(new StatusEffectInstance(StatusEffects.WITHER,600,0), 0.05F).build()).group(ModItemGroup.ITEM)));
    public static final Item PLASTIC = registerItem("plastic", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item RESIN = registerItem("resin", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));


    //Obtained from Stonecutter/Smithing Table (1)
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BUTTER = registerItem("butter", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item MYSTERIOUS_CYAN_DEBRIS = registerItem("mysterious_cyan_debris", new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.ITEM)));
    public static final Item MYSTERIOUS_MAGENTA_DEBRIS = registerItem("mysterious_magenta_debris", new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ITEM)));
    public static final Item MYSTERIOUS_WHITE_DEBRIS = registerItem("mysterious_white_debris", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item MYSTERIOUS_YELLOW_DEBRIS = registerItem("mysterious_yellow_debris", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.ITEM)));

    //Obtained from Mob Loot (2)
    public static final Item COW_HOOF = registerItem("cow_hoof", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item FUR_PELT = registerItem("fur_pelt", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item POISON_SAC = registerItem("poison_sac", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item RENNET = registerItem("rennet", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));

    //Obtained from Crafting (8)
    public static final Item BANANA_PEEL = registerItem("banana_peel", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BONE_PLATE = registerItem("bone_plate", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item CHAINED_MESH = registerItem("chained_mesh", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item CLOTH = registerItem("cloth", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item COW_HOOF_POWDER = registerItem("cow_hoof_powder", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item CONE = registerItem("cone", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item ENDER_SHARD = registerItem("ender_shard", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item ENDER_DUST = registerItem("ender_dust", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item ENDER_INGOT = registerItem("ender_ingot", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item FROZEN_MILK = registerItem("frozen_milk", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item ITEM = registerItem("item", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item OIL_BALL = registerItem("oil_ball", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item PENCIL = registerItem("pencil", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SILK = registerItem("silk", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SHEET_PAN = registerItem("sheet_pan", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item VEGAN_LEATHER = registerItem("vegan_leather", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item WOODED_DIAMOND = registerItem("wooded_diamond", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item GRANNY_LOTION = registerItem("granny_lotion", new GrannyLotion(new FabricItemSettings().maxDamage(14).group(ModItemGroup.ITEM)));

    public static final Item ROSE_DYE = registerItem("rose_dye", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item ULTRAMARINE_DYE = registerItem("ultramarine_dye", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item NEW_GREEN_DYE = registerItem("new_green_dye", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SPRING_GREEN_DYE = registerItem("spring_green_dye", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item VIOLET_DYE = registerItem("violet_dye", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));

    //Seeds
    public static final Item MIDAS_SEEDS = registerItem("midas_seeds", new AliasedBlockItem((ModBlocks.MIDAS_TOUCH), new FabricItemSettings().group(ModItemGroup.ITEM)));

    public static final Item BANANA_SIGN = registerItem("banana_sign", new SignItem(new FabricItemSettings().group(ModItemGroup.WOODWORKS).maxCount(16), WoodworkBlocks.BANANA_SIGN_BLOCK, WoodworkBlocks.BANANA_WALL_SIGN_BLOCK));
    public static final Item CHERRY_SIGN = registerItem("cherry_sign", new SignItem(new FabricItemSettings().group(ModItemGroup.WOODWORKS).maxCount(16), WoodworkBlocks.CHERRY_SIGN_BLOCK, WoodworkBlocks.CHERRY_WALL_SIGN_BLOCK));
    public static final Item JACARANDA_SIGN = registerItem("jacaranda_sign", new SignItem(new FabricItemSettings().group(ModItemGroup.WOODWORKS).maxCount(16), WoodworkBlocks.JACARANDA_SIGN_BLOCK, WoodworkBlocks.JACARANDA_WALL_SIGN_BLOCK));
    public static final Item MAHOE_SIGN = registerItem("mahoe_sign", new SignItem(new FabricItemSettings().group(ModItemGroup.WOODWORKS).maxCount(16), WoodworkBlocks.MAHOE_SIGN_BLOCK, WoodworkBlocks.MAHOE_WALL_SIGN_BLOCK));
    public static final Item MANGO_SIGN = registerItem("mango_sign", new SignItem(new FabricItemSettings().group(ModItemGroup.WOODWORKS).maxCount(16), WoodworkBlocks.MANGO_SIGN_BLOCK, WoodworkBlocks.MANGO_WALL_SIGN_BLOCK));
    public static final Item WILLOW_SIGN = registerItem("willow_sign", new SignItem(new FabricItemSettings().group(ModItemGroup.WOODWORKS).maxCount(16), WoodworkBlocks.WILLOW_SIGN_BLOCK, WoodworkBlocks.WILLOW_WALL_SIGN_BLOCK));

    //Food (16)
    public static final Item APPLE_JUICE = registerItem("apple_juice", (Item)new HoneyBottleItem(new Item.Settings().recipeRemainder(GLASS_BOTTLE).food(FoodComponents.HONEY_BOTTLE).group(ItemGroup.FOOD).maxCount(16)));
    public static final Item APPLE_PIE = registerItem("apple_pie", new ConsumeLeaveSheetPan(new FabricItemSettings().recipeRemainder(BUCKET).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
    public static final Item BACON = registerItem("bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build()).group(ItemGroup.FOOD)));
    public static final Item BANANAS = registerItem("bananas", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
    public static final Item BEEF_JERKY = registerItem("beef_jerky", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build()).group(ItemGroup.FOOD)));
    public static final Item BLUEBERRIES = registerItem("blueberries", (Item)new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH, new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.SWEET_BERRIES)));
    public static final Item BLUEBERRY_JAM = registerItem("blueberry_jam", new ConsumeLeaveBottle(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).group(ItemGroup.FOOD)));
    public static final Item BLUEBERRY_PIE = registerItem("blueberry_pie", new ConsumeLeaveSheetPan(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
    public static final Item BURNT_TOAST = registerItem("burnt_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
    public static final Item BUTTERED_TOAST = registerItem("buttered_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(2.0f).build()).group(ItemGroup.FOOD)));
    public static final Item CHEESE = registerItem("cheese", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.9f).build()).group(ItemGroup.FOOD)));
    public static final Item CHEESE_SLICE = registerItem("cheese_slice", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
    public static final Item CHERRIES = registerItem("cherries", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
    public static final Item CHERRY_PIE = registerItem("cherry_pie", new ConsumeLeaveSheetPan(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
    public static final Item CHICKEN_NUGGET = registerItem("chicken_nugget", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().snack().hunger(1).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
    public static final Item CHICKEN_SANDWICH = registerItem("chicken_sandwich", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build()).group(ItemGroup.FOOD)));
    public static final Item CHOCOLATE_ICE_CREAM = registerItem("chocolate_ice_cream",(Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).group(ItemGroup.FOOD).maxCount(1)));
    public static final Item GOLDEN_SALMON = registerItem("golden_salmon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2f).build()).group(ItemGroup.FOOD)));
    public static final Item LIGHT_TOAST = registerItem("light_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).build()).group(ItemGroup.FOOD)));
    public static final Item MANGO = registerItem("mango", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
    public static final Item ORANGE_JUICE = registerItem("orange_juice", (Item)new HoneyBottleItem(new Item.Settings().recipeRemainder(GLASS_BOTTLE).food(FoodComponents.HONEY_BOTTLE).group(ItemGroup.FOOD).maxCount(16)));
    public static final Item RAW_BACON= registerItem("raw_bacon", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3f).meat().build()).group(ItemGroup.FOOD)));
    public static final Item RAW_CHICKEN_NUGGET = registerItem("raw_chicken_nugget", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().snack().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3f).meat().build()).group(ItemGroup.FOOD)));
    public static final Item SLICED_BREAD = registerItem("sliced_bread", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build()).group(ItemGroup.FOOD)));
    public static final Item SASHIMI = registerItem("sashimi", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build()).group(ItemGroup.FOOD)));
    public static final Item STRAWBERRIES = registerItem("strawberries", (Item)new AliasedBlockItem(ModBlocks.STRAWBERRY_BUSH, new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.SWEET_BERRIES)));
    public static final Item STRAWBERRY_JAM = registerItem("strawberry_jam", new ConsumeLeaveBottle(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).group(ItemGroup.FOOD)));
    public static final Item STRAWBERRY_PIE = registerItem("strawberry_pie", new ConsumeLeaveSheetPan(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
    public static final Item TOOTHPASTE = registerItem("toothpaste", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300,255), 1.0F).build()).group(ModItemGroup.ITEM)));
    public static final Item TOAST = registerItem("toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.0f).build()).group(ItemGroup.FOOD)));

    //Special Items
    public static final Item CHOCOLATE_MILK = registerItem("chocolate_milk", new BucketItem(ModFluids.CHOCOLATE_MILK_STILL, new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).recipeRemainder(BUCKET).group(ModItemGroup.ITEM).maxCount(1)));
    public static final Item HEATED_OIL_BUCKET = registerItem("heated_oil_bucket", new BucketItem(ModFluids.HEATED_OIL_STILL, new FabricItemSettings().recipeRemainder(BUCKET).group(ModItemGroup.ITEM).maxCount(1)));
    public static final Item OIL_BUCKET = registerItem("oil_bucket", new BucketItem(ModFluids.OIL_STILL, new FabricItemSettings().group(ModItemGroup.ITEM).maxCount(1)));


    //spawn eggs
    public static final Item PENGUIN_SPAWN_EGG = registerItem("penguin_spawn_egg", new SpawnEggItem(ModEntities.PENGUIN,0x0d0d0d, 0xffffff, new FabricItemSettings().group(ModItemGroup.ITEM).maxCount(1)));
    public static final Item RACCOON_SPAWN_EGG = registerItem("raccoon_spawn_egg", new SpawnEggItem(ModEntities.RACCOON,0x948e8d, 0x3b3635, new FabricItemSettings().group(ModItemGroup.ITEM).maxCount(1)));
    public static final Item SHADOW_CREATURE_SPAWN_EGG = registerItem("shadow_creature_spawn_egg", new SpawnEggItem(ModEntities.SHADOW_CREATURE,0x0d0d0d, 0xffffff, new FabricItemSettings().group(ModItemGroup.ITEM).maxCount(1)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Hmh2.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Hmh2.LOGGER.info("Registering Mod Items for " + Hmh2.MOD_ID);
    }
}
