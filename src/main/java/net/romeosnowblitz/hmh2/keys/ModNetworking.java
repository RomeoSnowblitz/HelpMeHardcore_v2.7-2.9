package net.romeosnowblitz.hmh2.keys;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.keys.packet.ExampleC2SPacket;

public class ModNetworking {

    public static final Identifier EXAMPLE_ID = new Identifier(Hmh2.MOD_ID, "example");

    public static void registerC2SPackets(){
        ServerPlayNetworking.registerGlobalReceiver(EXAMPLE_ID, ExampleC2SPacket::receive);
    }

    public static void registerS2CPackets(){

    }

}
