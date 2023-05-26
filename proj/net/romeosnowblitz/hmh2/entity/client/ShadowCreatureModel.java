/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  software.bernie.geckolib.model.GeoModel
 */
package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.class_2960;
import net.romeosnowblitz.hmh2.entity.mob.ShadowCreatureEntity;
import software.bernie.geckolib.model.GeoModel;

public class ShadowCreatureModel
extends GeoModel<ShadowCreatureEntity> {
    public class_2960 getModelResource(ShadowCreatureEntity object) {
        return new class_2960("hmh2", "geo/shadow_creature.geo.json");
    }

    public class_2960 getTextureResource(ShadowCreatureEntity object) {
        return new class_2960("hmh2", "textures/entity/shadow_creature/shadow_creature.png");
    }

    public class_2960 getAnimationResource(ShadowCreatureEntity animatable) {
        return new class_2960("hmh2", "animations/shadow_creature.animation.json");
    }
}

