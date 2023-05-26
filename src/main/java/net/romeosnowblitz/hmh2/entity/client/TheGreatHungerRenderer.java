package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.mob.TheGreatHungerEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class TheGreatHungerRenderer extends GeoEntityRenderer<TheGreatHungerEntity> {
    public TheGreatHungerRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new TheGreatHungerModel());
    }

    @Override
    public Identifier getTextureLocation(TheGreatHungerEntity instance) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/the_great_hunger/the_great_hunger.png");
    }

    @Override
    public RenderLayer getRenderType(TheGreatHungerEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
