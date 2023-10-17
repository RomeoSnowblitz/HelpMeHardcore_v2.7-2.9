package net.romeosnowblitz.hmh2.block.custom.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class QuicksandFluidBlock extends FluidBlock {
    public QuicksandFluidBlock(FlowableFluid fluid, Settings settings) {
        super(fluid, settings);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.updateVelocity(0.1f, new Vec3d(0.05D, -0.50D, 0.05D ));
        entity.slowMovement(state, new Vec3d(0.25D, 0.25D, 0.25D));
        if(entity.isSubmergedIn(FluidTags.WATER)){
            entity.damage(world.getDamageSources().drown(), 1);
        }
        super.onEntityCollision(state, world, pos, entity);
    }
}