package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.mob.SoldierBeeEntity;
import software.bernie.geckolib.model.GeoModel;

public class SoldierBeeModel extends GeoModel<SoldierBeeEntity> {

    @Override
    public Identifier getModelResource(SoldierBeeEntity object) {
        return new Identifier(Hmh2.MOD_ID, "geo/soldier_bee.geo.json");
    }

    @Override
    public Identifier getTextureResource(SoldierBeeEntity object) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/soldier_bee/soldier_bee.png");
    }

    @Override
    public Identifier getAnimationResource(SoldierBeeEntity animatable) {
        return new Identifier(Hmh2.MOD_ID, "animations/soldier_bee.animation.json");
    }
}
