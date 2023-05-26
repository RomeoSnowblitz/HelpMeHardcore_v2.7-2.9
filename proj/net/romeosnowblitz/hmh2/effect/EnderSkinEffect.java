/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1291
 *  net.minecraft.class_1309
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3532
 *  net.minecraft.class_4019
 *  net.minecraft.class_4081
 */
package net.romeosnowblitz.hmh2.effect;

import net.minecraft.class_1291;
import net.minecraft.class_1309;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3532;
import net.minecraft.class_4019;
import net.minecraft.class_4081;
import net.romeosnowblitz.hmh2.effect.CustomEffects;

public class EnderSkinEffect
extends class_1291 {
    public EnderSkinEffect(class_4081 statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void method_5572(class_1309 entity, int amplifier) {
        if (this == CustomEffects.ENDER_SKIN && entity.method_5637()) {
            entity.method_5643(entity.method_48923().method_48824(), 1.0f);
        }
        if (this == CustomEffects.ENDER_SKIN && entity.method_5715()) {
            for (int i = 0; i < 128; ++i) {
                double g = entity.method_23317() + (entity.method_6051().method_43058() - 0.5) * 40.0;
                double h = class_3532.method_15350((double)(entity.method_23318() + (double)(entity.method_6051().method_43048(10) - 8)), (double)entity.method_23318(), (double)entity.method_23318());
                double j = entity.method_23321() + (entity.method_6051().method_43058() - 0.5) * 40.0;
                if (entity.method_5765()) {
                    entity.method_5848();
                }
                if (!entity.method_6082(g, h, j, true)) continue;
                class_3414 soundEvent = entity instanceof class_4019 ? class_3417.field_24630 : class_3417.field_14890;
                entity.method_5783(soundEvent, 1.0f, 1.0f);
                break;
            }
        }
    }

    public boolean method_5552(int duration, int amplifier) {
        if (this == CustomEffects.ENDER_SKIN) {
            int i = 10 >> amplifier;
            if (i > 0) {
                return duration % i == 0;
            }
            return true;
        }
        return false;
    }
}

