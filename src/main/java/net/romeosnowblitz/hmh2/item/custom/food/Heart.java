package net.romeosnowblitz.hmh2.item.custom.food;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.util.ModStats;

public class Heart extends Item {
    public Heart(Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)user;
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }
        if(user instanceof ServerPlayerEntity serverPlayer && user.hasStatusEffect(CustomEffects.SAVING_GRACE)){
            StatusEffectInstance sg = serverPlayer.getStatusEffect(CustomEffects.SAVING_GRACE);
            if(sg.getAmplifier() >= 1){
                serverPlayer.removeStatusEffect(CustomEffects.SAVING_GRACE);
                serverPlayer.addStatusEffect(new StatusEffectInstance(CustomEffects.SAVING_GRACE, sg.getDuration(), sg.getAmplifier() - 1, false, true, true));
            } else {
                serverPlayer.removeStatusEffect(CustomEffects.SAVING_GRACE);
            }
            if(serverPlayer.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.REVIVAL_TOTAL)) > 1){
                serverPlayer.incrementStat(Stats.CUSTOM.getOrCreateStat(ModStats.REVIVAL_DISCOUNT));
            }
        }
        return super.finishUsing(stack, world, user);
    }
}
