/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1667
 *  net.minecraft.class_1676
 *  net.minecraft.class_1927
 *  net.minecraft.class_1937
 *  net.minecraft.class_1937$class_7867
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_3965
 *  net.minecraft.class_4970$class_2251
 */
package net.romeosnowblitz.hmh2.block.custom.block;

import net.minecraft.class_1297;
import net.minecraft.class_1667;
import net.minecraft.class_1676;
import net.minecraft.class_1927;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3965;
import net.minecraft.class_4970;

public class EnderCrystalBlock
extends class_2248 {
    public EnderCrystalBlock(class_4970.class_2251 settings) {
        super(settings);
    }

    public void method_19286(class_1937 world, class_2680 state, class_3965 hit, class_1676 projectile) {
        super.method_19286(world, state, hit, projectile);
        if (projectile instanceof class_1667) {
            world.method_8437((class_1297)projectile, hit.method_17784().method_10216(), hit.method_17784().method_10214(), hit.method_17784().method_10215(), 9.0f, class_1937.class_7867.field_40891);
        }
    }

    public void method_9586(class_1937 world, class_2338 pos, class_1927 explosion) {
        super.method_9586(world, pos, explosion);
        world.method_8437(explosion.method_46406(), (double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), 9.0f, class_1937.class_7867.field_40891);
    }
}

