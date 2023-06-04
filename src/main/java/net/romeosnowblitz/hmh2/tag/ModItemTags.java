package net.romeosnowblitz.hmh2.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> FUEL_ONE_HUNDRED = of("fuel_one_hundred");
    public static final TagKey<Item> FUEL_THREE_HUNDRED = of("fuel_three_hundred");
    public static final TagKey<Item> FUEL_SIXTEEN_THOUSAND = of("fuel_sixteen_thousand");

    private ModItemTags() {
    }

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(id));
    }
}
