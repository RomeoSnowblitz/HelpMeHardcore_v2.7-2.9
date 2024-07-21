/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1282
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1308
 *  net.minecraft.class_1309
 *  net.minecraft.class_1314
 *  net.minecraft.class_1321
 *  net.minecraft.class_1347
 *  net.minecraft.class_1352
 *  net.minecraft.class_1361
 *  net.minecraft.class_1371
 *  net.minecraft.class_1376
 *  net.minecraft.class_1394
 *  net.minecraft.class_1400
 *  net.minecraft.class_1588
 *  net.minecraft.class_1657
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_270
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_4291
 *  net.minecraft.class_5132$class_5133
 *  net.minecraft.class_5134
 *  software.bernie.geckolib.animatable.GeoEntity
 *  software.bernie.geckolib.core.animatable.GeoAnimatable
 *  software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache
 *  software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache
 *  software.bernie.geckolib.core.animation.AnimatableManager$ControllerRegistrar
 *  software.bernie.geckolib.core.animation.Animation$LoopType
 *  software.bernie.geckolib.core.animation.AnimationController
 *  software.bernie.geckolib.core.animation.AnimationState
 *  software.bernie.geckolib.core.animation.RawAnimation
 *  software.bernie.geckolib.core.object.PlayState
 */
package net.romeosnowblitz.hmh2.entity.mites.hellmite;

import net.minecraft.block.BlockState;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.scoreboard.AbstractTeam;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;

public class HellmiteEntity extends HostileEntity {
    final net.minecraft.entity.AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    public HellmiteEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
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
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()) {
            this.setupAnimationStates();
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
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 5.0)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2f);
    }

    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(2, new WanderAroundPointOfInterestGoal(this, 0.75f, false));
        this.goalSelector.add(3, new WanderAroundFarGoal(this, 0.75f, 1));
        this.goalSelector.add(4, new LookAroundGoal(this));
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        this.goalSelector.add(1, new AttackGoal(this));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, true).setMaxTimeWithoutVisibility(300));
    }

    public boolean tryAttack(Entity target) {
      return target.damage(getDamageSources().create(ModDamageTypes.KILLED_BY_HELLMITE, this), (float) this.getAttributeBaseValue(EntityAttributes.GENERIC_ATTACK_DAMAGE));
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_SILVERFISH_STEP;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_SILVERFISH_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {return SoundEvents.ENTITY_SILVERFISH_DEATH;}

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.ENTITY_SILVERFISH_STEP, 0.5f, 1.0f);
    }

    @Override
    public AbstractTeam getScoreboardTeam() {
        return super.getScoreboardTeam();
    }

    public boolean canBeLeashedBy(PlayerEntity player) {
        return false;
    }
}

