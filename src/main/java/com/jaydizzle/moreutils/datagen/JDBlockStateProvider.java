package com.jaydizzle.moreutils.datagen;

import com.jaydizzle.moreutils.MoreUtils;
import com.jaydizzle.moreutils.block.BlockInit;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class JDBlockStateProvider extends BlockStateProvider {
    public JDBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MoreUtils.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //CUSTOM BLOCKS
        blockWithItem(BlockInit.QUARTZ_ORE);
        blockWithItem(BlockInit.GRAVEL_IRON);
        blockWithItem(BlockInit.GRAVEL_GOLD);
        blockWithItem(BlockInit.GRAVEL_COPPER);
        blockWithItem(BlockInit.NETHER_IRON_ORE);
        blockWithItem(BlockInit.NETHER_COAL_ORE);
        blockWithItem(BlockInit.NETHER_DIAMOND_ORE);
        blockWithItem(BlockInit.NETHER_EMERALD_ORE);
        blockWithItem(BlockInit.NETHER_REDSTONE_ORE);
        blockWithItem(BlockInit.NETHER_LAPIS_ORE);
        blockWithItem(BlockInit.NETHER_COPPER_ORE);
        blockWithItem(BlockInit.END_COPPER_ORE);
        blockWithItem(BlockInit.END_IRON_ORE);
        blockWithItem(BlockInit.END_GOLD_ORE);
        blockWithItem(BlockInit.END_DIAMOND_ORE);
        blockWithItem(BlockInit.END_REDSTONE_ORE);
        blockWithItem(BlockInit.END_EMERALD_ORE);
        blockWithItem(BlockInit.END_LAPIS_ORE);
        blockWithItem(BlockInit.END_COAL_ORE);
        blockWithItem(BlockInit.NAUTILUS_ORE);
        blockWithItem(BlockInit.COMPRESSED_ANDESITE);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_ANDESITE);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_ANDESITE);
        blockWithItem(BlockInit.COMPRESSED_CLAY);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_CLAY);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_CLAY);
        blockWithItem(BlockInit.COMPRESSED_DIORITE);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_DIORITE);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_DIORITE);
        blockWithItem(BlockInit.COMPRESSED_ENDSTONE);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_ENDSTONE);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_ENDSTONE);
        blockWithItem(BlockInit.COMPRESSED_GRANITE);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_GRANITE);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_GRANITE);
        blockWithItem(BlockInit.COMPRESSED_RED_SAND);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_RED_SAND);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_RED_SAND);
        blockWithItem(BlockInit.COMPRESSED_STONE);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_STONE);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_STONE);
        blockWithItem(BlockInit.COMPRESSED_COBBLESTONE);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_COBBLESTONE);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_COBBLESTONE);
        blockWithItem(BlockInit.QUAD_COMPRESSED_COBBLESTONE);
        blockWithItem(BlockInit.QUIN_COMPRESSED_COBBLESTONE);
        blockWithItem(BlockInit.SEX_COMPRESSED_COBBLESTONE);
        blockWithItem(BlockInit.SEPT_COMPRESSED_COBBLESTONE);
        blockWithItem(BlockInit.OCT_COMPRESSED_COBBLESTONE);
        blockWithItem(BlockInit.NON_COMPRESSED_COBBLESTONE);
        blockWithItem(BlockInit.DEC_COMPRESSED_COBBLESTONE);
        blockWithItem(BlockInit.COMPRESSED_DIRT);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_DIRT);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_DIRT);
        blockWithItem(BlockInit.QUAD_COMPRESSED_DIRT);
        blockWithItem(BlockInit.QUIN_COMPRESSED_DIRT);
        blockWithItem(BlockInit.SEX_COMPRESSED_DIRT);
        blockWithItem(BlockInit.SEPT_COMPRESSED_DIRT);
        blockWithItem(BlockInit.OCT_COMPRESSED_DIRT);
        blockWithItem(BlockInit.NON_COMPRESSED_DIRT);
        blockWithItem(BlockInit.DEC_COMPRESSED_DIRT);
        blockWithItem(BlockInit.COMPRESSED_GRAVEL);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_GRAVEL);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_GRAVEL);
        blockWithItem(BlockInit.QUAD_COMPRESSED_GRAVEL);
        blockWithItem(BlockInit.QUIN_COMPRESSED_GRAVEL);
        blockWithItem(BlockInit.SEX_COMPRESSED_GRAVEL);
        blockWithItem(BlockInit.SEPT_COMPRESSED_GRAVEL);
        blockWithItem(BlockInit.OCT_COMPRESSED_GRAVEL);
        blockWithItem(BlockInit.NON_COMPRESSED_GRAVEL);
        blockWithItem(BlockInit.DEC_COMPRESSED_GRAVEL);
        blockWithItem(BlockInit.COMPRESSED_NETHERRACK);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_NETHERRACK);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_NETHERRACK);
        blockWithItem(BlockInit.QUAD_COMPRESSED_NETHERRACK);
        blockWithItem(BlockInit.QUIN_COMPRESSED_NETHERRACK);
        blockWithItem(BlockInit.SEX_COMPRESSED_NETHERRACK);
        blockWithItem(BlockInit.SEPT_COMPRESSED_NETHERRACK);
        blockWithItem(BlockInit.OCT_COMPRESSED_NETHERRACK);
        blockWithItem(BlockInit.NON_COMPRESSED_NETHERRACK);
        blockWithItem(BlockInit.DEC_COMPRESSED_NETHERRACK);
        blockWithItem(BlockInit.COMPRESSED_SAND);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_SAND);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_SAND);
        blockWithItem(BlockInit.QUAD_COMPRESSED_SAND);
        blockWithItem(BlockInit.QUIN_COMPRESSED_SAND);
        blockWithItem(BlockInit.SEX_COMPRESSED_SAND);
        blockWithItem(BlockInit.SEPT_COMPRESSED_SAND);
        blockWithItem(BlockInit.OCT_COMPRESSED_SAND);
        blockWithItem(BlockInit.NON_COMPRESSED_SAND);
        blockWithItem(BlockInit.DEC_COMPRESSED_SAND);
        blockWithItem(BlockInit.COMPRESSED_NETHER_BRICKS);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_NETHER_BRICKS);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_NETHER_BRICKS);
        blockWithItem(BlockInit.COMPRESSED_NETHER_WART_BLOCK);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_NETHER_WART_BLOCK);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_NETHER_WART_BLOCK);
        blockWithItem(BlockInit.COMPRESSED_WARPED_WART_BLOCK);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_WARPED_WART_BLOCK);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_WARPED_WART_BLOCK);
        blockWithItem(BlockInit.COMPRESSED_RED_NETHER_BRICKS);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_RED_NETHER_BRICKS);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_RED_NETHER_BRICKS);
        blockWithItem(BlockInit.COMPRESSED_MOSS_BLOCK);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_MOSS_BLOCK);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_MOSS_BLOCK);
        blockWithItem(BlockInit.COMPRESSED_QUARTZ_BRICKS);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_QUARTZ_BRICKS);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_QUARTZ_BRICKS);
        blockWithItem(BlockInit.COMPRESSED_EMERALD_BLOCK);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_EMERALD_BLOCK);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_EMERALD_BLOCK);
        blockWithItem(BlockInit.COMPRESSED_END_STONE_BRICKS);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_END_STONE_BRICKS);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_END_STONE_BRICKS);
        blockWithItem(BlockInit.COMPRESSED_STONE_BRICKS);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_STONE_BRICKS);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_STONE_BRICKS);
        blockWithItem(BlockInit.COMPRESSED_SMOOTH_BASALT);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_SMOOTH_BASALT);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_SMOOTH_BASALT);
        blockWithItem(BlockInit.COMPRESSED_SOUL_SOIL);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_SOUL_SOIL);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_SOUL_SOIL);
        blockWithItem(BlockInit.COMPRESSED_DEEPSLATE_BRICKS);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_DEEPSLATE_BRICKS);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_DEEPSLATE_BRICKS);
        blockWithItem(BlockInit.COMPRESSED_DEEPSLATE_TILES);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_DEEPSLATE_TILES);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_DEEPSLATE_TILES);
        blockWithItem(BlockInit.COMPRESSED_OBSIDIAN);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_OBSIDIAN);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_OBSIDIAN);
        blockWithItem(BlockInit.COMPRESSED_MOSSY_STONE_BRICKS);
        blockWithItem(BlockInit.DOUBLE_COMPRESSED_MOSSY_STONE_BRICKS);
        blockWithItem(BlockInit.TRIPLE_COMPRESSED_MOSSY_STONE_BRICKS);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}