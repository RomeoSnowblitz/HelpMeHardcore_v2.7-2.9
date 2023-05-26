/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_1799
 *  net.minecraft.class_1922
 *  net.minecraft.class_1937
 *  net.minecraft.class_2237
 *  net.minecraft.class_2338
 *  net.minecraft.class_2586
 *  net.minecraft.class_2591
 *  net.minecraft.class_2680
 *  net.minecraft.class_4970$class_2251
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.block.custom.block;

import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2237;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2591;
import net.minecraft.class_2680;
import net.minecraft.class_4970;
import net.romeosnowblitz.hmh2.block.custom.block.ModBannerBlockEntity;
import net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor;
import org.jetbrains.annotations.Nullable;

public class ModAbstractBannerBlock
extends class_2237 {
    private final ModDyeColor color;

    protected ModAbstractBannerBlock(ModDyeColor color, class_4970.class_2251 settings) {
        super(settings);
        this.color = color;
    }

    public boolean method_9538() {
        return true;
    }

    public class_2586 method_10123(class_2338 pos, class_2680 state) {
        return new ModBannerBlockEntity(pos, state, this.color);
    }

    public void method_9567(class_1937 world, class_2338 pos, class_2680 state, @Nullable class_1309 placer, class_1799 itemStack) {
        if (world.field_9236) {
            world.method_35230(pos, class_2591.field_11905).ifPresent(blockEntity -> blockEntity.method_38992(itemStack));
        } else if (itemStack.method_7938()) {
            world.method_35230(pos, class_2591.field_11905).ifPresent(blockEntity -> blockEntity.method_16842(itemStack.method_7964()));
        }
    }

    public class_1799 method_9574(class_1922 world, class_2338 pos, class_2680 state) {
        class_2586 blockEntity = world.method_8321(pos);
        if (blockEntity instanceof ModBannerBlockEntity) {
            return ((ModBannerBlockEntity)blockEntity).getPickStack();
        }
        return super.method_9574(world, pos, state);
    }

    public ModDyeColor getColor() {
        return this.color;
    }
}

