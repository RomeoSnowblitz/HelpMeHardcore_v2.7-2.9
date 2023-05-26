/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  net.minecraft.class_1269
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1838
 *  net.minecraft.class_1935
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2680
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_5328
 *  net.minecraft.class_5712
 *  net.minecraft.class_5712$class_7397
 */
package net.romeosnowblitz.hmh2.item.custom.test;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1838;
import net.minecraft.class_1935;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_5328;
import net.minecraft.class_5712;
import net.romeosnowblitz.hmh2.block.ModBlocks;

public class Disc_Fragment
extends class_1792 {
    protected static final Map<class_2248, Pair<Predicate<class_1838>, Consumer<class_1838>>> TILLING_ACTIONS = Maps.newHashMap((Map)ImmutableMap.of((Object)class_2246.field_10114, (Object)Pair.of(Disc_Fragment::canTillFarmland, Disc_Fragment.createTillAction(ModBlocks.SAND_SCULK.method_9564()))));

    public Disc_Fragment(class_1792.class_1793 settings) {
        super(settings);
    }

    public class_1269 method_7884(class_1838 context) {
        class_2338 blockPos;
        class_1937 world = context.method_8045();
        Pair<Predicate<class_1838>, Consumer<class_1838>> pair = TILLING_ACTIONS.get(world.method_8320(blockPos = context.method_8037()).method_26204());
        if (pair == null) {
            return class_1269.field_5811;
        }
        Predicate predicate = (Predicate)pair.getFirst();
        Consumer consumer = (Consumer)pair.getSecond();
        if (predicate.test(context)) {
            class_1657 playerEntity = context.method_8036();
            world.method_8396(playerEntity, blockPos, class_3417.field_14846, class_3419.field_15245, 1.0f, 1.0f);
            if (!world.field_9236) {
                consumer.accept(context);
                if (playerEntity != null) {
                    context.method_8036().method_5783(class_3417.field_14692, 1.0f, 1.0f);
                    class_1799 itemStack2 = class_5328.method_30012((class_1799)context.method_8041(), (class_1657)context.method_8036(), (class_1799)class_1802.field_38974.method_7854());
                    context.method_8036().method_6122(context.method_20287(), itemStack2);
                }
            }
            return class_1269.method_29236((boolean)world.field_9236);
        }
        return class_1269.field_5811;
    }

    public static Consumer<class_1838> createTillAction(class_2680 result) {
        return context -> {
            context.method_8045().method_8652(context.method_8037(), result, 11);
            context.method_8045().method_43276(class_5712.field_28733, context.method_8037(), class_5712.class_7397.method_43286((class_1297)context.method_8036(), (class_2680)result));
        };
    }

    public static Consumer<class_1838> createTillAndDropAction(class_2680 result, class_1935 droppedItem) {
        return context -> {
            context.method_8045().method_8652(context.method_8037(), result, 11);
            context.method_8045().method_43276(class_5712.field_28733, context.method_8037(), class_5712.class_7397.method_43286((class_1297)context.method_8036(), (class_2680)result));
            class_2248.method_36992((class_1937)context.method_8045(), (class_2338)context.method_8037(), (class_2350)context.method_8038(), (class_1799)new class_1799(droppedItem));
        };
    }

    public static boolean canTillFarmland(class_1838 context) {
        return context.method_8038() != class_2350.field_11033 && context.method_8045().method_8320(context.method_8037().method_10084()).method_26215();
    }
}

