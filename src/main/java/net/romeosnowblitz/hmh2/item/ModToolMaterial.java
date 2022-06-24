package net.romeosnowblitz.hmh2.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {

    BANANA(2, 131, 4.0F, 1.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.BANANA_PEEL);}),
    BLAZE(4, 420, 12.0F, 7.0F, 30, () -> {
        return Ingredient.ofItems(Items.BLAZE_ROD);}),
    BLUE_ICE(4, 906, 1.0F, -1.0F, 30, () -> {
        return Ingredient.ofItems(Items.BLUE_ICE);}),
    BONE(3, 250, 9.0F, -1.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.BONE_PLATE);}),
    CORAL(4, 906, 1.0F, -1.0F, 30, () -> {
        return Ingredient.ofItems(Items.BRAIN_CORAL);}),
    CLUB(2, 200, 6.0F, 3.0F, 30, () -> {
        return Ingredient.ofItems(Items.OAK_LOG);}),
    ENDER_DUST(4, 906, 1.0F, -1.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.ENDER_DUST);}),
    ENDER_INGOT(4, 906, 1.0F, -1.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.ENDER_INGOT);}),
    HELLSTONE(4, 906, 8.0F, -1.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.HELLSTONE);}),
    MOD_GOLD(4, 906, 1.0F, -1.0F, 30, () -> {
        return Ingredient.ofItems(Items.GOLD_INGOT);}),
    MOD_IRON(4, 906, 1.0F, -1.0F, 30, () -> {
        return Ingredient.ofItems(Items.IRON_INGOT);}),
    MYSTERIOUS_DEBRIS(4, 906, 1.0F, -1.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.MYSTERIOUS_CYAN_DEBRIS);}),
    POISON_SAC(4, 906, 1.0F, -1.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.POISON_SAC);}),
    QUAERITE(4, 5203, 12.0F, 4.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.QUAERITE_FRAGMENT);}),
    STICK(4, 906, 1.0F, -1.0F, 30, () -> {
        return Ingredient.ofItems(Items.STICK);}),
    SILK(4, 906, 1.0F, -1.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.SILK);}),
    VINE(4, 906, 1.0F, -1.0F, 30, () -> {
        return Ingredient.ofItems(Items.VINE);});


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}