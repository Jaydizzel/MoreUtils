package com.jaydizzle.moreutils.worldgen;

import com.jaydizzle.moreutils.MoreUtils;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class JDBiomeModifiers {
    public static final ResourceKey<BiomeModifier> NETHER_COAL = registerKey("add_nether_coal");
    public static final ResourceKey<BiomeModifier> NETHER_DIAMOND = registerKey("add_nether_diamond");
    public static final ResourceKey<BiomeModifier> NETHER_EMERALD = registerKey("add_nether_emerald");
    public static final ResourceKey<BiomeModifier> NETHER_REDSTONE = registerKey("add_nether_redstone");
    public static final ResourceKey<BiomeModifier> NETHER_LAPIS = registerKey("add_nether_lapis");
    public static final ResourceKey<BiomeModifier> NETHER_IRON = registerKey("add_nether_iron");
    public static final ResourceKey<BiomeModifier> NETHER_COPPER = registerKey("add_nether_copper");
    public static final ResourceKey<BiomeModifier> OVERWORLD_NAUTILUS = registerKey("add_overworld_nautilus");
    public static final ResourceKey<BiomeModifier> GRAVEL_IRON = registerKey("add_gravel_iron");
    public static final ResourceKey<BiomeModifier> GRAVEL_COPPER = registerKey("add_gravel_copper");
    public static final ResourceKey<BiomeModifier> GRAVEL_GOLD = registerKey("add_gravel_gold");
    public static final ResourceKey<BiomeModifier> END_REDSTONE = registerKey("add_end_redstone");
    public static final ResourceKey<BiomeModifier> END_LAPIS = registerKey("add_end_lapis");
    public static final ResourceKey<BiomeModifier> END_IRON = registerKey("add_end_iron");
    public static final ResourceKey<BiomeModifier> END_GOLD = registerKey("add_end_gold");
    public static final ResourceKey<BiomeModifier> END_EMERALD = registerKey("add_end_emerald");
    public static final ResourceKey<BiomeModifier> END_DIAMOND = registerKey("add_end_diamond");
    public static final ResourceKey<BiomeModifier> END_COPPER = registerKey("add_end_copper");
    public static final ResourceKey<BiomeModifier> END_COAL = registerKey("add_end_coal");
    public static final ResourceKey<BiomeModifier> OVERWORLD_QUARTZ = registerKey("add_overworld_quartz");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(OVERWORLD_QUARTZ, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.OVERWORLD_QUARTZ_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(NETHER_COAL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.NETHER_COAL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(NETHER_COPPER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.NETHER_COPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(NETHER_DIAMOND, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.NETHER_DIAMOND_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(NETHER_EMERALD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.NETHER_EMERALD_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(NETHER_IRON, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.NETHER_IRON_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(NETHER_LAPIS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.NETHER_LAPIS_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(NETHER_REDSTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.NETHER_REDSTONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(END_COAL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.END_COAL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(END_COPPER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.END_COPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(END_DIAMOND, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.END_DIAMOND_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(END_EMERALD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.END_EMERALD_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(END_GOLD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.END_GOLD_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(END_LAPIS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.END_LAPIS_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(END_IRON, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.END_IRON_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(END_REDSTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.END_REDSTONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(OVERWORLD_NAUTILUS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OCEAN),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.OVERWORLD_NAUTILUS_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(GRAVEL_COPPER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.GRAVEL_COPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(GRAVEL_GOLD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.GRAVEL_GOLD_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(GRAVEL_IRON, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.GRAVEL_IRON_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(MoreUtils.MOD_ID, name));
    }
}
