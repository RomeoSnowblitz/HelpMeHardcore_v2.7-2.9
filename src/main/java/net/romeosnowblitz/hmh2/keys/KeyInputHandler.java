package net.romeosnowblitz.hmh2.keys;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.Hand;
import net.romeosnowblitz.hmh2.item.ModItems;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {

    public static final String KEY_CATEGORY_TUTORIAL = "key.category.hmh2.test";
    public static final String KEY_MAGIC_ACTION = "key.hmh2.magic_action";

    public static KeyBinding magicKey;

    public static void register() {
        magicKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
           KEY_MAGIC_ACTION, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_Y, KEY_CATEGORY_TUTORIAL
        ));
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(magicKey.wasPressed() && client.player.getStackInHand(Hand.MAIN_HAND).isOf(ModItems.NULL_PASSER)){
                ClientPlayNetworking.send(ModNetworking.EXAMPLE_ID, PacketByteBufs.create());
            }
        });
    }
}
