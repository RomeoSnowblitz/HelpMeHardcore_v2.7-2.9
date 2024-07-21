package net.romeosnowblitz.hmh2.entity.fish.water;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class PiranhaModel<T extends PiranhaEntity> extends SinglePartEntityModel<T> {
	public static final EntityModelLayer PIRANHA = new EntityModelLayer(new Identifier(Hmh2.MOD_ID, "piranha"), "main");
		private final ModelPart piranha;
		private final ModelPart head;

	public PiranhaModel(ModelPart root) {
		this.piranha = root.getChild("piranha");
		this.head = piranha.getChild("head");
	}

		public static TexturedModelData getTexturedModelData() {
			ModelData modelData = new ModelData();
			ModelPartData modelPartData = modelData.getRoot();
			ModelPartData piranha = modelPartData.addChild("piranha", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
			ModelPartData chomper = piranha.addChild("chomper", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -2.0F));
			ModelPartData mouth_r1 = chomper.addChild("mouth_r1", ModelPartBuilder.create().uv(5, 11).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));
			ModelPartData body = piranha.addChild("head", ModelPartBuilder.create().uv(6, 8).cuboid(-1.0F, -3.0F, -3.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)).uv(0, 0).cuboid(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
			ModelPartData tail = piranha.addChild("tail", ModelPartBuilder.create().uv(8, 0).cuboid(-1.0F, -3.0F, 2.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)).uv(0, 8).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
			return TexturedModelData.of(modelData, 16, 16);
		}
	@Override
	public void setAngles(PiranhaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.animateMovement(PiranhaAnimations.PIRANHA_SWIM, limbSwing, limbSwingAmount, 2f, 2f);
	}

	@Override
	public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		piranha.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return piranha;
	}
	}