package net.romeosnowblitz.hmh2.block.custom.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LightBlock;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class TemporaryLight extends LightBlock {
    public TemporaryLight(Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if(!world.isPlayerInRange(pos.getX(), pos.getY(), pos.getZ(), 3)){
            world.setBlockState(pos, Blocks.AIR.getDefaultState());
        }
        super.randomDisplayTick(state, world, pos, random);
    }

}
