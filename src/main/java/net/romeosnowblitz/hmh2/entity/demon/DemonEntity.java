package net.romeosnowblitz.hmh2.entity.demon;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.raid.RaiderEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import org.jetbrains.annotations.Nullable;

import java.util.EnumSet;

public class DemonEntity extends HostileEntity implements Ownable{
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    protected static final TrackedData<Byte> VEX_FLAGS;

    @Nullable
    MobEntity owner;
    @Nullable
    private BlockPos bounds;


    public DemonEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.isFireImmune();

        this.moveControl = new DemonEntity.VexMoveControl(this);
        this.experiencePoints = 3;
        this.setCustomName(Text.empty());
    }

    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return dimensions.height - 0.28125F;
    }

    public boolean isFlappingWings() {
        return this.age % MathHelper.ceil(3.9269907F) == 0;
    }

    public void move(MovementType movementType, Vec3d movement) {
        super.move(movementType, movement);
        this.checkBlockCollision();
    }

    public void tick() {
        super.tick();
        this.isFireImmune();
        this.setNoGravity(true);
        if (this.getWorld().isClient()) {
            this.setupAnimationStates();
        }

    }

    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new DemonEntity.ChargeTargetGoal());
        this.goalSelector.add(8, new DemonEntity.LookAtTargetGoal());
        this.goalSelector.add(9, new LookAtEntityGoal(this, PlayerEntity.class, 3.0F, 1.0F));
        this.goalSelector.add(10, new LookAtEntityGoal(this, MobEntity.class, 8.0F));
        this.targetSelector.add(3, (new RevengeGoal(this, RaiderEntity.class)).setGroupRevenge());
        this.targetSelector.add(1, new DemonEntity.TrackOwnerTargetGoal(this));
        this.targetSelector.add(1, new ActiveTargetGoal(this, PlayerEntity.class, true).setMaxTimeWithoutVisibility(300));
    }


    ///////////////

    public float getNameLabelHeight() {
        return this.getHeight()-0.45f;
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

    public static DefaultAttributeContainer.Builder setAttributes() {
        return TameableEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 14.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 4.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.1f);
    }


    @Override
    public boolean tryAttack(Entity target) {
        if (getTarget() != null) {
            int i = 1;
            if (getTarget().getStatusEffect(CustomEffects.HELL_BOUND) != null) {
                i += getTarget().getStatusEffect(CustomEffects.HELL_BOUND).getDuration();
                getTarget().removeStatusEffectInternal(CustomEffects.HELL_BOUND);
            } else {--i;}i = MathHelper.clamp(i+600, 0, 12000);
            getTarget().addStatusEffect(new StatusEffectInstance(CustomEffects.HELL_BOUND, i, 0, false, false, true));
        }
        return target.damage(getDamageSources().create(ModDamageTypes.KILLED_BY_DEMON, this), (float) this.getAttributeBaseValue(EntityAttributes.GENERIC_ATTACK_DAMAGE));
    }


    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(VEX_FLAGS, (byte)0);
    }

    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        if (nbt.contains("BoundX")) {
            this.bounds = new BlockPos(nbt.getInt("BoundX"), nbt.getInt("BoundY"), nbt.getInt("BoundZ"));
        }

    }

    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        if (this.bounds != null) {
            nbt.putInt("BoundX", this.bounds.getX());
            nbt.putInt("BoundY", this.bounds.getY());
            nbt.putInt("BoundZ", this.bounds.getZ());
        }
    }

    @Nullable
    public MobEntity getOwner() {
        return this.owner;
    }

    @Nullable
    public BlockPos getBounds() {
        return this.bounds;
    }

    public void setBounds(@Nullable BlockPos bounds) {
        this.bounds = bounds;
    }

    private boolean areFlagsSet(int mask) {
        int i = this.dataTracker.get(VEX_FLAGS);
        return (i & mask) != 0;
    }

    private void setVexFlag(int mask, boolean value) {
        int i = this.dataTracker.get(VEX_FLAGS);
        if (value) {
            i = i | mask;
        } else {
            i = i & ~mask;
        }

        this.dataTracker.set(VEX_FLAGS, (byte)(i & 255));
    }

    public boolean isCharging() {
        return this.areFlagsSet(1);
    }

    public void setCharging(boolean charging) {
        this.setVexFlag(1, charging);
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_VEX_AMBIENT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_VEX_DEATH;
    }

    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_VEX_HURT;
    }

    public float getBrightnessAtEyes() {
        return 1.0F;
    }

    @Nullable
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
        Random random = world.getRandom();
        this.initEquipment(random, difficulty);
        this.updateEnchantments(random, difficulty);
        return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
    }

    protected void initEquipment(Random random, LocalDifficulty localDifficulty) {
        this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(Items.IRON_SWORD));
        this.setEquipmentDropChance(EquipmentSlot.MAINHAND, 0.0F);
    }

    public double getHeightOffset() {
        return 0.4D;
    }

    static {
        VEX_FLAGS = DataTracker.registerData(DemonEntity.class, TrackedDataHandlerRegistry.BYTE);
    }

    private class VexMoveControl extends MoveControl {
        public VexMoveControl(DemonEntity owner) {
            super(owner);
        }

        public void tick() {
            if (this.state == State.MOVE_TO) {
                Vec3d vec3d = new Vec3d(this.targetX - DemonEntity.this.getX(), this.targetY - DemonEntity.this.getY(), this.targetZ - DemonEntity.this.getZ());
                double d = vec3d.length();
                if (d < DemonEntity.this.getBoundingBox().getAverageSideLength()) {
                    this.state = State.WAIT;
                    DemonEntity.this.setVelocity(DemonEntity.this.getVelocity().multiply(0.5D));
                } else {
                    DemonEntity.this.setVelocity(DemonEntity.this.getVelocity().add(vec3d.multiply(this.speed * 0.05D / d)));
                    if (DemonEntity.this.getTarget() == null) {
                        Vec3d vec3d2 = DemonEntity.this.getVelocity();
                        DemonEntity.this.setYaw(-((float)MathHelper.atan2(vec3d2.x, vec3d2.z)) * 57.295776F);
                    } else {
                        double e = DemonEntity.this.getTarget().getX() - DemonEntity.this.getX();
                        double f = DemonEntity.this.getTarget().getZ() - DemonEntity.this.getZ();
                        DemonEntity.this.setYaw(-((float)MathHelper.atan2(e, f)) * 57.295776F);
                    }
                    DemonEntity.this.bodyYaw = DemonEntity.this.getYaw();
                }

            }
        }
    }

    private class ChargeTargetGoal extends Goal {
        public ChargeTargetGoal() {
            this.setControls(EnumSet.of(Control.MOVE));
        }

        public boolean canStart() {
            LivingEntity livingEntity = DemonEntity.this.getTarget();
            if (livingEntity != null && livingEntity.isAlive() && !DemonEntity.this.getMoveControl().isMoving() && DemonEntity.this.random.nextInt(toGoalTicks(1)) == 0) {
                return DemonEntity.this.squaredDistanceTo(livingEntity) > 4.0D;
            } else {
                return false;
            }
        }

        public boolean shouldContinue() {
            return DemonEntity.this.getMoveControl().isMoving() && DemonEntity.this.isCharging() && DemonEntity.this.getTarget() != null && DemonEntity.this.getTarget().isAlive();
        }

        public void start() {
            LivingEntity livingEntity = DemonEntity.this.getTarget();
            if (livingEntity != null) {
                Vec3d vec3d = livingEntity.getEyePos();
                DemonEntity.this.moveControl.moveTo(vec3d.x, vec3d.y, vec3d.z, 1.0D);
            }

            DemonEntity.this.setCharging(true);
            DemonEntity.this.playSound(SoundEvents.ENTITY_VEX_CHARGE, 1.0F, 1.0F);
        }

        public void stop() {
            DemonEntity.this.setCharging(false);
        }

        public boolean shouldRunEveryTick() {
            return true;
        }

        public void tick() {
            LivingEntity livingEntity = DemonEntity.this.getTarget();
            if (livingEntity != null) {
                if (DemonEntity.this.getBoundingBox().intersects(livingEntity.getBoundingBox())) {
                    DemonEntity.this.tryAttack(livingEntity);
                    DemonEntity.this.setCharging(true);
                } else {
                    double d = DemonEntity.this.squaredDistanceTo(livingEntity);
                    if (d < 9.0D) {
                        Vec3d vec3d = livingEntity.getEyePos();
                        DemonEntity.this.moveControl.moveTo(vec3d.x, vec3d.y, vec3d.z, 2.0D);
                    }
                }

            }
        }
    }

    private class LookAtTargetGoal extends Goal {
        public LookAtTargetGoal() {
            this.setControls(EnumSet.of(Control.MOVE));
        }

        public boolean canStart() {
            return !DemonEntity.this.getMoveControl().isMoving() && DemonEntity.this.random.nextInt(toGoalTicks(7)) == 0;
        }

        public boolean shouldContinue() {
            return false;
        }

        public void tick() {
            BlockPos blockPos = DemonEntity.this.getBounds();
            if (blockPos == null) {
                blockPos = DemonEntity.this.getBlockPos();
            }

            for(int i = 0; i < 3; ++i) {
                BlockPos blockPos2 = blockPos.add(DemonEntity.this.random.nextInt(15) - 7, DemonEntity.this.random.nextInt(11) - 5, DemonEntity.this.random.nextInt(15) - 7);
                if (DemonEntity.this.getWorld().isAir(blockPos2)) {
                    DemonEntity.this.moveControl.moveTo((double)blockPos2.getX() + 0.5D, (double)blockPos2.getY() + 0.5D, (double)blockPos2.getZ() + 0.5D, 0.25D);
                    if (DemonEntity.this.getTarget() == null) {
                        DemonEntity.this.getLookControl().lookAt((double)blockPos2.getX() + 0.5D, (double)blockPos2.getY() + 0.5D, (double)blockPos2.getZ() + 0.5D, 180.0F, 20.0F);
                    }
                    break;
                }
            }

        }
    }

    class TrackOwnerTargetGoal extends TrackTargetGoal {
        private final TargetPredicate targetPredicate = TargetPredicate.createNonAttackable().ignoreVisibility().ignoreDistanceScalingFactor();

        public TrackOwnerTargetGoal(PathAwareEntity mob) {
            super(mob, false);
        }

        public boolean canStart() {
            return DemonEntity.this.owner != null && DemonEntity.this.owner.getTarget() != null && this.canTrack(DemonEntity.this.owner.getTarget(), this.targetPredicate);
        }

        public void start() {
            DemonEntity.this.setTarget(DemonEntity.this.owner.getTarget());
            super.start();
        }
    }
}
