/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1535
 *  net.minecraft.class_2378
 *  net.minecraft.class_2960
 *  net.minecraft.class_7923
 */
package net.romeosnowblitz.hmh2.painting;

import net.minecraft.class_1535;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_7923;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModPaintings {
    public static final class_1535 IGLOO = ModPaintings.registerPainting("igloo", new class_1535(64, 32));
    public static final class_1535 HORSE = ModPaintings.registerPainting("horse", new class_1535(128, 64));
    public static final class_1535 SFIVE_ROMEOS_FARM = ModPaintings.registerPainting("sfive_romeos_farm", new class_1535(128, 64));
    public static final class_1535 SFIVE_CALS_AREA = ModPaintings.registerPainting("sfive_cals_area", new class_1535(128, 64));
    public static final class_1535 SFIVE_CALS_HOUSE = ModPaintings.registerPainting("sfive_cals_house", new class_1535(32, 32));
    public static final class_1535 DK_FACE = ModPaintings.registerPainting("dk_face", new class_1535(64, 64));
    public static final class_1535 ANIMATE = ModPaintings.registerPainting("animate", new class_1535(16, 16));

    private static class_1535 registerPainting(String name, class_1535 paintingVariant) {
        return (class_1535)class_2378.method_10230((class_2378)class_7923.field_41182, (class_2960)new class_2960("hmh2", name), (Object)paintingVariant);
    }

    public static void registerPaintings() {
        Hmh2.LOGGER.info("Registering Paintings for hmh2");
    }
}

