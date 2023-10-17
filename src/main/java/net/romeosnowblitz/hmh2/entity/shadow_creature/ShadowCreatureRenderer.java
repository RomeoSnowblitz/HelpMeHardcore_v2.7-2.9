package net.romeosnowblitz.hmh2.entity.shadow_creature;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class ShadowCreatureRenderer extends LivingEntityRenderer<ShadowCreatureEntity, ShadowCreatureModel<ShadowCreatureEntity>> {

    public ShadowCreatureRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ShadowCreatureModel<>(ctx.getPart(ShadowCreatureModel.SHADOW_CREATURE)), 0.6f);
    }

    @Override
    public Identifier getTexture(ShadowCreatureEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/shadow_creature.png");
    }
}
