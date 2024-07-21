package net.romeosnowblitz.hmh2.loot;

import com.google.common.collect.Sets;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

import java.util.Collections;
import java.util.Set;

public class ModLoot {

    public ModLoot() {
    }

    public static final Identifier FISHING_JUNK_GAMEPLAY =  register("gameplay/fishing/junk");

    private static Identifier register(String id) {
        return registerLootTable(new Identifier(Hmh2.MOD_ID, id));
    }

    private static Identifier registerLootTable(Identifier id) {
        if (Sets.newHashSet().add(id)) {
            return id;
        } else {
            throw new IllegalArgumentException(id + " is already a registered built-in loot table");
        }
    }

    public static Set<Identifier> getAll() {
        return Collections.unmodifiableSet(Sets.newHashSet());
    }

}
