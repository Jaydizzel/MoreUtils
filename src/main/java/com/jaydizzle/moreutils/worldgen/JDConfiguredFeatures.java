package com.jaydizzle.moreutils.worldgen;

import com.jaydizzle.moreutils.MoreUtils;
import com.jaydizzle.moreutils.block.JDOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class JDConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_KEY = registerKey("overworld_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ORE_KEY = registerKey("nether_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ORE_KEY = registerKey("end_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OCEAN_ORE_KEY = registerKey("ocean_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_ORE_KEY = registerKey("gravel_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest netherrackReplacables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);
        RuleTest gravelReplaceables = new BlockMatchTest(Blocks.GRAVEL);
        RuleTest graniteReplaceables = new BlockMatchTest(Blocks.GRANITE);
        RuleTest smoothStoneReplaceables = new BlockMatchTest(Blocks.STONE);


        List<OreConfiguration.TargetBlockState> overworldOres = List.of(
                OreConfiguration.target(graniteReplaceables, JDOres.QUARTZ_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherOres = List.of(
                OreConfiguration.target(netherrackReplacables, JDOres.NETHER_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(netherrackReplacables, JDOres.NETHER_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(netherrackReplacables, JDOres.NETHER_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(netherrackReplacables, JDOres.NETHER_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(netherrackReplacables, JDOres.NETHER_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(netherrackReplacables, JDOres.NETHER_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(netherrackReplacables, JDOres.NETHER_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> endOres = List.of(
                OreConfiguration.target(endReplaceables, JDOres.END_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(endReplaceables, JDOres.END_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(endReplaceables, JDOres.END_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(endReplaceables, JDOres.END_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(endReplaceables, JDOres.END_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(endReplaceables, JDOres.END_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(endReplaceables, JDOres.END_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(endReplaceables, JDOres.END_LAPIS_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> oceanOres = List.of(
                OreConfiguration.target(smoothStoneReplaceables, JDOres.NAUTILUS_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> gravelOres = List.of(
                OreConfiguration.target(gravelReplaceables, JDOres.GRAVEL_IRON.get().defaultBlockState()),
                OreConfiguration.target(gravelReplaceables, JDOres.GRAVEL_GOLD.get().defaultBlockState()),
                OreConfiguration.target(gravelReplaceables, JDOres.GRAVEL_COPPER.get().defaultBlockState()));

        register(context, OVERWORLD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOres, 9));  //vein size
        register(context, NETHER_ORE_KEY, Feature.ORE, new OreConfiguration(netherOres, 9));
        register(context, END_ORE_KEY, Feature.ORE, new OreConfiguration(endOres, 9));
        register(context, OCEAN_ORE_KEY, Feature.ORE, new OreConfiguration(oceanOres, 1));
        register(context, GRAVEL_ORE_KEY, Feature.ORE, new OreConfiguration(gravelOres, 5));

    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MoreUtils.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
