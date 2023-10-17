package net.romeosnowblitz.hmh2.entity.mites.sculkmite;


import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.romeosnowblitz.hmh2.Hmh2;

public class SculkmiteModel<T extends SculkmiteEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer SCULKMITE = new EntityModelLayer(new Identifier(Hmh2.MOD_ID, "sculkmite"), "main");
    private final ModelPart sculkmite;
    private final ModelPart head;

    public SculkmiteModel(ModelPart root) {
        this.sculkmite = root.getChild("sculkmite");
        this.head = sculkmite.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData sculkmite = modelPartData.addChild("sculkmite", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData head = sculkmite.addChild("head", ModelPartBuilder.create().uv(26, 0).cuboid(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, -7.0F));

        ModelPartData wing3 = head.addChild("wing3", ModelPartBuilder.create().uv(0, 20).cuboid(-3.0F, 0.0F, -1.5F, 6.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, 2.0F));

        ModelPartData body2 = sculkmite.addChild("body2", ModelPartBuilder.create().uv(24, 9).cuboid(-2.0F, 0.0F, -1.0F, 4.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, -5.0F));

        ModelPartData body3 = sculkmite.addChild("body3", ModelPartBuilder.create().uv(15, 15).cuboid(-3.0F, 0.0F, -1.5F, 6.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.0F, -2.5F));

        ModelPartData wing1 = body3.addChild("wing1", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, 0.0F, -1.5F, 10.0F, 8.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.0F, 0.0F));

        ModelPartData body4 = sculkmite.addChild("body4", ModelPartBuilder.create().uv(16, 22).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, 0.5F));

        ModelPartData body5 = sculkmite.addChild("body5", ModelPartBuilder.create().uv(25, 25).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, 2.0F));

        ModelPartData wing2 = body5.addChild("wing2", ModelPartBuilder.create().uv(0, 11).cuboid(-3.0F, 0.0F, -1.5F, 6.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, 1.5F));

        ModelPartData body6 = sculkmite.addChild("body6", ModelPartBuilder.create().uv(15, 11).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 6.0F));

        ModelPartData body7 = sculkmite.addChild("body7", ModelPartBuilder.create().uv(25, 22).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 8.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(SculkmiteEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(entity, netHeadYaw, headPitch, ageInTicks);
        this.animateMovement(SculkmiteAnimations.SCULKMITE_WALK, limbSwing, limbSwingAmount, 2f, 2f);
        this.updateAnimation(entity.idleAnimationState, SculkmiteAnimations.SCULKMITE_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(SculkmiteEntity entity, float headYaw, float headPitch, float animationProgress){
        headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25.0f, 45.0f);
        this.head.yaw = headYaw * 0.017453292f;
        this.head.pitch = headPitch * 0.017453292f;
    }

    @Override
    public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        sculkmite.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return sculkmite;
    }
}