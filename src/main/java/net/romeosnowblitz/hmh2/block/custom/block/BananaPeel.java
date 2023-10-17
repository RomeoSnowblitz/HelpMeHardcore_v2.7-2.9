package net.romeosnowblitz.hmh2.block.custom.block;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.item.WarfareItems;

import java.util.Random;

public class BananaPeel extends HorizontalFacingBlock {
    public BananaPeel(Settings settings) {
        super(settings);
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        Random random = new Random();
        if(entity instanceof PlayerEntity player){
            if(!player.isSneaking() && !player.getEquippedStack(EquipmentSlot.FEET).isOf(WarfareItems.BANANA_BOOTS)) {
                if(!player.isSneaking()){
                    int a = random.nextInt(3);int b = random.nextInt(3);int c = random.nextInt(3);
                    entity.updateVelocity(1, Vec3d.of(new Vec3i(a-1, b-1, c-1)));
                }
            }
        } else {
            int a = random.nextInt(3);int b = random.nextInt(3);int c = random.nextInt(3);
            entity.updateVelocity(1, Vec3d.of(new Vec3i(a-1, b-1, c-1)));
        }
        super.onEntityCollision(state, world, pos, entity);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
}
