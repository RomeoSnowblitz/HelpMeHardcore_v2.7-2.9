package net.romeosnowblitz.hmh2.block.custom.magic;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.effect.CustomEffects;

import java.util.Iterator;
import java.util.List;

public class BadEffectBlock extends Block {

    private final StatusEffect effect;
    public BadEffectBlock(StatusEffect effect, Settings settings) {
        super(settings);
        this.effect = effect;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient && entity instanceof LivingEntity livingEntity) {
            if(livingEntity.hasStatusEffect(CustomEffects.SORCERER)){
                livingEntity.addStatusEffect(new StatusEffectInstance(effect, 60, 0));
            } else {
                livingEntity.addStatusEffect(new StatusEffectInstance(effect, 60, 1));
            }
        }
        super.onSteppedOn(world, pos, state, entity);
    }

    @Override
    public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        world.playSound(null, hit.getBlockPos(), SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, SoundCategory.BLOCKS, 1.0F, 0.5F + world.random.nextFloat() * 1.2F);
        world.playSound(null, hit.getBlockPos(), SoundEvents.BLOCK_AMETHYST_BLOCK_HIT, SoundCategory.BLOCKS, 1.0F, 0.5F + world.random.nextFloat() * 1.2F);
        Box box = (new Box(projectile.getBlockPos()).expand(15).stretch(0.0, world.getHeight(), 0.0));
        List<LivingEntity> list = world.getNonSpectatingEntities(LivingEntity.class, box);
        for (LivingEntity livingEntity  : list) {
            if(livingEntity.hasStatusEffect(CustomEffects.SORCERER)){
                livingEntity.addStatusEffect(new StatusEffectInstance(effect, (int) ((15-livingEntity.distanceTo(projectile))*20), 0));
            } else {
                livingEntity.addStatusEffect(new StatusEffectInstance(effect, (int) ((15-livingEntity.distanceTo(projectile))*20), 1));
            }
        }
        super.onProjectileHit(world, state, hit, projectile);
    }
}
