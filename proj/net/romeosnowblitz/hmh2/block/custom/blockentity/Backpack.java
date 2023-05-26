/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1263
 *  net.minecraft.class_1264
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1657
 *  net.minecraft.class_1750
 *  net.minecraft.class_1937
 *  net.minecraft.class_2237
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2343
 *  net.minecraft.class_2350
 *  net.minecraft.class_2464
 *  net.minecraft.class_2470
 *  net.minecraft.class_2586
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2741
 *  net.minecraft.class_2753
 *  net.minecraft.class_2769
 *  net.minecraft.class_3908
 *  net.minecraft.class_3965
 *  net.minecraft.class_4970$class_2251
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.block.custom.blockentity;

import net.minecraft.class_1263;
import net.minecraft.class_1264;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1750;
import net.minecraft.class_1937;
import net.minecraft.class_2237;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2343;
import net.minecraft.class_2350;
import net.minecraft.class_2464;
import net.minecraft.class_2470;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2753;
import net.minecraft.class_2769;
import net.minecraft.class_3908;
import net.minecraft.class_3965;
import net.minecraft.class_4970;
import net.romeosnowblitz.hmh2.entity.block.BackpackEntity;
import org.jetbrains.annotations.Nullable;

public class Backpack
extends class_2237
implements class_2343 {
    public static final class_2753 FACING = class_2741.field_12481;

    public Backpack(class_4970.class_2251 settings) {
        super(settings);
    }

    @Nullable
    public class_2680 method_9605(class_1750 ctx) {
        return (class_2680)this.method_9564().method_11657((class_2769)FACING, (Comparable)ctx.method_8042().method_10153());
    }

    public class_2680 method_9598(class_2680 state, class_2470 rotation) {
        return (class_2680)state.method_11657((class_2769)FACING, (Comparable)rotation.method_10503((class_2350)state.method_11654((class_2769)FACING)));
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{FACING});
    }

    public class_2464 method_9604(class_2680 state) {
        return class_2464.field_11458;
    }

    public void method_9536(class_2680 state, class_1937 world, class_2338 pos, class_2680 newState, boolean moved) {
        if (state.method_26204() != newState.method_26204()) {
            class_2586 blockEntity = world.method_8321(pos);
            if (blockEntity instanceof BackpackEntity) {
                class_1264.method_5451((class_1937)world, (class_2338)pos, (class_1263)((BackpackEntity)blockEntity));
                world.method_8455(pos, (class_2248)this);
            }
            super.method_9536(state, world, pos, newState, moved);
        }
    }

    public class_1269 method_9534(class_2680 state, class_1937 world, class_2338 pos, class_1657 player, class_1268 hand, class_3965 hit) {
        class_3908 screenHandlerFactory;
        if (!world.field_9236 && (screenHandlerFactory = state.method_26196(world, pos)) != null) {
            player.method_17355(screenHandlerFactory);
        }
        return class_1269.field_5812;
    }

    @Nullable
    public class_2586 method_10123(class_2338 pos, class_2680 state) {
        return new BackpackEntity(pos, state);
    }
}

