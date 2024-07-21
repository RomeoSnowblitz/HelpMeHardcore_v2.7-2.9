package net.romeosnowblitz.hmh2.entity.boss.headless_horseman;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class HeadlessHorsemanModel<T extends HeadlessHorsemanEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer HEADLESS_HORSEMAN = new EntityModelLayer(new Identifier(Hmh2.MOD_ID, "headless_horseman"), "main");
    private final ModelPart headless_horseman;

    public HeadlessHorsemanModel(ModelPart root) {
        this.headless_horseman = root.getChild("headless_horseman");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData headless_horseman = modelPartData.addChild("headless_horseman", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
        return TexturedModelData.of(modelData, 16, 16);
    }

    @Override
    public void setAngles(HeadlessHorsemanEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.animateMovement(HeadlessHorsemanAnimations.HEADLESS_HORSEMAN_WALK, limbSwing, limbSwingAmount, 2f, 2f);
    }


    @Override
    public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        headless_horseman.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return headless_horseman;
    }
}
