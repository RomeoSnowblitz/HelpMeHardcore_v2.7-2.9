package net.romeosnowblitz.hmh2.entity.projectile;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModProjectileRenderer extends EntityRenderer<ModProjectileEntity> {
    public static final Identifier TEXTURE = new Identifier(Hmh2.MOD_ID, "textures/entity/mod_projectile.png");
    protected ModProjectileModel model;

    public ModProjectileRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        model = new ModProjectileModel(ctx.getPart(ModProjectileModel.MOD_PROJECTILE));
    }

    @Override
    public void render(ModProjectileEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(tickDelta, entity.prevYaw, entity.getYaw()) - 90.0F));
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.lerp(tickDelta, entity.prevPitch, entity.getPitch()) + 90.0F));
        VertexConsumer vertexconsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers, this.model.getLayer(TEXTURE), false, true);
        this.model.render(matrices, vertexconsumer, light, OverlayTexture.DEFAULT_UV, 1.0F, 0.0F, 1.0F, 1.0F);
        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(ModProjectileEntity entity) {
        return TEXTURE;
    }
}
