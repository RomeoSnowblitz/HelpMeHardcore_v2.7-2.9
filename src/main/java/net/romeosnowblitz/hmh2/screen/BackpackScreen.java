package net.romeosnowblitz.hmh2.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;


public class BackpackScreen extends HandledScreen<BackpackScreenHandler> {
    private static final Identifier TEXTURE =
            new Identifier(Hmh2.MOD_ID, "textures/gui/freezer_gui.png");

    public BackpackScreen(BackpackScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }


    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) * 2;
        int y = (height - backgroundHeight) * 2;
    }
}
