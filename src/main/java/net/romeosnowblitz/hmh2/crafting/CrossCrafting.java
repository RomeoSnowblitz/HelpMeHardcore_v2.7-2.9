package net.romeosnowblitz.hmh2.crafting;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.tag.ModItemTags;

public class CrossCrafting extends Item {

    public CrossCrafting(Settings settings) {
        super(settings);
    }
    /*
    public static Boolean customCraft (PlayerEntity player){return player.isSneaking();}

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(entity instanceof PlayerEntity player){
            ItemStack offhand = player.getStackInHand(Hand.OFF_HAND);ItemStack mainhand = player.getStackInHand(Hand.MAIN_HAND);
            if(mainhand.isOf(ModItems.NULL_PASSER) && offhand.isIn(ModItemTags.DCC_TEST) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(ModItems.TRAVELERS_DREAM.getDefaultStack());
            }
            if(offhand.isOf(ModItems.NULL_PASSER) && mainhand.isIn(ModItemTags.DCC_TEST) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(ModItems.TRAVELERS_DREAM.getDefaultStack());
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

     */
}