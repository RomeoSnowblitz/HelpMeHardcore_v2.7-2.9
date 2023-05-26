/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1922
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350$class_2351
 *  net.minecraft.class_238
 *  net.minecraft.class_247
 *  net.minecraft.class_259
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_4970$class_2251
 */
package net.romeosnowblitz.hmh2.block.custom.test;

import java.util.List;
import java.util.Random;
import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_247;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_4970;

public class RandomBlock
extends class_2248 {
    static Random random = new Random();
    static class_2248 y = RandomBlock.randomBlocks();

    public RandomBlock(class_4970.class_2251 settings) {
        super(settings);
    }

    public static class_2248 randomBlocks() {
        int i = random.nextInt(9);
        if (i == 1) {
            y = class_2246.field_10085;
        }
        if (i == 2) {
            y = class_2246.field_10441;
        }
        if (i == 3) {
            y = class_2246.field_27159;
        }
        if (i == 4) {
            y = class_2246.field_10166;
        }
        if (i == 5) {
            y = class_2246.field_10540;
        }
        if (i == 6) {
            y = class_2246.field_10201;
        }
        if (i == 7) {
            y = class_2246.field_10234;
        }
        if (i == 8) {
            y = class_2246.field_10205;
        }
        return y;
    }

    public void method_9591(class_1937 world, class_2338 pos, class_2680 state, class_1297 entity) {
        if (!world.field_9236) {
            RandomBlock.randomBlocks();
            RandomBlock.setToRandom(state, world, pos);
        }
    }

    public static void setToRandom(class_2680 state, class_1937 world, class_2338 pos) {
        world.method_8501(pos, RandomBlock.pushEntitiesUpBeforeBlockChange(state, y.method_9564(), (class_1936)world, pos));
    }

    public static class_2680 pushEntitiesUpBeforeBlockChange(class_2680 from, class_2680 to, class_1936 world, class_2338 pos) {
        class_265 voxelShape = class_259.method_1082((class_265)from.method_26220((class_1922)world, pos), (class_265)to.method_26220((class_1922)world, pos), (class_247)class_247.field_16893).method_1096((double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
        if (voxelShape.method_1110()) {
            return to;
        }
        List list = world.method_8335((class_1297)null, voxelShape.method_1107());
        for (class_1297 entity : list) {
            double d = class_259.method_1085((class_2350.class_2351)class_2350.class_2351.field_11052, (class_238)entity.method_5829().method_989(0.0, 1.0, 0.0), List.of(voxelShape), (double)-1.0);
            entity.method_45166(0.0, 1.0 + d, 0.0);
        }
        return to;
    }
}

