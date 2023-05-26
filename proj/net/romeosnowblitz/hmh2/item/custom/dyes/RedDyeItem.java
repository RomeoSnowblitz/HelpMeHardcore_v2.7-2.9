/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1299
 *  net.minecraft.class_1309
 *  net.minecraft.class_1472
 *  net.minecraft.class_1657
 *  net.minecraft.class_1767
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 */
package net.romeosnowblitz.hmh2.item.custom.dyes;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1472;
import net.minecraft.class_1657;
import net.minecraft.class_1767;
import net.minecraft.class_1792;
import net.minecraft.class_1799;

public class RedDyeItem
extends class_1792 {
    public RedDyeItem(class_1792.class_1793 settings) {
        super(settings);
    }

    public class_1269 method_7847(class_1799 stack, class_1657 user, class_1309 entity, class_1268 hand) {
        if (user.method_37908().field_9236 && hand == class_1268.field_5808 && entity.method_5864() == class_1299.field_6115) {
            class_1472 sheep = (class_1472)entity;
            sheep.method_6631(class_1767.field_7964);
            if (!user.method_7337()) {
                user.method_5998(hand).method_7934(1);
            }
        }
        return super.method_7847(stack, user, entity, hand);
    }
}

