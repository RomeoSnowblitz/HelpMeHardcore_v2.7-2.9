package net.romeosnowblitz.hmh2.crafting;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.block.MagicBlocks;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.item.MagicItems;
import net.romeosnowblitz.hmh2.item.ModItems;

public class MinecraftAmulets extends Item {


    public MinecraftAmulets(Settings settings) {
        super(settings);
    }

    public static Boolean customCraft (PlayerEntity player){
        if(player.isSneaking() && player.hasStatusEffect(CustomEffects.SORCERER)){
            ItemStack offhand = player.getStackInHand(Hand.OFF_HAND); ItemStack mainhand = player.getStackInHand(Hand.MAIN_HAND);
            mainhand.decrement(1);offhand.decrement(1);
            return true;
        } else

        return false;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {

        if(entity instanceof PlayerEntity player){
            ItemStack offhand = player.getStackInHand(Hand.OFF_HAND); ItemStack mainhand = player.getStackInHand(Hand.MAIN_HAND);
            if(mainhand.isOf(this) && offhand.isOf(Items.AMETHYST_SHARD) && customCraft(player)){player.giveItemStack(MagicItems.NAUSEA_AMULET.getDefaultStack());}
            if(mainhand.isOf(Items.AMETHYST_SHARD) && offhand.isOf(this) && customCraft(player)){player.giveItemStack(MagicItems.NAUSEA_AMULET.getDefaultStack());}
            if(mainhand.isOf(this) && offhand.isOf(Items.COAL) && customCraft(player)){player.giveItemStack(MagicItems.DARKNESS_AMULET.getDefaultStack());}
            if(mainhand.isOf(Items.COAL) && offhand.isOf(this) && customCraft(player)){player.giveItemStack(MagicItems.DARKNESS_AMULET.getDefaultStack());}
            if(mainhand.isOf(this) && offhand.isOf(Items.CHARCOAL) && customCraft(player)){player.giveItemStack(MagicItems.WEAKNESS_AMULET.getDefaultStack());}
            if(mainhand.isOf(Items.CHARCOAL) && offhand.isOf(this) && customCraft(player)){player.giveItemStack(MagicItems.WEAKNESS_AMULET.getDefaultStack());}
            if(mainhand.isOf(this) && offhand.isOf(Items.IRON_INGOT) && customCraft(player)){player.giveItemStack(MagicItems.INVISIBILITY_AMULET.getDefaultStack());}
            if(mainhand.isOf(Items.IRON_INGOT) && offhand.isOf(this) && customCraft(player)){player.giveItemStack(MagicItems.INVISIBILITY_AMULET.getDefaultStack());}
            if(mainhand.isOf(this) && offhand.isOf(Items.COPPER_INGOT) && customCraft(player)){player.giveItemStack(MagicItems.LEVITATION_AMULET.getDefaultStack());}
            if(mainhand.isOf(Items.COPPER_INGOT) && offhand.isOf(this) && customCraft(player)){player.giveItemStack(MagicItems.LEVITATION_AMULET.getDefaultStack());}
            if(mainhand.isOf(this) && offhand.isOf(Items.GOLD_INGOT) && customCraft(player)){player.giveItemStack(MagicItems.HASTE_AMULET.getDefaultStack());}
            if(mainhand.isOf(Items.GOLD_INGOT) && offhand.isOf(this) && customCraft(player)){player.giveItemStack(MagicItems.HASTE_AMULET.getDefaultStack());}
            if(mainhand.isOf(this) && offhand.isOf(Items.EMERALD) && customCraft(player)){player.giveItemStack(MagicItems.VILLAGE_HERO_AMULET.getDefaultStack());}
            if(mainhand.isOf(Items.EMERALD) && offhand.isOf(this) && customCraft(player)){player.giveItemStack(MagicItems.VILLAGE_HERO_AMULET.getDefaultStack());}
            if(mainhand.isOf(this) && offhand.isOf(Items.LAPIS_LAZULI) && customCraft(player)){player.giveItemStack(MagicItems.ABSORPTION_AMULET.getDefaultStack());}
            if(mainhand.isOf(Items.LAPIS_LAZULI) && offhand.isOf(this) && customCraft(player)){player.giveItemStack(MagicItems.ABSORPTION_AMULET.getDefaultStack());}
            if(mainhand.isOf(this) && offhand.isOf(Items.DIAMOND) && customCraft(player)){player.giveItemStack(MagicItems.SPEED_AMULET.getDefaultStack());}
            if(mainhand.isOf(Items.DIAMOND) && offhand.isOf(this) && customCraft(player)){player.giveItemStack(MagicItems.SPEED_AMULET.getDefaultStack());}
            if(mainhand.isOf(this) && offhand.isOf(Items.FLINT) && customCraft(player)){player.giveItemStack(MagicItems.BLINDNESS_AMULET.getDefaultStack());}
            if(mainhand.isOf(Items.FLINT) && offhand.isOf(this) && customCraft(player)){player.giveItemStack(MagicItems.BLINDNESS_AMULET.getDefaultStack());}
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }




}
