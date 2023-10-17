package net.romeosnowblitz.hmh2.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.Vec3d;

public class SpiderEffect extends StatusEffect {
    protected SpiderEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        int x = amplifier+1;
        if (entity.horizontalCollision) {
            Vec3d velocity = new Vec3d(entity.getVelocity().x, 0.1, entity.getVelocity().z);
            entity.setVelocity(velocity.x, velocity.y*x, velocity.z);
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
