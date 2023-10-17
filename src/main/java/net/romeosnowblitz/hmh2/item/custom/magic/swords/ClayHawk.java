package net.romeosnowblitz.hmh2.item.custom.magic.swords;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.item.WarfareItems;

public class ClayHawk extends SwordItem {

    public ClayHawk(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if(attacker.getMainHandStack().isOf(this) && stack.getDamage()==this.getMaxDamage()-2){
            attacker.setStackInHand(attacker.getActiveHand(), WarfareItems.HAWKBRAND.getDefaultStack());
        }
        return super.postHit(stack, target, attacker);
    }
}
