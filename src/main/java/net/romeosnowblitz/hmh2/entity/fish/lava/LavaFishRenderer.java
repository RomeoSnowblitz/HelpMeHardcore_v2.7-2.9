package net.romeosnowblitz.hmh2.entity.fish.lava;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class LavaFishRenderer extends MobEntityRenderer<LavaFishEntity, LavaFishModel<LavaFishEntity>> {

    public LavaFishRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new LavaFishModel<>(ctx.getPart(LavaFishModel.LAVA_FISH)), 0.6f);
    }

    @Override
    public Identifier getTexture(LavaFishEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/wisp.png");
    }
}
