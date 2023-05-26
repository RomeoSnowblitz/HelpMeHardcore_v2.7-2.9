/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  net.minecraft.class_3542
 *  net.minecraft.class_3620
 *  org.jetbrains.annotations.Nullable
 */
package net.romeosnowblitz.hmh2.item.custom.dyes;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.class_3542;
import net.minecraft.class_3620;
import org.jetbrains.annotations.Nullable;

public enum ModDyeColor implements class_3542
{
    ROSE(0, "rose", 0xF9FFFE, class_3620.field_16020, 0xF0F0F0, 0xFFFFFF),
    ULTRAMARINE(1, "ultramarine", 16351261, class_3620.field_16026, 15435844, 16738335),
    NEW_GREEN(2, "new_green", 13061821, class_3620.field_15997, 12801229, 0xFF00FF),
    SPRING_GREEN(3, "spring_green", 3847130, class_3620.field_15995, 6719955, 10141901),
    VIOLET(4, "violet", 16701501, class_3620.field_16014, 14602026, 0xFFFF00);

    private static final ModDyeColor[] VALUES;
    private static final Int2ObjectOpenHashMap<ModDyeColor> BY_FIREWORK_COLOR;
    private final int id;
    private final String name;
    private final class_3620 mapColor;
    private final float[] colorComponents;
    private final int fireworkColor;
    private final int signColor;

    private ModDyeColor(int id, String name, int color, class_3620 mapColor, int fireworkColor, int signColor) {
        this.id = id;
        this.name = name;
        this.mapColor = mapColor;
        this.signColor = signColor;
        int j = (color & 0xFF0000) >> 16;
        int k = (color & 0xFF00) >> 8;
        int l = (color & 0xFF) >> 0;
        this.colorComponents = new float[]{(float)j / 255.0f, (float)k / 255.0f, (float)l / 255.0f};
        this.fireworkColor = fireworkColor;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float[] getColorComponents() {
        return this.colorComponents;
    }

    public class_3620 getMapColor() {
        return this.mapColor;
    }

    public int getFireworkColor() {
        return this.fireworkColor;
    }

    public int getSignColor() {
        return this.signColor;
    }

    public static ModDyeColor byId(int id) {
        if (id < 0 || id >= VALUES.length) {
            id = 0;
        }
        return VALUES[id];
    }

    public static ModDyeColor byName(String name, ModDyeColor defaultColor) {
        for (ModDyeColor modDyeColor : ModDyeColor.values()) {
            if (!modDyeColor.name.equals(name)) continue;
            return modDyeColor;
        }
        return defaultColor;
    }

    @Nullable
    public static ModDyeColor byFireworkColor(int color) {
        return (ModDyeColor)((Object)BY_FIREWORK_COLOR.get(color));
    }

    public String toString() {
        return this.name;
    }

    public String method_15434() {
        return null;
    }

    static {
        VALUES = new ModDyeColor[0];
        BY_FIREWORK_COLOR = new Int2ObjectOpenHashMap();
    }
}

