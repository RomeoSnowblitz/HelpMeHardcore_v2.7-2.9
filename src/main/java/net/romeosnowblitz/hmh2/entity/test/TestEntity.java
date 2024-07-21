package net.romeosnowblitz.hmh2.entity.test;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.entity.lava.LavaSchoolingFishEntity;

public class TestEntity extends LavaSchoolingFishEntity {

    public TestEntity(EntityType<? extends LavaSchoolingFishEntity> entityType, World world) {
        super(entityType, world);
        this.navigation = this.createNavigation(world);
    }


    public static DefaultAttributeContainer.Builder setAttributes() {
        return TameableEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 1.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1.0f)
                .add(EntityAttributes.GENERIC_FLYING_SPEED, 1.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1.0f);
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
    protected SoundEvent getFlopSound() {return SoundEvents.ENTITY_SKELETON_AMBIENT;}
}
