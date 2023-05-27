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
import net.romeosnowblitz.hmh2.entity.mob.HellmiteEntity;
import net.romeosnowblitz.hmh2.entity.mob.MagmiteEntity;
import net.romeosnowblitz.hmh2.entity.mob.ShadowCreatureEntity;
import software.bernie.geckolib.model.GeoModel;

public class HellmiteModel
        extends GeoModel<HellmiteEntity> {

    @Override
    public Identifier getModelResource(HellmiteEntity object) {
        return new Identifier(Hmh2.MOD_ID, "geo/hellmite.geo.json");
    }

    @Override
    public Identifier getTextureResource(HellmiteEntity object) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/hellmite/hellmite.png");
    }

    @Override
    public Identifier getAnimationResource(HellmiteEntity animatable) {
        return new Identifier(Hmh2.MOD_ID, "animations/hellmite.animation.json");
    }

}

