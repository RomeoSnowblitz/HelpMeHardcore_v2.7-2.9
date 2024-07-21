package net.romeosnowblitz.hmh2.keys.packet.gamepad;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.romeosnowblitz.hmh2.keys.packet.gamepad.CloseC2SPacket;
import net.romeosnowblitz.hmh2.keys.packet.gamepad.ConfigList;

public class TurnLeftC2SPacket {
    public static void turnLeftPressed(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender){
        CloseC2SPacket.option++;if(CloseC2SPacket.option>2){CloseC2SPacket.option=0;}if(CloseC2SPacket.open){
            ConfigList.configurationList(player);} else {CloseC2SPacket.open=true;}
    }
}
