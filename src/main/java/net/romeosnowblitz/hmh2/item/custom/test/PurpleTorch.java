package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.VerticallyAttachableBlockItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.entity.projectile.ModProjectileEntity;

public class PurpleTorch extends VerticallyAttachableBlockItem {
    public PurpleTorch(Block standingBlock, Block wallBlock, Settings settings, Direction verticalAttachmentDirection) {
        super(standingBlock, wallBlock, settings, verticalAttachmentDirection);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient()) {
            ModProjectileEntity magicProjectile = new ModProjectileEntity(world, user);
            magicProjectile.setVelocity(user, user.getPitch(), user.getYaw(), 0, 2f, 0);
            world.spawnEntity(magicProjectile);
            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.NEUTRAL,1.5F, 1F);
            user.getItemCooldownManager().set(this, 10);
            user.incrementStat(Stats.USED.getOrCreateStat(this));
            if (!user.getAbilities().creativeMode) {user.getStackInHand(hand).damage(1, user, p -> p.sendToolBreakStatus(hand));}
        }
        return TypedActionResult.success(user.getStackInHand(hand), world.isClient());
    }


}
