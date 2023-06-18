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

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.mob.SculkmiteEntity;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SculkmiteRenderer
        extends GeoEntityRenderer<SculkmiteEntity> {
    public SculkmiteRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SculkmiteModel());
    }

    public SculkmiteRenderer(EntityRendererFactory.Context renderManager, GeoModel<SculkmiteEntity> model) {
        super(renderManager, model);
    }

    @Override
    public Identifier getTextureLocation(SculkmiteEntity instance) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/sculkmite/sculkmite.png");
    }

    @Override
    public RenderLayer getRenderType(SculkmiteEntity animatable, Identifier texture, VertexConsumerProvider bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
