/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1584
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1922
 *  net.minecraft.class_1928
 *  net.minecraft.class_1935
 *  net.minecraft.class_1937
 *  net.minecraft.class_2248
 *  net.minecraft.class_2302
 *  net.minecraft.class_2338
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2741
 *  net.minecraft.class_2758
 *  net.minecraft.class_2769
 *  net.minecraft.class_3218
 *  net.minecraft.class_3532
 *  net.minecraft.class_3726
 *  net.minecraft.class_4538
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5819
 */
package net.romeosnowblitz.hmh2.block.custom.farm;

import net.minecraft.class_1297;
import net.minecraft.class_1584;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1922;
import net.minecraft.class_1928;
import net.minecraft.class_1935;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2302;
import net.minecraft.class_2338;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3532;
import net.minecraft.class_3726;
import net.minecraft.class_4538;
import net.minecraft.class_4970;
import net.minecraft.class_5819;
import net.romeosnowblitz.hmh2.block.ModBlocks;

public class ModCropBlock
extends class_2302 {
    public static final int MAX_AGE = 7;
    public static final class_2758 AGE = class_2741.field_12550;
    private static final class_265[] AGE_TO_SHAPE = new class_265[]{class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)2.0, (double)16.0), class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)4.0, (double)16.0), class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)6.0, (double)16.0), class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)8.0, (double)16.0), class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)10.0, (double)16.0), class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)12.0, (double)16.0), class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)14.0, (double)16.0), class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)16.0)};

    public ModCropBlock(class_4970.class_2251 settings) {
        super(settings);
        this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)this.method_9824(), (Comparable)Integer.valueOf(0)));
    }

    public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        return AGE_TO_SHAPE[(Integer)state.method_11654((class_2769)this.method_9824())];
    }

    protected boolean method_9695(class_2680 floor, class_1922 world, class_2338 pos) {
        return floor.method_27852(ModBlocks.CRIMSON_FARMLAND) || floor.method_27852(ModBlocks.WARPED_FARMLAND) || super.method_9695(floor, world, pos);
    }

    public class_2758 method_9824() {
        return AGE;
    }

    public int method_9827() {
        return 7;
    }

    protected int method_9829(class_2680 state) {
        return (Integer)state.method_11654((class_2769)this.method_9824());
    }

    public class_2680 method_9828(int age) {
        return (class_2680)this.method_9564().method_11657((class_2769)this.method_9824(), (Comparable)Integer.valueOf(age));
    }

    public boolean method_9825(class_2680 state) {
        return (Integer)state.method_11654((class_2769)this.method_9824()) >= this.method_9827();
    }

    public boolean method_9542(class_2680 state) {
        return !this.method_9825(state);
    }

    public void method_9514(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
        float f;
        int i;
        if (world.method_22335(pos, 0) >= 9 && (i = this.method_9829(state)) < this.method_9827() && random.method_43048((int)(25.0f / (f = class_2302.method_9830((class_2248)this, (class_1922)world, (class_2338)pos))) + 1) == 0) {
            world.method_8652(pos, this.method_9828(i + 1), 2);
        }
    }

    public void method_9826(class_1937 world, class_2338 pos, class_2680 state) {
        int j;
        int i = this.method_9829(state) + this.method_9831(world);
        if (i > (j = this.method_9827())) {
            i = j;
        }
        world.method_8652(pos, this.method_9828(i), 2);
    }

    public int method_9831(class_1937 world) {
        return class_3532.method_15395((class_5819)world.field_9229, (int)2, (int)5);
    }

    public boolean method_9558(class_2680 state, class_4538 world, class_2338 pos) {
        return (world.method_22335(pos, 0) >= 8 || world.method_8311(pos)) && super.method_9558(state, world, pos);
    }

    public void method_9548(class_2680 state, class_1937 world, class_2338 pos, class_1297 entity) {
        if (entity instanceof class_1584 && world.method_8450().method_8355(class_1928.field_19388)) {
            world.method_8651(pos, true, entity);
        }
        super.method_9548(state, world, pos, entity);
    }

    protected class_1935 method_9832() {
        return class_1802.field_8317;
    }

    public class_1799 method_9574(class_1922 world, class_2338 pos, class_2680 state) {
        return new class_1799(this.method_9832());
    }

    public boolean method_9651(class_4538 world, class_2338 pos, class_2680 state, boolean isClient) {
        return (Integer)state.method_11654((class_2769)AGE) < 3;
    }

    public boolean method_9650(class_1937 world, class_5819 random, class_2338 pos, class_2680 state) {
        return true;
    }

    public void method_9652(class_3218 world, class_5819 random, class_2338 pos, class_2680 state) {
        this.method_9826((class_1937)world, pos, state);
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{AGE});
    }
}

