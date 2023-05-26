/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1309
 *  net.minecraft.class_4081
 */
package net.romeosnowblitz.hmh2.effect;

import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_4081;
import net.romeosnowblitz.hmh2.effect.CustomEffects;

public class NormieEffect
extends class_1291 {
    public NormieEffect(class_4081 statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void method_5572(class_1309 entity, int amplifier) {
        if (this == CustomEffects.NORMIE) {
            entity.method_6092(new class_1293(CustomEffects.NORMIE, 1200));
        }
        if (this.hasAnyEffect(entity)) {
            entity.method_6016(CustomEffects.NORMIE);
        }
    }

    public boolean method_5552(int duration, int amplifier) {
        return this == CustomEffects.NORMIE;
    }

    public boolean hasAnyEffect(class_1309 entity) {
        return entity.method_6059(class_1294.field_5898) || entity.method_6059(class_1294.field_16595) || entity.method_6059(class_1294.field_5908) || entity.method_6059(class_1294.field_5919) || entity.method_6059(class_1294.field_5927) || entity.method_6059(class_1294.field_38092) || entity.method_6059(class_1294.field_5900) || entity.method_6059(class_1294.field_5918) || entity.method_6059(class_1294.field_5912) || entity.method_6059(class_1294.field_5917) || entity.method_6059(class_1294.field_5914) || entity.method_6059(class_1294.field_5903) || entity.method_6059(class_1294.field_5921) || entity.method_6059(class_1294.field_5915) || entity.method_6059(class_1294.field_5905) || entity.method_6059(class_1294.field_5913) || entity.method_6059(class_1294.field_5902) || entity.method_6059(class_1294.field_5926) || entity.method_6059(class_1294.field_5901) || entity.method_6059(class_1294.field_5916) || entity.method_6059(class_1294.field_5925) || entity.method_6059(class_1294.field_5899) || entity.method_6059(class_1294.field_5924) || entity.method_6059(class_1294.field_5907) || entity.method_6059(class_1294.field_5922) || entity.method_6059(class_1294.field_5906) || entity.method_6059(class_1294.field_5909) || entity.method_6059(class_1294.field_5904) || entity.method_6059(class_1294.field_5910) || entity.method_6059(class_1294.field_18980) || entity.method_6059(class_1294.field_5923) || entity.method_6059(class_1294.field_5911) || entity.method_6059(CustomEffects.ANCHORED) || entity.method_6059(CustomEffects.CONDUIT_FAILURE) || entity.method_6059(CustomEffects.DOLPHINS_CURSE) || entity.method_6059(CustomEffects.ENDER_SKIN) || entity.method_6059(CustomEffects.HEALTH_SHRINKAGE) || entity.method_6059(CustomEffects.INSUSCEPTIBILITY) || entity.method_6059(CustomEffects.KINDLING) || entity.method_6059(CustomEffects.LUNAR_WOLF_PERCEPTION) || entity.method_6059(CustomEffects.POISON_IMMUNITY) || entity.method_6059(CustomEffects.SIGHTLESSSNESS);
    }
}

