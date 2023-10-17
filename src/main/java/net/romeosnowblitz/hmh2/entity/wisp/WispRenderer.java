package net.romeosnowblitz.hmh2.entity.wisp;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class WispRenderer extends LivingEntityRenderer<WispEntity, WispModel<WispEntity>> {

    public WispRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new WispModel<>(ctx.getPart(WispModel.WISP)), 0.6f);
    }

    @Override
    public Identifier getTexture(WispEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/wisp.png");
    }
}
