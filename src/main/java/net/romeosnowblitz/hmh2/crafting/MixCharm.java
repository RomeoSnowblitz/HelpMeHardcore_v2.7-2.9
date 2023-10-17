package net.romeosnowblitz.hmh2.crafting;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
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

public class MixCharm extends Item {
    public MixCharm(Settings settings) {
        super(settings);
    }

    public static Boolean customCraft (PlayerEntity player){return player.isSneaking() && player.hasStatusEffect(CustomEffects.NORMIE);}
    public static void giveKnight(PlayerEntity player){ItemStack offhand = player.getStackInHand(Hand.OFF_HAND);ItemStack mainhand = player.getStackInHand(Hand.MAIN_HAND);
        mainhand.setCount(mainhand.getCount()-1);offhand.setCount(offhand.getCount()-1);player.giveItemStack(MagicItems.KNIGHT_CHARM.getDefaultStack());
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(entity instanceof PlayerEntity player){
            ItemStack offhand = player.getStackInHand(Hand.OFF_HAND);ItemStack mainhand = player.getStackInHand(Hand.MAIN_HAND);
            if(mainhand.isOf(MagicItems.ALIGHT_CHARM) && offhand.isOf(MagicItems.BLIGHT_CHARM) && customCraft(player)){giveKnight(player);}
            if(offhand.isOf(MagicItems.ALIGHT_CHARM) && mainhand.isOf(MagicItems.BLIGHT_CHARM) && customCraft(player)){giveKnight(player);}
            if(mainhand.isOf(MagicItems.BRIGHT_CHARM) && offhand.isOf(MagicItems.SLIGHT_CHARM) && customCraft(player)){giveKnight(player);}
            if(offhand.isOf(MagicItems.BRIGHT_CHARM) && mainhand.isOf(MagicItems.SLIGHT_CHARM) && customCraft(player)){giveKnight(player);}
            if(mainhand.isOf(MagicItems.FLIGHT_CHARM) && offhand.isOf(MagicItems.FRIGHT_CHARM) && customCraft(player)){giveKnight(player);}
            if(offhand.isOf(MagicItems.FLIGHT_CHARM) && mainhand.isOf(MagicItems.FRIGHT_CHARM) && customCraft(player)){giveKnight(player);}
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    public static void removeMiningSlowness(LivingEntity user){user.removeStatusEffect(StatusEffects.MINING_FATIGUE);user.removeStatusEffect(StatusEffects.SLOWNESS);}
    public static void removeBlindDark(LivingEntity user){user.removeStatusEffect(StatusEffects.BLINDNESS);user.removeStatusEffect(StatusEffects.DARKNESS);}
    public static void removeHungerNausea(LivingEntity user){user.removeStatusEffect(StatusEffects.HUNGER);user.removeStatusEffect(StatusEffects.NAUSEA);}
    public static void removePoisonWither(LivingEntity user){user.removeStatusEffect(StatusEffects.POISON);user.removeStatusEffect(StatusEffects.WITHER);}
    public static void weakLuckBonus(LivingEntity user){user.removeStatusEffect(StatusEffects.WEAKNESS);
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK,1200,4));
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack offhand = user.getStackInHand(Hand.OFF_HAND);ItemStack mainhand = user.getStackInHand(Hand.MAIN_HAND);
        if(offhand.isOf(MagicItems.ALIGHT_CHARM) || mainhand.isOf(MagicItems.ALIGHT_CHARM)){removeMiningSlowness(user);removeBlindDark(user);weakLuckBonus(user);}
        if(offhand.isOf(MagicItems.BLIGHT_CHARM) || mainhand.isOf(MagicItems.BLIGHT_CHARM)){removeHungerNausea(user);removePoisonWither(user);weakLuckBonus(user);}
        if(offhand.isOf(MagicItems.BRIGHT_CHARM) || mainhand.isOf(MagicItems.BRIGHT_CHARM)){removeHungerNausea(user);removeBlindDark(user);weakLuckBonus(user);}
        if(offhand.isOf(MagicItems.FLIGHT_CHARM) || mainhand.isOf(MagicItems.FLIGHT_CHARM)){removeMiningSlowness(user);removeHungerNausea(user);weakLuckBonus(user);}
        if(offhand.isOf(MagicItems.FRIGHT_CHARM) || mainhand.isOf(MagicItems.FRIGHT_CHARM)){removePoisonWither(user);removeBlindDark(user);weakLuckBonus(user);}
        if(offhand.isOf(MagicItems.SLIGHT_CHARM) || mainhand.isOf(MagicItems.SLIGHT_CHARM)){removePoisonWither(user);removeMiningSlowness(user);weakLuckBonus(user);}
        return super.use(world, user, hand);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ItemStack hand = attacker.getStackInHand(Hand.MAIN_HAND);
        if(hand.isOf(MagicItems.ALIGHT_CHARM)) {removeMiningSlowness(attacker);removeMiningSlowness(target);removeBlindDark(attacker);removeBlindDark(target);weakLuckBonus(attacker);weakLuckBonus(target);}
        if(hand.isOf(MagicItems.BLIGHT_CHARM)) {removeHungerNausea(attacker);removeHungerNausea(target);removePoisonWither(attacker);removePoisonWither(target);weakLuckBonus(attacker);weakLuckBonus(target);}
        if(hand.isOf(MagicItems.BRIGHT_CHARM)) {removeHungerNausea(attacker);removeHungerNausea(target);removeBlindDark(attacker);removeBlindDark(target);weakLuckBonus(attacker);weakLuckBonus(target);}
        if(hand.isOf(MagicItems.FLIGHT_CHARM)) {removeMiningSlowness(attacker);removeMiningSlowness(target);removeHungerNausea(attacker);removeHungerNausea(target);weakLuckBonus(attacker);weakLuckBonus(target);}
        if(hand.isOf(MagicItems.FRIGHT_CHARM)) {removePoisonWither(attacker);removePoisonWither(target);removeBlindDark(attacker);removeBlindDark(target);weakLuckBonus(attacker);weakLuckBonus(target);}
        if(hand.isOf(MagicItems.SLIGHT_CHARM)) {removePoisonWither(attacker);removePoisonWither(target);removeMiningSlowness(attacker);removeMiningSlowness(target);weakLuckBonus(attacker);weakLuckBonus(target);}
        return super.postHit(stack, target, attacker);
    }
}
