package net.romeosnowblitz.hmh2.item.custom.magic.swords;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.item.WarfareItems;

public class HawkHeart  extends SwordItem {

    public HawkHeart(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if(attacker.getMainHandStack().isOf(this) && stack.getDamage()==this.getMaxDamage()-2){
            attacker.setStackInHand(attacker.getActiveHand(), WarfareItems.HEARTSTEALER.getDefaultStack());
        }
        return super.postHit(stack, target, attacker);
    }
}
