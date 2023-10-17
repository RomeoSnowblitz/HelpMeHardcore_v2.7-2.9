package net.romeosnowblitz.hmh2.entity.blazing_inferno;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;


public class BlazingInfernoModel<T extends BlazingInfernoEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer BLAZING_INFERNO = new EntityModelLayer(new Identifier(Hmh2.MOD_ID, "blazing_inferno"), "main");
    private final ModelPart blazing_inferno;
    private final ModelPart head;

    public BlazingInfernoModel(ModelPart root) {
        this.blazing_inferno = root.getChild("blazing_inferno");
        this.head = blazing_inferno.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData blazing_inferno = modelPartData.addChild("blazing_inferno", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData head = blazing_inferno.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -24.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData body = blazing_inferno.addChild("body", ModelPartBuilder.create().uv(48, 0).cuboid(-2.0F, -16.0F, -2.0F, 4.0F, 16.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData shields = blazing_inferno.addChild("shields", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData shield1 = shields.addChild("shield1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData shield1_r1 = shield1.addChild("shield1_r1", ModelPartBuilder.create().uv(24, 34).cuboid(-5.0F, -13.0F, -15.0F, 10.0F, 16.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

        ModelPartData shield2 = shields.addChild("shield2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData shield2_r1 = shield2.addChild("shield2_r1", ModelPartBuilder.create().uv(0, 34).cuboid(-5.0F, -13.0F, -15.0F, 10.0F, 16.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2618F, -1.5708F, 0.0F));

        ModelPartData shield3 = shields.addChild("shield3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData shield3_r1 = shield3.addChild("shield3_r1", ModelPartBuilder.create().uv(24, 16).cuboid(-5.0F, -13.0F, -15.0F, 10.0F, 16.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2618F, 3.1416F, 0.0F));

        ModelPartData shield4 = shields.addChild("shield4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData shield4_r1 = shield4.addChild("shield4_r1", ModelPartBuilder.create().uv(0, 16).cuboid(-5.0F, -13.0F, -15.0F, 10.0F, 16.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2618F, 1.5708F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(BlazingInfernoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.animateMovement(BlazingInfernoAnimations.BLAZING_INFERNO_IDLECW, limbSwing, limbSwingAmount, 2f, 2f);
        this.updateAnimation(entity.idleAnimationState, BlazingInfernoAnimations.BLAZING_INFERNO_IDLE_CCW, ageInTicks, 1f);
    }


    @Override
    public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        blazing_inferno.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return blazing_inferno;
    }
}
