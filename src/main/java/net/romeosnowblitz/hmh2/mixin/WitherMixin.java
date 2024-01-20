package net.romeosnowblitz.hmh2.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.util.ModRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WitherEntity.class)
public abstract class WitherMixin extends HostileEntity {
    protected WitherMixin(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "mobTick", at = @At("HEAD"))
    private void newMobTick(CallbackInfo ci) {
        ModRegistries.antiBossFarm(0, this);
        Entity entity = this.getLastAttacker();
        if(entity != null && entity.isPlayer()) {int i = random.nextInt(300);
            if (i == 0){EntityType.WITHER_SKELETON.spawn((ServerWorld) this.getWorld(), this.getBlockPos(), SpawnReason.MOB_SUMMONED);}
        }
    }




}
