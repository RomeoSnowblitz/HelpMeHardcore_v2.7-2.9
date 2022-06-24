package net.romeosnowblitz.hmh2.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModScreenHandlers {
    public static ScreenHandlerType<BackpackScreenHandler> BACKPACK_SCREEN_HANDLER;
    public static ScreenHandlerType<CheesePressScreenHandler> CHEESE_PRESS_SCREEN_HANDLER;
    public static ScreenHandlerType<FreezerScreenHandler> FREEZER_SCREEN_HANDLER;
    public static ScreenHandlerType<IceCreamMakerScreenHandler> ICE_CREAM_MAKER_SCREEN_HANDLER;

    public static void registerAllScreenHandlers(){
        BACKPACK_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Hmh2.MOD_ID, "backpack"), BackpackScreenHandler::new);
        CHEESE_PRESS_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Hmh2.MOD_ID, "cheese_press"), CheesePressScreenHandler::new);
        FREEZER_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Hmh2.MOD_ID, "freezer"), FreezerScreenHandler::new);
        ICE_CREAM_MAKER_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Hmh2.MOD_ID, "ice_cream_maker"), IceCreamMakerScreenHandler::new);
    }

}
