package net.romeosnowblitz.hmh2.entity.lava;

import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.stream.Stream;

public class LavaSchoolingFishEntity extends LavaFishEntity {
    @Nullable
    private LavaSchoolingFishEntity leader;
    private int groupSize = 1;

    public LavaSchoolingFishEntity(EntityType<? extends LavaSchoolingFishEntity> entityType, World world) {
        super(entityType, world);
    }

    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(5, new LavaFollowGroupLeaderGoal(this));
    }

    public int getLimitPerChunk() {
        return this.getMaxGroupSize();
    }

    public int getMaxGroupSize() {
        return super.getLimitPerChunk();
    }

    protected boolean hasSelfControl() {
        return !this.hasLeader();
    }

    public boolean hasLeader() {
        return this.leader != null && this.leader.isAlive();
    }

    public void joinGroupOf(LavaSchoolingFishEntity groupLeader) {
        this.leader = groupLeader;
        groupLeader.increaseGroupSize();
    }

    public void leaveGroup() {
        this.leader.decreaseGroupSize();
        this.leader = null;
    }

    private void increaseGroupSize() {
        ++this.groupSize;
    }

    private void decreaseGroupSize() {
        --this.groupSize;
    }

    public boolean canHaveMoreFishInGroup() {
        return this.hasOtherFishInGroup() && this.groupSize < this.getMaxGroupSize();
    }

    public void tick() {
        super.tick();
        if (this.hasOtherFishInGroup() && this.getWorld().random.nextInt(200) == 1) {
            List<? extends LavaFishEntity> list = this.getWorld().getNonSpectatingEntities(this.getClass(), this.getBoundingBox().expand(8.0D, 8.0D, 8.0D));
            if (list.size() <= 1) {
                this.groupSize = 1;
            }
        }

    }

    public boolean hasOtherFishInGroup() {
        return this.groupSize > 1;
    }

    public boolean isCloseEnoughToLeader() {
        return this.squaredDistanceTo(this.leader) <= 121.0D;
    }

    public void moveTowardLeader() {
        if (this.hasLeader()) {
            this.getNavigation().startMovingTo(this.leader, 1.0D);
        }

    }

    public void pullInOtherFish(Stream<? extends LavaSchoolingFishEntity> fish) {
        fish.limit(this.getMaxGroupSize() - this.groupSize).filter((fishx) -> {
            return fishx != this;
        }).forEach((fishx) -> {
            fishx.joinGroupOf(this);
        });
    }

    @Nullable
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
        super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
        if (entityData == null) {
            entityData = new LavaSchoolingFishEntity.FishData(this);
        } else {
            this.joinGroupOf(((LavaSchoolingFishEntity.FishData)entityData).leader);
        }

        return entityData;
    }

    public static class FishData implements EntityData {
        public final LavaSchoolingFishEntity leader;

        public FishData(LavaSchoolingFishEntity leader) {
            this.leader = leader;
        }
    }
}