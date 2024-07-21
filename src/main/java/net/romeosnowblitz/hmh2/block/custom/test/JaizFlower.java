package net.romeosnowblitz.hmh2.block.custom.test;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CocoaBlock;
import net.minecraft.entity.Entity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.Objects;
import java.util.Set;

public class JaizFlower extends Block {


    public JaizFlower(Settings settings) {
        super(settings);
    }


    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if(entity.getServer() != null){
            ServerWorld serverWorld = entity.getServer().getWorlds().iterator().next();
            entity.teleport(serverWorld.getServer().getWorld(World.END), entity.getX(), entity.getY(), entity.getZ(), Set.of(), entity.getYaw(), entity.getPitch());
        }
        super.onEntityCollision(state, world, pos, entity);
    }

}
