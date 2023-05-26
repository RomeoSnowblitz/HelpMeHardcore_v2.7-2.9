package net.romeosnowblitz.hmh2.item.custom;

import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.structure.Structure;

public interface ModStructureTags {
    public static final TagKey<Structure> FORTRESS = ModStructureTags.of("fortress");


    private static TagKey<Structure> of(String id) {
        return TagKey.of(Registry.STRUCTURE_KEY, new Identifier(id));
    }
}
