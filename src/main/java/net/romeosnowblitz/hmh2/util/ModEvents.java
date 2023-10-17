package net.romeosnowblitz.hmh2.util;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.entity.blazing_inferno.BlazingInfernoEntity;
import net.romeosnowblitz.hmh2.entity.mites.ashmite.AshmiteEntity;

import java.util.Random;


public class ModEvents {

    public static void registerModEvents() {
        registerEntityHit();
        registerPlayerHit();
        registerBlazingInfernoSummon();
        registerWitherSkeletonHit();
        registerWitherHit();
    }

    public static void registerEntityHit() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if(!player.hasStatusEffect(CustomEffects.NORMIE)){
                player.addStatusEffect(new StatusEffectInstance(CustomEffects.NORMIE,  -1,  0, false, false, true));
            }
            return ActionResult.PASS;
        });
    }
    public static void registerPlayerHit() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if(entity instanceof PlayerEntity attackedPlayer &&  attackedPlayer.hasStatusEffect(CustomEffects.NECROMANCER)){
                int x = attackedPlayer.experienceLevel/100+1;
                attackedPlayer.addExperienceLevels(-x);
                player.addExperienceLevels(x);
            }
            if(player instanceof ServerPlayerEntity &&  entity instanceof ServerPlayerEntity){
                world.getServer().getPlayerManager().broadcast(Text.literal(player.getName().getString() + " just hurt " + entity.getName().getString()), false);
            }
            return ActionResult.PASS;
        });
    }

    public static void registerBlazingInfernoSummon() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            Random random = new Random();
            int i = random.nextInt(50 + 1);
            if(player instanceof ServerPlayerEntity serverPlayer && entity instanceof BlazeEntity){
                int x = serverPlayer.getStatHandler().getStat(Stats.KILLED.getOrCreateStat(EntityType.BLAZE));
                if (x > i){entity.kill(); BlazingInfernoEntity summoningEntity = ModEntities.BLAZING_INFERNO.create(world);
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
            int i = random.nextInt(1000 + 1);
            int i2 = random.nextInt(1000 + 1);
            if(player instanceof ServerPlayerEntity serverPlayer && entity instanceof WitherSkeletonEntity){
                int x = serverPlayer.getStatHandler().getStat(Stats.KILLED.getOrCreateStat(EntityType.WITHER_SKELETON));
                if (x > i){player.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 60, 0));}
                if (x > i2){
                    AshmiteEntity summoningEntity = ModEntities.ASHMITE.create(world);
                    summoningEntity.refreshPositionAndAngles((entity.getX() + player.getX())/2,(entity.getY() + player.getY())/2, (entity.getZ() + player.getZ())/2, 0.0f, 0.0f);
                    summoningEntity.getWorld().spawnEntity(summoningEntity);
                }
            }
            return ActionResult.PASS;
        });
    }

    public static void registerWitherHit() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            Random random = new Random(); int i = random.nextInt(9);
            if(entity instanceof WitherEntity wither){
                if (i==1){wither.teleport(wither.getX(), wither.getY()-1, wither.getZ());}
                if (i == 0){
                    WitherSkeletonEntity summoningEntity = EntityType.WITHER_SKELETON.create(world);
                    summoningEntity.refreshPositionAndAngles((entity.getX() + player.getX())/2,(entity.getY() + player.getY())/2, (entity.getZ() + player.getZ())/2, 0.0f, 0.0f);
                    summoningEntity.getWorld().spawnEntity(summoningEntity);
                }
            }
            return ActionResult.PASS;
        });
    }
}
