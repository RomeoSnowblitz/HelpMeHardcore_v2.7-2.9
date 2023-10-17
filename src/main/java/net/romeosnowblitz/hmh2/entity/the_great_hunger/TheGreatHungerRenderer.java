package net.romeosnowblitz.hmh2.entity.the_great_hunger;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
public class TheGreatHungerRenderer extends LivingEntityRenderer<TheGreatHungerEntity, TheGreatHungerModel<TheGreatHungerEntity>> {
    public TheGreatHungerRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new TheGreatHungerModel<>(ctx.getPart(TheGreatHungerModel.THE_GREAT_HUNGER)), 0.6f);
    }

    @Override
    public Identifier getTexture(TheGreatHungerEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/the_great_hunger.png");
    }
}