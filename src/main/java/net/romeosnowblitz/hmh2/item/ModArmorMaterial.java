package net.romeosnowblitz.hmh2.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
    BANANA("banana", 5, new int[]{1, 2, 3, 1}, 100, SoundEvents.BLOCK_HONEY_BLOCK_SLIDE, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.BANANA_PEEL);
    }),
    BEE("bee", 15, new int[]{3, 6, 8, 3}, 30, SoundEvents.BLOCK_HONEY_BLOCK_SLIDE, 1.0F, 0.1F, () -> {
        return Ingredient.ofItems(Items.HONEYCOMB);
    }),
    BONE("bone", 15, new int[]{2, 5, 6, 2}, 13, SoundEvents.BLOCK_DRIPSTONE_BLOCK_BREAK, 3.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.FUR_PELT);
    }),
    EMERALD("emerald", 35, new int[]{3, 6, 8, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.EMERALD);
    }),
    FUR("fur", 5, new int[]{1, 2, 3, 1}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.BONE_PLATE);
    }),
    HELLSTONE("hellstone", 35, new int[]{3, 6, 8, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.HELLSTONE);
    }),
    LIFE("life", 35, new int[]{3, 6, 8, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.HEART);
    }),
    QUAERITE("quaerite", 35, new int[]{3, 6, 8, 3}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2.0F, 0.1F, () -> {
        return Ingredient.ofItems(ModItems.QUAERITE_FRAGMENT);
    });

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredientSupplier.get();
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

