package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

/**
 * Created by Heather on 8/12/2015.
 */
public class DimensionShovel extends ItemSpade {
    public DimensionShovel(ToolMaterial tm) {
        super(tm);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName("dimension_shovel");
        this.setTextureName("bloomod:dimension_shovel");
        this.setMaxStackSize(1);
    }
}
