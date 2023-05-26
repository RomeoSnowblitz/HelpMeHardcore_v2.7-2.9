/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1291
 *  net.minecraft.class_1309
 *  net.minecraft.class_4081
 */
package net.romeosnowblitz.hmh2.effect;

import net.minecraft.class_1291;
import net.minecraft.class_1309;
import net.minecraft.class_4081;
import net.romeosnowblitz.hmh2.effect.CustomEffects;

public class AnchoredEffect
extends class_1291 {
    public AnchoredEffect(class_4081 statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void method_5572(class_1309 entity, int amplifier) {
        if (this == CustomEffects.ANCHORED && entity.method_5816()) {
            entity.method_18800(0.0, -0.1, 0.0);
        }
        if (this == CustomEffects.ANCHORED && !entity.method_5816()) {
            entity.method_18800(0.0, -2.0, 0.0);
        }
    }

    public boolean method_5552(int duration, int amplifier) {
        return this == CustomEffects.ANCHORED;
    }
}

