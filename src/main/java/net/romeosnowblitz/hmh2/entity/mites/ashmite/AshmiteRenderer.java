package net.romeosnowblitz.hmh2.entity.mites.ashmite;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class AshmiteRenderer extends LivingEntityRenderer<AshmiteEntity, AshmiteModel<AshmiteEntity>> {
    public AshmiteRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new AshmiteModel<>(ctx.getPart(AshmiteModel.ASHMITE)), 0.6f);
    }

    @Override
    public Identifier getTexture(AshmiteEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/ashmite.png");
    }
}