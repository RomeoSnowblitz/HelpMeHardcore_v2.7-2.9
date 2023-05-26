package net.romeosnowblitz.hmh2.tag;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.structure.Structure;

public class ModStructureTags {
    public static final TagKey<Structure> FORTRESS = ModStructureTags.of("fortress");
    public static final TagKey<Structure> NETHER_CORE = ModStructureTags.of("nether_core");

    private static TagKey<Structure> of(String id) {
        return TagKey.of(RegistryKeys.STRUCTURE, new Identifier(id));
    }
}
