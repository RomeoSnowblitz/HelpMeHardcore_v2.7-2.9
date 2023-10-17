package net.romeosnowblitz.hmh2.entity.demon;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.romeosnowblitz.hmh2.Hmh2;

public class DemonModel<T extends DemonEntity> extends SinglePartEntityModel<T> {
	public static final EntityModelLayer DEMON = new EntityModelLayer(new Identifier(Hmh2.MOD_ID, "demon"), "main");
	private final ModelPart demon;
	private final ModelPart head;


	public DemonModel(ModelPart root) {
		this.demon = root.getChild("demon");
		this.head = demon.getChild("head");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData demon = modelPartData.addChild("demon", ModelPartBuilder.create().uv(13, 13).cuboid(-3.0F, -2.0F, -2.0F, 6.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 16.0F, 0.0F));

		ModelPartData chub = demon.addChild("chub", ModelPartBuilder.create().uv(7, 22).cuboid(-2.0F, 0.0F, -3.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 27).cuboid(-1.5F, 3.5F, -2.5F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 12).cuboid(-1.5F, -1.0F, -3.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_wing = demon.addChild("left_wing", ModelPartBuilder.create().uv(16, 6).cuboid(0.0F, -1.0F, 1.025F, 8.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, -1.0F, 0.0F));

		ModelPartData right_wing = demon.addChild("right_wing", ModelPartBuilder.create().uv(16, 0).cuboid(-8.0F, -1.0F, 1.025F, 8.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -1.0F, 0.0F));

		ModelPartData tail = demon.addChild("tail", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -1.0F, 1.0F, 0.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.0F, 0.0F));

		ModelPartData right_arm = demon.addChild("right_arm", ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, -0.75F, -1.25F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -1.0F, 0.0F));

		ModelPartData left_arm = demon.addChild("left_arm", ModelPartBuilder.create().uv(17, 22).cuboid(0.0F, -1.0F, -1.25F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -1.0F, 0.0F));

		ModelPartData right_leg = demon.addChild("right_leg", ModelPartBuilder.create().uv(25, 22).cuboid(-0.8F, 0.0F, -1.05F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 4.0F, 0.0F));

		ModelPartData left_leg = demon.addChild("left_leg", ModelPartBuilder.create().uv(0, 25).cuboid(-1.2F, 0.0F, -1.05F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 4.0F, 0.0F));

		ModelPartData head = demon.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -4.0F, -3.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));

		ModelPartData left_horn = head.addChild("left_horn", ModelPartBuilder.create(), ModelTransform.pivot(0.5F, -4.0F, -2.0F));

		ModelPartData left_horn_r1 = left_horn.addChild("left_horn_r1", ModelPartBuilder.create().uv(8, 17).cuboid(0.75F, -3.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		ModelPartData right_horn = head.addChild("right_horn", ModelPartBuilder.create(), ModelTransform.pivot(-0.5F, -4.0F, -2.0F));

		ModelPartData right_horn_r1 = right_horn.addChild("right_horn_r1", ModelPartBuilder.create().uv(8, 14).cuboid(-0.75F, -3.0F, -1.0F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(DemonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(entity, netHeadYaw, headPitch, ageInTicks);
		this.animateMovement(DemonAnimations.DEMON_WALK, limbSwing, limbSwingAmount, 2f, 2f);
		this.updateAnimation(entity.idleAnimationState, DemonAnimations.DEMON_IDLE, ageInTicks, 1f);
	}

	private void setHeadAngles(DemonEntity entity, float headYaw, float headPitch, float animationProgress){
		headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
		headPitch = MathHelper.clamp(headPitch, -25.0f, 45.0f);
		this.head.yaw = headYaw * 0.017453292f;
		this.head.pitch = headPitch * 0.017453292f;
	}

	@Override
	public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		demon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return demon;
	}
}