/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 *  net.minecraft.class_1269
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1320
 *  net.minecraft.class_1322
 *  net.minecraft.class_1322$class_1323
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1838
 *  net.minecraft.class_1922
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2680
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_5134
 *  net.minecraft.class_5712
 *  net.minecraft.class_5712$class_7397
 */
package net.romeosnowblitz.hmh2.item.custom.tools;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import java.util.Map;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1320;
import net.minecraft.class_1322;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1838;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_5134;
import net.minecraft.class_5712;
import net.romeosnowblitz.hmh2.block.ModBlocks;

public class ModCarver
extends class_1792 {
    protected static final Map<class_2248, class_2680> PATH_STATES = new ImmutableMap.Builder().put((Object)class_2246.field_10545, (Object)ModBlocks.CARVED_MELON.method_9564()).build();
    private final Multimap<class_1320, class_1322> attributeModifiers;

    public ModCarver(int attackDamage, float attackSpeed, class_1792.class_1793 settings) {
        super(settings);
        ImmutableMultimap.Builder builder = ImmutableMultimap.builder();
        builder.put((Object)class_5134.field_23721, (Object)new class_1322(field_8006, "Weapon modifier", (double)attackDamage, class_1322.class_1323.field_6328));
        builder.put((Object)class_5134.field_23723, (Object)new class_1322(field_8001, "Weapon modifier", (double)attackSpeed, class_1322.class_1323.field_6328));
        this.attributeModifiers = builder.build();
    }

    public class_1269 method_7884(class_1838 context) {
        class_1937 world = context.method_8045();
        class_2338 blockPos = context.method_8037();
        class_2680 blockState = world.method_8320(blockPos);
        if (context.method_8038() != class_2350.field_11033) {
            class_1657 playerEntity = context.method_8036();
            class_2680 blockState2 = PATH_STATES.get(blockState.method_26204());
            class_2680 blockState3 = null;
            if (blockState2 != null && world.method_8320(blockPos.method_10084()).method_26215()) {
                world.method_8396(playerEntity, blockPos, class_3417.field_14616, class_3419.field_15245, 1.0f, 1.0f);
                blockState3 = blockState2;
            }
            if (blockState3 != null) {
                if (!world.field_9236) {
                    world.method_8652(blockPos, blockState3, 11);
                    world.method_43276(class_5712.field_28733, blockPos, class_5712.class_7397.method_43286((class_1297)playerEntity, (class_2680)blockState3));
                    if (playerEntity != null) {
                        context.method_8041().method_7956(1, (class_1309)playerEntity, p -> p.method_20236(context.method_20287()));
                    }
                }
                return class_1269.method_29236((boolean)world.field_9236);
            }
        }
        return class_1269.field_5811;
    }

    public boolean method_7873(class_1799 stack, class_1309 target, class_1309 attacker) {
        stack.method_7956(1, attacker, e -> e.method_20235(class_1304.field_6173));
        return true;
    }

    public boolean method_7879(class_1799 stack, class_1937 world, class_2680 state, class_2338 pos, class_1309 miner) {
        if (state.method_26214((class_1922)world, pos) != 0.0f) {
            stack.method_7956(2, miner, e -> e.method_20235(class_1304.field_6173));
        }
        return true;
    }
}

