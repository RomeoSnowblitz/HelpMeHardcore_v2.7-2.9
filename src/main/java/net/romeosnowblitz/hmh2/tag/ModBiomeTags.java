package net.romeosnowblitz.hmh2.tag;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModBiomeTags {
    public static final TagKey<Biome> IS_BASALT_DELTAS = of("is_basalt_deltas");

    private ModBiomeTags() {
    }

    private static TagKey<Biome> of(String id) {
        return TagKey.of(RegistryKeys.BIOME, new Identifier(id));
    }
}