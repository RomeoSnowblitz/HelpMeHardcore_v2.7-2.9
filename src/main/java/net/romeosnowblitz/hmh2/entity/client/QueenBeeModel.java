package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.mob.QueenBeeEntity;
import software.bernie.geckolib.model.GeoModel;

public class QueenBeeModel extends GeoModel<QueenBeeEntity> {

    @Override
    public Identifier getModelResource(QueenBeeEntity object) {
        return new Identifier(Hmh2.MOD_ID, "geo/queen_bee.geo.json");
    }

    @Override
    public Identifier getTextureResource(QueenBeeEntity object) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/queen_bee/queen_bee.png");
    }

    @Override
    public Identifier getAnimationResource(QueenBeeEntity animatable) {
        return new Identifier(Hmh2.MOD_ID, "animations/queen_bee.animation.json");
    }

}
