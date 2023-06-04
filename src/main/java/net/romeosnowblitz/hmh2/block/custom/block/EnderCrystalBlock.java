/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1667
 *  net.minecraft.class_1676
 *  net.minecraft.class_1927
 *  net.minecraft.class_1937
 *  net.minecraft.class_1937$class_7867
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_3965
 *  net.minecraft.class_4970$class_2251
 */
package net.romeosnowblitz.hmh2.block.custom.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;

public class EnderCrystalBlock
extends Block {
    public EnderCrystalBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        super.onProjectileHit(world, state, hit, projectile);
        if(!world.isClient()){
            world.setBlockState(hit.getBlockPos(), Blocks.AIR.getDefaultState());
            world.createExplosion(projectile, hit.getBlockPos().getX(), hit.getPos().getY(), hit.getBlockPos().getZ(), 9.0f, World.ExplosionSourceType.BLOCK);
        }
    }

}

