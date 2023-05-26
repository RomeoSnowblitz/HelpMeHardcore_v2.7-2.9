/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1271
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 */
package net.romeosnowblitz.hmh2.item.custom.magic.charms;

import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1937;

public class KnightCharmItem
extends class_1792 {
    public KnightCharmItem(class_1792.class_1793 settings) {
        super(settings);
    }

    public class_1271<class_1799> method_7836(class_1937 world, class_1657 user, class_1268 hand) {
        if (!world.method_8608() && hand == class_1268.field_5808) {
            user.method_6016(class_1294.field_5901);
            user.method_6016(class_1294.field_5909);
            user.method_6016(class_1294.field_5903);
            user.method_6016(class_1294.field_5916);
            user.method_6016(class_1294.field_5899);
            user.method_6016(class_1294.field_5920);
            user.method_6016(class_1294.field_5919);
            user.method_6016(class_1294.field_38092);
            user.method_6016(class_1294.field_5911);
            user.method_6016(class_1294.field_5921);
            user.method_6092(new class_1293(class_1294.field_5926, 1200, 9));
            user.method_6047().method_7956(20, (class_1309)user, p -> p.method_20236(hand));
        }
        return super.method_7836(world, user, hand);
    }

    public boolean method_7873(class_1799 stack, class_1309 target, class_1309 attacker) {
        attacker.method_6016(class_1294.field_5901);
        attacker.method_6016(class_1294.field_5909);
        target.method_6016(class_1294.field_5901);
        target.method_6016(class_1294.field_5909);
        attacker.method_6016(class_1294.field_5903);
        attacker.method_6016(class_1294.field_5916);
        target.method_6016(class_1294.field_5903);
        target.method_6016(class_1294.field_5916);
        attacker.method_6016(class_1294.field_5899);
        attacker.method_6016(class_1294.field_5920);
        target.method_6016(class_1294.field_5899);
        target.method_6016(class_1294.field_5920);
        attacker.method_6016(class_1294.field_5919);
        attacker.method_6016(class_1294.field_38092);
        target.method_6016(class_1294.field_5919);
        target.method_6016(class_1294.field_38092);
        attacker.method_6016(class_1294.field_5911);
        target.method_6016(class_1294.field_5911);
        attacker.method_6016(class_1294.field_5921);
        target.method_6016(class_1294.field_5921);
        attacker.method_6092(new class_1293(class_1294.field_5926, 1200, 9));
        target.method_6092(new class_1293(class_1294.field_5926, 1200, 9));
        stack.method_7956(40, attacker, e -> e.method_20235(class_1304.field_6173));
        return super.method_7873(stack, target, attacker);
    }
}

