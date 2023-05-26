/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1934
 *  net.minecraft.class_1937
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_3218
 *  net.minecraft.class_3222
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5819
 */
package net.romeosnowblitz.hmh2.block.custom.test;

import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1934;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_4970;
import net.minecraft.class_5819;

public class RevivePoint
extends class_2248 {
    class_1657 player;

    public RevivePoint(class_4970.class_2251 settings) {
        super(settings);
    }

    public void method_9514(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
        class_1657 class_16572 = this.player;
        if (class_16572 instanceof class_3222) {
            class_3222 serverPlayer = (class_3222)class_16572;
            serverPlayer.method_7255(1000);
        }
        super.method_9514(state, world, pos, random);
    }

    public void method_9606(class_2680 state, class_1937 world, class_2338 pos, class_1657 player) {
        if (player instanceof class_3222) {
            class_3222 serverPlayer = (class_3222)player;
            serverPlayer.method_7336(class_1934.field_9219);
        }
        super.method_9606(state, world, pos, player);
    }

    public void method_9591(class_1937 world, class_2338 pos, class_2680 state, class_1297 entity) {
        if (entity instanceof class_3222) {
            class_3222 serverPlayer = (class_3222)entity;
            serverPlayer.method_7336(class_1934.field_9215);
        }
        super.method_9591(world, pos, state, entity);
    }

    public void method_9548(class_2680 state, class_1937 world, class_2338 pos, class_1297 entity) {
        if (entity instanceof class_3222) {
            class_3222 serverPlayer = (class_3222)entity;
            serverPlayer.method_7336(class_1934.field_9220);
        }
        super.method_9548(state, world, pos, entity);
    }
}

