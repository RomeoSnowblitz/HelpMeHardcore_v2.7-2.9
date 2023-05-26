/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1922
 *  net.minecraft.class_2246
 *  net.minecraft.class_2302
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package net.romeosnowblitz.hmh2.mixin;

import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2302;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_2302.class})
public class CustomFarmlandMixin {
    @Inject(at={@At(value="HEAD")}, method={"canPlantOnTop"}, cancellable=true)
    public void canPlantOnTop(class_2680 floor, class_1922 world, class_2338 pos, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue((Object)(floor.method_27852(class_2246.field_10362) || floor.method_27852(ModBlocks.CRIMSON_FARMLAND) ? 1 : 0));
    }
}

