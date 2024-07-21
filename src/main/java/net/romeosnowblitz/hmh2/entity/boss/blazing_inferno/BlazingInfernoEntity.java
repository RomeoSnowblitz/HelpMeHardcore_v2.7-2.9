package net.romeosnowblitz.hmh2.entity.boss.blazing_inferno;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import net.romeosnowblitz.hmh2.util.ModRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.EnumSet;
import java.util.Random;

public class BlazingInfernoEntity extends HostileEntity {
    final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    private static final TrackedData<Byte> BLAZE_FLAGS;
    private final ServerBossBar bossBar = (ServerBossBar)new ServerBossBar(this.getDisplayName(), BossBar.Color.RED, BossBar.Style.PROGRESS).setDragonMusic(true).setDarkenSky(false);
    private BlockPos bounds;

    public BlazingInfernoEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.setPathfindingPenalty(PathNodeType.WATER, -1.0F);
        this.setPathfindingPenalty(PathNodeType.LAVA, 8.0F);
        this.setPathfindingPenalty(PathNodeType.DANGER_FIRE, 0.0F);
        this.setPathfindingPenalty(PathNodeType.DAMAGE_FIRE, 0.0F);
        this.isFireImmune();
        this.experiencePoints = 200;
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
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        if (nbt.contains("BoundX")) {
            this.bounds = new BlockPos(nbt.getInt("BoundX"), nbt.getInt("BoundY"), nbt.getInt("BoundZ"));
        }
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
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        if (this.bounds != null) {
            nbt.putInt("BoundX", this.bounds.getX());
            nbt.putInt("BoundY", this.bounds.getY());
            nbt.putInt("BoundZ", this.bounds.getZ());
        }
    }

    public float getNameLabelHeight() {
        return this.getHeight();
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return HostileEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 250.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 40.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2f)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 48.0D);
    }

    protected void initGoals() {
        this.goalSelector.add(4, new BlazingInfernoEntity.ShootFireballGoal(this));
        this.goalSelector.add(5, new GoToWalkTargetGoal(this, 1.0D));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.0D, 0.0F));
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
    }

    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(BLAZE_FLAGS, (byte)0);
    }

    @Override
    public boolean tryAttack(Entity target) {
        target.damage(getDamageSources().create(ModDamageTypes.KILLED_BY_BLAZING_INFERNO, this), (float) this.getAttributeBaseValue(EntityAttributes.GENERIC_ATTACK_DAMAGE));
        return super.tryAttack(target);
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_BLAZE_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_BLAZE_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_BLAZE_DEATH;
    }

    public float getBrightnessAtEyes() {
        return 1.0F;
    }

    public void tickMovement() {
        if (this.getWorld().isClient()){
            this.setupAnimationStates();
        }
        if (!this.isOnGround() && this.getVelocity().y < 0.0D) {
            this.setVelocity(this.getVelocity().multiply(1.0D, 0.6D, 1.0D));
        }
        if (this.getWorld().isClient) {
            if (this.random.nextInt(24) == 0 && !this.isSilent()) {
                this.getWorld().playSound(this.getX() + 0.5D, this.getY() + 0.5D, this.getZ() + 0.5D, SoundEvents.ENTITY_BLAZE_BURN, this.getSoundCategory(), 1.0F + this.random.nextFloat(), this.random.nextFloat() * 0.7F + 0.3F, false);
            }
            for(int i = 0; i < 2; ++i) {
                this.getWorld().addParticle(ParticleTypes.LARGE_SMOKE, this.getParticleX(0.5D), this.getRandomBodyY(), this.getParticleZ(0.5D), 0.0D, 0.0D, 0.0D);
            }
        }
        super.tickMovement();
    }

    protected void mobTick() {
        ModRegistries.antiBossFarm(this);
        LivingEntity livingEntity = this.getTarget();
        if (livingEntity != null && livingEntity.getEyeY() > this.getEyeY() + (double)0.5f && this.canTarget(livingEntity)) {
            Vec3d vec3d = this.getVelocity();
            this.setVelocity(this.getVelocity().add(0.0D, (0.30000001192092896D - vec3d.y) * 0.30000001192092896D, 0.0D));
            this.velocityDirty = true;
        }
        int i;
        super.mobTick();
        for (i = 1; i < 3; ++i)
            if (this.age % 20 == 0) {
                this.heal(2.0f);
            }
        this.bossBar.setPercent(this.getHealth() / this.getMaxHealth());
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

    public boolean isOnFire() {
        return this.isFireActive();
    }

    private boolean isFireActive() {
        return (this.dataTracker.get(BLAZE_FLAGS) & 1) != 0;
    }

    void setFireActive(boolean fireActive) {
        byte b = this.dataTracker.get(BLAZE_FLAGS);
        if (fireActive) {
            b = (byte)(b | 1);
        } else {
            b &= -2;
        }
        this.dataTracker.set(BLAZE_FLAGS, b);
    }

    static {
        BLAZE_FLAGS = DataTracker.registerData(BlazingInfernoEntity.class, TrackedDataHandlerRegistry.BYTE);
    }

    private static class ShootFireballGoal extends Goal {
        private final BlazingInfernoEntity blaze;

        public ShootFireballGoal(BlazingInfernoEntity blaze) {
            this.blaze = blaze;
            this.setControls(EnumSet.of(Control.MOVE, Control.LOOK));
        }

        public boolean canStart() {
            LivingEntity livingEntity = this.blaze.getTarget();
            return livingEntity != null && livingEntity.isAlive() && this.blaze.canTarget(livingEntity);
        }

        public void stop() {
            this.blaze.setFireActive(false);
        }

        public boolean shouldRunEveryTick() {
            return true;
        }

        public void tick() {
            LivingEntity livingEntity = this.blaze.getTarget();
            if (livingEntity != null) {
                double d = this.blaze.squaredDistanceTo(livingEntity);
                double e = livingEntity.getX() - this.blaze.getX();
                double f = livingEntity.getBodyY(0.5D) - this.blaze.getBodyY(0.5D);
                double g = livingEntity.getZ() - this.blaze.getZ();
                this.blaze.setFireActive(true);
                double h = Math.sqrt(Math.sqrt(d)) * 0.5D;
                Random random = new Random();
                int i2 = random.nextInt(20 + 1);
                if(i2 == 1){
                    this.blaze.getWorld().syncWorldEvent(null, 1018, this.blaze.getBlockPos(), 0);
                    FireballEntity fireballEntity = new FireballEntity(this.blaze.getWorld(), this.blaze, this.blaze.getRandom().nextTriangular(e, 2.297D * h), f, this.blaze.getRandom().nextTriangular(g, 2.297D * h), 2);
                    fireballEntity.setPosition(fireballEntity.getX(), this.blaze.getBodyY(0.5D) + 0.5D, fireballEntity.getZ());
                    this.blaze.getWorld().spawnEntity(fireballEntity);
                }
                this.blaze.getLookControl().lookAt(livingEntity, 10.0F, 10.0F);
                this.blaze.getMoveControl().moveTo(livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), 1.5D);
                if (d < 4.0D) {
                    this.blaze.tryAttack(livingEntity);
                    StatusEffectInstance statusEffectInstance = livingEntity.getStatusEffect(CustomEffects.KINDLING);
                    int i = 1;
                    if (statusEffectInstance != null) {
                        i += statusEffectInstance.getAmplifier();
                        livingEntity.removeStatusEffectInternal(CustomEffects.KINDLING);
                    } else {
                        --i;
                    }
                    i = MathHelper.clamp(i, 0, 1);
                    StatusEffectInstance statusEffectInstance2 = new StatusEffectInstance(CustomEffects.KINDLING, 1200, i, false, true, true);
                    if (!this.blaze.getWorld().getGameRules().getBoolean(GameRules.DISABLE_RAIDS)) {
                        livingEntity.addStatusEffect(statusEffectInstance2);
                    }
                    this.blaze.getLookControl().lookAt(livingEntity, 10.0F, 10.0F);
                    this.blaze.getMoveControl().moveTo(livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), 1.5D);
                super.tick();
                }
            }
        }
    }
}
