package net.romeosnowblitz.hmh2.entity.wisp;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class WispModel<T extends WispEntity> extends SinglePartEntityModel<T> {
	public static final EntityModelLayer WISP = new EntityModelLayer(new Identifier(Hmh2.MOD_ID, "wisp"), "main");
	private final ModelPart wisp;
	private final ModelPart head;

	public WispModel(ModelPart root) {
		this.wisp = root.getChild("wisp");
		this.head = wisp.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData wisp = modelPartData.addChild("wisp", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData head = wisp.addChild("head", ModelPartBuilder.create().uv(12, 12).cuboid(-2.0F, -10.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-3.0F, -9.0F, -3.0F, 6.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData neck = head.addChild("neck", ModelPartBuilder.create().uv(0, 10).cuboid(-2.0F, -5.0F, -2.0F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData end = neck.addChild("end", ModelPartBuilder.create().uv(0, 16).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData tail = end.addChild("tail", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(WispEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.animateMovement(WispAnimations.WISP_WALK, limbSwing, limbSwingAmount, 2f, 2f);
	}


	@Override
	public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		wisp.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return wisp;
	}
}