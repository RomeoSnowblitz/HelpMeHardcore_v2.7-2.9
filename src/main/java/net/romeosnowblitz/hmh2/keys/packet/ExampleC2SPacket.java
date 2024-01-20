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
        if(player.getStackInHand(Hand.MAIN_HAND).isOf(ModItems.NULL_PASSER) && player.getWorld().getDimension().bedWorks() ||
                player.getStackInHand(Hand.OFF_HAND).isOf(ModItems.NULL_PASSER) && player.getWorld().getDimension().bedWorks()){
            BlockPos x = player.getBlockPos();
            player.sendMessage(Text.literal("Overworld Position Has Been Saved!"));
            player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_OVERWORLD_X));
            player.increaseStat(ModStats.NULL_SAVED_OVERWORLD_X, x.getX());
            player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_OVERWORLD_Y));
            player.increaseStat(ModStats.NULL_SAVED_OVERWORLD_Y, x.getY());
            player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_OVERWORLD_Z));
            player.increaseStat(ModStats.NULL_SAVED_OVERWORLD_Z, x.getZ());
        }
        if(player.getStackInHand(Hand.MAIN_HAND).isOf(ModItems.NULL_PASSER) && player.getWorld().getDimension().ultrawarm() ||
                player.getStackInHand(Hand.OFF_HAND).isOf(ModItems.NULL_PASSER) && player.getWorld().getDimension().ultrawarm()){
            BlockPos x = player.getBlockPos();
            player.sendMessage(Text.literal("Nether Position Has Been Saved!"));
            player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_NETHER_X));
            player.increaseStat(ModStats.NULL_SAVED_NETHER_X, x.getX());
            player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_NETHER_Y));
            player.increaseStat(ModStats.NULL_SAVED_NETHER_Y, x.getY());
            player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_NETHER_Z));
            player.increaseStat(ModStats.NULL_SAVED_NETHER_Z, x.getZ());
        }
        if(player.getStackInHand(Hand.MAIN_HAND).isOf(ModItems.NULL_PASSER) && !player.getWorld().getDimension().bedWorks() && !player.getWorld().getDimension().ultrawarm() ||
                player.getStackInHand(Hand.OFF_HAND).isOf(ModItems.NULL_PASSER) && !player.getWorld().getDimension().bedWorks() && !player.getWorld().getDimension().ultrawarm()){
            BlockPos x = player.getBlockPos();
            player.sendMessage(Text.literal("End Position Has Been Saved!"));
            player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_END_X));
            player.increaseStat(ModStats.NULL_SAVED_END_X, x.getX());
            player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_END_Y));
            player.increaseStat(ModStats.NULL_SAVED_END_Y, x.getY());
            player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_END_Z));
            player.increaseStat(ModStats.NULL_SAVED_END_Z, x.getZ());
        }


    }

}
