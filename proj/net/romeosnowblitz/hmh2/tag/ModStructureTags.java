/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  net.minecraft.class_3195
 *  net.minecraft.class_5321
 *  net.minecraft.class_6862
 *  net.minecraft.class_7924
 */
package net.romeosnowblitz.hmh2.tag;

import net.minecraft.class_2960;
import net.minecraft.class_3195;
import net.minecraft.class_5321;
import net.minecraft.class_6862;
import net.minecraft.class_7924;

public class ModStructureTags {
    public static final class_6862<class_3195> FORTRESS = ModStructureTags.of("fortress");
    public static final class_6862<class_3195> NETHER_CORE = ModStructureTags.of("nether_core");

    private static class_6862<class_3195> of(String id) {
        return class_6862.method_40092((class_5321)class_7924.field_41246, (class_2960)new class_2960(id));
    }
}

