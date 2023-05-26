/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2741
 *  net.minecraft.class_2758
 *  net.minecraft.class_2769
 *  net.minecraft.class_3218
 *  net.minecraft.class_3545
 *  net.minecraft.class_4538
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5819
 */
package net.romeosnowblitz.hmh2.block.custom;

import com.google.common.collect.Lists;
import java.util.LinkedList;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3545;
import net.minecraft.class_4538;
import net.minecraft.class_4970;
import net.minecraft.class_5819;
import net.romeosnowblitz.hmh2.block.ModBlocks;

public class BlockThree
extends class_2248 {
    public static final class_2758 AGE = class_2741.field_12498;
    protected static final float field_31258 = 6.0f;

    public BlockThree(class_4970.class_2251 settings) {
        super(settings);
        this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)AGE, (Comparable)Integer.valueOf(0)));
    }

    public void method_9588(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
        if (!state.method_26184((class_4538)world, pos)) {
            world.method_22352(pos, true);
        }
    }

    public void method_9514(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
        if (world.method_22347(pos.method_10084())) {
            int i = 1;
            while (world.method_8320(pos.method_10087(i)).method_27852((class_2248)this)) {
                ++i;
            }
            if (i < 3) {
                int j = (Integer)state.method_11654((class_2769)AGE);
                if (j == 15) {
                    world.method_8501(pos.method_10084(), ModBlocks.BLOCK_ONE.method_9564());
                    world.method_8652(pos, (class_2680)state.method_11657((class_2769)AGE, (Comparable)Integer.valueOf(0)), 4);
                } else {
                    world.method_8652(pos, (class_2680)state.method_11657((class_2769)AGE, (Comparable)Integer.valueOf(j + 1)), 4);
                }
            }
        }
    }

    public class_2680 method_9559(class_2680 state, class_2350 direction, class_2680 neighborState, class_1936 world, class_2338 pos, class_2338 neighborPos) {
        if (!state.method_26184((class_4538)world, pos)) {
            world.method_39279(pos, (class_2248)this, 1);
        }
        return super.method_9559(state, direction, neighborState, world, pos, neighborPos);
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{AGE});
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
        if (this.absorbSouls(world, pos)) {
            world.method_8652(pos, ModBlocks.BLOCK_THREE.method_9564(), 2);
            world.method_20290(2001, pos, class_2248.method_9507((class_2680)class_2246.field_10382.method_9564()));
        }
    }

    private boolean absorbSouls(class_1937 world, class_2338 pos) {
        LinkedList queue = Lists.newLinkedList();
        queue.add(new class_3545((Object)pos, (Object)0));
        int i = 0;
        while (!queue.isEmpty()) {
            class_2680 blockState;
            class_2338 blockPos2;
            class_3545 pair = (class_3545)queue.poll();
            class_2338 blockPos = (class_2338)pair.method_15442();
            int j = (Integer)pair.method_15441();
            for (class_2350 direction : class_2350.values()) {
                blockPos2 = blockPos.method_10093(direction);
                blockState = world.method_8320(blockPos2);
                if (!blockState.method_27852(class_2246.field_10340)) continue;
                world.method_8652(blockPos2, ModBlocks.BLOCK_ONE.method_9564(), 3);
                ++i;
                if (j >= 0) continue;
                queue.add(new class_3545((Object)blockPos2, (Object)j));
            }
            for (class_2350 direction : class_2350.values()) {
                blockPos2 = blockPos.method_10093(direction);
                blockState = world.method_8320(blockPos2);
                if (!blockState.method_27852(ModBlocks.BLOCK_TWO)) continue;
                world.method_8652(blockPos2, class_2246.field_10124.method_9564(), 3);
                ++i;
                if (j >= 0) continue;
                queue.add(new class_3545((Object)blockPos2, (Object)j));
            }
            if (i <= 1) continue;
        }
        return i > 0;
    }
}

