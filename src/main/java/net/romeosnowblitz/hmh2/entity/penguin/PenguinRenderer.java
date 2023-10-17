package net.romeosnowblitz.hmh2.entity.penguin;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.queen_bee.QueenBeeEntity;
import net.romeosnowblitz.hmh2.entity.queen_bee.QueenBeeModel;

public class PenguinRenderer extends LivingEntityRenderer<PenguinEntity, PenguinModel<PenguinEntity>> {
    public PenguinRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PenguinModel<>(ctx.getPart(PenguinModel.PENGUIN)), 0.6f);
    }

    @Override
    public Identifier getTexture(PenguinEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/penguin.png");
    }
}