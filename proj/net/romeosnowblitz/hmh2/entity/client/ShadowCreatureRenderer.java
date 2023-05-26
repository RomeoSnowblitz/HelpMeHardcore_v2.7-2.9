/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.class_1921
 *  net.minecraft.class_2960
 *  net.minecraft.class_4597
 *  net.minecraft.class_5617$class_5618
 *  software.bernie.geckolib.core.animatable.GeoAnimatable
 *  software.bernie.geckolib.model.GeoModel
 *  software.bernie.geckolib.renderer.GeoEntityRenderer
 */
package net.romeosnowblitz.hmh2.entity.client;

import javax.annotation.Nullable;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_4597;
import net.minecraft.class_5617;
import net.romeosnowblitz.hmh2.entity.client.ShadowCreatureModel;
import net.romeosnowblitz.hmh2.entity.mob.ShadowCreatureEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ShadowCreatureRenderer
extends GeoEntityRenderer<ShadowCreatureEntity> {
    public ShadowCreatureRenderer(class_5617.class_5618 ctx) {
        super(ctx, (GeoModel)new ShadowCreatureModel());
    }

    public class_2960 getTextureLocation(ShadowCreatureEntity instance) {
        return new class_2960("hmh2", "textures/entity/shadow_creature/shadow_creature.png");
    }

    public class_1921 getRenderType(ShadowCreatureEntity animatable, class_2960 texture, @Nullable class_4597 bufferSource, float partialTick) {
        return super.getRenderType((GeoAnimatable)animatable, texture, bufferSource, partialTick);
    }
}

