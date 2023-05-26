/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1282
 *  net.minecraft.class_1296
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1308
 *  net.minecraft.class_1309
 *  net.minecraft.class_1314
 *  net.minecraft.class_1321
 *  net.minecraft.class_1341
 *  net.minecraft.class_1347
 *  net.minecraft.class_1352
 *  net.minecraft.class_1359
 *  net.minecraft.class_1361
 *  net.minecraft.class_1366
 *  net.minecraft.class_1376
 *  net.minecraft.class_1394
 *  net.minecraft.class_1400
 *  net.minecraft.class_1404
 *  net.minecraft.class_1429
 *  net.minecraft.class_1657
 *  net.minecraft.class_1665
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1924
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_2940
 *  net.minecraft.class_2941
 *  net.minecraft.class_2943
 *  net.minecraft.class_2945
 *  net.minecraft.class_3218
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_4291
 *  net.minecraft.class_4802
 *  net.minecraft.class_5132$class_5133
 *  net.minecraft.class_5134
 *  net.minecraft.class_5328
 *  net.minecraft.class_5354
 *  net.minecraft.class_5398
 *  net.minecraft.class_6019
 *  org.jetbrains.annotations.Nullable
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

import java.util.UUID;
import java.util.function.Predicate;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1282;
import net.minecraft.class_1296;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1314;
import net.minecraft.class_1321;
import net.minecraft.class_1341;
import net.minecraft.class_1347;
import net.minecraft.class_1352;
import net.minecraft.class_1359;
import net.minecraft.class_1361;
import net.minecraft.class_1366;
import net.minecraft.class_1376;
import net.minecraft.class_1394;
import net.minecraft.class_1400;
import net.minecraft.class_1404;
import net.minecraft.class_1429;
import net.minecraft.class_1657;
import net.minecraft.class_1665;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1924;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2940;
import net.minecraft.class_2941;
import net.minecraft.class_2943;
import net.minecraft.class_2945;
import net.minecraft.class_3218;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_4291;
import net.minecraft.class_4802;
import net.minecraft.class_5132;
import net.minecraft.class_5134;
import net.minecraft.class_5328;
import net.minecraft.class_5354;
import net.minecraft.class_5398;
import net.minecraft.class_6019;
import net.romeosnowblitz.hmh2.entity.MobEntities;
import net.romeosnowblitz.hmh2.item.WarfareItems;
import org.jetbrains.annotations.Nullable;
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

