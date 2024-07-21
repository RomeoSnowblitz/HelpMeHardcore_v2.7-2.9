package net.romeosnowblitz.hmh2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.item.custom.armor.*;
import net.romeosnowblitz.hmh2.item.custom.magic.perks.*;
import net.romeosnowblitz.hmh2.item.custom.magic.perks.single.*;
import net.romeosnowblitz.hmh2.item.custom.magic.swords.*;
import net.romeosnowblitz.hmh2.item.custom.tools.ModCarver;
import net.romeosnowblitz.hmh2.item.custom.tools.NetherHoe;

public class WarfareItems {

    public static final Item BANANA_HELMET = registerItem("banana_helmet",new ArialMovementArmorItem(ModArmorMaterials.BANANA, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BANANA_CHESTPLATE = registerItem("banana_chestplate", new ArialMovementArmorItem(ModArmorMaterials.BANANA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BANANA_LEGGINGS = registerItem("banana_leggings", new ArialMovementArmorItem(ModArmorMaterials.BANANA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BANANA_BOOTS = registerItem("banana_boots", new ArialMovementArmorItem(ModArmorMaterials.BANANA, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item BANANA_HORSE_ARMOR = registerItem("banana_horse_armor", new HorseArmorItem(7,"banana", new FabricItemSettings()));
    public static final Item BANANA_PICKAXE = registerItem("banana_pickaxe", new PickaxeItem(ModToolMaterials.BANANA, 1, -2.8f, new FabricItemSettings()));

    public static final Item BONE_HELMET = registerItem("bone_helmet", new UndergroundNourishmentArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BONE_CHESTPLATE = registerItem("bone_chestplate", new UndergroundNourishmentArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BONE_LEGGINGS = registerItem("bone_leggings", new UndergroundNourishmentArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BONE_BOOTS = registerItem("bone_boots", new UndergroundNourishmentArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item BONE_SWORD = registerItem("bone_sword", new SwordItem(ModToolMaterials.BONE, 6, -2.4f, new FabricItemSettings()));
    public static final Item BONE_SHOVEL = registerItem("bone_shovel", new ShovelItem(ModToolMaterials.BONE, 4.5f, -2.8f, new FabricItemSettings()));
    public static final Item BONE_PICKAXE = registerItem("bone_pickaxe", new PickaxeItem(ModToolMaterials.BONE, 4, -2.8f, new FabricItemSettings()));
    public static final Item BONE_AXE = registerItem("bone_axe", new AxeItem(ModToolMaterials.BONE, 9, -3.1f, new FabricItemSettings()));
    public static final Item BONE_HOE = registerItem("bone_hoe", new HoeItem(ModToolMaterials.BONE, 1, -1f, new FabricItemSettings()));

    public static final Item CLOTH_HELMET = registerItem("cloth_helmet", new ClothPerk(ModArmorMaterials.CLOTH, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item CLOTH_CHESTPLATE = registerItem("cloth_chestplate", new ClothPerk(ModArmorMaterials.CLOTH, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item CLOTH_LEGGINGS = registerItem("cloth_leggings", new ClothPerk(ModArmorMaterials.CLOTH, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item CLOTH_BOOTS = registerItem("cloth_boots", new ClothPerk(ModArmorMaterials.CLOTH, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item DRAMAGEON_HELMET = registerItem("dramageon_helmet", new ArmorItem(ModArmorMaterials.DRAMAGEON, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DRAMAGEON_CHESTPLATE = registerItem("dramageon_chestplate", new ArmorItem(ModArmorMaterials.DRAMAGEON, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item DRAMAGEON_LEGGINGS = registerItem("dramageon_leggings", new ArmorItem(ModArmorMaterials.DRAMAGEON, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item DRAMAGEON_BOOTS = registerItem("dramageon_boots", new ArmorItem(ModArmorMaterials.DRAMAGEON, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item DRAMAGEON_SWORD = registerItem("dramageon_sword", new SwordItem(ModToolMaterials.ENDER_INGOT, 10, -2.4F, new FabricItemSettings()));
    public static final Item DRAMAGEON_SHOVEL = registerItem("dramageon_shovel", new ShovelItem(ModToolMaterials.ENDER_INGOT, 8.5F, -3.0F, new FabricItemSettings()));
    public static final Item DRAMAGEON_PICKAXE = registerItem("dramageon_pickaxe", new PickaxeItem(ModToolMaterials.ENDER_INGOT, 8, -2.8F, new FabricItemSettings()));
    public static final Item DRAMAGEON_AXE = registerItem("dramageon_axe", new AxeItem(ModToolMaterials.ENDER_INGOT, 11.5F, -3.0F, new FabricItemSettings()));
    public static final Item DRAMAGEON_HOE = registerItem("dramageon_hoe", new NetherHoe(ModToolMaterials.ENDER_INGOT, 1.2f, 0f, new FabricItemSettings()));

    public static final Item EMERALD_HELMET = registerItem("emerald_helmet", new EmeraldPerk(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate", new EmeraldPerk(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings", new EmeraldPerk(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots", new EmeraldPerk(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item FUR_HELMET = registerItem("fur_helmet", new FurPerk(ModArmorMaterials.FUR, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item FUR_CHESTPLATE = registerItem("fur_chestplate", new FurPerk(ModArmorMaterials.FUR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item FUR_LEGGINGS = registerItem("fur_leggings", new FurPerk(ModArmorMaterials.FUR, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item FUR_BOOTS = registerItem("fur_boots", new FurPerk(ModArmorMaterials.FUR, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item GLASS_LEGGINGS = registerItem("glass_leggings", new ArialSightArmorItem(ModArmorMaterials.GLASS, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item HELLSTONE_HELMET = registerItem("hellstone_helmet", new HellstonePerk(ModArmorMaterials.HELLSTONE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item HELLSTONE_CHESTPLATE = registerItem("hellstone_chestplate", new HellstonePerk(ModArmorMaterials.HELLSTONE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item HELLSTONE_LEGGINGS = registerItem("hellstone_leggings", new HellstonePerk(ModArmorMaterials.HELLSTONE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item HELLSTONE_BOOTS = registerItem("hellstone_boots", new HellstonePerk(ModArmorMaterials.HELLSTONE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));
    public static final Item HELLSTONE_SWORD = registerItem("hellstone_sword", new SwordItem(ModToolMaterials.HELLSTONE,8,-2.4f, new FabricItemSettings().fireproof()));
    public static final Item HELLSTONE_SHOVEL = registerItem("hellstone_shovel", new ShovelItem(ModToolMaterials.HELLSTONE,6.5f,-3f, new FabricItemSettings().fireproof()));
    public static final Item HELLSTONE_PICKAXE = registerItem("hellstone_pickaxe", new PickaxeItem(ModToolMaterials.HELLSTONE,6,-2.8f, new FabricItemSettings().fireproof()));
    public static final Item HELLSTONE_AXE = registerItem("hellstone_axe", new AxeItem(ModToolMaterials.HELLSTONE,10,-3f, new FabricItemSettings().fireproof()));
    public static final Item HELLSTONE_HOE = registerItem("hellstone_hoe", new NetherHoe(ModToolMaterials.HELLSTONE,1,0f, new FabricItemSettings().fireproof()));

    public static final Item LIFE_HELMET = registerItem("life_helmet", new HeartPerk(ModArmorMaterials.LIFE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item LIFE_CHESTPLATE = registerItem("life_chestplate", new HeartPerk(ModArmorMaterials.LIFE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item LIFE_LEGGINGS = registerItem("life_leggings", new HeartPerk(ModArmorMaterials.LIFE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item LIFE_BOOTS = registerItem("life_boots", new HeartPerk(ModArmorMaterials.LIFE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item QUAERITE_HELMET = registerItem("quaerite_helmet", new QuaeritePerk(ModArmorMaterials.QUAERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item QUAERITE_CHESTPLATE = registerItem("quaerite_chestplate", new QuaeritePerk(ModArmorMaterials.QUAERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item QUAERITE_LEGGINGS = registerItem("quaerite_leggings", new QuaeritePerk(ModArmorMaterials.QUAERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item QUAERITE_BOOTS = registerItem("quaerite_boots", new QuaeritePerk(ModArmorMaterials.QUAERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item QUAERITE_SWORD = registerItem("quaerite_sword", new SwordItem(ModToolMaterials.QUAERITE,  10, -2.4F, new FabricItemSettings()));
    public static final Item QUAERITE_SHOVEL = registerItem("quaerite_shovel", new ShovelItem(ModToolMaterials.QUAERITE, 8.5F, -3.0F, new FabricItemSettings()));
    public static final Item QUAERITE_PICKAXE = registerItem("quaerite_pickaxe", new PickaxeItem(ModToolMaterials.QUAERITE, 8, -2.8F, new FabricItemSettings()));
    public static final Item QUAERITE_AXE = registerItem("quaerite_axe", new AxeItem(ModToolMaterials.QUAERITE, 11.5F, -3.0F, new FabricItemSettings()));
    public static final Item QUAERITE_HOE = registerItem("quaerite_hoe", new NetherHoe(ModToolMaterials.QUAERITE, 1.2f, 0f, new FabricItemSettings()));

    public static final Item QUEEN_BEE_HELMET = registerItem("queen_bee_helmet", new QueenBeePerk(ModArmorMaterials.BEE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item QUEEN_BEE_CHESTPLATE = registerItem("queen_bee_chestplate", new QueenBeePerk(ModArmorMaterials.BEE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item QUEEN_BEE_LEGGINGS = registerItem("queen_bee_leggings", new QueenBeePerk(ModArmorMaterials.BEE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item QUEEN_BEE_BOOTS = registerItem("queen_bee_boots", new ArmorItem(ModArmorMaterials.BEE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item QUEEN_BEE_STINGER = registerItem("queen_bee_stinger", new PoisonSword(ModToolMaterials.POISON_SAC, 8, -2f, new FabricItemSettings()));

    public static final Item SUMOLTERITE_HELMET = registerItem("sumolterite_helmet", new SumolteritePerk(ModArmorMaterials.SUMOLTERITE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item SUMOLTERITE_CHESTPLATE = registerItem("sumolterite_chestplate", new SumolteritePerk(ModArmorMaterials.SUMOLTERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item SUMOLTERITE_LEGGINGS = registerItem("sumolterite_leggings", new SumolteritePerk(ModArmorMaterials.SUMOLTERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item SUMOLTERITE_BOOTS = registerItem("sumolterite_boots", new SumolteritePerk(ModArmorMaterials.SUMOLTERITE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));
    public static final Item SUMOLTERITE_SWORD = registerItem("sumolterite_sword", new FireSword(ModToolMaterials.SUMOLTERITE, 9, -2.4f, new FabricItemSettings().fireproof()));
    public static final Item SUMOLTERITE_SHOVEL = registerItem("sumolterite_shovel", new ShovelItem(ModToolMaterials.SUMOLTERITE, 7.5f, -3f, new FabricItemSettings().fireproof()));
    public static final Item SUMOLTERITE_PICKAXE = registerItem("sumolterite_pickaxe", new PickaxeItem(ModToolMaterials.SUMOLTERITE, 7, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item SUMOLTERITE_AXE = registerItem("sumolterite_axe", new AxeItem(ModToolMaterials.SUMOLTERITE, 10.5f, -3f, new FabricItemSettings().fireproof()));
    public static final Item SUMOLTERITE_HOE = registerItem("sumolterite_hoe", new NetherHoe(ModToolMaterials.SUMOLTERITE, 1.1f, 0f, new FabricItemSettings().fireproof()));

    public static final Item WITHER_BONE_HELMET = registerItem("wither_bone_helmet", new WitherPerk(ModArmorMaterials.WITHER_BONE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item WITHER_BONE_CHESTPLATE = registerItem("wither_bone_chestplate", new WitherPerk(ModArmorMaterials.WITHER_BONE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item WITHER_BONE_LEGGINGS = registerItem("wither_bone_leggings", new WitherPerk(ModArmorMaterials.WITHER_BONE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item WITHER_BONE_BOOTS = registerItem("wither_bone_boots", new WitherPerk(ModArmorMaterials.WITHER_BONE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item WOODEN_HELMET = registerItem("wooden_helmet", new WoodenPerk(ModArmorMaterials.WOODEN, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item WOODEN_CHESTPLATE = registerItem("wooden_chestplate", new WoodenPerk(ModArmorMaterials.WOODEN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item WOODEN_LEGGINGS = registerItem("wooden_leggings", new WoodenPerk(ModArmorMaterials.WOODEN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item WOODEN_BOOTS = registerItem("wooden_boots", new WoodenPerk(ModArmorMaterials.WOODEN, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item WEAPON = registerItem("weapon", new SwordItem(ModToolMaterials.MOD_IRON, 10, -1.0f, new FabricItemSettings()));
    public static final Item ANCHOR = registerItem("anchor", new AnchorItem(ModToolMaterials.MOD_IRON, 10, -3.3f, new FabricItemSettings()));
    public static final Item BATTLESTAFF = registerItem("battlestaff", new SwordItem(ModToolMaterials.STICK, 3, -2.7f, new FabricItemSettings()));
    public static final Item BATTLESTAFF_OF_TERROR = registerItem("battlestaff_of_terror", new SwordItem(ModToolMaterials.ENDER_INGOT, 9, -2.7f, new FabricItemSettings()));
    public static final Item BLAZE_CUTTER = registerItem("blaze_cutter", new PickaxeItem(ModToolMaterials.BLAZE, 8, -2.5f, new FabricItemSettings()));
    public static final Item BONECLUB = registerItem("boneclub", new SwordItem(ModToolMaterials.BONE, 10, -3.2f, new FabricItemSettings()));
    public static final Item BREAD_KNIFE = registerItem("bread_knife", new ModCarver(ModToolMaterials.MOD_IRON, 1, 0f, new FabricItemSettings()));
    public static final Item BROADSWORD = registerItem("broadsword", new SwordItem(ModToolMaterials.MOD_IRON, 8, -2.8f, new FabricItemSettings()));
    public static final Item BROKEN_SAWBLADE = registerItem("broken_sawblade", new SwordItem(ModToolMaterials.BONE, 5, -2.8f, new FabricItemSettings()));
    public static final Item CHILL_GALE_KNIFE = registerItem("chill_gale_knife", new SwordItem(ModToolMaterials.MYSTERIOUS_DEBRIS, 6, -2.4f, new FabricItemSettings()));
    public static final Item CLAYMORE = registerItem("claymore", new ClayHawk(ModToolMaterials.MOD_IRON, 6, -2.5f, new FabricItemSettings()));
    public static final Item CLUB = registerItem("club", new SwordItem(ModToolMaterials.CLUB, 10, -3.3f, new FabricItemSettings()));
    public static final Item CORAL_BLADE = registerItem("coral_blade", new SwordItem(ModToolMaterials.CORAL, 2, -1.0f, new FabricItemSettings()));
    public static final Item CUTLASS = registerItem("cutlass", new SwordItem(ModToolMaterials.MOD_IRON, 4, 0f, new FabricItemSettings()));
    public static final Item ENCRUSTED_ANCHOR = registerItem("encrusted_anchor", new AnchorItem(ModToolMaterials.MOD_GOLD, 10, -3.2f, new FabricItemSettings()));
    public static final Item ETERNAL_KNIFE = registerItem("eternal_knife", new SwordItem(ModToolMaterials.ENDER_INGOT, 9, -2.3f, new FabricItemSettings()));
    public static final Item FROST_FANG = registerItem("frost_fang", new SlownessSword(ModToolMaterials.BLUE_ICE, 5, 0f, new FabricItemSettings()));
    public static final Item FIREBRAND = registerItem("firebrand", new AxeItem(ModToolMaterials.HELLSTONE, 10, -2.9f, new FabricItemSettings()));
    public static final Item GLAIVE = registerItem("glaive", new SwordItem(ModToolMaterials.MOD_IRON, 4, -2.7f, new FabricItemSettings()));
    public static final Item GRAVE_BANE = registerItem("grave_bane", new SwordItem(ModToolMaterials.MOD_GOLD, 8, -3f, new FabricItemSettings()));
    public static final Item GREAT_AXEBLADE = registerItem("great_axeblade", new AxeItem(ModToolMaterials.MOD_IRON, 9, -3.1f, new FabricItemSettings()));
    public static final Item GROWING_STAFF = registerItem("growing_staff", new SwordItem(ModToolMaterials.STICK, 6, -2.7f, new FabricItemSettings()));
    public static final Item HAWKBRAND = registerItem("hawkbrand", new HawkHeart(ModToolMaterials.MOD_IRON, 7, -2.50f, new FabricItemSettings()));
    public static final Item HEARTSTEALER = registerItem("heartstealer", new HeartStealerSword(ModToolMaterials.MOD_IRON, 8, -2.50f, new FabricItemSettings()));
    public static final Item HIGHLAND_AXE = registerItem("highland_axe", new AxeItem(ModToolMaterials.MOD_IRON, 8, -3.00f, new FabricItemSettings()));
    public static final Item MECHANIZED_SAWBLADE = registerItem("mechanized_sawblade", new SwordItem(ModToolMaterials.MOD_IRON, 9, -2.5f, new FabricItemSettings()));
    public static final Item MOON_DAGGER = registerItem("moon_dagger", new SwordItem(ModToolMaterials.MOD_IRON, 2, -1f, new FabricItemSettings()));
    public static final Item NAMELESS_BLADE = registerItem("nameless_blade", new SwordItem(ModToolMaterials.ENDER_DUST, 8, -2.7f, new FabricItemSettings()));
    public static final Item NIGHTMARES_BITE = registerItem("nightmares_bite", new PoisonSword(ModToolMaterials.POISON_SAC, 1, -1.00f, new FabricItemSettings()));
    public static final Item OBSIDIAN_CLAYMORE = registerItem("obsidian_claymore", new SwordItem(ModToolMaterials.ENDER_INGOT, 11, -2.5f, new FabricItemSettings()));
    public static final Item RESOLUTE_TEMPEST_KNIFE = registerItem("resolute_tempest_knife", new SwordItem(ModToolMaterials.MYSTERIOUS_DEBRIS, 8, -2.4f, new FabricItemSettings()));
    public static final Item SHEER_DAGGER = registerItem("sheer_dagger", new SwordItem(ModToolMaterials.MOD_IRON, 2, -2.0f, new FabricItemSettings()));
    public static final Item SICKEL = registerItem("sickel", new SwordItem(ModToolMaterials.MOD_IRON, 3, 0f, new FabricItemSettings()));
    public static final Item SOUL_KNIFE = registerItem("soul_knife", new SwordItem(ModToolMaterials.MOD_IRON, 8, -2.6f, new FabricItemSettings()));
    public static final Item SPONGE_STRIKER = registerItem("sponge_striker", new SwordItem(ModToolMaterials.MOD_IRON, 6, -2.3f, new FabricItemSettings()));
    public static final Item TEMPEST_KNIFE = registerItem("tempest_knife", new SwordItem(ModToolMaterials.MOD_IRON, 6, -2.6f, new FabricItemSettings()));
    public static final Item THE_LAST_LAUGH = registerItem("the_last_laugh", new SwordItem(ModToolMaterials.MOD_GOLD, 6, 0f, new FabricItemSettings()));
    public static final Item THE_STARLESS_NIGHT = registerItem("the_starless_night", new SwordItem(ModToolMaterials.ENDER_INGOT, 12, -2.4f, new FabricItemSettings()));
    public static final Item TRUTHSEEKER = registerItem("truthseeker", new SwordItem(ModToolMaterials.MOD_IRON, 7, -2.5f, new FabricItemSettings()));
    public static final Item VENOM_GLAIVE = registerItem("venom_glaive", new PoisonSword(ModToolMaterials.POISON_SAC, 6, -3.00f, new FabricItemSettings()));
    public static final Item VINE_WHIP = registerItem("vine_whip", new SwordItem(ModToolMaterials.VINE, 5, -3f, new FabricItemSettings()));
    public static final Item WHIP = registerItem("whip", new SwordItem(ModToolMaterials.SILK, 4, -2f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Hmh2.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Hmh2.LOGGER.info("Registering Mod Items for " + Hmh2.MOD_ID);
    }
}
