package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by Heather on 8/12/2015.
 */
public class NyanSword extends ItemSword {
    public NyanSword(ToolMaterial tm) {
    super(tm);
    this.setCreativeTab(CreativeTabs.tabCombat);
    this.setUnlocalizedName("nyan_sword");
    this.setTextureName("bloomod:nyan_sword");
    this.setMaxStackSize(1);
}
}
