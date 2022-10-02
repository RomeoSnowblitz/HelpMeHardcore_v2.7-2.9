package net.romeosnowblitz.hmh2.tag;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.server.BlockTagProvider;
import net.minecraft.data.server.ItemTagProvider;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItemTags extends ItemTagProvider {
    public ModItemTags(DataGenerator root, BlockTagProvider blockTagsProvider) {
        super(root, blockTagsProvider);
    }

    public static final TagKey<Item> FUEL_ONE_HUNDRED = ModItemTags.register("fuel_one_hundred");
    public static final TagKey<Item> FUEL_THREE_HUNDRED = ModItemTags.register("fuel_three_hundred");
    public static final TagKey<Item> FUEL_SIXTEEN_THOUSAND = ModItemTags.register("fuel_sixteen_thousand");

    private static TagKey<Item> register(String id) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier(id));
    }
}
