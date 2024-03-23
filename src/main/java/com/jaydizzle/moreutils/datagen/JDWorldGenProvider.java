package com.jaydizzle.moreutils.datagen;

import com.jaydizzle.moreutils.MoreUtils;
import com.jaydizzle.moreutils.worldgen.JDBiomeModifiers;
import com.jaydizzle.moreutils.worldgen.JDConfiguredFeatures;
import com.jaydizzle.moreutils.worldgen.JDPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class JDWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, JDConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, JDPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, JDBiomeModifiers::bootstrap);

    public JDWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(MoreUtils.MOD_ID));
    }
}