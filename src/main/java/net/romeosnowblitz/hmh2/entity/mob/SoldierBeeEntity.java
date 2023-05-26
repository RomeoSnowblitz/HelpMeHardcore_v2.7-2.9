package net.romeosnowblitz.hmh2.entity.mob;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.scoreboard.AbstractTeam;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.Animation;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;

import java.util.EnumSet;

public class SoldierBeeEntity extends HostileEntity implements GeoEntity {

    private AnimatableInstanceCache factory = new SingletonAnimatableInstanceCache(this);

    protected static final TrackedData<Byte> QUEEN_FLAGS = DataTracker.registerData(QueenBeeEntity.class, TrackedDataHandlerRegistry.BYTE);
    private static final int CHARGING_FLAG = 1;
    private BlockPos bounds;

    public SoldierBeeEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.moveControl = new SoldierBeeMoveControl(this);
    }

    @Override
    public void tick() {
        this.noClip = true;
        super.tick();
        this.noClip = false;
        this.setNoGravity(true);
    }

    @Override
    public void move(MovementType movementType, Vec3d movement) {
        super.move(movementType, movement);
        this.checkBlockCollision();
    }


    public static DefaultAttributeContainer.Builder setAttributes() {
        return TameableEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 5.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.1f)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 1024f);
    }

    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new MeleeAttackGoal(this, 4, false));
        this.goalSelector.add(1, new ChargeTargetGoal());
        this.goalSelector.add(2, new LookAtTargetGoal());
        this.targetSelector.add(1, new ActiveTargetGoal<IronGolemEntity>((MobEntity)this, IronGolemEntity.class, true));
        this.targetSelector.add(1, new ActiveTargetGoal<PlayerEntity>((MobEntity)this, PlayerEntity.class, true));
    }

    private PlayState predicate(software.bernie.geckolib.core.animation.AnimationState animationState) {
        if(animationState.isMoving()) {
            animationState.getController().setAnimation(RawAnimation.begin().then("animation.soldier_bee.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }

        animationState.getController().setAnimation(RawAnimation.begin().then("animation.soldier_bee.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    public void registerControllers(AnimatableManager.ControllerRegistrar controllers){
        controllers.add(new AnimationController(this, "controller",
                0, this::predicate));
    }

    class SoldierBeeMoveControl
            extends MoveControl {
        public SoldierBeeMoveControl(SoldierBeeEntity owner) {
            super(owner);
        }

        @Override
        public void tick() {
            if (this.state != State.MOVE_TO) {
                return;
            }
            Vec3d vec3d = new Vec3d(this.targetX - SoldierBeeEntity.this.getX(), this.targetY - SoldierBeeEntity.this.getY(), this.targetZ - SoldierBeeEntity.this.getZ());
            double d = vec3d.length();
            if (d < SoldierBeeEntity.this.getBoundingBox().getAverageSideLength()) {
                this.state = State.WAIT;
                SoldierBeeEntity.this.setVelocity(SoldierBeeEntity.this.getVelocity().multiply(0.5));
            } else {
                SoldierBeeEntity.this.setVelocity(SoldierBeeEntity.this.getVelocity().add(vec3d.multiply(this.speed * 0.05 / d)));
                if (SoldierBeeEntity.this.getTarget() == null) {
                    Vec3d vec3d2 = SoldierBeeEntity.this.getVelocity();
                    SoldierBeeEntity.this.setYaw(-((float) MathHelper.atan2(vec3d2.x, vec3d2.z)) * 57.295776f);
                    SoldierBeeEntity.this.bodyYaw = SoldierBeeEntity.this.getYaw();
                } else {
                    double e = SoldierBeeEntity.this.getTarget().getX() - SoldierBeeEntity.this.getX();
                    double f = SoldierBeeEntity.this.getTarget().getZ() - SoldierBeeEntity.this.getZ();
                    SoldierBeeEntity.this.setYaw(-((float)MathHelper.atan2(e, f)) * 57.295776f);
                    SoldierBeeEntity.this.bodyYaw = SoldierBeeEntity.this.getYaw();
                }
            }
        }
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(QUEEN_FLAGS, (byte)0);
    }

    @Override
    public boolean tryAttack(Entity target) {
        if (!super.tryAttack(target)) {
            return false;
        }
        if (target instanceof LivingEntity) {
            ((LivingEntity)target).addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 60, 0), this);
        }
        return true;
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        if (nbt.contains("BoundX")) {
            this.bounds = new BlockPos(nbt.getInt("BoundX"), nbt.getInt("BoundY"), nbt.getInt("BoundZ"));
        }
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

    private boolean areFlagsSet(int mask) {
        byte i = this.dataTracker.get(QUEEN_FLAGS);
        return (i & mask) != 0;
    }

    private void setQueenFlags(int mask, boolean value) {
        int i = this.dataTracker.get(QUEEN_FLAGS).byteValue();
        i = value ? (i |= mask) : (i &= ~mask);
        this.dataTracker.set(QUEEN_FLAGS, (byte)(i & 0xFF));
    }

    public boolean isCharging() {
        return this.areFlagsSet(CHARGING_FLAG);
    }

    public void setCharging(boolean charging) {
        this.setQueenFlags(CHARGING_FLAG, charging);
    }


    class ChargeTargetGoal
            extends Goal {
        public ChargeTargetGoal() {
            this.setControls(EnumSet.of(Control.MOVE));
        }

        @Override
        public boolean canStart() {
            LivingEntity livingEntity = SoldierBeeEntity.this.getTarget();
            if (livingEntity != null && livingEntity.isAlive() && !SoldierBeeEntity.this.getMoveControl().isMoving() && SoldierBeeEntity.this.random.nextInt(ChargeTargetGoal.toGoalTicks(7)) == 0) {
                return SoldierBeeEntity.this.squaredDistanceTo(livingEntity) > 4.0;
            }
            return false;
        }

        @Override
        public boolean shouldContinue() {
            return SoldierBeeEntity.this.getMoveControl().isMoving() && SoldierBeeEntity.this.isCharging() && SoldierBeeEntity.this.getTarget() != null && SoldierBeeEntity.this.getTarget().isAlive();
        }

        @Override
        public void start() {
            LivingEntity livingEntity = SoldierBeeEntity.this.getTarget();
            if (livingEntity != null) {
                Vec3d vec3d = livingEntity.getEyePos();
                SoldierBeeEntity.this.moveControl.moveTo(vec3d.x, vec3d.y, vec3d.z, 1.0);
            }
            SoldierBeeEntity.this.setCharging(true);
            SoldierBeeEntity.this.playSound(SoundEvents.ENTITY_BEE_LOOP_AGGRESSIVE, 1.0f, 1.0f);
        }

        @Override
        public void stop() {
            SoldierBeeEntity.this.setCharging(false);
        }

        @Override
        public boolean shouldRunEveryTick() {
            return true;
        }

        @Override
        public void tick() {
            LivingEntity livingEntity = SoldierBeeEntity.this.getTarget();
            if (livingEntity == null) {
                return;
            }
            if (SoldierBeeEntity.this.getBoundingBox().intersects(livingEntity.getBoundingBox())) {
                SoldierBeeEntity.this.tryAttack(livingEntity);
                SoldierBeeEntity.this.setCharging(false);
            } else {
                double d = SoldierBeeEntity.this.squaredDistanceTo(livingEntity);
                if (d < 9.0) {
                    Vec3d vec3d = livingEntity.getEyePos();
                    SoldierBeeEntity.this.moveControl.moveTo(vec3d.x, vec3d.y, vec3d.z, 1.0);
                }
            }
        }
    }

    class LookAtTargetGoal
            extends Goal {
        public LookAtTargetGoal() {
            this.setControls(EnumSet.of(Control.MOVE));
        }

        @Override
        public boolean canStart() {
            return !SoldierBeeEntity.this.getMoveControl().isMoving() && SoldierBeeEntity.this.random.nextInt(LookAtTargetGoal.toGoalTicks(7)) == 0;
        }

        @Override
        public boolean shouldContinue() {
            return false;
        }

        @Override
        public void tick() {
            BlockPos blockPos = SoldierBeeEntity.this.bounds;
            if (blockPos == null) {
                blockPos = SoldierBeeEntity.this.getBlockPos();
            }
            for (int i = 0; i < 3; ++i) {
                BlockPos blockPos2 = blockPos.add(SoldierBeeEntity.this.random.nextInt(15) - 7, SoldierBeeEntity.this.random.nextInt(11) - 5, SoldierBeeEntity.this.random.nextInt(15) - 7);
                if (!SoldierBeeEntity.this.world.isAir(blockPos2)) continue;
                SoldierBeeEntity.this.moveControl.moveTo((double)blockPos2.getX() + 0.5, (double)blockPos2.getY() + 0.5, (double)blockPos2.getZ() + 0.5, 0.25);
                if (SoldierBeeEntity.this.getTarget() != null) break;
                SoldierBeeEntity.this.getLookControl().lookAt((double)blockPos2.getX() + 0.5, (double)blockPos2.getY() + 0.5, (double)blockPos2.getZ() + 0.5, 180.0f, 20.0f);
                break;
            }
        }
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return factory;
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_BEE_LOOP;
    }
    protected SoundEvent getHurtSound(DamageSource source) {return SoundEvents.ENTITY_BEE_LOOP_AGGRESSIVE;}
    protected SoundEvent getDeathSound() {
        return SoundEvents.PARTICLE_SOUL_ESCAPE;
    }
    protected void playStepSound(BlockPos pos, BlockState state) {this.playSound(SoundEvents.ENTITY_BEE_LOOP, 1f, 1.0f);}

    public AbstractTeam getScoreboardTeam() {
        return super.getScoreboardTeam();
    }
    public boolean canBeLeashedBy(PlayerEntity player) {
        return false;
    }


}
