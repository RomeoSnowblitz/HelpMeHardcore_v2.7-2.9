package net.romeosnowblitz.hmh2.block.custom.magic;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.*;
import net.romeosnowblitz.hmh2.effect.CustomEffects;

public class MagicBadDust extends MultifaceGrowthBlock {

    protected final StatusEffect effect;

    public MagicBadDust(StatusEffect effect, Settings settings) {
        super(settings);
        this.effect = effect;
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && entity instanceof LivingEntity livingEntity) {
            if(livingEntity.hasStatusEffect(CustomEffects.SORCERER)){
                livingEntity.addStatusEffect(new StatusEffectInstance(effect, 60, 0));
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
            } else  {
                livingEntity.addStatusEffect(new StatusEffectInstance(effect, 60, 1));
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
            }
        }
    }

    @Override
    public LichenGrower getGrower() {
        return null;
    }
}