package net.romeosnowblitz.hmh2.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.romeosnowblitz.hmh2.block.ModBlocks;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(
                ModBlocks.HELLSTONE_BRICKS,
                ModBlocks.CARVED_MELON
        );
    }

}
