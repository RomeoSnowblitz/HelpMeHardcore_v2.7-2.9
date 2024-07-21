package net.romeosnowblitz.hmh2.item;

import net.minecraft.block.Blocks;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.minecraft.util.Util;
import net.romeosnowblitz.hmh2.block.ModBlocks;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    BANANA("banana", 5, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 1);map.put(ArmorItem.Type.LEGGINGS, 2);map.put(ArmorItem.Type.CHESTPLATE, 3);map.put(ArmorItem.Type.HELMET, 1);
    }), 100, SoundEvents.BLOCK_HONEY_BLOCK_SLIDE, 0.0F, 0.0F, () -> Ingredient.ofItems(ModBlocks.BANANA_PEEL)),

    BEE("bee", 15, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);map.put(ArmorItem.Type.LEGGINGS, 6);map.put(ArmorItem.Type.CHESTPLATE, 8);map.put(ArmorItem.Type.HELMET, 3);
    }), 30, SoundEvents.BLOCK_HONEY_BLOCK_SLIDE, 2.0F, 0.1F, () -> Ingredient.ofItems(Items.HONEYCOMB)),

    BONE("bone", 15, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 2);map.put(ArmorItem.Type.LEGGINGS, 5);map.put(ArmorItem.Type.CHESTPLATE, 6);map.put(ArmorItem.Type.HELMET, 2);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, 0.0F, () -> Ingredient.ofItems(Items.BONE)),

    CLOTH("cloth", 5, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 1);map.put(ArmorItem.Type.LEGGINGS, 2);map.put(ArmorItem.Type.CHESTPLATE, 3);map.put(ArmorItem.Type.HELMET, 1);
    }), 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.ofItems(ModItems.CLOTH)),

    DRAMAGEON("dramageon", 64, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);map.put(ArmorItem.Type.LEGGINGS, 6);map.put(ArmorItem.Type.CHESTPLATE, 8);map.put(ArmorItem.Type.HELMET, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.ofItems(ModItems.ENDER_INGOT)),

    COPPER("copper", 35, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);map.put(ArmorItem.Type.LEGGINGS, 6);map.put(ArmorItem.Type.CHESTPLATE, 8);map.put(ArmorItem.Type.HELMET, 3);
    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.EMERALD)),

    EMERALD("emerald", 35, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);map.put(ArmorItem.Type.LEGGINGS, 6);map.put(ArmorItem.Type.CHESTPLATE, 8);map.put(ArmorItem.Type.HELMET, 3);
    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> Ingredient.ofItems(Items.EMERALD)),

    FLOWER("flower", 5, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 1);map.put(ArmorItem.Type.LEGGINGS, 2);map.put(ArmorItem.Type.CHESTPLATE, 3);map.put(ArmorItem.Type.HELMET, 1);
    }), 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.ofItems(ModItems.FLOWER_CROWN)),


    FUR("fur", 5, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 1);map.put(ArmorItem.Type.LEGGINGS, 2);map.put(ArmorItem.Type.CHESTPLATE, 3);map.put(ArmorItem.Type.HELMET, 1);
    }), 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.ofItems(ModItems.FUR_PELT)),

    GLASS("glass", 1, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 0);map.put(ArmorItem.Type.LEGGINGS, 20);map.put(ArmorItem.Type.CHESTPLATE, 0);map.put(ArmorItem.Type.HELMET, 0);
    }), 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.ofItems(Blocks.GLASS)),

    HELLSTONE("hellstone", 48, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);map.put(ArmorItem.Type.LEGGINGS, 6);map.put(ArmorItem.Type.CHESTPLATE, 8);map.put(ArmorItem.Type.HELMET, 3);
    }), 35, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, () -> Ingredient.ofItems(ModItems.HELLSTONE)),

    LIFE("life", 32, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);map.put(ArmorItem.Type.LEGGINGS, 6);map.put(ArmorItem.Type.CHESTPLATE, 8);map.put(ArmorItem.Type.HELMET, 3);
    }), 30, SoundEvents.ENTITY_WARDEN_HEARTBEAT, 0.0F, 0.0F, () -> Ingredient.ofItems(SustenanceItems.HEART)),

    QUAERITE("quaerite", 192, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);map.put(ArmorItem.Type.LEGGINGS, 6);map.put(ArmorItem.Type.CHESTPLATE, 8);map.put(ArmorItem.Type.HELMET, 3);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.0F, 0.1F, () -> Ingredient.ofItems(ModItems.QUAERITE_FRAGMENT)),

    SUMOLTERITE("sumolterite", 96, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);map.put(ArmorItem.Type.LEGGINGS, 6);map.put(ArmorItem.Type.CHESTPLATE, 8);map.put(ArmorItem.Type.HELMET, 3);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.ofItems(ModItems.SOLAR_FRAGMENT)),

    WITHER_BONE("wither_bone", 48, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);map.put(ArmorItem.Type.LEGGINGS, 6);map.put(ArmorItem.Type.CHESTPLATE, 8);map.put(ArmorItem.Type.HELMET, 3);
    }), 35, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, () -> Ingredient.ofItems(ModItems.WITHER_BONE)),

    WOODEN("wooden", 5, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 1);map.put(ArmorItem.Type.LEGGINGS, 2);map.put(ArmorItem.Type.CHESTPLATE, 3);map.put(ArmorItem.Type.HELMET, 1);
    }), 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.fromTag(ItemTags.LOGS));

    private static final EnumMap BASE_DURABILITY = Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 13);map.put(ArmorItem.Type.LEGGINGS, 15);map.put(ArmorItem.Type.CHESTPLATE, 16);map.put(ArmorItem.Type.HELMET, 11);
    });

    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    ModArmorMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy<>(repairIngredientSupplier);
    }

    public int getDurability(ArmorItem.Type type) {
        return (Integer)BASE_DURABILITY.get(type) * this.durabilityMultiplier;
    }

    public int getProtection(ArmorItem.Type type) {
        return this.protectionAmounts.get(type);
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

}

