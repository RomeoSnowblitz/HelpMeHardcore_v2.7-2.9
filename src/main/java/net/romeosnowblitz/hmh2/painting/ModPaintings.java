package net.romeosnowblitz.hmh2.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModPaintings {
    public static final PaintingVariant IGLOO = registerPainting("igloo", new PaintingVariant(64, 32));
    public static final PaintingVariant HORSE = registerPainting("horse", new PaintingVariant(128, 64));
    public static final PaintingVariant SFIVE_ROMEOS_FARM = registerPainting("sfive_romeos_farm", new PaintingVariant(128, 64));
    public static final PaintingVariant SFIVE_CALS_AREA = registerPainting("sfive_cals_area", new PaintingVariant(128, 64));
    public static final PaintingVariant SFIVE_CALS_HOUSE = registerPainting("sfive_cals_house", new PaintingVariant(32, 32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(Hmh2.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        Hmh2.LOGGER.info("Registering Paintings for " + Hmh2.MOD_ID);
    }
}
