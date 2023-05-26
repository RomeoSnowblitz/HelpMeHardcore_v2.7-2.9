/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1271
 *  net.minecraft.class_1294
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_174
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1839
 *  net.minecraft.class_1935
 *  net.minecraft.class_1937
 *  net.minecraft.class_3222
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3468
 *  net.minecraft.class_5328
 */
package net.romeosnowblitz.hmh2.item.custom.food;

import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_174;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1839;
import net.minecraft.class_1935;
import net.minecraft.class_1937;
import net.minecraft.class_3222;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3468;
import net.minecraft.class_5328;

public class ConsumeLeaveBottle
extends class_1792 {
    private static final int MAX_USE_TIME = 40;

    public ConsumeLeaveBottle(class_1792.class_1793 settings) {
        super(settings);
    }

    public class_1799 method_7861(class_1799 stack, class_1937 world, class_1309 user) {
        super.method_7861(stack, world, user);
        if (user instanceof class_3222) {
            class_3222 serverPlayerEntity = (class_3222)user;
            class_174.field_1198.method_8821(serverPlayerEntity, stack);
            serverPlayerEntity.method_7259(class_3468.field_15372.method_14956((Object)this));
        }
        if (!world.field_9236) {
            user.method_6016(class_1294.field_5899);
        }
        if (stack.method_7960()) {
            return new class_1799((class_1935)class_1802.field_8469);
        }
        if (user instanceof class_1657 && !((class_1657)user).method_31549().field_7477) {
            class_1799 itemStack = new class_1799((class_1935)class_1802.field_8469);
            class_1657 playerEntity = (class_1657)user;
            if (!playerEntity.method_31548().method_7394(itemStack)) {
                playerEntity.method_7328(itemStack, false);
            }
        }
        return stack;
    }

    public int method_7881(class_1799 stack) {
        return 40;
    }

    public class_1839 method_7853(class_1799 stack) {
        return class_1839.field_8946;
    }

    public class_3414 method_21831() {
        return class_3417.field_20615;
    }

    public class_3414 method_21830() {
        return class_3417.field_20615;
    }

    public class_1271<class_1799> method_7836(class_1937 world, class_1657 user, class_1268 hand) {
        return class_5328.method_29282((class_1937)world, (class_1657)user, (class_1268)hand);
    }
}

