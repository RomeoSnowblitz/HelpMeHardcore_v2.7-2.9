package net.romeosnowblitz.hmh2.entity.soldier_bee;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.romeosnowblitz.hmh2.Hmh2;

public class SoldierBeeModel<T extends SoldierBeeEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer SOLDIER_BEE = new EntityModelLayer(new Identifier(Hmh2.MOD_ID, "soldier_bee"), "main");
    private final ModelPart soldier_bee;
    private final ModelPart head;

    public SoldierBeeModel(ModelPart root) {
        this.soldier_bee = root.getChild("soldier_bee");
        this.head = soldier_bee.getChild("head");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData soldier_bee = modelPartData.addChild("soldier_bee", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData head = soldier_bee.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -5.0F, 0.0F));

        ModelPartData left_wing = soldier_bee.addChild("left_wing", ModelPartBuilder.create().uv(18, 0).cuboid(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, -9.0F, -3.0F));

        ModelPartData right_wing = soldier_bee.addChild("right_wing", ModelPartBuilder.create().uv(0, 17).cuboid(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, -9.0F, -3.0F));

        ModelPartData front_legs = soldier_bee.addChild("front_legs", ModelPartBuilder.create().uv(0, 17).cuboid(-3.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, -2.0F, -2.0F));

        ModelPartData middle_legs = soldier_bee.addChild("middle_legs", ModelPartBuilder.create().uv(10, 23).cuboid(-4.0F, 0.0F, 0.0F, 5.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, -2.0F, 0.0F));

        ModelPartData back_legs = soldier_bee.addChild("back_legs", ModelPartBuilder.create().uv(0, 23).cuboid(-4.0F, 0.0F, 0.0F, 5.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, -2.0F, 2.0F));

        ModelPartData left_antenna = soldier_bee.addChild("left_antenna", ModelPartBuilder.create().uv(0, 5).cuboid(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.0F, -5.0F));

        ModelPartData stinger = soldier_bee.addChild("stinger", ModelPartBuilder.create().uv(5, 0).cuboid(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -5.0F, 0.0F));

        ModelPartData right_antenna = soldier_bee.addChild("right_antenna", ModelPartBuilder.create().uv(0, 0).cuboid(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.0F, -5.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(SoldierBeeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(entity, netHeadYaw, headPitch, ageInTicks);
        this.animateMovement(SoldierBeeAnimations.SOLDIER_BEE_WALK, limbSwing, limbSwingAmount, 2f, 2f);
        this.updateAnimation(entity.idleAnimationState, SoldierBeeAnimations.SOLDIER_BEE_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(SoldierBeeEntity entity, float headYaw, float headPitch, float animationProgress){
        headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25.0f, 45.0f);
        this.head.yaw = headYaw * 0.017453292f;
        this.head.pitch = headPitch * 0.017453292f;
    }

    @Override
    public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        soldier_bee.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return soldier_bee;
    }
}