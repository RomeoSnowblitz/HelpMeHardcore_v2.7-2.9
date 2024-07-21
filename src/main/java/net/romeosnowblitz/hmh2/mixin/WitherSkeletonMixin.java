package net.romeosnowblitz.hmh2.mixin;

import net.minecraft.entity.*;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.entity.ModDamageTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WitherSkeletonEntity.class)
public class WitherSkeletonMixin{

    @Inject(method = "tryAttack", at = @At("HEAD"))
    public void tryAttack(Entity target, CallbackInfoReturnable<Boolean> cir) {
        if(target instanceof SkeletonEntity skeleton){
            skeleton.convertTo(EntityType.WITHER_SKELETON, true);
        }
        if (target instanceof PlayerEntity player) {
            int i = 1;
            if (player.getStatusEffect(StatusEffects.WITHER) != null) {
                i += player.getStatusEffect(StatusEffects.WITHER).getAmplifier();
                player.removeStatusEffectInternal(StatusEffects.WITHER);
            } else {
                --i;
            }
            i = MathHelper.clamp(i, 0, 20);
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 150, i, false, false, true));
        }
    }

}
