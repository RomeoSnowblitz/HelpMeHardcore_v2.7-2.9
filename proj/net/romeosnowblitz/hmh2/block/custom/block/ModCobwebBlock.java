/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1937
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 *  net.minecraft.class_4970$class_2251
 */
package net.romeosnowblitz.hmh2.block.custom.block;

import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_4970;

public class ModCobwebBlock
extends class_2248 {
    public ModCobwebBlock(class_4970.class_2251 settings) {
        super(settings);
    }

    public void method_9548(class_2680 state, class_1937 world, class_2338 pos, class_1297 entity) {
        entity.method_5844(state, new class_243(0.25, (double)0.05f, 0.25));
    }
}

