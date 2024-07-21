package net.romeosnowblitz.hmh2.entity.fish.water;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class PiranhaRenderer extends MobEntityRenderer<PiranhaEntity, PiranhaModel<PiranhaEntity>> {

    public PiranhaRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PiranhaModel<>(ctx.getPart(PiranhaModel.PIRANHA)), 0.6f);
    }

    @Override
    public Identifier getTexture(PiranhaEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/piranha.png");
    }
}
