package net.romeosnowblitz.hmh2.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;
import net.romeosnowblitz.hmh2.block.ModBlocks;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {

    BANANA(2, 131, 4.0F, 1.0F, 30, () -> Ingredient.ofItems(ModBlocks.BANANA_PEEL)),
    BLAZE(4, 420, 12.0F, 7.0F, 30, () -> Ingredient.ofItems(Items.BLAZE_ROD)),
    BLUE_ICE(3, 906, 1.0F, -1.0F, 30, () -> Ingredient.ofItems(Items.BLUE_ICE)),
    BONE(3, 250, 9.0F, -1.0F, 30, () -> Ingredient.ofItems(ModItems.BONE_PLATE)),
    CORAL(3, 906, 1.0F, -1.0F, 30, () -> Ingredient.ofItems(Items.BRAIN_CORAL)),
    CLUB(2, 200, 6.0F, 3.0F, 30, () -> Ingredient.ofItems(Items.OAK_LOG)),
    ENDER_DUST(6, 906, 1.0F, -1.0F, 30, () -> Ingredient.ofItems(ModItems.ENDER_DUST)),
    ENDER_INGOT(6, 906, 1.0F, -1.0F, 30, () -> Ingredient.ofItems(ModItems.ENDER_INGOT)),
    HELLSTONE(4, 906, 8.0F, -1.0F, 30, () -> Ingredient.ofItems(ModItems.HELLSTONE)),
    MOD_GOLD(3, 906, 1.0F, -1.0F, 30, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    MOD_IRON(3, 906, 6.0F, -1.0F, 30, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    MYSTERIOUS_DEBRIS(3, 906, 1.0F, -1.0F, 30, () -> Ingredient.ofItems(ModItems.MYSTERIOUS_CYAN_DEBRIS)),
    POISON_SAC(3, 906, 1.0F, -1.0F, 30, () -> Ingredient.ofItems(ModItems.POISON_SAC)),
    QUAERITE(6, 5203, 12.0F, 4.0F, 30, () -> Ingredient.ofItems(ModItems.QUAERITE_FRAGMENT)),
    STICK(3, 906, 1.0F, -1.0F, 30, () -> Ingredient.ofItems(Items.STICK)),
    SILK(3, 906, 1.0F, -1.0F, 30, () -> Ingredient.ofItems(ModItems.SILK)),
    SUMOLTERITE(5, 2031, 12.0F, 4.0F, 30, () -> Ingredient.ofItems(ModItems.SOLAR_FRAGMENT)),
    VINE(3, 906, 6.0F, -1.0F, 30, () -> Ingredient.ofItems(Items.VINE));


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
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