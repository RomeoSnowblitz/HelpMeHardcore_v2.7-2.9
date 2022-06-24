package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.block.custom.swords.HeartStealerSword;
import net.romeosnowblitz.hmh2.block.custom.swords.PoisonSword;
import net.romeosnowblitz.hmh2.block.custom.swords.SlownessSword;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.custom.GrannyLotion;
import net.romeosnowblitz.hmh2.item.custom.amulets.*;
import net.romeosnowblitz.hmh2.item.custom.charms.FightCharmItem;
import net.romeosnowblitz.hmh2.item.custom.charms.LightCharmItem;
import net.romeosnowblitz.hmh2.item.custom.charms.MightCharmItem;
import net.romeosnowblitz.hmh2.item.custom.charms.SightCharmItem;
import net.romeosnowblitz.hmh2.item.custom.perks.FullEmeraldPerk;
import net.romeosnowblitz.hmh2.item.custom.perks.FullHeartPerk;
import net.romeosnowblitz.hmh2.item.custom.perks.FullHellstonePerk;
import net.romeosnowblitz.hmh2.item.custom.perks.FullQuaeritePerk;
import net.romeosnowblitz.hmh2.item.custom.tools.ModAxeItem;
import net.romeosnowblitz.hmh2.item.custom.tools.ModHoeItem;
import net.romeosnowblitz.hmh2.item.custom.tools.ModPickaxeItem;

import static net.minecraft.item.Items.BUCKET;
import static net.minecraft.item.Items.GLASS_BOTTLE;

public class ModItems {

    public static final Item BAMBOO_BOW = registerItem("bamboo_bow", new BowItem(new FabricItemSettings().group(ModItemGroup.ITEM).maxDamage(640)));

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

