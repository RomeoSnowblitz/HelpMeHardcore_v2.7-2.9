package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameMode;
import net.minecraft.world.SaveProperties;
import net.minecraft.world.World;
import net.minecraft.world.level.ServerWorldProperties;

public class SunStone extends Item {

    public SunStone(Settings settings){
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND){
            world.getServer().getOverworld().setTimeOfDay(6000L);
        }
        return super.use(world, user, hand);
    }

    private void setToDebugWorldProperties(SaveProperties properties) {
        properties.setDifficulty(Difficulty.PEACEFUL);
        properties.setDifficultyLocked(true);
        properties.setGameMode(GameMode.SURVIVAL);
        ServerWorldProperties serverWorldProperties = properties.getMainWorldProperties();
        serverWorldProperties.setRaining(false);
        serverWorldProperties.setThundering(false);
        serverWorldProperties.setClearWeatherTime(1000000000);
        serverWorldProperties.setTimeOfDay(6000L);
        serverWorldProperties.setGameMode(GameMode.SURVIVAL);
    }

}
