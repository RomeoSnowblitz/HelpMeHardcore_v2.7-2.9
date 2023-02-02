package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.mob.PenguinEntity;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class PenguinModel extends GeoModel<PenguinEntity> {

    @Override
    public Identifier getModelResource(PenguinEntity object) {
        return new Identifier(Hmh2.MOD_ID, "geo/penguin.geo.json");
    }

    @Override
    public Identifier getTextureResource(PenguinEntity object) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/penguin/penguin.png");
    }

    @Override
    public Identifier getAnimationResource(PenguinEntity animatable) {
        return new Identifier(Hmh2.MOD_ID, "animations/penguin.animation.json");
    }

    /*
    This is for The head to turn to the player
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(PenguinEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }

     */
}
