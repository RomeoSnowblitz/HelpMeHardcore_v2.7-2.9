
package net.romeosnowblitz.hmh2.entity.cal;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.UUID;

public class CalEntity extends PassiveEntity {
    final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public CalEntity(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
        this.setCustomName(Text.empty());
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }

    @Override
    public float getNameLabelHeight() {
        return 0.2f;
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
        return PathAwareEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 2.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f);
    }

    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(2, new WanderAroundPointOfInterestGoal(this, 0.75f, false));
        this.goalSelector.add(3, new WanderAroundFarGoal(this, 0.75f, 1));
        this.goalSelector.add(4, new LookAroundGoal(this));
        this.goalSelector.add(1, new AttackGoal(this));
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        this.targetSelector.add(1, new CalEntity.AddTargetGoal(this));
    }

    public boolean tryAttack(Entity target) {
        return target.damage(getDamageSources().create(ModDamageTypes.KILLED_BY_CAL, this), (float) this.getAttributeBaseValue(EntityAttributes.GENERIC_ATTACK_DAMAGE));
    }

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()) {
            this.setupAnimationStates();
        }
    }

    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.ENTITY_WOLF_STEP, 0.15f, 1.0f);
    }

    public boolean canBeLeashedBy(PlayerEntity player) {
        return true;
    }



    private static class AddTargetGoal extends ActiveTargetGoal<PlayerEntity> {
        AddTargetGoal(CalEntity cal) {
            super(cal, PlayerEntity.class, 100, true, true, LivingEntity::isPartOfGame);
            Objects.requireNonNull(cal);
        }

        public boolean canStart() {
            return true;
        }

        public boolean shouldContinue() {
            PlayerEntity target = this.mob.getWorld().getClosestEntity(PlayerEntity.class, TargetPredicate.DEFAULT, mob, mob.getX(), mob.getY(), mob.getZ(), mob.getBoundingBox().expand(32));
            if(target instanceof ServerPlayerEntity serverPlayer) {
                int stat = serverPlayer.getStatHandler().getStat(Stats.MINED, Blocks.MELON);
                UUID uuidTarget = target.getUuid();
                if(stat % 2 == 1){
                    this.mob.addStatusEffect(new StatusEffectInstance(CustomEffects.START, 20, 0, true, false));
                    if(this.mob.hasStatusEffect(CustomEffects.COMPLETE) && target.getUuid() == uuidTarget){
                        this.mob.setTarget(target);
                    }
                }
                if(stat % 2 != 1){
                    this.mob.addStatusEffect(new StatusEffectInstance(CustomEffects.COMPLETE, 20, 0, true, false));
                    if(this.mob.hasStatusEffect(CustomEffects.START) && target.getUuid() == uuidTarget){
                        this.mob.setTarget(target);
                    }
                }
            }
            return true;
        }
    }
}

