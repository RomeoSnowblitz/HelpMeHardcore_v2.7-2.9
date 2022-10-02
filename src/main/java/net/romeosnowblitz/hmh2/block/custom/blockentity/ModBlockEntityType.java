package net.romeosnowblitz.hmh2.block.custom.blockentity;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.*;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.romeosnowblitz.hmh2.block.ModBlocks;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import java.util.Set;

public class ModBlockEntityType<T extends ModBlockEntity> {
    private static final Logger LOGGER = LogUtils.getLogger();
    /*
    public static final ModBlockEntityType<ChestBlockEntity> CHEST = ModBlockEntityType.create("chest", BlockEntityType.Builder.create(ChestBlockEntity::new, Blocks.CHEST));
    public static final ModBlockEntityType<SignBlockEntity> SIGN = ModBlockEntityType.create("sign", BlockEntityType.Builder.create(SignBlockEntity::new, Blocks.OAK_SIGN, Blocks.SPRUCE_SIGN, Blocks.BIRCH_SIGN, Blocks.ACACIA_SIGN, Blocks.JUNGLE_SIGN, Blocks.DARK_OAK_SIGN, Blocks.OAK_WALL_SIGN, Blocks.SPRUCE_WALL_SIGN, Blocks.BIRCH_WALL_SIGN, Blocks.ACACIA_WALL_SIGN, Blocks.JUNGLE_WALL_SIGN, Blocks.DARK_OAK_WALL_SIGN, Blocks.CRIMSON_SIGN, Blocks.CRIMSON_WALL_SIGN, Blocks.WARPED_SIGN, Blocks.WARPED_WALL_SIGN, Blocks.MANGROVE_SIGN, Blocks.MANGROVE_WALL_SIGN));
    public static final ModBlockEntityType<EndPortalBlockEntity> END_PORTAL = ModBlockEntityType.create("end_portal", BlockEntityType.Builder.create(EndPortalBlockEntity::new, Blocks.END_PORTAL));
    public static final ModBlockEntityType<BeaconBlockEntity> BEACON = ModBlockEntityType.create("beacon", BlockEntityType.Builder.create(BeaconBlockEntity::new, Blocks.BEACON));
    public static final ModBlockEntityType<SkullBlockEntity> SKULL = ModBlockEntityType.create("skull", BlockEntityType.Builder.create(SkullBlockEntity::new, Blocks.SKELETON_SKULL, Blocks.SKELETON_WALL_SKULL, Blocks.CREEPER_HEAD, Blocks.CREEPER_WALL_HEAD, Blocks.DRAGON_HEAD, Blocks.DRAGON_WALL_HEAD, Blocks.ZOMBIE_HEAD, Blocks.ZOMBIE_WALL_HEAD, Blocks.WITHER_SKELETON_SKULL, Blocks.WITHER_SKELETON_WALL_SKULL, Blocks.PLAYER_HEAD, Blocks.PLAYER_WALL_HEAD));
    public static final ModBlockEntityType<BannerBlockEntity> BANNER = ModBlockEntityType.create("banner", BlockEntityType.Builder.create(BannerBlockEntity::new, Blocks.WHITE_BANNER, Blocks.ORANGE_BANNER, Blocks.MAGENTA_BANNER, Blocks.LIGHT_BLUE_BANNER, Blocks.YELLOW_BANNER, Blocks.LIME_BANNER, Blocks.PINK_BANNER, Blocks.GRAY_BANNER, Blocks.LIGHT_GRAY_BANNER, Blocks.CYAN_BANNER, Blocks.PURPLE_BANNER, Blocks.BLUE_BANNER, Blocks.BROWN_BANNER, Blocks.GREEN_BANNER, Blocks.RED_BANNER, Blocks.BLACK_BANNER, Blocks.WHITE_WALL_BANNER, Blocks.ORANGE_WALL_BANNER, Blocks.MAGENTA_WALL_BANNER, Blocks.LIGHT_BLUE_WALL_BANNER, Blocks.YELLOW_WALL_BANNER, Blocks.LIME_WALL_BANNER, Blocks.PINK_WALL_BANNER, Blocks.GRAY_WALL_BANNER, Blocks.LIGHT_GRAY_WALL_BANNER, Blocks.CYAN_WALL_BANNER, Blocks.PURPLE_WALL_BANNER, Blocks.BLUE_WALL_BANNER, Blocks.BROWN_WALL_BANNER, Blocks.GREEN_WALL_BANNER, Blocks.RED_WALL_BANNER, Blocks.BLACK_WALL_BANNER));
    public static final ModBlockEntityType<ModShulkerBoxEntity> SHULKER_BOX = ModBlockEntityType.create("shulker_box", ModBlockEntityType.Builder.create(ModShulkerBoxEntity::new, ModBlocks.ULTRAMARINE_SHULKER_BOX, ModBlocks.ROSE_SHULKER_BOX, ModBlocks.VIOLET_SHULKER_BOX, ModBlocks.NEW_GREEN_SHULKER_BOX, ModBlocks.SPRING_GREEN_SHULKER_BOX));
    public static final ModBlockEntityType<BedBlockEntity> BED = ModBlockEntityType.create("bed", BlockEntityType.Builder.create(BedBlockEntity::new, Blocks.RED_BED, Blocks.BLACK_BED, Blocks.BLUE_BED, Blocks.BROWN_BED, Blocks.CYAN_BED, Blocks.GRAY_BED, Blocks.GREEN_BED, Blocks.LIGHT_BLUE_BED, Blocks.LIGHT_GRAY_BED, Blocks.LIME_BED, Blocks.MAGENTA_BED, Blocks.ORANGE_BED, Blocks.PINK_BED, Blocks.PURPLE_BED, Blocks.WHITE_BED, Blocks.YELLOW_BED));
    public static final ModBlockEntityType<BellBlockEntity> BELL = ModBlockEntityType.create("bell", BlockEntityType.Builder.create(BellBlockEntity::new, Blocks.BELL));


    private final ModBlockEntityType.ModBlockEntityFactory<? extends T> factory;
    private final Set<Block> blocks;
    private final Type<?> type;

    @Nullable
    public static Identifier getId(ModBlockEntityType<?> type) {
        return Registry.BLOCK_ENTITY_TYPE.getId(type);
    }

    private static <T extends ModBlockEntity> ModBlockEntityType<T> create(String id, ModBlockEntityType.Builder<T> builder) {
        if (builder.blocks.isEmpty()) {
            LOGGER.warn("Block entity type {} requires at least one valid block to be defined!", (Object)id);
        }
        Type<?> type = Util.getChoiceType(TypeReferences.BLOCK_ENTITY, id);
        return Registry.register(Registry.BLOCK_ENTITY_TYPE, id, builder.build(type));
    }

    public ModBlockEntityType(ModBlockEntityType.ModBlockEntityFactory<? extends T> factory, Set<Block> blocks, Type<?> type) {
        this.factory = factory;
        this.blocks = blocks;
        this.type = type;
    }

    @Nullable
    public T instantiate(BlockPos pos, BlockState state) {
        return this.factory.create(pos, state);
    }

    public boolean supports(BlockState state) {
        return this.blocks.contains(state.getBlock());
    }

    @Nullable
    public T get(BlockView world, BlockPos pos) {
        BlockEntity BlockEntity = world.getBlockEntity(pos);
        if (BlockEntity == null || ModBlockEntity.getType() != this) {
            return null;
        }
        return (T)BlockEntity;
    }

    public static final class Builder<T extends ModBlockEntity> {
        private final ModBlockEntityType.ModBlockEntityFactory<? extends T> factory;
        final Set<Block> blocks;

        private Builder(ModBlockEntityType.ModBlockEntityFactory<? extends T> factory, Set<Block> blocks) {
            this.factory = factory;
            this.blocks = blocks;
        }

        public static <T extends ModBlockEntity> ModBlockEntityType.Builder<T> create(ModBlockEntityType.ModBlockEntityFactory<? extends T> factory, Block ... blocks) {
            return new ModBlockEntityType.Builder<T>(factory, ImmutableSet.copyOf(blocks));
        }

        public ModBlockEntityType<T> build(Type<?> type) {
            return new ModBlockEntityType<T>(this.factory, this.blocks, type);
        }
    }

    @FunctionalInterface
    static interface ModBlockEntityFactory<T extends ModBlockEntity> {
        public T create(BlockPos var1, BlockState var2);
    }

     */

}
