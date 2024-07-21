
package net.romeosnowblitz.hmh2.entity.monster.lost_soul;

import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;

public class LostSoulEntity extends HostileEntity {
    final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public LostSoulEntity(EntityType<? extends HostileEntity> entityType, World world) {
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
        return HostileEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 8.0)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 2.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f);
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
        if(target instanceof PlayerEntity player && !player.hasStatusEffect(CustomEffects.NECROMANCER)){
            return target.damage(this.getDamageSources().create(ModDamageTypes.KILLED_BY_GHOST, this), (float) this.getAttributeBaseValue(EntityAttributes.GENERIC_ATTACK_DAMAGE));
        }
        return false;
    }

    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.UI_TOAST_OUT, 0.15f, 1.0f);
    }


}

