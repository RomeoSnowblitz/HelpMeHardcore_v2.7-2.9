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
        if(player.getStackInHand(Hand.MAIN_HAND).isOf(ModItems.NULL_PASSER) || player.getStackInHand(Hand.OFF_HAND).isOf(ModItems.NULL_PASSER)){
            BlockPos x = player.getBlockPos();
            player.sendMessage(Text.literal("Position Has Been Saved!"));
            player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_X));
            player.increaseStat(ModStats.NULL_SAVED_X, x.getX());
            player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_Y));
            player.increaseStat(ModStats.NULL_SAVED_Y, x.getY());
            player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_Z));
            player.increaseStat(ModStats.NULL_SAVED_Z, x.getZ());
        }


    }

}
