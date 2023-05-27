package net.romeosnowblitz.hmh2.entity.client;

import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.mob.TheGreatHungerEntity;
import software.bernie.geckolib.model.GeoModel;

public class TheGreatHungerModel extends GeoModel<TheGreatHungerEntity> {

    @Override
    public Identifier getModelResource(TheGreatHungerEntity object) {
        return new Identifier(Hmh2.MOD_ID, "geo/the_great_hunger.geo.json");
    }

    @Override
    public Identifier getTextureResource(TheGreatHungerEntity object) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/the_great_hunger/the_great_hunger.png");
    }

    @Override
    public Identifier getAnimationResource(TheGreatHungerEntity animatable) {
        return new Identifier(Hmh2.MOD_ID, "animations/the_great_hunger.animation.json");
    }

}
