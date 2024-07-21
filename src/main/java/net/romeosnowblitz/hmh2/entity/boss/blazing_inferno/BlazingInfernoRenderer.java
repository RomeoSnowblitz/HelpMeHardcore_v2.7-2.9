package net.romeosnowblitz.hmh2.entity.boss.blazing_inferno;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class BlazingInfernoRenderer extends MobEntityRenderer<BlazingInfernoEntity, BlazingInfernoModel<BlazingInfernoEntity>> {

    public BlazingInfernoRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BlazingInfernoModel<>(ctx.getPart(BlazingInfernoModel.BLAZING_INFERNO)), 0.6f);
    }

    @Override
    public Identifier getTexture(BlazingInfernoEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/blazing_inferno.png");
    }
}
