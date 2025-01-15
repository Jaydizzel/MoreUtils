package net.jaydizzle.moreutils.datagen;

import net.jaydizzle.moreutils.block.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class JDBlockLootTables extends BlockLootSubProvider {
    public JDBlockLootTables(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
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

        this.add(BlockInit.NAUTILUS_ORE.get(), block -> createNautilusLikeOreDrops(BlockInit.NAUTILUS_ORE.get(), Items.NAUTILUS_SHELL,1,1));
        this.add(BlockInit.END_COAL_ORE.get(), block -> createCoalLikeOreDrops(BlockInit.END_COAL_ORE.get(), Items.COAL,1,1));
        this.add(BlockInit.END_REDSTONE_ORE.get(), block -> createRedstoneLikeOreDrops(BlockInit.END_REDSTONE_ORE.get(), Items.REDSTONE,4,5));
        this.add(BlockInit.END_GOLD_ORE.get(), block -> createGoldLikeOreDrops(BlockInit.END_GOLD_ORE.get(), Items.RAW_GOLD,1,2));
        this.add(BlockInit.END_EMERALD_ORE.get(), block -> createEmeraldLikeOreDrops(BlockInit.END_EMERALD_ORE.get(), Items.EMERALD,1,1));
        this.add(BlockInit.END_DIAMOND_ORE.get(), block -> createDiamondLikeOreDrops(BlockInit.END_DIAMOND_ORE.get(), Items.DIAMOND,1,1));
        this.add(BlockInit.END_LAPIS_ORE.get(), block -> createLapisLikeOreDrops(BlockInit.END_LAPIS_ORE.get(), Items.LAPIS_LAZULI,4,9));
        this.add(BlockInit.END_IRON_ORE.get(), block -> createIronLikeOreDrops(BlockInit.END_IRON_ORE.get(), Items.RAW_IRON,1,2));
        this.add(BlockInit.END_COPPER_ORE.get(), block -> createCopperLikeOreDrops(BlockInit.END_COPPER_ORE.get(), Items.RAW_COPPER,2,3));
        this.add(BlockInit.GRAVEL_IRON.get(), block -> createIronLikeOreDrops(BlockInit.GRAVEL_IRON.get(), Items.RAW_IRON,1,2));
        this.add(BlockInit.GRAVEL_COPPER.get(), block -> createCopperLikeOreDrops(BlockInit.GRAVEL_COPPER.get(), Items.RAW_COPPER,2,3));
        this.add(BlockInit.GRAVEL_GOLD.get(), block -> createGoldLikeOreDrops(BlockInit.GRAVEL_GOLD.get(), Items.RAW_GOLD,1,2));
        this.add(BlockInit.NETHER_REDSTONE_ORE.get(), block -> createRedstoneLikeOreDrops(BlockInit.NETHER_REDSTONE_ORE.get(), Items.REDSTONE, 4, 5));
        this.add(BlockInit.NETHER_EMERALD_ORE.get(), block -> createEmeraldLikeOreDrops(BlockInit.NETHER_EMERALD_ORE.get(), Items.EMERALD, 1, 1));
        this.add(BlockInit.NETHER_DIAMOND_ORE.get(), block -> createDiamondLikeOreDrops(BlockInit.NETHER_DIAMOND_ORE.get(), Items.DIAMOND, 1, 1));
        this.add(BlockInit.NETHER_COAL_ORE.get(), block -> createCoalLikeOreDrops(BlockInit.NETHER_COAL_ORE.get(), Items.COAL, 1, 1));
        this.add(BlockInit.NETHER_IRON_ORE.get(), block -> createIronLikeOreDrops(BlockInit.NETHER_IRON_ORE.get(), Items.RAW_IRON, 1, 2));
        this.add(BlockInit.NETHER_COPPER_ORE.get(), block -> createCopperLikeOreDrops(BlockInit.NETHER_COPPER_ORE.get(), Items.RAW_COPPER, 2, 3));
        this.add(BlockInit.NETHER_LAPIS_ORE.get(), block -> createLapisLikeOreDrops(BlockInit.NETHER_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 4, 9));
        this.add(BlockInit.QUARTZ_ORE.get(), block -> createQuartzLikeOreDrops(BlockInit.QUARTZ_ORE.get(), Items.QUARTZ, 2, 5));

    }

    protected LootTable.Builder createQuartzLikeOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected LootTable.Builder createGoldLikeOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected LootTable.Builder createIronLikeOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected LootTable.Builder createLapisLikeOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected LootTable.Builder createRedstoneLikeOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected LootTable.Builder createDiamondLikeOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected LootTable.Builder createEmeraldLikeOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected LootTable.Builder createNautilusLikeOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected LootTable.Builder createCoalLikeOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(Holder::value)::iterator;

    }

}
