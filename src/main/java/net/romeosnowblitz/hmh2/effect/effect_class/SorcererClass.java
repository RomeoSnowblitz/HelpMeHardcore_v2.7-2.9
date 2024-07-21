package net.romeosnowblitz.hmh2.effect.effect_class;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.item.MagicItems;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.util.ModStats;

public class SorcererClass extends StatusEffect {
    public SorcererClass(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public static int t = 0;

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if(entity instanceof ServerPlayerEntity serverPlayer && serverPlayer.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID))==0){
            serverPlayer.getStatHandler().setStat(serverPlayer, Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID), 2);
        }
        super.onApplied(entity, attributes, amplifier);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity instanceof PlayerEntity player && player.isSneaking()){
            if(player.getOffHandStack().isOf(MagicItems.AMULET) ||  player.getMainHandStack().isOf(MagicItems.AMULET)){
                if (player.getMainHandStack().isOf(Items.AMETHYST_SHARD) ||  player.getOffHandStack().isOf(Items.AMETHYST_SHARD)) {
                    player.getMainHandStack().decrement(1); player.getOffHandStack().decrement(1);
                    player.giveItemStack(MagicItems.NAUSEA_AMULET.getDefaultStack());
                }
                if (player.getMainHandStack().isOf(Items.CHARCOAL) || player.getOffHandStack().isOf(Items.CHARCOAL)) {
                    player.getMainHandStack().decrement(1); player.getOffHandStack().decrement(1);
                    player.giveItemStack(MagicItems.WEAKNESS_AMULET.getDefaultStack());
                }
                if (player.getMainHandStack().isOf(Items.COAL) || player.getOffHandStack().isOf(Items.COAL)) {
                    player.getMainHandStack().decrement(1); player.getOffHandStack().decrement(1);
                    player.giveItemStack(MagicItems.DARKNESS_AMULET.getDefaultStack());
                }
                if (player.getMainHandStack().isOf(Items.DIAMOND) || player.getOffHandStack().isOf(Items.DIAMOND)) {
                    player.getMainHandStack().decrement(1); player.getOffHandStack().decrement(1);
                    player.giveItemStack(MagicItems.SPEED_AMULET.getDefaultStack());
                }
                if (player.getMainHandStack().isOf(Items.EMERALD) || player.getOffHandStack().isOf(Items.EMERALD)) {
                    player.getMainHandStack().decrement(1); player.getOffHandStack().decrement(1);
                    player.giveItemStack(MagicItems.VILLAGE_HERO_AMULET.getDefaultStack());
                }
                if (player.getMainHandStack().isOf(Items.FLINT) || player.getOffHandStack().isOf(Items.FLINT)) {
                    player.getMainHandStack().decrement(1); player.getOffHandStack().decrement(1);
                    player.giveItemStack(MagicItems.BLINDNESS_AMULET.getDefaultStack());
                }
                if (player.getMainHandStack().isOf(Items.GOLD_INGOT) || player.getOffHandStack().isOf(Items.GOLD_INGOT)) {
                    player.getMainHandStack().decrement(1); player.getOffHandStack().decrement(1);
                    player.giveItemStack(MagicItems.HASTE_AMULET.getDefaultStack());
                }
                if (player.getMainHandStack().isOf(Items.IRON_INGOT) || player.getOffHandStack().isOf(Items.IRON_INGOT)) {
                    player.getMainHandStack().decrement(1); player.getOffHandStack().decrement(1);
                    player.giveItemStack(MagicItems.INVISIBILITY_AMULET.getDefaultStack());
                }
                if (player.getMainHandStack().isOf(Items.LAPIS_LAZULI) || player.getOffHandStack().isOf(Items.LAPIS_LAZULI)) {
                    player.getMainHandStack().decrement(1); player.getOffHandStack().decrement(1);
                    player.giveItemStack(MagicItems.ABSORPTION_AMULET.getDefaultStack());
                }
            }
            if(player.getMainHandStack().isOf(ModItems.ENDER_INGOT) && player.getOffHandStack().isOf(Items.STICK) && player.isSneaking() ||
                    player.getOffHandStack().isOf(ModItems.ENDER_INGOT) && player.getMainHandStack().isOf(Items.STICK) && player.isSneaking()){
                player.getMainHandStack().decrement(1);player.getOffHandStack().decrement(1);
                player.giveItemStack(ModItems.PURPLE_TORCH_ITEM.getDefaultStack());
            }
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

}
