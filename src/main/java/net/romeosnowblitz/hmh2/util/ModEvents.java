package net.romeosnowblitz.hmh2.util;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.entity.blazing_inferno.BlazingInfernoEntity;
import net.romeosnowblitz.hmh2.entity.mites.ashmite.AshmiteEntity;

import java.util.Random;


public class ModEvents {

    public static void registerModEvents() {
        registerPlayerHit();
        registerBlazingInfernoSummon();
        registerWitherSkeletonHit();
    }

    public static void registerPlayerHit() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if(!player.isSpectator() && entity instanceof PlayerEntity attackedPlayer && attackedPlayer.hasStatusEffect(CustomEffects.NECROMANCER)){
                int x = attackedPlayer.experienceLevel/100+1;
                attackedPlayer.addExperienceLevels(-x);
                player.addExperienceLevels(x);
            }
            if(!player.isSpectator() && player instanceof ServerPlayerEntity &&  entity instanceof ServerPlayerEntity){
                world.getServer().getPlayerManager().broadcast(Text.literal(player.getName().getString() + " just hurt " + entity.getName().getString()), false);
            }
            return ActionResult.PASS;
        });
    }

    public static void registerBlazingInfernoSummon() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            Random random = new Random();
            if(player instanceof ServerPlayerEntity serverPlayer && entity instanceof BlazeEntity){
                int x = serverPlayer.getStatHandler().getStat(Stats.KILLED.getOrCreateStat(EntityType.BLAZE));
                int y = x+101;
                int z = random.nextInt(y);
                if(x<=10 && x != 0){
                    int f = random.nextInt(10)+1;
                    if(f==1){
                        BlazingInfernoEntity summoningEntity = ModEntities.BLAZING_INFERNO.create(world);
                        summoningEntity.refreshPositionAndAngles((entity.getX() + player.getX())/2,(entity.getY() + player.getY())/2, (entity.getZ() + player.getZ())/2, 0.0f, 0.0f);
                        summoningEntity.getWorld().spawnEntity(summoningEntity);
                    }
                } else if (x>10 && z<x){
                    BlazingInfernoEntity summoningEntity = ModEntities.BLAZING_INFERNO.create(world);
                    summoningEntity.refreshPositionAndAngles((entity.getX() + player.getX())/2,(entity.getY() + player.getY())/2, (entity.getZ() + player.getZ())/2, 0.0f, 0.0f);
                    summoningEntity.getWorld().spawnEntity(summoningEntity);
                }
            }
            return ActionResult.PASS;
        });
    }

    public static void registerWitherSkeletonHit() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            Random random = new Random();
            int i = random.nextInt(1000)+ 1;
            if(player instanceof ServerPlayerEntity serverPlayer && entity instanceof WitherSkeletonEntity){
                int x = serverPlayer.getStatHandler().getStat(Stats.KILLED.getOrCreateStat(EntityType.WITHER_SKELETON));
                if (x > i){ModEntities.ASHMITE.spawn((ServerWorld) world, entity.getBlockPos(), SpawnReason.MOB_SUMMONED);}
            }
            return ActionResult.PASS;
        });
    }

}
