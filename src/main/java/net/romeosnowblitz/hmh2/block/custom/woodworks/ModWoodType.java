package net.romeosnowblitz.hmh2.block.custom.woodworks;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.block.BlockSetType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import software.bernie.shadowed.eliotlash.mclib.math.functions.classic.Mod;

import java.util.Set;
import java.util.stream.Stream;

public record ModWoodType(String name, ModBlockSetType setType, BlockSoundGroup soundType, BlockSoundGroup hangingSignSoundType, SoundEvent fenceGateClose, SoundEvent fenceGateOpen) {
    private static final Set<ModWoodType> VALUES = new ObjectArraySet();

    public static final ModWoodType OAK;
    public static final ModWoodType BANANA;
    public static final ModWoodType CHERRY;
    public static final ModWoodType CORK_OAK;
    public static final ModWoodType JACARANDA;
    public static final ModWoodType MAHOE;
    public static final ModWoodType MANGO;
    public static final ModWoodType WILLOW;

    public ModWoodType(String name, ModBlockSetType setType) {
        this(name, setType, BlockSoundGroup.WOOD, BlockSoundGroup.HANGING_SIGN, SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    }

    public ModWoodType(String name, ModBlockSetType setType, BlockSoundGroup soundType, BlockSoundGroup hangingSignSoundType, SoundEvent fenceGateClose, SoundEvent fenceGateOpen) {
        this.name = name;
        this.setType = setType;
        this.soundType = soundType;
        this.hangingSignSoundType = hangingSignSoundType;
        this.fenceGateClose = fenceGateClose;
        this.fenceGateOpen = fenceGateOpen;
    }

    private static ModWoodType register(ModWoodType type) {
        VALUES.add(type);
        return type;
    }

    public static Stream<ModWoodType> stream() {
        return VALUES.stream();
    }

    public String name() {
        return this.name;
    }

    public ModBlockSetType setType() {
        return this.setType;
    }

    public BlockSoundGroup soundType() {
        return this.soundType;
    }

    public BlockSoundGroup hangingSignSoundType() {
        return this.hangingSignSoundType;
    }

    public SoundEvent fenceGateClose() {
        return this.fenceGateClose;
    }

    public SoundEvent fenceGateOpen() {
        return this.fenceGateOpen;
    }


    static {
        OAK = register(new ModWoodType("oak", ModBlockSetType.OAK));
        BANANA = register(new ModWoodType("banana", ModBlockSetType.OAK));
        CHERRY = register(new ModWoodType("cherry", ModBlockSetType.OAK));
        CORK_OAK = register(new ModWoodType("cork_oak", ModBlockSetType.OAK));
        JACARANDA = register(new ModWoodType("jacaranda", ModBlockSetType.OAK));
        MAHOE = register(new ModWoodType("mahoe", ModBlockSetType.OAK));
        MANGO = register(new ModWoodType("mango", ModBlockSetType.OAK));
        WILLOW = register(new ModWoodType("willow", ModBlockSetType.OAK));

    }
}