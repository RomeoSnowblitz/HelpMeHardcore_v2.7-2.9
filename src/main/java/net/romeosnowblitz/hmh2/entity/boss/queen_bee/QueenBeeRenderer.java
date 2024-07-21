package net.romeosnowblitz.hmh2.entity.boss.queen_bee;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class QueenBeeRenderer extends MobEntityRenderer<QueenBeeEntity, QueenBeeModel<QueenBeeEntity>> {
    public QueenBeeRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new QueenBeeModel<>(ctx.getPart(QueenBeeModel.QUEEN_BEE)), 0.6f);
    }

    @Override
    public Identifier getTexture(QueenBeeEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/queen_bee.png");
    }
}