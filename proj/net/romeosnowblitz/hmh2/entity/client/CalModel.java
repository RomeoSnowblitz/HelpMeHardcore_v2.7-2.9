/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  software.bernie.geckolib.model.GeoModel
 */
package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.class_2960;
import net.romeosnowblitz.hmh2.entity.mob.CalEntity;
import software.bernie.geckolib.model.GeoModel;

public class CalModel
extends GeoModel<CalEntity> {
    public class_2960 getModelResource(CalEntity object) {
        return new class_2960("hmh2", "geo/cal.geo.json");
    }

    public class_2960 getTextureResource(CalEntity object) {
        return new class_2960("hmh2", "textures/entity/cal/cal.png");
    }

    public class_2960 getAnimationResource(CalEntity animatable) {
        return new class_2960("hmh2", "animations/cal.animation.json");
    }
}

