package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.mob.ShadowCreatureEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class ShadowCreatureRenderer extends GeoEntityRenderer<ShadowCreatureEntity> {
    public ShadowCreatureRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ShadowCreatureModel());
    }

    @Override
    public Identifier getTextureLocation(ShadowCreatureEntity instance) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/shadow_creature/shadow_creature.png");
    }

    @Override
    public RenderLayer getRenderType(ShadowCreatureEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
