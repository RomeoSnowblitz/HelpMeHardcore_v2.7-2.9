/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.class_1296
 *  net.minecraft.class_1299
 *  net.minecraft.class_1308
 *  net.minecraft.class_1314
 *  net.minecraft.class_1321
 *  net.minecraft.class_1341
 *  net.minecraft.class_1347
 *  net.minecraft.class_1352
 *  net.minecraft.class_1361
 *  net.minecraft.class_1376
 *  net.minecraft.class_1386
 *  net.minecraft.class_1394
 *  net.minecraft.class_1429
 *  net.minecraft.class_1657
 *  net.minecraft.class_1924
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_270
 *  net.minecraft.class_3218
 *  net.minecraft.class_3417
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

import javax.annotation.Nullable;
import net.minecraft.class_1296;
import net.minecraft.class_1299;
import net.minecraft.class_1308;
import net.minecraft.class_1314;
import net.minecraft.class_1321;
import net.minecraft.class_1341;
import net.minecraft.class_1347;
import net.minecraft.class_1352;
import net.minecraft.class_1361;
import net.minecraft.class_1376;
import net.minecraft.class_1386;
import net.minecraft.class_1394;
import net.minecraft.class_1429;
import net.minecraft.class_1657;
import net.minecraft.class_1924;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_270;
import net.minecraft.class_3218;
import net.minecraft.class_3417;
import net.minecraft.class_4291;
import net.minecraft.class_5132;
import net.minecraft.class_5134;
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

public class CalEntity
extends class_1321
implements GeoEntity {
    private AnimatableInstanceCache factory = new SingletonAnimatableInstanceCache((GeoAnimatable)this);

    public CalEntity(class_1299<? extends class_1321> entityType, class_1937 world) {
        super(entityType, world);
    }

    @Nullable
    public class_1296 method_5613(class_3218 world, class_1296 entity) {
        return null;
    }

    public static class_5132.class_5133 setAttributes() {
        return class_1321.method_26828().method_26868(class_5134.field_23716, 20.0).method_26868(class_5134.field_23721, 8.0).method_26868(class_5134.field_23723, 2.0).method_26868(class_5134.field_23719, (double)0.3f);
    }

    protected void method_5959() {
        this.field_6201.method_6277(0, (class_1352)new class_1347((class_1308)this));
        this.field_6201.method_6277(1, (class_1352)new class_1386((class_1321)this));
        this.field_6201.method_6277(2, (class_1352)new class_4291((class_1314)this, 0.75, false));
        this.field_6201.method_6277(3, (class_1352)new class_1394((class_1314)this, 0.75, 1.0f));
        this.field_6201.method_6277(4, (class_1352)new class_1376((class_1308)this));
        this.field_6201.method_6277(5, (class_1352)new class_1361((class_1308)this, class_1657.class, 8.0f));
        this.field_6185.method_6277(1, (class_1352)new class_1341((class_1429)this, 1.0));
    }

    private PlayState predicate(AnimationState animationState) {
        if (animationState.isMoving()) {
            animationState.getController().setAnimation(RawAnimation.begin().then("animation.cal.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
        animationState.getController().setAnimation(RawAnimation.begin().then("animation.cal.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController[]{new AnimationController((GeoAnimatable)this, "controller", 0, this::predicate)});
    }

    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.factory;
    }

    protected void method_5712(class_2338 pos, class_2680 state) {
        this.method_5783(class_3417.field_14772, 0.15f, 1.0f);
    }

    public class_270 method_5781() {
        return super.method_5781();
    }

    public boolean method_5931(class_1657 player) {
        return true;
    }

    protected void method_5693() {
        super.method_5693();
    }

    public class_1924 method_48926() {
        return null;
    }
}

