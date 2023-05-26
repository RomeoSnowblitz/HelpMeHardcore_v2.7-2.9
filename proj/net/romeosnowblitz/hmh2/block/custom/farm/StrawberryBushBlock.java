/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1922
 *  net.minecraft.class_1935
 *  net.minecraft.class_1937
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2741
 *  net.minecraft.class_2758
 *  net.minecraft.class_2769
 *  net.minecraft.class_3218
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3726
 *  net.minecraft.class_3830
 *  net.minecraft.class_3965
 *  net.minecraft.class_4538
 *  net.minecraft.class_4970$class_2251
 */
package net.romeosnowblitz.hmh2.block.custom.farm;

import java.util.Random;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1922;
import net.minecraft.class_1935;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3726;
import net.minecraft.class_3830;
import net.minecraft.class_3965;
import net.minecraft.class_4538;
import net.minecraft.class_4970;
import net.romeosnowblitz.hmh2.item.ModItems;

public class StrawberryBushBlock
extends class_3830 {
    private static final float field_31260 = 0.003f;
    public static final int MAX_AGE = 3;
    public static final class_2758 AGE = class_2741.field_12497;
    private static final class_265 SMALL_SHAPE = class_2248.method_9541((double)3.0, (double)0.0, (double)3.0, (double)13.0, (double)8.0, (double)13.0);
    private static final class_265 LARGE_SHAPE = class_2248.method_9541((double)1.0, (double)0.0, (double)1.0, (double)15.0, (double)16.0, (double)15.0);

    public StrawberryBushBlock(class_4970.class_2251 settings) {
        super(settings);
        this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)AGE, (Comparable)Integer.valueOf(0)));
    }

    public class_1799 method_9574(class_1922 world, class_2338 pos, class_2680 state) {
        return new class_1799((class_1935)ModItems.STRAWBERRIES);
    }

    public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        if ((Integer)state.method_11654((class_2769)AGE) == 0) {
            return SMALL_SHAPE;
        }
        if ((Integer)state.method_11654((class_2769)AGE) < 3) {
            return LARGE_SHAPE;
        }
        return super.method_9530(state, world, pos, context);
    }

    public boolean method_9542(class_2680 state) {
        return (Integer)state.method_11654((class_2769)AGE) < 3;
    }

    public void randomTick(class_2680 state, class_3218 world, class_2338 pos, Random random) {
        int i = (Integer)state.method_11654((class_2769)AGE);
        if (i < 3 && random.nextInt(5) == 0 && world.method_22335(pos.method_10084(), 0) >= 9) {
            world.method_8652(pos, (class_2680)state.method_11657((class_2769)AGE, (Comparable)Integer.valueOf(i + 1)), 2);
        }
    }

    public void method_9548(class_2680 state, class_1937 world, class_2338 pos, class_1297 entity) {
        if (!(entity instanceof class_1309) || entity.method_5864() == class_1299.field_17943 || entity.method_5864() == class_1299.field_20346) {
            return;
        }
        entity.method_5844(state, new class_243((double)0.8f, 0.75, (double)0.8f));
        if (!(world.field_9236 || (Integer)state.method_11654((class_2769)AGE) <= 0 || entity.field_6038 == entity.method_23317() && entity.field_5989 == entity.method_23321())) {
            double d = Math.abs(entity.method_23317() - entity.field_6038);
            double e = Math.abs(entity.method_23321() - entity.field_5989);
            if (d >= (double)0.003f || e >= (double)0.003f) {
                entity.method_5643(world.method_48963().method_48835(), 1.0f);
            }
        }
    }

    public class_1269 method_9534(class_2680 state, class_1937 world, class_2338 pos, class_1657 player, class_1268 hand, class_3965 hit) {
        int i = (Integer)state.method_11654((class_2769)AGE);
        boolean bl = i == 3;
        boolean bl2 = bl;
        if (!bl && player.method_5998(hand).method_31574(class_1802.field_8324)) {
            return class_1269.field_5811;
        }
        if (i > 1) {
            int j = 1 + world.field_9229.method_43048(2);
            class_3830.method_9577((class_1937)world, (class_2338)pos, (class_1799)new class_1799((class_1935)ModItems.STRAWBERRIES, j + (bl ? 1 : 0)));
            world.method_8396(null, pos, class_3417.field_17617, class_3419.field_15245, 1.0f, 0.8f + world.field_9229.method_43057() * 0.4f);
            world.method_8652(pos, (class_2680)state.method_11657((class_2769)AGE, (Comparable)Integer.valueOf(1)), 2);
            return class_1269.method_29236((boolean)world.field_9236);
        }
        return super.method_9534(state, world, pos, player, hand, hit);
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{AGE});
    }

    public boolean method_9651(class_4538 world, class_2338 pos, class_2680 state, boolean isClient) {
        return (Integer)state.method_11654((class_2769)AGE) < 3;
    }

    public boolean canGrow(class_1937 world, Random random, class_2338 pos, class_2680 state) {
        return true;
    }

    public void grow(class_3218 world, Random random, class_2338 pos, class_2680 state) {
        int i = Math.min(3, (Integer)state.method_11654((class_2769)AGE) + 1);
        world.method_8652(pos, (class_2680)state.method_11657((class_2769)AGE, (Comparable)Integer.valueOf(i)), 2);
    }
}

