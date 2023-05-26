/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2508
 *  net.minecraft.class_2551
 *  net.minecraft.class_2591
 *  net.minecraft.class_2680
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package net.romeosnowblitz.hmh2.mixin;

import net.minecraft.class_2508;
import net.minecraft.class_2551;
import net.minecraft.class_2591;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_2591.class})
public class BlockEntityTypeMixin {
    @Inject(method={"supports"}, at={@At(value="HEAD")}, cancellable=true)
    private void supports(class_2680 state, CallbackInfoReturnable<Boolean> info) {
        if (class_2591.field_11911.equals(this) && (state.method_26204() instanceof class_2508 || state.method_26204() instanceof class_2551)) {
            info.setReturnValue((Object)true);
        }
    }
}

