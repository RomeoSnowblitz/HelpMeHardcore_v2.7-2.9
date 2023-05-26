/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2502
 *  net.minecraft.class_2680
 *  net.minecraft.class_3545
 *  net.minecraft.class_4970$class_2251
 */
package net.romeosnowblitz.hmh2.block.custom;

import com.google.common.collect.Lists;
import java.util.LinkedList;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2502;
import net.minecraft.class_2680;
import net.minecraft.class_3545;
import net.minecraft.class_4970;

public class SandSculk
extends class_2502 {
    public static final int field_31250 = 6;
    public static final int field_31251 = 64;

    public SandSculk(class_4970.class_2251 settings) {
        super(settings);
    }

    public void method_9615(class_2680 state, class_1937 world, class_2338 pos, class_2680 oldState, boolean notify) {
        if (oldState.method_27852(state.method_26204())) {
            return;
        }
        this.method_10620(world, pos);
    }

    public void method_9612(class_2680 state, class_1937 world, class_2338 pos, class_2248 block, class_2338 fromPos, boolean notify) {
        this.method_10620(world, pos);
        super.method_9612(state, world, pos, block, fromPos, notify);
    }

    protected void method_10620(class_1937 world, class_2338 pos) {
        if (this.absorbSouls(world, pos)) {
            world.method_8652(pos, class_2246.field_22090.method_9564(), 2);
            world.method_20290(2001, pos, class_2248.method_9507((class_2680)class_2246.field_10382.method_9564()));
        }
    }

    private boolean absorbSouls(class_1937 world, class_2338 pos) {
        LinkedList queue = Lists.newLinkedList();
        queue.add(new class_3545((Object)pos, (Object)0));
        int i = 0;
        while (!queue.isEmpty()) {
            class_3545 pair = (class_3545)queue.poll();
            class_2338 blockPos = (class_2338)pair.method_15442();
            int j = (Integer)pair.method_15441();
            for (class_2350 direction : class_2350.values()) {
                class_2338 blockPos2 = blockPos.method_10093(direction);
                class_2680 blockState = world.method_8320(blockPos2);
                if (!blockState.method_27852(class_2246.field_10166)) continue;
                world.method_8652(blockPos2, class_2246.field_37570.method_9564(), 3);
                ++i;
                if (j >= 0) continue;
                queue.add(new class_3545((Object)blockPos2, (Object)j));
            }
            if (i <= 1) continue;
        }
        return i > 0;
    }
}

