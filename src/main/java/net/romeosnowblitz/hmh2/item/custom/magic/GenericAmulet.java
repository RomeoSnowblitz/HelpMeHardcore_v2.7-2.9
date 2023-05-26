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


public class GenericAmulet extends Item {
    private final StatusEffect potion;
    private final boolean hasDurability;
    private final boolean isBad;
    public GenericAmulet(Settings s, StatusEffect p, boolean h) {

        super(s);
        potion=p;
        hasDurability = h;
        isBad = false;
    }

    public GenericAmulet(Settings settings, StatusEffect pot, boolean hd,boolean ib) {

        super(settings);
        potion=pot;
        hasDurability = hd;
        isBad = ib;

    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.addStatusEffect(new StatusEffectInstance(potion,200,2));
        if (hasDurability) {
            if(!world.isClient() && hand == Hand.MAIN_HAND){
                user.getMainHandStack().damage(1, user, p -> p.sendToolBreakStatus(hand));
            } else {
                user.getOffHandStack().damage(1,user,p->p.sendToolBreakStatus(hand));
            }
        }
        return super.use(world, user, hand);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (isBad) {
            attacker.addStatusEffect(new StatusEffectInstance(potion, 200, 0), attacker);
            target.addStatusEffect(new StatusEffectInstance(potion, 200, 1), target);
        } else {
            attacker.addStatusEffect(new StatusEffectInstance(potion, 200, 1), attacker);
            target.addStatusEffect(new StatusEffectInstance(potion, 200, 0), target);
        }
        if (hasDurability) {
            stack.damage(1, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }
        return super.postHit(stack, target, attacker);
    }
}
