package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.crafting.ClasslessCrafting;
import net.romeosnowblitz.hmh2.item.custom.food.*;

import static net.minecraft.item.Items.BUCKET;
import static net.minecraft.item.Items.GLASS_BOTTLE;

public class SustenanceItems {
    public static final Item APPLE_JUICE = registerItem("apple_juice", new HoneyBottleItem(new Item.Settings().recipeRemainder(GLASS_BOTTLE).food(FoodComponents.HONEY_BOTTLE).maxCount(16)));
    public static final Item APPLE_PIE = registerItem("apple_pie", new ConsumeLeaveSheetPan(new FabricItemSettings().recipeRemainder(BUCKET).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build())));
    public static final Item BACON = registerItem("bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build())));
    public static final Item BANANAS = registerItem("bananas", new ConsumeLeaveBananaPeel(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).alwaysEdible().build())));
    public static final Item BEEF_JERKY = registerItem("beef_jerky", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())));
    public static final Item BLUEBERRIES = registerItem("blueberries", new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH, new Item.Settings().food(FoodComponents.SWEET_BERRIES)));
    public static final Item BLUEBERRY_JAM = registerItem("blueberry_jam", new ConsumeLeaveBottle(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
    public static final Item BLUEBERRY_PIE = registerItem("blueberry_pie", new ConsumeLeaveSheetPan(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build())));
    public static final Item BURNT_TOAST = registerItem("burnt_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.3f).build())));
    public static final Item BUTTERED_TOAST = registerItem("buttered_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(2.0f).build())));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.9f).build())));
    public static final Item CHEESE_SLICE = registerItem("cheese_slice", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build())));
    public static final Item CHERRIES = registerItem("cherries", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build())));
    public static final Item CHERRY_PIE = registerItem("cherry_pie", new ConsumeLeaveSheetPan(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build())));
    public static final Item CHICKEN_NUGGET = registerItem("chicken_nugget", new Item(new FabricItemSettings().food(new FoodComponent.Builder().snack().hunger(1).saturationModifier(0.3f).build())));
    public static final Item CHICKEN_SANDWICH = registerItem("chicken_sandwich", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build())));
    public static final Item CHOCOLATE_ICE_CREAM = registerItem("chocolate_ice_cream", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).maxCount(1)));
    public static final Item COCOA_POWDER = registerItem("cocoa_powder", new ClasslessCrafting(Items.MILK_BUCKET, ModItems.CHOCOLATE_MILK, new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build())));
    public static final Item DOUGH = SustenanceItems.registerItem("dough", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())));
    public static final Item ENDCHILADA = SustenanceItems.registerItem("endchilada", new EnderSkinConsumableLong(new FabricItemSettings().food(new FoodComponent.Builder().hunger(20).saturationModifier(2.0f).build())));
    public static final Item GOLDEN_SALMON = registerItem("golden_salmon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2f).build())));
    public static final Item HEART = registerItem("heart", new Heart(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 60, 0), 1F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,60,0), 1F).alwaysEdible().snack().build())));
    public static final Item LIGHT_TOAST = registerItem("light_toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).build())));
    public static final Item MANGO = registerItem("mango", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build())));
    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build())));
    public static final Item ORANGE_JUICE = registerItem("orange_juice", new HoneyBottleItem(new Item.Settings().recipeRemainder(GLASS_BOTTLE).food(FoodComponents.HONEY_BOTTLE).maxCount(16)));
    public static final Item RAW_BACON= registerItem("raw_bacon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3f).meat().build())));
    public static final Item RAW_CHICKEN_NUGGET = registerItem("raw_chicken_nugget", new Item(new FabricItemSettings().food(new FoodComponent.Builder().snack().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3f).meat().build())));
    public static final Item SLICED_BREAD = registerItem("sliced_bread", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build())));
    public static final Item SASHIMI = registerItem("sashimi", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build())));
    public static final Item STRAWBERRIES = registerItem("strawberries", new AliasedBlockItem(ModBlocks.STRAWBERRY_BUSH, new Item.Settings().food(FoodComponents.SWEET_BERRIES)));
    public static final Item STRAWBERRY_JAM = registerItem("strawberry_jam", new ConsumeLeaveBottle(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
    public static final Item STRAWBERRY_PIE = registerItem("strawberry_pie", new ConsumeLeaveSheetPan(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build())));
    public static final Item TOOTHPASTE = registerItem("toothpaste", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300,255), 1.0F).build())));
    public static final Item TOAST = registerItem("toast", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.0f).build())));
    public static final Item TORTILLA = SustenanceItems.registerItem("tortilla", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build())));

    private static Item registerItem(String name, Item item) {
        return Registry.register (Registries.ITEM, new Identifier(Hmh2.MOD_ID, name), item);
    }

    public static void registerSustenanceItems() {
        Hmh2.LOGGER.info("Registering Mod Items for " + Hmh2.MOD_ID);
    }
}
