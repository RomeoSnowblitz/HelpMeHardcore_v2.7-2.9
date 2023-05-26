/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1269
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1838
 *  net.minecraft.class_1922
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 */
package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.class_1269;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1838;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;

public class GrannyLotion
extends class_1792 {
    private int itemDurability;

    public GrannyLotion(class_1792.class_1793 settings) {
        super(settings);
        this.itemDurability = this.itemDurability = 14;
    }

    public class_1269 method_7884(class_1838 context) {
        class_1657 playerEntity = context.method_8036();
        playerEntity.method_6092(new class_1293(class_1294.field_5912, 6000, 2));
        context.method_8041().method_7956(1, (class_1309)playerEntity, p -> p.method_20236(context.method_20287()));
        return super.method_7884(context);
    }

    public boolean method_7885(class_2680 state, class_1937 world, class_2338 pos, class_1657 miner) {
        return !miner.method_7337();
    }

    public boolean method_7873(class_1799 stack, class_1309 target, class_1309 attacker) {
        stack.method_7956(2, attacker, e -> e.method_20235(class_1304.field_6173));
        attacker.method_37222(new class_1293(class_1294.field_5912, 3000, 1), (class_1297)attacker);
        attacker.method_37222(new class_1293(class_1294.field_5912, 3000, 1), (class_1297)target);
        return true;
    }

    public boolean method_7879(class_1799 stack, class_1937 world, class_2680 state, class_2338 pos, class_1309 miner) {
        if (state.method_26214((class_1922)world, pos) != 0.0f) {
            stack.method_7956(1, miner, e -> e.method_20235(class_1304.field_6173));
        }
        return true;
    }

    public int getDurability() {
        return this.itemDurability;
    }
}

