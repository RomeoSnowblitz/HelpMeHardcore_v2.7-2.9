package net.romeosnowblitz.hmh2.item.custom.tools;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.entity.cal.CalEntity;

import java.util.Random;

public class Umbrella extends Item {
    public Umbrella(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        Random random = new Random();
        int i = random.nextInt(1200 + 1);
        int i2 = random.nextInt(60000 + 1);
        if(entity instanceof PlayerEntity player){
            if (player.getStackInHand(Hand.MAIN_HAND).isOf(this) || player.getStackInHand(Hand.OFF_HAND).isOf(this) ){
                if(player.fallDistance >= 3){
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 40));
                    if(player.getMainHandStack().isOf(this)){player.getMainHandStack().damage(1, player, (p) -> {p.sendToolBreakStatus(Hand.MAIN_HAND);});}
                    if(player.getOffHandStack().isOf(this)){player.getOffHandStack().damage(1, player, (p) -> {p.sendToolBreakStatus(Hand.OFF_HAND);});}
                }
                if (i==1 && world.isRaining()){
                    LightningEntity lightning = EntityType.LIGHTNING_BOLT.create(world);
                    lightning.refreshPositionAndAngles(entity.getX() + 0.5, entity.getY(), entity.getZ() + 0.5, 0.0f, 0.0f);
                    world.spawnEntity(lightning);
                }
                if (i2==1){
                    LightningEntity lightning = EntityType.LIGHTNING_BOLT.create(world);
                    lightning.refreshPositionAndAngles(entity.getX() + 0.5, entity.getY(), entity.getZ() + 0.5, 0.0f, 0.0f);
                    world.spawnEntity(lightning);
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
