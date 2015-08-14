package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Heather on 8/13/2015.
 */
public class MixingBowl extends Item {
    public MixingBowl(){
        this.setUnlocalizedName("mixing_bowl");
        this.setTextureName("bloomod:mixing_bowl");
        this.setCreativeTab(CreativeTabs.tabMaterials);

    }
}
