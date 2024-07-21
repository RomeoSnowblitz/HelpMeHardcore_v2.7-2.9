package net.romeosnowblitz.hmh2.entity.boss.kraken;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.boss.blazing_inferno.BlazingInfernoEntity;
import net.romeosnowblitz.hmh2.entity.boss.blazing_inferno.BlazingInfernoModel;

public class KrakenRenderer extends MobEntityRenderer<KrakenEntity, KrakenModel<KrakenEntity>> {

    public KrakenRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new KrakenModel<>(ctx.getPart(KrakenModel.KRAKEN)), 0.6f);
    }

    @Override
    public Identifier getTexture(KrakenEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/kraken.png");
    }
}
