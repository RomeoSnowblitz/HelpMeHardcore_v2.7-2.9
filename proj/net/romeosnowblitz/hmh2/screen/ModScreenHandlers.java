/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry
 *  net.minecraft.class_2960
 *  net.minecraft.class_3917
 */
package net.romeosnowblitz.hmh2.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.class_2960;
import net.minecraft.class_3917;
import net.romeosnowblitz.hmh2.screen.BackpackScreenHandler;

public class ModScreenHandlers {
    public static class_3917<BackpackScreenHandler> BACKPACK_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        BACKPACK_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple((class_2960)new class_2960("hmh2", "backpack"), BackpackScreenHandler::new);
    }
}

