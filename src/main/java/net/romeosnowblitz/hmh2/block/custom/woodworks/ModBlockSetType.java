package net.romeosnowblitz.hmh2.block.custom.woodworks;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.Set;
import java.util.stream.Stream;

public record ModBlockSetType(String name, boolean canOpenByHand, BlockSoundGroup soundType, SoundEvent doorClose, SoundEvent doorOpen, SoundEvent trapdoorClose, SoundEvent trapdoorOpen, SoundEvent pressurePlateClickOff, SoundEvent pressurePlateClickOn, SoundEvent buttonClickOff, SoundEvent buttonClickOn) {
    private static final Set<ModBlockSetType> VALUES = new ObjectArraySet();
    public static final ModBlockSetType OAK;
    public static final ModBlockSetType BANANA;
    public static final ModBlockSetType CHERRY;
    public static final ModBlockSetType CORK_OAK;
    public static final ModBlockSetType JACARANDA;
    public static final ModBlockSetType MAHOE;
    public static final ModBlockSetType MANGO;
    public static final ModBlockSetType WILLOW;

    public ModBlockSetType(String name) {
        this(name, true, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    }

    public ModBlockSetType(String name, boolean canOpenByHand, BlockSoundGroup soundType, SoundEvent doorClose, SoundEvent doorOpen, SoundEvent trapdoorClose, SoundEvent trapdoorOpen, SoundEvent pressurePlateClickOff, SoundEvent pressurePlateClickOn, SoundEvent buttonClickOff, SoundEvent buttonClickOn) {
        this.name = name;
        this.canOpenByHand = canOpenByHand;
        this.soundType = soundType;
        this.doorClose = doorClose;
        this.doorOpen = doorOpen;
        this.trapdoorClose = trapdoorClose;
        this.trapdoorOpen = trapdoorOpen;
        this.pressurePlateClickOff = pressurePlateClickOff;
        this.pressurePlateClickOn = pressurePlateClickOn;
        this.buttonClickOff = buttonClickOff;
        this.buttonClickOn = buttonClickOn;
    }

    private static ModBlockSetType register(ModBlockSetType blockSetType) {
        VALUES.add(blockSetType);
        return blockSetType;
    }

    public static Stream<ModBlockSetType> stream() {
        return VALUES.stream();
    }

    public String name() {
        return this.name;
    }

    public boolean canOpenByHand() {
        return this.canOpenByHand;
    }

    public BlockSoundGroup soundType() {
        return this.soundType;
    }

    public SoundEvent doorClose() {
        return this.doorClose;
    }

    public SoundEvent doorOpen() {
        return this.doorOpen;
    }

    public SoundEvent trapdoorClose() {
        return this.trapdoorClose;
    }

    public SoundEvent trapdoorOpen() {
        return this.trapdoorOpen;
    }

    public SoundEvent pressurePlateClickOff() {
        return this.pressurePlateClickOff;
    }

    public SoundEvent pressurePlateClickOn() {
        return this.pressurePlateClickOn;
    }

    public SoundEvent buttonClickOff() {
        return this.buttonClickOff;
    }

    public SoundEvent buttonClickOn() {
        return this.buttonClickOn;
    }

    static {
        OAK = register(new ModBlockSetType("oak"));
        BANANA = register(new ModBlockSetType("banana"));
        CHERRY = register(new ModBlockSetType("cherry"));
        CORK_OAK = register(new ModBlockSetType("cork_oak"));
        JACARANDA = register(new ModBlockSetType("jacaranda"));
        MAHOE = register(new ModBlockSetType("mahoe"));
        MANGO = register(new ModBlockSetType("mango"));
        WILLOW = register(new ModBlockSetType("willow"));

    }
}