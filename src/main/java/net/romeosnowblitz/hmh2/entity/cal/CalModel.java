package net.romeosnowblitz.hmh2.entity.cal;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.romeosnowblitz.hmh2.Hmh2;

public class CalModel<T extends CalEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer CAL = new EntityModelLayer(new Identifier(Hmh2.MOD_ID, "cal"), "main");
    private final ModelPart cal;
    private final ModelPart head;

    public CalModel(ModelPart root) {
        this.cal = root.getChild("cal");
        this.head = cal.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData cal = modelPartData.addChild("cal", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData head = cal.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

        ModelPartData body = cal.addChild("body", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

        ModelPartData left_arm = cal.addChild("left_arm", ModelPartBuilder.create().uv(16, 32).cuboid(9.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -22.0F, 0.0F));

        ModelPartData right_arm = cal.addChild("right_arm", ModelPartBuilder.create().uv(32, 0).cuboid(-13.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, -22.0F, 0.0F));

        ModelPartData left_leg = cal.addChild("left_leg", ModelPartBuilder.create().uv(0, 32).cuboid(2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -12.0F, 0.0F));

        ModelPartData right_leg = cal.addChild("right_leg", ModelPartBuilder.create().uv(24, 16).cuboid(-6.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -12.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(CalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(entity, netHeadYaw, headPitch, ageInTicks);
        this.animateMovement(CalAnimations.CAL_WALK, limbSwing, limbSwingAmount, 2f, 2f);
        this.updateAnimation(entity.idleAnimationState, CalAnimations.CAL_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(CalEntity entity, float headYaw, float headPitch, float animationProgress){
        headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25.0f, 45.0f);
        this.head.yaw = headYaw * 0.017453292f;
        this.head.pitch = headPitch * 0.017453292f;
    }

    @Override
    public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        cal.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return cal;
    }
}