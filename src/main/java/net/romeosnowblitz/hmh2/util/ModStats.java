package net.romeosnowblitz.hmh2.util;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;


public class ModStats {

    public static final Identifier CLASS_ID = new Identifier(Hmh2.MOD_ID, "class_id");
    public static final Identifier NULL_SAVED_X = new Identifier(Hmh2.MOD_ID, "null_saved_x");
    public static final Identifier NULL_SAVED_Y = new Identifier(Hmh2.MOD_ID, "null_saved_y");
    public static final Identifier NULL_SAVED_Z = new Identifier(Hmh2.MOD_ID, "null_saved_z");

    public static void registerCustomStats() {
        register(CLASS_ID);
        register(NULL_SAVED_X);
        register(NULL_SAVED_Y);
        register(NULL_SAVED_Z);
    }

    private static void register(Identifier id) {
        Registry.register(Registries.CUSTOM_STAT, id, id);
        Stats.CUSTOM.getOrCreateStat(id, StatFormatter.DEFAULT);
    }
}
