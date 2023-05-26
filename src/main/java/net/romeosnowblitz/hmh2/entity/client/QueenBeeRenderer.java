package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.mob.QueenBeeEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class QueenBeeRenderer extends GeoEntityRenderer<QueenBeeEntity> {
    public QueenBeeRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new QueenBeeModel());
    }


    @Override
    public Identifier getTextureLocation(QueenBeeEntity instance) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/queen_bee/queen_bee.png");
    }

    @Override
    public RenderLayer getRenderType(QueenBeeEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
