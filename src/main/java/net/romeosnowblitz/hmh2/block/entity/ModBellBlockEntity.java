package net.romeosnowblitz.hmh2.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.EntityTypeTags;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import org.apache.commons.lang3.mutable.MutableInt;

import java.util.List;

public class ModBellBlockEntity extends BlockEntity {
    public static final int field_31316 = 50;
    public static final int field_31317 = 60;
    public static final int field_31318 = 60;
    public static final int field_31319 = 40;
    public static final int field_31320 = 5;
    public static final int field_31321 = 48;
    public static final int field_31322 = 32;
    public static final int field_31323 = 48;

    public long lastRingTime;
    public int ringTicks;
    public boolean ringing;
    public Direction lastSideHit;
    public List<LivingEntity> hearingEntities;
    public boolean resonating;
    public int resonateTime;

    public ModBellBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityType.BELL, pos, state);
    }


    @Override
    public boolean onSyncedBlockEvent(int type, int data) {
        if (type == 1) {
            this.notifyMemoriesOfBell();
            this.resonateTime = 0;
            this.lastSideHit = Direction.byId(data);
            this.ringTicks = 0;
            this.ringing = true;
            return true;
        }
        return super.onSyncedBlockEvent(type, data);
    }

    public static void tick(World world, BlockPos pos, BlockState state, ModBellBlockEntity blockEntity, Effect bellEffect) {
        if (blockEntity.ringing) {
            ++blockEntity.ringTicks;
        }
        if (blockEntity.ringTicks >= 50) {
            blockEntity.ringing = false;
            blockEntity.ringTicks = 0;
        }
        if (blockEntity.ringTicks >= 5 && blockEntity.resonateTime == 0 && ModBellBlockEntity.raidersHearBell(pos, blockEntity.hearingEntities)) {
            blockEntity.resonating = true;
            world.playSound(null, pos, SoundEvents.BLOCK_BELL_RESONATE, SoundCategory.BLOCKS, 1.0f, 1.0f);
        }
        if (blockEntity.resonating) {
            if (blockEntity.resonateTime < 40) {
                ++blockEntity.resonateTime;
            } else {
                bellEffect.run(world, pos, blockEntity.hearingEntities);
                blockEntity.resonating = false;
            }
        }
    }

    public static void clientTick(World world, BlockPos pos, BlockState state, ModBellBlockEntity blockEntity) {
        ModBellBlockEntity.tick(world, pos, state, blockEntity, ModBellBlockEntity::applyParticlesToRaiders);
    }

    public static void serverTick(World world, BlockPos pos, BlockState state, ModBellBlockEntity blockEntity) {
        ModBellBlockEntity.tick(world, pos, state, blockEntity, ModBellBlockEntity::applyGlowToRaiders);
    }

    /**
     * Rings the bell in a given direction.
     */
    public void activate(Direction direction) {
        BlockPos blockPos = this.getPos();
        this.lastSideHit = direction;
        if (this.ringing) {
            this.ringTicks = 0;
        } else {
            this.ringing = true;
        }
        this.world.addSyncedBlockEvent(blockPos, this.getCachedState().getBlock(), 1, direction.getId());
    }

    /**
     * Makes living entities within 48 blocks remember that they heard a bell at the current world time.
     */
    public void notifyMemoriesOfBell() {
        BlockPos blockPos = this.getPos();
        if (this.world.getTime() > this.lastRingTime + 60L || this.hearingEntities == null) {
            this.lastRingTime = this.world.getTime();
            Box box = new Box(blockPos).expand(48.0);
            this.hearingEntities = this.world.getNonSpectatingEntities(LivingEntity.class, box);
        }
        if (!this.world.isClient) {
            for (LivingEntity livingEntity : this.hearingEntities) {
                if (!livingEntity.isAlive() || livingEntity.isRemoved() || !blockPos.isWithinDistance(livingEntity.getPos(), 32.0)) continue;
                livingEntity.getBrain().remember(MemoryModuleType.HEARD_BELL_TIME, this.world.getTime());
            }
        }
    }

    /**
     * Determines whether at least one of the given entities would be affected by the bell.
     *
     * <p>This determines whether the bell resonates.
     * For some reason, despite affected by the bell, entities more than 32 blocks away will not count as hearing the bell.
     */
    public static boolean raidersHearBell(BlockPos pos, List<LivingEntity> hearingEntities) {
        for (LivingEntity livingEntity : hearingEntities) {
            if (!livingEntity.isAlive() || livingEntity.isRemoved() || !pos.isWithinDistance(livingEntity.getPos(), 32.0) || !livingEntity.getType().isIn(EntityTypeTags.RAIDERS)) continue;
            return true;
        }
        return false;
    }

    public static void applyGlowToRaiders(World world, BlockPos pos, List<LivingEntity> hearingEntities) {
        hearingEntities.stream().filter(entity -> ModBellBlockEntity.isRaiderEntity(pos, entity)).forEach(ModBellBlockEntity::applyGlowToEntity);
    }

    /**
     * Spawns {@link ParticleTypes#ENTITY_EFFECT} particles around raiders within 48 blocks.
     */
    public static void applyParticlesToRaiders(World world, BlockPos pos, List<LivingEntity> hearingEntities) {
        MutableInt mutableInt = new MutableInt(16700985);
        int i = (int)hearingEntities.stream().filter(entity -> pos.isWithinDistance(entity.getPos(), 48.0)).count();
        hearingEntities.stream().filter(entity -> ModBellBlockEntity.isRaiderEntity(pos, entity)).forEach(entity -> {
            float f = 1.0f;
            double d = Math.sqrt((entity.getX() - (double)pos.getX()) * (entity.getX() - (double)pos.getX()) + (entity.getZ() - (double)pos.getZ()) * (entity.getZ() - (double)pos.getZ()));
            double e = (double)((float)pos.getX() + 0.5f) + 1.0 / d * (entity.getX() - (double)pos.getX());
            double g = (double)((float)pos.getZ() + 0.5f) + 1.0 / d * (entity.getZ() - (double)pos.getZ());
            int j = MathHelper.clamp((i - 21) / -2, 3, 15);
            for (int k = 0; k < j; ++k) {
                int l = mutableInt.addAndGet(5);
                double h = (double) ColorHelper.Argb.getRed(l) / 255.0;
                double m = (double)ColorHelper.Argb.getGreen(l) / 255.0;
                double n = (double)ColorHelper.Argb.getBlue(l) / 255.0;
                world.addParticle(ParticleTypes.ENTITY_EFFECT, e, (float)pos.getY() + 0.5f, g, h, m, n);
            }
        });
    }

    /**
     * Determines whether the given entity is in the {@link EntityTypeTags#RAIDERS} entity type tag and within 48 blocks of the given position.
     */
    public static boolean isRaiderEntity(BlockPos pos, LivingEntity entity) {
        return entity.isAlive() && !entity.isRemoved() && pos.isWithinDistance(entity.getPos(), 48.0) && entity.getType().isIn(EntityTypeTags.RAIDERS);
    }

    /**
     * Gives the {@link StatusEffects#GLOWING} status effect to the given entity for 3 seconds (60 ticks).
     */
    public static void applyGlowToEntity(LivingEntity entity) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 60));
    }

    @FunctionalInterface
    static interface Effect {
        public void run(World var1, BlockPos var2, List<LivingEntity> var3);
    }
}
