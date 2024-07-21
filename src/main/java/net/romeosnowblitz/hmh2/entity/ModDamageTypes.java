package net.romeosnowblitz.hmh2.entity;

import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModDamageTypes {
    public static final RegistryKey<DamageType> KILLED_BY_ARMOR_WEAKNESS = registerDamageType("armor_weakness");
    public static final RegistryKey<DamageType> KILLED_BY_ASHLUNG = registerDamageType("ashlung");
    public static final RegistryKey<DamageType> KILLED_BY_ASHMITE = registerDamageType("ashmite");
    public static final RegistryKey<DamageType> KILLED_BY_BLAZING_INFERNO = registerDamageType("blazing_inferno");
    public static final RegistryKey<DamageType> KILLED_BY_BLOODMITE = registerDamageType("bloodmite");
    public static final RegistryKey<DamageType> KILLED_BY_CAL = registerDamageType("cal");
    public static final RegistryKey<DamageType> KILLED_BY_DEMON = registerDamageType("demon");
    public static final RegistryKey<DamageType> KILLED_BY_DEMONS_CURSE = registerDamageType("demons_curse");
    public static final RegistryKey<DamageType> KILLED_BY_GHOST = registerDamageType("ghost");
    public static final RegistryKey<DamageType> KILLED_BY_GREAT_HUNGER = registerDamageType("great_hunger");
    public static final RegistryKey<DamageType> KILLED_BY_HEALTH_ADJUSTMENT = registerDamageType("health_adjustment");
    public static final RegistryKey<DamageType> KILLED_BY_HELLMITE = registerDamageType("hellmite");
    public static final RegistryKey<DamageType> KILLED_BY_MAGMITE = registerDamageType("magmite");
    public static final RegistryKey<DamageType> KILLED_BY_NECROMANCER_0XP = registerDamageType("necromancer_0xp");
    public static final RegistryKey<DamageType> KILLED_BY_QUEEN_BEE = registerDamageType("queen_bee");
    public static final RegistryKey<DamageType> KILLED_BY_SCULKMITE = registerDamageType("sculkmite");
    public static final RegistryKey<DamageType> KILLED_BY_SHADOW_CREATURE = registerDamageType("shadow_creature");
    public static final RegistryKey<DamageType> KILLED_BY_SOLDIER_BEE = registerDamageType("soldier_bee");
    public static final RegistryKey<DamageType> KILLED_BY_SORCERER_ATTEMPT = registerDamageType("sorcerer");
    public static final RegistryKey<DamageType> KILLED_BY_WARPMITE = registerDamageType("warpmite");
    public static final RegistryKey<DamageType> KILLED_BY_WISP = registerDamageType("wisp");
    public static final RegistryKey<DamageType> KILLED_BY_WISP_FOR_0XP = registerDamageType("wisp_0xp");

    public static final RegistryKey<DamageType> KILLED_BY_BLOOD_WITCH_ATTEMPT = registerDamageType("blood_witch");
    public static final RegistryKey<DamageType> KILLED_BY_BLOOD_WITCH_TAUNT = registerDamageType("blood_witch_taunt");

    private static RegistryKey<DamageType> registerDamageType(String name) {
        return RegistryKey.of(RegistryKeys.DAMAGE_TYPE, new Identifier(Hmh2.MOD_ID, name));
    }
}
