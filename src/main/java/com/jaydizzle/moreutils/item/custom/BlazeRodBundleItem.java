package com.jaydizzle.moreutils.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class BlazeRodBundleItem extends Item {

    public BlazeRodBundleItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 21600;
    }
}
