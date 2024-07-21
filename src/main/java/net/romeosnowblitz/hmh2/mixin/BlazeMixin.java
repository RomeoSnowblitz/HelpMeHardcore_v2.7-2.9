package net.romeosnowblitz.hmh2.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.mob.GhastEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.tag.EntityTypeTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.entity.boss.blazing_inferno.BlazingInfernoEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;
import java.util.Random;

@Mixin(BlazeEntity.class)
public class BlazeMixin extends HostileEntity {
    protected BlazeMixin(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "createBlazeAttributes", at = @At("HEAD"), cancellable = true)
    private static void createBlazeAttributes(CallbackInfoReturnable<DefaultAttributeContainer.Builder> cir) {
        cir.setReturnValue(HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 64.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 6.0D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.23D)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 48.0D)
        );
    }

    @Inject(method = "mobTick", at = @At("HEAD"))
    private void newTick(CallbackInfo ci){
        if(this.getRecentDamageSource() != null){
            if(this.getRecentDamageSource().getSource() != null){
                if(this.getRecentDamageSource().getSource().getType() != null){
                    if(this.getRecentDamageSource().getSource().getType().isIn(EntityTypeTags.IMPACT_PROJECTILES)){
                        this.convertTo(ModEntities.BLAZING_INFERNO, true);
                    }
                }
                if(this.getRecentDamageSource().getSource().isPlayer() && this.getWorld().getTimeOfDay() % 60 == 0){
                    ServerPlayerEntity serverPlayer = (ServerPlayerEntity) this.getRecentDamageSource().getAttacker();
                    int x = serverPlayer.getStatHandler().getStat(Stats.KILLED.getOrCreateStat(EntityType.BLAZE));
                    int y = x+101;
                    int z = random.nextInt(y);
                    if(x<=10 && x != 0){
                        int f = random.nextInt(10)+1;
                        if(f==1){
                            this.convertTo(ModEntities.BLAZING_INFERNO, true);
                        }
                    } else if (x>10 && z<x){
                        this.convertTo(ModEntities.BLAZING_INFERNO, true);
                    }
                }
            }
        }
    }

}
