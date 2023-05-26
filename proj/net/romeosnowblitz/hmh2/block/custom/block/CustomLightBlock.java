/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_1922
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2487
 *  net.minecraft.class_2520
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2741
 *  net.minecraft.class_2758
 *  net.minecraft.class_2769
 *  net.minecraft.class_4970$class_2251
 */
package net.romeosnowblitz.hmh2.block.custom.block;

import java.util.function.ToIntFunction;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2520;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_4970;

public class CustomLightBlock
extends class_2248 {
    public static final class_2758 LEVEL_15 = class_2741.field_12538;
    public static final ToIntFunction<class_2680> STATE_TO_LUMINANCE = state -> (Integer)state.method_11654((class_2769)LEVEL_15);

    public CustomLightBlock(class_4970.class_2251 settings) {
        super(settings);
        this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)LEVEL_15, (Comparable)Integer.valueOf(15)));
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{LEVEL_15});
    }

    public float method_9575(class_2680 state, class_1922 world, class_2338 pos) {
        return 1.0f;
    }

    public class_1799 method_9574(class_1922 world, class_2338 pos, class_2680 state) {
        class_1799 itemStack = super.method_9574(world, pos, state);
        if ((Integer)state.method_11654((class_2769)LEVEL_15) != 15) {
            class_2487 nbtCompound = new class_2487();
            nbtCompound.method_10582(LEVEL_15.method_11899(), String.valueOf(state.method_11654((class_2769)LEVEL_15)));
            itemStack.method_7959("BlockStateTag", (class_2520)nbtCompound);
        }
        return itemStack;
    }
}

