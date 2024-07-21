package net.romeosnowblitz.hmh2.util;

import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.client.item.CompassAnglePredicateProvider;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.item.ModItems;
import net.romeosnowblitz.hmh2.item.custom.test.BloodCompass;

public class ModModelPredicateProvider {
    public static void registerModModels() {

        registerBambooBow(ModItems.BAMBOO_BOW);
        registerBloodCompass(ModItems.BLOOD_COMPASS);
    }

    private static void registerBambooBow(Item bow){
        FabricModelPredicateProviderRegistry.register(bow, new Identifier("pull"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0f;
                    }
                    if (entity.getActiveItem() != stack) {
                        return 0.0f;
                    }
                    return (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 10.0f;
                });

        FabricModelPredicateProviderRegistry.register(bow, new Identifier("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem()
                        && entity.getActiveItem() == stack ? 1.0f : 0.0f);

    }
    private static void registerBloodCompass(Item item){
        FabricModelPredicateProviderRegistry.register(item, new Identifier("angle"),
                new CompassAnglePredicateProvider((world, stack, entity) -> stack.hasNbt() ? BloodCompass.createVictimPos(world, stack.getOrCreateNbt()) : null));
    }


}
