package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Heather on 8/11/2015.
 */
public class FireIngot extends Item {
    public FireIngot(){
        this.setUnlocalizedName("fire_ingot");
        this.setTextureName("bloomod:fire_ingot");
        this.setCreativeTab(CreativeTabs.tabMaterials);

    }
}
