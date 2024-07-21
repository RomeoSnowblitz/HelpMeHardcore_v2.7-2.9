package net.romeosnowblitz.hmh2.entity.boss.queen_bee;

import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.SpellcastingIllagerEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.scoreboard.AbstractTeam;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.entity.boss.soldier_bee.SoldierBeeEntity;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.util.ModRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.EnumSet;

public class QueenBeeEntity extends SpellcastingIllagerEntity {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    private final ServerBossBar bossBar = (ServerBossBar)new ServerBossBar(this.getDisplayName(), BossBar.Color.YELLOW, BossBar.Style.PROGRESS).setDragonMusic(true).setDarkenSky(false);
    protected static final TrackedData<Byte> QUEEN_FLAGS = DataTracker.registerData(QueenBeeEntity.class, TrackedDataHandlerRegistry.BYTE);
    private static final int CHARGING_FLAG = 1;
    private BlockPos bounds;

    public QueenBeeEntity(EntityType<? extends QueenBeeEntity> entityType, World world) {
        super(entityType, world);
        this.moveControl = new QueenBeeMoveControl(this);
    }

    @Override
    public void move(MovementType movementType, Vec3d movement) {
        super.move(movementType, movement);
        this.checkBlockCollision();
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
    public void tick() {
        this.noClip = true;
        super.tick();
        this.noClip = false;
        this.setNoGravity(true);
        if(this.getWorld().isClient()){
            this.setupAnimationStates();
        }
        if (this.hasStatusEffect(CustomEffects.ANCHORED)) {
            removeStatusEffect(CustomEffects.ANCHORED);
            setVelocity(0, 0, 0);
        }
    }

    @Override
    protected SoundEvent getCastSpellSound() {return SoundEvents.BLOCK_BEEHIVE_EXIT;
    }

    public void addBonusForWave(int wave, boolean unused) {}


    public static DefaultAttributeContainer.Builder setAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 200.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 20.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 10.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 10.0f)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 40f);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new SwimGoal(this));
        this.goalSelector.add(2, new MeleeAttackGoal(this, 4, false));
        this.goalSelector.add(6, new SummonVexGoal());
        this.goalSelector.add(2, new ChargeTargetGoal());
        this.goalSelector.add(3, new LookAtTargetGoal());
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, IronGolemEntity.class, true));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(QUEEN_FLAGS, (byte)0);
    }

    @Override
    public boolean tryAttack(Entity target) {
        getTarget().addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 9), this);
        return target.damage(getDamageSources().create(ModDamageTypes.KILLED_BY_QUEEN_BEE, this), (float) this.getAttributeBaseValue(EntityAttributes.GENERIC_ATTACK_DAMAGE));
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(Items.BUCKET) && !this.isBaby()) {
            player.playSound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK, 1.0f, 1.0f);
            ItemStack itemStack2 = ItemUsage.exchangeStack(itemStack, player, ModItems.HONEY_BUCKET.getDefaultStack());
            player.setStackInHand(hand, itemStack2);
            return ActionResult.success(this.getWorld().isClient);
        }
        return super.interactMob(player, hand);
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
    public SoundEvent getCelebratingSound() {
        return null;
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

    @Override
    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return 2.6f;
    }


    class QueenBeeMoveControl
            extends MoveControl {
        public QueenBeeMoveControl(QueenBeeEntity owner) {
            super(owner);
        }

        @Override
        public void tick() {
            if (this.state != State.MOVE_TO) {
                return;
            }
            Vec3d vec3d = new Vec3d(this.targetX - QueenBeeEntity.this.getX(), this.targetY - QueenBeeEntity.this.getY(), this.targetZ - QueenBeeEntity.this.getZ());
            double d = vec3d.length();
            if (d < QueenBeeEntity.this.getBoundingBox().getAverageSideLength()) {
                this.state = State.WAIT;
                QueenBeeEntity.this.setVelocity(QueenBeeEntity.this.getVelocity().multiply(0.5));
            } else {
                QueenBeeEntity.this.setVelocity(QueenBeeEntity.this.getVelocity().add(vec3d.multiply(this.speed * 0.05 / d)));
                if (QueenBeeEntity.this.getTarget() == null) {
                    Vec3d vec3d2 = QueenBeeEntity.this.getVelocity();
                    QueenBeeEntity.this.setYaw(-((float)MathHelper.atan2(vec3d2.x, vec3d2.z)) * 57.295776f);
                    QueenBeeEntity.this.bodyYaw = QueenBeeEntity.this.getYaw();
                } else {
                    double e = QueenBeeEntity.this.getTarget().getX() - QueenBeeEntity.this.getX();
                    double f = QueenBeeEntity.this.getTarget().getZ() - QueenBeeEntity.this.getZ();
                    QueenBeeEntity.this.setYaw(-((float)MathHelper.atan2(e, f)) * 57.295776f);
                    QueenBeeEntity.this.bodyYaw = QueenBeeEntity.this.getYaw();
                }
            }
        }
    }


