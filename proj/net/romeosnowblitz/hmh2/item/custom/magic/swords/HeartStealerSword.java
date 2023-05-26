/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1309
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1829
 *  net.minecraft.class_1832
 */
package net.romeosnowblitz.hmh2.item.custom.magic.swords;

import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1829;
import net.minecraft.class_1832;

public class HeartStealerSword
extends class_1829 {
    public HeartStealerSword(class_1832 toolMaterial, int attackDamage, float attackSpeed, class_1792.class_1793 settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public boolean method_7873(class_1799 stack, class_1309 target, class_1309 attacker) {
        target.method_6092(new class_1293(class_1294.field_5920, 20, 0));
        attacker.method_6092(new class_1293(class_1294.field_5924, 20, 2));
        return super.method_7873(stack, target, attacker);
    }
}

