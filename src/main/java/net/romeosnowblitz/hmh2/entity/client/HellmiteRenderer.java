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

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.mob.HellmiteEntity;
import net.romeosnowblitz.hmh2.entity.mob.SculkmiteEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class HellmiteRenderer
        extends GeoEntityRenderer<HellmiteEntity> {
    public HellmiteRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new HellmiteModel());
    }

    public HellmiteRenderer(EntityRendererFactory.Context renderManager, GeoModel<HellmiteEntity> model) {
        super(renderManager, model);
    }

    @Override
    public Identifier getTextureLocation(HellmiteEntity instance) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/hellmite/hellmite.png");
    }

    @Override
    public RenderLayer getRenderType(HellmiteEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}

