package com.jaydizzle.moreutils.block;

import com.jaydizzle.moreutils.MoreUtils;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class JDOres {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreUtils.MOD_ID);

    public static final RegistryObject<Block> QUARTZ_ORE = registerBlock("quartz_ore", () ->
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> GRAVEL_IRON = registerBlock("gravel_iron", () ->
            new FallingBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)));
    public static final RegistryObject<Block> GRAVEL_GOLD = registerBlock("gravel_gold", () ->
            new FallingBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)));
    public static final RegistryObject<Block> GRAVEL_COPPER = registerBlock("gravel_copper", () ->
            new FallingBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)));
    public static final RegistryObject<Block> NETHER_IRON_ORE = registerBlock("nether_iron_ore", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));
    public static final RegistryObject<Block> NETHER_COAL_ORE = registerBlock("nether_coal_ore", () ->
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK), UniformInt.of(3, 3)));
    public static final RegistryObject<Block> NETHER_DIAMOND_ORE = registerBlock("nether_diamond_ore", () ->
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> NETHER_EMERALD_ORE = registerBlock("nether_emerald_ore", () ->
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> NETHER_REDSTONE_ORE = registerBlock("nether_redstone_ore", () ->
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK), UniformInt.of(1, 5)));
    public static final RegistryObject<Block> NETHER_LAPIS_ORE = registerBlock("nether_lapis_ore", () ->
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> NETHER_COPPER_ORE = registerBlock("nether_copper_ore", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));
    public static final RegistryObject<Block> END_COPPER_ORE = registerBlock("end_copper_ore", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)));
    public static final RegistryObject<Block> END_IRON_ORE = registerBlock("end_iron_ore", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)));
    public static final RegistryObject<Block> END_GOLD_ORE = registerBlock("end_gold_ore", () ->
            new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)));
    public static final RegistryObject<Block> END_DIAMOND_ORE = registerBlock("end_diamond_ore", () ->
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> END_REDSTONE_ORE = registerBlock("end_redstone_ore", () ->
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE), UniformInt.of(1, 5)));
    public static final RegistryObject<Block> END_EMERALD_ORE = registerBlock("end_emerald_ore", () ->
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)));
    public static final RegistryObject<Block> END_LAPIS_ORE = registerBlock("end_lapis_ore", () ->
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)));
    public static final RegistryObject<Block> END_COAL_ORE = registerBlock("end_coal_ore", () ->
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)));
    public static final RegistryObject<Block> NAUTILUS_ORE = registerBlock("nautilus_ore", () ->
            new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return com.jaydizzle.moreutils.item.ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
