package net.jaydizzle.moreutils.worldgen;

import net.jaydizzle.moreutils.MoreUtils;
import net.jaydizzle.moreutils.block.BlockInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class JDConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_COAL_KEY = registerKey("end_coal");

    public static final ResourceKey<ConfiguredFeature<?, ?>> END_COPPER_KEY = registerKey("end_copper");


    public static final ResourceKey<ConfiguredFeature<?, ?>> END_DIAMOND_KEY = registerKey("end_diamond");


    public static final ResourceKey<ConfiguredFeature<?, ?>> END_EMERALD_KEY = registerKey("end_emerald");


    public static final ResourceKey<ConfiguredFeature<?, ?>> END_GOLD_KEY = registerKey("end_gold");


    public static final ResourceKey<ConfiguredFeature<?, ?>> END_IRON_KEY = registerKey("end_iron");


    public static final ResourceKey<ConfiguredFeature<?, ?>> END_LAPIS_KEY = registerKey("end_lapis");


    public static final ResourceKey<ConfiguredFeature<?, ?>> END_REDSTONE_KEY = registerKey("end_redstone");


    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_IRON_KEY = registerKey("gravel_iron");


    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_COPPER_KEY = registerKey("gravel_copper");


    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_GOLD_KEY = registerKey("gravel_gold");


    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NAUTILUS_KEY = registerKey("overworld_nautilus");


    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZ_KEY = registerKey("overworld_quartz");


    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COAL_KEY = registerKey("nether_coal");


    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_IRON_KEY = registerKey("nether_iron");


    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LAPIS_KEY = registerKey("nether_lapis");


    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_REDSTONE_KEY = registerKey("nether_redstone");


    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_EMERALD_KEY = registerKey("nether_emerald");


    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COPPER_KEY = registerKey("nether_copper");


    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_DIAMOND_KEY = registerKey("nether_diamond");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        //RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest netherrackReplacables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);
        RuleTest gravelReplaceables = new BlockMatchTest(Blocks.GRAVEL);
        RuleTest graniteReplaceables = new BlockMatchTest(Blocks.GRANITE);
        RuleTest smoothStoneReplaceables = new BlockMatchTest(Blocks.STONE);

        List<OreConfiguration.TargetBlockState> overworldQuartz = List.of(
                OreConfiguration.target(graniteReplaceables, BlockInit.QUARTZ_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherRedstone = List.of(
                OreConfiguration.target(netherrackReplacables, BlockInit.NETHER_REDSTONE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherDiamond = List.of(
                OreConfiguration.target(netherrackReplacables, BlockInit.NETHER_DIAMOND_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherEmerald = List.of(
                OreConfiguration.target(netherrackReplacables, BlockInit.NETHER_EMERALD_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherIron = List.of(
                OreConfiguration.target(netherrackReplacables, BlockInit.NETHER_IRON_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherCoal = List.of(
                OreConfiguration.target(netherrackReplacables, BlockInit.NETHER_COAL_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherCopper = List.of(
                OreConfiguration.target(netherrackReplacables, BlockInit.NETHER_COPPER_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherLapis = List.of(
                OreConfiguration.target(netherrackReplacables, BlockInit.NETHER_LAPIS_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> endLapis = List.of(
                OreConfiguration.target(endReplaceables, BlockInit.END_LAPIS_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> endCoal = List.of(
                OreConfiguration.target(endReplaceables, BlockInit.END_COAL_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> endCopper = List.of(
                OreConfiguration.target(endReplaceables, BlockInit.END_COPPER_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> endDiamond = List.of(
                OreConfiguration.target(endReplaceables, BlockInit.END_DIAMOND_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> endEmerald = List.of(
                OreConfiguration.target(endReplaceables, BlockInit.END_EMERALD_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> endRedstone = List.of(
                OreConfiguration.target(endReplaceables, BlockInit.END_REDSTONE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> endIron = List.of(
                OreConfiguration.target(endReplaceables, BlockInit.END_IRON_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> endGold = List.of(
                OreConfiguration.target(endReplaceables, BlockInit.END_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldNautilus = List.of(
                OreConfiguration.target(smoothStoneReplaceables, BlockInit.NAUTILUS_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> gravelCopper = List.of(
                OreConfiguration.target(gravelReplaceables, BlockInit.GRAVEL_COPPER.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> gravelIron = List.of(
                OreConfiguration.target(gravelReplaceables, BlockInit.GRAVEL_IRON.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> gravelGold = List.of(
                OreConfiguration.target(gravelReplaceables, BlockInit.GRAVEL_GOLD.get().defaultBlockState()));

        register(context, OVERWORLD_QUARTZ_KEY, Feature.ORE, new OreConfiguration(overworldQuartz, 4));  //vein size

        register(context, NETHER_COAL_KEY, Feature.ORE, new OreConfiguration(netherCoal, 17));
        register(context, NETHER_COPPER_KEY, Feature.ORE, new OreConfiguration(netherCopper, 16));
        register(context, NETHER_IRON_KEY, Feature.ORE, new OreConfiguration(netherIron, 10));
        register(context, NETHER_LAPIS_KEY, Feature.ORE, new OreConfiguration(netherLapis, 10));
        register(context, NETHER_DIAMOND_KEY, Feature.ORE, new OreConfiguration(netherDiamond, 8));
        register(context, NETHER_EMERALD_KEY, Feature.ORE, new OreConfiguration(netherEmerald, 4));
        register(context, NETHER_REDSTONE_KEY, Feature.ORE, new OreConfiguration(netherRedstone, 8));

        register(context, END_COAL_KEY, Feature.ORE, new OreConfiguration(endCoal, 17));
        register(context, END_COPPER_KEY, Feature.ORE, new OreConfiguration(endCopper, 16));
        register(context, END_DIAMOND_KEY, Feature.ORE, new OreConfiguration(endDiamond, 8));
        register(context, END_EMERALD_KEY, Feature.ORE, new OreConfiguration(endEmerald, 4));
        register(context, END_IRON_KEY, Feature.ORE, new OreConfiguration(endIron, 10));
        register(context, END_LAPIS_KEY, Feature.ORE, new OreConfiguration(endLapis, 10));
        register(context, END_REDSTONE_KEY, Feature.ORE, new OreConfiguration(endRedstone, 8));
        register(context, END_GOLD_KEY, Feature.ORE, new OreConfiguration(endGold, 8));

        register(context, OVERWORLD_NAUTILUS_KEY, Feature.ORE, new OreConfiguration(overworldNautilus, 2));

        register(context, GRAVEL_COPPER_KEY, Feature.ORE, new OreConfiguration(gravelCopper, 10));
        register(context, GRAVEL_GOLD_KEY, Feature.ORE, new OreConfiguration(gravelGold, 8));
        register(context, GRAVEL_IRON_KEY, Feature.ORE, new OreConfiguration(gravelIron, 8));

    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MoreUtils.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
