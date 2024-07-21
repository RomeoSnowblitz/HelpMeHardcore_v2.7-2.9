package net.romeosnowblitz.hmh2.entity.passive.cal;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class CalRenderer extends MobEntityRenderer<CalEntity, CalModel<CalEntity>> {
    public CalRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new CalModel<>(ctx.getPart(CalModel.CAL)), 0.6f);
    }

    @Override
    public Identifier getTexture(CalEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/cal.png");
    }
}