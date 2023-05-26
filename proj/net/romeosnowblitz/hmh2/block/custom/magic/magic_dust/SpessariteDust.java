/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1267
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
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
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_4970;
import net.minecraft.class_5778;
import net.minecraft.class_7118;

public class SpessariteDust
extends class_5778 {
    public SpessariteDust(class_4970.class_2251 settings) {
        super(settings);
    }

    public class_7118 method_41432() {
        return null;
    }

    public void method_9548(class_2680 state, class_1937 world, class_2338 pos, class_1297 entity) {
        class_1309 livingEntity;
        if (world.field_9236 || world.method_8407() == class_1267.field_5801) {
            return;
        }
        if (entity instanceof class_1309 && !(livingEntity = (class_1309)entity).method_5679(world.method_48963().method_48832())) {
            livingEntity.method_6092(new class_1293(class_1294.field_5915, 60));
        }
    }
}

