package net.jaydizzle.moreutils.item;

import net.jaydizzle.moreutils.MoreUtils;
import net.jaydizzle.moreutils.block.BlockInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class JDCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreUtils.MOD_ID);

    public static final Supplier<CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register("moreutils_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BlockInit.COMPRESSED_ANDESITE.get()))
                    .title(Component.translatable("creativetab.moreutils_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ItemInit.BONE_BUNDLE.get());
                        pOutput.accept(ItemInit.BLAZE_ROD_BUNDLE.get());
                        pOutput.accept(ItemInit.STICK_BUNDLE.get());
                        pOutput.accept(ItemInit.BAMBOO_BUNDLE.get());
                        pOutput.accept(ItemInit.HONEYCOMB_PIECE.get());
                        pOutput.accept(BlockInit.QUARTZ_ORE.get());
                        pOutput.accept(BlockInit.GRAVEL_IRON.get());
                        pOutput.accept(BlockInit.GRAVEL_GOLD.get());
                        pOutput.accept(BlockInit.GRAVEL_COPPER.get());
                        pOutput.accept(BlockInit.NETHER_IRON_ORE.get());
                        pOutput.accept(BlockInit.NETHER_COAL_ORE.get());
                        pOutput.accept(BlockInit.NETHER_DIAMOND_ORE.get());
                        pOutput.accept(BlockInit.NETHER_EMERALD_ORE.get());
                        pOutput.accept(BlockInit.NETHER_REDSTONE_ORE.get());
                        pOutput.accept(BlockInit.NETHER_LAPIS_ORE.get());
                        pOutput.accept(BlockInit.NETHER_COPPER_ORE.get());
                        pOutput.accept(BlockInit.END_COPPER_ORE.get());
                        pOutput.accept(BlockInit.END_IRON_ORE.get());
                        pOutput.accept(BlockInit.END_GOLD_ORE.get());
                        pOutput.accept(BlockInit.END_DIAMOND_ORE.get());
                        pOutput.accept(BlockInit.END_REDSTONE_ORE.get());
                        pOutput.accept(BlockInit.END_EMERALD_ORE.get());
                        pOutput.accept(BlockInit.END_LAPIS_ORE.get());
                        pOutput.accept(BlockInit.END_COAL_ORE.get());
                        pOutput.accept(BlockInit.NAUTILUS_ORE.get());
                        pOutput.accept(BlockInit.COMPRESSED_ANDESITE.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_ANDESITE.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_ANDESITE.get());
                        pOutput.accept(BlockInit.COMPRESSED_CLAY.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_CLAY.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_CLAY.get());
                        pOutput.accept(BlockInit.COMPRESSED_DIORITE.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_DIORITE.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_DIORITE.get());
                        pOutput.accept(BlockInit.COMPRESSED_ENDSTONE.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_ENDSTONE.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_ENDSTONE.get());
                        pOutput.accept(BlockInit.COMPRESSED_GRANITE.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_GRANITE.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_GRANITE.get());
                        pOutput.accept(BlockInit.COMPRESSED_RED_SAND.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_RED_SAND.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_RED_SAND.get());
                        pOutput.accept(BlockInit.COMPRESSED_STONE.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_STONE.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_STONE.get());
                        pOutput.accept(BlockInit.COMPRESSED_COBBLESTONE.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_COBBLESTONE.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_COBBLESTONE.get());
                        pOutput.accept(BlockInit.QUAD_COMPRESSED_COBBLESTONE.get());
                        pOutput.accept(BlockInit.QUIN_COMPRESSED_COBBLESTONE.get());
                        pOutput.accept(BlockInit.SEX_COMPRESSED_COBBLESTONE.get());
                        pOutput.accept(BlockInit.SEPT_COMPRESSED_COBBLESTONE.get());
                        pOutput.accept(BlockInit.OCT_COMPRESSED_COBBLESTONE.get());
                        pOutput.accept(BlockInit.NON_COMPRESSED_COBBLESTONE.get());
                        pOutput.accept(BlockInit.DEC_COMPRESSED_COBBLESTONE.get());
                        pOutput.accept(BlockInit.COMPRESSED_DIRT.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_DIRT.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_DIRT.get());
                        pOutput.accept(BlockInit.QUAD_COMPRESSED_DIRT.get());
                        pOutput.accept(BlockInit.QUIN_COMPRESSED_DIRT.get());
                        pOutput.accept(BlockInit.SEX_COMPRESSED_DIRT.get());
                        pOutput.accept(BlockInit.SEPT_COMPRESSED_DIRT.get());
                        pOutput.accept(BlockInit.OCT_COMPRESSED_DIRT.get());
                        pOutput.accept(BlockInit.NON_COMPRESSED_DIRT.get());
                        pOutput.accept(BlockInit.DEC_COMPRESSED_DIRT.get());
                        pOutput.accept(BlockInit.COMPRESSED_GRAVEL.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_GRAVEL.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_GRAVEL.get());
                        pOutput.accept(BlockInit.QUAD_COMPRESSED_GRAVEL.get());
                        pOutput.accept(BlockInit.QUIN_COMPRESSED_GRAVEL.get());
                        pOutput.accept(BlockInit.SEX_COMPRESSED_GRAVEL.get());
                        pOutput.accept(BlockInit.SEPT_COMPRESSED_GRAVEL.get());
                        pOutput.accept(BlockInit.OCT_COMPRESSED_GRAVEL.get());
                        pOutput.accept(BlockInit.NON_COMPRESSED_GRAVEL.get());
                        pOutput.accept(BlockInit.DEC_COMPRESSED_GRAVEL.get());
                        pOutput.accept(BlockInit.COMPRESSED_NETHERRACK.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_NETHERRACK.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_NETHERRACK.get());
                        pOutput.accept(BlockInit.QUAD_COMPRESSED_NETHERRACK.get());
                        pOutput.accept(BlockInit.QUIN_COMPRESSED_NETHERRACK.get());
                        pOutput.accept(BlockInit.SEX_COMPRESSED_NETHERRACK.get());
                        pOutput.accept(BlockInit.SEPT_COMPRESSED_NETHERRACK.get());
                        pOutput.accept(BlockInit.OCT_COMPRESSED_NETHERRACK.get());
                        pOutput.accept(BlockInit.NON_COMPRESSED_NETHERRACK.get());
                        pOutput.accept(BlockInit.DEC_COMPRESSED_NETHERRACK.get());
                        pOutput.accept(BlockInit.COMPRESSED_SAND.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_SAND.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_SAND.get());
                        pOutput.accept(BlockInit.QUAD_COMPRESSED_SAND.get());
                        pOutput.accept(BlockInit.QUIN_COMPRESSED_SAND.get());
                        pOutput.accept(BlockInit.SEX_COMPRESSED_SAND.get());
                        pOutput.accept(BlockInit.SEPT_COMPRESSED_SAND.get());
                        pOutput.accept(BlockInit.OCT_COMPRESSED_SAND.get());
                        pOutput.accept(BlockInit.NON_COMPRESSED_SAND.get());
                        pOutput.accept(BlockInit.DEC_COMPRESSED_SAND.get());
                        pOutput.accept(BlockInit.COMPRESSED_NETHER_BRICKS.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_NETHER_BRICKS.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_NETHER_BRICKS.get());
                        pOutput.accept(BlockInit.COMPRESSED_NETHER_WART_BLOCK.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_NETHER_WART_BLOCK.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_NETHER_WART_BLOCK.get());
                        pOutput.accept(BlockInit.COMPRESSED_WARPED_WART_BLOCK.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_WARPED_WART_BLOCK.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_WARPED_WART_BLOCK.get());
                        pOutput.accept(BlockInit.COMPRESSED_RED_NETHER_BRICKS.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_RED_NETHER_BRICKS.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_RED_NETHER_BRICKS.get());
                        pOutput.accept(BlockInit.COMPRESSED_MOSS_BLOCK.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_MOSS_BLOCK.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_MOSS_BLOCK.get());
                        pOutput.accept(BlockInit.COMPRESSED_QUARTZ_BRICKS.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_QUARTZ_BRICKS.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_QUARTZ_BRICKS.get());
                        pOutput.accept(BlockInit.COMPRESSED_EMERALD_BLOCK.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_EMERALD_BLOCK.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_EMERALD_BLOCK.get());
                        pOutput.accept(BlockInit.COMPRESSED_END_STONE_BRICKS.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_END_STONE_BRICKS.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_END_STONE_BRICKS.get());
                        pOutput.accept(BlockInit.COMPRESSED_STONE_BRICKS.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_STONE_BRICKS.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_STONE_BRICKS.get());
                        pOutput.accept(BlockInit.COMPRESSED_SMOOTH_BASALT.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_SMOOTH_BASALT.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_SMOOTH_BASALT.get());
                        pOutput.accept(BlockInit.COMPRESSED_SOUL_SOIL.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_SOUL_SOIL.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_SOUL_SOIL.get());
                        pOutput.accept(BlockInit.COMPRESSED_DEEPSLATE_BRICKS.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_DEEPSLATE_BRICKS.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_DEEPSLATE_BRICKS.get());
                        pOutput.accept(BlockInit.COMPRESSED_DEEPSLATE_TILES.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_DEEPSLATE_TILES.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_DEEPSLATE_TILES.get());
                        pOutput.accept(BlockInit.COMPRESSED_OBSIDIAN.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_OBSIDIAN.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_OBSIDIAN.get());
                        pOutput.accept(BlockInit.COMPRESSED_MOSSY_STONE_BRICKS.get());
                        pOutput.accept(BlockInit.DOUBLE_COMPRESSED_MOSSY_STONE_BRICKS.get());
                        pOutput.accept(BlockInit.TRIPLE_COMPRESSED_MOSSY_STONE_BRICKS.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}