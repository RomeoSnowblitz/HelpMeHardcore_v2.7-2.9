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
import net.romeosnowblitz.hmh2.entity.mob.CalEntity;
import software.bernie.geckolib.model.GeoModel;

public class CalModel
        extends GeoModel<CalEntity> {

    @Override
    public Identifier getModelResource(CalEntity object) {
        return new Identifier(Hmh2.MOD_ID, "geo/cal.geo.json");
    }

    @Override
    public Identifier getTextureResource(CalEntity object) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/cal/cal.png");
    }

    @Override
    public Identifier getAnimationResource(CalEntity animatable) {
        return new Identifier(Hmh2.MOD_ID, "animations/cal.animation.json");
    }

}


