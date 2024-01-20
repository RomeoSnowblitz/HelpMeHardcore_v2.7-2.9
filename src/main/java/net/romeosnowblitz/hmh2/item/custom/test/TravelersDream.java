package net.romeosnowblitz.hmh2.item.custom.test;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Random;

public class TravelersDream extends Item {
    public TravelersDream(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        Random random = new Random(); int wb = 2999983;
        if(player.getWorld().getDimension().bedWorks()){
            player.teleport(random.nextInt(wb*2)-wb, random.nextInt(384)-63, random.nextInt(wb*2)-wb);
        } else {
            player.teleport(random.nextInt(wb*2)-wb, random.nextInt(319)+1, random.nextInt(wb*2)-wb);
        }
        player.getStackInHand(hand).decrement(1);
        return super.use(world, player, hand);
    }
}
