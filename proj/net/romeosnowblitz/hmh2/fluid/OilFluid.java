/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1792
 *  net.minecraft.class_1922
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2394
 *  net.minecraft.class_2398
 *  net.minecraft.class_2404
 *  net.minecraft.class_2586
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2769
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3486
 *  net.minecraft.class_3609
 *  net.minecraft.class_3610
 *  net.minecraft.class_3611
 *  net.minecraft.class_4538
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.fluid;

import java.util.Optional;
import java.util.Random;
import net.minecraft.class_1792;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_2404;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2769;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3486;
import net.minecraft.class_3609;
import net.minecraft.class_3610;
import net.minecraft.class_3611;
import net.minecraft.class_4538;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.ModItems;
import org.jetbrains.annotations.Nullable;

public abstract class OilFluid
extends class_3609 {
    public class_3611 method_15750() {
        return ModFluids.OIL_FLOWING;
    }

    public class_3611 method_15751() {
        return ModFluids.OIL_STILL;
    }

    public class_1792 method_15774() {
        return ModItems.OIL_BUCKET;
    }

    public void randomDisplayTick(class_1937 world, class_2338 pos, class_3610 state, Random random) {
        if (!state.method_15771() && !((Boolean)state.method_11654((class_2769)field_15902)).booleanValue()) {
            if (random.nextInt(128) == 0) {
                world.method_8486((double)pos.method_10263() + 0.5, (double)pos.method_10264() + 0.5, (double)pos.method_10260() + 0.5, class_3417.field_15237, class_3419.field_15245, random.nextFloat() * 0.25f + 0.75f, random.nextFloat() + 0.1f, false);
            }
        } else if (random.nextInt(10) == 0) {
            world.method_8406((class_2394)class_2398.field_11210, (double)pos.method_10263() + random.nextDouble(), (double)pos.method_10264() + random.nextDouble(), (double)pos.method_10260() + random.nextDouble(), 0.0, 0.0, 0.0);
        }
    }

    @Nullable
    public class_2394 method_15787() {
        return class_2398.field_11232;
    }

    protected boolean isInfinite() {
        return true;
    }

    protected void method_15745(class_1936 world, class_2338 pos, class_2680 state, class_2350 direction, class_3610 fluidState) {
        if (direction == class_2350.field_11033) {
            class_3610 fluidState2 = world.method_8316(pos);
            if (this.method_15791(class_3486.field_15517) && fluidState2.method_15767(class_3486.field_15517)) {
                if (state.method_26204() instanceof class_2404) {
                    world.method_8652(pos, class_2246.field_10113.method_9564(), 3);
                }
                return;
            }
        }
        super.method_15745(world, pos, state, direction, fluidState);
    }

    protected void method_15730(class_1936 world, class_2338 pos, class_2680 state) {
        class_2586 blockEntity = state.method_31709() ? world.method_8321(pos) : null;
        class_2248.method_9610((class_2680)state, (class_1936)world, (class_2338)pos, (class_2586)blockEntity);
    }

    public int method_15733(class_4538 world) {
        return 4;
    }

    public class_2680 method_15790(class_3610 state) {
        return (class_2680)ModBlocks.OIL_FLUID_BLOCK.method_9564().method_11657((class_2769)class_2404.field_11278, (Comparable)Integer.valueOf(OilFluid.method_15741((class_3610)state)));
    }

    public boolean method_15780(class_3611 fluid) {
        return fluid == ModFluids.OIL_STILL || fluid == ModFluids.OIL_FLOWING;
    }

    public int method_15739(class_4538 world) {
        return 1;
    }

    public int method_15789(class_4538 world) {
        return 5;
    }

    public boolean method_15777(class_3610 state, class_1922 world, class_2338 pos, class_3611 fluid, class_2350 direction) {
        return direction == class_2350.field_11033 && !fluid.method_15791(class_3486.field_15517);
    }

    protected float method_15784() {
        return 100.0f;
    }

    public Optional<class_3414> method_32359() {
        return Optional.of(class_3417.field_15126);
    }

    public static class Still
    extends OilFluid {
        protected boolean method_15737(class_1937 world) {
            return false;
        }

        public int method_15779(class_3610 state) {
            return 8;
        }

        public boolean method_15793(class_3610 state) {
            return true;
        }
    }

    public static class Flowing
    extends OilFluid {
        protected void method_15775(class_2689.class_2690<class_3611, class_3610> builder) {
            super.method_15775(builder);
            builder.method_11667(new class_2769[]{field_15900});
        }

        protected boolean method_15737(class_1937 world) {
            return false;
        }

        public int method_15779(class_3610 state) {
            return (Integer)state.method_11654((class_2769)field_15900);
        }

        public boolean method_15793(class_3610 state) {
            return false;
        }
    }
}

