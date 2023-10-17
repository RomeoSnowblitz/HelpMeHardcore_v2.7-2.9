package net.romeosnowblitz.hmh2.entity.mites.magmite;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class MagmiteRenderer extends LivingEntityRenderer<MagmiteEntity, MagmiteModel<MagmiteEntity>> {
    public MagmiteRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MagmiteModel<>(ctx.getPart(MagmiteModel.MAGMITE)), 0.6f);
    }

    @Override
    public Identifier getTexture(MagmiteEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/magmite.png");
    }
}