    //Gems (23)
    public static final Item AMBER = registerItem("amber", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item ANDALUSITE = registerItem("andalusite", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item AQUAMARINE = registerItem("aquamarine", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item CITRINE = registerItem("citrine", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item DIOPSIDE = registerItem("diopside", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item GARNET = registerItem("garnet", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item HESSONITE = registerItem("hessonite", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item MALICHITE = registerItem("malichite", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item MOONSTONE = registerItem("moonstone", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item OPAL = registerItem("opal", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item PERIDOT = registerItem("peridot", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item PREHNITE = registerItem("prehnite", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SMOKY_QUARTZ = registerItem("smoky_quartz", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SPESSARITE = registerItem("spessarite", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SPHENE = registerItem("sphene", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SPINEL = registerItem("spinel", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item TANZANITE = registerItem("tanzanite", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item TORMALINE = registerItem("tormaline", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item TSAVORITE = registerItem("tsavorite", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item ZIRCON = registerItem("zircon", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));

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
    public static final Item WOODED_DIAMOND = registerItem("wooded_diamond", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item GRANNY_LOTION = registerItem("granny_lotion", new GrannyLotion(new FabricItemSettings().maxDamage(14).group(ModItemGroup.ITEM)));
    public static final Item ROSE_DYE = registerItem("rose_dye", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item ULTRAMARINE_DYE = registerItem("ultramarine_dye", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item NEW_GREEN_DYE = registerItem("new_green_dye", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SPRING_GREEN_DYE = registerItem("spring_green_dye", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item VIOLET_DYE = registerItem("violet_dye", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));

    //Seeds
    public static final Item MIDAS_SEEDS = registerItem("midas_seeds", new AliasedBlockItem((ModBlocks.MIDAS_TOUCH), new FabricItemSettings().group(ModItemGroup.ITEM)));

    public static final Item BANANA_SIGN = registerItem("banana_sign", new SignItem(new FabricItemSettings().group(ModItemGroup.ITEM).maxCount(16), ModBlocks.BANANA_SIGN_BLOCK, ModBlocks.BANANA_WALL_SIGN_BLOCK));
    public static final Item CHERRY_SIGN = registerItem("cherry_sign", new SignItem(new FabricItemSettings().group(ModItemGroup.ITEM).maxCount(16), ModBlocks.CHERRY_SIGN_BLOCK, ModBlocks.CHERRY_WALL_SIGN_BLOCK));
    public static final Item JACARANDA_SIGN = registerItem("jacaranda_sign", new SignItem(new FabricItemSettings().group(ModItemGroup.ITEM).maxCount(16), ModBlocks.JACARANDA_SIGN_BLOCK, ModBlocks.JACARANDA_WALL_SIGN_BLOCK));
    public static final Item MAHOE_SIGN = registerItem("mahoe_sign", new SignItem(new FabricItemSettings().group(ModItemGroup.ITEM).maxCount(16), ModBlocks.MAHOE_SIGN_BLOCK, ModBlocks.MAHOE_WALL_SIGN_BLOCK));
    public static final Item MANGO_SIGN = registerItem("mango_sign", new SignItem(new FabricItemSettings().group(ModItemGroup.ITEM).maxCount(16), ModBlocks.MANGO_SIGN_BLOCK, ModBlocks.MANGO_WALL_SIGN_BLOCK));
    public static final Item WILLOW_SIGN = registerItem("willow_sign", new SignItem(new FabricItemSettings().group(ModItemGroup.ITEM).maxCount(16), ModBlocks.WILLOW_SIGN_BLOCK, ModBlocks.WILLOW_WALL_SIGN_BLOCK));

    //Food (16)
    public static final Item APPLE_JUICE = registerItem("apple_juice", (Item)new HoneyBottleItem(new Item.Settings().recipeRemainder(GLASS_BOTTLE).food(FoodComponents.HONEY_BOTTLE).group(ItemGroup.FOOD).maxCount(16)));
    public static final Item BACON = registerItem("bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build()).group(ItemGroup.FOOD)));
    public static final Item BANANAS = registerItem("bananas", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
    public static final Item BEEF_JERKY = registerItem("beef_jerky", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build()).group(ItemGroup.FOOD)));
    public static final Item BLUEBERRIES = registerItem("blueberries", (Item)new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH, new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.SWEET_BERRIES)));
    public static final Item BURNT_TOAST = registerItem("burnt_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
    public static final Item BUTTERED_TOAST = registerItem("buttered_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(2.0f).build()).group(ItemGroup.FOOD)));
    public static final Item CHEESE = registerItem("cheese", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.9f).build()).group(ItemGroup.FOOD)));
    public static final Item CHEESE_SLICE = registerItem("cheese_slice", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
    public static final Item CHERRIES = registerItem("cherries", (Item)new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build()).group(ItemGroup.FOOD)));
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
    public static final Item TOOTHPASTE = registerItem("toothpaste", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300,255), 1.0F).build()).group(ModItemGroup.ITEM)));
    public static final Item TOAST = registerItem("toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.0f).build()).group(ItemGroup.FOOD)));

    //Armor (4) + Tools (2)  /   (28)
    public static final Item BANANA_HELMET = registerItem("banana_helmet",new ArmorItem(ModArmorMaterial.BANANA, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BANANA_CHESTPLATE = registerItem("banana_chestplate", new ArmorItem(ModArmorMaterial.BANANA, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BANANA_LEGGINGS = registerItem("banana_leggings", new ArmorItem(ModArmorMaterial.BANANA, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BANANA_BOOTS = registerItem("banana_boots", new ArmorItem(ModArmorMaterial.BANANA, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BANANA_HORSE_ARMOR= registerItem("banana_horse_armor", new HorseArmorItem(7,"banana", new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BANANA_PICKAXE = registerItem("banana_pickaxe", new ModPickaxeItem(ModToolMaterial.BANANA, 1, -2.8f, new FabricItemSettings().group(ModItemGroup.ITEM)));

    public static final Item BONE_HELMET = registerItem("bone_helmet", new FullQuaeritePerk(ModArmorMaterial.BONE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BONE_CHESTPLATE = registerItem("bone_chestplate", new ArmorItem(ModArmorMaterial.BONE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BONE_LEGGINGS = registerItem("bone_leggings", new ArmorItem(ModArmorMaterial.BONE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BONE_BOOTS = registerItem("bone_boots", new ArmorItem(ModArmorMaterial.BONE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BONE_SWORD = registerItem("bone_sword", new SwordItem(ModToolMaterial.BONE, 7, -2.4f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BONE_SHOVEL = registerItem("bone_shovel", new ShovelItem(ModToolMaterial.BONE, 5, -2.8f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BONE_PICKAXE = registerItem("bone_pickaxe", new ModPickaxeItem(ModToolMaterial.BONE, 5, -2.8f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BONE_AXE = registerItem("bone_axe", new ModAxeItem(ModToolMaterial.BONE, 10, -3.1f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BONE_HOE = registerItem("bone_hoe", new ModHoeItem(ModToolMaterial.BONE, 2, -1f, new FabricItemSettings().group(ModItemGroup.ITEM)));

    public static final Item EMERALD_HELMET = registerItem("emerald_helmet", new FullEmeraldPerk(ModArmorMaterial.EMERALD, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate", new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings", new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots", new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.ITEM)));

    public static final Item FUR_HELMET = registerItem("fur_helmet", new ArmorItem(ModArmorMaterial.FUR, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item FUR_CHESTPLATE = registerItem("fur_chestplate", new ArmorItem(ModArmorMaterial.FUR, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item FUR_LEGGINGS = registerItem("fur_leggings", new ArmorItem(ModArmorMaterial.FUR, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item FUR_BOOTS = registerItem("fur_boots", new ArmorItem(ModArmorMaterial.FUR, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.ITEM)));

    public static final Item HELLSTONE_HELMET = registerItem("hellstone_helmet", new FullHellstonePerk(ModArmorMaterial.HELLSTONE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item HELLSTONE_CHESTPLATE = registerItem("hellstone_chestplate", new ArmorItem(ModArmorMaterial.HELLSTONE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item HELLSTONE_LEGGINGS = registerItem("hellstone_leggings", new ArmorItem(ModArmorMaterial.HELLSTONE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item HELLSTONE_BOOTS = registerItem("hellstone_boots", new ArmorItem(ModArmorMaterial.HELLSTONE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item HELLSTONE_PICKAXE = registerItem("hellstone_pickaxe", new ModPickaxeItem(ModToolMaterial.HELLSTONE,4,3, new FabricItemSettings().group(ModItemGroup.ITEM)));

    public static final Item LIFE_HELMET = registerItem("life_helmet", new FullHeartPerk(ModArmorMaterial.LIFE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item LIFE_CHESTPLATE = registerItem("life_chestplate", new ArmorItem(ModArmorMaterial.LIFE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item LIFE_LEGGINGS = registerItem("life_leggings", new ArmorItem(ModArmorMaterial.LIFE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item LIFE_BOOTS = registerItem("life_boots", new ArmorItem(ModArmorMaterial.LIFE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.ITEM)));

    public static final Item QUAERITE_HELMET = registerItem("quaerite_helmet", new FullQuaeritePerk(ModArmorMaterial.QUAERITE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item QUAERITE_CHESTPLATE = registerItem("quaerite_chestplate", new ArmorItem(ModArmorMaterial.QUAERITE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item QUAERITE_LEGGINGS = registerItem("quaerite_leggings", new ArmorItem(ModArmorMaterial.QUAERITE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item QUAERITE_BOOTS = registerItem("quaerite_boots", new ArmorItem(ModArmorMaterial.QUAERITE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item QUAERITE_SWORD = registerItem("quaerite_sword", new SwordItem(ModToolMaterial.QUAERITE, 3, -2.4f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item QUAERITE_SHOVEL = registerItem("quaerite_shovel", new ShovelItem(ModToolMaterial.QUAERITE, 1, -2.8f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item QUAERITE_PICKAXE = registerItem("quaerite_pickaxe", new ModPickaxeItem(ModToolMaterial.QUAERITE, 1, -2.8f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item QUAERITE_AXE = registerItem("quaerite_axe", new ModAxeItem(ModToolMaterial.QUAERITE, 5, -3f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item QUAERITE_HOE = registerItem("quaerite_hoe", new ModHoeItem(ModToolMaterial.QUAERITE, -4, 0f, new FabricItemSettings().group(ModItemGroup.ITEM)));

    //Extra Armor + Tools (2)
    public static final Item BLAZE_CUTTER = registerItem("blaze_cutter", new ModPickaxeItem(ModToolMaterial.BLAZE, -1, -1.485f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item CLUB = registerItem("club", new SwordItem(ModToolMaterial.CLUB, 8, -3.5f, new FabricItemSettings().group(ModItemGroup.ITEM)));

    //MELEE WEAPONS +39 Melee Weapons
    public static final Item ANCHOR = registerItem("anchor", new SwordItem(ModToolMaterial.MOD_IRON, 12, -3.0f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BATTLESTAFF = registerItem("battlestaff", new SwordItem(ModToolMaterial.STICK, 2, -0.5f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BATTLESTAFF_OF_TERROR = registerItem("battlestaff_of_terror", new SwordItem(ModToolMaterial.ENDER_INGOT, 8, -2.0f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BONECLUB = registerItem("boneclub", new SwordItem(ModToolMaterial.BONE, 14, -3.5f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BROADSWORD = registerItem("broadsword", new SwordItem(ModToolMaterial.MOD_IRON, 11, -2.75f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BROKEN_SAWBLADE = registerItem("broken_sawblade", new SwordItem(ModToolMaterial.BONE, 8, -2.0f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item CHILL_GALE_KNIFE = registerItem("chill_gale_knife", new SwordItem(ModToolMaterial.MYSTERIOUS_DEBRIS, 8, -1.25f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item CLAYMORE = registerItem("claymore", new SwordItem(ModToolMaterial.MOD_IRON, 7, -1.75f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item CORAL_BLADE = registerItem("coral_blade", new SwordItem(ModToolMaterial.CORAL, 7, -1.70f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item CUTLASS = registerItem("cutlass", new SwordItem(ModToolMaterial.MOD_IRON, 2, -0.25f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item BREAD_KNIFE = registerItem("bread_knife", new SwordItem(ModToolMaterial.MOD_IRON, 1, -0.25f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item ENCRUSTED_ANCHOR = registerItem("encrusted_anchor", new SwordItem(ModToolMaterial.MOD_GOLD, 14, -3.25f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item ETERNAL_KNIFE = registerItem("eternal_knife", new SwordItem(ModToolMaterial.ENDER_INGOT, 14, -2.5f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item FROST_FANG = registerItem("frost_fang", new SlownessSword(ModToolMaterial.BLUE_ICE, 3, -0.50f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item FIREBRAND = registerItem("firebrand", new SwordItem(ModToolMaterial.HELLSTONE, 10, -2.50f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item GLAIVE = registerItem("glaive", new SwordItem(ModToolMaterial.MOD_IRON, 4, -0.75f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item GRAVE_BANE = registerItem("grave_bane", new SwordItem(ModToolMaterial.MOD_GOLD, 6, -1.25f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item GREAT_AXEBLADE = registerItem("great_axeblade", new SwordItem(ModToolMaterial.MOD_IRON, 8, -1.75f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item GROWING_STAFF = registerItem("growing_staff", new SwordItem(ModToolMaterial.STICK, 4, -0.75f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item HAWKBRAND = registerItem("hawkbrand", new SwordItem(ModToolMaterial.MOD_IRON, 6, -1.50f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item HEARTSTEALER = registerItem("heartstealer", new HeartStealerSword(ModToolMaterial.MOD_IRON, 9, -2.25f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item HIGHLAND_AXE = registerItem("highland_axe", new SwordItem(ModToolMaterial.MOD_IRON, 5, -1.25f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item MECHANIZED_SAWBLADE = registerItem("mechanized_sawblade", new SwordItem(ModToolMaterial.MOD_IRON, 10, 2.25f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item MOON_DAGGER = registerItem("moon_dagger", new SwordItem(ModToolMaterial.MOD_IRON, 3, -0.75f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item NAMELESS_BLADE = registerItem("nameless_blade", new SwordItem(ModToolMaterial.ENDER_DUST, 2, -0.5f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item NIGHTMARES_BITE = registerItem("nightmares_bite", new PoisonSword(ModToolMaterial.POISON_SAC, 5, -1.00f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item OBSIDIAN_CLAYMORE = registerItem("obsidian_claymore", new SwordItem(ModToolMaterial.ENDER_INGOT, 14, -3.0f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item RESOLUTE_TEMPEST_KNIFE = registerItem("resolute_tempest_knife", new SwordItem(ModToolMaterial.MYSTERIOUS_DEBRIS, 9, -1.50f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SHEER_DAGGER = registerItem("sheer_dagger", new SwordItem(ModToolMaterial.MOD_IRON, 4, -1.0f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SICKEL = registerItem("sickel", new SwordItem(ModToolMaterial.MOD_IRON, 4, -1.0f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SOUL_KNIFE = registerItem("soul_knife", new SwordItem(ModToolMaterial.MOD_IRON, 7, -1.00f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SPONGE_STRIKER = registerItem("sponge_striker", new SwordItem(ModToolMaterial.MOD_IRON, 9, -2.0f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item TEMPEST_KNIFE = registerItem("tempest_knife", new SwordItem(ModToolMaterial.MOD_IRON, 4, -0.50f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item THE_LAST_LAUGH = registerItem("the_last_laugh", new SwordItem(ModToolMaterial.MOD_GOLD, 6, -1.25f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item THE_STARLESS_NIGHT = registerItem("the_starless_night", new SwordItem(ModToolMaterial.ENDER_INGOT, 15, -3.5f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item TRUTHSEEKER = registerItem("truthseeker", new SwordItem(ModToolMaterial.MOD_IRON, 11, -1.75f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item VENOM_GLAIVE = registerItem("venom_glaive", new PoisonSword(ModToolMaterial.POISON_SAC, 5, -1.00f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item VINE_WHIP = registerItem("vine_whip", new SwordItem(ModToolMaterial.VINE, 4, -0.75f, new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item WHIP = registerItem("whip", new SwordItem(ModToolMaterial.SILK, 3, -0.75f, new FabricItemSettings().group(ModItemGroup.ITEM)));


    //Special Items
    public static final Item CHOCOLATE_MILK = registerItem("chocolate_milk", new BucketItem(ModFluids.CHOCOLATE_MILK_STILL, new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).recipeRemainder(BUCKET).group(ModItemGroup.ITEM).maxCount(1)));
    public static final Item HEATED_OIL_BUCKET = registerItem("heated_oil_bucket", new BucketItem(ModFluids.HEATED_OIL_STILL, new FabricItemSettings().group(ModItemGroup.ITEM).maxCount(1)));
    public static final Item OIL_BUCKET = registerItem("oil_bucket", new BucketItem(ModFluids.OIL_STILL, new FabricItemSettings().group(ModItemGroup.ITEM).maxCount(1)));

    //Charms
    public static final Item FIGHT_CHARM = registerItem("fight_charm", new FightCharmItem(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item LIGHT_CHARM = registerItem("light_charm", new LightCharmItem(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item MIGHT_CHARM = registerItem("might_charm", new MightCharmItem(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SIGHT_CHARM = registerItem("sight_charm", new SightCharmItem(new FabricItemSettings().group(ModItemGroup.ITEM)));

    //Lockets
    public static final Item AMBER_LOCKET = registerItem("amber_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item AMETHYST_LOCKET = registerItem("amethyst_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item ANDALUSITE_LOCKET = registerItem("andalusite_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item AQUAMARINE_LOCKET = registerItem("aquamarine_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item CHARCOAL_LOCKET = registerItem("charcoal_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item CITRINE_LOCKET = registerItem("citrine_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item COAL_LOCKET = registerItem("coal_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item COPPER_LOCKET = registerItem("copper_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item DIAMOND_LOCKET = registerItem("diamond_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item DIOPSIDE_LOCKET = registerItem("diopside_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item EMERALD_LOCKET = registerItem("emerald_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item FLINT_LOCKET = registerItem("flint_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item GARNET_LOCKET = registerItem("garnet_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item GOLD_LOCKET = registerItem("gold_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item HESSONITE_LOCKET = registerItem("hessonite_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item IRON_LOCKET = registerItem("iron_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item LAPIS_LOCKET = registerItem("lapis_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item MALICHITE_LOCKET = registerItem("malichite_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item MOONSTONE_LOCKET = registerItem("moonstone_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item OPAL_LOCKET = registerItem("opal_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item PERIDOT_LOCKET = registerItem("peridot_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item PREHNITE_LOCKET = registerItem("prehnite_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SPESSARITE_LOCKET = registerItem("spessarite_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item RUBY_LOCKET = registerItem("ruby_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SAPPHIRE_LOCKET = registerItem("sapphire_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SMOKY_QUARTZ_LOCKET = registerItem("smoky_quartz_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SPHENE_LOCKET = registerItem("sphene_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item SPINEL_LOCKET = registerItem("spinel_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item TANZANITE_LOCKET = registerItem("tanzanite_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item TOPAZ_LOCKET = registerItem("topaz_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item TORMALINE_LOCKET = registerItem("tormaline_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item TSAVORITE_LOCKET = registerItem("tsavorite_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item ZIRCON_LOCKET = registerItem("zircon_locket", new Item(new FabricItemSettings().group(ModItemGroup.ITEM)));

    //Amulets
    public static final Item AMULET_OF_ACCELERATION = registerItem("amulet_of_acceleration", new SpeedAmuletItem(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_ANTIGRAVITY = registerItem("amulet_of_antigravity", new LevitationAmuletItem(new FabricItemSettings().maxDamage(100).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_ARTHRITIS = registerItem("amulet_of_arthritis", new MiningFatigueAmuletItem(new FabricItemSettings().maxDamage(100).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_BAD_LUCK = registerItem("amulet_of_bad_luck", new UnLuckAmuletItem(new FabricItemSettings().maxDamage(64).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_BRICKS = registerItem("amulet_of_bricks", new InstantDamageAmuletItem(new FabricItemSettings().maxDamage(10).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_BRO_YOU_GOTTA_TRY_THIS = registerItem("amulet_of_bro_you_gotta_try_this", new NauseaAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_BUBBLES = registerItem("amulet_of_bubbles", new WaterBreathingAmuletItem(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_CLOAKING = registerItem("amulet_of_cloaking", new InvisibilityAmuletItem(new FabricItemSettings().maxDamage(100).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_CLOSED_EYES = registerItem("amulet_of_closed_eyes", new BlindnessAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_CLOVERS = registerItem("amulet_of_clovers", new LuckAmuletItem(new FabricItemSettings().maxDamage(64).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_DECAY = registerItem("amulet_of_decay", new WitherAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_ENDURANCE = registerItem("amulet_of_endurance", new AbsorptionAmuletItem(new FabricItemSettings().maxDamage(100).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_EXCAVATION = registerItem("amulet_of_excavation", new HasteAmuletItem(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_EXTRA_LOVE = registerItem("amulet_of_extra_love", new HealthBoostAmuletItem(new FabricItemSettings().maxDamage(100).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_FLAMELESSNESS = registerItem("amulet_of_flamelessness", new FireResistanceAmuletItem(new FabricItemSettings().maxDamage(128).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_FRAILTY = registerItem("amulet_of_frailty", new WeaknessAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_GILLS = registerItem("amulet_of_gills", new ConduitPowerAmuletItem(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_GLUTTONY = registerItem("amulet_of_gluttony", new HungerAmuletItem(new FabricItemSettings().maxDamage(64).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_HEALING = registerItem("amulet_of_healing", new RegenerationAmuletItem(new FabricItemSettings().maxDamage(32).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_HERCULES = registerItem("amulet_of_hercules", new StrengthAmuletItem(new FabricItemSettings().maxDamage(10).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_ILLUMINATION = registerItem("amulet_of_illumination", new GlowingAmuletItem(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_LEAPING = registerItem("amulet_of_leaping", new JumpBoostAmuletItem(new FabricItemSettings().maxDamage(128).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_NIGHT_SIGHT = registerItem("amulet_of_night_sight", new NightVisionAmuletItem(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_NOURISHMENT = registerItem("amulet_of_nourishment", new SaturationAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_OLYMPIC_SWIMMING = registerItem("amulet_of_olympic_swimming", new DolphinsGraceAmuletItem(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_RAIDS = registerItem("amulet_of_raids", new BadOmenAmuletItem(new FabricItemSettings().maxDamage(32).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_REJUVINATION = registerItem("amulet_of_rejuvination", new InstantHealthAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_SHADOWS = registerItem("amulet_of_shadows", new DarknessAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_SHIELDING = registerItem("amulet_of_shielding", new ResistanceAmuletItem(new FabricItemSettings().maxDamage(32).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_SICKENING = registerItem("amulet_of_sickening", new PoisonAmuletItem(new FabricItemSettings().maxDamage(16).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_THE_PHANTOM = registerItem("amulet_of_the_phantom", new SlowFallingAmuletItem(new FabricItemSettings().group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_THE_TORTISE = registerItem("amulet_of_the_tortise", new SlownessAmuletItem(new FabricItemSettings().maxDamage(64).group(ModItemGroup.ITEM)));
    public static final Item AMULET_OF_THE_VILLAGE_HERO = registerItem("amulet_of_the_village_hero", new HeroOfTheVilliageAmuletItem(new FabricItemSettings().maxDamage(100).group(ModItemGroup.ITEM)));

    //spawn eggs
    public static final Item PENGUIN_SPAWN_EGG = registerItem("penguin_spawn_egg", new SpawnEggItem(ModEntities.PENGUIN,0x0d0d0d, 0xffffff, new FabricItemSettings().group(ModItemGroup.ITEM).maxCount(1)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Hmh2.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Hmh2.LOGGER.info("Registering Mod Items for " + Hmh2.MOD_ID);
    }
}
