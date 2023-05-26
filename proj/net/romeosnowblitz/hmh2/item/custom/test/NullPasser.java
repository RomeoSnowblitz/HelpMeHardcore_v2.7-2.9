/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1271
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 */
package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1937;

public class NullPasser
extends class_1792 {
    public NullPasser(class_1792.class_1793 settings) {
        super(settings);
    }

    public class_1271<class_1799> method_7836(class_1937 world, class_1657 user, class_1268 hand) {
        class_1799 itemStack = user.method_5998(hand);
        if (!user.field_6002.method_8608()) {
            double y = user.method_23318();
            user.method_20620(0.0, y, 0.0);
            user.method_18800(0.0, 0.0, 0.0);
            itemStack.method_7956(1, (class_1309)user, p -> p.method_20236(hand));
        }
        return super.method_7836(world, user, hand);
    }

    public boolean method_7873(class_1799 stack, class_1309 target, class_1309 attacker) {
        if (!attacker.field_6002.method_8608()) {
            double y = target.method_23318();
            target.method_20620(0.0, y, 0.0);
            target.method_18800(0.0, 0.0, 0.0);
            stack.method_7956(1, attacker, e -> e.method_20235(class_1304.field_6173));
        }
        return super.method_7873(stack, target, attacker);
    }
}

