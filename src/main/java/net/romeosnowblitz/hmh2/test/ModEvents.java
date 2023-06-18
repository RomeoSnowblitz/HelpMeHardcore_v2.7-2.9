package net.romeosnowblitz.hmh2.test;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

import java.util.Objects;


public class ModEvents {

    public static void registerModEvents() {
        registerPlayerHit();
        //registerTest();
    }

    public static void registerPlayerHit() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if(entity instanceof PlayerEntity && player.getWorld().isClient) {
                MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(Text.of(player.getName().getString() + " Is Hurting " + entity.getName().getString()));
            }
            return ActionResult.PASS;
        });
    }


    public static void registerTest() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if(!world.isClient()
                    && entity instanceof SheepEntity
                    && player instanceof ServerPlayerEntity serverPlayer
                    && serverPlayer.getStatHandler().getStat(Stats.KILLED, EntityType.SHEEP) == 5 ) {
                SheepEntity summoning = EntityType.SHEEP.create(world);
                summoning.refreshPositionAndAngles(entity.getX() + 0.5, entity.getY(), entity.getZ() + 0.5, 0.0f, 0.0f);
                world.spawnEntity(summoning);
                summoning.playSpawnEffects();
            }
            return ActionResult.PASS;
        });
    }



}
