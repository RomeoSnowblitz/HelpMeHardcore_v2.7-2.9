package net.romeosnowblitz.hmh2.entity.mites.hellmite;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class HellmiteRenderer extends MobEntityRenderer<HellmiteEntity, HellmiteModel<HellmiteEntity>> {
    public HellmiteRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new HellmiteModel<>(ctx.getPart(HellmiteModel.HELLMITE)), 0.6f);
    }

    @Override
    public Identifier getTexture(HellmiteEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/hellmite.png");
    }
}