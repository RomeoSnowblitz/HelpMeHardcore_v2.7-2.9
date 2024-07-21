package net.romeosnowblitz.hmh2.entity.fish.lava;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.SchoolingFishEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class LavaFishEntity extends SchoolingFishEntity {

    public LavaFishEntity(EntityType<? extends SchoolingFishEntity> entityType, World world) {
        super(entityType, world);
    }


    public static DefaultAttributeContainer.Builder setAttributes() {
        return TameableEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 1.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f);
    }

    @Override
    public boolean tryAttack(Entity target) {
        return super.tryAttack(target);
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
    protected SoundEvent getFlopSound() {return SoundEvents.ENTITY_COD_FLOP;}
}
