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
import net.romeosnowblitz.hmh2.entity.mob.CalEntity;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;



public class CalRenderer
        extends GeoEntityRenderer<CalEntity> {
    public CalRenderer(EntityRendererFactory.Context ctx) {
            super(ctx, new CalModel());
        }

    public CalRenderer(EntityRendererFactory.Context renderManager, GeoModel<CalEntity> model) {
            super(renderManager, model);
        }

        @Override
        public Identifier getTextureLocation(CalEntity instance) {
            return new Identifier(Hmh2.MOD_ID, "textures/entity/cal/cal.png");
        }

        @Override
        public RenderLayer getRenderType(CalEntity animatable, Identifier texture, VertexConsumerProvider bufferSource, float partialTick) {
            return super.getRenderType(animatable, texture, bufferSource, partialTick);
        }
    }

