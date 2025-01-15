package net.jaydizzle.moreutils.datagen;

import net.jaydizzle.moreutils.MoreUtils;
import net.jaydizzle.moreutils.block.BlockInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class JDBlockTagGenerator extends BlockTagsProvider {
    public JDBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MoreUtils.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_HOE)
                .add(BlockInit.COMPRESSED_NETHER_WART_BLOCK.get())
                .add(BlockInit.DOUBLE_COMPRESSED_NETHER_WART_BLOCK.get())
                .add(BlockInit.TRIPLE_COMPRESSED_NETHER_WART_BLOCK.get())
                .add(BlockInit.COMPRESSED_WARPED_WART_BLOCK.get())
                .add(BlockInit.DOUBLE_COMPRESSED_WARPED_WART_BLOCK.get())
                .add(BlockInit.TRIPLE_COMPRESSED_WARPED_WART_BLOCK.get())
                .add(BlockInit.COMPRESSED_MOSS_BLOCK.get())
                .add(BlockInit.DOUBLE_COMPRESSED_MOSS_BLOCK.get())
                .add(BlockInit.TRIPLE_COMPRESSED_MOSS_BLOCK.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockInit.QUARTZ_ORE.get())
                .add(BlockInit.NETHER_IRON_ORE.get())
                .add(BlockInit.NETHER_COAL_ORE.get())
                .add(BlockInit.NETHER_DIAMOND_ORE.get())
                .add(BlockInit.NETHER_EMERALD_ORE.get())
                .add(BlockInit.NETHER_REDSTONE_ORE.get())
                .add(BlockInit.NETHER_LAPIS_ORE.get())
                .add(BlockInit.NETHER_COPPER_ORE.get())
                .add(BlockInit.END_COPPER_ORE.get())
                .add(BlockInit.END_IRON_ORE.get())
                .add(BlockInit.END_GOLD_ORE.get())
                .add(BlockInit.END_DIAMOND_ORE.get())
                .add(BlockInit.END_REDSTONE_ORE.get())
                .add(BlockInit.END_EMERALD_ORE.get())
                .add(BlockInit.END_LAPIS_ORE.get())
                .add(BlockInit.END_COAL_ORE.get())
                .add(BlockInit.NAUTILUS_ORE.get())
                .add(BlockInit.COMPRESSED_ANDESITE.get())
                .add(BlockInit.DOUBLE_COMPRESSED_ANDESITE.get())
                .add(BlockInit.TRIPLE_COMPRESSED_ANDESITE.get())
                .add(BlockInit.COMPRESSED_DIORITE.get())
                .add(BlockInit.DOUBLE_COMPRESSED_DIORITE.get())
                .add(BlockInit.TRIPLE_COMPRESSED_DIORITE.get())
                .add(BlockInit.COMPRESSED_ENDSTONE.get())
                .add(BlockInit.DOUBLE_COMPRESSED_ENDSTONE.get())
                .add(BlockInit.TRIPLE_COMPRESSED_ENDSTONE.get())
                .add(BlockInit.COMPRESSED_GRANITE.get())
                .add(BlockInit.DOUBLE_COMPRESSED_GRANITE.get())
                .add(BlockInit.TRIPLE_COMPRESSED_GRANITE.get())
                .add(BlockInit.COMPRESSED_STONE.get())
                .add(BlockInit.DOUBLE_COMPRESSED_STONE.get())
                .add(BlockInit.TRIPLE_COMPRESSED_STONE.get())
                .add(BlockInit.COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.DOUBLE_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.TRIPLE_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.QUAD_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.QUIN_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.SEX_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.SEPT_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.OCT_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.NON_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.DEC_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.COMPRESSED_NETHERRACK.get())
                .add(BlockInit.DOUBLE_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.TRIPLE_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.QUAD_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.QUIN_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.SEX_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.SEPT_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.OCT_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.NON_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.DEC_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.COMPRESSED_NETHER_BRICKS.get())
                .add(BlockInit.DOUBLE_COMPRESSED_NETHER_BRICKS.get())
                .add(BlockInit.TRIPLE_COMPRESSED_NETHER_BRICKS.get())
                .add(BlockInit.COMPRESSED_RED_NETHER_BRICKS.get())
                .add(BlockInit.DOUBLE_COMPRESSED_RED_NETHER_BRICKS.get())
                .add(BlockInit.TRIPLE_COMPRESSED_RED_NETHER_BRICKS.get())
                .add(BlockInit.COMPRESSED_QUARTZ_BRICKS.get())
                .add(BlockInit.DOUBLE_COMPRESSED_QUARTZ_BRICKS.get())
                .add(BlockInit.TRIPLE_COMPRESSED_QUARTZ_BRICKS.get())
                .add(BlockInit.COMPRESSED_EMERALD_BLOCK.get())
                .add(BlockInit.DOUBLE_COMPRESSED_EMERALD_BLOCK.get())
                .add(BlockInit.TRIPLE_COMPRESSED_EMERALD_BLOCK.get())
                .add(BlockInit.COMPRESSED_END_STONE_BRICKS.get())
                .add(BlockInit.DOUBLE_COMPRESSED_END_STONE_BRICKS.get())
                .add(BlockInit.TRIPLE_COMPRESSED_END_STONE_BRICKS.get())
                .add(BlockInit.COMPRESSED_STONE_BRICKS.get())
                .add(BlockInit.DOUBLE_COMPRESSED_STONE_BRICKS.get())
                .add(BlockInit.TRIPLE_COMPRESSED_STONE_BRICKS.get())
                .add(BlockInit.COMPRESSED_SMOOTH_BASALT.get())
                .add(BlockInit.DOUBLE_COMPRESSED_SMOOTH_BASALT.get())
                .add(BlockInit.TRIPLE_COMPRESSED_SMOOTH_BASALT.get())
                .add(BlockInit.COMPRESSED_DEEPSLATE_BRICKS.get())
                .add(BlockInit.DOUBLE_COMPRESSED_DEEPSLATE_BRICKS.get())
                .add(BlockInit.TRIPLE_COMPRESSED_DEEPSLATE_BRICKS.get())
                .add(BlockInit.COMPRESSED_DEEPSLATE_TILES.get())
                .add(BlockInit.DOUBLE_COMPRESSED_DEEPSLATE_TILES.get())
                .add(BlockInit.TRIPLE_COMPRESSED_DEEPSLATE_TILES.get())
                .add(BlockInit.COMPRESSED_OBSIDIAN.get())
                .add(BlockInit.DOUBLE_COMPRESSED_OBSIDIAN.get())
                .add(BlockInit.TRIPLE_COMPRESSED_OBSIDIAN.get())
                .add(BlockInit.COMPRESSED_MOSSY_STONE_BRICKS.get())
                .add(BlockInit.DOUBLE_COMPRESSED_MOSSY_STONE_BRICKS.get())
                .add(BlockInit.TRIPLE_COMPRESSED_MOSSY_STONE_BRICKS.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(BlockInit.GRAVEL_GOLD.get())
                .add(BlockInit.GRAVEL_IRON.get())
                .add(BlockInit.GRAVEL_COPPER.get())
                .add(BlockInit.COMPRESSED_CLAY.get())
                .add(BlockInit.DOUBLE_COMPRESSED_CLAY.get())
                .add(BlockInit.TRIPLE_COMPRESSED_CLAY.get())
                .add(BlockInit.COMPRESSED_RED_SAND.get())
                .add(BlockInit.DOUBLE_COMPRESSED_RED_SAND.get())
                .add(BlockInit.TRIPLE_COMPRESSED_RED_SAND.get())
                .add(BlockInit.COMPRESSED_DIRT.get())
                .add(BlockInit.DOUBLE_COMPRESSED_DIRT.get())
                .add(BlockInit.TRIPLE_COMPRESSED_DIRT.get())
                .add(BlockInit.QUAD_COMPRESSED_DIRT.get())
                .add(BlockInit.QUIN_COMPRESSED_DIRT.get())
                .add(BlockInit.SEX_COMPRESSED_DIRT.get())
                .add(BlockInit.SEPT_COMPRESSED_DIRT.get())
                .add(BlockInit.OCT_COMPRESSED_DIRT.get())
                .add(BlockInit.NON_COMPRESSED_DIRT.get())
                .add(BlockInit.DEC_COMPRESSED_DIRT.get())
                .add(BlockInit.COMPRESSED_GRAVEL.get())
                .add(BlockInit.DOUBLE_COMPRESSED_GRAVEL.get())
                .add(BlockInit.TRIPLE_COMPRESSED_GRAVEL.get())
                .add(BlockInit.QUAD_COMPRESSED_GRAVEL.get())
                .add(BlockInit.QUIN_COMPRESSED_GRAVEL.get())
                .add(BlockInit.SEX_COMPRESSED_GRAVEL.get())
                .add(BlockInit.SEPT_COMPRESSED_GRAVEL.get())
                .add(BlockInit.OCT_COMPRESSED_GRAVEL.get())
                .add(BlockInit.NON_COMPRESSED_GRAVEL.get())
                .add(BlockInit.DEC_COMPRESSED_GRAVEL.get())
                .add(BlockInit.COMPRESSED_SAND.get())
                .add(BlockInit.DOUBLE_COMPRESSED_SAND.get())
                .add(BlockInit.TRIPLE_COMPRESSED_SAND.get())
                .add(BlockInit.QUAD_COMPRESSED_SAND.get())
                .add(BlockInit.QUIN_COMPRESSED_SAND.get())
                .add(BlockInit.SEX_COMPRESSED_SAND.get())
                .add(BlockInit.SEPT_COMPRESSED_SAND.get())
                .add(BlockInit.OCT_COMPRESSED_SAND.get())
                .add(BlockInit.NON_COMPRESSED_SAND.get())
                .add(BlockInit.DEC_COMPRESSED_SAND.get())
                .add(BlockInit.COMPRESSED_SOUL_SOIL.get())
                .add(BlockInit.DOUBLE_COMPRESSED_SOUL_SOIL.get())
                .add(BlockInit.TRIPLE_COMPRESSED_SOUL_SOIL.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockInit.COMPRESSED_OBSIDIAN.get())
                .add(BlockInit.DOUBLE_COMPRESSED_OBSIDIAN.get())
                .add(BlockInit.TRIPLE_COMPRESSED_OBSIDIAN.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockInit.END_DIAMOND_ORE.get())
                .add(BlockInit.END_EMERALD_ORE.get())
                .add(BlockInit.END_GOLD_ORE.get())
                .add(BlockInit.END_REDSTONE_ORE.get())
                .add(BlockInit.NETHER_DIAMOND_ORE.get())
                .add(BlockInit.NETHER_EMERALD_ORE.get())
                .add(BlockInit.NETHER_REDSTONE_ORE.get())
                .add(BlockInit.GRAVEL_GOLD.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(BlockInit.COMPRESSED_STONE.get())
                .add(BlockInit.DOUBLE_COMPRESSED_STONE.get())
                .add(BlockInit.TRIPLE_COMPRESSED_STONE.get())
                .add(BlockInit.COMPRESSED_ANDESITE.get())
                .add(BlockInit.DOUBLE_COMPRESSED_ANDESITE.get())
                .add(BlockInit.TRIPLE_COMPRESSED_ANDESITE.get())
                .add(BlockInit.COMPRESSED_CLAY.get())
                .add(BlockInit.DOUBLE_COMPRESSED_CLAY.get())
                .add(BlockInit.TRIPLE_COMPRESSED_CLAY.get())
                .add(BlockInit.GRAVEL_IRON.get())
                .add(BlockInit.COMPRESSED_DIORITE.get())
                .add(BlockInit.DOUBLE_COMPRESSED_DIORITE.get())
                .add(BlockInit.TRIPLE_COMPRESSED_DIORITE.get())
                .add(BlockInit.COMPRESSED_ENDSTONE.get())
                .add(BlockInit.DOUBLE_COMPRESSED_ENDSTONE.get())
                .add(BlockInit.TRIPLE_COMPRESSED_ENDSTONE.get())
                .add(BlockInit.COMPRESSED_RED_SAND.get())
                .add(BlockInit.DOUBLE_COMPRESSED_RED_SAND.get())
                .add(BlockInit.TRIPLE_COMPRESSED_RED_SAND.get())
                .add(BlockInit.COMPRESSED_GRANITE.get())
                .add(BlockInit.DOUBLE_COMPRESSED_GRANITE.get())
                .add(BlockInit.TRIPLE_COMPRESSED_GRANITE.get())
                .add(BlockInit.COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.DOUBLE_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.TRIPLE_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.QUAD_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.QUIN_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.SEX_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.SEPT_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.OCT_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.NON_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.DEC_COMPRESSED_COBBLESTONE.get())
                .add(BlockInit.COMPRESSED_NETHERRACK.get())
                .add(BlockInit.DOUBLE_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.TRIPLE_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.QUAD_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.QUIN_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.SEX_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.SEPT_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.OCT_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.NON_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.DEC_COMPRESSED_NETHERRACK.get())
                .add(BlockInit.COMPRESSED_DIRT.get())
                .add(BlockInit.DOUBLE_COMPRESSED_DIRT.get())
                .add(BlockInit.TRIPLE_COMPRESSED_DIRT.get())
                .add(BlockInit.QUAD_COMPRESSED_DIRT.get())
                .add(BlockInit.QUIN_COMPRESSED_DIRT.get())
                .add(BlockInit.SEX_COMPRESSED_DIRT.get())
                .add(BlockInit.SEPT_COMPRESSED_DIRT.get())
                .add(BlockInit.OCT_COMPRESSED_DIRT.get())
                .add(BlockInit.NON_COMPRESSED_DIRT.get())
                .add(BlockInit.DEC_COMPRESSED_DIRT.get())
                .add(BlockInit.COMPRESSED_GRAVEL.get())
                .add(BlockInit.DOUBLE_COMPRESSED_GRAVEL.get())
                .add(BlockInit.TRIPLE_COMPRESSED_GRAVEL.get())
                .add(BlockInit.QUAD_COMPRESSED_GRAVEL.get())
                .add(BlockInit.QUIN_COMPRESSED_GRAVEL.get())
                .add(BlockInit.SEX_COMPRESSED_GRAVEL.get())
                .add(BlockInit.SEPT_COMPRESSED_GRAVEL.get())
                .add(BlockInit.OCT_COMPRESSED_GRAVEL.get())
                .add(BlockInit.NON_COMPRESSED_GRAVEL.get())
                .add(BlockInit.DEC_COMPRESSED_GRAVEL.get())
                .add(BlockInit.COMPRESSED_SAND.get())
                .add(BlockInit.DOUBLE_COMPRESSED_SAND.get())
                .add(BlockInit.TRIPLE_COMPRESSED_SAND.get())
                .add(BlockInit.QUAD_COMPRESSED_SAND.get())
                .add(BlockInit.QUIN_COMPRESSED_SAND.get())
                .add(BlockInit.SEX_COMPRESSED_SAND.get())
                .add(BlockInit.SEPT_COMPRESSED_SAND.get())
                .add(BlockInit.OCT_COMPRESSED_SAND.get())
                .add(BlockInit.NON_COMPRESSED_SAND.get())
                .add(BlockInit.DEC_COMPRESSED_SAND.get())
                .add(BlockInit.END_IRON_ORE.get())
                .add(BlockInit.END_LAPIS_ORE.get())
                .add(BlockInit.NETHER_IRON_ORE.get())
                .add(BlockInit.NETHER_LAPIS_ORE.get())
                .add(BlockInit.NAUTILUS_ORE.get())
                .add(BlockInit.NETHER_COPPER_ORE.get())
                .add(BlockInit.END_COPPER_ORE.get())
                .add(BlockInit.GRAVEL_COPPER.get());

        this.tag(Tags.Blocks.NEEDS_WOOD_TOOL)
                .add(BlockInit.QUARTZ_ORE.get())
                .add(BlockInit.NETHER_COAL_ORE.get())
                .add(BlockInit.END_COAL_ORE.get());

    }
}