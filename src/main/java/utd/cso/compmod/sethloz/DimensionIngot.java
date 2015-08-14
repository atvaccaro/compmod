package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Heather on 8/12/2015.
 */
public class DimensionIngot extends Item {
    public DimensionIngot(){
        this.setUnlocalizedName("dimension_ingot");
        this.setTextureName("bloomod:dimension_ingot");
        this.setCreativeTab(CreativeTabs.tabMaterials);

    }
}
