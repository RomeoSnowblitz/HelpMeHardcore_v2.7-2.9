package net.romeosnowblitz.hmh2.entity.lava;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class LavaCreatureEntity  extends PathAwareEntity {
    protected LavaCreatureEntity(EntityType<? extends LavaCreatureEntity> entityType, World world) {
        super(entityType, world);
        this.setPathfindingPenalty(PathNodeType.LAVA, 0.0F);
    }

    public EntityGroup getGroup() {
        return EntityGroup.AQUATIC;
    }

    public boolean canSpawn(WorldView world) {
        return world.doesNotIntersectEntities(this);
    }

    public int getMinAmbientSoundDelay() {
        return 120;
    }

    public int getXpToDrop() {
        return 1 + this.getWorld().random.nextInt(3);
    }

    protected void tickLavaBreathingAir(int air) {
        if (this.isAlive() && !this.isInLava()) {
            this.setAir(air - 1);
            if (this.getAir() == -20) {
                this.setAir(0);
                this.damage(this.getDamageSources().drown(), 2.0F);
            }
        } else {
            this.setAir(300);
        }
    }

    public void baseTick() {
        int i = this.getAir();
        super.baseTick();
        this.tickLavaBreathingAir(i);
    }

    public boolean isPushedByFluids() {
        return false;
    }

    public boolean canBeLeashedBy(PlayerEntity player) {
        return false;
    }

    public static boolean canSpawn(EntityType<? extends LavaCreatureEntity> type, WorldAccess world, SpawnReason reason, BlockPos pos, Random random) {
        return pos.getY() >= 17 && pos.getY() <= 30 && world.getFluidState(pos.down()).isIn(FluidTags.LAVA) && world.getBlockState(pos.up()).isOf(Blocks.LAVA);
    }
}
