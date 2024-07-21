package net.romeosnowblitz.hmh2.entity.fish.water;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.entity.passive.SchoolingFishEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class PiranhaEntity extends SchoolingFishEntity {

    public PiranhaEntity(EntityType<? extends SchoolingFishEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return TameableEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 1.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1.0f)
                .add(EntityAttributes.GENERIC_FLYING_SPEED, 1.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1.0f);
    }

    @Override
    public void tick() {
        super.tick();
        Entity entity = this.getTarget();
        if(entity != null){
            if(this.isInRange(entity, 10)){
                this.setVelocity(this.getVelocity().multiply(1.1D));
            }
        }
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
    protected SoundEvent getFlopSound() {
        return SoundEvents.ENTITY_COD_FLOP;
    }

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
