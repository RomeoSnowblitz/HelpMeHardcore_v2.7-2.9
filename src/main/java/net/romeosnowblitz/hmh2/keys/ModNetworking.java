package net.romeosnowblitz.hmh2.keys;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.keys.packet.*;
import net.romeosnowblitz.hmh2.keys.packet.gamepad.CloseC2SPacket;
import net.romeosnowblitz.hmh2.keys.packet.gamepad.LeverFlipC2SPacket;
import net.romeosnowblitz.hmh2.keys.packet.gamepad.TurnLeftC2SPacket;
import net.romeosnowblitz.hmh2.keys.packet.gamepad.TurnRightC2SPacket;

public class ModNetworking {

    public static final Identifier EXAMPLE_ID = new Identifier(Hmh2.MOD_ID, "example");
    public static final Identifier WORLD_EVENT_ID = new Identifier(Hmh2.MOD_ID, "world_event");
    public static final Identifier SERVER_EVENT_ID = new Identifier(Hmh2.MOD_ID, "world_event");

    public static final Identifier LEVER_FLIP_ID = new Identifier(Hmh2.MOD_ID, "lever_flip");
    public static final Identifier TURN_LEFT_ID = new Identifier(Hmh2.MOD_ID, "turn_left");
    public static final Identifier TURN_RIGHT_ID = new Identifier(Hmh2.MOD_ID, "turn_right");
    public static final Identifier CLOSE_ID = new Identifier(Hmh2.MOD_ID, "close");

    public static void registerC2SPackets(){
        ServerPlayNetworking.registerGlobalReceiver(EXAMPLE_ID, ExampleC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(WORLD_EVENT_ID, WorldEventPacket::receive);

        ServerPlayNetworking.registerGlobalReceiver(LEVER_FLIP_ID, LeverFlipC2SPacket::leverFlipPressed);
        ServerPlayNetworking.registerGlobalReceiver(TURN_LEFT_ID, TurnLeftC2SPacket::turnLeftPressed);
        ServerPlayNetworking.registerGlobalReceiver(TURN_RIGHT_ID, TurnRightC2SPacket::turnRightPressed);
        ServerPlayNetworking.registerGlobalReceiver(CLOSE_ID, CloseC2SPacket::closePressed);
    }

    public static void registerS2CPackets(){
        ClientPlayNetworking.registerGlobalReceiver(SERVER_EVENT_ID, ServerEventPacket::receive);
    }

}
