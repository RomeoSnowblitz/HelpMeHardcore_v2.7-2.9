/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  software.bernie.geckolib.model.GeoModel
 */
package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.class_2960;
import net.romeosnowblitz.hmh2.entity.mob.QueenBeeEntity;
import software.bernie.geckolib.model.GeoModel;

public class QueenBeeModel
extends GeoModel<QueenBeeEntity> {
    public class_2960 getModelResource(QueenBeeEntity object) {
        return new class_2960("hmh2", "geo/queen_bee.geo.json");
    }

    public class_2960 getTextureResource(QueenBeeEntity object) {
        return new class_2960("hmh2", "textures/entity/queen_bee/queen_bee.png");
    }

    public class_2960 getAnimationResource(QueenBeeEntity animatable) {
        return new class_2960("hmh2", "animations/queen_bee.animation.json");
    }
}

