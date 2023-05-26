package net.romeosnowblitz.hmh2.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Fertilizable;
import net.minecraft.entity.Entity;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class BlockOne extends ModSpreadableBlock implements Fertilizable {

    public BlockOne(Settings settings) {
        super(settings);
    }

    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state, boolean isClient) {
        return world.getBlockState(pos.up()).isAir();
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockPos blockPos = pos.up();
        BlockPos blockPos3 = pos.down();
        BlockState blockState = Blocks.GRASS.getDefaultState();
        Optional<RegistryEntry.Reference<PlacedFeature>> optional = world.getRegistryManager().get(RegistryKeys.PLACED_FEATURE).getEntry(VegetationPlacedFeatures.GRASS_BONEMEAL);

        label49:
        for(int i = 0; i < 128; ++i) {
            BlockPos blockPos2 = blockPos;
            BlockPos blockPos4 = blockPos3;

            for(int j = 0; j < i / 16; ++j) {
                blockPos2 = blockPos2.add(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
                if (!world.getBlockState(blockPos2.down()).isOf(this) || world.getBlockState(blockPos2).isFullCube(world, blockPos2)) {
                    continue label49;
                }
            }

            for(int j = 0; j < i / 16; ++j) {
                blockPos4 = blockPos4.add(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
                if (!world.getBlockState(blockPos4.down()).isOf(this) || world.getBlockState(blockPos4).isFullCube(world, blockPos4)) {
                    continue label49;
                }
            }

            BlockState blockState2 = world.getBlockState(blockPos2);
            if (blockState2.isOf(blockState.getBlock()) && random.nextInt(10) == 0) {
                ((Fertilizable)blockState.getBlock()).grow(world, random, blockPos2, blockState2);
            }

            BlockState blockState4 = world.getBlockState(blockPos4);
            if (blockState4.isOf(blockState.getBlock()) && random.nextInt(10) == 0) {
                ((Fertilizable)blockState.getBlock()).grow(world, random, blockPos4, blockState2);
            }

            if (blockState2.isAir()) {
                RegistryEntry registryEntry;
                if (random.nextInt(8) == 0) {
                    List<ConfiguredFeature<?, ?>> list = ((Biome)world.getBiome(blockPos2).value()).getGenerationSettings().getFlowerFeatures();
                    if (list.isEmpty()) {
                        continue;
                    }

                    registryEntry = ((RandomPatchFeatureConfig)((ConfiguredFeature)list.get(0)).config()).feature();
                } else {
                    if (!optional.isPresent()) {
                        continue;
                    }

                    registryEntry = (RegistryEntry)optional.get();
                }

                ((PlacedFeature)registryEntry.value()).generateUnregistered(world, world.getChunkManager().getChunkGenerator(), random, blockPos2);
            }

            if (blockState4.isOf(Blocks.STONE)) {
                RegistryEntry registryEntry;
                if (random.nextInt(8) == 0) {
                    List<ConfiguredFeature<?, ?>> list = ((Biome)world.getBiome(blockPos4).value()).getGenerationSettings().getFlowerFeatures();
                    if (list.isEmpty()) {
                        continue;
                    }

                    registryEntry = ((RandomPatchFeatureConfig)((ConfiguredFeature)list.get(0)).config()).feature();
                } else {
                    if (!optional.isPresent()) {
                        continue;
                    }

                    registryEntry = (RegistryEntry)optional.get();
                }

                ((PlacedFeature)registryEntry.value()).generateUnregistered(world, world.getChunkManager().getChunkGenerator(), random, blockPos4);
            }

        }

    }
    static java.util.Random random = new java.util.Random();
    static Block y = randomBlocks();

    public static Block randomBlocks() {
        int i = random.nextInt(8 + 1);
        if (i==1){y = Blocks.IRON_BLOCK;}
        if (i==2){y = Blocks.LAPIS_BLOCK;}
        if (i==3){y = Blocks.AMETHYST_BLOCK;}
        if (i==4){y = Blocks.BONE_BLOCK;}
        if (i==5){y = Blocks.OBSIDIAN;}
        if (i==6){y = Blocks.DIAMOND_BLOCK;}
        if (i==7){y = Blocks.EMERALD_BLOCK;}
        if (i==8){y = Blocks.GOLD_BLOCK;}
        return y;
    }

    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(!world.isClient){
            randomBlocks();
            BlockOne.setToRandom(state, world, pos);
        }
    }

    public static void setToRandom(BlockState state, World world, BlockPos pos) {
        world.setBlockState(pos, BlockOne.pushEntitiesUpBeforeBlockChange(state, y.getDefaultState(), world, pos));
    }

    public static BlockState pushEntitiesUpBeforeBlockChange(BlockState from, BlockState to, WorldAccess world, BlockPos pos) {
        VoxelShape voxelShape = VoxelShapes.combine(from.getCollisionShape(world, pos), to.getCollisionShape(world, pos), BooleanBiFunction.ONLY_SECOND).offset((double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
        if (voxelShape.isEmpty()) {
            return to;
        } else {
            List<Entity> list = world.getOtherEntities((Entity)null, voxelShape.getBoundingBox());
            Iterator var6 = list.iterator();

            while(var6.hasNext()) {
                Entity entity = (Entity)var6.next();
                double d = VoxelShapes.calculateMaxOffset(Direction.Axis.Y, entity.getBoundingBox().offset(0.0D, 1.0D, 0.0D), List.of(voxelShape), -1.0D);
                entity.requestTeleportOffset(0.0D, 1.0D + d, 0.0D);
            }

            return to;
        }
    }

}
