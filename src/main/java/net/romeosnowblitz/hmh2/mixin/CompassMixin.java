package net.romeosnowblitz.hmh2.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.CompassItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Vanishable;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.item.ModItems;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(CompassItem.class)
public class CompassMixin  extends Item implements Vanishable {
    public CompassMixin(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        Entity entity = world.getClosestEntity(LivingEntity.class, TargetPredicate.DEFAULT, user, user.getX(), user.getY(), user.getZ(), new Box(user.getBlockPos()).expand(1));
        ItemStack item = ModItems.BLOOD_COMPASS.getDefaultStack();
        if(entity != null && user.hasStatusEffect(CustomEffects.BLOOD_WITCH)){
            if(entity instanceof PlayerEntity victim){
                item.getOrCreateNbt().putString("type", String.valueOf(victim.getId()));
                user.setStackInHand(hand, item);
            } else {
                item.getOrCreateNbt().putString("type", String.valueOf(entity.getId()));
                user.setStackInHand(hand, item);
            }
        }
        if(user.isSneaking()){
            item.getOrCreateNbt().putString("type", String.valueOf(user.getId()));
            user.setStackInHand(hand, item);
        }
        return super.use(world, user, hand);
    }
}
