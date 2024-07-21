package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.util.ModStats;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ClassResetter extends Item {
    public ClassResetter(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(user instanceof ServerPlayerEntity serverPlayer && serverPlayer.isCreative()){
            user.sendMessage(Text.literal("Your Stats Have Been Reset!"));
            user.removeStatusEffect(CustomEffects.NECROMANCER);
            user.removeStatusEffect(CustomEffects.SORCERER);
            user.removeStatusEffect(CustomEffects.PACIFIST);
            user.removeStatusEffect(CustomEffects.ENVIRONMENTALIST);
            user.removeStatusEffect(CustomEffects.BLOOD_WITCH);
            serverPlayer.getStatHandler().setStat(serverPlayer, Stats.CUSTOM.getOrCreateStat(ModStats.BLESSED), 0);
            serverPlayer.getStatHandler().setStat(serverPlayer, Stats.CUSTOM.getOrCreateStat(ModStats.CLASS_ID), 0);
            serverPlayer.getStatHandler().setStat(serverPlayer, Stats.CUSTOM.getOrCreateStat(Stats.DEATHS), 0);
            serverPlayer.getStatHandler().setStat(serverPlayer, Stats.CUSTOM.getOrCreateStat(ModStats.NUMBER_OF_BLESSINGS), 0);
        }
        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(1, Text.literal("Creative+Use: Resets Blessings, Classes, and Deaths").formatted(Formatting.YELLOW));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
