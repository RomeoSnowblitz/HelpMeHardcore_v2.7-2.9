package net.romeosnowblitz.hmh2.entity.mites.bloodmite;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class BloodmiteRenderer extends LivingEntityRenderer<BloodmiteEntity, BloodmiteModel<BloodmiteEntity>> {
    public BloodmiteRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BloodmiteModel<>(ctx.getPart(BloodmiteModel.BLOODMITE)), 0.6f);
    }

    @Override
    public Identifier getTexture(BloodmiteEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/bloodmite.png");
    }
}