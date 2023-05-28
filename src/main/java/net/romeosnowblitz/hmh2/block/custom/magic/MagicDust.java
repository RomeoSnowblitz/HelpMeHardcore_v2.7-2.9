package net.romeosnowblitz.hmh2.block.custom.magic;

import net.minecraft.block.BlockState;
import net.minecraft.block.LichenGrower;
import net.minecraft.block.MultifaceGrowthBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class MagicDust extends MultifaceGrowthBlock {

    protected final StatusEffect effect;

    public MagicDust(StatusEffect effect, Settings settings) {
        super(settings);
        this.effect = effect;
    }

    @Override
    public LichenGrower getGrower() {
        return null;
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && world.getDifficulty() != Difficulty.PEACEFUL) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity)entity;
                if (!livingEntity.isInvulnerableTo(world.getDamageSources().wither())) {
                    livingEntity.addStatusEffect(new StatusEffectInstance(effect, 60, 4));
                }
            }
        }
    }

}