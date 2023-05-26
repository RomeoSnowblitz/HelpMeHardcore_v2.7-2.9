/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1271
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 */
package net.romeosnowblitz.hmh2.item.custom.magic.amulets;

import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1937;

public class BadOmenAmuletItem
extends class_1792 {
    public BadOmenAmuletItem(class_1792.class_1793 settings) {
        super(settings);
    }

    public class_1271<class_1799> method_7836(class_1937 world, class_1657 user, class_1268 hand) {
        if (!world.method_8608() && hand == class_1268.field_5808) {
            user.method_6092(new class_1293(class_1294.field_16595, 200, 2));
            user.method_6047().method_7956(1, (class_1309)user, p -> p.method_20236(hand));
        }
        return super.method_7836(world, user, hand);
    }

    public boolean method_7873(class_1799 stack, class_1309 target, class_1309 attacker) {
        attacker.method_37222(new class_1293(class_1294.field_16595, 200, 0), (class_1297)attacker);
        target.method_37222(new class_1293(class_1294.field_16595, 200, 1), (class_1297)target);
        stack.method_7956(1, attacker, e -> e.method_20235(class_1304.field_6173));
        return super.method_7873(stack, target, attacker);
    }
}

