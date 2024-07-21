package net.romeosnowblitz.hmh2.entity.boss.queen_bee;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.romeosnowblitz.hmh2.Hmh2;

public class QueenBeeModel <T extends QueenBeeEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer QUEEN_BEE = new EntityModelLayer(new Identifier(Hmh2.MOD_ID, "queen_bee"), "main");
    private final ModelPart queen_bee;
    private final ModelPart head;

    public QueenBeeModel(ModelPart root) {
        this.queen_bee = root.getChild("queen_bee");
        this.head = queen_bee.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData queen_bee = modelPartData.addChild("queen_bee", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData head = queen_bee.addChild("head", ModelPartBuilder.create().uv(0, 33).cuboid(-2.0F, -3.0F, -2.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(30, 19).cuboid(1.0F, -3.0F, -2.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(22, 27).cuboid(-3.0F, -4.0F, -2.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -20.0F, 0.0F));

        ModelPartData left_fang_r1 = head.addChild("left_fang_r1", ModelPartBuilder.create().uv(29, 22).cuboid(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 0.0F, -2.0F, 1.0472F, 0.0F, -1.5708F));

        ModelPartData right_fang_r1 = head.addChild("right_fang_r1", ModelPartBuilder.create().uv(10, 33).cuboid(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 0.0F, -2.0F, 1.0472F, 0.0F, 1.5708F));

        ModelPartData leftantena = head.addChild("leftantena", ModelPartBuilder.create(), ModelTransform.pivot(1.0F, -6.0F, 2.0F));

        ModelPartData leftantenatop_r1 = leftantena.addChild("leftantenatop_r1", ModelPartBuilder.create().uv(0, 20).cuboid(1.0F, -1.6F, 2.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -1.0F, -5.0F, 0.0F, 0.0F, 2.3998F));

        ModelPartData leftantenamid_r1 = leftantena.addChild("leftantenamid_r1", ModelPartBuilder.create().uv(25, 0).cuboid(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.8727F));

        ModelPartData leftantenabase_r1 = leftantena.addChild("leftantenabase_r1", ModelPartBuilder.create().uv(25, 3).cuboid(-0.5F, 0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.2618F));

        ModelPartData rightantena = head.addChild("rightantena", ModelPartBuilder.create(), ModelTransform.pivot(-1.0F, -7.0F, -1.0F));

        ModelPartData rightantenatop_r1 = rightantena.addChild("rightantenatop_r1", ModelPartBuilder.create().uv(0, 6).cuboid(-2.0F, -2.0F, -3.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, 0.0F, 3.0F, 0.0F, 0.0F, -2.1817F));

        ModelPartData rightantenamid_r1 = rightantena.addChild("rightantenamid_r1", ModelPartBuilder.create().uv(4, 6).cuboid(-2.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.4399F));

        ModelPartData rightantenabase_r1 = rightantena.addChild("rightantenabase_r1", ModelPartBuilder.create().uv(0, 17).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 2.0F, 1.0F, 0.0F, 0.0F, -0.2618F));

        ModelPartData body = queen_bee.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData body2 = body.addChild("body2", ModelPartBuilder.create().uv(0, 17).cuboid(-4.0F, -19.0F, 0.0F, 8.0F, 10.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData leftarms = body2.addChild("leftarms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData lefttoparm = leftarms.addChild("lefttoparm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData lefttoparmhand_r1 = lefttoparm.addChild("lefttoparmhand_r1", ModelPartBuilder.create().uv(10, 35).cuboid(4.0F, -13.0F, 5.0F, 2.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.6545F, 0.0F, 0.0F));

        ModelPartData lefttoparmshoulder_r1 = lefttoparm.addChild("lefttoparmshoulder_r1", ModelPartBuilder.create().uv(0, 41).cuboid(4.01F, -18.0F, -8.0F, 2.02F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        ModelPartData leftmidarm = leftarms.addChild("leftmidarm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData leftmidarmhand_r1 = leftmidarm.addChild("leftmidarmhand_r1", ModelPartBuilder.create().uv(35, 2).cuboid(4.0F, -11.0F, 4.0F, 2.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.6981F, 0.0F, 0.0F));

        ModelPartData leftmidarmsholder_r1 = leftmidarm.addChild("leftmidarmsholder_r1", ModelPartBuilder.create().uv(40, 27).cuboid(4.01F, -17.0F, -6.0F, 2.02F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        ModelPartData leftbottomarm = leftarms.addChild("leftbottomarm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData leftbottomarmhand_r1 = leftbottomarm.addChild("leftbottomarmhand_r1", ModelPartBuilder.create().uv(0, 33).cuboid(4.0F, -8.0F, 4.0F, 2.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.6981F, 0.0F, 0.0F));

        ModelPartData leftbottomarmsholder_r1 = leftbottomarm.addChild("leftbottomarmsholder_r1", ModelPartBuilder.create().uv(38, 19).cuboid(4.01F, -15.0F, -4.0F, 2.02F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        ModelPartData rightarms = body2.addChild("rightarms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData righttoparm = rightarms.addChild("righttoparm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -10.0F));

        ModelPartData righttoparmhand_r1 = righttoparm.addChild("righttoparmhand_r1", ModelPartBuilder.create().uv(28, 19).cuboid(4.0F, -13.0F, 5.0F, 2.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-10.0F, 0.0F, 10.0F, 0.6545F, 0.0F, 0.0F));

        ModelPartData righttoparmshoulder_r1 = righttoparm.addChild("righttoparmshoulder_r1", ModelPartBuilder.create().uv(38, 10).cuboid(3.99F, -18.0F, -8.0F, 2.02F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.0F, 0.0F, 10.0F, -0.5236F, 0.0F, 0.0F));

        ModelPartData rightmidarm = rightarms.addChild("rightmidarm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -10.0F));

        ModelPartData rightmidarmhand_r1 = rightmidarm.addChild("rightmidarmhand_r1", ModelPartBuilder.create().uv(28, 11).cuboid(4.0F, -11.0F, 4.0F, 2.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-10.0F, 0.0F, 11.0F, 0.6981F, 0.0F, 0.0F));

        ModelPartData rightmidarmshoulder_r1 = rightmidarm.addChild("rightmidarmshoulder_r1", ModelPartBuilder.create().uv(22, 17).cuboid(3.99F, -17.0F, -6.0F, 2.02F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.0F, 0.0F, 10.0F, -0.5236F, 0.0F, 0.0F));

        ModelPartData rightbottomarm = rightarms.addChild("rightbottomarm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -8.0F));

        ModelPartData rightbottomarmhand_r1 = rightbottomarm.addChild("rightbottomarmhand_r1", ModelPartBuilder.create().uv(25, 0).cuboid(2.0F, -8.0F, 4.0F, 2.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, 0.0F, 8.0F, 0.6981F, 0.0F, 0.0F));

        ModelPartData rightbottomarmshoulder_r1 = rightbottomarm.addChild("rightbottomarmshoulder_r1", ModelPartBuilder.create().uv(0, 0).cuboid(1.99F, -15.0F, -4.0F, 2.02F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, 0.0F, 8.0F, -0.5236F, 0.0F, 0.0F));

        ModelPartData wings = body2.addChild("wings", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData left_wing = wings.addChild("left_wing", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData left_wing_cube_r1 = left_wing.addChild("left_wing_cube_r1", ModelPartBuilder.create().uv(34, 35).cuboid(0.0F, -8.0F, -1.5F, 0.0F, 10.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -17.0F, 6.0F, -1.0472F, 0.4363F, 0.3491F));

        ModelPartData right_wing = wings.addChild("right_wing", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData right_wing_cube_r1 = right_wing.addChild("right_wing_cube_r1", ModelPartBuilder.create().uv(26, 35).cuboid(0.0F, -8.0F, -1.5F, 0.0F, 10.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -17.0F, 6.0F, -1.0472F, -0.4363F, -0.3491F));

        ModelPartData stinger = body.addChild("stinger", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData stinger_cube_r1 = stinger.addChild("stinger_cube_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-4.01F, -15.0F, -1.5F, 8.02F, 8.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 6.0F, 0.829F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(QueenBeeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(entity, netHeadYaw, headPitch, ageInTicks);
        this.animateMovement(QueenBeeAnimations.QUEEN_BEE_WALK, limbSwing, limbSwingAmount, 2f, 2f);
        this.updateAnimation(entity.idleAnimationState, QueenBeeAnimations.QUEEN_BEE_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(QueenBeeEntity entity, float headYaw, float headPitch, float animationProgress){
        headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25.0f, 45.0f);

        this.head.yaw = headYaw * 0.017453292f;
        this.head.pitch = headPitch * 0.017453292f;
    }

    @Override
    public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        queen_bee.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
            return queen_bee;
    }
}
