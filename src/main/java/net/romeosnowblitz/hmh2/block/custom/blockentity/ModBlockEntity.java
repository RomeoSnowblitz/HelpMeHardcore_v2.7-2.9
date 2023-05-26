package net.romeosnowblitz.hmh2.block.custom.blockentity;

import com.mojang.logging.LogUtils;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

public abstract class ModBlockEntity {
    private static final Logger LOGGER = LogUtils.getLogger();
    private final ModBlockEntityType<?> type;
    @Nullable
    protected World world;
    protected final BlockPos pos;
    protected boolean removed;
    private BlockState cachedState;

    public ModBlockEntity(ModBlockEntityType<?> type, BlockPos pos, BlockState state) {
        this.type = type;
        this.pos = pos.toImmutable();
        this.cachedState = state;
    }

    public static BlockPos posFromNbt(NbtCompound nbt) {
        return new BlockPos(nbt.getInt("x"), nbt.getInt("y"), nbt.getInt("z"));
    }

    @Nullable
    public World getWorld() {
        return this.world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public boolean hasWorld() {
        return this.world != null;
    }

    public void readNbt(NbtCompound nbt) {
    }

    protected void writeNbt(NbtCompound nbt) {
    }
/*
    public final NbtCompound createNbtWithIdentifyingData() {
        NbtCompound nbtCompound = this.createNbt();
        this.writeIdentifyingData(nbtCompound);
        return nbtCompound;
    }

    public final NbtCompound createNbtWithId() {
        NbtCompound nbtCompound = this.createNbt();
        this.writeIdToNbt(nbtCompound);
        return nbtCompound;
    }

    public final NbtCompound createNbt() {
        NbtCompound nbtCompound = new NbtCompound();
        this.writeNbt(nbtCompound);
        return nbtCompound;
    }

    private void writeIdToNbt(NbtCompound nbt) {
        Identifier identifier = ModBlockEntityType.getId(this.getType());
        if (identifier == null) {
            throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
        }
        nbt.putString("id", identifier.toString());
    }

    public static void writeIdToNbt(NbtCompound nbt, ModBlockEntityType<?> type) {
        nbt.putString("id", ModBlockEntityType.getId(type).toString());
    }

    private void writeIdentifyingData(NbtCompound nbt) {
        this.writeIdToNbt(nbt);
        nbt.putInt("x", this.pos.getX());
        nbt.putInt("y", this.pos.getY());
        nbt.putInt("z", this.pos.getZ());
    }
 /*
    @Nullable
    public static ModBlockEntity createFromNbt(BlockPos pos, BlockState state, NbtCompound nbt) {
        String string = nbt.getString("id");
        Identifier identifier = Identifier.tryParse(string);
        if (identifier == null) {
            LOGGER.error("Block entity has invalid type: {}", (Object)string);
            return null;
        }
        return Registry.BLOCK_ENTITY_TYPE.getOrEmpty(identifier).map(type -> {
            try {
                return type.instantiate(pos, state);
            }
            catch (Throwable throwable) {
                LOGGER.error("Failed to create block entity {}", (Object)string, (Object)throwable);
                return null;
            }
        }).map(modBlockEntity -> {
            try {
                ModBlockEntity.readNbt(nbt);
                return modBlockEntity;
            }
            catch (Throwable throwable) {
                LOGGER.error("Failed to load data for block entity {}", (Object)string, (Object)throwable);
                return null;
            }
        }).orElseGet(() -> {
            LOGGER.warn("Skipping BlockEntity with id {}", (Object)string);
            return null;
        });
    }

    public void markDirty() {
        if (this.world != null) {
            ModBlockEntity.markDirty(this.world, this.pos, this.cachedState);
        }
    }

    protected static void markDirty(World world, BlockPos pos, BlockState state) {
        world.markDirty(pos);
        if (!state.isAir()) {
            world.updateComparators(pos, state.getBlock());
        }
    }

    public BlockPos getPos() {
        return this.pos;
    }

    public BlockState getCachedState() {
        return this.cachedState;
    }

    /**
     * Implement and return a packet that should be sent to players nearby when the observable state of
     * this block entity changes. Return null to not send an update packet.
     * <p>
     * If the data returned by {@link #toInitialChunkDataNbt initial chunk data} is suitable for updates,
     * the following shortcut can be used to create an update packet: {@code BlockEntityUpdateS2CPacket.create(this)}.
     * <p>
     * The NBT will be passed to {@link #readNbt} on the client.
     */
    @Nullable
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return null;
    }

    /**
     * Serializes the state of this block entity that is observable by clients.
     * It is sent alongside the initial chunk data, as well as when the block
     * entity implements {@link #toUpdatePacket} and decides to use the default
     * {@link net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket}.
     */
    public NbtCompound toInitialChunkDataNbt() {
        return new NbtCompound();
    }

    public boolean isRemoved() {
        return this.removed;
    }

    public void markRemoved() {
        this.removed = true;
    }

    public void cancelRemoval() {
        this.removed = false;
    }

    public boolean onSyncedBlockEvent(int type, int data) {
        return false;
    }

    public boolean copyItemDataRequiresOperator() {
        return false;
    }

    public ModBlockEntityType<?> getType() {
        return this.type;
    }

    @Deprecated
    public void setCachedState(BlockState state) {
        this.cachedState = state;
    }
}
