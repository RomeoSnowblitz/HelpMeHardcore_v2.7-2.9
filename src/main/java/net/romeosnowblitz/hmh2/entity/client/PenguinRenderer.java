package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.mob.PenguinEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class PenguinRenderer extends GeoEntityRenderer<PenguinEntity> {
    public PenguinRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PenguinModel());
    }

    @Override
    public Identifier getTextureLocation(PenguinEntity instance) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/penguin/penguin.png");
    }

    @Override
    public RenderLayer getRenderType(PenguinEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }


}
