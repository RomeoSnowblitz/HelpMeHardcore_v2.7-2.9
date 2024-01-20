package net.romeosnowblitz.hmh2.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;

public class ModParticleTypes {

    public static final DefaultParticleType PARTICLELESS = registerParticle("particleless", FabricParticleTypes.simple());
    public static final DefaultParticleType PURPLE_FLAME = registerParticle("purple_flame", FabricParticleTypes.simple());

    public static DefaultParticleType registerParticle(String name, DefaultParticleType particleType){
        return Registry.register(Registries.PARTICLE_TYPE, new Identifier(Hmh2.MOD_ID, name), particleType);
    }

    public static void registerParticles() {

    }


}
