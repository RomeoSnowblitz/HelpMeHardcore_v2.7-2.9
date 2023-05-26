/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2263
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2404
 *  net.minecraft.class_2502
 *  net.minecraft.class_2586
 *  net.minecraft.class_2680
 *  net.minecraft.class_3486
 *  net.minecraft.class_3545
 *  net.minecraft.class_3610
 *  net.minecraft.class_3614
 *  net.minecraft.class_4970$class_2251
 */
package net.romeosnowblitz.hmh2.block.custom.block;

import com.google.common.collect.Lists;
import java.util.LinkedList;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2263;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2404;
import net.minecraft.class_2502;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_3486;
import net.minecraft.class_3545;
import net.minecraft.class_3610;
import net.minecraft.class_3614;
import net.minecraft.class_4970;
import net.romeosnowblitz.hmh2.block.ModBlocks;

public class LavaSponge
extends class_2248 {
    public static final int field_31250 = 6;
    public static final int field_31251 = 64;

    public LavaSponge(class_4970.class_2251 settings) {
        super(settings);
    }

    public void method_9615(class_2680 state, class_1937 world, class_2338 pos, class_2680 oldState, boolean notify) {
        if (oldState.method_27852(state.method_26204())) {
            return;
        }
        this.update(world, pos);
    }

    public void method_9612(class_2680 state, class_1937 world, class_2338 pos, class_2248 block, class_2338 fromPos, boolean notify) {
        this.update(world, pos);
        super.method_9612(state, world, pos, block, fromPos, notify);
    }

    protected void update(class_1937 world, class_2338 pos) {
        if (this.absorbLava(world, pos)) {
            world.method_8652(pos, ModBlocks.HOT_PUMICE.method_9564(), 2);
            world.method_20290(2001, pos, class_2248.method_9507((class_2680)class_2246.field_10382.method_9564()));
        }
    }

    private boolean absorbLava(class_1937 world, class_2338 pos) {
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
                class_3610 fluidState = world.method_8316(blockPos2);
                class_3614 material = blockState.method_26207();
                if (!fluidState.method_15767(class_3486.field_15518)) continue;
                if (blockState.method_26204() instanceof class_2263 && !((class_2263)blockState.method_26204()).method_9700((class_1936)world, blockPos2, blockState).method_7960()) {
                    ++i;
                    if (j >= 6) continue;
                    queue.add(new class_3545((Object)blockPos2, (Object)(j + 1)));
                    continue;
                }
                if (blockState.method_26204() instanceof class_2404) {
                    world.method_8652(blockPos2, class_2246.field_10124.method_9564(), 3);
                    ++i;
                    if (j >= 6) continue;
                    queue.add(new class_3545((Object)blockPos2, (Object)(j + 1)));
                    continue;
                }
                if (material != class_3614.field_15947 && material != class_3614.field_15926) continue;
                class_2586 blockEntity = blockState.method_31709() ? world.method_8321(blockPos2) : null;
                class_2502.method_9610((class_2680)blockState, (class_1936)world, (class_2338)blockPos2, (class_2586)blockEntity);
                world.method_8652(blockPos2, class_2246.field_10124.method_9564(), 3);
                ++i;
                if (j >= 6) continue;
                queue.add(new class_3545((Object)blockPos2, (Object)(j + 1)));
            }
            if (i <= 64) continue;
        }
        return i > 0;
    }
}

