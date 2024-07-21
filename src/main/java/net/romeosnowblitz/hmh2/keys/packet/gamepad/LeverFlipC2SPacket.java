package net.romeosnowblitz.hmh2.keys.packet.gamepad;

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

public class LeverFlipC2SPacket {

    public static void leverFlipPressed(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender){
        if(CloseC2SPacket.open){
            if(CloseC2SPacket.option==0){
                BlockPos x = player.getBlockPos();
                if(player.getWorld().getDimension().bedWorks()) {
                    player.sendMessage(Text.literal("Overworld Position Has Been Saved!"));
                    player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_OVERWORLD_X));player.increaseStat(ModStats.NULL_SAVED_OVERWORLD_X, x.getX());
                    player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_OVERWORLD_Y));player.increaseStat(ModStats.NULL_SAVED_OVERWORLD_Y, x.getY());
                    player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_OVERWORLD_Z));player.increaseStat(ModStats.NULL_SAVED_OVERWORLD_Z, x.getZ());
                }
                if(player.getWorld().getDimension().ultrawarm()) {
                    player.sendMessage(Text.literal("Nether Position Has Been Saved!"));
                    player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_NETHER_X));player.increaseStat(ModStats.NULL_SAVED_NETHER_X, x.getX());
                    player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_NETHER_Y));player.increaseStat(ModStats.NULL_SAVED_NETHER_Y, x.getY());
                    player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_NETHER_Z));player.increaseStat(ModStats.NULL_SAVED_NETHER_Z, x.getZ());
                }
                if(!player.getWorld().getDimension().bedWorks() && !player.getWorld().getDimension().ultrawarm()) {
                    player.sendMessage(Text.literal("End Position Has Been Saved!"));
                    player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_END_X));player.increaseStat(ModStats.NULL_SAVED_END_X, x.getX());
                    player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_END_Y));player.increaseStat(ModStats.NULL_SAVED_END_Y, x.getY());
                    player.resetStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_END_Z));player.increaseStat(ModStats.NULL_SAVED_END_Z, x.getZ());
                }
            }
            if(CloseC2SPacket.option==1){
                if(!player.hasStatusEffect(StatusEffects.NIGHT_VISION)){
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1));
                    player.sendMessage(Text.literal("Night Vision Is On"));
                } else {
                    player.removeStatusEffect(StatusEffects.NIGHT_VISION);
                    player.sendMessage(Text.literal("Night Vision Is Off"));
                }
            }
            if(CloseC2SPacket.option==2){
                Random random = new Random();
                int g = random.nextInt(20)+1;
                 if(g==1){player.sendMessage(Text.literal("It is Certain"));}
                 if(g==2){player.sendMessage(Text.literal("It is Decidedly So"));}
                 if(g==3){player.sendMessage(Text.literal("Without a Doubt"));}
                 if(g==4){player.sendMessage(Text.literal("Yes Definitely"));}
                 if(g==5){player.sendMessage(Text.literal("You May Rely On It"));}
                 if(g==6){player.sendMessage(Text.literal("As I See It, Yes"));}
                 if(g==7){player.sendMessage(Text.literal("Most Likely"));}
                 if(g==8){player.sendMessage(Text.literal("Outlook Good"));}
                 if(g==9){player.sendMessage(Text.literal("Yes"));}
                if(g==10){player.sendMessage(Text.literal("Signs Point To Yes"));}
                if(g==11){player.sendMessage(Text.literal("Reply Hazy, Try Again"));}
                if(g==12){player.sendMessage(Text.literal("Ask Again Later"));}
                if(g==13){player.sendMessage(Text.literal("Better Not Tell You Now"));}
                if(g==14){player.sendMessage(Text.literal("Cannot Predict Now"));}
                if(g==15){player.sendMessage(Text.literal("Concentrate And Ask Again"));}
                if(g==16){player.sendMessage(Text.literal("Don't Count On It"));}
                if(g==17){player.sendMessage(Text.literal("My Reply Is No"));}
                if(g==18){player.sendMessage(Text.literal("My Sources Say No"));}
                if(g==19){player.sendMessage(Text.literal("Outlook Not So Good"));}
                if(g==20){player.sendMessage(Text.literal("Very Doubtful"));}
            }

        } else {
            CloseC2SPacket.open=true;
        }


    }

}
