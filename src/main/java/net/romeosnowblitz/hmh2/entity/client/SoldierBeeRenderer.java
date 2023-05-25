package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.mob.SoldierBeeEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class SoldierBeeRenderer extends GeoEntityRenderer<SoldierBeeEntity> {
    public SoldierBeeRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SoldierBeeModel());
    }

    @Override
    public Identifier getTextureLocation(SoldierBeeEntity instance) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/soldier_bee/soldier_bee.png");
    }

    @Override
    public RenderLayer getRenderType(SoldierBeeEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
