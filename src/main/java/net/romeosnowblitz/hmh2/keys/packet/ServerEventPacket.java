package net.romeosnowblitz.hmh2.keys.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.network.PacketByteBuf;

import java.util.List;

public class ServerEventPacket {

    public static void receive(net.minecraft.client.MinecraftClient minecraftClient, ClientPlayNetworkHandler clientPlayNetworkHandler, PacketByteBuf packetByteBuf, PacketSender packetSender) {

        List<AbstractClientPlayerEntity> playerEntities = clientPlayNetworkHandler.getWorld().getPlayers();
        for(AbstractClientPlayerEntity player : playerEntities){
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100));
        }

    }


}