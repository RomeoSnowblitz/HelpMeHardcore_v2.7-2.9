/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1282
 *  net.minecraft.class_1293
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1308
 *  net.minecraft.class_1309
 *  net.minecraft.class_1314
 *  net.minecraft.class_1321
 *  net.minecraft.class_1347
 *  net.minecraft.class_1352
 *  net.minecraft.class_1361
 *  net.minecraft.class_1371
 *  net.minecraft.class_1376
 *  net.minecraft.class_1394
 *  net.minecraft.class_1400
 *  net.minecraft.class_1588
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1928
 *  net.minecraft.class_1935
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_270
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3532
 *  net.minecraft.class_4291
 *  net.minecraft.class_5132$class_5133
 *  net.minecraft.class_5134
 *  software.bernie.geckolib.animatable.GeoEntity
 *  software.bernie.geckolib.core.animatable.GeoAnimatable
 *  software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache
 *  software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache
 *  software.bernie.geckolib.core.animation.AnimatableManager$ControllerRegistrar
 *  software.bernie.geckolib.core.animation.Animation$LoopType
 *  software.bernie.geckolib.core.animation.AnimationController
 *  software.bernie.geckolib.core.animation.AnimationState
 *  software.bernie.geckolib.core.animation.RawAnimation
 *  software.bernie.geckolib.core.object.PlayState
 */
package net.romeosnowblitz.hmh2.entity.mob;

import net.minecraft.class_1282;
import net.minecraft.class_1293;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1314;
import net.minecraft.class_1321;
import net.minecraft.class_1347;
import net.minecraft.class_1352;
import net.minecraft.class_1361;
import net.minecraft.class_1371;
import net.minecraft.class_1376;
import net.minecraft.class_1394;
import net.minecraft.class_1400;
import net.minecraft.class_1588;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1928;
import net.minecraft.class_1935;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_270;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3532;
import net.minecraft.class_4291;
import net.minecraft.class_5132;
import net.minecraft.class_5134;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.Animation;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;

public class ShadowCreatureEntity
extends class_1588
implements GeoEntity {
    private final AnimatableInstanceCache factory = new SingletonAnimatableInstanceCache((GeoAnimatable)this);

    public ShadowCreatureEntity(class_1299<? extends class_1588> entityType, class_1937 world) {
        super(entityType, world);
    }

    public static class_5132.class_5133 setAttributes() {
        return class_1321.method_26828().method_26868(class_5134.field_23716, 1.0).method_26868(class_5134.field_23721, 1.0).method_26868(class_5134.field_23723, 1.0).method_26868(class_5134.field_23719, (double)0.1f).method_26868(class_5134.field_23717, 1024.0);
    }

    protected void method_5959() {
        this.field_6201.method_6277(0, (class_1352)new class_1347((class_1308)this));
        this.field_6201.method_6277(2, (class_1352)new class_4291((class_1314)this, 0.75, false));
        this.field_6201.method_6277(3, (class_1352)new class_1394((class_1314)this, 0.75, 1.0f));
        this.field_6201.method_6277(4, (class_1352)new class_1376((class_1308)this));
        this.field_6201.method_6277(5, (class_1352)new class_1361((class_1308)this, class_1657.class, 8.0f));
        this.field_6201.method_6277(1, (class_1352)new class_1371((class_1308)this));
        this.field_6185.method_6277(1, (class_1352)new class_1400((class_1308)this, class_1657.class, true).method_6330(300));
    }

    private PlayState predicate(AnimationState animationState) {
        if (animationState.isMoving()) {
            animationState.getController().setAnimation(RawAnimation.begin().then("animation.shadow_creature.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
        animationState.getController().setAnimation(RawAnimation.begin().then("animation.shadow_creature.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    public static class_1799 getXRay() {
        class_1799 itemStack = new class_1799((class_1935)ModBlocks.XRAY);
        return itemStack;
    }

    public boolean method_6121(class_1297 target) {
        if (!super.method_6121(target)) {
            return false;
        }
        class_1309 livingEntity = this.method_5968();
        class_1293 statusEffectInstance = livingEntity.method_6112(CustomEffects.HEALTH_SHRINKAGE);
        if (target instanceof class_1309) {
            int i = 1;
            if (statusEffectInstance != null) {
                i += statusEffectInstance.method_5578();
                livingEntity.method_6111(CustomEffects.HEALTH_SHRINKAGE);
            } else {
                --i;
            }
            i = class_3532.method_15340((int)i, (int)0, (int)20);
            class_1293 statusEffectInstance2 = new class_1293(CustomEffects.HEALTH_SHRINKAGE, -1, i, false, false, true);
            if (!this.field_6002.method_8450().method_8355(class_1928.field_19422)) {
                livingEntity.method_6092(statusEffectInstance2);
            }
        }
        return true;
    }

    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController[]{new AnimationController((GeoAnimatable)this, "controller", 0, this::predicate)});
    }

    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.factory;
    }

    protected class_3414 method_5994() {
        return class_3417.field_14685;
    }

    protected class_3414 method_6011(class_1282 source) {
        return class_3417.field_23060;
    }

    protected class_3414 method_6002() {
        return class_3417.field_14898;
    }

    protected void method_5712(class_2338 pos, class_2680 state) {
        this.method_5783(class_3417.field_14561, 0.5f, 1.0f);
    }

    public class_270 method_5781() {
        return super.method_5781();
    }

    public boolean method_5931(class_1657 player) {
        return false;
    }
}

