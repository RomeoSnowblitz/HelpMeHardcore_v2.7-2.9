package net.romeosnowblitz.hmh2.item.custom.test;

import net.minecraft.item.Item;

public class ModItem extends Item {


    Item item;

    public ModItem(Item item, Settings settings) {
        super(settings);
        this.item = item;
    }

}
