package net.romeosnowblitz.hmh2.worldgen;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryCodecs;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.util.math.Direction;
import net.minecraft.world.gen.feature.FeatureConfig;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class TestFC implements FeatureConfig {

    public static final Codec<TestFC> CODEC = RecordCodecBuilder.create((instance) -> instance.group(
            Codec.intRange(1, 64).fieldOf("xz_spread").orElse(10).forGetter((config) -> config.xzSpread),
            Codec.intRange(1, 64).fieldOf("y_spread").orElse(10).forGetter((config) -> config.ySpread),
            Codec.intRange(1, 64).fieldOf("tries").orElse(12).forGetter((config) -> config.tries),
            Codec.BOOL.fieldOf("can_place_on_floor").orElse(false).forGetter((config) -> config.placeOnFloor),
            Codec.BOOL.fieldOf("can_place_on_ceiling").orElse(false).forGetter((config) -> config.placeOnCeiling),
            Codec.BOOL.fieldOf("can_place_on_wall").orElse(false).forGetter((config) -> config.placeOnWalls),
            RegistryCodecs.entryList(RegistryKeys.BLOCK).fieldOf("can_be_placed_on").forGetter((config) -> config.canPlaceOn),
            Codecs.nonEmptyList(Registries.BLOCK.getCodec().listOf()).fieldOf("blocks").forGetter((config) -> config.blocks)
    ).apply(instance, TestFC::new));

    public final int xzSpread;
    public final int ySpread;
    public final int tries;
    public final boolean placeOnFloor;
    public final boolean placeOnCeiling;
    public final boolean placeOnWalls;
    public final RegistryEntryList<Block> canPlaceOn;
    public final List<Direction> directions;
    public final List<Block> blocks;

    public TestFC(Integer xzSpread, Integer ySpread, Integer tries, Boolean placeOnFloor, Boolean placeOnCeiling, Boolean placeOnWalls, RegistryEntryList<Block> canPlaceOn, List<Block> blocks) {
        this.xzSpread = xzSpread;
        this.ySpread = ySpread;
        this.tries = tries;
        this.placeOnFloor = placeOnFloor;
        this.placeOnCeiling = placeOnCeiling;
        this.placeOnWalls = placeOnWalls;
        this.canPlaceOn = canPlaceOn;
        this.blocks = blocks;
        List<Direction> list = Lists.newArrayList();
        if (placeOnCeiling) {
            list.add(Direction.UP);
        }
        if (placeOnFloor) {
            list.add(Direction.DOWN);
        }
        if (placeOnWalls) {
            Objects.requireNonNull(list);
            Direction.Type.HORIZONTAL.forEach(list::add);
        }
        this.directions = Collections.unmodifiableList(list);
    }

}
