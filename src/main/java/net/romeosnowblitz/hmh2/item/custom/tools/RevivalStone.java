package net.romeosnowblitz.hmh2.item.custom.tools;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.GameMode;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;

public class RevivalStone
        extends Item {
    public RevivalStone(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient && user.hasStatusEffect(CustomEffects.NECROMANCER)) {
            ServerPlayerEntity ghostPlayer = (ServerPlayerEntity)world.getClosestPlayer(user.getX(), user.getY() + 5.0, user.getZ(), 10.0, EntityPredicates.VALID_ENTITY);
            if (ghostPlayer.isSpectator()) {
                ghostPlayer.addExperienceLevels(1);
                ghostPlayer.changeGameMode(GameMode.SURVIVAL);
                user.getStackInHand(hand).damage(1, user, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
                user.addExperienceLevels(-100);
            }
        }
        return super.use(world, user, hand);
    }
}
