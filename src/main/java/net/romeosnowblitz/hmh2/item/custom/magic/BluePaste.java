package net.romeosnowblitz.hmh2.item.custom.magic;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.entity.monster.lost_soul.LostSoulEntity;
import net.romeosnowblitz.hmh2.item.ModItems;

import java.util.Random;

public class BluePaste extends Item {
    public BluePaste(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if(entity instanceof LostSoulEntity lostSoul){
            lostSoul.convertTo(ModEntities.WISP, true);
        }
        return super.useOnEntity(stack, user, entity, hand);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        if(!player.hasStatusEffect(CustomEffects.NECROMANCER) && player.getMainHandStack().isOf(this)){
            player.giveItemStack(ModItems.ASHES.getDefaultStack());player.getMainHandStack().decrement(1);player.addExperienceLevels(1);
        }
        if(!world.isClient()&&player.hasStatusEffect(CustomEffects.NECROMANCER)){
            if(player.experienceLevel >= 0 && player.experienceLevel<=19){
                Random random = new Random();int a = random.nextInt(13);
                if(a==1){EntityType.BAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.BEE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==3){EntityType.CAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==4){EntityType.COD.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==5){EntityType.COW.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==6){EntityType.CHICKEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==7){EntityType.GOAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==8){EntityType.PIG.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==9){EntityType.RABBIT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==10){EntityType.SHEEP.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==11){EntityType.SQUID.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==12){EntityType.TURTLE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(10);
                    if(b==1){EntityType.AXOLOTL.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.FOX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.OCELOT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.PANDA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==5){EntityType.PARROT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==6){EntityType.POLAR_BEAR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==7){EntityType.SALMON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==8){EntityType.TROPICAL_FISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==9){EntityType.WOLF.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(9);
                        if(c==1){EntityType.ALLAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.CAMEL.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==3){EntityType.DOLPHIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==4){EntityType.DONKEY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==5){EntityType.HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==6){EntityType.LLAMA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==7){EntityType.PUFFERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==8){EntityType.STRIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==0){int d = random.nextInt(8);
                            if(d==1){EntityType.MOOSHROOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==2){EntityType.MULE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==3){EntityType.SKELETON_HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==4){EntityType.SNIFFER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==5){EntityType.TADPOLE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==6){EntityType.TRADER_LLAMA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==7){EntityType.ZOMBIE_HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==0) {int e = random.nextInt(4);
                                if(e==0){EntityType.IRON_GOLEM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==1){EntityType.SNOW_GOLEM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==2){EntityType.VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==3){EntityType.WANDERING_TRADER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            }
                        }
                    }
                }
            }
            if(player.experienceLevel >= 20 && player.experienceLevel<=39){
                Random random = new Random();int a = random.nextInt(10);
                if(a==1){EntityType.AXOLOTL.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.FOX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==3){EntityType.OCELOT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==4){EntityType.PANDA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==5){EntityType.PARROT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==6){EntityType.POLAR_BEAR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==7){EntityType.SALMON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==8){EntityType.TROPICAL_FISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==9){EntityType.WOLF.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(21);
                    if(b==1){EntityType.BAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.BEE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.CAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.COD.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==5){EntityType.COW.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==6){EntityType.CHICKEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==7){EntityType.GOAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==8){EntityType.PIG.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==9){EntityType.RABBIT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==10){EntityType.SHEEP.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==11){EntityType.SQUID.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==12){EntityType.TURTLE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==13){EntityType.ALLAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==14){EntityType.CAMEL.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==15){EntityType.DOLPHIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==16){EntityType.DONKEY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==17){EntityType.HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==18){EntityType.LLAMA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==19){EntityType.PUFFERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==20){EntityType.STRIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(9);
                        if(c==1){EntityType.MOOSHROOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.MULE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==3){EntityType.SKELETON_HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==4){EntityType.SNIFFER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==5){EntityType.TADPOLE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==6){EntityType.TRADER_LLAMA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==7){EntityType.ZOMBIE_HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==0){int d = random.nextInt(8);
                            if(d==0){EntityType.IRON_GOLEM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==1){EntityType.SNOW_GOLEM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==2){EntityType.VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==3){EntityType.WANDERING_TRADER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        }
                    }
                }
            }
            if(player.experienceLevel >= 40 && player.experienceLevel<=59){
                Random random = new Random();int a = random.nextInt(9);
                if(a==1){EntityType.ALLAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.CAMEL.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==3){EntityType.DOLPHIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==4){EntityType.DONKEY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==5){EntityType.HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==6){EntityType.LLAMA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==7){EntityType.PUFFERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==8){EntityType.STRIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(17);
                    if(b==1){EntityType.AXOLOTL.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.FOX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.OCELOT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.PANDA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==5){EntityType.PARROT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==6){EntityType.POLAR_BEAR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==7){EntityType.SALMON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==8){EntityType.TROPICAL_FISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==9){EntityType.WOLF.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==10){EntityType.MOOSHROOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==11){EntityType.MULE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==12){EntityType.SKELETON_HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==13){EntityType.SNIFFER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==14){EntityType.TADPOLE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==15){EntityType.TRADER_LLAMA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==16){EntityType.ZOMBIE_HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(17);
                        if(c==0){EntityType.BAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==1){EntityType.BEE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.CAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==3){EntityType.COD.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==4){EntityType.COW.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==5){EntityType.CHICKEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==6){EntityType.GOAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==7){EntityType.PIG.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==8){EntityType.RABBIT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==9){EntityType.SHEEP.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==10){EntityType.SQUID.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==11){EntityType.TURTLE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==12){EntityType.IRON_GOLEM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==13){EntityType.SNOW_GOLEM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==14){EntityType.VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==15){EntityType.WANDERING_TRADER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    }
                }
            }
            if(player.experienceLevel >= 60 && player.experienceLevel<=79){
                Random random = new Random();int a = random.nextInt(8);
                if(a==1){EntityType.MOOSHROOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.MULE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==3){EntityType.SKELETON_HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==4){EntityType.SNIFFER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==5){EntityType.TADPOLE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==6){EntityType.TRADER_LLAMA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==7){EntityType.ZOMBIE_HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(13);
                    if(b==1){EntityType.ALLAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.CAMEL.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.DOLPHIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.DONKEY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==5){EntityType.HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==6){EntityType.LLAMA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==7){EntityType.PUFFERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==8){EntityType.STRIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==9){EntityType.IRON_GOLEM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==10){EntityType.SNOW_GOLEM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==11){EntityType.VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==12){EntityType.WANDERING_TRADER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(10);
                        if(c==1){EntityType.AXOLOTL.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.FOX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==3){EntityType.OCELOT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==4){EntityType.PANDA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==5){EntityType.PARROT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==6){EntityType.POLAR_BEAR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==7){EntityType.SALMON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==8){EntityType.TROPICAL_FISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==9){EntityType.WOLF.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==0){ int d = random.nextInt(12);
                            if(d==0){EntityType.BAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==1){EntityType.BEE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==2){EntityType.CAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==3){EntityType.COD.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==4){EntityType.COW.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==5){EntityType.CHICKEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==6){EntityType.GOAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==7){EntityType.PIG.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==8){EntityType.RABBIT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==9){EntityType.SHEEP.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==10){EntityType.SQUID.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==11){EntityType.TURTLE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        }
                    }
                }
            }
            if(player.experienceLevel >= 80){
                Random random = new Random();int a = random.nextInt(5);
                if(a==1){EntityType.IRON_GOLEM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.SNOW_GOLEM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==3){EntityType.VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==4){EntityType.WANDERING_TRADER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(8);
                    if(b==1){EntityType.MOOSHROOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.MULE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.SKELETON_HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.SNIFFER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==5){EntityType.TADPOLE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==6){EntityType.TRADER_LLAMA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==7){EntityType.ZOMBIE_HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(9);
                        if(c==1){EntityType.ALLAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.CAMEL.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==3){EntityType.DOLPHIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==4){EntityType.DONKEY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==5){EntityType.HORSE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==6){EntityType.LLAMA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==7){EntityType.PUFFERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==8){EntityType.STRIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==0){ int d = random.nextInt(10);
                            if(d==1){EntityType.AXOLOTL.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==2){EntityType.FOX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==3){EntityType.OCELOT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==4){EntityType.PANDA.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==5){EntityType.PARROT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==6){EntityType.POLAR_BEAR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==7){EntityType.SALMON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==8){EntityType.TROPICAL_FISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==9){EntityType.WOLF.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==0){int e = random.nextInt(12);
                                if(e==0){EntityType.BAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==1){EntityType.BEE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==2){EntityType.CAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==3){EntityType.COD.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==4){EntityType.COW.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==5){EntityType.CHICKEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==6){EntityType.GOAT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==7){EntityType.PIG.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==8){EntityType.RABBIT.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==9){EntityType.SHEEP.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==10){EntityType.SQUID.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==11){EntityType.TURTLE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            }
                        }
                    }
                }
            }
        }
        return super.useOnBlock(context);
    }

    public void summoningCost(PlayerEntity player){
        player.addExperienceLevels((-player.experienceLevel/50)+(-1));
        if(player.getMainHandStack().isOf(this)){player.getMainHandStack().decrement(1);}
        if(player.getOffHandStack().isOf(this)){player.getOffHandStack().decrement(1);}
    }


}
