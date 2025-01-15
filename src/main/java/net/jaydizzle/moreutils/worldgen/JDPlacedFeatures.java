package net.jaydizzle.moreutils.worldgen;

import net.jaydizzle.moreutils.MoreUtils;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;
public class JDPlacedFeatures {
    public static final ResourceKey<PlacedFeature> END_COAL_PLACED_KEY = registerKey("end_coal_placed");

    public static final ResourceKey<PlacedFeature> END_COPPER_PLACED_KEY = registerKey("end_copper_placed");


    public static final ResourceKey<PlacedFeature> END_DIAMOND_PLACED_KEY = registerKey("end_diamond_placed");


    public static final ResourceKey<PlacedFeature> END_EMERALD_PLACED_KEY = registerKey("end_emerald_placed");


    public static final ResourceKey<PlacedFeature> END_GOLD_PLACED_KEY = registerKey("end_gold_placed");


    public static final ResourceKey<PlacedFeature> END_IRON_PLACED_KEY = registerKey("end_iron_placed");


    public static final ResourceKey<PlacedFeature> END_LAPIS_PLACED_KEY = registerKey("end_lapis_placed");


    public static final ResourceKey<PlacedFeature> END_REDSTONE_PLACED_KEY = registerKey("end_redstone_placed");


    public static final ResourceKey<PlacedFeature> GRAVEL_COPPER_PLACED_KEY = registerKey("gravel_copper_placed");


    public static final ResourceKey<PlacedFeature> GRAVEL_IRON_PLACED_KEY = registerKey("gravel_iron_placed");


    public static final ResourceKey<PlacedFeature> GRAVEL_GOLD_PLACED_KEY = registerKey("gravel_gold_placed");


    public static final ResourceKey<PlacedFeature> OVERWORLD_QUARTZ_PLACED_KEY = registerKey("overworld_quartz_placed");


    public static final ResourceKey<PlacedFeature> OVERWORLD_NAUTILUS_PLACED_KEY = registerKey("overworld_nautilus_placed");


    public static final ResourceKey<PlacedFeature> NETHER_COAL_PLACED_KEY = registerKey("nether_coal_placed");


    public static final ResourceKey<PlacedFeature> NETHER_COPPER_PLACED_KEY = registerKey("nether_copper_placed");


    public static final ResourceKey<PlacedFeature> NETHER_DIAMOND_PLACED_KEY = registerKey("nether_diamond_placed");


    public static final ResourceKey<PlacedFeature> NETHER_EMERALD_PLACED_KEY = registerKey("nether_emerald_placed");


    public static final ResourceKey<PlacedFeature> NETHER_IRON_PLACED_KEY = registerKey("nether_iron_placed");


    public static final ResourceKey<PlacedFeature> NETHER_LAPIS_PLACED_KEY = registerKey("nether_lapis_placed");


    public static final ResourceKey<PlacedFeature> NETHER_REDSTONE_PLACED_KEY = registerKey("nether_redstone_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, OVERWORLD_QUARTZ_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.OVERWORLD_QUARTZ_KEY),
                JDOrePlacement.commonOrePlacement(16,   //# of veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200)))); //spawn range

        register(context, NETHER_REDSTONE_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.NETHER_REDSTONE_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, NETHER_COAL_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.NETHER_COAL_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, NETHER_COPPER_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.NETHER_COPPER_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, NETHER_EMERALD_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.NETHER_EMERALD_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, NETHER_DIAMOND_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.NETHER_DIAMOND_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, NETHER_LAPIS_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.NETHER_LAPIS_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, NETHER_IRON_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.NETHER_IRON_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, END_COAL_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.END_COAL_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, END_COPPER_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.END_COPPER_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, END_DIAMOND_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.END_DIAMOND_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, END_EMERALD_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.END_EMERALD_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, END_GOLD_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.END_GOLD_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, END_IRON_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.END_IRON_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, END_LAPIS_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.END_LAPIS_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, END_REDSTONE_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.END_REDSTONE_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, OVERWORLD_NAUTILUS_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.OVERWORLD_NAUTILUS_KEY),
                JDOrePlacement.commonOrePlacement(16,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, GRAVEL_COPPER_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.GRAVEL_COPPER_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, GRAVEL_GOLD_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.GRAVEL_GOLD_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

        register(context, GRAVEL_IRON_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.GRAVEL_IRON_KEY),
                JDOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(200))));

    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MoreUtils.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
