package net.romeosnowblitz.hmh2.keys.packet.gamepad;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class CloseC2SPacket {

    public static int option = 0;
    public static boolean open = true;

    public static void closePressed(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender){

        if(CloseC2SPacket.open){
            player.sendMessage(Text.literal("UP & DOWN = Key Info"));
            player.sendMessage(Text.literal("LEFT = Previous Option"));
            player.sendMessage(Text.literal("RIGHT = Next Option"));
            player.sendMessage(Text.literal("DOWN = Toggle/Use Option"));

            player.sendMessage(Text.literal(""));
            player.sendMessage(Text.literal("This is a new feature called the Gamepad"));
            player.sendMessage(Text.literal("It's made for player's choices of their needs"));
            player.sendMessage(Text.literal("You can set you Personal Game Settings with this"));
            player.sendMessage(Text.literal("and Coming Soon ..."));
            player.sendMessage(Text.literal("Being able to look at info of Items"));
        } else {
            player.sendMessage(Text.of("Gamepad is Now Open"));
            CloseC2SPacket.open=true;
        }
    }

}
