package net.romeosnowblitz.hmh2.item.custom.magic;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;

public class MagicGoodAmulet extends Item {

    protected StatusEffect effect;
    protected int duration;

    public MagicGoodAmulet(StatusEffect effect, int duration, Settings settings) {
        super(settings);
        this.effect = effect;
        this.duration = duration;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient()){
            if(user.hasStatusEffect(CustomEffects.SORCERER)){
                user.addStatusEffect(new StatusEffectInstance(effect, duration,1));
            } else {
                user.addStatusEffect(new StatusEffectInstance(effect, duration,0));
            }
            if(user.getMainHandStack().isOf(this)){user.getMainHandStack().damage(1, user, p -> p.sendToolBreakStatus(hand));}
            if(user.getOffHandStack().isOf(this)){user.getOffHandStack().damage(1, user, p -> p.sendToolBreakStatus(hand));}
        }
        return super.use(world, user, hand);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if(attacker.hasStatusEffect(CustomEffects.SORCERER)){attacker.addStatusEffect(new StatusEffectInstance(effect, duration, 1), attacker);}
        else {attacker.addStatusEffect(new StatusEffectInstance(effect, duration, 0), attacker);}
        if(target.hasStatusEffect(CustomEffects.SORCERER)){attacker.addStatusEffect(new StatusEffectInstance(effect, duration, 1), attacker);}
        else {attacker.addStatusEffect(new StatusEffectInstance(effect, duration, 0), attacker);}
        stack.damage(1, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return super.postHit(stack, target, attacker);
    }
}
