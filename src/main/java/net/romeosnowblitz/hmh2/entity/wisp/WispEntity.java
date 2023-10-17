package net.romeosnowblitz.hmh2.entity.wisp;

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

public class WispEntity extends HostileEntity {

    public WispEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.setCustomName(Text.empty());
    }


    public float getNameLabelHeight() {
        return this.getHeight()/2;
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return TameableEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 1.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f);
    }

    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(3, new WanderAroundFarGoal(this, 0.75f, 1));
        this.goalSelector.add(4, new LookAroundGoal(this));
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        this.goalSelector.add(1, new AttackGoal(this));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, true).setMaxTimeWithoutVisibility(300));
    }

    @Override
    public boolean tryAttack(Entity target) {
        PlayerEntity player = (PlayerEntity) target;
        int y = player.experienceLevel;
        int x = experiencePoints;
        if(!player.hasStatusEffect(CustomEffects.NECROMANCER)){
            if (y>=1) {
                player.addExperienceLevels(-1);
                experiencePoints = x+20;
                return target.damage(getDamageSources().create(ModDamageTypes.KILLED_BY_WISP, this), (float) this.getAttributeBaseValue(EntityAttributes.GENERIC_ATTACK_DAMAGE));
            }
            if(y==0){
                experiencePoints = x*2;
                return target.damage(getDamageSources().create(ModDamageTypes.KILLED_BY_WISP_FOR_0XP, this), (float) this.getAttributeBaseValue(EntityAttributes.GENERIC_ATTACK_DAMAGE)*20);
            }
        }
        return false;
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
