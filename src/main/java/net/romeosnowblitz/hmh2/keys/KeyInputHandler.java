package net.romeosnowblitz.hmh2.keys;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.romeosnowblitz.hmh2.item.ModItems;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {

    public static final String KEY_CATEGORY_TUTORIAL = "key.category.hmh2.test";
    public static final String KEY_MAGIC_ACTION = "key.hmh2.magic_action";

    public static final String GAMEPAD_LEVER_FLIP = "key.hmh2.lever_flip";
    public static final String GAMEPAD_TURN_LEFT = "key.hmh2.turn_left";
    public static final String GAMEPAD_TURN_RIGHT = "key.hmh2.turn_right";
    public static final String GAMEPAD_UP = "key.hmh2.up";

    public static KeyBinding magicKey;
    public static KeyBinding leverFlipKey;
    public static KeyBinding turnLeftKey;
    public static KeyBinding turnRightKey;
    public static KeyBinding upKey;

    public static void register() {
        magicKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(KEY_MAGIC_ACTION, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_Y, KEY_CATEGORY_TUTORIAL));
        leverFlipKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(GAMEPAD_LEVER_FLIP, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_DOWN, KEY_CATEGORY_TUTORIAL));
        turnLeftKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(GAMEPAD_TURN_LEFT, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_LEFT, KEY_CATEGORY_TUTORIAL));
        turnRightKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(GAMEPAD_TURN_RIGHT, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_RIGHT, KEY_CATEGORY_TUTORIAL));
        upKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(GAMEPAD_UP, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UP, KEY_CATEGORY_TUTORIAL));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(magicKey.wasPressed() && client.player.getStackInHand(Hand.MAIN_HAND).isOf(ModItems.NULL_PASSER)){
                ClientPlayNetworking.send(ModNetworking.EXAMPLE_ID, PacketByteBufs.create());
            }
            if(leverFlipKey.isPressed()){
                ClientPlayNetworking.send(ModNetworking.SERVER_EVENT_ID, PacketByteBufs.create());
            }
            if(leverFlipKey.wasPressed()){ClientPlayNetworking.send(ModNetworking.LEVER_FLIP_ID, PacketByteBufs.create());}
            if(turnLeftKey.wasPressed()){ClientPlayNetworking.send(ModNetworking.TURN_LEFT_ID, PacketByteBufs.create());}
            if(turnRightKey.wasPressed()){ClientPlayNetworking.send(ModNetworking.TURN_RIGHT_ID, PacketByteBufs.create());}
            if(upKey.wasPressed()&&leverFlipKey.wasPressed()){ClientPlayNetworking.send(ModNetworking.CLOSE_ID, PacketByteBufs.create());}
        });
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            if(leverFlipKey.isPressed()){
                ClientPlayNetworking.send(ModNetworking.SERVER_EVENT_ID, PacketByteBufs.create());
            }
        });
    }
}
