package net.romeosnowblitz.hmh2.worldgen;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.treedecorator.AttachedToLeavesTreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.romeosnowblitz.hmh2.mixin.TreeDecoratorTypeMixin;

import java.util.Iterator;
import java.util.List;

public class MushroomDecorator extends TreeDecorator {

    public static final Codec<MushroomDecorator> CODEC = RecordCodecBuilder.create((instance) -> instance.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(p -> p.probability),
            Codec.intRange(0, 16).fieldOf("treeHeight").forGetter(p -> p.treeHeight))
            .apply(instance, MushroomDecorator::new));

    private final float probability;
    private final int treeHeight;

    public MushroomDecorator(float f, int treeHeight){
        this.probability = f;
        this.treeHeight = treeHeight;
    }

    protected TreeDecoratorType<?> getType() {return ModTreeDecorator.SHROOMS;}

    @Override
    public void generate(Generator generator) {
        Random random = generator.getRandom();
        if (!(random.nextFloat() >= this.probability)) {
            List<BlockPos> list = generator.getLogPositions();
            int i = list.get(0).getY();
            list.stream().filter((pos) -> pos.getY() - i <= treeHeight).forEach((pos) -> {
                Iterator var3 = Direction.Type.HORIZONTAL.iterator();
                while(var3.hasNext()) {
                    Direction direction = (Direction)var3.next();
                    if (random.nextFloat() <= 0.25F) {
                        Direction direction2 = direction.getOpposite();
                        BlockPos blockPos = pos.add(direction2.getOffsetX(), 0, direction2.getOffsetZ());
                        if (generator.isAir(blockPos)) {
                            generator.replace(blockPos, Blocks.DIAMOND_BLOCK.getDefaultState());
                        }
                    }
                }
            });
        }
    }
}


