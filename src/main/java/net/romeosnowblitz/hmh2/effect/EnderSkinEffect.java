package net.romeosnowblitz.hmh2.effect;

import net.minecraft.block.FallingBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.awt.event.KeyEvent;

public class EnderSkinEffect extends StatusEffect {
    public EnderSkinEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == CustomEffects.ENDER_SKIN) {
            if (entity.isWet()) {
                entity.damage(entity.getDamageSources().drown(), 1);
            }
        }

        if (this == CustomEffects.ENDER_SKIN && entity.isSneaking()) {
            for(int i = 0; i < 128; ++i) {
                double g = entity.getX() + (entity.getRandom().nextDouble() - 0.5D) * 40.0D;
                double h = MathHelper.clamp(entity.getY() + (double)(entity.getRandom().nextInt(10) - 8), entity.getY(), entity.getY());
                double j = entity.getZ() + (entity.getRandom().nextDouble() - 0.5D) * 40.0D;
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
        if (this == CustomEffects.ENDER_SKIN) {
            //the lower the number the faster it is
            int i = 10 >> amplifier;
            if (i > 0) {
                return duration % i == 0;
            }
            return true;
        }
        return false;
    }

}
