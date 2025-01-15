package net.jaydizzle.moreutils.item;

import net.jaydizzle.moreutils.MoreUtils;
import net.jaydizzle.moreutils.item.custom.BambooBundleItem;
import net.jaydizzle.moreutils.item.custom.BlazeRodBundleItem;
import net.jaydizzle.moreutils.item.custom.StickBundleItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreUtils.MOD_ID);
    public static final DeferredItem<Item> BONE_BUNDLE = ITEMS.register("bone_bundle", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BAMBOO_BUNDLE = ITEMS.register("bamboo_bundle", () -> new BambooBundleItem(new Item.Properties()));
    public static final DeferredItem<Item> STICK_BUNDLE = ITEMS.register("stick_bundle", () -> new StickBundleItem(new Item.Properties()));
    public static final DeferredItem<Item> BLAZE_ROD_BUNDLE = ITEMS.register("blaze_rod_bundle", () -> new BlazeRodBundleItem(new Item.Properties()));
    public static final DeferredItem<Item> HONEYCOMB_PIECE = ITEMS.register("honeycomb_piece", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
