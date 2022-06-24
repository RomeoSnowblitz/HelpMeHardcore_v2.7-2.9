package net.romeosnowblitz.hmh2.tag;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.server.BlockTagProvider;
import net.minecraft.data.server.ItemTagProvider;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/*

    This was made for a Custom Fuel Type,
    I ended up finding an easier solution,
    But I still wanted to keep this file :)

 */

public class ModItemTags extends ItemTagProvider {
    public ModItemTags(DataGenerator root, BlockTagProvider blockTagsProvider) {
        super(root, blockTagsProvider);
    }

    public static final TagKey<Item> COOLANTS = ModItemTags.register("coolants");

    private static TagKey<Item> register(String id) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier(id));
    }
}
