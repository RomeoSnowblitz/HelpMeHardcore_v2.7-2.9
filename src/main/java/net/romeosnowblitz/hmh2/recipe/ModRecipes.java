package net.romeosnowblitz.hmh2.recipe;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Hmh2.MOD_ID, CheesePressRecipe.Serializer.ID), CheesePressRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Hmh2.MOD_ID, CheesePressRecipe.Type.ID), CheesePressRecipe.Type.INSTANCE);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Hmh2.MOD_ID, FreezerRecipe.Serializer.ID), FreezerRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Hmh2.MOD_ID, FreezerRecipe.Type.ID), FreezerRecipe.Type.INSTANCE);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Hmh2.MOD_ID, IceCreamMakerRecipe.Serializer.ID), IceCreamMakerRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Hmh2.MOD_ID, IceCreamMakerRecipe.Type.ID), IceCreamMakerRecipe.Type.INSTANCE);
    }
}
