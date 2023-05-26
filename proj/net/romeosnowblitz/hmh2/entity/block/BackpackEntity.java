/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1263
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1703
 *  net.minecraft.class_1799
 *  net.minecraft.class_2338
 *  net.minecraft.class_2371
 *  net.minecraft.class_2561
 *  net.minecraft.class_2586
 *  net.minecraft.class_2680
 *  net.minecraft.class_3908
 *  net.minecraft.class_3913
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.entity.block;

import net.minecraft.class_1263;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2371;
import net.minecraft.class_2561;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_3908;
import net.minecraft.class_3913;
import net.romeosnowblitz.hmh2.entity.ModBlockEntities;
import net.romeosnowblitz.hmh2.item.inventory.ImplementedInventory;
import net.romeosnowblitz.hmh2.screen.BackpackScreenHandler;
import org.jetbrains.annotations.Nullable;

public class BackpackEntity
extends class_2586
implements class_3908,
ImplementedInventory {
    private final class_2371<class_1799> inventory = class_2371.method_10213((int)3, (Object)class_1799.field_8037);
    protected final class_3913 propertyDelegate = new class_3913(){

        public int method_17390(int index) {
            switch (index) {
                case 0: {
                    return BackpackEntity.this.progress;
                }
                case 1: {
                    return BackpackEntity.this.maxProgress;
                }
                case 2: {
                    return BackpackEntity.this.fuelTime;
                }
                case 3: {
                    return BackpackEntity.this.maxFuelTime;
                }
            }
            return 0;
        }

        public void method_17391(int index, int value) {
            switch (index) {
                case 0: {
                    BackpackEntity.this.progress = value;
                    break;
                }
                case 1: {
                    BackpackEntity.this.maxProgress = value;
                    break;
                }
                case 2: {
                    BackpackEntity.this.fuelTime = value;
                    break;
                }
                case 3: {
                    BackpackEntity.this.maxFuelTime = value;
                }
            }
        }

        public int method_17389() {
            return 4;
        }
    };
    private int progress = 0;
    private int maxProgress = 72;
    private int fuelTime = 0;
    private int maxFuelTime = 0;

    public BackpackEntity(class_2338 pos, class_2680 state) {
        super(ModBlockEntities.BACKPACK, pos, state);
    }

    @Override
    public class_2371<class_1799> getItems() {
        return this.inventory;
    }

    public class_2561 method_5476() {
        return class_2561.method_43470((String)"Backpack");
    }

    @Nullable
    public class_1703 createMenu(int syncId, class_1661 inv, class_1657 player) {
        return new BackpackScreenHandler(syncId, inv, (class_1263)this, this.propertyDelegate);
    }
}

