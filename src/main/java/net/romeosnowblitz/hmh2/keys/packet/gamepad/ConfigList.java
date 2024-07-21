package net.romeosnowblitz.hmh2.keys.packet.gamepad;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;

public class ConfigList {

    public static void configurationList(PlayerEntity player) {
        if(CloseC2SPacket.option==0){player.sendMessage(Text.of("Set Null Passer Coordinates? (Item Not Required)"));}
        if(CloseC2SPacket.option==1){player.sendMessage(Text.of("Flip Night Vision?"));}
        if(CloseC2SPacket.option==2){player.sendMessage(Text.of("Ask Magic 8-Ball?"));}
    }


}
