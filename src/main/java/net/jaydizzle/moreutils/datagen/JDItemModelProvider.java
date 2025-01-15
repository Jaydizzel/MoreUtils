package net.jaydizzle.moreutils.datagen;

import net.jaydizzle.moreutils.MoreUtils;
import net.jaydizzle.moreutils.item.ItemInit;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class JDItemModelProvider extends ItemModelProvider {
    public JDItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreUtils.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ItemInit.BAMBOO_BUNDLE.get());
        basicItem(ItemInit.BLAZE_ROD_BUNDLE.get());
        basicItem(ItemInit.BONE_BUNDLE.get());
        basicItem(ItemInit.STICK_BUNDLE.get());
        basicItem(ItemInit.HONEYCOMB_PIECE.get());


    }

}