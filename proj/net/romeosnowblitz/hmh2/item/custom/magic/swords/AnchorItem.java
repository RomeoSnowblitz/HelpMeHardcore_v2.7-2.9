/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 *  net.minecraft.class_1268
 *  net.minecraft.class_1293
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1320
 *  net.minecraft.class_1322
 *  net.minecraft.class_1322$class_1323
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1831
 *  net.minecraft.class_1832
 *  net.minecraft.class_1922
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_3481
 *  net.minecraft.class_3614
 *  net.minecraft.class_5134
 */
package net.romeosnowblitz.hmh2.item.custom.magic.swords;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.class_1268;
import net.minecraft.class_1293;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1320;
import net.minecraft.class_1322;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1831;
import net.minecraft.class_1832;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3481;
import net.minecraft.class_3614;
import net.minecraft.class_5134;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.item.WarfareItems;

public class AnchorItem
extends class_1831 {
    private final Multimap<class_1320, class_1322> attributeModifiers;

    public AnchorItem(class_1832 toolMaterial, int attackDamage, float attackSpeed, class_1792.class_1793 settings) {
        super(toolMaterial, settings);
        ImmutableMultimap.Builder builder = ImmutableMultimap.builder();
        builder.put((Object)class_5134.field_23721, (Object)new class_1322(field_8006, "Weapon modifier", (double)attackDamage, class_1322.class_1323.field_6328));
        builder.put((Object)class_5134.field_23723, (Object)new class_1322(field_8001, "Weapon modifier", (double)attackSpeed, class_1322.class_1323.field_6328));
        this.attributeModifiers = builder.build();
    }

    public void method_7888(class_1799 stack, class_1937 world, class_1297 entity, int slot, boolean selected) {
        class_1657 player;
        super.method_7888(stack, world, entity, slot, selected);
        if (entity instanceof class_1657 && ((player = (class_1657)entity).method_5998(class_1268.field_5808).method_31574(WarfareItems.ANCHOR) || player.method_5998(class_1268.field_5810).method_31574(WarfareItems.ANCHOR))) {
            player.method_6092(new class_1293(CustomEffects.CONDUIT_FAILURE, 1200, 0));
            player.method_6092(new class_1293(CustomEffects.DOLPHINS_CURSE, 6000, 0));
        }
    }

    public boolean method_7885(class_2680 state, class_1937 world, class_2338 pos, class_1657 miner) {
        return !miner.method_7337();
    }

    public float method_7865(class_1799 stack, class_2680 state) {
        if (state.method_27852(class_2246.field_10343)) {
            return 15.0f;
        }
        class_3614 material = state.method_26207();
        return material != class_3614.field_15935 && material != class_3614.field_15956 && !state.method_26164(class_3481.field_15503) && material != class_3614.field_15954 ? 1.0f : 1.5f;
    }

    public boolean method_7873(class_1799 stack, class_1309 target, class_1309 attacker) {
        target.method_6092(new class_1293(CustomEffects.ANCHORED, 1200, 0));
        stack.method_7956(1, attacker, e -> e.method_20235(class_1304.field_6173));
        return true;
    }

    public boolean method_7879(class_1799 stack, class_1937 world, class_2680 state, class_2338 pos, class_1309 miner) {
        if (state.method_26214((class_1922)world, pos) != 0.0f) {
            stack.method_7956(2, miner, e -> e.method_20235(class_1304.field_6173));
        }
        return true;
    }

    public boolean method_7856(class_2680 state) {
        return state.method_27852(class_2246.field_10343);
    }

    public Multimap<class_1320, class_1322> method_7844(class_1304 slot) {
        return slot == class_1304.field_6173 ? this.attributeModifiers : super.method_7844(slot);
    }
}

