package net.romeosnowblitz.hmh2.block.custom.test;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TorchBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.romeosnowblitz.hmh2.particle.ModParticleTypes;

public class LampTorch extends TorchBlock {
    public static final BooleanProperty LIT = Properties.LIT;

    public LampTorch(Settings settings) {
        super(settings, ModParticleTypes.PARTICLELESS);
        this.setDefaultState(this.stateManager.getDefaultState().with(LIT, false));
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        BlockState blockState;
        if (world.isClient) {
            return ActionResult.SUCCESS;
        } else {
            blockState = this.togglePower(state, world, pos);
            float f = blockState.get(LIT) ? 0.6F : 0.5F;
            world.playSound(null, pos, SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.BLOCKS, 0.3F, f);
            world.emitGameEvent(player, blockState.get(LIT) ? GameEvent.BLOCK_DEACTIVATE : GameEvent.BLOCK_ACTIVATE, pos);
            return ActionResult.CONSUME;
        }
    }

    public BlockState togglePower(BlockState state, World world, BlockPos pos) {
        state = state.cycle(LIT);
        world.setBlockState(pos, state, 3);
        world.updateNeighborsAlways(pos, this);
        return state;
    }

    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        Direction[] var6 = Direction.values();
        int var7 = var6.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            Direction direction = var6[var8];
            world.updateNeighborsAlways(pos.offset(direction), this);
        }
    }

    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!moved) {
            Direction[] var6 = Direction.values();
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
                Direction direction = var6[var8];
                world.updateNeighborsAlways(pos.offset(direction), this);
            }
        }
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (state.get(LIT)) {
            double d = (double)pos.getX() + 0.5D + (random.nextDouble() - 0.5D) * 0.2D;
            double e = (double)pos.getY() + 0.7D + (random.nextDouble() - 0.5D) * 0.2D;
            double f = (double)pos.getZ() + 0.5D + (random.nextDouble() - 0.5D) * 0.2D;
            world.addParticle(this.particle, d, e, f, 0.0D, 0.0D, 0.0D);
        }
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }


}
