package net.romeosnowblitz.hmh2.world.gen;

public class ModWorldGen {
    public static void generateModWorldGen() {
        ModFlowerGeneration.generateFlowers();
        ModOreGeneration.generateOres();
        ModTreeGeneration.generateTrees();

        ModEntitySpawn.addEntitySpawn();
    }
}
