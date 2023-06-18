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

public class MagicAmulet extends Item {

    protected StatusEffect effect;
    protected int duration;

    public MagicAmulet(StatusEffect effect, int duration, Settings settings) {
        super(settings);
        this.effect = effect;
        this.duration = duration;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND){
            user.addStatusEffect(new StatusEffectInstance(effect, duration,2));
            user.getMainHandStack().damage(1, user, p -> p.sendToolBreakStatus(hand));
        }
        return super.use(world, user, hand);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        attacker.addStatusEffect(new StatusEffectInstance(effect, duration, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(effect, duration, 0), target);
        stack.damage(1, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return super.postHit(stack, target, attacker);
    }
}
