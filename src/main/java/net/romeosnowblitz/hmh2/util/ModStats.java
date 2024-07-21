package net.romeosnowblitz.hmh2.util;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;


public class ModStats {

    public static final Identifier BLESSED = new Identifier(Hmh2.MOD_ID, "blessed");
    public static final Identifier CLASS_ID = new Identifier(Hmh2.MOD_ID, "class_id");
    public static final Identifier HEALTH_ADJUSTMENT = new Identifier(Hmh2.MOD_ID, "health_adjustment");
    public static final Identifier NUMBER_OF_BLESSINGS = new Identifier(Hmh2.MOD_ID, "number_of_blessings");
    public static final Identifier REVIVAL_COST = new Identifier(Hmh2.MOD_ID, "revival_cost");
    public static final Identifier REVIVAL_DISCOUNT = new Identifier(Hmh2.MOD_ID, "revival_discount");
    public static final Identifier REVIVAL_TOTAL = new Identifier(Hmh2.MOD_ID, "revival_total");
    public static final Identifier SEASON_SCORE = new Identifier(Hmh2.MOD_ID, "season_score");
    public static final Identifier NULL_SAVED_OVERWORLD_X = new Identifier(Hmh2.MOD_ID, "null_saved_overworld_x");
    public static final Identifier NULL_SAVED_OVERWORLD_Y = new Identifier(Hmh2.MOD_ID, "null_saved_overworld_y");
    public static final Identifier NULL_SAVED_OVERWORLD_Z = new Identifier(Hmh2.MOD_ID, "null_saved_overworld_z");
    public static final Identifier NULL_SAVED_NETHER_X = new Identifier(Hmh2.MOD_ID, "null_saved_nether_x");
    public static final Identifier NULL_SAVED_NETHER_Y = new Identifier(Hmh2.MOD_ID, "null_saved_nether_y");
    public static final Identifier NULL_SAVED_NETHER_Z = new Identifier(Hmh2.MOD_ID, "null_saved_nether_z");
    public static final Identifier NULL_SAVED_END_X = new Identifier(Hmh2.MOD_ID, "null_saved_end_x");
    public static final Identifier NULL_SAVED_END_Y = new Identifier(Hmh2.MOD_ID, "null_saved_end_y");
    public static final Identifier NULL_SAVED_END_Z = new Identifier(Hmh2.MOD_ID, "null_saved_end_z");

    public static void registerCustomStats() {
        register(BLESSED);
        register(CLASS_ID);
        register(HEALTH_ADJUSTMENT);
        register(NUMBER_OF_BLESSINGS);
        register(REVIVAL_COST);
        register(REVIVAL_DISCOUNT);
        register(REVIVAL_TOTAL);
        register(SEASON_SCORE);
        register(NULL_SAVED_OVERWORLD_X);
        register(NULL_SAVED_OVERWORLD_Y);
        register(NULL_SAVED_OVERWORLD_Z);
        register(NULL_SAVED_NETHER_X);
        register(NULL_SAVED_NETHER_Y);
        register(NULL_SAVED_NETHER_Z);
        register(NULL_SAVED_END_X);
        register(NULL_SAVED_END_Y);
        register(NULL_SAVED_END_Z);
    }

    private static void register(Identifier id) {
        Registry.register(Registries.CUSTOM_STAT, id, id);
        Stats.CUSTOM.getOrCreateStat(id, StatFormatter.DEFAULT);
    }
}
