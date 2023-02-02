package net.romeosnowblitz.hmh2.item.custom.swords;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.item.WarfareItems;

public class HawkHeart  extends SwordItem {
    private final int damagePerUse;

    public HawkHeart(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings, int damagePerUse) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.damagePerUse = damagePerUse;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        {
            itemStack.damage(this.damagePerUse, user, p -> p.sendToolBreakStatus(hand));
            if (itemStack.isEmpty()) {
                ItemStack itemStack2 = new ItemStack(WarfareItems.HEARTSTEALER);
                itemStack2.setNbt(itemStack.getNbt());
                return TypedActionResult.success(itemStack2);
            }
            return TypedActionResult.success(itemStack);
        }
    }
}
