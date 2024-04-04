package com.jaydizzle.moreutils;

import com.jaydizzle.moreutils.block.BlockInit;
import com.jaydizzle.moreutils.block.JDOres;
import com.jaydizzle.moreutils.item.ItemInit;
import com.jaydizzle.moreutils.item.JDCreativeModeTab;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("moreutils")
public class MoreUtils
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "moreutils";
    public MoreUtils() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ItemInit.register(modEventBus);
        BlockInit.register(modEventBus);
        JDOres.register(modEventBus);
        JDCreativeModeTab.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}

//_concrete
//dark_prismarine
//redstone_block w/ functionality
//terracotta
//cracked_stone_bricks
//chiseled_stone_bricks
//mossy_cobblestone
//waxed_oxidized_cut_copper
//lapis_block
//_wool
//smooth_stone
//smooth_sandstone
//smooth_red_sandstone
//smooth_quartz
//purpur_block
//waxed_weathered_cut_copper
//waxed_exposed_cut_copper
//waxed_cut_copper
//waxed_oxidized_copper
//waxed_weathered_copper
//waxed_exposed_copper
//waxed_copper_block
//coal_block w/ furnace uses
//rooted_dirt
//coarse_dirt
//iron_block
//gold_block
//diamond_block
//netherite_block
//raw_gold_block
//raw_iron_block
//tuff
//calcite
//polished_deepslate
//cobbled_deepslate
//deepslate
//polished_granite
//polished_andesite
//polished_diorite
//sugar_cane
//string
//feather
//gunpowder
//wheat_seeds
//wheat
//flint
//ender_pearl
//beetroot_seeds
//honeycomb
//beetroot
//carrot
//potato
//melon_slice
//sweet_berries