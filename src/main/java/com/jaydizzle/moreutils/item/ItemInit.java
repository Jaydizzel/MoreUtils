package com.jaydizzle.moreutils.item;

import com.jaydizzle.moreutils.MoreUtils;
import com.jaydizzle.moreutils.item.custom.BambooBundleItem;
import com.jaydizzle.moreutils.item.custom.BlazeRodBundleItem;
import com.jaydizzle.moreutils.item.custom.StickBundleItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreUtils.MOD_ID);

    public static final RegistryObject<Item> BONE_BUNDLE = ITEMS.register("bone_bundle", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_BUNDLE = ITEMS.register("bamboo_bundle", () -> new BambooBundleItem(new Item.Properties()));
    public static final RegistryObject<Item> STICK_BUNDLE = ITEMS.register("stick_bundle", () -> new StickBundleItem(new Item.Properties()));
    public static final RegistryObject<Item> BLAZE_ROD_BUNDLE = ITEMS.register("blaze_rod_bundle", () -> new BlazeRodBundleItem(new Item.Properties()));
    public static final RegistryObject<Item> HONEYCOMB_PIECE = ITEMS.register("honeycomb_piece", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}