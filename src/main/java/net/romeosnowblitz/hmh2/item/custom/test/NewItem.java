package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.util.ModStats;

public class NewItem extends Item {
    public NewItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(user instanceof ServerPlayerEntity player){
            if(player.isSneaking()){
                player.getStatHandler().increaseStat(player, Stats.CUSTOM.getOrCreateStat(ModStats.HEALTH_ADJUSTMENT), -2);}
            user.giveItemStack(Items.NETHERITE_INGOT.getDefaultStack());
            //player.getStatHandler().increaseStat(player, Stats.CUSTOM.getOrCreateStat(ModStats.HEALTH_ADJUSTMENT), 1);
        }
        return super.use(world, user, hand);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(entity instanceof LivingEntity livingEntity && livingEntity.isHolding(Items.DIAMOND)){
            LivingEntity target = entity.getWorld().getClosestEntity(LivingEntity.class,
                    TargetPredicate.createAttackable(), (LivingEntity) entity,
                    entity.getX(), entity.getY(), entity.getZ(), new Box(entity.getPos().add(3, 3, 3), entity.getPos().add(-3, -3, -3)));
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
