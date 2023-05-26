/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1271
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_174
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1839
 *  net.minecraft.class_1922
 *  net.minecraft.class_1935
 *  net.minecraft.class_1936
 *  net.minecraft.class_1937
 *  net.minecraft.class_2248
 *  net.minecraft.class_2263
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_2394
 *  net.minecraft.class_2398
 *  net.minecraft.class_2402
 *  net.minecraft.class_2680
 *  net.minecraft.class_3222
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3468
 *  net.minecraft.class_3486
 *  net.minecraft.class_3609
 *  net.minecraft.class_3611
 *  net.minecraft.class_3612
 *  net.minecraft.class_3614
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3965
 *  net.minecraft.class_5328
 *  net.minecraft.class_5633
 *  net.minecraft.class_5712
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.item.custom.magic.fluids;

import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_174;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1839;
import net.minecraft.class_1922;
import net.minecraft.class_1935;
import net.minecraft.class_1936;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2263;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_2402;
import net.minecraft.class_2680;
import net.minecraft.class_3222;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3468;
import net.minecraft.class_3486;
import net.minecraft.class_3609;
import net.minecraft.class_3611;
import net.minecraft.class_3612;
import net.minecraft.class_3614;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_5328;
import net.minecraft.class_5633;
import net.minecraft.class_5712;
import org.jetbrains.annotations.Nullable;

