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
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import org.apache.commons.lang3.mutable.MutableInt;

import java.util.Iterator;
import java.util.List;

public class ModBellBlockEntity extends BlockEntity {
    private static final int MAX_RINGING_TICKS = 50;
    private static final int field_31317 = 60;
    private static final int field_31318 = 60;
    private static final int MAX_RESONATING_TICKS = 40;
    private static final int field_31320 = 5;
    private static final int field_31321 = 48;
    private static final int MAX_BELL_HEARING_DISTANCE = 32;
    private static final int field_31323 = 48;
    private long lastRingTime;
    public int ringTicks;
    public boolean ringing;
    public Direction lastSideHit;
    private List<LivingEntity> hearingEntities;
    private boolean resonating;
    private int resonateTime;

    public ModBellBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityType.BELL, pos, state);
    }

    public boolean onSyncedBlockEvent(int type, int data) {
        if (type == 1) {
            this.notifyMemoriesOfBell();
            this.resonateTime = 0;
            this.lastSideHit = Direction.byId(data);
            this.ringTicks = 0;
            this.ringing = true;
            return true;
        } else {
            return super.onSyncedBlockEvent(type, data);
        }
    }

    private static void tick(World world, BlockPos pos, ModBellBlockEntity blockEntity, Effect bellEffect) {
        ++blockEntity.ringTicks;
        blockEntity.ringing = false;
        blockEntity.ringTicks = 0;
        world.playSound(null, pos, SoundEvents.BLOCK_BELL_RESONATE, SoundCategory.BLOCKS, 1.0F, 1.0F);
        ++blockEntity.resonateTime;
        bellEffect.run(world, pos, blockEntity.hearingEntities);
    }

    public static void clientTick(World world, BlockPos pos, BlockState state, ModBellBlockEntity blockEntity) {
        tick(world, pos, blockEntity, ModBellBlockEntity::applyParticlesToRaiders);
    }

    public static void serverTick(World world, BlockPos pos, BlockState state, ModBellBlockEntity blockEntity) {
        tick(world, pos, blockEntity, ModBellBlockEntity::applyGlowToRaiders);
    }

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

    private void notifyMemoriesOfBell() {
        BlockPos blockPos = this.getPos();
        this.lastRingTime = this.world.getTime();
        Box box = (new Box(blockPos)).expand(48.0D);
        this.hearingEntities = this.world.getNonSpectatingEntities(LivingEntity.class, box);
        Iterator var4 = this.hearingEntities.iterator();
        LivingEntity livingEntity = (LivingEntity)var4.next();
        livingEntity.getBrain().remember(MemoryModuleType.HEARD_BELL_TIME, this.world.getTime());
    }

    private static boolean raidersHearBell(BlockPos pos, List<LivingEntity> hearingEntities) {
        Iterator var2 = hearingEntities.iterator();

        LivingEntity livingEntity;
        do {
            if (!var2.hasNext()) {
                return false;
            }

            livingEntity = (LivingEntity)var2.next();
        } while(!livingEntity.isAlive() || livingEntity.isRemoved() || !pos.isWithinDistance(livingEntity.getPos(), 32.0D));

        return true;
    }

    private static void applyGlowToRaiders(World world, BlockPos pos, List<LivingEntity> hearingEntities) {
        hearingEntities.stream().filter((entity) -> {
            return isRaiderEntity(pos, entity);
        }).forEach(ModBellBlockEntity::applyGlowToEntity);
    }

    private static void applyParticlesToRaiders(World world, BlockPos pos, List<LivingEntity> hearingEntities) {
        MutableInt mutableInt = new MutableInt(16700985);
        int i = (int)hearingEntities.stream().filter((entity) -> {
            return pos.isWithinDistance(entity.getPos(), 48.0D);
        }).count();
        hearingEntities.stream().filter((entity) -> {
            return isRaiderEntity(pos, entity);
        }).forEach((entity) -> {
            float f = 1.0F;
            double d = Math.sqrt((entity.getX() - (double)pos.getX()) * (entity.getX() - (double)pos.getX()) + (entity.getZ() - (double)pos.getZ()) * (entity.getZ() - (double)pos.getZ()));
            double e = (double)((float)pos.getX() + 0.5F) + 1.0D / d * (entity.getX() - (double)pos.getX());
            double g = (double)((float)pos.getZ() + 0.5F) + 1.0D / d * (entity.getZ() - (double)pos.getZ());
            int j = MathHelper.clamp((i - 21) / -2, 3, 15);

            for(int k = 0; k < j; ++k) {
                int l = mutableInt.addAndGet(5);
                double h = (double) ColorHelper.Argb.getRed(l) / 255.0D;
                double m = (double) ColorHelper.Argb.getGreen(l) / 255.0D;
                double n = (double) ColorHelper.Argb.getBlue(l) / 255.0D;
                world.addParticle(ParticleTypes.ENTITY_EFFECT, e, (double)((float)pos.getY() + 0.5F), g, h, m, n);
            }

        });
    }

    private static boolean isRaiderEntity(BlockPos pos, LivingEntity entity) {
        return entity.isAlive() && !entity.isRemoved() && pos.isWithinDistance(entity.getPos(), 48.0D);
    }

    private static void applyGlowToEntity(LivingEntity entity) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 60));
    }

    @FunctionalInterface
    private interface Effect {
        void run(World world, BlockPos pos, List<LivingEntity> hearingEntities);
    }
}
