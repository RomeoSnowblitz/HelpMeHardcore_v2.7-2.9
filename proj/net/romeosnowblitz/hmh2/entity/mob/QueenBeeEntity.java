/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1259$class_1260
 *  net.minecraft.class_1259$class_1261
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1282
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1308
 *  net.minecraft.class_1309
 *  net.minecraft.class_1313
 *  net.minecraft.class_1314
 *  net.minecraft.class_1321
 *  net.minecraft.class_1335
 *  net.minecraft.class_1335$class_1336
 *  net.minecraft.class_1347
 *  net.minecraft.class_1352
 *  net.minecraft.class_1352$class_4134
 *  net.minecraft.class_1366
 *  net.minecraft.class_1400
 *  net.minecraft.class_1439
 *  net.minecraft.class_1617
 *  net.minecraft.class_1617$class_1618
 *  net.minecraft.class_1617$class_1620
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_2487
 *  net.minecraft.class_2561
 *  net.minecraft.class_2680
 *  net.minecraft.class_270
 *  net.minecraft.class_2940
 *  net.minecraft.class_2941
 *  net.minecraft.class_2943
 *  net.minecraft.class_2945
 *  net.minecraft.class_3213
 *  net.minecraft.class_3218
 *  net.minecraft.class_3222
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3532
 *  net.minecraft.class_3730
 *  net.minecraft.class_4048
 *  net.minecraft.class_4050
 *  net.minecraft.class_4051
 *  net.minecraft.class_5132$class_5133
 *  net.minecraft.class_5134
 *  net.minecraft.class_5328
 *  net.minecraft.class_5425
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

import java.util.EnumSet;
import net.minecraft.class_1259;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1282;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1313;
import net.minecraft.class_1314;
import net.minecraft.class_1321;
import net.minecraft.class_1335;
import net.minecraft.class_1347;
import net.minecraft.class_1352;
import net.minecraft.class_1366;
import net.minecraft.class_1400;
import net.minecraft.class_1439;
import net.minecraft.class_1617;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2487;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_270;
import net.minecraft.class_2940;
import net.minecraft.class_2941;
import net.minecraft.class_2943;
import net.minecraft.class_2945;
import net.minecraft.class_3213;
import net.minecraft.class_3218;
import net.minecraft.class_3222;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3532;
import net.minecraft.class_3730;
import net.minecraft.class_4048;
import net.minecraft.class_4050;
import net.minecraft.class_4051;
import net.minecraft.class_5132;
import net.minecraft.class_5134;
import net.minecraft.class_5328;
import net.minecraft.class_5425;
import net.romeosnowblitz.hmh2.entity.MobEntities;
import net.romeosnowblitz.hmh2.entity.mob.SoldierBeeEntity;
import net.romeosnowblitz.hmh2.item.ModItems;
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

