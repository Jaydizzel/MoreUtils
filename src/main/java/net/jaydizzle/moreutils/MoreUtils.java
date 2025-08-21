package net.jaydizzle.moreutils;

import net.jaydizzle.moreutils.block.BlockInit;
import net.jaydizzle.moreutils.item.ItemInit;
import net.jaydizzle.moreutils.item.JDCreativeModeTab;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoreUtils.MOD_ID)
public class MoreUtils
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "moreutils";
    public MoreUtils(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        ItemInit.register(modEventBus);
        BlockInit.register(modEventBus);
        JDCreativeModeTab.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
        });
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
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