package net.romeosnowblitz.hmh2.worldgen;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.mixin.FeatureMixin;
import net.romeosnowblitz.hmh2.mixin.TreeDecoratorTypeMixin;

public class ModFeatures{


    public static Feature<?> TEST = FeatureMixin.callRegister("test", new TestFeature(TestFC.CODEC));

    public static void register() {

    }




}