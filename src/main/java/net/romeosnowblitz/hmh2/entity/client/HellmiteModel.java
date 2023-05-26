/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  software.bernie.geckolib.model.GeoModel
 */
package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.class_2960;
import net.romeosnowblitz.hmh2.entity.mob.HellmiteEntity;
import software.bernie.geckolib.model.GeoModel;

public class HellmiteModel
extends GeoModel<HellmiteEntity> {
    public class_2960 getModelResource(HellmiteEntity object) {
        return new class_2960("hmh2", "geo/hellmite.geo.json");
    }

    public class_2960 getTextureResource(HellmiteEntity object) {
        return new class_2960("hmh2", "textures/entity/hellmite/hellmite.png");
    }

    public class_2960 getAnimationResource(HellmiteEntity animatable) {
        return new class_2960("hmh2", "animations/hellmite.animation.json");
    }
}

