package net.romeosnowblitz.hmh2.entity.passive.penguin;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class PenguinRenderer extends MobEntityRenderer<PenguinEntity, PenguinModel<PenguinEntity>> {
    public PenguinRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PenguinModel<>(ctx.getPart(PenguinModel.PENGUIN)), 0.6f);
    }

    @Override
    public Identifier getTexture(PenguinEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/penguin.png");
    }
}