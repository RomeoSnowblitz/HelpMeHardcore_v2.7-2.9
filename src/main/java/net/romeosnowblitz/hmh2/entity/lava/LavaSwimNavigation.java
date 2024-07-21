package net.romeosnowblitz.hmh2.entity.lava;

import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeNavigator;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.entity.ModEntities;
import net.romeosnowblitz.hmh2.entity.lava.LavaPathNodeMaker;

public class LavaSwimNavigation extends EntityNavigation {
    private boolean canJumpOutOfLava;

    public LavaSwimNavigation(MobEntity mobEntity, World world) {
        super(mobEntity, world);
    }

    protected PathNodeNavigator createPathNodeNavigator(int range) {
        this.canJumpOutOfLava = this.entity.getType() == ModEntities.BLOODMITE;
        this.nodeMaker = new LavaPathNodeMaker(this.canJumpOutOfLava);
        return new PathNodeNavigator(this.nodeMaker, range);
    }

    protected boolean isAtValidPosition() {
        return this.canJumpOutOfLava || this.isInLiquid();
    }

    protected Vec3d getPos() {
        return new Vec3d(this.entity.getX(), this.entity.getBodyY(0.5D), this.entity.getZ());
    }

    protected double adjustTargetY(Vec3d pos) {
        return pos.y;
    }

    protected boolean canPathDirectlyThrough(Vec3d origin, Vec3d target) {
        return doesNotCollide(this.entity, origin, target, false);
    }

    public boolean isValidPosition(BlockPos pos) {
        return !this.world.getBlockState(pos).isOpaqueFullCube(this.world, pos);
    }

    public void setCanSwim(boolean canSwim) {
    }
}