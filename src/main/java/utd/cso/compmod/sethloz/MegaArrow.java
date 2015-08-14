package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Heather on 8/13/2015.
 */
public class MegaArrow extends Item {
    public MegaArrow(){
        this.setUnlocalizedName("mega_arrow");
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setTextureName("bloomod:mega_arrow");
    }
}
