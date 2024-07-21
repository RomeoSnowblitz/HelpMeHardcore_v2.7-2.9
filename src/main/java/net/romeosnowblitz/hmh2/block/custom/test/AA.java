package net.romeosnowblitz.hmh2.block.custom.test;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockRenderView;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.explosion.Explosion;
import org.jetbrains.annotations.Nullable;


public class AA extends Block {

    public AA( Settings settings) {
        super(settings);
    }

    public boolean hasRandomTicks(BlockState state) {
        return true;
    }
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        entity.addVelocity(1, 1, 1);
    }
    public boolean canMobSpawnInside(BlockState state) {
        return true;
    }
    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }
    public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion) {
        explosion.affectWorld(true);
    }
    public float getMaxHorizontalModelOffset() {
        return 0.9f;
    }
    public float getVerticalModelOffsetMultiplier() {
        return 0.9f;
    }
    public MapColor getDefaultMapColor() {
        return MapColor.BRIGHT_RED;
    }
    public BlockSoundGroup getSoundGroup(BlockState state) {
        return BlockSoundGroup.SLIME;
    }
    public BlockState getAppearance(BlockState state, BlockRenderView renderView, BlockPos pos, Direction side, @Nullable BlockState sourceState, @Nullable BlockPos sourcePos) {
        return Blocks.DIAMOND_BLOCK.getDefaultState();
    }
    public boolean hasDynamicBounds() {
        return true;
    }
    public boolean shouldDropItemsOnExplosion(Explosion explosion) {
        return true;
    }
    public float getBlastResistance() {
        return 0.1f;
    }
    public float getJumpVelocityMultiplier() {
        return 0.1f;
    }
    public float getVelocityMultiplier() {
        return 0.1f;
    }

    public String getTranslationKey() {
        return "New Name" ;
    }
    //survival or creative
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        world.setBlockState(pos.up(2), Blocks.RED_SANDSTONE.getDefaultState());
    }
    //survival only
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
        world.setBlockState(pos.up(1), Blocks.SANDSTONE.getDefaultState());
    }
    //places when broken but cannot be seen until reloaded
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        world.setBlockState(pos.up(3), Blocks.BIRCH_LOG.getDefaultState(),1);
    }
    public void precipitationTick(BlockState state, World world, BlockPos pos, Biome.Precipitation precipitation) {
        world.setBlockState(pos.down(1), Blocks.WATER.getDefaultState());
    }
    public StateManager<Block, BlockState> getStateManager() {
        return super.getStateManager();
    }
    public float getSlipperiness() {
        return 0.1f;
    }
    public boolean isEnabled(FeatureSet enabledFeatures) {
        return true;
    }
    public int hashCode() {
        return 1;
    }
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
