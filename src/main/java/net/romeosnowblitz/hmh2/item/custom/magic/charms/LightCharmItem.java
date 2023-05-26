package net.romeosnowblitz.hmh2.item.custom.magic.charms;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class LightCharmItem extends Item {
    public LightCharmItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND){
            user.removeStatusEffect(StatusEffects.MINING_FATIGUE);
            user.removeStatusEffect(StatusEffects.SLOWNESS);
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK,1200,2));
            user.getMainHandStack().damage(5, user, p -> p.sendToolBreakStatus(hand));
        }
        return super.use(world, user, hand);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        attacker.removeStatusEffect(StatusEffects.MINING_FATIGUE);
        attacker.removeStatusEffect(StatusEffects.SLOWNESS);
        target.removeStatusEffect(StatusEffects.MINING_FATIGUE);
        target.removeStatusEffect(StatusEffects.SLOWNESS);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 2));
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 2));
        stack.damage(10, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return super.postHit(stack, target, attacker);
    }
}
