package net.romeosnowblitz.hmh2.entity.headless_horseman;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.scoreboard.AbstractTeam;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;

public class HeadlessHorsemanEntity extends HostileEntity {

    public HeadlessHorsemanEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.setCustomName(Text.empty());
    }

    public float getNameLabelHeight() {
        return this.getHeight();
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return TameableEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 1.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.1f);
    }

    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(3, new WanderAroundFarGoal(this, 0.75f, 1));
        this.goalSelector.add(4, new LookAroundGoal(this));
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        this.goalSelector.add(1, new AttackGoal(this));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, true).setMaxTimeWithoutVisibility(300));
    }

    public static boolean canSpawn(EntityType<HeadlessHorsemanEntity> type, WorldAccess world, SpawnReason spawnReason, BlockPos pos, Random random) {
        return !world.getBlockState(pos.down()).isOf(Blocks.NETHER_WART_BLOCK);
    }

    @Override
    public boolean tryAttack(Entity target) {
        /*
        if(this.getWorld().getDimension().ultrawarm()){
            this.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).setBaseValue(10);
        }
        if(this.getWorld().getDimension().hasRaids() && !this.getWorld().getDimension().bedWorks()){
            this.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).setBaseValue(20);
        }
         */
        if (getTarget() != null) {
            int i = 1;
            if (getTarget().getStatusEffect(CustomEffects.HEALTH_SHRINKAGE) != null) {
                i += getTarget().getStatusEffect(CustomEffects.HEALTH_SHRINKAGE).getAmplifier();
                getTarget().removeStatusEffectInternal(CustomEffects.HEALTH_SHRINKAGE);
            } else {--i;}i = MathHelper.clamp(i, 0, 20);
            getTarget().addStatusEffect(new StatusEffectInstance(CustomEffects.HEALTH_SHRINKAGE, 72000, i, false, false, true));
        }
        return target.damage(getDamageSources().create(ModDamageTypes.KILLED_BY_SHADOW_CREATURE, this), (float) this.getAttributeBaseValue(EntityAttributes.GENERIC_ATTACK_DAMAGE));
    }

    @Override protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_CHICKEN_STEP;
    }
    @Override protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.PARTICLE_SOUL_ESCAPE;
    }
    @Override protected SoundEvent getDeathSound() {return SoundEvents.ENTITY_VEX_CHARGE;}
    @Override protected void playStepSound(BlockPos pos, BlockState state) {this.playSound(SoundEvents.UI_TOAST_IN, 0.5f, 1.0f);}
    @Override public AbstractTeam getScoreboardTeam() {
        return super.getScoreboardTeam();
    }
}
