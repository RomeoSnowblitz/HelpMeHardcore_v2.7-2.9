package net.romeosnowblitz.hmh2.block.custom.test;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RandomBlock extends Block {
    public RandomBlock(Settings settings) {
        super(settings);
    }

    static Random random = new Random();
    static Block y = randomBlocks();

    public static Block randomBlocks() {
        int i = random.nextInt(8 + 1);
        if (i==1){y = Blocks.IRON_BLOCK;}
        if (i==2){y = Blocks.LAPIS_BLOCK;}
        if (i==3){y = Blocks.AMETHYST_BLOCK;}
        if (i==4){y = Blocks.BONE_BLOCK;}
        if (i==5){y = Blocks.OBSIDIAN;}
        if (i==6){y = Blocks.DIAMOND_BLOCK;}
        if (i==7){y = Blocks.EMERALD_BLOCK;}
        if (i==8){y = Blocks.GOLD_BLOCK;}
        return y;
    }

    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(!world.isClient){
            randomBlocks();
            RandomBlock.setToRandom(state, world, pos);
        }
    }

    public static void setToRandom(BlockState state, World world, BlockPos pos) {
        world.setBlockState(pos, RandomBlock.pushEntitiesUpBeforeBlockChange(state, y.getDefaultState(), world, pos));
    }

    public static BlockState pushEntitiesUpBeforeBlockChange(BlockState from, BlockState to, WorldAccess world, BlockPos pos) {
        VoxelShape voxelShape = VoxelShapes.combine(from.getCollisionShape(world, pos), to.getCollisionShape(world, pos), BooleanBiFunction.ONLY_SECOND).offset((double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
        if (voxelShape.isEmpty()) {
            return to;
        } else {
            List<Entity> list = world.getOtherEntities((Entity)null, voxelShape.getBoundingBox());
            Iterator var6 = list.iterator();

            while(var6.hasNext()) {
                Entity entity = (Entity)var6.next();
                double d = VoxelShapes.calculateMaxOffset(Direction.Axis.Y, entity.getBoundingBox().offset(0.0D, 1.0D, 0.0D), List.of(voxelShape), -1.0D);
                entity.requestTeleportOffset(0.0D, 1.0D + d, 0.0D);
            }

            return to;
        }
    }

}