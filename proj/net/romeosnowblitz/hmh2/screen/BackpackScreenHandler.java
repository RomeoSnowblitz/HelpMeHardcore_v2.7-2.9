/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1263
 *  net.minecraft.class_1277
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1703
 *  net.minecraft.class_1735
 *  net.minecraft.class_1799
 *  net.minecraft.class_3913
 *  net.minecraft.class_3919
 */
package net.romeosnowblitz.hmh2.screen;

import net.minecraft.class_1263;
import net.minecraft.class_1277;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_3913;
import net.minecraft.class_3919;
import net.romeosnowblitz.hmh2.screen.ModScreenHandlers;

public class BackpackScreenHandler
extends class_1703 {
    private final class_1263 inventory;
    private final class_3913 propertyDelegate;

    public BackpackScreenHandler(int syncId, class_1661 playerInventory) {
        this(syncId, playerInventory, (class_1263)new class_1277(3), (class_3913)new class_3919(4));
    }

    public BackpackScreenHandler(int syncId, class_1661 playerInventory, class_1263 inventory, class_3913 delegate) {
        super(ModScreenHandlers.BACKPACK_SCREEN_HANDLER, syncId);
        BackpackScreenHandler.method_17359((class_1263)inventory, (int)3);
        this.inventory = inventory;
        inventory.method_5435(playerInventory.field_7546);
        this.propertyDelegate = delegate;
        this.method_7621(new class_1735(inventory, 0, 0, 0));
        this.method_7621(new class_1735(inventory, 1, 64, 64));
        this.method_7621(new class_1735(inventory, 2, 32, 32));
        this.addPlayerInventory(playerInventory);
        this.addPlayerHotbar(playerInventory);
        this.method_17360(delegate);
    }

    public boolean method_7597(class_1657 player) {
        return this.inventory.method_5443(player);
    }

    public class_1799 method_7601(class_1657 player, int invSlot) {
        class_1799 newStack = class_1799.field_8037;
        class_1735 slot = (class_1735)this.field_7761.get(invSlot);
        if (slot != null && slot.method_7681()) {
            class_1799 originalStack = slot.method_7677();
            newStack = originalStack.method_7972();
            if (invSlot < this.inventory.method_5439() ? !this.method_7616(originalStack, this.inventory.method_5439(), this.field_7761.size(), true) : !this.method_7616(originalStack, 0, this.inventory.method_5439(), false)) {
                return class_1799.field_8037;
            }
            if (originalStack.method_7960()) {
                slot.method_48931(class_1799.field_8037);
            } else {
                slot.method_7668();
            }
        }
        return newStack;
    }

    private void addPlayerInventory(class_1661 playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.method_7621(new class_1735((class_1263)playerInventory, l + i * 9 + 9, 8 + l * 18, 86 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(class_1661 playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.method_7621(new class_1735((class_1263)playerInventory, i, 8 + i * 18, 182));
        }
    }
}

