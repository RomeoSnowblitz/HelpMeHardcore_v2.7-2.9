package net.romeosnowblitz.hmh2.entity.demon;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.shadow_creature.ShadowCreatureEntity;
import net.romeosnowblitz.hmh2.entity.shadow_creature.ShadowCreatureModel;

public class DemonRenderer extends LivingEntityRenderer<DemonEntity, DemonModel<DemonEntity>> {

    public DemonRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new DemonModel<>(ctx.getPart(DemonModel.DEMON)), 0.6f);
    }

    @Override
    public Identifier getTexture(DemonEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/demon.png");
    }
}
