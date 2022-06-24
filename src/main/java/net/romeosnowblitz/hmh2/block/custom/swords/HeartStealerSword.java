package net.romeosnowblitz.hmh2.block.custom.swords;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class HeartStealerSword extends SwordItem {
    public HeartStealerSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20, 0));
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 2));
        return super.postHit(stack, target, attacker);
    }

}
