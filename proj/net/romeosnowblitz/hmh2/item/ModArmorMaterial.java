/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1304
 *  net.minecraft.class_1738$class_8051
 *  net.minecraft.class_1741
 *  net.minecraft.class_1802
 *  net.minecraft.class_1856
 *  net.minecraft.class_1935
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3528
 */
package net.romeosnowblitz.hmh2.item;

import java.util.function.Supplier;
import net.minecraft.class_1304;
import net.minecraft.class_1738;
import net.minecraft.class_1741;
import net.minecraft.class_1802;
import net.minecraft.class_1856;
import net.minecraft.class_1935;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3528;
import net.romeosnowblitz.hmh2.item.ModItems;

public enum ModArmorMaterial implements class_1741
{
    BANANA("banana", 5, new int[]{1, 2, 3, 1}, 100, class_3417.field_21074, 0.0f, 0.0f, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.BANANA_PEEL})),
    BEE("bee", 15, new int[]{3, 6, 8, 3}, 30, class_3417.field_21074, 1.0f, 0.1f, () -> class_1856.method_8091((class_1935[])new class_1935[]{class_1802.field_20414})),
    BONE("bone", 15, new int[]{2, 5, 6, 2}, 13, class_3417.field_28038, 3.0f, 0.0f, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.FUR_PELT})),
    EMERALD("emerald", 35, new int[]{3, 6, 8, 3}, 30, class_3417.field_15103, 0.0f, 0.0f, () -> class_1856.method_8091((class_1935[])new class_1935[]{class_1802.field_8687})),
    FUR("fur", 5, new int[]{1, 2, 3, 1}, 30, class_3417.field_14581, 0.0f, 0.0f, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.BONE_PLATE})),
    HELLSTONE("hellstone", 35, new int[]{3, 6, 8, 3}, 30, class_3417.field_21866, 0.0f, 0.0f, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.HELLSTONE})),
    LIFE("life", 35, new int[]{3, 6, 8, 3}, 30, class_3417.field_14761, 0.0f, 0.0f, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.HEART})),
    QUAERITE("quaerite", 35, new int[]{3, 6, 8, 3}, 25, class_3417.field_14761, 2.0f, 0.1f, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.QUAERITE_FRAGMENT}));

    private static final int[] BASE_DURABILITY;
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final class_3414 equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final class_3528<class_1856> repairIngredientSupplier;

    private ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, class_3414 equipSound, float toughness, float knockbackResistance, Supplier<class_1856> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new class_3528(repairIngredientSupplier);
    }

    public int getDurability(class_1304 slot) {
        return BASE_DURABILITY[slot.method_5927()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(class_1304 slot) {
        return this.protectionAmounts[slot.method_5927()];
    }

    public int method_48402(class_1738.class_8051 type) {
        return 0;
    }

    public int method_48403(class_1738.class_8051 type) {
        return 0;
    }

    public int method_7699() {
        return this.enchantability;
    }

    public class_3414 method_7698() {
        return this.equipSound;
    }

    public class_1856 method_7695() {
        return (class_1856)this.repairIngredientSupplier.method_15332();
    }

    public String method_7694() {
        return this.name;
    }

    public float method_7700() {
        return this.toughness;
    }

    public float method_24355() {
        return this.knockbackResistance;
    }

    static {
        BASE_DURABILITY = new int[]{13, 15, 16, 11};
    }
}

