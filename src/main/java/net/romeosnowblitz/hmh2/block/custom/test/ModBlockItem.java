package net.romeosnowblitz.hmh2.block.custom.test;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class ModBlockItem extends BlockItem {

    public final String id;
    public ModBlockItem(Block block, Settings settings, String id) {
        super(block, settings);
        this.id = id;
    }

    @Override
    public String getTranslationKey() {
        StringBuilder result = new StringBuilder();
        boolean capitalize = true;
        for (char character : id.toCharArray()) {
            if (character == '_') {
                result.append(' ');
                capitalize = true;
            } else if (capitalize) {
                result.append(Character.toUpperCase(character));
                capitalize = false;
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
