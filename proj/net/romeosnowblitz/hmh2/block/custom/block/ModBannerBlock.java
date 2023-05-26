/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  net.minecraft.class_1750
 *  net.minecraft.class_1922
 *  net.minecraft.class_1936
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2415
 *  net.minecraft.class_2470
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_2689$class_2690
 *  net.minecraft.class_2741
 *  net.minecraft.class_2758
 *  net.minecraft.class_2769
 *  net.minecraft.class_3532
 *  net.minecraft.class_3726
 *  net.minecraft.class_4538
 *  net.minecraft.class_4970$class_2251
 */
package net.romeosnowblitz.hmh2.block.custom.block;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.class_1750;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2415;
import net.minecraft.class_2470;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2741;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3532;
import net.minecraft.class_3726;
import net.minecraft.class_4538;
import net.minecraft.class_4970;
import net.romeosnowblitz.hmh2.block.custom.block.ModAbstractBannerBlock;
import net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor;

public class ModBannerBlock
extends ModAbstractBannerBlock {
    public static final class_2758 ROTATION = class_2741.field_12532;
    private static final Map<ModDyeColor, class_2248> COLORED_BANNERS = Maps.newHashMap();
    private static final class_265 SHAPE = class_2248.method_9541((double)4.0, (double)0.0, (double)4.0, (double)12.0, (double)16.0, (double)12.0);

    public ModBannerBlock(ModDyeColor dyeColor, class_4970.class_2251 settings) {
        super(dyeColor, settings);
        this.method_9590((class_2680)((class_2680)this.field_10647.method_11664()).method_11657((class_2769)ROTATION, (Comparable)Integer.valueOf(0)));
        COLORED_BANNERS.put(dyeColor, (class_2248)this);
    }

    public boolean method_9558(class_2680 state, class_4538 world, class_2338 pos) {
        return world.method_8320(pos.method_10074()).method_26207().method_15799();
    }

    public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        return SHAPE;
    }

    public class_2680 method_9605(class_1750 ctx) {
        return (class_2680)this.method_9564().method_11657((class_2769)ROTATION, (Comparable)Integer.valueOf(class_3532.method_15357((double)((double)((180.0f + ctx.method_8044()) * 16.0f / 360.0f) + 0.5)) & 0xF));
    }

    public class_2680 method_9559(class_2680 state, class_2350 direction, class_2680 neighborState, class_1936 world, class_2338 pos, class_2338 neighborPos) {
        if (direction == class_2350.field_11033 && !state.method_26184((class_4538)world, pos)) {
            return class_2246.field_10124.method_9564();
        }
        return super.method_9559(state, direction, neighborState, world, pos, neighborPos);
    }

    public class_2680 method_9598(class_2680 state, class_2470 rotation) {
        return (class_2680)state.method_11657((class_2769)ROTATION, (Comparable)Integer.valueOf(rotation.method_10502(((Integer)state.method_11654((class_2769)ROTATION)).intValue(), 16)));
    }

    public class_2680 method_9569(class_2680 state, class_2415 mirror) {
        return (class_2680)state.method_11657((class_2769)ROTATION, (Comparable)Integer.valueOf(mirror.method_10344(((Integer)state.method_11654((class_2769)ROTATION)).intValue(), 16)));
    }

    protected void method_9515(class_2689.class_2690<class_2248, class_2680> builder) {
        builder.method_11667(new class_2769[]{ROTATION});
    }

    public static class_2248 getForColor(ModDyeColor color) {
        return COLORED_BANNERS.getOrDefault((Object)color, class_2246.field_10154);
    }
}

