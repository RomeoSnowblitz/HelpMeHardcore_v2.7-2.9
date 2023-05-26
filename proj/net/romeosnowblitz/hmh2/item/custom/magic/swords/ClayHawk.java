/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1271
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1829
 *  net.minecraft.class_1832
 *  net.minecraft.class_1935
 *  net.minecraft.class_1937
 */
package net.romeosnowblitz.hmh2.item.custom.magic.swords;

import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1829;
import net.minecraft.class_1832;
import net.minecraft.class_1935;
import net.minecraft.class_1937;
import net.romeosnowblitz.hmh2.item.WarfareItems;

public class ClayHawk
extends class_1829 {
    private final int damagePerUse;

    public ClayHawk(class_1832 toolMaterial, int attackDamage, float attackSpeed, class_1792.class_1793 settings, int damagePerUse) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.damagePerUse = damagePerUse;
    }

    public class_1271<class_1799> method_7836(class_1937 world, class_1657 user, class_1268 hand) {
        class_1799 itemStack = user.method_5998(hand);
        itemStack.method_7956(this.damagePerUse, (class_1309)user, p -> p.method_20236(hand));
        if (itemStack.method_7960()) {
            class_1799 itemStack2 = new class_1799((class_1935)WarfareItems.HAWKBRAND);
            itemStack2.method_7980(itemStack.method_7969());
            return class_1271.method_22427((Object)itemStack2);
        }
        return class_1271.method_22427((Object)itemStack);
    }
}

