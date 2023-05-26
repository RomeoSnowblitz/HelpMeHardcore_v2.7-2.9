/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  software.bernie.geckolib.model.GeoModel
 */
package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.class_2960;
import net.romeosnowblitz.hmh2.entity.mob.PenguinEntity;
import software.bernie.geckolib.model.GeoModel;

public class PenguinModel
extends GeoModel<PenguinEntity> {
    public class_2960 getModelResource(PenguinEntity object) {
        return new class_2960("hmh2", "geo/penguin.geo.json");
    }

    public class_2960 getTextureResource(PenguinEntity object) {
        return new class_2960("hmh2", "textures/entity/penguin/penguin.png");
    }

    public class_2960 getAnimationResource(PenguinEntity animatable) {
        return new class_2960("hmh2", "animations/penguin.animation.json");
    }
}

