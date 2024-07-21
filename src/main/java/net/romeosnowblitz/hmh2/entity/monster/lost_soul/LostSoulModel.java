package net.romeosnowblitz.hmh2.entity.monster.lost_soul;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.romeosnowblitz.hmh2.Hmh2;

public class LostSoulModel<T extends LostSoulEntity> extends SinglePartEntityModel<T> {
	public static final EntityModelLayer LOST_SOUL = new EntityModelLayer(new Identifier(Hmh2.MOD_ID, "lost_soul"), "main");
	private final ModelPart lost_soul;
	private final ModelPart head;

	public LostSoulModel(ModelPart root) {
		this.lost_soul = root.getChild("lost_soul");
		this.head = lost_soul.getChild("head");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData lost_soul = modelPartData.addChild("lost_soul", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = lost_soul.addChild("body", ModelPartBuilder.create().uv(55, 69).cuboid(-6.5F, -16.0F, -1.5F, 13.0F, 13.0F, 3.0F, new Dilation(0.0F))
		.uv(23, 11).cuboid(-1.5F, -16.0F, -6.5F, 3.0F, 13.0F, 13.0F, new Dilation(0.0F))
		.uv(36, 37).cuboid(-5.5F, -16.0F, -3.5F, 11.0F, 13.0F, 7.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-3.5F, -16.0F, -5.5F, 7.0F, 13.0F, 11.0F, new Dilation(0.0F))
		.uv(0, 37).cuboid(-4.5F, -16.0F, -4.5F, 9.0F, 13.0F, 9.0F, new Dilation(0.0F))
		.uv(0, 24).cuboid(-2.5F, -5.0F, -2.5F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = lost_soul.addChild("head", ModelPartBuilder.create().uv(55, 16).cuboid(-4.5F, -22.0F, -4.5F, 9.0F, 6.0F, 9.0F, new Dilation(0.0F))
		.uv(42, 0).cuboid(-3.5F, -21.0F, -5.5F, 7.0F, 5.0F, 11.0F, new Dilation(0.0F))
		.uv(42, 57).cuboid(-5.5F, -21.0F, -3.5F, 11.0F, 5.0F, 7.0F, new Dilation(0.0F))
		.uv(0, 66).cuboid(-3.5F, -23.0F, -3.5F, 7.0F, 7.0F, 7.0F, new Dilation(0.0F))
		.uv(25, 0).cuboid(-1.5F, -24.0F, -1.5F, 3.0F, 8.0F, 3.0F, new Dilation(0.0F))
		.uv(23, 57).cuboid(-1.5F, -19.0F, -6.5F, 3.0F, 3.0F, 13.0F, new Dilation(0.0F))
		.uv(55, 31).cuboid(-6.5F, -19.0F, -1.5F, 13.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(LostSoulEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(entity, netHeadYaw, headPitch, ageInTicks);
		this.animateMovement(LostSoulAnimations.LOST_SOUL_WALK, limbSwing, limbSwingAmount, 2f, 2f);
		this.updateAnimation(entity.idleAnimationState, LostSoulAnimations.LOST_SOUL_IDLE, ageInTicks, 1f);
	}

	private void setHeadAngles(LostSoulEntity entity, float headYaw, float headPitch, float animationProgress){
		headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
		headPitch = MathHelper.clamp(headPitch, -25.0f, 45.0f);
		this.head.yaw = headYaw * 0.017453292f;
		this.head.pitch = headPitch * 0.017453292f;
	}


	@Override
	public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		lost_soul.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return lost_soul;
	}
}