/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_442
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.romeosnowblitz.hmh2.mixin;

import net.minecraft.class_442;
import net.romeosnowblitz.hmh2.Hmh2;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_442.class})
public class ExampleMixin {
    @Inject(at={@At(value="HEAD")}, method={"init()V"})
    private void init(CallbackInfo info) {
        Hmh2.LOGGER.info("This line is printed by an example mod mixin!");
    }
}

