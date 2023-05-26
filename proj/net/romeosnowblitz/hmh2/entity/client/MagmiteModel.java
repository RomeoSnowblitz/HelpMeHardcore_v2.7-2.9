/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  software.bernie.geckolib.model.GeoModel
 */
package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.class_2960;
import net.romeosnowblitz.hmh2.entity.mob.MagmiteEntity;
import software.bernie.geckolib.model.GeoModel;

public class MagmiteModel
extends GeoModel<MagmiteEntity> {
    public class_2960 getModelResource(MagmiteEntity object) {
        return new class_2960("hmh2", "geo/magmite.geo.json");
    }

    public class_2960 getTextureResource(MagmiteEntity object) {
        return new class_2960("hmh2", "textures/entity/magmite/magmite.png");
    }

    public class_2960 getAnimationResource(MagmiteEntity animatable) {
        return new class_2960("hmh2", "animations/magmite.animation.json");
    }
}

