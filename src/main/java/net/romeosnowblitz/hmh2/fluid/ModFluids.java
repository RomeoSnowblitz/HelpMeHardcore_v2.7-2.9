package net.romeosnowblitz.hmh2.fluid;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModFluids {
    public static final FlowableFluid CHOCOLATE_MILK_STILL = register("chocolate_milk_still", new ChocolateMilkFluid.Still());
    public static final FlowableFluid CHOCOLATE_MILK_FLOWING = register("chocolate_milk_flowing", new ChocolateMilkFluid.Flowing());
    public static final FlowableFluid HEATED_OIL_STILL = register("heated_oil_still", new HeatedOilFluid.Still());
    public static final FlowableFluid HEATED_OIL_FLOWING = register("heated_oil_flowing", new HeatedOilFluid.Flowing());
    public static final FlowableFluid OIL_STILL = register("oil_still", new OilFluid.Still());
    public static final FlowableFluid OIL_FLOWING = register("oil_flowing", new OilFluid.Flowing());


    private static FlowableFluid register(String name, FlowableFluid flowableFluid) {
        return Registry.register(Registry.FLUID, new Identifier(Hmh2.MOD_ID, name), flowableFluid);
    }
}
