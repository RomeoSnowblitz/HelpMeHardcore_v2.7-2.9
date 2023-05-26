/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1921
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4608
 *  net.minecraft.class_5602
 *  net.minecraft.class_5617$class_5618
 *  net.minecraft.class_7833
 *  net.minecraft.class_897
 *  net.minecraft.class_918
 */
package net.romeosnowblitz.hmh2.entity.client.minecraft;

import net.minecraft.class_1297;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_5602;
import net.minecraft.class_5617;
import net.minecraft.class_7833;
import net.minecraft.class_897;
import net.minecraft.class_918;
import net.romeosnowblitz.hmh2.entity.client.minecraft.SpearModel;
import net.romeosnowblitz.hmh2.entity.mob.minecraft.SpearEntity;

public class SpearRenderer
extends class_897<SpearEntity> {
    public static final class_2960 TEXTURE = new class_2960("textures/entity/spear.png");
    private final SpearModel model;

    public SpearRenderer(class_5617.class_5618 context) {
        super(context);
        this.model = new SpearModel(context.method_32167(class_5602.field_27668));
    }

    public void render(SpearEntity spearEntity, float f, float g, class_4587 matrixStack, class_4597 vertexConsumerProvider, int i) {
        matrixStack.method_22903();
        matrixStack.method_22907(class_7833.field_40716.rotationDegrees(class_3532.method_16439((float)g, (float)spearEntity.field_5982, (float)spearEntity.method_36454()) - 90.0f));
        matrixStack.method_22907(class_7833.field_40718.rotationDegrees(class_3532.method_16439((float)g, (float)spearEntity.field_6004, (float)spearEntity.method_36455()) + 90.0f));
        class_4588 vertexConsumer = class_918.method_29711((class_4597)vertexConsumerProvider, (class_1921)this.model.method_23500(this.getTexture(spearEntity)), (boolean)false, (boolean)spearEntity.isEnchanted());
        this.model.method_2828(matrixStack, vertexConsumer, i, class_4608.field_21444, 1.0f, 1.0f, 1.0f, 1.0f);
        matrixStack.method_22909();
        super.method_3936((class_1297)spearEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    public class_2960 getTexture(SpearEntity spearEntity) {
        return TEXTURE;
    }
}

