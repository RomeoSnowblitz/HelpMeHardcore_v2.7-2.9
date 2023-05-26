/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1792
 *  net.minecraft.class_1922
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
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
 *  net.minecraft.class_3486
 *  net.minecraft.class_3609
 *  net.minecraft.class_3610
 *  net.minecraft.class_3611
 *  net.minecraft.class_4538
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.fluid;

import java.util.Optional;
import net.minecraft.class_1792;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
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
import net.minecraft.class_3486;
import net.minecraft.class_3609;
import net.minecraft.class_3610;
import net.minecraft.class_3611;
import net.minecraft.class_4538;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.fluid.ModFluids;
import net.romeosnowblitz.hmh2.item.ModItems;
import org.jetbrains.annotations.Nullable;

public abstract class ChocolateMilkFluid
extends class_3609 {
    public class_3611 method_15750() {
        return ModFluids.CHOCOLATE_MILK_FLOWING;
    }

    public class_3611 method_15751() {
        return ModFluids.CHOCOLATE_MILK_STILL;
    }

    public class_1792 method_15774() {
        return ModItems.CHOCOLATE_MILK;
    }

    @Nullable
    public class_2394 method_15787() {
        return class_2398.field_11232;
    }

    protected void method_15730(class_1936 world, class_2338 pos, class_2680 state) {
        class_2586 blockEntity = state.method_31709() ? world.method_8321(pos) : null;
        class_2248.method_9610((class_2680)state, (class_1936)world, (class_2338)pos, (class_2586)blockEntity);
    }

    public int method_15733(class_4538 world) {
        return 4;
    }

    public class_2680 method_15790(class_3610 state) {
        return (class_2680)ModBlocks.CHOCOLATE_MILK_FLUID_BLOCK.method_9564().method_11657((class_2769)class_2404.field_11278, (Comparable)Integer.valueOf(ChocolateMilkFluid.method_15741((class_3610)state)));
    }

    public boolean method_15780(class_3611 fluid) {
        return fluid == ModFluids.CHOCOLATE_MILK_STILL || fluid == ModFluids.CHOCOLATE_MILK_FLOWING;
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
    extends ChocolateMilkFluid {
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
    extends ChocolateMilkFluid {
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

