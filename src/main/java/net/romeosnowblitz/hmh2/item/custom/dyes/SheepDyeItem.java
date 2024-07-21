package net.romeosnowblitz.hmh2.item.custom.dyes;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;

public class SheepDyeItem extends Item {

    public static DyeColor COLOR;

    public SheepDyeItem(DyeColor color, Settings settings) {
        super(settings);
        COLOR = color;
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if(user.getWorld().isClient) {
            if (entity.getType() == EntityType.SHEEP){
                    SheepEntity sheep = (SheepEntity) entity;
                sheep.setColor(COLOR);
                if(!user.isCreative()){
                    user.getInventory().remove(p -> p.isOf(this), 1, user.getInventory());
                }
            }
        }
        return super.useOnEntity(stack, user, entity, hand);
    }
}
