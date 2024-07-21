package net.romeosnowblitz.hmh2.entity.lava;

import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.goal.EscapeDangerGoal;
import net.minecraft.entity.ai.goal.FleeEntityGoal;
import net.minecraft.entity.ai.goal.GoalSelector;
import net.minecraft.entity.ai.goal.SwimAroundGoal;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Objects;
import java.util.Random;
import java.util.function.Predicate;

public class LavaFishEntity extends LavaCreatureEntity implements Bucketable {
    private static final TrackedData<Boolean> FROM_BUCKET = DataTracker.registerData(LavaFishEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    Random random = new Random();

    public LavaFishEntity(EntityType<? extends LavaFishEntity> entityType, World world) {
        super(entityType, world);
        this.moveControl = new LavaFishEntity.FishMoveControl(this);
    }

    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return dimensions.height * 0.65F;
    }

    public boolean cannotDespawn() {
        return super.cannotDespawn() || this.isFromBucket();
    }

    public boolean canImmediatelyDespawn(double distanceSquared) {
        return !this.isFromBucket() && !this.hasCustomName();
    }

    public int getLimitPerChunk() {
        return 8;
    }

    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(FROM_BUCKET, false);
    }

    public boolean isFromBucket() {
        return this.dataTracker.get(FROM_BUCKET);
    }

    public void setFromBucket(boolean fromBucket) {
        this.dataTracker.set(FROM_BUCKET, fromBucket);
    }

    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putBoolean("FromBucket", this.isFromBucket());
    }

    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        this.setFromBucket(nbt.getBoolean("FromBucket"));
    }

    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(0, new EscapeDangerGoal(this, 1.25D));
        GoalSelector var10000 = this.goalSelector;
        Predicate var10009 = EntityPredicates.EXCEPT_SPECTATOR;
        Objects.requireNonNull(var10009);
        var10000.add(2, new FleeEntityGoal(this, PlayerEntity.class, 8.0F, 1.6D, 1.4D, var10009::test));
        this.goalSelector.add(4, new LavaFishEntity.SwimToRandomPlaceGoal(this));
    }

    protected EntityNavigation createNavigation(World world) {
        return new LavaSwimNavigation(this, world);
    }

    public void travel(Vec3d movementInput) {
        if (this.isInLava()) {
            this.updateVelocity(0.01F, movementInput);
            this.move(MovementType.SELF, this.getVelocity());
            this.setVelocity(this.getVelocity().multiply(0.9D));
        } else {
            super.travel(movementInput);
        }

    }

    public void tickMovement() {
        if (!this.isInLava() && this.isOnGround() && this.verticalCollision) {
            this.setVelocity(this.getVelocity().add((this.random.nextFloat() * 2.0F - 1.0F) * 0.05F, 0.4000000059604645D, (this.random.nextFloat() * 2.0F - 1.0F) * 0.05F));
            this.setOnGround(false);
            this.velocityDirty = true;
            this.playSound(this.getFlopSound(), this.getSoundVolume(), this.getSoundPitch());
        }

        super.tickMovement();
    }

    protected ActionResult interactMob(PlayerEntity player, Hand hand) {
        return Bucketable.tryBucket(player, hand, this).orElse(super.interactMob(player, hand));
    }

    public void copyDataToStack(ItemStack stack) {
        Bucketable.copyDataToStack(this, stack);
    }

    public void copyDataFromNbt(NbtCompound nbt) {
        Bucketable.copyDataFromNbt(this, nbt);
    }

    @Override
    public ItemStack getBucketItem() {
        return Items.COD_BUCKET.getDefaultStack();
    }

    public SoundEvent getBucketFillSound() {
        return SoundEvents.ITEM_BUCKET_FILL_FISH;
    }


    protected SoundEvent getFlopSound() {
        return null;
    }

    protected SoundEvent getSwimSound() {
        return SoundEvents.ENTITY_FISH_SWIM;
    }

    protected void playStepSound(BlockPos pos, BlockState state) {
    }

    static class FishMoveControl extends MoveControl {
        private final LavaFishEntity fish;
        Random random = new Random();

        FishMoveControl(LavaFishEntity owner) {
            super(owner);
            this.fish = owner;
        }

        public void tick() {
            PlayerEntity entity = this.fish.getWorld().getClosestPlayer(this.fish, 10);
            if(entity != null){entity.sendMessage(Text.literal(String.valueOf(this.getTargetX())).formatted(Formatting.RED));}
            if(entity != null){entity.sendMessage(Text.literal(String.valueOf(this.getTargetZ())).formatted(Formatting.BLACK));}
            if (this.fish.isSubmergedIn(FluidTags.LAVA)) {
                this.fish.setVelocity(this.fish.getVelocity().add(0.0D, 0.005D, 0.0D));
            }

            if (this.state == State.MOVE_TO && !this.fish.getNavigation().isIdle()) {
                float f = (float)(this.speed * this.fish.getAttributeValue(EntityAttributes.GENERIC_MOVEMENT_SPEED));
                this.fish.setMovementSpeed(MathHelper.lerp(0.125F, this.fish.getMovementSpeed(), f/2));
                double d = this.fish.getX()+(random.nextInt(10)-5) - this.fish.getX();
                double e = this.fish.getY()+(random.nextInt(4)-2) - this.fish.getY();
                double g = this.fish.getZ()+(random.nextInt(10)-5) - this.fish.getZ();
                double h = Math.sqrt(d * d + e * e + g * g);
                if (e != 0.0D) {
                    this.fish.setVelocity(this.fish.getVelocity().add(0.0D, (double)this.fish.getMovementSpeed() * (e / h) * 0.1D, 0.0D));
                }

                if (d != 0.0D || g != 0.0D) {
                    this.fish.setVelocity(this.fish.getVelocity().add((double)this.fish.getMovementSpeed() * (d / h) * 0.1D, 0.0D, (double)this.fish.getMovementSpeed() * (g / h) * 0.1D));

                    //this.fish.setYaw(this.wrapDegrees(this.fish.getYaw(), (float)(MathHelper.atan2(g, d) * 57.3D) - 90.0F, 90.0F));
                    float m = (float) (d*d + g*g);
                    this.fish.setYaw((m*m)/2);
                    this.fish.bodyYaw = this.fish.getYaw();
                }
            } else {
                this.fish.setMovementSpeed(0.0F);
            }
        }
    }

    static class SwimToRandomPlaceGoal extends SwimAroundGoal {
        Random random = new Random();
        public SwimToRandomPlaceGoal(LavaFishEntity fish) {
            super(fish, 1.0D, 40);
        }
        public boolean canStart() {
            return true;
        }
    }
}

