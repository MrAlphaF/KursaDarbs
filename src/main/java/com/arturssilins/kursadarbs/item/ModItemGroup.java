package com.arturssilins.kursadarbs.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup KURSADARBS_GROUP = new ItemGroup("kursadarbstab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.LUMINITE_CRYSTAL.get());
        }
    };

}
