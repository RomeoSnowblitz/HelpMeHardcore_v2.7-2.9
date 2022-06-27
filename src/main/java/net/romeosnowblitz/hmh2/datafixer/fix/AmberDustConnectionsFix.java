package net.romeosnowblitz.hmh2.datafixer.fix;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import net.minecraft.datafixer.TypeReferences;
import net.romeosnowblitz.hmh2.datafixer.fix.AmberDustConnectionsFix;

public class AmberDustConnectionsFix extends DataFix {
    public AmberDustConnectionsFix(Schema outputSchema) {
        super(outputSchema, false);
    }

    @Override
    protected TypeRewriteRule makeRule() {
        Schema schema = this.getInputSchema();
        return this.fixTypeEverywhereTyped("AmberDustConnectionsFix", schema.getType(TypeReferences.BLOCK_STATE), typed -> typed.update(DSL.remainderFinder(), this::updateBlockState));
    }

    private <T> Dynamic<T> updateBlockState(Dynamic<T> dynamic) {
        boolean bl = dynamic.get("Name").asString().result().filter("hmh2:amber_dust"::equals).isPresent();
        if (!bl) {
            return dynamic;
        }
        return dynamic.update("Properties", dynamic2 -> {
            String string = dynamic2.get("east").asString("none");
            String string2 = dynamic2.get("west").asString("none");
            String string3 = dynamic2.get("north").asString("none");
            String string4 = dynamic2.get("south").asString("none");
            boolean test = AmberDustConnectionsFix.hasObsoleteValue(string) || AmberDustConnectionsFix.hasObsoleteValue(string2);
            boolean bl2 = AmberDustConnectionsFix.hasObsoleteValue(string3) || AmberDustConnectionsFix.hasObsoleteValue(string4);
            String string5 = !AmberDustConnectionsFix.hasObsoleteValue(string) && !bl2 ? "side" : string;
            String string6 = !AmberDustConnectionsFix.hasObsoleteValue(string2) && !bl2 ? "side" : string2;
            String string7 = !AmberDustConnectionsFix.hasObsoleteValue(string3) && !bl ? "side" : string3;
            String string8 = !AmberDustConnectionsFix.hasObsoleteValue(string4) && !bl ? "side" : string4;
            return dynamic2.update("east", dynamiceast -> dynamic.createString(string5)).update("west", dynamicwest -> dynamic.createString(string6)).update("north", dynamicnorth -> dynamic.createString(string7)).update("south", dynamicsouth -> dynamic.createString(string8));
        });
    }

    private static boolean hasObsoleteValue(String string) {
        return !"none".equals(string);
    }
}