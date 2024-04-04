package com.jaydizzle.moreutils.datagen.loot;

import com.jaydizzle.moreutils.block.BlockInit;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class JDBlockLootTables extends BlockLootSubProvider {
    public JDBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(BlockInit.QUARTZ_ORE.get());
        this.dropSelf(BlockInit.GRAVEL_IRON.get());
        this.dropSelf(BlockInit.GRAVEL_GOLD.get());
        this.dropSelf(BlockInit.GRAVEL_COPPER.get());
        this.dropSelf(BlockInit.NETHER_IRON_ORE.get());
        this.dropSelf(BlockInit.NETHER_COAL_ORE.get());
        this.dropSelf(BlockInit.NETHER_DIAMOND_ORE.get());
        this.dropSelf(BlockInit.NETHER_EMERALD_ORE.get());
        this.dropSelf(BlockInit.NETHER_REDSTONE_ORE.get());
        this.dropSelf(BlockInit.NETHER_LAPIS_ORE.get());
        this.dropSelf(BlockInit.NETHER_COPPER_ORE.get());
        this.dropSelf(BlockInit.END_COPPER_ORE.get());
        this.dropSelf(BlockInit.END_IRON_ORE.get());
        this.dropSelf(BlockInit.END_GOLD_ORE.get());
        this.dropSelf(BlockInit.END_DIAMOND_ORE.get());
        this.dropSelf(BlockInit.END_REDSTONE_ORE.get());
        this.dropSelf(BlockInit.END_EMERALD_ORE.get());
        this.dropSelf(BlockInit.END_LAPIS_ORE.get());
        this.dropSelf(BlockInit.END_COAL_ORE.get());
        this.dropSelf(BlockInit.NAUTILUS_ORE.get());
        this.dropSelf(BlockInit.COMPRESSED_ANDESITE.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_ANDESITE.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_ANDESITE.get());
        this.dropSelf(BlockInit.COMPRESSED_CLAY.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_CLAY.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_CLAY.get());
        this.dropSelf(BlockInit.COMPRESSED_DIORITE.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_DIORITE.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_DIORITE.get());
        this.dropSelf(BlockInit.COMPRESSED_ENDSTONE.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_ENDSTONE.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_ENDSTONE.get());
        this.dropSelf(BlockInit.COMPRESSED_GRANITE.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_GRANITE.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_GRANITE.get());
        this.dropSelf(BlockInit.COMPRESSED_RED_SAND.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_RED_SAND.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_RED_SAND.get());
        this.dropSelf(BlockInit.COMPRESSED_STONE.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_STONE.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_STONE.get());
        this.dropSelf(BlockInit.COMPRESSED_COBBLESTONE.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_COBBLESTONE.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_COBBLESTONE.get());
        this.dropSelf(BlockInit.QUAD_COMPRESSED_COBBLESTONE.get());
        this.dropSelf(BlockInit.QUIN_COMPRESSED_COBBLESTONE.get());
        this.dropSelf(BlockInit.SEX_COMPRESSED_COBBLESTONE.get());
        this.dropSelf(BlockInit.SEPT_COMPRESSED_COBBLESTONE.get());
        this.dropSelf(BlockInit.OCT_COMPRESSED_COBBLESTONE.get());
        this.dropSelf(BlockInit.NON_COMPRESSED_COBBLESTONE.get());
        this.dropSelf(BlockInit.DEC_COMPRESSED_COBBLESTONE.get());
        this.dropSelf(BlockInit.COMPRESSED_DIRT.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_DIRT.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_DIRT.get());
        this.dropSelf(BlockInit.QUAD_COMPRESSED_DIRT.get());
        this.dropSelf(BlockInit.QUIN_COMPRESSED_DIRT.get());
        this.dropSelf(BlockInit.SEX_COMPRESSED_DIRT.get());
        this.dropSelf(BlockInit.SEPT_COMPRESSED_DIRT.get());
        this.dropSelf(BlockInit.OCT_COMPRESSED_DIRT.get());
        this.dropSelf(BlockInit.NON_COMPRESSED_DIRT.get());
        this.dropSelf(BlockInit.DEC_COMPRESSED_DIRT.get());
        this.dropSelf(BlockInit.COMPRESSED_GRAVEL.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_GRAVEL.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_GRAVEL.get());
        this.dropSelf(BlockInit.QUAD_COMPRESSED_GRAVEL.get());
        this.dropSelf(BlockInit.QUIN_COMPRESSED_GRAVEL.get());
        this.dropSelf(BlockInit.SEX_COMPRESSED_GRAVEL.get());
        this.dropSelf(BlockInit.SEPT_COMPRESSED_GRAVEL.get());
        this.dropSelf(BlockInit.OCT_COMPRESSED_GRAVEL.get());
        this.dropSelf(BlockInit.NON_COMPRESSED_GRAVEL.get());
        this.dropSelf(BlockInit.DEC_COMPRESSED_GRAVEL.get());
        this.dropSelf(BlockInit.COMPRESSED_NETHERRACK.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_NETHERRACK.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_NETHERRACK.get());
        this.dropSelf(BlockInit.QUAD_COMPRESSED_NETHERRACK.get());
        this.dropSelf(BlockInit.QUIN_COMPRESSED_NETHERRACK.get());
        this.dropSelf(BlockInit.SEX_COMPRESSED_NETHERRACK.get());
        this.dropSelf(BlockInit.SEPT_COMPRESSED_NETHERRACK.get());
        this.dropSelf(BlockInit.OCT_COMPRESSED_NETHERRACK.get());
        this.dropSelf(BlockInit.NON_COMPRESSED_NETHERRACK.get());
        this.dropSelf(BlockInit.DEC_COMPRESSED_NETHERRACK.get());
        this.dropSelf(BlockInit.COMPRESSED_SAND.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_SAND.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_SAND.get());
        this.dropSelf(BlockInit.QUAD_COMPRESSED_SAND.get());
        this.dropSelf(BlockInit.QUIN_COMPRESSED_SAND.get());
        this.dropSelf(BlockInit.SEX_COMPRESSED_SAND.get());
        this.dropSelf(BlockInit.SEPT_COMPRESSED_SAND.get());
        this.dropSelf(BlockInit.OCT_COMPRESSED_SAND.get());
        this.dropSelf(BlockInit.NON_COMPRESSED_SAND.get());
        this.dropSelf(BlockInit.DEC_COMPRESSED_SAND.get());
        this.dropSelf(BlockInit.COMPRESSED_NETHER_BRICKS.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_NETHER_BRICKS.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_NETHER_BRICKS.get());
        this.dropSelf(BlockInit.COMPRESSED_NETHER_WART_BLOCK.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_NETHER_WART_BLOCK.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_NETHER_WART_BLOCK.get());
        this.dropSelf(BlockInit.COMPRESSED_WARPED_WART_BLOCK.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_WARPED_WART_BLOCK.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_WARPED_WART_BLOCK.get());
        this.dropSelf(BlockInit.COMPRESSED_RED_NETHER_BRICKS.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_RED_NETHER_BRICKS.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_RED_NETHER_BRICKS.get());
        this.dropSelf(BlockInit.COMPRESSED_MOSS_BLOCK.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_MOSS_BLOCK.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_MOSS_BLOCK.get());
        this.dropSelf(BlockInit.COMPRESSED_QUARTZ_BRICKS.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_QUARTZ_BRICKS.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_QUARTZ_BRICKS.get());
        this.dropSelf(BlockInit.COMPRESSED_EMERALD_BLOCK.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_EMERALD_BLOCK.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_EMERALD_BLOCK.get());
        this.dropSelf(BlockInit.COMPRESSED_END_STONE_BRICKS.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_END_STONE_BRICKS.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_END_STONE_BRICKS.get());
        this.dropSelf(BlockInit.COMPRESSED_STONE_BRICKS.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_STONE_BRICKS.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_STONE_BRICKS.get());
        this.dropSelf(BlockInit.COMPRESSED_SMOOTH_BASALT.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_SMOOTH_BASALT.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_SMOOTH_BASALT.get());
        this.dropSelf(BlockInit.COMPRESSED_SOUL_SOIL.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_SOUL_SOIL.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_SOUL_SOIL.get());
        this.dropSelf(BlockInit.COMPRESSED_DEEPSLATE_BRICKS.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_DEEPSLATE_BRICKS.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_DEEPSLATE_BRICKS.get());
        this.dropSelf(BlockInit.COMPRESSED_DEEPSLATE_TILES.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_DEEPSLATE_TILES.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_DEEPSLATE_TILES.get());
        this.dropSelf(BlockInit.COMPRESSED_OBSIDIAN.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_OBSIDIAN.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_OBSIDIAN.get());
        this.dropSelf(BlockInit.COMPRESSED_MOSSY_STONE_BRICKS.get());
        this.dropSelf(BlockInit.DOUBLE_COMPRESSED_MOSSY_STONE_BRICKS.get());
        this.dropSelf(BlockInit.TRIPLE_COMPRESSED_MOSSY_STONE_BRICKS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;

    }

}
