package net.romeosnowblitz.hmh2.entity.mob;

import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.AbstractTeam;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.Animation;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;

public class ShadowCreatureEntity extends HostileEntity implements GeoEntity {
    private AnimatableInstanceCache factory = new SingletonAnimatableInstanceCache(this);

    public ShadowCreatureEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }


    public static DefaultAttributeContainer.Builder setAttributes() {
        return TameableEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 1.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.1f)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 1024f);
    }

    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(2, new WanderAroundPointOfInterestGoal(this, 0.75f, false));
        this.goalSelector.add(3, new WanderAroundFarGoal(this, 0.75f, 1));
        this.goalSelector.add(4, new LookAroundGoal(this));
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        this.goalSelector.add(1, new AttackGoal(this));
        this.targetSelector.add(1, new ActiveTargetGoal<PlayerEntity>((MobEntity)this, PlayerEntity.class, true).setMaxTimeWithoutVisibility(300));
    }

    private PlayState predicate(software.bernie.geckolib.core.animation.AnimationState animationState) {
        if(animationState.isMoving()) {
            animationState.getController().setAnimation(RawAnimation.begin().then("animation.shadow_creature.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }

        animationState.getController().setAnimation(RawAnimation.begin().then("animation.shadow_creature.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    public static ItemStack getXRay() {
        ItemStack itemStack = new ItemStack(ModBlocks.XRAY);
        return itemStack;
    }

    @Override
    public boolean tryAttack(Entity target) {
        if (!super.tryAttack(target)) {
            return false;
        }
        ItemStack itemStack = null;
        LivingEntity livingEntity = getTarget();
        StatusEffectInstance statusEffectInstance = livingEntity.getStatusEffect(CustomEffects.HEALTH_SHRINKAGE);
        if (target instanceof LivingEntity) {
            int i = 1;
            if (statusEffectInstance != null) {
                i += statusEffectInstance.getAmplifier();
                livingEntity.removeStatusEffectInternal(CustomEffects.HEALTH_SHRINKAGE);
            } else {
                --i;
            }
            i = MathHelper.clamp(i, 0, 20);
            StatusEffectInstance statusEffectInstance2 = new StatusEffectInstance(CustomEffects.HEALTH_SHRINKAGE, 120000, i, false, false, true);
            if (!this.world.getGameRules().getBoolean(GameRules.DISABLE_RAIDS)) {
                livingEntity.addStatusEffect(statusEffectInstance2);
            }
        }
        return true;
    }

    public void registerControllers(AnimatableManager.ControllerRegistrar controllers){
        controllers.add(new AnimationController(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return factory;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_CHICKEN_STEP;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.PARTICLE_SOUL_ESCAPE;
    }

    @Override
    protected SoundEvent getDeathSound() {return SoundEvents.ENTITY_VEX_CHARGE;}

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.UI_TOAST_IN, 0.5f, 1.0f);
    }


    @Override
    public AbstractTeam getScoreboardTeam() {
        return super.getScoreboardTeam();
    }

    public boolean canBeLeashedBy(PlayerEntity player) {
        return false;
    }


}
