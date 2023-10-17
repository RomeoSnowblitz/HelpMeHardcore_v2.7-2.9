package net.romeosnowblitz.hmh2.item.custom.magic;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.entity.lost_soul.LostSoulEntity;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.item.WarfareItems;

import java.util.Random;

public class PurplePaste extends Item {
    public PurplePaste(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if(entity instanceof LostSoulEntity lostSoul){
            lostSoul.convertTo(ModEntities.DEMON, true);
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
        if(!world.isClient() && player.hasStatusEffect(CustomEffects.NECROMANCER)){
            int x = player.experienceLevel;
            player.sendMessage(Text.literal(String.valueOf(x)));
            if(player.experienceLevel >= 0 && player.experienceLevel <= 9){
                Random random = new Random();int a = random.nextInt(6);
                if(a==1){EntityType.ENDERMITE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.MAGMA_CUBE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==3){EntityType.SILVERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==4){EntityType.SLIME.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==5){EntityType.SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(6);
                    if(b==1){EntityType.CAVE_SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.DROWNED.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.HUSK.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.ZOMBIE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==5){EntityType.ZOMBIE_VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(6);
                        if(c==1){EntityType.PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.PILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==3){EntityType.VINDICATOR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==4){EntityType.WITCH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==5){EntityType.ZOMBIFIED_PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==0){int d = random.nextInt(5);
                            if(d==1){EntityType.CREEPER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==2){EntityType.SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==3){EntityType.STRAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==4){EntityType.WITHER_SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==0) {int e = random.nextInt(3);
                                if(e==1){EntityType.HOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==2){EntityType.ZOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==0){int f = random.nextInt(3);
                                    if(f==1){EntityType.GHAST.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==2){EntityType.PHANTOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==0) {int g = random.nextInt(3);
                                        if(g==1){EntityType.BLAZE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==2){EntityType.VEX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==0) {int h = random.nextInt(3);
                                            if(h==1){EntityType.ENDERMAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==2){EntityType.SHULKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==0) {int i = random.nextInt(6);
                                                if(i==1){EntityType.ELDER_GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==2){EntityType.EVOKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==3){EntityType.GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==4){EntityType.ILLUSIONER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==5){EntityType.RAVAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==0) {int j = random.nextInt(3);
                                                    if(j==0){EntityType.PIGLIN_BRUTE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                    if(j==1){EntityType.WARDEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                    if(j==2){EntityType.WITHER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(player.experienceLevel >= 10 && player.experienceLevel <= 19){
                Random random = new Random();int a = random.nextInt(6);
                if(a==1){EntityType.CAVE_SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.DROWNED.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==3){EntityType.HUSK.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==4){EntityType.ZOMBIE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==5){EntityType.ZOMBIE_VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(11);
                    if(b==1){EntityType.ENDERMITE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.MAGMA_CUBE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.SILVERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.SLIME.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==5){EntityType.SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==6){EntityType.PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==7){EntityType.PILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==8){EntityType.VINDICATOR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==9){EntityType.WITCH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==10){EntityType.ZOMBIFIED_PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(5);
                        if(c==1){EntityType.CREEPER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==3){EntityType.STRAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==4){EntityType.WITHER_SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==0){int d = random.nextInt(3);
                            if(d==1){EntityType.HOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==2){EntityType.ZOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==0) {int e = random.nextInt(3);
                                if(e==1){EntityType.GHAST.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==2){EntityType.PHANTOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==0){int f = random.nextInt(3);
                                    if(f==1){EntityType.BLAZE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==2){EntityType.VEX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==0) {int g = random.nextInt(3);
                                        if(g==1){EntityType.ENDERMAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==2){EntityType.SHULKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==0) {int h = random.nextInt(6);
                                            if(h==1){EntityType.ELDER_GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==2){EntityType.EVOKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==3){EntityType.GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==4){EntityType.ILLUSIONER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==5){EntityType.RAVAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==0) {int i = random.nextInt(3);
                                                if(i==0){EntityType.PIGLIN_BRUTE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==1){EntityType.WARDEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==2){EntityType.WITHER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(player.experienceLevel >= 20 && player.experienceLevel <= 29){
                Random random = new Random();int a = random.nextInt(6);
                if(a==1){EntityType.PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.PILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==3){EntityType.VINDICATOR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==4){EntityType.WITCH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==5){EntityType.ZOMBIFIED_PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(10);
                    if(b==1){EntityType.CAVE_SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.DROWNED.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.HUSK.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.ZOMBIE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==5){EntityType.ZOMBIE_VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==6){EntityType.CREEPER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==7){EntityType.SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==8){EntityType.STRAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==9){EntityType.WITHER_SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(8);
                        if(c==1){EntityType.ENDERMITE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.MAGMA_CUBE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==3){EntityType.SILVERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==4){EntityType.SLIME.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==5){EntityType.SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==6){EntityType.HOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==7){EntityType.ZOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==0){int d = random.nextInt(3);
                            if(d==1){EntityType.GHAST.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==2){EntityType.PHANTOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==0) {int e = random.nextInt(3);
                                if(e==1){EntityType.BLAZE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==2){EntityType.VEX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==0){int f = random.nextInt(3);
                                    if(f==1){EntityType.ENDERMAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==2){EntityType.SHULKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==0) {int g = random.nextInt(6);
                                        if(g==1){EntityType.ELDER_GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==2){EntityType.EVOKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==3){EntityType.GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==4){EntityType.ILLUSIONER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==5){EntityType.RAVAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==0) {int h = random.nextInt(3);
                                            if(h==0){EntityType.PIGLIN_BRUTE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==1){EntityType.WARDEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==2){EntityType.WITHER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(player.experienceLevel >= 30 && player.experienceLevel <= 39){
                Random random = new Random();int a = random.nextInt(5);
                if(a==1){EntityType.CREEPER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==3){EntityType.STRAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==4){EntityType.WITHER_SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(8);
                    if(b==1){EntityType.PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.PILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.VINDICATOR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.WITCH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==5){EntityType.ZOMBIFIED_PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==6){EntityType.HOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==7){EntityType.ZOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(8);
                        if(c==1){EntityType.CAVE_SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.DROWNED.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==3){EntityType.HUSK.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==4){EntityType.ZOMBIE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==5){EntityType.ZOMBIE_VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==6){EntityType.GHAST.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==7){EntityType.PHANTOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==0){int d = random.nextInt(8);
                            if(d==1){EntityType.ENDERMITE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==2){EntityType.MAGMA_CUBE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==3){EntityType.SILVERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==4){EntityType.SLIME.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==5){EntityType.SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==6){EntityType.BLAZE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==7){EntityType.VEX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==0) {int e = random.nextInt(3);
                                if(e==1){EntityType.ENDERMAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==2){EntityType.SHULKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==0){int f = random.nextInt(6);
                                    if(f==1){EntityType.ELDER_GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==2){EntityType.EVOKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==3){EntityType.GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==4){EntityType.ILLUSIONER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==5){EntityType.RAVAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==0) {int g = random.nextInt(3);
                                        if(g==0){EntityType.PIGLIN_BRUTE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==1){EntityType.WARDEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==2){EntityType.WITHER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(player.experienceLevel >= 40 && player.experienceLevel <= 49){
                Random random = new Random();int a = random.nextInt(3);
                if(a==1){EntityType.HOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.ZOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(7);
                    if(b==1){EntityType.CREEPER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.STRAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.WITHER_SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==5){EntityType.GHAST.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==6){EntityType.PHANTOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(8);
                        if(c==1){EntityType.PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.PILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==3){EntityType.VINDICATOR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==4){EntityType.WITCH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==5){EntityType.ZOMBIFIED_PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==6){EntityType.BLAZE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==7){EntityType.VEX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==0){int d = random.nextInt(8);
                            if(d==1){EntityType.CAVE_SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==2){EntityType.DROWNED.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==3){EntityType.HUSK.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==4){EntityType.ZOMBIE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==5){EntityType.ZOMBIE_VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==6){EntityType.ENDERMAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==7){EntityType.SHULKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==0) {int e = random.nextInt(11);
                                if(e==1){EntityType.ENDERMITE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==2){EntityType.MAGMA_CUBE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==3){EntityType.SILVERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==4){EntityType.SLIME.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==5){EntityType.SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==6){EntityType.ELDER_GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==7){EntityType.EVOKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==8){EntityType.GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==9){EntityType.ILLUSIONER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==10){EntityType.RAVAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==0){int f = random.nextInt(3);
                                    if(f==0){EntityType.PIGLIN_BRUTE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==1){EntityType.WARDEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==2){EntityType.WITHER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                }
                            }
                        }
                    }
                }
            }
            if(player.experienceLevel >= 50 && player.experienceLevel <= 59){
                Random random = new Random();int a = random.nextInt(3);
                if(a==1){EntityType.GHAST.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.PHANTOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(5);
                    if(b==1){EntityType.HOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.ZOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.BLAZE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.VEX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(7);
                        if(c==1){EntityType.CREEPER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==3){EntityType.STRAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==4){EntityType.WITHER_SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==5){EntityType.ENDERMAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==6){EntityType.SHULKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==0){int d = random.nextInt(11);
                            if(d==1){EntityType.PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==2){EntityType.PILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==3){EntityType.VINDICATOR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==4){EntityType.WITCH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==5){EntityType.ZOMBIFIED_PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==6){EntityType.ELDER_GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==7){EntityType.EVOKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==8){EntityType.GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==9){EntityType.ILLUSIONER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==10){EntityType.RAVAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==0) {int e = random.nextInt(9);
                                if(e==1){EntityType.CAVE_SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==2){EntityType.DROWNED.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==3){EntityType.HUSK.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==4){EntityType.ZOMBIE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==5){EntityType.ZOMBIE_VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==6){EntityType.PIGLIN_BRUTE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==7){EntityType.WARDEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==8){EntityType.WITHER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==0){int f = random.nextInt(6);
                                    if(f==1){EntityType.ENDERMITE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==2){EntityType.MAGMA_CUBE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==3){EntityType.SILVERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==4){EntityType.SLIME.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==5){EntityType.SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                }
                            }
                        }
                    }
                }
            }
            if(player.experienceLevel >= 60 && player.experienceLevel <= 69){
                Random random = new Random();int a = random.nextInt(3);
                if(a==1){EntityType.BLAZE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.VEX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(5);
                    if(b==1){EntityType.GHAST.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.PHANTOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.ENDERMAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.SHULKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(8);
                        if(c==1){EntityType.HOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.ZOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==3){EntityType.ELDER_GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==4){EntityType.EVOKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==5){EntityType.GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==6){EntityType.ILLUSIONER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==7){EntityType.RAVAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==0){int d = random.nextInt(8);
                            if(d==1){EntityType.CREEPER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==2){EntityType.SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==3){EntityType.STRAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==4){EntityType.WITHER_SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==5){EntityType.PIGLIN_BRUTE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==6){EntityType.WARDEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==7){EntityType.WITHER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==0) {int e = random.nextInt(6);
                                if(e==1){EntityType.PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==2){EntityType.PILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==3){EntityType.VINDICATOR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==4){EntityType.WITCH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==5){EntityType.ZOMBIFIED_PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==0){int f = random.nextInt(6);
                                    if(f==1){EntityType.CAVE_SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==2){EntityType.DROWNED.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==3){EntityType.HUSK.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==4){EntityType.ZOMBIE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==5){EntityType.ZOMBIE_VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==0){int g = random.nextInt(6);
                                        if(g==1){EntityType.ENDERMITE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==2){EntityType.MAGMA_CUBE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==3){EntityType.SILVERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==4){EntityType.SLIME.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==5){EntityType.SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(player.experienceLevel >= 70 && player.experienceLevel <= 79){
                Random random = new Random();int a = random.nextInt(3);
                if(a==1){EntityType.ENDERMAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.SHULKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(8);
                    if(b==1){EntityType.BLAZE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.VEX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.ELDER_GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.EVOKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==5){EntityType.GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==6){EntityType.ILLUSIONER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==7){EntityType.RAVAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(6);
                        if(c==1){EntityType.GHAST.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.PHANTOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==3){EntityType.PIGLIN_BRUTE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==4){EntityType.WARDEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==5){EntityType.WITHER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==0){int d = random.nextInt(3);
                            if(d==1){EntityType.HOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==2){EntityType.ZOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==0) {int e = random.nextInt(5);
                                if(e==1){EntityType.CREEPER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==2){EntityType.SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==3){EntityType.STRAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==4){EntityType.WITHER_SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==0){int f = random.nextInt(6);
                                    if(f==1){EntityType.PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==2){EntityType.PILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==3){EntityType.VINDICATOR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==4){EntityType.WITCH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==5){EntityType.ZOMBIFIED_PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==0){int g = random.nextInt(6);
                                        if(g==1){EntityType.CAVE_SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==2){EntityType.DROWNED.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==3){EntityType.HUSK.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==4){EntityType.ZOMBIE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==5){EntityType.ZOMBIE_VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==0){int h = random.nextInt(6);
                                            if(h==1){EntityType.ENDERMITE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==2){EntityType.MAGMA_CUBE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==3){EntityType.SILVERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==4){EntityType.SLIME.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==5){EntityType.SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(player.experienceLevel >= 80 && player.experienceLevel <= 89){
                Random random = new Random();int a = random.nextInt(6);
                if(a==1){EntityType.ELDER_GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.EVOKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==3){EntityType.GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==4){EntityType.ILLUSIONER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==5){EntityType.RAVAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(6);
                    if(b==1){EntityType.ENDERMAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.SHULKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.PIGLIN_BRUTE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.WARDEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==5){EntityType.WITHER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(3);
                        if(c==1){EntityType.BLAZE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.VEX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==0){int d = random.nextInt(3);
                            if(d==1){EntityType.GHAST.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==2){EntityType.PHANTOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==0) {int e = random.nextInt(3);
                                if(e==1){EntityType.HOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==2){EntityType.ZOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==0){int f = random.nextInt(5);
                                    if(f==1){EntityType.CREEPER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==2){EntityType.SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==3){EntityType.STRAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==4){EntityType.WITHER_SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==0){int g = random.nextInt(6);
                                        if(g==1){EntityType.PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==2){EntityType.PILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==3){EntityType.VINDICATOR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==4){EntityType.WITCH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==5){EntityType.ZOMBIFIED_PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==0){int h = random.nextInt(6);
                                            if(h==1){EntityType.CAVE_SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==2){EntityType.DROWNED.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==3){EntityType.HUSK.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==4){EntityType.ZOMBIE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==5){EntityType.ZOMBIE_VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==0){int i = random.nextInt(6);
                                                if(i==1){EntityType.ENDERMITE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==2){EntityType.MAGMA_CUBE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==3){EntityType.SILVERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==4){EntityType.SLIME.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==5){EntityType.SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(player.experienceLevel >= 90){
                Random random = new Random();int a = random.nextInt(4);
                if(a==1){EntityType.PIGLIN_BRUTE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==2){EntityType.WARDEN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==3){EntityType.WITHER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                if(a==0){int b = random.nextInt(6);
                    if(b==1){EntityType.ELDER_GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==2){EntityType.EVOKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==3){EntityType.GUARDIAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==4){EntityType.ILLUSIONER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==5){EntityType.RAVAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                    if(b==0){int c = random.nextInt(3);
                        if(c==1){EntityType.ENDERMAN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==2){EntityType.SHULKER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                        if(c==0){int d = random.nextInt(3);
                            if(d==1){EntityType.BLAZE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==2){EntityType.VEX.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                            if(d==0) {int e = random.nextInt(3);
                                if(e==1){EntityType.GHAST.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==2){EntityType.PHANTOM.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                if(e==0){int f = random.nextInt(3);
                                    if(f==1){EntityType.HOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==2){EntityType.ZOGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                    if(f==0){int g = random.nextInt(5);
                                        if(g==1){EntityType.CREEPER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==2){EntityType.SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==3){EntityType.STRAY.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==4){EntityType.WITHER_SKELETON.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                        if(g==0){int h = random.nextInt(6);
                                            if(h==1){EntityType.PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==2){EntityType.PILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==3){EntityType.VINDICATOR.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==4){EntityType.WITCH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==5){EntityType.ZOMBIFIED_PIGLIN.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                            if(h==0){int i = random.nextInt(6);
                                                if(i==1){EntityType.CAVE_SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==2){EntityType.DROWNED.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==3){EntityType.HUSK.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==4){EntityType.ZOMBIE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==5){EntityType.ZOMBIE_VILLAGER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                if(i==0){int j = random.nextInt(6);
                                                    if(j==1){EntityType.ENDERMITE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                    if(j==2){EntityType.MAGMA_CUBE.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                    if(j==3){EntityType.SILVERFISH.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                    if(j==4){EntityType.SLIME.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                    if(j==5){EntityType.SPIDER.spawn((ServerWorld) world, pos.up(), SpawnReason.TRIGGERED);summoningCost(player);}
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return super.useOnBlock(context);
    }

    public void summoningCost(PlayerEntity player){
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 200));
        player.addExperienceLevels((-player.experienceLevel/10)+(-1));
        if(player.getMainHandStack().isOf(this)){player.getMainHandStack().decrement(1);}
        if(player.getOffHandStack().isOf(this)){player.getOffHandStack().decrement(1);}
    }



}
