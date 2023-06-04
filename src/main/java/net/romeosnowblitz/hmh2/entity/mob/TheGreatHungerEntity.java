package net.romeosnowblitz.hmh2.entity.mob;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TimeHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.EntityView;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.entity.MobEntities;
import net.romeosnowblitz.hmh2.item.WarfareItems;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.Animation;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;

import java.util.UUID;
import java.util.function.Predicate;

public class TheGreatHungerEntity extends TameableEntity implements GeoEntity, Angerable {
    private AnimatableInstanceCache factory = new SingletonAnimatableInstanceCache(this);
    private static final TrackedData<Integer> ANGER_TIME = DataTracker.registerData(TheGreatHungerEntity.class, TrackedDataHandlerRegistry.INTEGER);
    public static final Predicate<LivingEntity> FOLLOW_TAMED_PREDICATE = entity -> {EntityType<?> entityType = entity.getType();return entityType == EntityType.TURTLE;};
    private static final UniformIntProvider ANGER_TIME_RANGE = TimeHelper.betweenSeconds(20, 39);
    @Nullable private UUID angryAt;

    public TheGreatHungerEntity(EntityType<? extends TameableEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.getItem() == Items.TURTLE_EGG;
    }


    public static DefaultAttributeContainer.Builder setAttributes() {
        return AnimalEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 8.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 2.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f);
    }

    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new PounceAtTargetGoal(this, 0.4f));
        this.goalSelector.add(2, new MeleeAttackGoal(this, 1.0, true));
        this.goalSelector.add(3, new WanderAroundPointOfInterestGoal(this, 0.75f, false));
        this.goalSelector.add(4, new WanderAroundFarGoal(this, 0.75f, 1));
        this.goalSelector.add(5, new LookAroundGoal(this));
        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        this.targetSelector.add(1, new UntamedActiveTargetGoal<>(this, AnimalEntity.class, false, FOLLOW_TAMED_PREDICATE));
        this.targetSelector.add(2, new AnimalMateGoal(this, 1.0));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, PlayerEntity.class, 10, true, false, this::shouldAngerAt));
        this.targetSelector.add(4, new UniversalAngerGoal<>(this, true));
    }

    private PlayState predicate(software.bernie.geckolib.core.animation.AnimationState animationState) {
        if(animationState.isMoving()) {
            animationState.getController().setAnimation(RawAnimation.begin().then("animation.the_great_hunger.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }

        animationState.getController().setAnimation(RawAnimation.begin().then("animation.the_great_hunger.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    public void registerControllers(AnimatableManager.ControllerRegistrar controllers){
        controllers.add(new AnimationController(this, "controller",
                0, this::predicate));

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return factory;
    }


    @Override protected SoundEvent getAmbientSound() {return SoundEvents.ENTITY_WARDEN_SNIFF;}
    @Override protected SoundEvent getHurtSound(DamageSource source) {return SoundEvents.ENTITY_WOLF_GROWL;}
    @Override protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_VEX_DEATH;
    }
    @Override protected void playStepSound(BlockPos pos, BlockState state) {this.playSound(SoundEvents.ENTITY_PIG_STEP, 0.15f, 1.0f);}


    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(ANGER_TIME, 0);
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        if (this.isInvulnerableTo(source)) {
            return false;
        }
        Entity entity = source.getAttacker();
        if (!this.world.isClient) {
            this.setSitting(false);
        }
        if (entity != null && !(entity instanceof PlayerEntity) && !(entity instanceof PersistentProjectileEntity)) {
            amount = (amount + 1.0f) / 2.0f;
        }
        return super.damage(source, amount);
    }

    @Override
    public boolean tryAttack(Entity target) {
        boolean bl = target.damage(target.getDamageSources().mobAttack(this), (int)this.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE));
        if (bl) {this.applyDamageEffects(this, target);}return bl;
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(WarfareItems.CLAYMORE) && !this.isBaby()) {
            player.playSound(SoundEvents.ENTITY_EVOKER_FANGS_ATTACK, 1.0f, 1.0f);
            ItemStack itemStack2 = ItemUsage.exchangeStack(itemStack, player, WarfareItems.TRUTHSEEKER.getDefaultStack());
            player.setStackInHand(hand, itemStack2);
            return ActionResult.success(this.world.isClient);
        }
        if (itemStack.isOf(WarfareItems.BREAD_KNIFE) && !this.isBaby()) {
            player.playSound(SoundEvents.ENTITY_EVOKER_FANGS_ATTACK, 1.0f, 1.0f);
            ItemStack itemStack2 = ItemUsage.exchangeStack(itemStack, player, WarfareItems.SOUL_KNIFE.getDefaultStack());
            player.setStackInHand(hand, itemStack2);
            return ActionResult.success(this.world.isClient);
        }
        if (itemStack.isOf(WarfareItems.CUTLASS) && !this.isBaby()) {
            player.playSound(SoundEvents.ENTITY_EVOKER_FANGS_ATTACK, 1.0f, 1.0f);
            ItemStack itemStack2 = ItemUsage.exchangeStack(itemStack, player, WarfareItems.MOON_DAGGER.getDefaultStack());
            player.setStackInHand(hand, itemStack2);
            return ActionResult.success(this.world.isClient);
        }
        if (itemStack.isOf(WarfareItems.SHEER_DAGGER) && !this.isBaby()) {
            player.playSound(SoundEvents.ENTITY_EVOKER_FANGS_ATTACK, 1.0f, 1.0f);
            ItemStack itemStack2 = ItemUsage.exchangeStack(itemStack, player, WarfareItems.TEMPEST_KNIFE.getDefaultStack());
            player.setStackInHand(hand, itemStack2);
            return ActionResult.success(this.world.isClient);
        }
        return super.interactMob(player, hand);
    }

    public int getAngerTime() {return this.dataTracker.get(ANGER_TIME);}
    public void setAngerTime(int angerTime) {this.dataTracker.set(ANGER_TIME, angerTime);}
    public void chooseRandomAngerTime() {this.setAngerTime(ANGER_TIME_RANGE.get(this.random));}
    public UUID getAngryAt() {return this.angryAt;}
    public void setAngryAt(@Nullable UUID angryAt) {this.angryAt = angryAt;}

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return MobEntities.THE_GREAT_HUNGER.create(world);
    }

    @Override
    public EntityView method_48926() {
        return null;
    }
}
