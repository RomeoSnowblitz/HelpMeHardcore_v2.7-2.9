package net.romeosnowblitz.hmh2.block.custom.magic;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.*;
import net.romeosnowblitz.hmh2.block.MagicBlocks;
import net.romeosnowblitz.hmh2.effect.CustomEffects;
import net.romeosnowblitz.hmh2.item.MagicItems;

public class MagicDust extends MultifaceGrowthBlock {

    protected final StatusEffect effect;

    public MagicDust(StatusEffect effect, Settings settings) {
        super(settings);
        this.effect = effect;
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && entity instanceof LivingEntity livingEntity && livingEntity.hasStatusEffect(CustomEffects.SORCERER)) {
            livingEntity.addStatusEffect(new StatusEffectInstance(effect, 60, 4));
        }
    }

    @Override
    public LichenGrower getGrower() {
        return null;
    }
}