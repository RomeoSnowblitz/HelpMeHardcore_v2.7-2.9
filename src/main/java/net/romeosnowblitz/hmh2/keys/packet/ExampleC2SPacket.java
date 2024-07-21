package net.romeosnowblitz.hmh2.keys.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.util.ModStats;

public class ExampleC2SPacket {

    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender){

    }

}
