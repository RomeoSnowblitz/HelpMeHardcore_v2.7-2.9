/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3542
 */
package net.romeosnowblitz.hmh2.block.custom.piston;

import net.minecraft.class_3542;

public enum ModPistonType implements class_3542
{
    DEFAULT("normal"),
    GLUEY("gluey"),
    STICKY("sticky");

    private final String name;

    private ModPistonType(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String method_15434() {
        return this.name;
    }
}

