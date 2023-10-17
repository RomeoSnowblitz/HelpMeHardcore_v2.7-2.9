package net.romeosnowblitz.hmh2.entity.mites.sculkmite;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class SculkmiteRenderer extends LivingEntityRenderer<SculkmiteEntity, SculkmiteModel<SculkmiteEntity>> {
    public SculkmiteRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SculkmiteModel<>(ctx.getPart(SculkmiteModel.SCULKMITE)), 0.6f);
    }

    @Override
    public Identifier getTexture(SculkmiteEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/sculkmite.png");
    }
}