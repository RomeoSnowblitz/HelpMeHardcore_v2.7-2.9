package net.romeosnowblitz.hmh2.item.custom.tools;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.GameMode;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import net.romeosnowblitz.hmh2.util.ModStats;

public class UniversalRevivalStone extends Item {
    public UniversalRevivalStone(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient){
            ServerPlayerEntity ghostPlayer = (ServerPlayerEntity)world.getClosestPlayer(user.getX(), user.getY() + 5.0, user.getZ(), 10.0, EntityPredicates.VALID_ENTITY);
            if (ghostPlayer.isSpectator()) {
                user.addExperienceLevels(-ghostPlayer.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.REVIVAL_TOTAL)));
                ghostPlayer.getStatHandler().setStat(ghostPlayer, Stats.CUSTOM.getOrCreateStat(ModStats.BLESSED), 0);
                ghostPlayer.addExperienceLevels(1);
                ghostPlayer.changeGameMode(GameMode.SURVIVAL);
                user.getStackInHand(hand).decrement(1);
                if(!user.hasStatusEffect(CustomEffects.NECROMANCER)){
                    user.damage(user.getWorld().getDamageSources().create(ModDamageTypes.KILLED_BY_SORCERER_ATTEMPT), 200);
                }
            }
        }
        return super.use(world, user, hand);
    }



}
