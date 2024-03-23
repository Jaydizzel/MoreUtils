package com.jaydizzle.moreutils.worldgen;

import com.jaydizzle.moreutils.MoreUtils;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;
public class JDPlacedFeatures {
    public static final ResourceKey<PlacedFeature> OVERWORLD_ORE_PLACED_KEY = registerKey("overworld_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_ORE_PLACED_KEY = registerKey("nether_ore_placed");
    public static final ResourceKey<PlacedFeature> END_ORE_PLACED_KEY = registerKey("end_ore_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, OVERWORLD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.OVERWORLD_ORE_KEY),
                JDOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, NETHER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.NETHER_ORE_KEY),
                JDOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, END_ORE_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.END_ORE_KEY),
                JDOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MoreUtils.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
