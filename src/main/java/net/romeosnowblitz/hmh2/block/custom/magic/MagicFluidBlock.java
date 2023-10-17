package net.romeosnowblitz.hmh2.block.custom.magic;

import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;


public class MagicFluidBlock extends FluidBlock {

    protected final StatusEffect effect;

    public MagicFluidBlock(StatusEffect effect, FlowableFluid fluid, Settings settings) {
        super(fluid, settings);
        this.effect = effect;
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && entity instanceof LivingEntity livingEntity && livingEntity.hasStatusEffect(CustomEffects.SORCERER)) {
            livingEntity.addStatusEffect(new StatusEffectInstance(effect, 60, 4));
        }
    }

}