package net.jaydizzle.moreutils.block;

import com.mojang.serialization.MapCodec;
import net.jaydizzle.moreutils.MoreUtils;
import net.jaydizzle.moreutils.item.ItemInit;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoreUtils.MOD_ID);

    public static final DeferredBlock<Block> COMPRESSED_ANDESITE = registerBlock("compressed_andesite", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_ANDESITE = registerBlock("double_compressed_andesite", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_ANDESITE = registerBlock("triple_compressed_andesite", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_CLAY = registerBlock("compressed_clay", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.GRAVEL)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_CLAY = registerBlock("double_compressed_clay", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.GRAVEL)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_CLAY = registerBlock("triple_compressed_clay", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY).sound(SoundType.GRAVEL)));

    public static final DeferredBlock<Block> COMPRESSED_DIORITE = registerBlock("compressed_diorite", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_DIORITE = registerBlock("double_compressed_diorite", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_DIORITE = registerBlock("triple_compressed_diorite", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_ENDSTONE = registerBlock("compressed_endstone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_ENDSTONE = registerBlock("double_compressed_endstone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_ENDSTONE = registerBlock("triple_compressed_endstone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_GRANITE = registerBlock("compressed_granite", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_GRANITE = registerBlock("double_compressed_granite", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_GRANITE = registerBlock("triple_compressed_granite", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_RED_SAND = registerBlock("compressed_red_sand", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_RED_SAND = registerBlock("double_compressed_red_sand", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_RED_SAND = registerBlock("triple_compressed_red_sand", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });

    public static final DeferredBlock<Block> COMPRESSED_STONE = registerBlock("compressed_stone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_STONE = registerBlock("double_compressed_stone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_STONE = registerBlock("triple_compressed_stone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_COBBLESTONE = registerBlock("compressed_cobblestone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_COBBLESTONE = registerBlock("double_compressed_cobblestone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_COBBLESTONE = registerBlock("triple_compressed_cobblestone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> QUAD_COMPRESSED_COBBLESTONE = registerBlock("quad_compressed_cobblestone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> QUIN_COMPRESSED_COBBLESTONE = registerBlock("quin_compressed_cobblestone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SEX_COMPRESSED_COBBLESTONE = registerBlock("sex_compressed_cobblestone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SEPT_COMPRESSED_COBBLESTONE = registerBlock("sept_compressed_cobblestone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> OCT_COMPRESSED_COBBLESTONE = registerBlock("oct_compressed_cobblestone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> NON_COMPRESSED_COBBLESTONE = registerBlock("non_compressed_cobblestone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEC_COMPRESSED_COBBLESTONE = registerBlock("dec_compressed_cobblestone", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_DIRT = registerBlock("compressed_dirt", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_DIRT = registerBlock("double_compressed_dirt", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_DIRT = registerBlock("triple_compressed_dirt", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)));
    public static final DeferredBlock<Block> QUAD_COMPRESSED_DIRT = registerBlock("quad_compressed_dirt", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)));
    public static final DeferredBlock<Block> QUIN_COMPRESSED_DIRT = registerBlock("quin_compressed_dirt", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)));
    public static final DeferredBlock<Block> SEX_COMPRESSED_DIRT = registerBlock("sex_compressed_dirt", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)));
    public static final DeferredBlock<Block> SEPT_COMPRESSED_DIRT = registerBlock("sept_compressed_dirt", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)));
    public static final DeferredBlock<Block> OCT_COMPRESSED_DIRT = registerBlock("oct_compressed_dirt", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)));
    public static final DeferredBlock<Block> NON_COMPRESSED_DIRT = registerBlock("non_compressed_dirt", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)));
    public static final DeferredBlock<Block> DEC_COMPRESSED_DIRT = registerBlock("dec_compressed_dirt", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)));

    public static final DeferredBlock<Block> COMPRESSED_GRAVEL = registerBlock("compressed_gravel", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_GRAVEL = registerBlock("double_compressed_gravel", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_GRAVEL = registerBlock("triple_compressed_gravel", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> QUAD_COMPRESSED_GRAVEL = registerBlock("quad_compressed_gravel", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> QUIN_COMPRESSED_GRAVEL = registerBlock("quin_compressed_gravel", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> SEX_COMPRESSED_GRAVEL = registerBlock("sex_compressed_gravel", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> SEPT_COMPRESSED_GRAVEL = registerBlock("sept_compressed_gravel", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> OCT_COMPRESSED_GRAVEL = registerBlock("oct_compressed_gravel", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> NON_COMPRESSED_GRAVEL = registerBlock("non_compressed_gravel", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> DEC_COMPRESSED_GRAVEL = registerBlock("dec_compressed_gravel", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });

    public static final DeferredBlock<Block> COMPRESSED_NETHERRACK = registerBlock("compressed_netherrack", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHERRACK)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_NETHERRACK = registerBlock("double_compressed_netherrack", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHERRACK)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_NETHERRACK = registerBlock("triple_compressed_netherrack", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHERRACK)));
    public static final DeferredBlock<Block> QUAD_COMPRESSED_NETHERRACK = registerBlock("quad_compressed_netherrack", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHERRACK)));
    public static final DeferredBlock<Block> QUIN_COMPRESSED_NETHERRACK = registerBlock("quin_compressed_netherrack", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHERRACK)));
    public static final DeferredBlock<Block> SEX_COMPRESSED_NETHERRACK = registerBlock("sex_compressed_netherrack", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHERRACK)));
    public static final DeferredBlock<Block> SEPT_COMPRESSED_NETHERRACK = registerBlock("sept_compressed_netherrack", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHERRACK)));
    public static final DeferredBlock<Block> OCT_COMPRESSED_NETHERRACK = registerBlock("oct_compressed_netherrack", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHERRACK)));
    public static final DeferredBlock<Block> NON_COMPRESSED_NETHERRACK = registerBlock("non_compressed_netherrack", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHERRACK)));
    public static final DeferredBlock<Block> DEC_COMPRESSED_NETHERRACK = registerBlock("dec_compressed_netherrack", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHERRACK)));

    public static final DeferredBlock<Block> COMPRESSED_SAND = registerBlock("compressed_sand", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_SAND = registerBlock("double_compressed_sand", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_SAND = registerBlock("triple_compressed_sand", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> QUAD_COMPRESSED_SAND = registerBlock("quad_compressed_sand", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> QUIN_COMPRESSED_SAND = registerBlock("quin_compressed_sand", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> SEX_COMPRESSED_SAND = registerBlock("sex_compressed_sand", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> SEPT_COMPRESSED_SAND = registerBlock("sept_compressed_sand", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> OCT_COMPRESSED_SAND = registerBlock("oct_compressed_sand", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> NON_COMPRESSED_SAND = registerBlock("non_compressed_sand", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> DEC_COMPRESSED_SAND = registerBlock("dec_compressed_sand", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });

    public static final DeferredBlock<Block> COMPRESSED_NETHER_BRICKS = registerBlock("compressed_nether_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHER_BRICKS)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_NETHER_BRICKS = registerBlock("double_compressed_nether_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHER_BRICKS)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_NETHER_BRICKS = registerBlock("triple_compressed_nether_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHER_BRICKS)));

    public static final DeferredBlock<Block> COMPRESSED_NETHER_WART_BLOCK = registerBlock("compressed_nether_wart_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_HYPHAE).sound(SoundType.NETHER_WART)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_NETHER_WART_BLOCK = registerBlock("double_compressed_nether_wart_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_HYPHAE).sound(SoundType.NETHER_WART)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_NETHER_WART_BLOCK = registerBlock("triple_compressed_nether_wart_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_HYPHAE).sound(SoundType.NETHER_WART)));

    public static final DeferredBlock<Block> COMPRESSED_WARPED_WART_BLOCK = registerBlock("compressed_warped_wart_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_HYPHAE).sound(SoundType.WART_BLOCK)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_WARPED_WART_BLOCK = registerBlock("double_compressed_warped_wart_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_HYPHAE).sound(SoundType.WART_BLOCK)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_WARPED_WART_BLOCK = registerBlock("triple_compressed_warped_wart_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_HYPHAE).sound(SoundType.WART_BLOCK)));

    public static final DeferredBlock<Block> COMPRESSED_RED_NETHER_BRICKS = registerBlock("compressed_red_nether_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHER_BRICKS)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_RED_NETHER_BRICKS = registerBlock("double_compressed_red_nether_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHER_BRICKS)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_RED_NETHER_BRICKS = registerBlock("triple_compressed_red_nether_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.NETHER_BRICKS)));

    public static final DeferredBlock<Block> COMPRESSED_MOSS_BLOCK = registerBlock("compressed_moss_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK).sound(SoundType.MOSS)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_MOSS_BLOCK = registerBlock("double_compressed_moss_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK).sound(SoundType.MOSS)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_MOSS_BLOCK = registerBlock("triple_compressed_moss_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK).sound(SoundType.MOSS)));

    public static final DeferredBlock<Block> COMPRESSED_QUARTZ_BRICKS = registerBlock("compressed_quartz_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_QUARTZ_BRICKS = registerBlock("double_compressed_quartz_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_QUARTZ_BRICKS = registerBlock("triple_compressed_quartz_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_EMERALD_BLOCK = registerBlock("compressed_emerald_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_EMERALD_BLOCK = registerBlock("double_compressed_emerald_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_EMERALD_BLOCK = registerBlock("triple_compressed_emerald_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_END_STONE_BRICKS = registerBlock("compressed_end_stone_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_END_STONE_BRICKS = registerBlock("double_compressed_end_stone_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_END_STONE_BRICKS = registerBlock("triple_compressed_end_stone_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_STONE_BRICKS = registerBlock("compressed_stone_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_STONE_BRICKS = registerBlock("double_compressed_stone_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_STONE_BRICKS = registerBlock("triple_compressed_stone_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_SMOOTH_BASALT = registerBlock("compressed_smooth_basalt", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.BASALT)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_SMOOTH_BASALT = registerBlock("double_compressed_smooth_basalt", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.BASALT)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_SMOOTH_BASALT = registerBlock("triple_compressed_smooth_basalt", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.BASALT)));

    public static final DeferredBlock<Block> COMPRESSED_SOUL_SOIL = registerBlock("compressed_soul_soil", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SOUL_SOIL)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_SOUL_SOIL = registerBlock("double_compressed_soul_soil", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SOUL_SOIL)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_SOUL_SOIL = registerBlock("triple_compressed_soul_soil", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).sound(SoundType.SOUL_SOIL)));

    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_BRICKS = registerBlock("compressed_deepslate_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_DEEPSLATE_BRICKS = registerBlock("double_compressed_deepslate_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_DEEPSLATE_BRICKS = registerBlock("triple_compressed_deepslate_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.DEEPSLATE_BRICKS)));

    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_TILES = registerBlock("compressed_deepslate_tiles", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_DEEPSLATE_TILES = registerBlock("double_compressed_deepslate_tiles", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_DEEPSLATE_TILES = registerBlock("triple_compressed_deepslate_tiles", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> COMPRESSED_OBSIDIAN = registerBlock("compressed_obsidian", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_OBSIDIAN = registerBlock("double_compressed_obsidian", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_OBSIDIAN = registerBlock("triple_compressed_obsidian", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_MOSSY_STONE_BRICKS = registerBlock("compressed_mossy_stone_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DOUBLE_COMPRESSED_MOSSY_STONE_BRICKS = registerBlock("double_compressed_mossy_stone_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TRIPLE_COMPRESSED_MOSSY_STONE_BRICKS = registerBlock("triple_compressed_mossy_stone_bricks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> QUARTZ_ORE = registerBlock("quartz_ore", () ->
            new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)));
    public static final DeferredBlock<Block> GRAVEL_IRON = registerBlock("gravel_iron", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> GRAVEL_GOLD = registerBlock("gravel_gold", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> GRAVEL_COPPER = registerBlock("gravel_copper", () ->
            new FallingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            });
    public static final DeferredBlock<Block> NETHER_IRON_ORE = registerBlock("nether_iron_ore", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)));
    public static final DeferredBlock<Block> NETHER_COAL_ORE = registerBlock("nether_coal_ore", () ->
            new DropExperienceBlock(UniformInt.of(3, 3), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)));
    public static final DeferredBlock<Block> NETHER_DIAMOND_ORE = registerBlock("nether_diamond_ore", () ->
            new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)));
    public static final DeferredBlock<Block> NETHER_EMERALD_ORE = registerBlock("nether_emerald_ore", () ->
            new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)));
    public static final DeferredBlock<Block> NETHER_REDSTONE_ORE = registerBlock("nether_redstone_ore", () ->
            new DropExperienceBlock(UniformInt.of(1, 5), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)));
    public static final DeferredBlock<Block> NETHER_LAPIS_ORE = registerBlock("nether_lapis_ore", () ->
            new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)));
    public static final DeferredBlock<Block> NETHER_COPPER_ORE = registerBlock("nether_copper_ore", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)));
    public static final DeferredBlock<Block> END_COPPER_ORE = registerBlock("end_copper_ore", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> END_IRON_ORE = registerBlock("end_iron_ore", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> END_GOLD_ORE = registerBlock("end_gold_ore", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> END_DIAMOND_ORE = registerBlock("end_diamond_ore", () ->
            new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> END_REDSTONE_ORE = registerBlock("end_redstone_ore", () ->
            new DropExperienceBlock(UniformInt.of(1, 5), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> END_EMERALD_ORE = registerBlock("end_emerald_ore", () ->
            new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> END_LAPIS_ORE = registerBlock("end_lapis_ore", () ->
            new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> END_COAL_ORE = registerBlock("end_coal_ore", () ->
            new DropExperienceBlock(UniformInt.of(1, 4), BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> NAUTILUS_ORE = registerBlock("nautilus_ore", () ->
            new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
