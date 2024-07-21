package net.romeosnowblitz.hmh2.entity.lava;

import com.mojang.datafixers.DataFixUtils;
import net.minecraft.entity.ai.goal.Goal;

import java.util.List;
import java.util.function.Predicate;

public class LavaFollowGroupLeaderGoal extends Goal {
    private final LavaSchoolingFishEntity fish;
    private int moveDelay;
    private int checkSurroundingDelay;

    public LavaFollowGroupLeaderGoal(LavaSchoolingFishEntity fish) {
        this.fish = fish;
        this.checkSurroundingDelay = this.getSurroundingSearchDelay(fish);
    }

    protected int getSurroundingSearchDelay(LavaSchoolingFishEntity fish) {
        return toGoalTicks(200 + fish.getRandom().nextInt(200) % 20);
    }

    public boolean canStart() {
        if (this.fish.hasOtherFishInGroup()) {
            return false;
        } else if (this.fish.hasLeader()) {
            return true;
        } else if (this.checkSurroundingDelay > 0) {
            --this.checkSurroundingDelay;
            return false;
        } else {
            this.checkSurroundingDelay = this.getSurroundingSearchDelay(this.fish);
            Predicate<LavaSchoolingFishEntity> predicate = (fish) -> fish.canHaveMoreFishInGroup() || !fish.hasLeader();
            List<? extends LavaSchoolingFishEntity> list = this.fish.getWorld().getEntitiesByClass(this.fish.getClass(), this.fish.getBoundingBox().expand(8.0D, 8.0D, 8.0D), predicate);
            LavaSchoolingFishEntity lavaSchoolingFishEntity = DataFixUtils.orElse(list.stream().filter(LavaSchoolingFishEntity::canHaveMoreFishInGroup).findAny(), this.fish);
            lavaSchoolingFishEntity.pullInOtherFish(list.stream().filter((fish) -> !fish.hasLeader()));
            return this.fish.hasLeader();
        }
    }

    public boolean shouldContinue() {
        return this.fish.hasLeader() && this.fish.isCloseEnoughToLeader();
    }

    public void start() {
        this.moveDelay = 0;
    }

    public void stop() {
        this.fish.leaveGroup();
    }

    public void tick() {
        if (--this.moveDelay <= 0) {
            this.moveDelay = this.getTickCount(10);
            this.fish.moveTowardLeader();
        }
    }
}
