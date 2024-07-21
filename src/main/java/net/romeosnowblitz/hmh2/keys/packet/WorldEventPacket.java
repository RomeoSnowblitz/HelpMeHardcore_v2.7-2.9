package net.romeosnowblitz.hmh2.keys.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.romeosnowblitz.hmh2.keys.packet.gamepad.CloseC2SPacket;
import net.romeosnowblitz.hmh2.util.ModStats;

import java.util.Random;

public class WorldEventPacket {

    public static boolean didEventHappen = false;

    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender){
        if(CloseC2SPacket.open){
            player.sendMessage(Text.literal("meh"));
        } else {
            CloseC2SPacket.open=true;
        }
    }



}
