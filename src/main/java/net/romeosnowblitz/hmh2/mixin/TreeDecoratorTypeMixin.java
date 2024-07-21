package net.romeosnowblitz.hmh2.mixin;

import com.mojang.serialization.Codec;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(TreeDecoratorType.class)
public interface TreeDecoratorTypeMixin {

    @Invoker("register")
    static <P extends TreeDecorator> TreeDecoratorType<P> callRegister(String id, Codec<P> codec) {
        throw new IllegalStateException();
    }

}
