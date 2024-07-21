package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import net.romeosnowblitz.hmh2.util.ModStats;

public class KrakenHeart extends Item {
    public KrakenHeart(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 200;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if(user instanceof ServerPlayerEntity serverPlayer && serverPlayer.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID)) == 0){
            serverPlayer.getStatHandler().setStat(serverPlayer, Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID), 4);
        } else {
            user.damage(user.getWorld().getDamageSources().create(ModDamageTypes.KILLED_BY_BLOOD_WITCH_ATTEMPT), 200.0F);
        }
        return super.finishUsing(stack, world, user);
    }
}