class ChargeTargetGoal
        extends Goal {
    public ChargeTargetGoal() {
        this.setControls(EnumSet.of(Control.MOVE));
    }

    @Override
    public boolean canStart() {
        LivingEntity livingEntity = QueenBeeEntity.this.getTarget();
        if (livingEntity != null && livingEntity.isAlive() && !QueenBeeEntity.this.getMoveControl().isMoving() && QueenBeeEntity.this.random.nextInt(ChargeTargetGoal.toGoalTicks(7)) == 0) {
            return QueenBeeEntity.this.squaredDistanceTo(livingEntity) > 4.0;
        }
        return false;
    }

    @Override
    public boolean shouldContinue() {
        return QueenBeeEntity.this.getMoveControl().isMoving() && QueenBeeEntity.this.isCharging() && QueenBeeEntity.this.getTarget() != null && QueenBeeEntity.this.getTarget().isAlive();
    }


    @Override
    public void start() {
        LivingEntity livingEntity = QueenBeeEntity.this.getTarget();
        if (livingEntity != null) {
            Vec3d vec3d = livingEntity.getEyePos();
            QueenBeeEntity.this.moveControl.moveTo(vec3d.x, vec3d.y, vec3d.z, 1.0);
        }
        QueenBeeEntity.this.setCharging(true);
        QueenBeeEntity.this.playSound(SoundEvents.ENTITY_BEE_LOOP_AGGRESSIVE, 1.0f, 0.7f);
    }

    @Override
    public void stop() {
        QueenBeeEntity.this.setCharging(false);
    }

    @Override
    public boolean shouldRunEveryTick() {
        return true;
    }

    @Override
    public void tick() {
        LivingEntity livingEntity = QueenBeeEntity.this.getTarget();
        if (livingEntity == null) {
            return;
        }
        if (QueenBeeEntity.this.getBoundingBox().intersects(livingEntity.getBoundingBox())) {
            QueenBeeEntity.this.tryAttack(livingEntity);
            QueenBeeEntity.this.setCharging(false);
        } else {
            double d = QueenBeeEntity.this.squaredDistanceTo(livingEntity);
            if (d < 9.0) {
                Vec3d vec3d = livingEntity.getEyePos();
                QueenBeeEntity.this.moveControl.moveTo(vec3d.x, vec3d.y, vec3d.z, 1.0);
            }
        }
    }
}

    @Override
    protected void mobTick() {
        ModRegistries.antiBossFarm( this);
        super.mobTick();
        int i;for (i = 1; i < 3; ++i)if (this.age % 20 == 0) {this.heal(2.0f);}
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

    class LookAtTargetGoal
            extends Goal {
        public LookAtTargetGoal() {
            this.setControls(EnumSet.of(Control.MOVE));
        }

        @Override
        public boolean canStart() {
            return !QueenBeeEntity.this.getMoveControl().isMoving() && QueenBeeEntity.this.random.nextInt(LookAtTargetGoal.toGoalTicks(7)) == 0;
        }

        @Override
        public boolean shouldContinue() {return false; }

        @Override
        public void tick() {
            BlockPos blockPos = QueenBeeEntity.this.bounds;
            if (blockPos == null) {
                    blockPos = QueenBeeEntity.this.getBlockPos();
            }
            for (int i = 0; i < 3; ++i) {
                BlockPos blockPos2 = blockPos.add(QueenBeeEntity.this.random.nextInt(15) - 7, QueenBeeEntity.this.random.nextInt(11) - 5, QueenBeeEntity.this.random.nextInt(15) - 7);
                if (!QueenBeeEntity.this.getWorld().isAir(blockPos2)) continue;
                QueenBeeEntity.this.moveControl.moveTo((double)blockPos2.getX() + 0.5, (double)blockPos2.getY() + 0.5, (double)blockPos2.getZ() + 0.5, 0.25);
                    if (QueenBeeEntity.this.getTarget() != null) break;
                    QueenBeeEntity.this.getLookControl().lookAt((double)blockPos2.getX() + 0.5, (double)blockPos2.getY() + 0.5, (double)blockPos2.getZ() + 0.5, 180.0f, 20.0f);
                break;
            }
        }
    }

    class SummonVexGoal
            extends CastSpellGoal {
        private final TargetPredicate closeQueenBeePredicate = TargetPredicate.createNonAttackable().setBaseMaxDistance(16.0).ignoreVisibility().ignoreDistanceScalingFactor();

        SummonVexGoal() {
        }

        @Override
        public boolean canStart() {
            if (!super.canStart()) {
                return false;
            }
            int i = QueenBeeEntity.this.getWorld().getTargets(QueenBeeEntity.class, this.closeQueenBeePredicate, QueenBeeEntity.this, QueenBeeEntity.this.getBoundingBox().expand(16.0)).size();
            return QueenBeeEntity.this.random.nextInt(8) + 1 > i;
        }

        @Override
        protected int getSpellTicks() {
            return 100;
        }

        @Override
        protected int startTimeDelay() {
            return 340;
        }

        @Override
        protected void castSpell() {
            ServerWorld serverWorld = (ServerWorld) QueenBeeEntity.this.getWorld();
            for (int i = 0; i < 3; ++i) {
                BlockPos blockPos = QueenBeeEntity.this.getBlockPos().add(-2 + QueenBeeEntity.this.random.nextInt(5), 1, -2 + QueenBeeEntity.this.random.nextInt(5));
                SoldierBeeEntity soldierBeeEntity = ModEntities.SOLDIER_BEE.create(QueenBeeEntity.this.getWorld());
                soldierBeeEntity.refreshPositionAndAngles(blockPos, 0.0f, 0.0f);
                soldierBeeEntity.initialize(serverWorld, QueenBeeEntity.this.getWorld().getLocalDifficulty(blockPos), SpawnReason.MOB_SUMMONED, null, null);
                serverWorld.spawnEntityAndPassengers(soldierBeeEntity);
            }
        }

        @Override
        protected SoundEvent getSoundPrepare() {
            return SoundEvents.ENTITY_BEE_LOOP_AGGRESSIVE;
        }

        @Override
        protected Spell getSpell() {
            return Spell.SUMMON_VEX;
        }
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_BEE_LOOP_AGGRESSIVE;
    }
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.PARTICLE_SOUL_ESCAPE;
    }
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_VEX_CHARGE;
    }
    protected void playStepSound(BlockPos pos, BlockState state) {this.playSound(SoundEvents.ENTITY_BEE_LOOP_AGGRESSIVE, 0.5f, 1.0f);}
    public AbstractTeam getScoreboardTeam() {
        return super.getScoreboardTeam();
    }
    public boolean canBeLeashedBy(PlayerEntity player) {
        return false;
    }


    }
