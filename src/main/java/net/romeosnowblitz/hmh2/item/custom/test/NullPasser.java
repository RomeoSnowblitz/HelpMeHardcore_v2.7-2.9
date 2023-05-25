package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class NullPasser extends Item {
    public NullPasser(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
            if (!user.world.isClient()) {
                double y = user.getY();
                user.teleport(0, y, 0);
                user.setVelocity(0, 0, 0);
                itemStack.damage(1, user, (p) -> {p.sendToolBreakStatus(hand);});
            }
        return super.use(world, user, hand);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.world.isClient()) {
            double y = target.getY();
            target.teleport(0, y, 0);
            target.setVelocity(0, 0, 0);
            stack.damage(1, attacker, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }
        return super.postHit(stack, target, attacker);
    }

}
