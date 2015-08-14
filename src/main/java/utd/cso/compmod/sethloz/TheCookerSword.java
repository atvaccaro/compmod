package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;

/**
 * Created by Heather on 8/11/2015.
 */
public class TheCookerSword extends ItemSword {
    public TheCookerSword(Item.ToolMaterial tm) {
        super(tm);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName("the_cooker_sword");
        this.setTextureName("bloomod:the_cooker_sword");
        this.setMaxStackSize(1);
    }
    public boolean hitEntity(ItemStack item, EntityLivingBase target, EntityLivingBase player){
        target.addVelocity(0, 1, 0);
        player.addPotionEffect(new PotionEffect(1, 10, 150));
        //EntityLightningBolt lightning = new EntityLightningBolt(target.worldObj, target.posX, target.posY, target.posZ);
        //player.worldObj.addWeatherEffect(lightning);
        //target.worldObj.createExplosion(null, target.posX, target.posY, target.posZ, 4.0f, true);
        target.setFire(4);
        return true;
    }
}