public class FireImmunityBucket
extends class_1792
implements class_5633 {
    private final class_3611 fluid;

    public FireImmunityBucket(class_3611 fluid, class_1792.class_1793 settings) {
        super(settings);
        this.fluid = fluid;
    }

    public class_1799 method_7861(class_1799 stack, class_1937 world, class_1309 user) {
        if (user instanceof class_3222) {
            class_3222 serverPlayerEntity = (class_3222)user;
            class_174.field_1198.method_8821(serverPlayerEntity, stack);
            serverPlayerEntity.method_7259(class_3468.field_15372.method_14956((Object)this));
        }
        if (user instanceof class_1657 && !((class_1657)user).method_31549().field_7477) {
            stack.method_7934(1);
        }
        if (!world.field_9236) {
            user.method_6092(new class_1293(class_1294.field_5918, 200, 4));
        }
        return stack.method_7960() ? new class_1799((class_1935)class_1802.field_8550) : stack;
    }

    public int method_7881(class_1799 stack) {
        return 32;
    }

    public class_1839 method_7853(class_1799 stack) {
        return class_1839.field_8946;
    }

    public class_1271<class_1799> method_7836(class_1937 world, class_1657 user, class_1268 hand) {
        class_1799 itemStack = user.method_5998(hand);
        class_3965 blockHitResult = FireImmunityBucket.method_7872((class_1937)world, (class_1657)user, (class_3959.class_242)(this.fluid == class_3612.field_15906 ? class_3959.class_242.field_1345 : class_3959.class_242.field_1348));
        if (blockHitResult.method_17783() == class_239.class_240.field_1333) {
            return class_5328.method_29282((class_1937)world, (class_1657)user, (class_1268)hand);
        }
        if (blockHitResult.method_17783() != class_239.class_240.field_1332) {
            return class_1271.method_22430((Object)itemStack);
        }
        class_2338 blockPos = blockHitResult.method_17777();
        class_2350 direction = blockHitResult.method_17780();
        class_2338 blockPos2 = blockPos.method_10093(direction);
        if (world.method_8505(user, blockPos) && user.method_7343(blockPos2, direction, itemStack)) {
            class_2338 blockPos3;
            if (this.fluid == class_3612.field_15906) {
                class_2263 fluidDrainable;
                class_1799 itemStack2;
                class_2680 blockState = world.method_8320(blockPos);
                if (blockState.method_26204() instanceof class_2263 && !(itemStack2 = (fluidDrainable = (class_2263)blockState.method_26204()).method_9700((class_1936)world, blockPos, blockState)).method_7960()) {
                    user.method_7259(class_3468.field_15372.method_14956((Object)this));
                    fluidDrainable.method_32351().ifPresent(sound -> user.method_5783(sound, 1.0f, 1.0f));
                    world.method_33596((class_1297)user, class_5712.field_28167, blockPos);
                    class_1799 itemStack3 = class_5328.method_30012((class_1799)itemStack, (class_1657)user, (class_1799)itemStack2);
                    if (!world.field_9236) {
                        class_174.field_1208.method_8932((class_3222)user, itemStack2);
                    }
                    return class_1271.method_29237((Object)itemStack3, (boolean)world.method_8608());
                }
                return class_1271.method_22431((Object)itemStack);
            }
            class_2680 blockState = world.method_8320(blockPos);
            class_2338 class_23382 = blockPos3 = blockState.method_26204() instanceof class_2402 && this.fluid == class_3612.field_15910 ? blockPos : blockPos2;
            if (this.method_7731(user, world, blockPos3, blockHitResult)) {
                this.method_7728(user, world, itemStack, blockPos3);
                if (user instanceof class_3222) {
                    class_174.field_1191.method_9087((class_3222)user, blockPos3, itemStack);
                }
                user.method_7259(class_3468.field_15372.method_14956((Object)this));
                return class_1271.method_29237((Object)FireImmunityBucket.getEmptiedStack(itemStack, user), (boolean)world.method_8608());
            }
            return class_1271.method_22431((Object)itemStack);
        }
        return class_1271.method_22431((Object)itemStack);
    }

    public static class_1799 getEmptiedStack(class_1799 stack, class_1657 player) {
        return !player.method_31549().field_7477 ? new class_1799((class_1935)class_1802.field_8550) : stack;
    }

    public void method_7728(@Nullable class_1657 player, class_1937 world, class_1799 stack, class_2338 pos) {
    }

    public boolean method_7731(@Nullable class_1657 player, class_1937 world, class_2338 pos, @Nullable class_3965 hitResult) {
        boolean bl2;
        if (!(this.fluid instanceof class_3609)) {
            return false;
        }
        class_2680 blockState = world.method_8320(pos);
        class_2248 block = blockState.method_26204();
        class_3614 material = blockState.method_26207();
        boolean bl = blockState.method_26188(this.fluid);
        boolean bl3 = bl2 = blockState.method_26215() || bl || block instanceof class_2402 && ((class_2402)block).method_10310((class_1922)world, pos, blockState, this.fluid);
        if (!bl2) {
            return hitResult != null && this.method_7731(player, world, hitResult.method_17777().method_10093(hitResult.method_17780()), null);
        }
        if (world.method_8597().comp_644() && this.fluid.method_15791(class_3486.field_15517)) {
            int i = pos.method_10263();
            int j = pos.method_10264();
            int k = pos.method_10260();
            world.method_8396(player, pos, class_3417.field_15102, class_3419.field_15245, 0.5f, 2.6f + (world.field_9229.method_43057() - world.field_9229.method_43057()) * 0.8f);
            for (int l = 0; l < 8; ++l) {
                world.method_8406((class_2394)class_2398.field_11237, (double)i + Math.random(), (double)j + Math.random(), (double)k + Math.random(), 0.0, 0.0, 0.0);
            }
            return true;
        }
        if (block instanceof class_2402 && this.fluid == class_3612.field_15910) {
            ((class_2402)block).method_10311((class_1936)world, pos, blockState, ((class_3609)this.fluid).method_15729(false));
            this.playEmptyingSound(player, (class_1936)world, pos);
            return true;
        }
        if (!world.field_9236 && bl && !material.method_15797()) {
            world.method_22352(pos, true);
        }
        if (!world.method_8652(pos, this.fluid.method_15785().method_15759(), 11) && !blockState.method_26227().method_15771()) {
            return false;
        }
        this.playEmptyingSound(player, (class_1936)world, pos);
        return true;
    }

    protected void playEmptyingSound(@Nullable class_1657 player, class_1936 world, class_2338 pos) {
        class_3414 soundEvent = this.fluid.method_15791(class_3486.field_15518) ? class_3417.field_15010 : class_3417.field_14834;
        world.method_8396(player, pos, soundEvent, class_3419.field_15245, 1.0f, 1.0f);
        world.method_33596((class_1297)player, class_5712.field_28166, pos);
    }
}

