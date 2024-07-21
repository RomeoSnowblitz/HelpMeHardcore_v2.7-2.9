package net.romeosnowblitz.hmh2.block.custom.test;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SpawnBlock extends Block {
    public SpawnBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity user, Hand hand, BlockHitResult hit) {
        if(user instanceof ServerPlayerEntity player) {
            player.setSpawnPoint(world.getRegistryKey(), player.getBlockPos(), 0, true, false);
            player.sendMessage(Text.literal("Checkpoint"));
            return ActionResult.SUCCESS;
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof ServerPlayerEntity player){
            player.sendMessage(Text.literal(String.valueOf(player.getSpawnPointPosition())));
        }
        super.onSteppedOn(world, pos, state, entity);
    }
}
