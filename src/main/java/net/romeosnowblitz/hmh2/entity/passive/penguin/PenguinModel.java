package net.romeosnowblitz.hmh2.entity.passive.penguin;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.romeosnowblitz.hmh2.Hmh2;

public class PenguinModel<T extends PenguinEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer PENGUIN = new EntityModelLayer(new Identifier(Hmh2.MOD_ID, "penguin"), "main");
    private final ModelPart penguin;
    private final ModelPart head;

    public PenguinModel(ModelPart root) {
        this.penguin = root.getChild("penguin");
        this.head = penguin.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData penguin = modelPartData.addChild("penguin", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
        ModelPartData right_wing = penguin.addChild("right_wing", ModelPartBuilder.create().uv(0, 19).cuboid(-4.0F, -0.5F, -1.0F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.5F, 0.0F));
        ModelPartData left_wing = penguin.addChild("left_wing", ModelPartBuilder.create().uv(16, 16).cuboid(3.0F, -0.5F, -1.0F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.5F, 0.0F));
        ModelPartData head = penguin.addChild("head", ModelPartBuilder.create().uv(16, 8).cuboid(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 8).cuboid(-3.0F, -4.0F, -2.0F, 6.0F, 4.0F, 4.0F, new Dilation(0.0F))
                .uv(0, 16).cuboid(-3.0F, -5.0F, -1.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(16, 2).cuboid(-2.0F, -5.0F, -2.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(16, 0).cuboid(-2.0F, -5.0F, 1.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.0F, 0.0F));
        ModelPartData right_foot = penguin.addChild("right_foot", ModelPartBuilder.create().uv(0, 1).cuboid(-2.0F, 0.0F, -3.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        ModelPartData left_foot = penguin.addChild("left_foot", ModelPartBuilder.create().uv(0, 0).cuboid(1.0F, 0.0F, -3.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        ModelPartData body = penguin.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -4.0F, -2.0F, 6.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 32, 32);
    }
    @Override
    public void setAngles(PenguinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(entity, netHeadYaw, headPitch, ageInTicks);
        this.animateMovement(PenguinAnimations.PENGUIN_WALK, limbSwing, limbSwingAmount, 2f, 2f);
        this.updateAnimation(entity.idleAnimationState, PenguinAnimations.PENGUIN_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(PenguinEntity entity, float headYaw, float headPitch, float animationProgress){
        headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25.0f, 45.0f);
        this.head.yaw = headYaw * 0.017453292f;
        this.head.pitch = headPitch * 0.017453292f;
    }

    @Override
    public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        penguin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return penguin;
    }
}