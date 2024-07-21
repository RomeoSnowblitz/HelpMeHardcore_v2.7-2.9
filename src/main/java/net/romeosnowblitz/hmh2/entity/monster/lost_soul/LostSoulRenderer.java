package net.romeosnowblitz.hmh2.entity.monster.lost_soul;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import org.jetbrains.annotations.Nullable;

public class LostSoulRenderer extends MobEntityRenderer<LostSoulEntity, LostSoulModel<LostSoulEntity>> {
    public LostSoulRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new LostSoulModel<>(ctx.getPart(LostSoulModel.LOST_SOUL)), 0.6f);
    }

    /*
    @Override
    public void render(LostSoulEntity mobEntity, float yaw, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light) {
        if (mobEntity != null && mobEntity.getWorld() != null) {
            this.model.getPart().getChild("head").visible = false;
        }
        super.render(mobEntity, yaw, tickDelta, matrixStack, vertexConsumerProvider, light);
    }
     */

    @Nullable
    @Override
    protected RenderLayer getRenderLayer(LostSoulEntity entity, boolean showBody, boolean translucent, boolean showOutline) {
        return super.getRenderLayer(entity, showBody, true, showOutline);
    }

    @Override
    public Identifier getTexture(LostSoulEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/lost_soul.png");
    }

}