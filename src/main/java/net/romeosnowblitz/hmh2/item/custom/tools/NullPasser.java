package net.romeosnowblitz.hmh2.item.custom.tools;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.util.ModStats;

import java.awt.event.KeyEvent;

public class NullPasser extends Item {
    public NullPasser(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
            if (!user.getWorld().isClient()) {
                if(user instanceof ServerPlayerEntity player){
                    if(player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_Y)) == 0 || user.isSneaking()) {
                        player.teleport(0, player.getBlockPos().getY(), 0);
                    } else {
                        int x = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_X));
                        int y = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_Y));
                        int z = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_Z));
                        player.teleport(x, y, z);
                    }
                }
                itemStack.damage(1, user, (p) -> {p.sendToolBreakStatus(hand);});
            }
        return super.use(world, user, hand);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient()) {
            if(attacker instanceof ServerPlayerEntity player){
                if(player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_Y)) ==0 || attacker.isSneaking() ){
                    target.teleport(0, target.getBlockPos().getY(), 0);
                } else {
                    int x = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_X));
                    int y = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_Y));
                    int z = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_Z));
                    target.teleport(x, y, z);
                }
            }
            stack.damage(1, attacker, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }
        return super.postHit(stack, target, attacker);
    }

}
