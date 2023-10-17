package net.romeosnowblitz.hmh2.entity.mites.warpmite;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class WarpmiteRenderer extends LivingEntityRenderer<WarpmiteEntity, WarpmiteModel<WarpmiteEntity>> {
    public WarpmiteRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new WarpmiteModel<>(ctx.getPart(WarpmiteModel.WARPMITE)), 0.6f);
    }

    @Override
    public Identifier getTexture(WarpmiteEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/warpmite.png");
    }
}