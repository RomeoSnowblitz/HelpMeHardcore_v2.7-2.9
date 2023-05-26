/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1263
 *  net.minecraft.class_1735
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2609
 */
package net.romeosnowblitz.hmh2.screen.slot;

import net.minecraft.class_1263;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2609;

public class ModFuelSlot
extends class_1735 {
    public ModFuelSlot(class_1263 inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    public boolean method_7680(class_1799 stack) {
        return class_2609.method_11195((class_1799)stack) || ModFuelSlot.isBucket(stack);
    }

    public int method_7676(class_1799 stack) {
        return ModFuelSlot.isBucket(stack) ? 1 : super.method_7676(stack);
    }

    public static boolean isBucket(class_1799 stack) {
        return stack.method_31574(class_1802.field_8550);
    }
}

