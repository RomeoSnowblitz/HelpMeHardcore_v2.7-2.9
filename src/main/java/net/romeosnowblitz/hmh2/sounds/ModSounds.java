package net.romeosnowblitz.hmh2.sounds;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModSounds {
    public static SoundEvent ORE_SCREAM_BREAK = registerSoundEvent("ore_scream_break");
    public static SoundEvent ORE_SCREAM_FALL = registerSoundEvent("ore_scream_fall");
    public static SoundEvent ORE_SCREAM_HIT = registerSoundEvent("ore_scream_hit");
    public static SoundEvent VAPOR_MOAN = registerSoundEvent("vapor_moan");
    public static SoundEvent CAL_SCREAM = registerSoundEvent("cal_scream");

    public static final BlockSoundGroup ORE_SCREAM_SOUNDS = new BlockSoundGroup(1f,2f,
            ModSounds.CAL_SCREAM, ModSounds.VAPOR_MOAN, ModSounds.VAPOR_MOAN, SoundEvents.ENTITY_VILLAGER_HURT, SoundEvents.ENTITY_GOAT_SCREAMING_AMBIENT);

    //break step place hit fall

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(Hmh2.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerSounds(){
        System.out.println("Registering ModSounds for " + Hmh2.MOD_ID);
    }
}
