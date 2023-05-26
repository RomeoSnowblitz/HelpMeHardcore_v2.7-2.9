/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1271
 *  net.minecraft.class_1293
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_174
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1839
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
import net.minecraft.class_1293;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_174;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1839;
import net.minecraft.class_1937;
import net.minecraft.class_3222;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3468;
import net.minecraft.class_5328;
import net.romeosnowblitz.hmh2.effect.CustomEffects;

public class EnderSkinConsumableLong
extends class_1792 {
    public EnderSkinConsumableLong(class_1792.class_1793 settings) {
        super(settings);
    }

    public class_1799 method_7861(class_1799 stack, class_1937 world, class_1309 user) {
        super.method_7861(stack, world, user);
        if (user instanceof class_3222) {
            class_3222 serverPlayerEntity = (class_3222)user;
            class_174.field_1198.method_8821(serverPlayerEntity, stack);
            serverPlayerEntity.method_7259(class_3468.field_15372.method_14956((Object)this));
        }
        user.method_6092(new class_1293(CustomEffects.ENDER_SKIN, 12000, 1));
        return stack;
    }

    public int method_7881(class_1799 stack) {
        return 40;
    }

    public class_1839 method_7853(class_1799 stack) {
        return class_1839.field_8950;
    }

    public class_3414 method_21830() {
        return class_3417.field_20614;
    }

    public class_1271<class_1799> method_7836(class_1937 world, class_1657 user, class_1268 hand) {
        return class_5328.method_29282((class_1937)world, (class_1657)user, (class_1268)hand);
    }
}

