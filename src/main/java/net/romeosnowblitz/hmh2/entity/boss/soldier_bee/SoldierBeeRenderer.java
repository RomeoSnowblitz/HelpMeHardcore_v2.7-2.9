package net.romeosnowblitz.hmh2.entity.boss.soldier_bee;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class SoldierBeeRenderer extends MobEntityRenderer<SoldierBeeEntity, SoldierBeeModel<SoldierBeeEntity>> {
    public SoldierBeeRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SoldierBeeModel<>(ctx.getPart(SoldierBeeModel.SOLDIER_BEE)), 0.6f);
    }

    @Override
    public Identifier getTexture(SoldierBeeEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/soldier_bee.png");
    }
}