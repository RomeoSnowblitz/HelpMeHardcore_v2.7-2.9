package net.romeosnowblitz.hmh2.worldgen;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CocoaBlock;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;
import net.romeosnowblitz.hmh2.block.ModBlocks;

import java.util.Iterator;
import java.util.List;

public class TestFeature extends Feature<TestFC> {

    public TestFeature(Codec<TestFC> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean generate(FeatureContext<TestFC> context) {
        StructureWorldAccess structureWorldAccess = context.getWorld();
        BlockPos blockPos = context.getOrigin();
        Random random = context.getRandom();
        TestFC randomBudsFeaturesConfig = context.getConfig();

        int placedCount = 0;
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        int j = randomBudsFeaturesConfig.xzSpread + 1;
        int k = randomBudsFeaturesConfig.ySpread + 1;

        for (int l = 0; l < randomBudsFeaturesConfig.tries; ++l) {
            mutable.set(blockPos, random.nextInt(j) - random.nextInt(j), random.nextInt(k) - random.nextInt(k), random.nextInt(j) - random.nextInt(j));
            List<Direction> directions = shuffleDirections(randomBudsFeaturesConfig, random);
            BlockState state = structureWorldAccess.getBlockState(mutable);
            boolean waterlogged = false;
            if (state.isOf(Blocks.WATER)) {
                waterlogged = true;
            } else if (!state.isAir()) {
                continue;
            }
            if (generate(structureWorldAccess, mutable, randomBudsFeaturesConfig, random, directions, waterlogged)) {
                ++placedCount;
            }
        }

        return placedCount > 0;
    }

    public static boolean generate(StructureWorldAccess world, BlockPos pos, TestFC config, Random random, List<Direction> directions, boolean waterlogged) {
        BlockPos.Mutable mutablePos = pos.mutableCopy();

        Iterator<Direction> directionIterator = directions.iterator();
        Direction direction;
        BlockState blockState;
        do {
            if (!directionIterator.hasNext()) {
                return false;
            }
            direction = directionIterator.next();
            blockState = world.getBlockState(mutablePos.set(pos, direction));
        } while (!blockState.isIn(config.canPlaceOn));

        BlockState stateToPlace = config.blocks.get(random.nextInt(config.blocks.size())).getDefaultState().with(Properties.FACING, direction.getOpposite()).with(Properties.WATERLOGGED, waterlogged);
        if (stateToPlace.canPlaceAt(world, pos)) {
            world.setBlockState(pos, stateToPlace, 3);
            world.getChunk(pos).markBlockForPostProcessing(pos);
            return true;
        }
        return false;
    }

    public static List<Direction> shuffleDirections(TestFC config, Random random) {
        return Util.copyShuffled(config.directions.stream(), random);
    }

}