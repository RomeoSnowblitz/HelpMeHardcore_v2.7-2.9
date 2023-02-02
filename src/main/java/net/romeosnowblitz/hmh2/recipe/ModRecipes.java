package net.romeosnowblitz.hmh2.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Hmh2.MOD_ID, CheesePressRecipe.Serializer.ID), CheesePressRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Hmh2.MOD_ID, CheesePressRecipe.Type.ID), CheesePressRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Hmh2.MOD_ID, FreezerRecipe.Serializer.ID), FreezerRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Hmh2.MOD_ID, FreezerRecipe.Type.ID), FreezerRecipe.Type.INSTANCE);
    }
}
