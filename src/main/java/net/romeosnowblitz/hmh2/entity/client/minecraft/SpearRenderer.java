package net.romeosnowblitz.hmh2.entity.client.minecraft;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.romeosnowblitz.hmh2.entity.mob.minecraft.SpearEntity;

public class SpearRenderer extends EntityRenderer<SpearEntity> {
    public static final Identifier TEXTURE = new Identifier("textures/entity/spear.png");
    private final SpearModel model;

    public SpearRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new SpearModel(context.getPart(EntityModelLayers.TRIDENT));
    }

    public void render(SpearEntity spearEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(g, spearEntity.prevYaw, spearEntity.getYaw()) - 90.0F));
        matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.lerp(g, spearEntity.prevPitch, spearEntity.getPitch()) + 90.0F));
        VertexConsumer vertexConsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumerProvider, this.model.getLayer(this.getTexture(spearEntity)), false, spearEntity.isEnchanted());
        this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.pop();
        super.render(spearEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    public Identifier getTexture(SpearEntity spearEntity) {
        return TEXTURE;
    }
}
