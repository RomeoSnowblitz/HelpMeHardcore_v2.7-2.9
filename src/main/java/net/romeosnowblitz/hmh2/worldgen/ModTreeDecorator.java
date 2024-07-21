package net.romeosnowblitz.hmh2.worldgen;

import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.mixin.TreeDecoratorTypeMixin;

public class ModTreeDecorator {

    public static final TreeDecoratorType<?> SHROOMS = TreeDecoratorTypeMixin.callRegister("shrooms", MushroomDecorator.CODEC);

    public static void register() {

    }

}
