package net.romeosnowblitz.hmh2.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModPaintings {
    public static final PaintingVariant IGLOO = registerPainting("igloo", new PaintingVariant(64, 32));
    public static final PaintingVariant HORSE = registerPainting("horse", new PaintingVariant(128, 64));
    public static final PaintingVariant SFIVE_ROMEOS_FARM = registerPainting("sfive_romeos_farm", new PaintingVariant(128, 64));
    public static final PaintingVariant SFIVE_CALS_AREA = registerPainting("sfive_cals_area", new PaintingVariant(128, 64));
    public static final PaintingVariant SFIVE_CALS_HOUSE = registerPainting("sfive_cals_house", new PaintingVariant(32, 32));
    public static final PaintingVariant DK_FACE = registerPainting("dk_face", new PaintingVariant(64, 64));
    public static final PaintingVariant ANIMATE = registerPainting("animate", new PaintingVariant(16, 16));
    public static final PaintingVariant SURPRISED_CAT = registerPainting("surprised_cat", new PaintingVariant(32, 32));
    public static final PaintingVariant VILLAGER_TEXTURE = registerPainting("villager_texture", new PaintingVariant(16, 16));
    public static final PaintingVariant SEASON_7_ICON = registerPainting("season_7_icon", new PaintingVariant(16, 16));
    public static final PaintingVariant ROMEO_MEME = registerPainting("romeo_meme", new PaintingVariant(32, 32));
    public static final PaintingVariant DERNEVS_IS_OP = registerPainting("dernevs_is_op", new PaintingVariant(32, 16));
    public static final PaintingVariant GAMBLING_CONVO = registerPainting("gambling_convo", new PaintingVariant(16, 16));
    public static final PaintingVariant FANCY_LLAMA = registerPainting("fancy_llama", new PaintingVariant(16, 32));
    public static final PaintingVariant CUED_FURRY = registerPainting( "cued_furry", new PaintingVariant(48, 16));
    public static final PaintingVariant MOB_VOTE = registerPainting("mob_vote", new PaintingVariant(16, 16));
    public static final PaintingVariant STEVE = registerPainting("steve", new PaintingVariant(16, 16));
    public static final PaintingVariant MAXWEll = registerPainting("maxwell", new PaintingVariant(32, 32));
    public static final PaintingVariant CAT_BURRITO = registerPainting("cat_burrito", new PaintingVariant(16, 16));
    public static final PaintingVariant SHRIMP_FRIED_RICE = registerPainting("shrimp_fried_rice", new PaintingVariant(32, 48));
    public static final PaintingVariant SLEEP_CYCLES = registerPainting("sleep_cycles", new PaintingVariant(48, 32));
    public static final PaintingVariant UWU_SPLASH = registerPainting("uwu_splash", new PaintingVariant(48, 16));
    public static final PaintingVariant HAVE_A_GLASS = registerPainting("have_a_glass", new PaintingVariant(48, 32));
    public static final PaintingVariant COME_HERE= registerPainting("come_here", new PaintingVariant(48, 32));
    public static final PaintingVariant JAPANESE_CURSIVE = registerPainting("japanese_cursive", new PaintingVariant(32, 48));
    public static final PaintingVariant QUIT_TOO_SOON = registerPainting("quit_too_soon", new PaintingVariant(48, 32));
    public static final PaintingVariant GOLIATH_STATUE = registerPainting("goliath_statue", new PaintingVariant(32, 32));
    public static final PaintingVariant OLD_JAPANESE_LETTER = registerPainting("old_japanese_letter", new PaintingVariant(16, 16));
    public static final PaintingVariant QUESTION_9 = registerPainting("question_9", new PaintingVariant(16, 16));
    public static final PaintingVariant SCREENSHOT_CHAT = registerPainting("screenshot_chat", new PaintingVariant(48, 32));
    public static final PaintingVariant BOY_MILK_OREOS = registerPainting("boy_milk_oreos", new PaintingVariant(16, 16));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(Hmh2.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        Hmh2.LOGGER.info("Registering Paintings for " + Hmh2.MOD_ID);
    }
}
