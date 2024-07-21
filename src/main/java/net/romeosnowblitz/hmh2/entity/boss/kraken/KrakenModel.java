package net.romeosnowblitz.hmh2.entity.boss.kraken;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class KrakenModel<T extends KrakenEntity> extends SinglePartEntityModel<T>  {
	public static final EntityModelLayer KRAKEN = new EntityModelLayer(new Identifier(Hmh2.MOD_ID, "kraken"), "main");
	private final ModelPart kraken;
	private final ModelPart head;

	public KrakenModel(ModelPart root) {
		this.kraken = root.getChild("kraken");
		this.head = kraken.getChild("body").getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Kraken = modelPartData.addChild("kraken", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, 20.0F, -60.0F));

		ModelPartData body = Kraken.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -6.0F, -24.5F, 16.0F, 12.0F, 49.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -2.0F, 88.5F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(148, 151).cuboid(-5.0F, -5.0F, -8.0F, 10.0F, 10.0F, 8.0F, new Dilation(0.0F))
				.uv(0, 21).cuboid(5.0F, -2.5F, -6.0F, 2.0F, 5.0F, 5.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-7.0F, -2.5F, -6.0F, 2.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -24.5F));

		ModelPartData tentacles_big_l = head.addChild("tentacles_big_l", ModelPartBuilder.create().uv(0, 94).cuboid(-1.0F, -4.0F, -23.0F, 4.0F, 4.0F, 25.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 2.0F, -6.0F));

		ModelPartData tentacles_big_l2 = tentacles_big_l.addChild("tentacles_big_l2", ModelPartBuilder.create().uv(36, 64).mirrored().cuboid(-1.5F, -1.5F, -30.0F, 3.0F, 3.0F, 30.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.5F, -1.5F, -23.0F));

		ModelPartData tentacles_big_l3 = tentacles_big_l2.addChild("tentacles_big_l3", ModelPartBuilder.create().uv(23, 0).mirrored().cuboid(0.0F, -2.5F, -9.0F, 4.0F, 5.0F, 9.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-1.5F, 0.0F, -30.0F));

		ModelPartData tentacles_big_r = head.addChild("tentacles_big_r", ModelPartBuilder.create().uv(77, 83).cuboid(-3.0F, -4.0F, -23.0F, 4.0F, 4.0F, 25.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, 2.0F, -6.0F));

		ModelPartData tentacles_big_r2 = tentacles_big_r.addChild("tentacles_big_r2", ModelPartBuilder.create().uv(36, 64).cuboid(-1.5F, -1.5F, -30.0F, 3.0F, 3.0F, 30.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, -1.5F, -23.0F));

		ModelPartData tentacles_big_r3 = tentacles_big_r2.addChild("tentacles_big_r3", ModelPartBuilder.create().uv(23, 0).cuboid(-4.0F, -2.5F, -9.0F, 4.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, 0.0F, -30.0F));

		ModelPartData beak = head.addChild("beak", ModelPartBuilder.create(), ModelTransform.pivot(-3.0F, 2.0F, -64.0F));

		ModelPartData beak_bottom = beak.addChild("beak_bottom", ModelPartBuilder.create().uv(36, 61).cuboid(-2.0F, -1.5F, -7.0F, 4.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -0.5F, 56.0F));

		ModelPartData beak_top = beak.addChild("beak_top", ModelPartBuilder.create().uv(0, 62).cuboid(-2.0F, -0.5F, -7.0F, 4.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -3.5F, 56.0F));

		ModelPartData tentacle_top_l = head.addChild("tentacle_top_l", ModelPartBuilder.create().uv(33, 98).cuboid(-1.5F, -1.5F, -24.0F, 3.0F, 3.0F, 25.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -3.0F, -8.0F));

		ModelPartData tentacle_top_l2 = tentacle_top_l.addChild("tentacle_top_l2", ModelPartBuilder.create().uv(123, 58).mirrored().cuboid(-1.0F, -1.0F, -25.0F, 2.0F, 2.0F, 25.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -24.0F));

		ModelPartData tentacle_top_r = head.addChild("tentacle_top_r", ModelPartBuilder.create().uv(64, 112).cuboid(-1.5F, -1.5F, -24.0F, 3.0F, 3.0F, 25.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -3.0F, -8.0F));

		ModelPartData tentacle_top_r2 = tentacle_top_r.addChild("tentacle_top_r2", ModelPartBuilder.create().uv(123, 58).cuboid(-1.0F, -1.0F, -25.0F, 2.0F, 2.0F, 25.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -24.0F));

		ModelPartData tentacle_bottom_r = head.addChild("tentacle_bottom_r", ModelPartBuilder.create().uv(110, 87).cuboid(-1.5F, -1.5F, -24.0F, 3.0F, 3.0F, 25.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, 3.0F, -8.0F));

		ModelPartData tentacle_bottom_r2 = tentacle_bottom_r.addChild("tentacle_bottom_r2", ModelPartBuilder.create().uv(0, 123).cuboid(-1.0F, -1.0F, -25.0F, 2.0F, 2.0F, 25.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -24.0F));

		ModelPartData tentacle_bottom_l = head.addChild("tentacle_bottom_l", ModelPartBuilder.create().uv(95, 115).cuboid(-1.5F, -1.5F, -24.0F, 3.0F, 3.0F, 25.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 3.0F, -8.0F));

		ModelPartData tentacle_bottom_l2 = tentacle_bottom_l.addChild("tentacle_bottom_l2", ModelPartBuilder.create().uv(0, 123).mirrored().cuboid(-1.0F, -1.0F, -25.0F, 2.0F, 2.0F, 25.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -24.0F));

		ModelPartData tentacle_top_small_l = head.addChild("tentacle_top_small_l", ModelPartBuilder.create().uv(0, 21).cuboid(-1.0F, -1.0F, -18.5F, 2.0F, 2.0F, 19.0F, new Dilation(0.0F)), ModelTransform.pivot(1.25F, -3.75F, -7.5F));

		ModelPartData tentacle_top_small_l2 = tentacle_top_small_l.addChild("tentacle_top_small_l2", ModelPartBuilder.create().uv(64, 140).mirrored().cuboid(-0.5F, -0.5F, -19.5F, 1.0F, 1.0F, 19.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -18.0F));

		ModelPartData tentacle_top_small_r = head.addChild("tentacle_top_small_r", ModelPartBuilder.create().uv(0, 21).mirrored().cuboid(-1.0F, -1.0F, -18.5F, 2.0F, 2.0F, 19.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-1.25F, -3.75F, -7.5F));

		ModelPartData tentacle_top_small_r4 = tentacle_top_small_r.addChild("tentacle_top_small_r4", ModelPartBuilder.create().uv(64, 140).cuboid(-0.5F, -0.5F, -19.5F, 1.0F, 1.0F, 19.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -18.0F));

		ModelPartData tentacle_bottom_small_r = head.addChild("tentacle_bottom_small_r", ModelPartBuilder.create().uv(130, 37).cuboid(-1.0F, -1.0F, -18.0F, 2.0F, 2.0F, 19.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.25F, 3.75F, -8.0F));

		ModelPartData tentacle_bottom_small_r3 = tentacle_bottom_small_r.addChild("tentacle_bottom_small_r3", ModelPartBuilder.create().uv(85, 143).mirrored().cuboid(-0.5F, -0.5F, -19.0F, 1.0F, 1.0F, 19.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, -18.0F));

		ModelPartData tentacle_bottom_small_l = head.addChild("tentacle_bottom_small_l", ModelPartBuilder.create().uv(130, 37).cuboid(-1.0F, -1.0F, -18.0F, 2.0F, 2.0F, 19.0F, new Dilation(0.0F)), ModelTransform.pivot(1.25F, 3.75F, -8.0F));

		ModelPartData tentacle_bottom_small_l2 = tentacle_bottom_small_l.addChild("tentacle_bottom_small_l2", ModelPartBuilder.create().uv(85, 143).cuboid(-0.5F, -0.5F, -19.0F, 1.0F, 1.0F, 19.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -18.0F));

		ModelPartData right_flap = body.addChild("right_flap", ModelPartBuilder.create().uv(126, 115).cuboid(-13.0F, -1.0F, 12.0F, 13.0F, 2.0F, 13.0F, new Dilation(0.0F))
				.uv(72, 61).cuboid(-18.0F, -1.0F, -8.0F, 18.0F, 2.0F, 20.0F, new Dilation(0.0F))
				.uv(149, 22).cuboid(-16.0F, -1.0F, -15.0F, 15.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 17.5F));

		ModelPartData left_flap = body.addChild("left_flap", ModelPartBuilder.create().uv(81, 0).cuboid(0.0F, -1.0F, -8.0F, 18.0F, 2.0F, 20.0F, new Dilation(0.0F))
				.uv(152, 58).cuboid(1.0F, -1.0F, -15.0F, 15.0F, 2.0F, 7.0F, new Dilation(0.0F))
				.uv(110, 22).cuboid(0.0F, -1.0F, 12.0F, 13.0F, 2.0F, 13.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 17.5F));

		ModelPartData spout_r = body.addChild("spout_r", ModelPartBuilder.create(), ModelTransform.pivot(-8.0F, 0.0F, -12.0F));

		ModelPartData spout_r_r1 = spout_r.addChild("spout_r_r1", ModelPartBuilder.create().uv(0, 150).mirrored().cuboid(-0.5F, -3.5F, -12.5F, 5.0F, 7.0F, 13.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.6387F, 0.0F, 0.745F, 0.0F, 0.2618F, 0.0F));

		ModelPartData spout_l = body.addChild("spout_l", ModelPartBuilder.create(), ModelTransform.pivot(8.0F, 0.0F, -12.0F));

		ModelPartData spout_l_r1 = spout_l.addChild("spout_l_r1", ModelPartBuilder.create().uv(0, 150).cuboid(-4.5F, -3.5F, -12.5F, 5.0F, 7.0F, 13.0F, new Dilation(0.0F)), ModelTransform.of(-0.6387F, 0.0F, 0.745F, 0.0F, -0.2618F, 0.0F));
		return TexturedModelData.of(modelData, 232, 232);
	}

	@Override
	public void setAngles(KrakenEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.animateMovement(KrakenAnimations.KRAKEN_SWIM, limbSwing, limbSwingAmount, 2f, 2f);
		this.updateAnimation(entity.idleAnimationState, KrakenAnimations.KRAKEN_SWIM, ageInTicks, 1f);
	}

	@Override
	public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		kraken.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return kraken;
	}
}