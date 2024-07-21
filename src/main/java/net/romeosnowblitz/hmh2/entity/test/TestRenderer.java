package net.romeosnowblitz.hmh2.entity.test;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class TestRenderer extends MobEntityRenderer<TestEntity, TestModel<TestEntity>> {

    public TestRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new TestModel<>(ctx.getPart(TestModel.TEST)), 0.6f);
    }

    @Override
    public Identifier getTexture(TestEntity entity) {
        return new Identifier(Hmh2.MOD_ID, "textures/entity/wisp.png");
    }
}
