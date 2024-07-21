package net.romeosnowblitz.hmh2.block.custom.test;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;



public class EggShell extends Block {
    int power;

    public EggShell(int power, Settings settings) {
        super(settings);
        this.power = power;
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {

        for (BlockPos blockPos : BlockPos.iterate(pos.add(power, power, power), pos.add(-power, -power, -power))) {
            if (blockPos.isWithinDistance(pos, power) && blockPos.getY() > world.getBottomY() && blockPos.getY() < world.getTopY()-1) {
                if (!blockPos.isWithinDistance(pos, power-1)) {
                    world.setBlockState(blockPos, Blocks.GLASS.getDefaultState());
                }
                else {
                    world.setBlockState(blockPos, Blocks.LAVA.getDefaultState());
                }
            }
        }
    }
}
