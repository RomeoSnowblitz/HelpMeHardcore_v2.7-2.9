/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1738
 *  net.minecraft.class_1738$class_8051
 *  net.minecraft.class_1741
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 */
package net.romeosnowblitz.hmh2.item.custom.magic.perks;

import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1738;
import net.minecraft.class_1741;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.romeosnowblitz.hmh2.item.WarfareItems;

public class EmeraldPerk
extends class_1738 {
    public EmeraldPerk(class_1741 material, class_1738.class_8051 type, class_1792.class_1793 settings) {
        super(material, type, settings);
    }

    public void method_7888(class_1799 stack, class_1937 world, class_1297 entity, int slot, boolean selected) {
        if (!world.method_8608() && entity instanceof class_1657) {
            class_1657 player = (class_1657)entity;
            class_1799 headPiece = player.method_6118(class_1304.field_6169);
            class_1799 chestPiece = player.method_6118(class_1304.field_6174);
            class_1799 legPiece = player.method_6118(class_1304.field_6172);
            class_1799 footPiece = player.method_6118(class_1304.field_6166);
            if (headPiece.method_31574(WarfareItems.EMERALD_HELMET) || chestPiece.method_31574(WarfareItems.EMERALD_CHESTPLATE) || legPiece.method_31574(WarfareItems.EMERALD_LEGGINGS) || footPiece.method_31574(WarfareItems.EMERALD_BOOTS)) {
                player.method_6092(new class_1293(class_1294.field_18980, 60, 0, false, false, true));
            }
            if (headPiece.method_31574(WarfareItems.EMERALD_HELMET) && chestPiece.method_31574(WarfareItems.EMERALD_CHESTPLATE) || headPiece.method_31574(WarfareItems.EMERALD_HELMET) && legPiece.method_31574(WarfareItems.EMERALD_LEGGINGS) || headPiece.method_31574(WarfareItems.EMERALD_HELMET) && footPiece.method_31574(WarfareItems.EMERALD_BOOTS) || chestPiece.method_31574(WarfareItems.EMERALD_CHESTPLATE) && legPiece.method_31574(WarfareItems.EMERALD_LEGGINGS) || chestPiece.method_31574(WarfareItems.EMERALD_CHESTPLATE) && footPiece.method_31574(WarfareItems.EMERALD_BOOTS) || legPiece.method_31574(WarfareItems.EMERALD_LEGGINGS) && footPiece.method_31574(WarfareItems.EMERALD_BOOTS)) {
                player.method_6092(new class_1293(class_1294.field_18980, 60, 1, false, false, true));
            }
            if (chestPiece.method_31574(WarfareItems.EMERALD_CHESTPLATE) && legPiece.method_31574(WarfareItems.EMERALD_LEGGINGS) && footPiece.method_31574(WarfareItems.EMERALD_BOOTS) || headPiece.method_31574(WarfareItems.EMERALD_HELMET) && legPiece.method_31574(WarfareItems.EMERALD_LEGGINGS) && footPiece.method_31574(WarfareItems.EMERALD_BOOTS) || headPiece.method_31574(WarfareItems.EMERALD_HELMET) && chestPiece.method_31574(WarfareItems.EMERALD_CHESTPLATE) && footPiece.method_31574(WarfareItems.EMERALD_BOOTS) || headPiece.method_31574(WarfareItems.EMERALD_HELMET) && chestPiece.method_31574(WarfareItems.EMERALD_CHESTPLATE) && legPiece.method_31574(WarfareItems.EMERALD_LEGGINGS)) {
                player.method_6092(new class_1293(class_1294.field_18980, 60, 2, false, false, true));
            }
            if (headPiece.method_31574(WarfareItems.EMERALD_HELMET) && chestPiece.method_31574(WarfareItems.EMERALD_CHESTPLATE) && legPiece.method_31574(WarfareItems.EMERALD_LEGGINGS) && footPiece.method_31574(WarfareItems.EMERALD_BOOTS)) {
                player.method_6092(new class_1293(class_1294.field_18980, 60, 3, false, false, true));
            }
        }
        super.method_7888(stack, world, entity, slot, selected);
    }
}

