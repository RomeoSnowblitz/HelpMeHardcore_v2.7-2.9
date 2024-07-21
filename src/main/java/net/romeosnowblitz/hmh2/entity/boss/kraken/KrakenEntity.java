package net.romeosnowblitz.hmh2.entity.boss.kraken;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.ai.goal.AttackGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.SchoolingFishEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class KrakenEntity extends SchoolingFishEntity {
    final AnimationState idleAnimationState = new AnimationState();
    private final ServerBossBar bossBar = (ServerBossBar)new ServerBossBar(this.getDisplayName(), BossBar.Color.BLUE, BossBar.Style.PROGRESS).setDragonMusic(false).setDarkenSky(true);
    private int idleAnimationTimeout = 0;

    public KrakenEntity(EntityType<? extends SchoolingFishEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return TameableEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 200.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1.0f);
    }

    @Override
    public void tick() {
        super.tick();
        this.getWorld().setRainGradient(1f);
        Entity entity = this.getTarget();
        if(entity != null){
            if(this.isInRange(entity, 10)){
                this.setVelocity(this.getVelocity().multiply(1.1D));
            }
        }
        if(entity instanceof PlayerEntity player){
            if(player.getLastAttacker() == this && this.age % 200 == 0){
                LightningEntity lightning = EntityType.LIGHTNING_BOLT.create(this.getWorld());
                if (lightning != null) {
                    lightning.refreshPositionAndAngles(player.getX() + 0.5D, player.getY(), player.getZ() + 0.5D, 0.0F, 0.0F);
                    this.getWorld().spawnEntity(lightning);
                }
            }
        }
        int i;for (i = 1; i < 3; ++i)if (this.age % 20 == 0) {this.heal(2.0f);}
        this.bossBar.setPercent(this.getHealth() / this.getMaxHealth());
    }

    private void setupAnimationStates(){
        if(this.idleAnimationTimeout <=0){
            this.idleAnimationTimeout = this.random.nextInt(40)+80;
            this.idleAnimationState.start(this.age);
        } else{
            --this.idleAnimationTimeout;
        }
    }

    @Override
    protected void updateLimbs(float posDelta) {
        float f;
        if (this.getPose() == EntityPose.STANDING){
            f = Math.min(posDelta * 6.0f, 1.0f);
        } else {
            f = 0.0f;
        }
        this.limbAnimator.updateLimbs(f, 0.2f);
    }

    @Override
    public void tickMovement() {
        if (this.getWorld().isClient()){
            this.setupAnimationStates();
        }
        super.tickMovement();
    }

    @Override
    public boolean tryAttack(Entity target) {
        if(this.isInRange(target, 10) && target != null){
            this.setVelocity(this.getVelocity().multiply(2D));
        }
        return super.tryAttack(target);
    }

    protected void initGoals() {
        this.goalSelector.add(1, new AttackGoal(this));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, true).setMaxTimeWithoutVisibility(300));
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        if (this.hasCustomName()) {
            this.bossBar.setName(this.getDisplayName());
        }
    }

    @Override
    public void setCustomName(@Nullable Text name) {
        super.setCustomName(name);
        this.bossBar.setName(this.getDisplayName());
    }

    @Override
    public void onStartedTrackingBy(ServerPlayerEntity player) {
        super.onStartedTrackingBy(player);
        this.bossBar.addPlayer(player);
    }

    @Override
    public void onStoppedTrackingBy(ServerPlayerEntity player) {
        super.onStoppedTrackingBy(player);
        this.bossBar.removePlayer(player);
    }

    @Override
    protected SoundEvent getFlopSound() {return SoundEvents.ENTITY_COD_FLOP;}
    public ItemStack getBucketItem() {return new ItemStack(Items.COD_BUCKET);}
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_COD_AMBIENT;
    }
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_COD_DEATH;
    }
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_COD_HURT;
    }

}
