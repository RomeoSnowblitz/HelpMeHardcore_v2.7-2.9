package net.romeosnowblitz.hmh2.entity.the_great_hunger;


import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.penguin.PenguinAnimations;
import net.romeosnowblitz.hmh2.entity.penguin.PenguinEntity;

public class TheGreatHungerModel<T extends TheGreatHungerEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer THE_GREAT_HUNGER = new EntityModelLayer(new Identifier(Hmh2.MOD_ID, "the_great_hunger"), "main");
    private final ModelPart the_great_hunger;
    private final ModelPart head;

    public TheGreatHungerModel(ModelPart root) {
        this.the_great_hunger = root.getChild("the_great_hunger");
        this.head = the_great_hunger.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData the_great_hunger = modelPartData.addChild("the_great_hunger", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData head = the_great_hunger.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -10.0F, -5.0F, 9.0F, 6.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData body = the_great_hunger.addChild("body", ModelPartBuilder.create().uv(0, 16).cuboid(-3.8F, -4.0F, -1.2F, 8.6F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData rightfront = the_great_hunger.addChild("rightfront", ModelPartBuilder.create().uv(8, 24).cuboid(-4.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, 0.0F));

        ModelPartData leftfront = the_great_hunger.addChild("leftfront", ModelPartBuilder.create().uv(0, 24).cuboid(3.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, 0.0F));

        ModelPartData rightback = the_great_hunger.addChild("rightback", ModelPartBuilder.create().uv(0, 5).cuboid(-4.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, 4.0F));

        ModelPartData leftback = the_great_hunger.addChild("leftback", ModelPartBuilder.create().uv(0, 0).cuboid(3.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, 4.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(TheGreatHungerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(entity, netHeadYaw, headPitch, ageInTicks);
        this.animateMovement(TheGreatHungerAnimations.THE_GREAT_HUNGER_WALK, limbSwing, limbSwingAmount, 2f, 2f);
        this.updateAnimation(entity.idleAnimationState, TheGreatHungerAnimations.THE_GREAT_HUNGER_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(TheGreatHungerEntity entity, float headYaw, float headPitch, float animationProgress){
        headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25.0f, 45.0f);
        this.head.yaw = headYaw * 0.017453292f;
        this.head.pitch = headPitch * 0.017453292f;
    }

    @Override
    public void render(MatrixStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        the_great_hunger.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return the_great_hunger;
    }
}