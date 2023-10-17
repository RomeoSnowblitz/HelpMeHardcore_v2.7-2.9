package net.romeosnowblitz.hmh2.crafting;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;

public class ClasslessCrafting extends Item {
    protected Item ingredient;
    protected Item result;

    public ClasslessCrafting(Item ingredient, Item result, Settings settings) {
        super(settings);
        this.ingredient = ingredient;
        this.result = result;
    }

    public static Boolean customCraft (PlayerEntity player){return player.isSneaking() && player.hasStatusEffect(CustomEffects.NORMIE);}

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(entity instanceof PlayerEntity player){
            ItemStack offhand = player.getStackInHand(Hand.OFF_HAND);ItemStack mainhand = player.getStackInHand(Hand.MAIN_HAND);
            if(mainhand.isOf(this) && offhand.isOf(ingredient) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(result.getDefaultStack());
            }
            if(offhand.isOf(this) && mainhand.isOf(ingredient) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(result.getDefaultStack());
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}