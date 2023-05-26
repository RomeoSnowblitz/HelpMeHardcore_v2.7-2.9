/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1661
 *  net.minecraft.class_1703
 *  net.minecraft.class_2561
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 *  net.minecraft.class_465
 *  net.minecraft.class_5348
 */
package net.romeosnowblitz.hmh2.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_465;
import net.minecraft.class_5348;
import net.romeosnowblitz.hmh2.screen.BackpackScreenHandler;

public class BackpackScreen
extends class_465<BackpackScreenHandler> {
    private static final class_2960 TEXTURE = new class_2960("hmh2", "textures/gui/freezer_gui.png");

    public BackpackScreen(BackpackScreenHandler handler, class_1661 inventory, class_2561 title) {
        super((class_1703)handler, inventory, title);
    }

    protected void method_25426() {
        super.method_25426();
        this.field_25267 = (this.field_2792 - this.field_22793.method_27525((class_5348)this.field_22785)) / 2;
    }

    public void method_25394(class_4587 matrices, int mouseX, int mouseY, float delta) {
        this.method_25420(matrices);
        super.method_25394(matrices, mouseX, mouseY, delta);
        this.method_2380(matrices, mouseX, mouseY);
    }

    protected void method_2389(class_4587 matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShaderTexture((int)0, (class_2960)TEXTURE);
        int x = (this.field_22789 - this.field_2792) * 2;
        int y = (this.field_22790 - this.field_2779) * 2;
    }
}