public class TheGreatHungerEntity
extends class_1321
implements GeoEntity,
class_5354 {
    private AnimatableInstanceCache factory = new SingletonAnimatableInstanceCache((GeoAnimatable)this);
    private static final class_2940<Integer> ANGER_TIME = class_2945.method_12791(TheGreatHungerEntity.class, (class_2941)class_2943.field_13327);
    public static final Predicate<class_1309> FOLLOW_TAMED_PREDICATE = entity -> {
        class_1299 entityType = entity.method_5864();
        return entityType == class_1299.field_6113;
    };
    private static final class_6019 ANGER_TIME_RANGE = class_4802.method_24505((int)20, (int)39);
    @Nullable
    private UUID angryAt;

    public TheGreatHungerEntity(class_1299<? extends class_1321> entityType, class_1937 world) {
        super(entityType, world);
    }

    public boolean method_6481(class_1799 stack) {
        return stack.method_7909() == class_1802.field_8618;
    }

    public static class_5132.class_5133 setAttributes() {
        return class_1429.method_26828().method_26868(class_5134.field_23716, 20.0).method_26868(class_5134.field_23721, 8.0).method_26868(class_5134.field_23723, 2.0).method_26868(class_5134.field_23719, (double)0.3f);
    }

    protected void method_5959() {
        this.field_6201.method_6277(0, (class_1352)new class_1347((class_1308)this));
        this.field_6201.method_6277(1, (class_1352)new class_1359((class_1308)this, 0.4f));
        this.field_6201.method_6277(2, (class_1352)new class_1366((class_1314)this, 1.0, true));
        this.field_6201.method_6277(3, (class_1352)new class_4291((class_1314)this, 0.75, false));
        this.field_6201.method_6277(4, (class_1352)new class_1394((class_1314)this, 0.75, 1.0f));
        this.field_6201.method_6277(5, (class_1352)new class_1376((class_1308)this));
        this.field_6201.method_6277(6, (class_1352)new class_1361((class_1308)this, class_1657.class, 8.0f));
        this.field_6185.method_6277(1, (class_1352)new class_1404((class_1321)this, class_1429.class, false, FOLLOW_TAMED_PREDICATE));
        this.field_6185.method_6277(2, (class_1352)new class_1341((class_1429)this, 1.0));
        this.field_6185.method_6277(2, (class_1352)new class_1400((class_1308)this, class_1657.class, true));
        this.field_6185.method_6277(3, (class_1352)new class_1400((class_1308)this, class_1657.class, 10, true, false, arg_0 -> ((TheGreatHungerEntity)this).method_29515(arg_0)));
        this.field_6185.method_6277(4, (class_1352)new class_5398((class_1308)this, true));
    }

    private PlayState predicate(AnimationState animationState) {
        if (animationState.isMoving()) {
            animationState.getController().setAnimation(RawAnimation.begin().then("animation.the_great_hunger.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
        animationState.getController().setAnimation(RawAnimation.begin().then("animation.the_great_hunger.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController[]{new AnimationController((GeoAnimatable)this, "controller", 0, this::predicate)});
    }

    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.factory;
    }

    protected class_3414 method_5994() {
        return class_3417.field_38076;
    }

    protected class_3414 method_6011(class_1282 source) {
        return class_3417.field_14575;
    }

    protected class_3414 method_6002() {
        return class_3417.field_14964;
    }

    protected void method_5712(class_2338 pos, class_2680 state) {
        this.method_5783(class_3417.field_14894, 0.15f, 1.0f);
    }

    protected void method_5693() {
        super.method_5693();
        this.field_6011.method_12784(ANGER_TIME, (Object)0);
    }

    public boolean method_5643(class_1282 source, float amount) {
        if (this.method_5679(source)) {
            return false;
        }
        class_1297 entity = source.method_5529();
        if (!this.field_6002.field_9236) {
            this.method_24346(false);
        }
        if (entity != null && !(entity instanceof class_1657) && !(entity instanceof class_1665)) {
            amount = (amount + 1.0f) / 2.0f;
        }
        return super.method_5643(source, amount);
    }

    public boolean method_6121(class_1297 target) {
        boolean bl = target.method_5643(this.field_6002.method_48963().method_48812((class_1309)this), (float)((int)this.method_26825(class_5134.field_23721)));
        if (bl) {
            this.method_5723((class_1309)this, target);
        }
        return bl;
    }

    public class_1269 method_5992(class_1657 player, class_1268 hand) {
        class_1799 itemStack = player.method_5998(hand);
        if (itemStack.method_31574(WarfareItems.CLAYMORE) && !this.method_6109()) {
            player.method_5783(class_3417.field_14692, 1.0f, 1.0f);
            class_1799 itemStack2 = class_5328.method_30012((class_1799)itemStack, (class_1657)player, (class_1799)WarfareItems.TRUTHSEEKER.method_7854());
            player.method_6122(hand, itemStack2);
            return class_1269.method_29236((boolean)this.field_6002.field_9236);
        }
        if (itemStack.method_31574(WarfareItems.BREAD_KNIFE) && !this.method_6109()) {
            player.method_5783(class_3417.field_14692, 1.0f, 1.0f);
            class_1799 itemStack2 = class_5328.method_30012((class_1799)itemStack, (class_1657)player, (class_1799)WarfareItems.SOUL_KNIFE.method_7854());
            player.method_6122(hand, itemStack2);
            return class_1269.method_29236((boolean)this.field_6002.field_9236);
        }
        if (itemStack.method_31574(WarfareItems.CUTLASS) && !this.method_6109()) {
            player.method_5783(class_3417.field_14692, 1.0f, 1.0f);
            class_1799 itemStack2 = class_5328.method_30012((class_1799)itemStack, (class_1657)player, (class_1799)WarfareItems.MOON_DAGGER.method_7854());
            player.method_6122(hand, itemStack2);
            return class_1269.method_29236((boolean)this.field_6002.field_9236);
        }
        if (itemStack.method_31574(WarfareItems.SHEER_DAGGER) && !this.method_6109()) {
            player.method_5783(class_3417.field_14692, 1.0f, 1.0f);
            class_1799 itemStack2 = class_5328.method_30012((class_1799)itemStack, (class_1657)player, (class_1799)WarfareItems.TEMPEST_KNIFE.method_7854());
            player.method_6122(hand, itemStack2);
            return class_1269.method_29236((boolean)this.field_6002.field_9236);
        }
        return super.method_5992(player, hand);
    }

    public int method_29507() {
        return (Integer)this.field_6011.method_12789(ANGER_TIME);
    }

    public void method_29514(int angerTime) {
        this.field_6011.method_12778(ANGER_TIME, (Object)angerTime);
    }

    public void method_29509() {
        this.method_29514(ANGER_TIME_RANGE.method_35008(this.field_5974));
    }

    public UUID method_29508() {
        return this.angryAt;
    }

    public void method_29513(@Nullable UUID angryAt) {
        this.angryAt = angryAt;
    }

    @Nullable
    public class_1296 method_5613(class_3218 world, class_1296 entity) {
        return (class_1296)MobEntities.THE_GREAT_HUNGER.method_5883((class_1937)world);
    }

    public class_1924 method_48926() {
        return null;
    }
}

