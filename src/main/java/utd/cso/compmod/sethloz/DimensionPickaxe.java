package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by Heather on 8/12/2015.
 */
public class DimensionPickaxe extends ItemPickaxe {
    public DimensionPickaxe(ToolMaterial tm) {
        super(tm);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setUnlocalizedName("dimension_pickaxe");
        this.setTextureName("bloomod:dimension_pickaxe");
        this.setMaxStackSize(1);
    }
}
