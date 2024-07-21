package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class DecreasingItem extends Item {
    public DecreasingItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (context.getHand() == Hand.MAIN_HAND || !context.getPlayer().getMainHandStack().isOf(this)) {
            context.getPlayer().getStackInHand(context.getHand()).decrement(1);
        }
        return super.useOnBlock(context);
    }


    /*
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        if(user.getInventory().contains(Items.ENDER_PEARL.getDefaultStack())){
            EnderPearlEntity enderPearlEntity = new EnderPearlEntity(world, user);
            enderPearlEntity.setItem(Items.ENDER_PEARL.getDefaultStack());
            enderPearlEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0, 3, 0);
            world.spawnEntity(enderPearlEntity);
            user.getInventory().remove(p -> p.isOf(Items.ENDER_PEARL), 1, user.getInventory());
        }
        return super.use(world, user, hand);
    }

     */

}
