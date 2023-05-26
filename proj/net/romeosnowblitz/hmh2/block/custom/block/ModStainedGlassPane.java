/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2389
 *  net.minecraft.class_2680
 *  net.minecraft.class_2769
 *  net.minecraft.class_4970$class_2251
 */
package net.romeosnowblitz.hmh2.block.custom.block;

import net.minecraft.class_2389;
import net.minecraft.class_2680;
import net.minecraft.class_2769;
import net.minecraft.class_4970;
import net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor;

public class ModStainedGlassPane
extends class_2389 {
    private final ModDyeColor color;

    public ModStainedGlassPane(ModDyeColor color, class_4970.class_2251 settings) {
        super(settings);
        this.color = color;
        this.method_9590((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)field_10905, (Comparable)Boolean.valueOf(false))).method_11657((class_2769)field_10907, (Comparable)Boolean.valueOf(false))).method_11657((class_2769)field_10904, (Comparable)Boolean.valueOf(false))).method_11657((class_2769)field_10903, (Comparable)Boolean.valueOf(false))).method_11657((class_2769)field_10900, (Comparable)Boolean.valueOf(false)));
    }

    public ModDyeColor getColor() {
        return this.color;
    }
}

