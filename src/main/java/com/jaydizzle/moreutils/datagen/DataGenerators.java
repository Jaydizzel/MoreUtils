package com.jaydizzle.moreutils.datagen;

import com.jaydizzle.moreutils.MoreUtils;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = MoreUtils.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {   //./gradlew runData
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), JDLootTableProvider.create(packOutput));
        generator.addProvider(event.includeServer(), new JDWorldGenProvider(packOutput, lookupProvider));

        generator.addProvider(event.includeClient(), new JDBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new JDItemModelProvider(packOutput, existingFileHelper));

        JDBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new JDBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new JDItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));
    }
}
