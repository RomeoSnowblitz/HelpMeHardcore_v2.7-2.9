package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.custom.ShadowCreatureEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class ShadowCreatureModel extends AnimatedGeoModel<ShadowCreatureEntity> {

    @Override
    public Identifier getModelResource(ShadowCreatureEntity object) {
        return new Identifier(Hmh2.MOD_ID, "geo/shadow_creature.geo.json");
    }

    @Override
    public Identifier getTextureResource(ShadowCreatureEntity object) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/shadow_creature/shadow_creature.png");
    }

    @Override
    public Identifier getAnimationResource(ShadowCreatureEntity animatable) {
        return new Identifier(Hmh2.MOD_ID, "animations/shadow_creature.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(ShadowCreatureEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
