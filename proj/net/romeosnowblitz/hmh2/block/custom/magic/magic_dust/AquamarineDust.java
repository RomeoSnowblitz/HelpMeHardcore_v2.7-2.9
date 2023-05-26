/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1267
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2741
 *  net.minecraft.class_2746
 *  net.minecraft.class_2769
 *  net.minecraft.class_3610
 *  net.minecraft.class_3611
 *  net.minecraft.class_3612
 *  net.minecraft.class_3737
 *  net.minecraft.class_4538
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5778
 *  net.minecraft.class_7118
 */
package net.romeosnowblitz.hmh2.block.custom.magic.magic_dust;

import net.minecraft.class_1267;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2746;
import net.minecraft.class_2769;
import net.minecraft.class_3610;
import net.minecraft.class_3611;
import net.minecraft.class_3612;
import net.minecraft.class_3737;
import net.minecraft.class_4538;
import net.minecraft.class_4970;
import net.minecraft.class_5778;
import net.minecraft.class_7118;

public class AquamarineDust
extends class_5778
implements class_3737 {
    private static final class_2746 WATERLOGGED = class_2741.field_12508;

    public AquamarineDust(class_4970.class_2251 settings) {
        super(settings);
        this.method_9590((class_2680)this.method_9564().method_11657((class_2769)WATERLOGGED, (Comparable)Boolean.valueOf(false)));
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        super.method_9515(builder);
        builder.method_11667(new class_2769[]{WATERLOGGED});
    }

    public class_2680 method_9559(class_2680 state, class_2350 direction, class_2680 neighborState, class_1936 world, class_2338 pos, class_2338 neighborPos) {
        if (((Boolean)state.method_11654((class_2769)WATERLOGGED)).booleanValue()) {
            world.method_39281(pos, (class_3611)class_3612.field_15910, class_3612.field_15910.method_15789((class_4538)world));
        }
        return super.method_9559(state, direction, neighborState, world, pos, neighborPos);
    }

    public class_7118 method_41432() {
        return null;
    }

    public class_3610 method_9545(class_2680 state) {
        if (((Boolean)state.method_11654((class_2769)WATERLOGGED)).booleanValue()) {
            return class_3612.field_15910.method_15729(false);
        }
        return super.method_9545(state);
    }

    public void method_9548(class_2680 state, class_1937 world, class_2338 pos, class_1297 entity) {
        class_1309 livingEntity;
        if (world.field_9236 || world.method_8407() == class_1267.field_5801) {
            return;
        }
        if (entity instanceof class_1309 && !(livingEntity = (class_1309)entity).method_5679(world.method_48963().method_48832())) {
            livingEntity.method_6092(new class_1293(class_1294.field_5900, 60));
        }
    }
}

