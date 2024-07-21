package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.Item;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LureItem extends Item {

    public LureItem(Settings settings) {
        super(settings);
    }

    public void onItemEntityDestroyed(ItemEntity entity) {
        World world = entity.getWorld();
        BlockPos pos = entity.getBlockPos();
        EntityType.BEE.spawn((ServerWorld) world, pos, SpawnReason.MOB_SUMMONED);
    }

}
