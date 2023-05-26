/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  software.bernie.geckolib.model.GeoModel
 */
package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.class_2960;
import net.romeosnowblitz.hmh2.entity.mob.SoldierBeeEntity;
import software.bernie.geckolib.model.GeoModel;

public class SoldierBeeModel
extends GeoModel<SoldierBeeEntity> {
    public class_2960 getModelResource(SoldierBeeEntity object) {
        return new class_2960("hmh2", "geo/soldier_bee.geo.json");
    }

    public class_2960 getTextureResource(SoldierBeeEntity object) {
        return new class_2960("hmh2", "textures/entity/soldier_bee/soldier_bee.png");
    }

    public class_2960 getAnimationResource(SoldierBeeEntity animatable) {
        return new class_2960("hmh2", "animations/soldier_bee.animation.json");
    }
}

