/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1271
 *  net.minecraft.class_1301
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1934
 *  net.minecraft.class_1937
 *  net.minecraft.class_3222
 */
package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1301;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1934;
import net.minecraft.class_1937;
import net.minecraft.class_3222;

public class RevivalStone
extends class_1792 {
    public RevivalStone(class_1792.class_1793 settings) {
        super(settings);
    }

    public boolean method_7886(class_1799 stack) {
        return true;
    }

    public class_1271<class_1799> method_7836(class_1937 world, class_1657 user, class_1268 hand) {
        if (!world.method_8608() && hand == class_1268.field_5808) {
            class_3222 closeNorth = (class_3222)world.method_8604(user.method_23317(), user.method_23318(), user.method_23321() - 5.0, 10.0, class_1301.field_6154);
            class_3222 closeSouth = (class_3222)world.method_8604(user.method_23317(), user.method_23318(), user.method_23321() + 5.0, 10.0, class_1301.field_6154);
            class_3222 closeEast = (class_3222)world.method_8604(user.method_23317() + 5.0, user.method_23318(), user.method_23321(), 10.0, class_1301.field_6154);
            class_3222 closeWest = (class_3222)world.method_8604(user.method_23317() - 5.0, user.method_23318(), user.method_23321(), 10.0, class_1301.field_6154);
            class_3222 closeUp = (class_3222)world.method_8604(user.method_23317(), user.method_23318() + 5.0, user.method_23321(), 10.0, class_1301.field_6154);
            class_3222 closeDown = (class_3222)world.method_8604(user.method_23317(), user.method_23318() - 5.0, user.method_23321(), 10.0, class_1301.field_6154);
            if (closeNorth.method_7325() || closeSouth.method_7325() || closeEast.method_7325() || closeWest.method_7325() || closeUp.method_7325() || closeDown.method_7325()) {
                closeNorth.method_7336(class_1934.field_9215);
                closeSouth.method_7336(class_1934.field_9215);
                closeEast.method_7336(class_1934.field_9215);
                closeWest.method_7336(class_1934.field_9215);
                closeUp.method_7336(class_1934.field_9215);
                closeDown.method_7336(class_1934.field_9215);
                user.method_5998(hand).method_7956(1, (class_1309)user, e -> e.method_20235(class_1304.field_6173));
            }
        }
        return super.method_7836(world, user, hand);
    }
}

