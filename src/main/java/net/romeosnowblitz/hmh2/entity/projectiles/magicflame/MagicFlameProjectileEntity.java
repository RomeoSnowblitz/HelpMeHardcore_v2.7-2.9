package net.romeosnowblitz.hmh2.entity.projectiles.magicflame;

import net.minecraft.block.AbstractBlock;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.particle.ModParticleTypes;

public class MagicFlameProjectileEntity extends PersistentProjectileEntity {
    private static final TrackedData<Boolean> HIT = DataTracker.registerData(MagicFlameProjectileEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    private int counter = 0;

    public MagicFlameProjectileEntity(EntityType<? extends PersistentProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    public MagicFlameProjectileEntity(World world, PlayerEntity player) {
        super(ModEntities.MOD_PROJECTILE, world);
        setOwner(player);
        this.refreshPositionAndAngles(player.getBlockPos().getX() + 0.5D, player.getBlockPos().getY() + 1.75D, player.getBlockPos().getZ() + 0.5D, this.getYaw(), this.getPitch());
    }

    @Override
    public void tick() {
        super.tick();
        if(this.inGround) {this.discard();}
        if(this.dataTracker.get(HIT)) {if(this.age >= counter) {this.discard();}}
        if (this.age >= 300) {this.remove(RemovalReason.DISCARDED);}
        if (ProjectileUtil.getCollision(this, this::canHit).getType() != HitResult.Type.MISS)
        {this.onCollision(ProjectileUtil.getCollision(this, this::canHit));}
        double d0 = this.getX() + this.getVelocity().x; double d1 = this.getY() + this.getVelocity().y; double d2 = this.getZ() + this.getVelocity().z;
        this.updateRotation();
        double d5 = this.getVelocity().x; double d6 = this.getVelocity().y; double d7 = this.getVelocity().z;
        for(int i = 1; i < 2; ++i) {this.getWorld().addParticle(ModParticleTypes.PURPLE_FLAME, d0-(d5*2), d1-(d6*2), d2-(d7*2), -d5, -d6 - 0.1D, -d7);}
        if (this.getWorld().getStatesInBox(this.getBoundingBox()).noneMatch(AbstractBlock.AbstractBlockState::isAir)) {this.discard();
        } else if (this.isInsideWaterOrBubbleColumn()) {this.discard();
        } else {this.setVelocity(this.getVelocity().multiply(0.99F));this.setPos(d0, d1, d2);}
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        if(entityHitResult.getEntity() == this.getOwner() && this.getWorld().isClient()) {return;}
        this.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.NEUTRAL, 2F, 1F);
        entityHitResult.getEntity().damage(this.getDamageSources().mobProjectile(this, (LivingEntity) this.getOwner()), 10);
        for(int x = 0; x < 18; ++x) {for(int y = 0; y < 18; ++y) {
                this.getWorld().addParticle(ModParticleTypes.PURPLE_FLAME, this.getX(), this.getY(), this.getZ(), Math.cos(x*20) * 0.15d, Math.cos(y*20) * 0.15d, Math.sin(x*20) * 0.15d);
            }
        }
    }

    @Override
    protected ItemStack asItemStack() {return ItemStack.EMPTY;}

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        this.getWorld().getBlockState(blockHitResult.getBlockPos()).onProjectileHit(this.getWorld(), this.getWorld().getBlockState(blockHitResult.getBlockPos()), blockHitResult, this);
        //if(!getWorld().isClient()){this.getWorld().createExplosion(this.getOwner(), getBlockX(), getBlockY(), getZ(), 1, World.ExplosionSourceType.BLOCK);}
        for(int x = 0; x < 18; ++x) {for(int y = 0; y < 18; ++y) {
                this.getWorld().addParticle(ModParticleTypes.PURPLE_FLAME, this.getX(), this.getY(), this.getZ(), Math.cos(x*20) * 0.15d, Math.cos(y*20) * 0.15d, Math.sin(x*20) * 0.15d);
            }
        }
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if(this.getWorld().isClient()) {return;}
        if(hitResult.getType() == HitResult.Type.ENTITY && hitResult instanceof EntityHitResult entityHitResult) {
            if(this.getOwner() != entityHitResult.getEntity()) {this.dataTracker.set(HIT, true);counter = this.age + 5;}
        } else if(hitResult.getType() == HitResult.Type.BLOCK) {this.dataTracker.set(HIT, true);counter = this.age + 5;}
    }

    @Override
    public boolean hasNoGravity() {return true;}

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(HIT, false);
    }
}
