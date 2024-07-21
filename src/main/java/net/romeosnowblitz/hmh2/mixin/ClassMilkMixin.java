package net.romeosnowblitz.hmh2.mixin;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MilkBucketItem.class)
public class ClassMilkMixin extends Item {
    public ClassMilkMixin(Settings settings) {super(settings);}

    @Inject(method = "finishUsing", at = @At("HEAD"), cancellable = true)
    public void finishUsing(ItemStack stack, World world, LivingEntity user, CallbackInfoReturnable<ItemStack> cir) {

        if (user instanceof ServerPlayerEntity serverPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }
        if (user instanceof PlayerEntity && !((PlayerEntity)user).getAbilities().creativeMode) {
            stack.decrement(1);
        }
        if (!world.isClient) {
            if(user.hasStatusEffect(StatusEffects.ABSORPTION)) {user.removeStatusEffect(StatusEffects.ABSORPTION);}
            if(user.hasStatusEffect(StatusEffects.BAD_OMEN)) {user.removeStatusEffect(StatusEffects.BAD_OMEN);}
            if(user.hasStatusEffect(StatusEffects.BLINDNESS)) {user.removeStatusEffect(StatusEffects.BLINDNESS);}
            if(user.hasStatusEffect(StatusEffects.CONDUIT_POWER)) {user.removeStatusEffect(StatusEffects.CONDUIT_POWER);}
            if(user.hasStatusEffect(StatusEffects.DARKNESS)) {user.removeStatusEffect(StatusEffects.DARKNESS);}
            if(user.hasStatusEffect(StatusEffects.DOLPHINS_GRACE)) {user.removeStatusEffect(StatusEffects.DOLPHINS_GRACE);}
            if(user.hasStatusEffect(StatusEffects.FIRE_RESISTANCE)) {user.removeStatusEffect(StatusEffects.FIRE_RESISTANCE);}
            if(user.hasStatusEffect(StatusEffects.GLOWING)) {user.removeStatusEffect(StatusEffects.GLOWING);}
            if(user.hasStatusEffect(StatusEffects.HASTE)) {user.removeStatusEffect(StatusEffects.HASTE);}
            if(user.hasStatusEffect(StatusEffects.HEALTH_BOOST)) {user.removeStatusEffect(StatusEffects.HEALTH_BOOST);}
            if(user.hasStatusEffect(StatusEffects.HUNGER)) {user.removeStatusEffect(StatusEffects.HUNGER);}
            if(user.hasStatusEffect(StatusEffects.INSTANT_DAMAGE)) {user.removeStatusEffect(StatusEffects.INSTANT_DAMAGE);}
            if(user.hasStatusEffect(StatusEffects.INSTANT_HEALTH)) {user.removeStatusEffect(StatusEffects.INSTANT_HEALTH);}
            if(user.hasStatusEffect(StatusEffects.INVISIBILITY)) {user.removeStatusEffect(StatusEffects.INVISIBILITY);}
            if(user.hasStatusEffect(StatusEffects.JUMP_BOOST)) {user.removeStatusEffect(StatusEffects.JUMP_BOOST);}
            if(user.hasStatusEffect(StatusEffects.LEVITATION)) {user.removeStatusEffect(StatusEffects.LEVITATION);}
            if(user.hasStatusEffect(StatusEffects.LUCK)) {user.removeStatusEffect(StatusEffects.LUCK);}
            if(user.hasStatusEffect(StatusEffects.MINING_FATIGUE)) {user.removeStatusEffect(StatusEffects.MINING_FATIGUE);}
            if(user.hasStatusEffect(StatusEffects.NAUSEA)) {user.removeStatusEffect(StatusEffects.NAUSEA);}
            if(user.hasStatusEffect(StatusEffects.NIGHT_VISION)) {user.removeStatusEffect(StatusEffects.NIGHT_VISION);}
            if(user.hasStatusEffect(StatusEffects.POISON)) {user.removeStatusEffect(StatusEffects.POISON);}
            if(user.hasStatusEffect(StatusEffects.REGENERATION)) {user.removeStatusEffect(StatusEffects.REGENERATION);}
            if(user.hasStatusEffect(StatusEffects.RESISTANCE)) {user.removeStatusEffect(StatusEffects.RESISTANCE);}
            if(user.hasStatusEffect(StatusEffects.SATURATION)) {user.removeStatusEffect(StatusEffects.SATURATION);}
            if(user.hasStatusEffect(StatusEffects.SLOW_FALLING)) {user.removeStatusEffect(StatusEffects.SLOW_FALLING);}
            if(user.hasStatusEffect(StatusEffects.SLOWNESS)) {user.removeStatusEffect(StatusEffects.SLOWNESS);}
            if(user.hasStatusEffect(StatusEffects.SPEED)) {user.removeStatusEffect(StatusEffects.SPEED);}
            if(user.hasStatusEffect(StatusEffects.STRENGTH)) {user.removeStatusEffect(StatusEffects.STRENGTH);}
            if(user.hasStatusEffect(StatusEffects.HERO_OF_THE_VILLAGE)) {user.removeStatusEffect(StatusEffects.HERO_OF_THE_VILLAGE);}
            if(user.hasStatusEffect(StatusEffects.WATER_BREATHING)) {user.removeStatusEffect(StatusEffects.WATER_BREATHING);}
            if(user.hasStatusEffect(StatusEffects.WEAKNESS)) {user.removeStatusEffect(StatusEffects.WEAKNESS);}
            if(user.hasStatusEffect(StatusEffects.WITHER)) {user.removeStatusEffect(StatusEffects.WITHER);}
        }
        cir.setReturnValue(stack.isEmpty() ? new ItemStack(Items.BUCKET) : stack);
    }



}
