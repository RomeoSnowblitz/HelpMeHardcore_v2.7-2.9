package net.romeosnowblitz.hmh2.entity.headless_horseman;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.entity.wisp.WispEntity;
import net.romeosnowblitz.hmh2.entity.wisp.WispModel;

public class HeadlessHorsemanRenderer extends LivingEntityRenderer<HeadlessHorsemanEntity, HeadlessHorsemanModel<HeadlessHorsemanEntity>> {

    public HeadlessHorsemanRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new HeadlessHorsemanModel<>(ctx.getPart(HeadlessHorsemanModel.HEADLESS_HORSEMAN)), 0.6f);
    }

    @Override
    public Identifier getTexture(HeadlessHorsemanEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/shadow_creature.png");
    }
}
