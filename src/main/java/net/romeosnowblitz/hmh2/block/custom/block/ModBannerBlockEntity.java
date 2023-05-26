package net.romeosnowblitz.hmh2.block.custom.block;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.block.entity.BannerPatterns;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Nameable;
import net.minecraft.util.math.BlockPos;
import net.romeosnowblitz.hmh2.item.custom.dyes.ModDyeColor;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBannerBlockEntity extends BlockEntity implements Nameable {
    public static final int field_31296 = 6;
    public static final String PATTERNS_KEY = "Patterns";
    public static final String PATTERN_KEY = "Pattern";
    public static final String COLOR_KEY = "Color";
    @Nullable
    private Text customName;
    private ModDyeColor baseColor;
    @Nullable
    private NbtList patternListNbt;
    @Nullable
    private List<Pair<RegistryEntry<BannerPattern>, ModDyeColor>> patterns;

    public ModBannerBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityType.BANNER, pos, state);
        this.baseColor = ((ModAbstractBannerBlock)state.getBlock()).getColor();
    }

    public ModBannerBlockEntity(BlockPos pos, BlockState state, ModDyeColor baseColor) {
        this(pos, state);
        this.baseColor = baseColor;
    }

    @Nullable
    public static NbtList getPatternListNbt(ItemStack stack) {
        NbtList nbtList = null;
        NbtCompound nbtCompound = BlockItem.getBlockEntityNbt(stack);
        if (nbtCompound != null && nbtCompound.contains("Patterns", 9)) {
            nbtList = nbtCompound.getList("Patterns", 10).copy();
        }

        return nbtList;
    }

    public void readFrom(ItemStack stack, ModDyeColor baseColor) {
        this.baseColor = baseColor;
        this.readFrom(stack);
    }

    public void readFrom(ItemStack stack) {
        this.patternListNbt = getPatternListNbt(stack);
        this.patterns = null;
        this.customName = stack.hasCustomName() ? stack.getName() : null;
    }

    public Text getName() {
        return (Text)(this.customName != null ? this.customName : Text.translatable("block.minecraft.banner"));
    }

    @Nullable
    public Text getCustomName() {
        return this.customName;
    }

    public void setCustomName(Text customName) {
        this.customName = customName;
    }

    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        if (this.patternListNbt != null) {
            nbt.put("Patterns", this.patternListNbt);
        }

        if (this.customName != null) {
            nbt.putString("CustomName", Text.Serializer.toJson(this.customName));
        }

    }

    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        if (nbt.contains("CustomName", 8)) {
            this.customName = Text.Serializer.fromJson(nbt.getString("CustomName"));
        }

        this.patternListNbt = nbt.getList("Patterns", 10);
        this.patterns = null;
    }

    public BlockEntityUpdateS2CPacket toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    public NbtCompound toInitialChunkDataNbt() {
        return this.createNbt();
    }

    public static int getPatternCount(ItemStack stack) {
        NbtCompound nbtCompound = BlockItem.getBlockEntityNbt(stack);
        return nbtCompound != null && nbtCompound.contains("Patterns") ? nbtCompound.getList("Patterns", 10).size() : 0;
    }

    public List<Pair<RegistryEntry<BannerPattern>, ModDyeColor>> getPatterns() {
        if (this.patterns == null) {
            this.patterns = getPatternsFromNbt(this.baseColor, this.patternListNbt);
        }

        return this.patterns;
    }

    public static List<Pair<RegistryEntry<BannerPattern>, ModDyeColor>> getPatternsFromNbt(ModDyeColor baseColor, @Nullable NbtList patternListNbt) {
        List<Pair<RegistryEntry<BannerPattern>, ModDyeColor>> list = Lists.newArrayList();
        list.add(Pair.of(Registries.BANNER_PATTERN.entryOf(BannerPatterns.BASE), baseColor));
        if (patternListNbt != null) {
            for(int i = 0; i < patternListNbt.size(); ++i) {
                NbtCompound nbtCompound = patternListNbt.getCompound(i);
                RegistryEntry<BannerPattern> registryEntry = BannerPattern.byId(nbtCompound.getString("Pattern"));
                if (registryEntry != null) {
                    int j = nbtCompound.getInt("Color");
                    list.add(Pair.of(registryEntry, ModDyeColor.byId(j)));
                }
            }
        }

        return list;
    }

    public static void loadFromItemStack(ItemStack stack) {
        NbtCompound nbtCompound = BlockItem.getBlockEntityNbt(stack);
        if (nbtCompound != null && nbtCompound.contains("Patterns", 9)) {
            NbtList nbtList = nbtCompound.getList("Patterns", 10);
            if (!nbtList.isEmpty()) {
                nbtList.remove(nbtList.size() - 1);
                if (nbtList.isEmpty()) {
                    nbtCompound.remove("Patterns");
                }

                BlockItem.setBlockEntityNbt(stack, BlockEntityType.BANNER, nbtCompound);
            }
        }
    }

    public ItemStack getPickStack() {
        ItemStack itemStack = new ItemStack(ModBannerBlock.getForColor(this.baseColor));
        if (this.patternListNbt != null && !this.patternListNbt.isEmpty()) {
            NbtCompound nbtCompound = new NbtCompound();
            nbtCompound.put("Patterns", this.patternListNbt.copy());
            BlockItem.setBlockEntityNbt(itemStack, this.getType(), nbtCompound);
        }

        if (this.customName != null) {
            itemStack.setCustomName(this.customName);
        }

        return itemStack;
    }

    public ModDyeColor getColorForState() {
        return this.baseColor;
    }
}
