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
import net.romeosnowblitz.hmh2.entity.mob.MagmiteEntity;
import net.romeosnowblitz.hmh2.entity.mob.ShadowCreatureEntity;
import software.bernie.geckolib.model.GeoModel;

public class MagmiteModel
        extends GeoModel<MagmiteEntity> {

    @Override
    public Identifier getModelResource(MagmiteEntity object) {
        return new Identifier(Hmh2.MOD_ID, "geo/magmite.geo.json");
    }

    @Override
    public Identifier getTextureResource(MagmiteEntity object) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/magmite/magmite.png");
    }

    @Override
    public Identifier getAnimationResource(MagmiteEntity animatable) {
        return new Identifier(Hmh2.MOD_ID, "animations/magmite.animation.json");
    }

}


