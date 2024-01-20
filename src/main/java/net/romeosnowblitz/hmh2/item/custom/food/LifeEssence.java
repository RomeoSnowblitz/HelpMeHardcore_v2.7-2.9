package net.romeosnowblitz.hmh2.item.custom.food;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.util.ModStats;

public class LifeEssence extends Heart {
    public LifeEssence(Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        if (user instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)user;
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }
        if(user instanceof ServerPlayerEntity serverPlayer){
            serverPlayer.getHungerManager().addExhaustion(20);
            serverPlayer.getHungerManager().setSaturationLevel(-20);
            if(serverPlayer.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.BLESSED))==0){
                serverPlayer.increaseStat(Stats.CUSTOM.getOrCreateStat(ModStats.BLESSED), 1);
                serverPlayer.increaseStat(Stats.CUSTOM.getOrCreateStat(ModStats.NUMBER_OF_BLESSINGS), 1);
            }
            if(serverPlayer.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.REVIVAL_TOTAL)) > 1){
                serverPlayer.incrementStat(Stats.CUSTOM.getOrCreateStat(ModStats.REVIVAL_DISCOUNT));
            }
        }

        return stack;
    }

}
