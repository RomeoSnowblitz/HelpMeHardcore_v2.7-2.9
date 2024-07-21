package net.romeosnowblitz.hmh2.item.custom.magic;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

public class SummoningPowder extends Item {
    public SummoningPowder(Settings settings) {
        super(settings);
    }

    //good (42)
    // allay snow golem, iron golem sniffer, bat giant,
    //cod, salmon, tropical fish, tadpole, pufferfish, dolphin, squid
    //villager wandering trader bee, pig, fox, sheep, rabbit, goat,
    //cow, mooshroom, mule, donkey, llama, trader llama
    //zombie horse, SHorse, Horse, Camel, panda, frog, axolotl
    //chicken, turtle, polar bear, strider, ocelot, wolf, cat, parrot

    //not so good (34)
    //Biome
    //silverfish, warden, endermite, zombie, drowned, ZVillager, husk,
    //blaze, zoglin, skeleton, WSkeleton, Stray
    //PBrute, piglin, wither, vex, EGuardian, guardian
    //ravager, vindicator, pillager, illusioner, evoker, witch
    //enderman, creeper, spider, Ender Dragon
    //phantom ghast skulker, slime magma_cube, hoglin


}
