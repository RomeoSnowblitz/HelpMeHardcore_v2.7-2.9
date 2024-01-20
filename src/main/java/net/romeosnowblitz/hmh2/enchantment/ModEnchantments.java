package net.romeosnowblitz.hmh2.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModEnchantments {


    public static final Enchantment MAGIC_PROTECTION = register("magic_protection",
            new MagicProtectionEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR, new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET}));

    private static Enchantment register(String name, Enchantment enchantment){
        return Registry.register(Registries.ENCHANTMENT, new Identifier(Hmh2.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments(){
    }
}
