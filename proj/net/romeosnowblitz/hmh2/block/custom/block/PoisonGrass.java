/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1267
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1922
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_2356
 *  net.minecraft.class_2394
 *  net.minecraft.class_2398
 *  net.minecraft.class_243
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_3726
 *  net.minecraft.class_4970$class_2251
 *  net.minecraft.class_5819
 */
package net.romeosnowblitz.hmh2.block.custom.block;

import net.minecraft.class_1267;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2356;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3726;
import net.minecraft.class_4970;
import net.minecraft.class_5819;

public class PoisonGrass
extends class_2356 {
    public PoisonGrass(class_1291 effect, class_4970.class_2251 settings) {
        super(effect, 8, settings);
    }

    public void method_9496(class_2680 state, class_1937 world, class_2338 pos, class_5819 random) {
        class_265 voxelShape = this.method_9530(state, (class_1922)world, pos, class_3726.method_16194());
        class_243 vec3d = voxelShape.method_1107().method_1005();
        double d = (double)pos.method_10263() + vec3d.field_1352;
        double e = (double)pos.method_10260() + vec3d.field_1350;
        for (int i = 0; i < 3; ++i) {
            if (!random.method_43056()) continue;
            world.method_8406((class_2394)class_2398.field_11251, d + random.method_43058() / 5.0, (double)pos.method_10264() + (0.5 - random.method_43058()), e + random.method_43058() / 5.0, 0.0, 0.0, 0.0);
        }
    }

    public void method_9548(class_2680 state, class_1937 world, class_2338 pos, class_1297 entity) {
        class_1309 livingEntity;
        if (world.field_9236 || world.method_8407() == class_1267.field_5801) {
            return;
        }
        if (entity instanceof class_1309 && !(livingEntity = (class_1309)entity).method_5679(world.method_48963().method_48832())) {
            livingEntity.method_6092(new class_1293(class_1294.field_5899, 40));
        }
    }
}

