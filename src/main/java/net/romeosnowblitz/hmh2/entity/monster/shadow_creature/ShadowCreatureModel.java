package net.romeosnowblitz.hmh2.entity.monster.shadow_creature;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class ShadowCreatureModel<T extends ShadowCreatureEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer SHADOW_CREATURE = new EntityModelLayer(new Identifier(Hmh2.MOD_ID, "shadow_creature"), "main");
    private final ModelPart shadow_creature;

    public ShadowCreatureModel(ModelPart root) {
        this.shadow_creature = root.getChild("shadow_creature");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData shadow_creature = modelPartData.addChild("shadow_creature", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
        return TexturedModelData.of(modelData, 16, 16);
    }

    @Override
    public void setAngles(ShadowCreatureEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.animateMovement(ShadowCreatureAnimations.SHADOW_CREATURE_WALK, limbSwing, limbSwingAmount, 2f, 2f);
    }


    @Override
    public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        shadow_creature.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return shadow_creature;
    }
}
