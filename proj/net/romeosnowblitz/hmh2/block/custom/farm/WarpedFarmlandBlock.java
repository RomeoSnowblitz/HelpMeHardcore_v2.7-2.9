/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1750
 *  net.minecraft.class_1922
 *  net.minecraft.class_1928
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_2195
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2349
 *  net.minecraft.class_2350
 *  net.minecraft.class_2513
 *  net.minecraft.class_265
 *  net.minecraft.class_2667
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2741
 *  net.minecraft.class_2758
 *  net.minecraft.class_2769
 *  net.minecraft.class_3218
 *  net.minecraft.class_3486
 *  net.minecraft.class_3726
 *  net.minecraft.class_4538
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5819
 */
package net.romeosnowblitz.hmh2.block.custom.farm;

import net.minecraft.class_10;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1928;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2195;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2349;
import net.minecraft.class_2350;
import net.minecraft.class_2513;
import net.minecraft.class_265;
import net.minecraft.class_2667;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3218;
import net.minecraft.class_3486;
import net.minecraft.class_3726;
import net.minecraft.class_4538;
import net.minecraft.class_4970;
import net.minecraft.class_5819;
import net.romeosnowblitz.hmh2.block.custom.farm.ModCropBlock;

public class WarpedFarmlandBlock
extends class_2248 {
    public static final class_2758 MOISTURE = class_2741.field_12510;
    protected static final class_265 SHAPE = class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)15.0, (double)16.0);
    public static final int MAX_MOISTURE = 7;

    public WarpedFarmlandBlock(class_4970.class_2251 settings) {
        super(settings);
        this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)MOISTURE, (Comparable)Integer.valueOf(0)));
    }

    public class_2680 method_9559(class_2680 state, class_2350 direction, class_2680 neighborState, class_1936 world, class_2338 pos, class_2338 neighborPos) {
        if (direction == class_2350.field_11036 && !state.method_26184((class_4538)world, pos)) {
            world.method_39279(pos, (class_2248)this, 1);
        }
        return super.method_9559(state, direction, neighborState, world, pos, neighborPos);
    }

    public boolean method_9558(class_2680 state, class_4538 world, class_2338 pos) {
        class_2680 blockState = world.method_8320(pos.method_10084());
        return !blockState.method_26207().method_15799() || blockState.method_26204() instanceof class_2349 || blockState.method_26204() instanceof class_2667;
    }

    public class_2680 method_9605(class_1750 ctx) {
        if (!this.method_9564().method_26184((class_4538)ctx.method_8045(), ctx.method_8037())) {
            return class_2246.field_22113.method_9564();
        }
        return super.method_9605(ctx);
    }

    public boolean method_9526(class_2680 state) {
        return true;
    }

    public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        return SHAPE;
    }

    public void method_9588(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
        if (!state.method_26184((class_4538)world, pos)) {
            WarpedFarmlandBlock.setToNylium(state, (class_1937)world, pos);
        }
    }

    public void method_9514(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
        int i = (Integer)state.method_11654((class_2769)MOISTURE);
        if (WarpedFarmlandBlock.isLavaNearby((class_4538)world, pos) || world.method_8520(pos.method_10084())) {
            if (i < 7) {
                world.method_8652(pos, (class_2680)state.method_11657((class_2769)MOISTURE, (Comparable)Integer.valueOf(7)), 2);
            }
        } else if (i > 0) {
            world.method_8652(pos, (class_2680)state.method_11657((class_2769)MOISTURE, (Comparable)Integer.valueOf(i - 1)), 2);
        } else if (!WarpedFarmlandBlock.hasModCrop((class_1922)world, pos)) {
            WarpedFarmlandBlock.setToNylium(state, (class_1937)world, pos);
        }
    }

    public void method_9554(class_1937 world, class_2680 state, class_2338 pos, class_1297 entity, float fallDistance) {
        if (!world.field_9236 && world.field_9229.method_43057() < fallDistance - 0.5f && entity instanceof class_1309 && (entity instanceof class_1657 || world.method_8450().method_8355(class_1928.field_19388)) && entity.method_17681() * entity.method_17681() * entity.method_17682() > 0.512f) {
            WarpedFarmlandBlock.setToNylium(state, world, pos);
        }
        super.method_9554(world, state, pos, entity, fallDistance);
    }

    public static void setToNylium(class_2680 state, class_1937 world, class_2338 pos) {
        world.method_8501(pos, WarpedFarmlandBlock.method_9582((class_2680)state, (class_2680)class_2246.field_22113.method_9564(), (class_1936)world, (class_2338)pos));
    }

    private static boolean hasModCrop(class_1922 world, class_2338 pos) {
        class_2248 block = world.method_8320(pos.method_10084()).method_26204();
        return block instanceof ModCropBlock || block instanceof class_2513 || block instanceof class_2195;
    }

    private static boolean isLavaNearby(class_4538 world, class_2338 pos) {
        for (class_2338 blockPos : class_2338.method_10097((class_2338)pos.method_10069(-4, 0, -4), (class_2338)pos.method_10069(4, 1, 4))) {
            if (!world.method_8316(blockPos).method_15767(class_3486.field_15518)) continue;
            return true;
        }
        return false;
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{MOISTURE});
    }

    public boolean method_9516(class_2680 state, class_1922 world, class_2338 pos, class_10 type) {
        return false;
    }
}

