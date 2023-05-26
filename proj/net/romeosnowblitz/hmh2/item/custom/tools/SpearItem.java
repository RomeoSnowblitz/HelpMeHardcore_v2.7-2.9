/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 *  net.minecraft.class_1268
 *  net.minecraft.class_1271
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1313
 *  net.minecraft.class_1320
 *  net.minecraft.class_1322
 *  net.minecraft.class_1322$class_1323
 *  net.minecraft.class_1657
 *  net.minecraft.class_1665$class_1666
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1839
 *  net.minecraft.class_1890
 *  net.minecraft.class_1922
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3468
 *  net.minecraft.class_3532
 *  net.minecraft.class_5134
 *  net.minecraft.class_5150
 */
package net.romeosnowblitz.hmh2.item.custom.tools;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1313;
import net.minecraft.class_1320;
import net.minecraft.class_1322;
import net.minecraft.class_1657;
import net.minecraft.class_1665;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1839;
import net.minecraft.class_1890;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3468;
import net.minecraft.class_3532;
import net.minecraft.class_5134;
import net.minecraft.class_5150;
import net.romeosnowblitz.hmh2.entity.mob.minecraft.SpearEntity;

public class SpearItem
extends class_1792
implements class_5150 {
    public static final int field_30926 = 10;
    public static final float ATTACK_DAMAGE = 8.0f;
    public static final float field_30928 = 2.5f;
    private final Multimap<class_1320, class_1322> attributeModifiers;

    public SpearItem(class_1792.class_1793 settings) {
        super(settings);
        ImmutableMultimap.Builder builder = ImmutableMultimap.builder();
        builder.put((Object)class_5134.field_23721, (Object)new class_1322(field_8006, "Tool modifier", 8.0, class_1322.class_1323.field_6328));
        builder.put((Object)class_5134.field_23723, (Object)new class_1322(field_8001, "Tool modifier", (double)-2.9f, class_1322.class_1323.field_6328));
        this.attributeModifiers = builder.build();
    }

    public boolean method_7885(class_2680 state, class_1937 world, class_2338 pos, class_1657 miner) {
        return !miner.method_7337();
    }

    public class_1839 method_7853(class_1799 stack) {
        return class_1839.field_8951;
    }

    public int method_7881(class_1799 stack) {
        return 72000;
    }

    public void method_7840(class_1799 stack, class_1937 world, class_1309 user, int remainingUseTicks) {
        if (user instanceof class_1657) {
            int j;
            class_1657 playerEntity = (class_1657)user;
            int i = this.method_7881(stack) - remainingUseTicks;
            if (i >= 10 && ((j = class_1890.method_8202((class_1799)stack)) <= 0 || playerEntity.method_5721())) {
                if (!world.field_9236) {
                    stack.method_7956(1, (class_1309)playerEntity, p -> p.method_20236(user.method_6058()));
                    if (j == 0) {
                        SpearEntity spearEntity = new SpearEntity(world, (class_1309)playerEntity, stack);
                        spearEntity.method_24919((class_1297)playerEntity, playerEntity.method_36455(), playerEntity.method_36454(), 0.0f, 2.5f + (float)j * 0.5f, 1.0f);
                        if (playerEntity.method_31549().field_7477) {
                            spearEntity.field_7572 = class_1665.class_1666.field_7594;
                        }
                        world.method_8649((class_1297)spearEntity);
                        world.method_43129((class_1657)null, (class_1297)spearEntity, class_3417.field_15001, class_3419.field_15248, 1.0f, 1.0f);
                        if (!playerEntity.method_31549().field_7477) {
                            playerEntity.method_31548().method_7378(stack);
                        }
                    }
                }
                playerEntity.method_7259(class_3468.field_15372.method_14956((Object)this));
                if (j > 0) {
                    float f = playerEntity.method_36454();
                    float g = playerEntity.method_36455();
                    float h = -class_3532.method_15374((float)(f * ((float)Math.PI / 180))) * class_3532.method_15362((float)(g * ((float)Math.PI / 180)));
                    float k = -class_3532.method_15374((float)(g * ((float)Math.PI / 180)));
                    float l = class_3532.method_15362((float)(f * ((float)Math.PI / 180))) * class_3532.method_15362((float)(g * ((float)Math.PI / 180)));
                    float m = class_3532.method_15355((float)(h * h + k * k + l * l));
                    float n = 3.0f * ((1.0f + (float)j) / 4.0f);
                    playerEntity.method_5762((double)(h *= n / m), (double)(k *= n / m), (double)(l *= n / m));
                    playerEntity.method_40126(20);
                    if (playerEntity.method_24828()) {
                        float o = 1.1999999f;
                        playerEntity.method_5784(class_1313.field_6308, new class_243(0.0, 1.1999999284744263, 0.0));
                    }
                    class_3414 soundEvent = j >= 3 ? class_3417.field_14717 : (j == 2 ? class_3417.field_14806 : class_3417.field_14606);
                    world.method_43129((class_1657)null, (class_1297)playerEntity, soundEvent, class_3419.field_15248, 1.0f, 1.0f);
                }
            }
        }
    }

    public class_1271<class_1799> method_7836(class_1937 world, class_1657 user, class_1268 hand) {
        class_1799 itemStack = user.method_5998(hand);
        if (itemStack.method_7919() >= itemStack.method_7936() - 1) {
            return class_1271.method_22431((Object)itemStack);
        }
        if (class_1890.method_8202((class_1799)itemStack) > 0 && !user.method_5721()) {
            return class_1271.method_22431((Object)itemStack);
        }
        user.method_6019(hand);
        return class_1271.method_22428((Object)itemStack);
    }

    public boolean method_7873(class_1799 stack, class_1309 target, class_1309 attacker) {
        stack.method_7956(1, attacker, e -> e.method_20235(class_1304.field_6173));
        return true;
    }

    public boolean method_7879(class_1799 stack, class_1937 world, class_2680 state, class_2338 pos, class_1309 miner) {
        if ((double)state.method_26214((class_1922)world, pos) != 0.0) {
            stack.method_7956(2, miner, e -> e.method_20235(class_1304.field_6173));
        }
        return true;
    }

    public Multimap<class_1320, class_1322> method_7844(class_1304 slot) {
        return slot == class_1304.field_6173 ? this.attributeModifiers : super.method_7844(slot);
    }

    public int method_7837() {
        return 1;
    }
}

