/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  software.bernie.geckolib.model.GeoModel
 */
package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.class_2960;
import net.romeosnowblitz.hmh2.entity.mob.TheGreatHungerEntity;
import software.bernie.geckolib.model.GeoModel;

public class TheGreatHungerModel
extends GeoModel<TheGreatHungerEntity> {
    public class_2960 getModelResource(TheGreatHungerEntity object) {
        return new class_2960("hmh2", "geo/the_great_hunger.geo.json");
    }

    public class_2960 getTextureResource(TheGreatHungerEntity object) {
        return new class_2960("hmh2", "textures/entity/the_great_hunger/the_great_hunger.png");
    }

    public class_2960 getAnimationResource(TheGreatHungerEntity animatable) {
        return new class_2960("hmh2", "animations/the_great_hunger.animation.json");
    }
}

