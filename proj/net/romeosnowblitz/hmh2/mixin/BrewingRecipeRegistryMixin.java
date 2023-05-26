/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1792
 *  net.minecraft.class_1842
 *  net.minecraft.class_1845
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package net.romeosnowblitz.hmh2.mixin;

import net.minecraft.class_1792;
import net.minecraft.class_1842;
import net.minecraft.class_1845;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_1845.class})
public interface BrewingRecipeRegistryMixin {
    @Invoker(value="registerPotionRecipe")
    public static void invokeRegisterPotionRecipe(class_1842 input, class_1792 item, class_1842 output) {
        throw new AssertionError();
    }
}

