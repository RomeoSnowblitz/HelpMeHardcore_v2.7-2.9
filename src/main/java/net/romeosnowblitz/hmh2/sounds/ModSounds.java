package net.romeosnowblitz.hmh2.sounds;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModSounds extends SoundEvents{

    public static SoundEvent ORE_SCREAM_BREAK = register("ore_scream_break");
    public static SoundEvent ORE_SCREAM_FALL = register("ore_scream_fall");
    public static SoundEvent ORE_SCREAM_HIT = register("ore_scream_hit");
    public static SoundEvent VAPOR_MOAN = register("vapor_moan");
    public static SoundEvent CAL_SCREAM = register("cal_scream");

    public static final BlockSoundGroup ORE_SCREAM_SOUNDS = new BlockSoundGroup(1f,2f,
            ModSounds.CAL_SCREAM, ModSounds.VAPOR_MOAN, ModSounds.VAPOR_MOAN, SoundEvents.ENTITY_VILLAGER_HURT, SoundEvents.ENTITY_GOAT_SCREAMING_AMBIENT);

    //break step place hit fall

    private static SoundEvent register(String name) {
        return register(new Identifier(Hmh2.MOD_ID, name));
    }

    private static SoundEvent register(Identifier id) {
        return register(id, id);
    }

    private static SoundEvent register(Identifier id, Identifier soundId) {
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }

    public static void registerSounds(){
        System.out.println("Registering ModSounds for " + Hmh2.MOD_ID);
    }



}
