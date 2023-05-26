package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.mob.ShadowCreatureEntity;
import software.bernie.geckolib.model.GeoModel;

public class ShadowCreatureModel extends GeoModel<ShadowCreatureEntity> {

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

}
