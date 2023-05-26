/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  net.minecraft.class_1750
 *  net.minecraft.class_1922
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2383
 *  net.minecraft.class_2415
 *  net.minecraft.class_2470
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2753
 *  net.minecraft.class_2769
 *  net.minecraft.class_3726
 *  net.minecraft.class_4538
 *  net.minecraft.class_4970$class_2251
 */
package net.romeosnowblitz.hmh2.block.custom.block;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2383;
import net.minecraft.class_2415;
import net.minecraft.class_2470;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2753;
import net.minecraft.class_2769;
import net.minecraft.class_3726;
import net.minecraft.class_4538;
import net.minecraft.class_4970;
import net.romeosnowblitz.hmh2.block.custom.block.ModAbstractBannerBlock;
import net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor;

public class ModWallBannerBlock
extends ModAbstractBannerBlock {
    public static final class_2753 FACING = class_2383.field_11177;
    private static final Map<class_2350, class_265> FACING_TO_SHAPE = Maps.newEnumMap((Map)ImmutableMap.of((Object)class_2350.field_11043, (Object)class_2248.method_9541((double)0.0, (double)0.0, (double)14.0, (double)16.0, (double)12.5, (double)16.0), (Object)class_2350.field_11035, (Object)class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)12.5, (double)2.0), (Object)class_2350.field_11039, (Object)class_2248.method_9541((double)14.0, (double)0.0, (double)0.0, (double)16.0, (double)12.5, (double)16.0), (Object)class_2350.field_11034, (Object)class_2248.method_9541((double)0.0, (double)0.0, (double)0.0, (double)2.0, (double)12.5, (double)16.0)));

    public ModWallBannerBlock(ModDyeColor dyeColor, class_4970.class_2251 settings) {
        super(dyeColor, settings);
        this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)FACING, (Comparable)class_2350.field_11043));
    }

    public String method_9539() {
        return this.method_8389().method_7876();
    }

    public boolean method_9558(class_2680 state, class_4538 world, class_2338 pos) {
        return world.method_8320(pos.method_10093(((class_2350)state.method_11654((class_2769)FACING)).method_10153())).method_26207().method_15799();
    }

    public class_2680 method_9559(class_2680 state, class_2350 direction, class_2680 neighborState, class_1936 world, class_2338 pos, class_2338 neighborPos) {
        if (direction == ((class_2350)state.method_11654((class_2769)FACING)).method_10153() && !state.method_26184((class_4538)world, pos)) {
            return class_2246.field_10124.method_9564();
        }
        return super.method_9559(state, direction, neighborState, world, pos, neighborPos);
    }

    public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        return FACING_TO_SHAPE.get(state.method_11654((class_2769)FACING));
    }

    public class_2680 method_9605(class_1750 ctx) {
        class_2350[] directions;
        class_2680 blockState = this.method_9564();
        class_1937 worldView = ctx.method_8045();
        class_2338 blockPos = ctx.method_8037();
        for (class_2350 direction : directions = ctx.method_7718()) {
            class_2350 direction2;
            if (!direction.method_10166().method_10179() || !(blockState = (class_2680)blockState.method_11657((class_2769)FACING, (Comparable)(direction2 = direction.method_10153()))).method_26184((class_4538)worldView, blockPos)) continue;
            return blockState;
        }
        return null;
    }

    public class_2680 method_9598(class_2680 state, class_2470 rotation) {
        return (class_2680)state.method_11657((class_2769)FACING, (Comparable)rotation.method_10503((class_2350)state.method_11654((class_2769)FACING)));
    }

    public class_2680 method_9569(class_2680 state, class_2415 mirror) {
        return state.method_26186(mirror.method_10345((class_2350)state.method_11654((class_2769)FACING)));
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{FACING});
    }
}

