package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.GameMode;
import net.minecraft.world.World;

public class RevivalStone extends Item {
    public RevivalStone(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand==Hand.MAIN_HAND){
            ServerPlayerEntity closeNorth = (ServerPlayerEntity) world.getClosestPlayer(user.getX(), user.getY(),user.getZ()-5 , 10, EntityPredicates.VALID_ENTITY);
            ServerPlayerEntity closeSouth = (ServerPlayerEntity) world.getClosestPlayer(user.getX(), user.getY(),user.getZ()+5, 10, EntityPredicates.VALID_ENTITY);
            ServerPlayerEntity closeEast = (ServerPlayerEntity) world.getClosestPlayer(user.getX()+5, user.getY(),user.getZ(), 10, EntityPredicates.VALID_ENTITY);
            ServerPlayerEntity closeWest = (ServerPlayerEntity) world.getClosestPlayer(user.getX()-5, user.getY(),user.getZ(), 10, EntityPredicates.VALID_ENTITY);
            ServerPlayerEntity closeUp = (ServerPlayerEntity) world.getClosestPlayer(user.getX(), user.getY()+5,user.getZ(), 10, EntityPredicates.VALID_ENTITY);
            ServerPlayerEntity closeDown = (ServerPlayerEntity) world.getClosestPlayer(user.getX(), user.getY()-5,user.getZ(), 10, EntityPredicates.VALID_ENTITY);
            if (closeNorth.isSpectator() || closeSouth.isSpectator() || closeEast.isSpectator() || closeWest.isSpectator() || closeUp.isSpectator() || closeDown.isSpectator()){
                closeNorth.changeGameMode(GameMode.SURVIVAL);closeSouth.changeGameMode(GameMode.SURVIVAL);closeEast.changeGameMode(GameMode.SURVIVAL);
                closeWest.changeGameMode(GameMode.SURVIVAL);closeUp.changeGameMode(GameMode.SURVIVAL);closeDown.changeGameMode(GameMode.SURVIVAL);
                user.getStackInHand(hand).damage(1, user, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
            }
        }
        return super.use(world, user, hand);
    }
}