public class QueenBeeEntity
extends class_1617
implements GeoEntity {
    private AnimatableInstanceCache factory = new SingletonAnimatableInstanceCache((GeoAnimatable)this);
    private final class_3213 bossBar = (class_3213)new class_3213(this.method_5476(), class_1259.class_1260.field_5782, class_1259.class_1261.field_5795).method_5410(true).method_5406(false);
    protected static final class_2940<Byte> QUEEN_FLAGS = class_2945.method_12791(QueenBeeEntity.class, (class_2941)class_2943.field_13319);
    private static final int CHARGING_FLAG = 1;
    private class_2338 bounds;

    public QueenBeeEntity(class_1299<? extends class_1617> entityType, class_1937 world) {
        super(entityType, world);
        this.field_6207 = new QueenBeeMoveControl(this);
    }

    public void method_5784(class_1313 movementType, class_243 movement) {
        super.method_5784(movementType, movement);
        this.method_5852();
    }

    public void method_5773() {
        this.field_5960 = true;
        super.method_5773();
        this.field_5960 = false;
        this.method_5875(true);
    }

    protected class_3414 method_7142() {
        return class_3417.field_20610;
    }

    public void method_16484(int wave, boolean unused) {
    }

    public static class_5132.class_5133 setAttributes() {
        return class_1321.method_26828().method_26868(class_5134.field_23716, 200.0).method_26868(class_5134.field_23721, 20.0).method_26868(class_5134.field_23723, 10.0).method_26868(class_5134.field_23719, 10.0).method_26868(class_5134.field_23717, 1024.0);
    }

    protected void method_5959() {
        this.field_6201.method_6277(0, (class_1352)new class_1347((class_1308)this));
        this.field_6201.method_6277(1, (class_1352)new class_1366((class_1314)this, 4.0, false));
        this.field_6201.method_6277(5, (class_1352)new SummonVexGoal());
        this.field_6201.method_6277(1, (class_1352)new ChargeTargetGoal());
        this.field_6201.method_6277(2, (class_1352)new LookAtTargetGoal());
        this.field_6185.method_6277(1, (class_1352)new class_1400((class_1308)this, class_1439.class, true));
        this.field_6185.method_6277(1, (class_1352)new class_1400((class_1308)this, class_1657.class, true));
    }

    private PlayState predicate(AnimationState animationState) {
        if (animationState.isMoving()) {
            animationState.getController().setAnimation(RawAnimation.begin().then("animation.queen_bee.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
        animationState.getController().setAnimation(RawAnimation.begin().then("animation.queen_bee.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    protected void method_5693() {
        super.method_5693();
        this.field_6011.method_12784(QUEEN_FLAGS, (Object)0);
    }

    public boolean method_6121(class_1297 target) {
        if (!super.method_6121(target)) {
            return false;
        }
        if (target instanceof class_1309) {
            ((class_1309)target).method_37222(new class_1293(class_1294.field_5899, 200, 9), (class_1297)this);
        }
        return true;
    }

    public class_1269 method_5992(class_1657 player, class_1268 hand) {
        class_1799 itemStack = player.method_5998(hand);
        if (itemStack.method_31574(class_1802.field_8550) && !this.method_6109()) {
            player.method_5783(class_3417.field_20615, 1.0f, 1.0f);
            class_1799 itemStack2 = class_5328.method_30012((class_1799)itemStack, (class_1657)player, (class_1799)ModItems.HONEY_BUCKET.method_7854());
            player.method_6122(hand, itemStack2);
            return class_1269.method_29236((boolean)this.field_6002.field_9236);
        }
        return super.method_5992(player, hand);
    }

    public void method_5749(class_2487 nbt) {
        super.method_5749(nbt);
        if (nbt.method_10545("BoundX")) {
            this.bounds = new class_2338(nbt.method_10550("BoundX"), nbt.method_10550("BoundY"), nbt.method_10550("BoundZ"));
        }
        if (this.method_16914()) {
            this.bossBar.method_5413(this.method_5476());
        }
    }

    public class_3414 method_20033() {
        return null;
    }

    public void method_5665(@Nullable class_2561 name) {
        super.method_5665(name);
        this.bossBar.method_5413(this.method_5476());
    }

    public void method_5652(class_2487 nbt) {
        super.method_5652(nbt);
        if (this.bounds != null) {
            nbt.method_10569("BoundX", this.bounds.method_10263());
            nbt.method_10569("BoundY", this.bounds.method_10264());
            nbt.method_10569("BoundZ", this.bounds.method_10260());
        }
    }

    private boolean areFlagsSet(int mask) {
        byte i = (Byte)this.field_6011.method_12789(QUEEN_FLAGS);
        return (i & mask) != 0;
    }

    private void setQueenFlags(int mask, boolean value) {
        int i = ((Byte)this.field_6011.method_12789(QUEEN_FLAGS)).byteValue();
        i = value ? (i = i | mask) : (i = i & ~mask);
        this.field_6011.method_12778(QUEEN_FLAGS, (Object)((byte)(i & 0xFF)));
    }

    public boolean isCharging() {
        return this.areFlagsSet(1);
    }

    public void setCharging(boolean charging) {
        this.setQueenFlags(1, charging);
    }

    protected float method_18394(class_4050 pose, class_4048 dimensions) {
        return 2.6f;
    }

    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController[]{new AnimationController((GeoAnimatable)this, "controller", 0, this::predicate)});
    }

    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.factory;
    }

    protected void method_5958() {
        super.method_5958();
        for (int i = 1; i < 3; ++i) {
            if (this.field_6012 % 20 != 0) continue;
            this.method_6025(2.0f);
        }
        this.bossBar.method_5408(this.method_6032() / this.method_6063());
    }

    public void onSummoned() {
        this.bossBar.method_5408(0.0f);
        this.method_6033(this.method_6063() / 3.0f);
    }

    public void method_5837(class_3222 player) {
        super.method_5837(player);
        this.bossBar.method_14088(player);
    }

    public void method_5742(class_3222 player) {
        super.method_5742(player);
        this.bossBar.method_14089(player);
    }

    protected class_3414 method_5994() {
        return class_3417.field_20604;
    }

    protected class_3414 method_6011(class_1282 source) {
        return class_3417.field_23060;
    }

    protected class_3414 method_6002() {
        return class_3417.field_14898;
    }

    protected void method_5712(class_2338 pos, class_2680 state) {
        this.method_5783(class_3417.field_20604, 0.5f, 1.0f);
    }

    public class_270 method_5781() {
        return super.method_5781();
    }

    public boolean method_5931(class_1657 player) {
        return false;
    }

    class QueenBeeMoveControl
    extends class_1335 {
        public QueenBeeMoveControl(QueenBeeEntity owner) {
            super((class_1308)owner);
        }

        public void method_6240() {
            if (this.field_6374 != class_1335.class_1336.field_6378) {
                return;
            }
            class_243 vec3d = new class_243(this.field_6370 - QueenBeeEntity.this.method_23317(), this.field_6369 - QueenBeeEntity.this.method_23318(), this.field_6367 - QueenBeeEntity.this.method_23321());
            double d = vec3d.method_1033();
            if (d < QueenBeeEntity.this.method_5829().method_995()) {
                this.field_6374 = class_1335.class_1336.field_6377;
                QueenBeeEntity.this.method_18799(QueenBeeEntity.this.method_18798().method_1021(0.5));
            } else {
                QueenBeeEntity.this.method_18799(QueenBeeEntity.this.method_18798().method_1019(vec3d.method_1021(this.field_6372 * 0.05 / d)));
                if (QueenBeeEntity.this.method_5968() == null) {
                    class_243 vec3d2 = QueenBeeEntity.this.method_18798();
                    QueenBeeEntity.this.method_36456(-((float)class_3532.method_15349((double)vec3d2.field_1352, (double)vec3d2.field_1350)) * 57.295776f);
                    QueenBeeEntity.this.field_6283 = QueenBeeEntity.this.method_36454();
                } else {
                    double e = QueenBeeEntity.this.method_5968().method_23317() - QueenBeeEntity.this.method_23317();
                    double f = QueenBeeEntity.this.method_5968().method_23321() - QueenBeeEntity.this.method_23321();
                    QueenBeeEntity.this.method_36456(-((float)class_3532.method_15349((double)e, (double)f)) * 57.295776f);
                    QueenBeeEntity.this.field_6283 = QueenBeeEntity.this.method_36454();
                }
            }
        }
    }

    class SummonVexGoal
    extends class_1617.class_1620 {
        private final class_4051 closeQueenBeePredicate;

        SummonVexGoal() {
            super((class_1617)QueenBeeEntity.this);
            this.closeQueenBeePredicate = class_4051.method_36626().method_18418(16.0).method_36627().method_18424();
        }

        public boolean method_6264() {
            if (!super.method_6264()) {
                return false;
            }
            int i = QueenBeeEntity.this.field_6002.method_18466(QueenBeeEntity.class, this.closeQueenBeePredicate, (class_1309)QueenBeeEntity.this, QueenBeeEntity.this.method_5829().method_1014(16.0)).size();
            return QueenBeeEntity.this.field_5974.method_43048(8) + 1 > i;
        }

        protected int method_7149() {
            return 100;
        }

        protected int method_7151() {
            return 340;
        }

        protected void method_7148() {
            class_3218 serverWorld = (class_3218)QueenBeeEntity.this.field_6002;
            for (int i = 0; i < 3; ++i) {
                class_2338 blockPos = QueenBeeEntity.this.method_24515().method_10069(-2 + QueenBeeEntity.this.field_5974.method_43048(5), 1, -2 + QueenBeeEntity.this.field_5974.method_43048(5));
                SoldierBeeEntity soldierBeeEntity = (SoldierBeeEntity)MobEntities.SOLDIER_BEE.method_5883(QueenBeeEntity.this.field_6002);
                soldierBeeEntity.method_5725(blockPos, 0.0f, 0.0f);
                soldierBeeEntity.method_5943((class_5425)serverWorld, QueenBeeEntity.this.field_6002.method_8404(blockPos), class_3730.field_16471, null, null);
                serverWorld.method_30771((class_1297)soldierBeeEntity);
            }
        }

        protected class_3414 method_7150() {
            return class_3417.field_20604;
        }

        protected class_1617.class_1618 method_7147() {
            return class_1617.class_1618.field_7379;
        }
    }

    class ChargeTargetGoal
    extends class_1352 {
        public ChargeTargetGoal() {
            this.method_6265(EnumSet.of(class_1352.class_4134.field_18405));
        }

        public boolean method_6264() {
            class_1309 livingEntity = QueenBeeEntity.this.method_5968();
            if (livingEntity != null && livingEntity.method_5805() && !QueenBeeEntity.this.method_5962().method_6241() && QueenBeeEntity.this.field_5974.method_43048(ChargeTargetGoal.method_38848((int)7)) == 0) {
                return QueenBeeEntity.this.method_5858((class_1297)livingEntity) > 4.0;
            }
            return false;
        }

        public boolean method_6266() {
            return QueenBeeEntity.this.method_5962().method_6241() && QueenBeeEntity.this.isCharging() && QueenBeeEntity.this.method_5968() != null && QueenBeeEntity.this.method_5968().method_5805();
        }

        public void method_6269() {
            class_1309 livingEntity = QueenBeeEntity.this.method_5968();
            if (livingEntity != null) {
                class_243 vec3d = livingEntity.method_33571();
                QueenBeeEntity.this.field_6207.method_6239(vec3d.field_1352, vec3d.field_1351, vec3d.field_1350, 1.0);
            }
            QueenBeeEntity.this.setCharging(true);
            QueenBeeEntity.this.method_5783(class_3417.field_20604, 1.0f, 0.7f);
        }

        public void method_6270() {
            QueenBeeEntity.this.setCharging(false);
        }

        public boolean method_38846() {
            return true;
        }

        public void method_6268() {
            class_1309 livingEntity = QueenBeeEntity.this.method_5968();
            if (livingEntity == null) {
                return;
            }
            if (QueenBeeEntity.this.method_5829().method_994(livingEntity.method_5829())) {
                QueenBeeEntity.this.method_6121((class_1297)livingEntity);
                QueenBeeEntity.this.setCharging(false);
            } else {
                double d = QueenBeeEntity.this.method_5858((class_1297)livingEntity);
                if (d < 9.0) {
                    class_243 vec3d = livingEntity.method_33571();
                    QueenBeeEntity.this.field_6207.method_6239(vec3d.field_1352, vec3d.field_1351, vec3d.field_1350, 1.0);
                }
            }
        }
    }

    class LookAtTargetGoal
    extends class_1352 {
        public LookAtTargetGoal() {
            this.method_6265(EnumSet.of(class_1352.class_4134.field_18405));
        }

        public boolean method_6264() {
            return !QueenBeeEntity.this.method_5962().method_6241() && QueenBeeEntity.this.field_5974.method_43048(LookAtTargetGoal.method_38848((int)7)) == 0;
        }

        public boolean method_6266() {
            return false;
        }

        public void method_6268() {
            class_2338 blockPos = QueenBeeEntity.this.bounds;
            if (blockPos == null) {
                blockPos = QueenBeeEntity.this.method_24515();
            }
            for (int i = 0; i < 3; ++i) {
                class_2338 blockPos2 = blockPos.method_10069(QueenBeeEntity.this.field_5974.method_43048(15) - 7, QueenBeeEntity.this.field_5974.method_43048(11) - 5, QueenBeeEntity.this.field_5974.method_43048(15) - 7);
                if (!QueenBeeEntity.this.field_6002.method_22347(blockPos2)) continue;
                QueenBeeEntity.this.field_6207.method_6239((double)blockPos2.method_10263() + 0.5, (double)blockPos2.method_10264() + 0.5, (double)blockPos2.method_10260() + 0.5, 0.25);
                if (QueenBeeEntity.this.method_5968() != null) break;
                QueenBeeEntity.this.method_5988().method_6230((double)blockPos2.method_10263() + 0.5, (double)blockPos2.method_10264() + 0.5, (double)blockPos2.method_10260() + 0.5, 180.0f, 20.0f);
                break;
            }
        }
    }
}

