package net.romeosnowblitz.hmh2.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.BlockView;
import net.romeosnowblitz.hmh2.Hmh2;
import net.romeosnowblitz.hmh2.block.custom.wire.magic_dust.*;
import net.romeosnowblitz.hmh2.item.ModItemGroup;

public class MagicBlocks {

    //Gem Generation (~48)
    public static final Block AMBER_ORE = resisterBlock("amber_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block ANDALUSITE_ORE = resisterBlock("andalusite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block AQUAMARINE_ORE = resisterBlock("aquamarine_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block CHARCOAL_ORE = resisterBlock("charcoal_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block CITRINE_ORE = resisterBlock("citrine_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DIOPSIDE_ORE = resisterBlock("diopside_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block GARNET_ORE = resisterBlock("garnet_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block HESSONITE_ORE = resisterBlock("hessonite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block MALICHITE_ORE = resisterBlock("malichite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block MOONSTONE_ORE = resisterBlock("moonstone_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block OPAL_ORE = resisterBlock("opal_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block PERIDOT_ORE = resisterBlock("peridot_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block PREHNITE_ORE = resisterBlock("prehnite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block RUBY_ORE = resisterBlock("ruby_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block SAPPHIRE_ORE = resisterBlock("sapphire_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block SMOKY_QUARTZ_ORE = resisterBlock("smoky_quartz_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block SPESSARITE_ORE = resisterBlock("spessarite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block SPHENE_ORE = resisterBlock("sphene_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block SPINEL_ORE = resisterBlock("spinel_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block TANZANITE_ORE = resisterBlock("tanzanite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block TOPAZ_ORE = resisterBlock("topaz_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block TORMALINE_ORE = resisterBlock("tormaline_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block TSAVORITE_ORE = resisterBlock("tsavorite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block ZIRCON_ORE = resisterBlock("zircon_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_AMBER_ORE = resisterBlock("deepslate_amber_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_ANDALUSITE_ORE = resisterBlock("deepslate_andalusite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_AQUAMARINE_ORE = resisterBlock("deepslate_aquamarine_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_CHARCOAL_ORE = resisterBlock("deepslate_charcoal_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_CITRINE_ORE = resisterBlock("deepslate_citrine_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_DIOPSIDE_ORE = resisterBlock("deepslate_diopside_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_GARNET_ORE = resisterBlock("deepslate_garnet_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_HESSONITE_ORE = resisterBlock("deepslate_hessonite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_MALICHITE_ORE = resisterBlock("deepslate_malichite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_MOONSTONE_ORE = resisterBlock("deepslate_moonstone_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_OPAL_ORE = resisterBlock("deepslate_opal_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_PERIDOT_ORE = resisterBlock("deepslate_peridot_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_PREHNITE_ORE = resisterBlock("deepslate_prehnite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_RUBY_ORE = resisterBlock("deepslate_ruby_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SAPPHIRE_ORE = resisterBlock("deepslate_sapphire_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SMOKY_QUARTZ_ORE = resisterBlock("deepslate_smoky_quartz_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SPESSARITE_ORE = resisterBlock("deepslate_spessarite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SPHENE_ORE = resisterBlock("deepslate_sphene_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_SPINEL_ORE = resisterBlock("deepslate_spinel_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_TANZANITE_ORE = resisterBlock("deepslate_tanzanite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_TOPAZ_ORE = resisterBlock("deepslate_topaz_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_TORMALINE_ORE = resisterBlock("deepslate_tormaline_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_TSAVORITE_ORE = resisterBlock("deepslate_tsavorite_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);
    public static final Block DEEPSLATE_ZIRCON_ORE = resisterBlock("deepslate_zircon_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroup.MAGIC);

    public static final Block AMBER_DUST = resisterBlock("amber_dust", new AmberDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block ANDALUSITE_DUST = resisterBlock("andalusite_dust", new AndalusiteDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block AQUAMARINE_DUST = resisterBlock("aquamarine_dust", new AquamarineDust(AbstractBlock.Settings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block CITRINE_DUST = resisterBlock("citrine_dust", new CitrineDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block DIOPSIDE_DUST = resisterBlock("diopside_dust", new DiopsideDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block GARNET_DUST = resisterBlock("garnet_dust", new GarnetDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block HESSONITE_DUST = resisterBlock("hessonite_dust", new HessoniteDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block MALICHITE_DUST = resisterBlock("malichite_dust", new MalichiteDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block MOONSTONE_DUST = resisterBlock("moonstone_dust", new MoonstoneDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block OPAL_DUST = resisterBlock("opal_dust", new OpalDust(AbstractBlock.Settings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block PERIDOT_DUST = resisterBlock("peridot_dust", new PeridotDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block PREHNITE_DUST = resisterBlock("prehnite_dust", new PreniteDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block RUBY_DUST = resisterBlock("ruby_dust", new RubyDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SAPPHIRE_DUST = resisterBlock("sapphire_dust", new SapphireDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SMOKY_QUARTZ_DUST = resisterBlock("smoky_quartz_dust", new SmokyQuartzDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SPESSARITE_DUST = resisterBlock("spessarite_dust", new SpessariteDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SPHENE_DUST = resisterBlock("sphene_dust", new SpheneDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block SPINEL_DUST = resisterBlock("spinel_dust", new SpinelDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block TANZANITE_DUST = resisterBlock("tanzanite_dust", new TanzaniteDust(AbstractBlock.Settings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block TOPAZ_DUST = resisterBlock("topaz_dust", new TopazDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block TORMALINE_DUST = resisterBlock("tormaline_dust", new TormalineDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block TSAVORITE_DUST = resisterBlock("tsavorite_dust", new TsavoriteDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block ZIRCON_DUST = resisterBlock("zircon_dust", new ZirconDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block AMETHYST_DUST = resisterBlock("amethyst_dust", new AmethystDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block CHARCOAL_DUST = resisterBlock("charcoal_dust", new CharcoalDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block COAL_DUST = resisterBlock("coal_dust", new CoalDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block COPPER_DUST = resisterBlock("copper_dust", new CopperDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block DIAMOND_DUST = resisterBlock("diamond_dust", new DiamondDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block EMERALD_DUST = resisterBlock("emerald_dust", new EmeraldDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block FLINT_DUST = resisterBlock("flint_dust", new FlintDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block GOLD_DUST = resisterBlock("gold_dust", new GoldDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block IRON_DUST = resisterBlock("iron_dust", new IronDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);
    public static final Block LAPIS_DUST = resisterBlock("lapis_dust", new LapisDust(FabricBlockSettings.of(Material.DECORATION).nonOpaque().breakInstantly()), ModItemGroup.MAGIC);

    private static Boolean always(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return true;
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registries.BLOCK, new Identifier(Hmh2.MOD_ID, name), block);
    }

    private static Block resisterBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Hmh2.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        Item item = Registry.register((Registries.ITEM), new Identifier(Hmh2.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlock() {
        Hmh2.LOGGER.info("Registering ModBlocks for " + Hmh2.MOD_ID);
    }
}
