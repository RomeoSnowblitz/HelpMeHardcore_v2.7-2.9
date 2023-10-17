package net.romeosnowblitz.hmh2.crafting;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.item.MagicItems;

public class JewelsCC extends Item {
    protected Item amulet;
    protected Item fluid;

    public JewelsCC(Item amulet, Item fluid, Settings settings) {
        super(settings);
        this.amulet = amulet;
        this.fluid = fluid ;
    }

    public static Boolean customCraft (PlayerEntity player){return player.isSneaking() && player.hasStatusEffect(CustomEffects.SORCERER);}

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(entity instanceof PlayerEntity player){
            ItemStack offhand = player.getStackInHand(Hand.OFF_HAND);
            ItemStack mainhand = player.getStackInHand(Hand.MAIN_HAND);
            if(mainhand.isOf(MagicItems.AMULET) && offhand.isOf(this) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(amulet.getDefaultStack());
            }
            if(mainhand.isOf(this) && offhand.isOf(MagicItems.AMULET) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(amulet.getDefaultStack());
            }
            if(mainhand.isOf(Items.WATER_BUCKET) && offhand.isOf(this) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(fluid.getDefaultStack());
            }
            if(mainhand.isOf(this) && offhand.isOf(Items.WATER_BUCKET) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(fluid.getDefaultStack());
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}