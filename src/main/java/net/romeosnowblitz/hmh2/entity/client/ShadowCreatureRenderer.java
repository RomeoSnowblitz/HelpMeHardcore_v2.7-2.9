package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.custom.ShadowCreatureEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ShadowCreatureRenderer extends GeoEntityRenderer<ShadowCreatureEntity> {
    public ShadowCreatureRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ShadowCreatureModel());
    }

    @Override
    public Identifier getTextureResource(ShadowCreatureEntity instance) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/shadow_creature/shadow_creature.png");
    }

    @Override
    public RenderLayer getRenderType(ShadowCreatureEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.5f, 0.5f, 0.5f);
        } else {
            stack.scale(1f, 1f, 1f);
        }

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder,
                packedLightIn, textureLocation);
    }
}
