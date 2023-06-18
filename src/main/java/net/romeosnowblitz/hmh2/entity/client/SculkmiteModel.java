/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  software.bernie.geckolib.model.GeoModel
 */
package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.mob.SculkmiteEntity;
import software.bernie.geckolib.model.GeoModel;

public class SculkmiteModel
        extends GeoModel<SculkmiteEntity> {

    @Override
    public Identifier getModelResource(SculkmiteEntity object) {
        return new Identifier(Hmh2.MOD_ID, "geo/sculkmite.geo.json");
    }

    @Override
    public Identifier getTextureResource(SculkmiteEntity object) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/sculkmite/sculkmite.png");
    }

    @Override
    public Identifier getAnimationResource(SculkmiteEntity animatable) {
        return new Identifier(Hmh2.MOD_ID, "animations/sculkmite.animation.json");
    }

}

