package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.romeosnowblitz.hmh2.item.ModItems;

public class EnderSkinEffect
        extends StatusEffect {
    public EnderSkinEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.isInsideWaterOrBubbleColumn() || entity.isWet() && !entity.getStackInHand(Hand.MAIN_HAND).isOf(ModItems.UMBRELLA) ) {
            entity.damage(entity.getDamageSources().drown(), 1.0f);
        }
        if (this == CustomEffects.ENDER_SKIN && entity.isSneaking()) {
            for(int i = 0; i < 16; ++i) {
                double g = entity.getX() + (entity.getRandom().nextDouble() - 0.5D) * 16.0D;
                double h = MathHelper.clamp(entity.getY() + (double)(entity.getRandom().nextInt(16) - 8), entity.getY(), entity.getY());
                double j = entity.getZ() + (entity.getRandom().nextDouble() - 0.5D) * 16.0D;
                if (entity.hasVehicle()) {
                    entity.stopRiding();
                }
                if (entity.teleport(g, h, j, true)) {
                    SoundEvent soundEvent = entity instanceof FoxEntity ? SoundEvents.ENTITY_FOX_TELEPORT : SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT;
                    entity.playSound(soundEvent, 1.0F, 1.0F);
                    break;
                }
            }
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        if (10 >> amplifier > 0) {return duration % 10 >> amplifier == 0;}
        return true;
    }
}
