package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.item.custom.food.ConsumeLeaveBottle;
import net.romeosnowblitz.hmh2.item.custom.food.ConsumeLeaveSheetPan;
import net.romeosnowblitz.hmh2.item.custom.food.EnderSkinConsumableLong;

import static net.minecraft.item.Items.BUCKET;
import static net.minecraft.item.Items.GLASS_BOTTLE;

public class SustenanceItems {
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
    public static final Item DOUGH = SustenanceItems.registerItem("dough", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())));
    public static final Item ENDCHILADA = SustenanceItems.registerItem("endchilada", new EnderSkinConsumableLong(new FabricItemSettings().food(new FoodComponent.Builder().hunger(20).saturationModifier(2.0f).build())));
    public static final Item GOLDEN_SALMON = registerItem("golden_salmon", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2f).build())));
    public static final Item HEART = registerItem("heart", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 60, 0), 1F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,60,0), 1F).alwaysEdible().snack().build())));
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
    public static final Item TORTILLA = SustenanceItems.registerItem("tortilla", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build())));

    private static Item registerItem(String name, Item item) {
        return Registry.register (Registries.ITEM, new Identifier(Hmh2.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ModItemGroup.SUSTENANCE, APPLE_JUICE);
        addToItemGroup(ModItemGroup.SUSTENANCE, APPLE_PIE);
        addToItemGroup(ModItemGroup.SUSTENANCE, BACON);
        addToItemGroup(ModItemGroup.SUSTENANCE, BANANAS);
        addToItemGroup(ModItemGroup.SUSTENANCE, BEEF_JERKY);
        addToItemGroup(ModItemGroup.SUSTENANCE, BLUEBERRIES);
        addToItemGroup(ModItemGroup.SUSTENANCE, BLUEBERRY_JAM);
        addToItemGroup(ModItemGroup.SUSTENANCE, BLUEBERRY_PIE);
        addToItemGroup(ModItemGroup.SUSTENANCE, BURNT_TOAST);
        addToItemGroup(ModItemGroup.SUSTENANCE, BUTTERED_TOAST);
        addToItemGroup(ModItemGroup.SUSTENANCE, CHEESE);
        addToItemGroup(ModItemGroup.SUSTENANCE, CHEESE_SLICE);
        addToItemGroup(ModItemGroup.SUSTENANCE, CHERRIES);
        addToItemGroup(ModItemGroup.SUSTENANCE, CHERRY_PIE);
        addToItemGroup(ModItemGroup.SUSTENANCE, CHICKEN_NUGGET);
        addToItemGroup(ModItemGroup.SUSTENANCE, CHICKEN_SANDWICH);
        addToItemGroup(ModItemGroup.SUSTENANCE, CHOCOLATE_ICE_CREAM);
        addToItemGroup(ModItemGroup.SUSTENANCE, DOUGH);
        addToItemGroup(ModItemGroup.SUSTENANCE, ENDCHILADA);
        addToItemGroup(ModItemGroup.SUSTENANCE, GOLDEN_SALMON);
        addToItemGroup(ModItemGroup.SUSTENANCE, HEART);
        addToItemGroup(ModItemGroup.SUSTENANCE, LIGHT_TOAST);
        addToItemGroup(ModItemGroup.SUSTENANCE, MANGO);
        addToItemGroup(ModItemGroup.SUSTENANCE, ORANGE);
        addToItemGroup(ModItemGroup.SUSTENANCE, ORANGE_JUICE);
        addToItemGroup(ModItemGroup.SUSTENANCE, RAW_BACON);
        addToItemGroup(ModItemGroup.SUSTENANCE, RAW_CHICKEN_NUGGET);
        addToItemGroup(ModItemGroup.SUSTENANCE, SLICED_BREAD);
        addToItemGroup(ModItemGroup.SUSTENANCE, SASHIMI);
        addToItemGroup(ModItemGroup.SUSTENANCE, STRAWBERRIES);
        addToItemGroup(ModItemGroup.SUSTENANCE, STRAWBERRY_JAM);
        addToItemGroup(ModItemGroup.SUSTENANCE, STRAWBERRY_PIE);
        addToItemGroup(ModItemGroup.SUSTENANCE, TOOTHPASTE);
        addToItemGroup(ModItemGroup.SUSTENANCE, TOAST);
        addToItemGroup(ModItemGroup.SUSTENANCE, TORTILLA);
    }

    public static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerSustenanceItems() {
        Hmh2.LOGGER.info("Registering Mod Items for " + Hmh2.MOD_ID);
        addItemsToItemGroup();
    }
}
