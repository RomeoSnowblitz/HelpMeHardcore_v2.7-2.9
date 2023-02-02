package net.romeosnowblitz.hmh2.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.*;
import net.minecraft.world.level.ServerWorldProperties;

public class RevivalStone extends Item {
    public RevivalStone(Settings settings){
        super(settings);
    }



    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND){
            world.getServer().getOverworld().setTimeOfDay(3000L);
            world.getServer().setDefaultGameMode(GameMode.SURVIVAL);
            user.getServer().setDefaultGameMode(GameMode.SURVIVAL);
            if(!user.isCreative()){
                user.requestRespawn();
                user.isSpectator();
            }
        }

        return super.use(world, user, hand);
    }



    private void setToDebugWorldProperties(SaveProperties properties) {
        properties.setDifficulty(Difficulty.PEACEFUL);
        properties.setDifficultyLocked(true);
        ServerWorldProperties serverWorldProperties = properties.getMainWorldProperties();
        serverWorldProperties.setRaining(false);
        serverWorldProperties.setThundering(false);
        serverWorldProperties.setClearWeatherTime(1000000000);
        serverWorldProperties.setTimeOfDay(6000L);
        serverWorldProperties.setGameMode(GameMode.SPECTATOR);
    }

}
