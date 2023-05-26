/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1921
 *  net.minecraft.class_2960
 *  net.minecraft.class_3879
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_5603
 *  net.minecraft.class_5606
 *  net.minecraft.class_5607
 *  net.minecraft.class_5609
 *  net.minecraft.class_5610
 *  net.minecraft.class_630
 */
package net.romeosnowblitz.hmh2.entity.client.minecraft;

import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_3879;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_5603;
import net.minecraft.class_5606;
import net.minecraft.class_5607;
import net.minecraft.class_5609;
import net.minecraft.class_5610;
import net.minecraft.class_630;

public class SpearModel
extends class_3879 {
    public static final class_2960 TEXTURE = new class_2960("textures/entity/spear.png");
    private final class_630 root;

    public SpearModel(class_630 root) {
        super(class_1921::method_23572);
        this.root = root;
    }

    public static class_5607 getTexturedModelData() {
        class_5609 modelData = new class_5609();
        class_5610 modelPartData = modelData.method_32111();
        class_5610 modelPartData2 = modelPartData.method_32117("pole", class_5606.method_32108().method_32101(0, 6).method_32097(-0.5f, 2.0f, -0.5f, 1.0f, 25.0f, 1.0f), class_5603.field_27701);
        modelPartData2.method_32117("base", class_5606.method_32108().method_32101(4, 0).method_32097(-1.5f, 0.0f, -0.5f, 3.0f, 2.0f, 1.0f), class_5603.field_27701);
        modelPartData2.method_32117("left_spike", class_5606.method_32108().method_32101(4, 3).method_32097(-2.5f, -3.0f, -0.5f, 1.0f, 4.0f, 1.0f), class_5603.field_27701);
        modelPartData2.method_32117("middle_spike", class_5606.method_32108().method_32101(0, 0).method_32097(-0.5f, -4.0f, -0.5f, 1.0f, 4.0f, 1.0f), class_5603.field_27701);
        modelPartData2.method_32117("right_spike", class_5606.method_32108().method_32101(4, 3).method_32096().method_32097(1.5f, -3.0f, -0.5f, 1.0f, 4.0f, 1.0f), class_5603.field_27701);
        return class_5607.method_32110((class_5609)modelData, (int)32, (int)32);
    }

    public void method_2828(class_4587 matrices, class_4588 vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.root.method_22699(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}

