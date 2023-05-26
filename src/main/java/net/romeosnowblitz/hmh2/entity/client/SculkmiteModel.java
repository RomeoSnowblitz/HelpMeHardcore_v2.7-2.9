/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  software.bernie.geckolib.model.GeoModel
 */
package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.class_2960;
import net.romeosnowblitz.hmh2.entity.mob.SculkmiteEntity;
import software.bernie.geckolib.model.GeoModel;

public class SculkmiteModel
extends GeoModel<SculkmiteEntity> {
    public class_2960 getModelResource(SculkmiteEntity object) {
        return new class_2960("hmh2", "geo/magmite.geo.json");
    }

    public class_2960 getTextureResource(SculkmiteEntity object) {
        return new class_2960("hmh2", "textures/entity/sculkmite/sculkmite.png");
    }

    public class_2960 getAnimationResource(SculkmiteEntity animatable) {
        return new class_2960("hmh2", "animations/sculkmite.animation.json");
    }
}

