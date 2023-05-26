/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2378
 *  net.minecraft.class_2498
 *  net.minecraft.class_2960
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_7923
 */
package net.romeosnowblitz.hmh2.sounds;

import net.minecraft.class_2378;
import net.minecraft.class_2498;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_7923;

public class ModSounds
extends class_3417 {
    public static class_3414 ORE_SCREAM_BREAK = ModSounds.register("ore_scream_break");
    public static class_3414 ORE_SCREAM_FALL = ModSounds.register("ore_scream_fall");
    public static class_3414 ORE_SCREAM_HIT = ModSounds.register("ore_scream_hit");
    public static class_3414 VAPOR_MOAN = ModSounds.register("vapor_moan");
    public static class_3414 CAL_SCREAM = ModSounds.register("cal_scream");
    public static final class_2498 ORE_SCREAM_SOUNDS = new class_2498(1.0f, 2.0f, CAL_SCREAM, VAPOR_MOAN, VAPOR_MOAN, class_3417.field_15139, class_3417.field_29814);

    private static class_3414 register(String name) {
        return ModSounds.register(new class_2960("hmh2", name));
    }

    private static class_3414 register(class_2960 id) {
        return ModSounds.register(id, id);
    }

    private static class_3414 register(class_2960 id, class_2960 soundId) {
        return (class_3414)class_2378.method_10230((class_2378)class_7923.field_41172, (class_2960)id, (Object)class_3414.method_47908((class_2960)soundId));
    }

    public static void registerSounds() {
        System.out.println("Registering ModSounds for hmh2");
    }
}

