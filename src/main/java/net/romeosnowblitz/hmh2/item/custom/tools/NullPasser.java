package net.romeosnowblitz.hmh2.item.custom.tools;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
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
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.tag.ModItemTags;
import net.romeosnowblitz.hmh2.util.ModStats;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class NullPasser extends Item {
    public NullPasser(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        ItemStack itemStack = user.getStackInHand(hand);
            if (!world.isClient() && !user.hasStatusEffect(CustomEffects.QUANTUM_LOCK)) {
                if(user instanceof ServerPlayerEntity player && player.getWorld().getDimension().bedWorks()){
                    if(player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_OVERWORLD_Y)) == 0 || user.isSneaking()) {
                        player.teleport(0.5, player.getBlockPos().getY()+0.5, 0.5);
                    } else {
                        int x = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_OVERWORLD_X));
                        int y = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_OVERWORLD_Y));
                        int z = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_OVERWORLD_Z));
                        player.teleport(x+0.5, y+0.5, z+0.5);
                    }
                }
                if(user instanceof ServerPlayerEntity player && player.getWorld().getDimension().ultrawarm()){
                    if(player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_NETHER_Y)) == 0 || user.isSneaking()) {
                        player.teleport(0.5, player.getBlockPos().getY()+0.5, 0.5);
                    } else {
                        int x = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_NETHER_X));
                        int y = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_NETHER_Y));
                        int z = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_NETHER_Z));
                        player.teleport(x+0.5, y+0.5, z+0.5);
                    }
                }
                if(user instanceof ServerPlayerEntity player && !player.getWorld().getDimension().bedWorks() && !player.getWorld().getDimension().ultrawarm()){
                    if(player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_END_Y)) == 0 || user.isSneaking()) {
                        player.teleport(0.5, player.getBlockPos().getY()+0.5, 0.5);
                    } else {
                        int x = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_END_X));
                        int y = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_END_Y));
                        int z = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_END_Z));
                        player.teleport(x+0.5, y+0.5, z+0.5);
                    }
                }
                itemStack.damage(1, user, (p) -> p.sendToolBreakStatus(hand));
            }
        return super.use(world, user, hand);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient() && !attacker.hasStatusEffect(CustomEffects.QUANTUM_LOCK) || !attacker.getWorld().isClient() && !target.hasStatusEffect(CustomEffects.QUANTUM_LOCK)) {
            if(attacker instanceof ServerPlayerEntity player && player.getWorld().getDimension().bedWorks()){
                if(player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_OVERWORLD_Y)) == 0 || attacker.isSneaking() ){
                    target.teleport(0.5, target.getBlockPos().getY()+0.5, 0.5);
                } else {
                    int x = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_OVERWORLD_X));
                    int y = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_OVERWORLD_Y));
                    int z = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_OVERWORLD_Z));
                    target.teleport(x+0.5, y+0.5, z+0.5);
                }
            }
            if(attacker instanceof ServerPlayerEntity player && player.getWorld().getDimension().ultrawarm()){
                if(player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_NETHER_Y)) == 0 || attacker.isSneaking() ){
                    target.teleport(0.5, target.getBlockPos().getY()+0.5, 0.5);
                } else {
                    int x = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_NETHER_X));
                    int y = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_NETHER_Y));
                    int z = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_NETHER_Z));
                    target.teleport(x+0.5, y+0.5, z+0.5);
                }
            }
            if(attacker instanceof ServerPlayerEntity player && !player.getWorld().getDimension().bedWorks() && !player.getWorld().getDimension().ultrawarm()){
                if(player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_END_Y)) ==0 || attacker.isSneaking() ){
                    target.teleport(0.5, target.getBlockPos().getY()+0.5, 0.5);
                } else {
                    int x = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_END_X));
                    int y = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_END_Y));
                    int z = player.getStatHandler().getStat(Stats.CUSTOM.getOrCreateStat(ModStats.NULL_SAVED_END_Z));
                    target.teleport(x+0.5, y+0.5, z+0.5);
                }
            }
            stack.damage(1, attacker, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }
        return super.postHit(stack, target, attacker);
    }

    public static Boolean customCraft (PlayerEntity player){return player.isSneaking();}

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(entity instanceof PlayerEntity player){
            ItemStack offhand = player.getStackInHand(Hand.OFF_HAND);ItemStack mainhand = player.getStackInHand(Hand.MAIN_HAND);
            if(mainhand.isOf(ModItems.NULL_PASSER) && offhand.isIn(ModItemTags.DCC_TEST) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(ModItems.TRAVELERS_DREAM.getDefaultStack());
            }
            if(offhand.isOf(ModItems.NULL_PASSER) && mainhand.isIn(ModItemTags.DCC_TEST) && customCraft(player)){
                mainhand.decrement(1);offhand.decrement(1);player.giveItemStack(ModItems.TRAVELERS_DREAM.getDefaultStack());
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    /*
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        assert world != null;
        if (world.getDimension().bedWorks()){
            tooltip.remove(2);
            tooltip.remove(3);
            tooltip.add(1, Text.of("Overworld"));
        }
        if (world.getDimension().ultrawarm()){
            tooltip.remove(1);
            tooltip.remove(3);
            tooltip.add(2, Text.of("Nether"));
        }
        if (world.getDimensionEntry() == World.END){
            tooltip.remove(1);
            tooltip.remove(2);
            tooltip.add(3, Text.of("End"));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

     */
}
