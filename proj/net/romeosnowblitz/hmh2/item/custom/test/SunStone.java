/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1267
 *  net.minecraft.class_1268
 *  net.minecraft.class_1271
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1934
 *  net.minecraft.class_1937
 *  net.minecraft.class_3222
 *  net.minecraft.class_5219
 *  net.minecraft.class_5268
 */
package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.class_1267;
import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1934;
import net.minecraft.class_1937;
import net.minecraft.class_3222;
import net.minecraft.class_5219;
import net.minecraft.class_5268;

public class SunStone
extends class_1792 {
    public SunStone(class_1792.class_1793 settings) {
        super(settings);
    }

    public class_1271<class_1799> method_7836(class_1937 world, class_1657 user, class_1268 hand) {
        if (!world.method_8608() && hand == class_1268.field_5808) {
            world.method_8503().method_30002().method_29199(6000L);
            if (user instanceof class_3222) {
                class_3222 player = (class_3222)user;
                player.method_7336(class_1934.field_9215);
            }
        }
        return super.method_7836(world, user, hand);
    }

    private void setToDebugWorldProperties(class_5219 properties) {
        properties.method_208(class_1267.field_5801);
        properties.method_186(true);
        properties.method_193(class_1934.field_9215);
        class_5268 serverWorldProperties = properties.method_27859();
        serverWorldProperties.method_157(false);
        serverWorldProperties.method_147(false);
        serverWorldProperties.method_167(1000000000);
        serverWorldProperties.method_29035(6000L);
        serverWorldProperties.method_193(class_1934.field_9215);
    }
}

