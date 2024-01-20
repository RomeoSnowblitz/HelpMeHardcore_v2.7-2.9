package net.romeosnowblitz.hmh2.crafting;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.item.MagicItems;


public class BaseCharmItem extends Item {

    private final StatusEffect effect1;
    private final StatusEffect effect2;

    public BaseCharmItem(StatusEffect effect1, StatusEffect effect2, Settings settings) {
        super(settings);
        this.effect1 = effect1;
        this.effect2 = effect2;
    }

    public static Boolean customCraft (PlayerEntity player){return player.isSneaking() && player.hasStatusEffect(CustomEffects.SORCERER);}

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(entity instanceof PlayerEntity player && !world.isClient()){
            ItemStack offhand = player.getStackInHand(Hand.OFF_HAND);ItemStack mainhand = player.getStackInHand(Hand.MAIN_HAND);
            if(mainhand.isOf(MagicItems.LIGHT_CHARM) && offhand.isOf(MagicItems.SIGHT_CHARM) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(MagicItems.ALIGHT_CHARM.getDefaultStack());}
            if(mainhand.isOf(MagicItems.SIGHT_CHARM) && offhand.isOf(MagicItems.LIGHT_CHARM) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(MagicItems.ALIGHT_CHARM.getDefaultStack());}
            if(mainhand.isOf(MagicItems.MIGHT_CHARM) && offhand.isOf(MagicItems.SIGHT_CHARM) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(MagicItems.BRIGHT_CHARM.getDefaultStack());}
            if(mainhand.isOf(MagicItems.SIGHT_CHARM) && offhand.isOf(MagicItems.MIGHT_CHARM) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(MagicItems.BRIGHT_CHARM.getDefaultStack());}
            if(mainhand.isOf(MagicItems.MIGHT_CHARM) && offhand.isOf(MagicItems.FIGHT_CHARM) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(MagicItems.BLIGHT_CHARM.getDefaultStack());}
            if(mainhand.isOf(MagicItems.FIGHT_CHARM) && offhand.isOf(MagicItems.MIGHT_CHARM) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(MagicItems.BLIGHT_CHARM.getDefaultStack());}
            if(mainhand.isOf(MagicItems.LIGHT_CHARM) && offhand.isOf(MagicItems.MIGHT_CHARM) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(MagicItems.FLIGHT_CHARM.getDefaultStack());}
            if(mainhand.isOf(MagicItems.MIGHT_CHARM) && offhand.isOf(MagicItems.LIGHT_CHARM) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(MagicItems.FLIGHT_CHARM.getDefaultStack());}
            if(mainhand.isOf(MagicItems.FIGHT_CHARM) && offhand.isOf(MagicItems.SIGHT_CHARM) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(MagicItems.FRIGHT_CHARM.getDefaultStack());}
            if(mainhand.isOf(MagicItems.SIGHT_CHARM) && offhand.isOf(MagicItems.FIGHT_CHARM) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(MagicItems.FRIGHT_CHARM.getDefaultStack());}
            if(mainhand.isOf(MagicItems.LIGHT_CHARM) && offhand.isOf(MagicItems.FIGHT_CHARM) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(MagicItems.SLIGHT_CHARM.getDefaultStack());}
            if(mainhand.isOf(MagicItems.FIGHT_CHARM) && offhand.isOf(MagicItems.LIGHT_CHARM) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(MagicItems.SLIGHT_CHARM.getDefaultStack());}
            player.removeStatusEffect(effect1);player.removeStatusEffect(effect2);
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK,1200,2));
        } super.inventoryTick(stack, world, entity, slot, selected);
    }

}
