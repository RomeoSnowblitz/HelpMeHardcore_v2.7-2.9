package net.romeosnowblitz.hmh2.item.custom.dyes;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.block.MapColor;
import net.minecraft.util.StringIdentifiable;
import org.jetbrains.annotations.Nullable;

public enum ModDyeColor implements StringIdentifiable {

    ROSE(0, "rose"),
    ULTRAMARINE(1, "ultramarine"),
    NEW_GREEN(2, "new_green"),
    SPRING_GREEN(3, "spring_green"),
    VIOLET(4, "violet");

    private static final ModDyeColor[] VALUES = new ModDyeColor[0];
    private final int id;
    private final String name;

    ModDyeColor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }


    public static ModDyeColor byId(int id) {
        if (id < 0 || id >= VALUES.length) {
            id = 0;
        }
        return VALUES[id];
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String asString() {
        return null;
    }
}
