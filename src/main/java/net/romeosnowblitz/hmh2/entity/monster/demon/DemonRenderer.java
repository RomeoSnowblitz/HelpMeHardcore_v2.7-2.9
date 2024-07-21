package net.romeosnowblitz.hmh2.entity.monster.demon;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class DemonRenderer extends MobEntityRenderer<DemonEntity, DemonModel<DemonEntity>> {

    public DemonRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new DemonModel<>(ctx.getPart(DemonModel.DEMON)), 0.6f);
    }

    @Override
    public Identifier getTexture(DemonEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/demon.png");
    }
}
