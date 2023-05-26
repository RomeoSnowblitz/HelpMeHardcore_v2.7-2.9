/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1802
 *  net.minecraft.class_1832
 *  net.minecraft.class_1856
 *  net.minecraft.class_1935
 *  net.minecraft.class_3528
 */
package net.romeosnowblitz.hmh2.item;

import java.util.function.Supplier;
import net.minecraft.class_1802;
import net.minecraft.class_1832;
import net.minecraft.class_1856;
import net.minecraft.class_1935;
import net.minecraft.class_3528;
import net.romeosnowblitz.hmh2.item.ModItems;

public enum ModToolMaterial implements class_1832
{
    BANANA(2, 131, 4.0f, 1.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.BANANA_PEEL})),
    BLAZE(4, 420, 12.0f, 7.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{class_1802.field_8894})),
    BLUE_ICE(4, 906, 1.0f, -1.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{class_1802.field_8178})),
    BONE(3, 250, 9.0f, -1.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.BONE_PLATE})),
    CORAL(4, 906, 1.0f, -1.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{class_1802.field_8616})),
    CLUB(2, 200, 6.0f, 3.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{class_1802.field_8583})),
    ENDER_DUST(4, 906, 1.0f, -1.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.ENDER_DUST})),
    ENDER_INGOT(4, 906, 1.0f, -1.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.ENDER_INGOT})),
    HELLSTONE(4, 906, 8.0f, -1.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.HELLSTONE})),
    MOD_GOLD(4, 906, 1.0f, -1.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{class_1802.field_8695})),
    MOD_IRON(4, 906, 6.0f, -1.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{class_1802.field_8620})),
    MYSTERIOUS_DEBRIS(4, 906, 1.0f, -1.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.MYSTERIOUS_CYAN_DEBRIS})),
    POISON_SAC(4, 906, 1.0f, -1.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.POISON_SAC})),
    QUAERITE(4, 5203, 12.0f, 4.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.QUAERITE_FRAGMENT})),
    STICK(4, 906, 1.0f, -1.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{class_1802.field_8600})),
    SILK(4, 906, 1.0f, -1.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{ModItems.SILK})),
    VINE(4, 906, 1.0f, -1.0f, 30, () -> class_1856.method_8091((class_1935[])new class_1935[]{class_1802.field_17523}));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final class_3528<class_1856> repairIngredient;

    private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<class_1856> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new class_3528(repairIngredient);
    }

    public int method_8025() {
        return this.itemDurability;
    }

    public float method_8027() {
        return this.miningSpeed;
    }

    public float method_8028() {
        return this.attackDamage;
    }

    public int method_8024() {
        return this.miningLevel;
    }

    public int method_8026() {
        return this.enchantability;
    }

    public class_1856 method_8023() {
        return (class_1856)this.repairIngredient.method_15332();
    }
}

