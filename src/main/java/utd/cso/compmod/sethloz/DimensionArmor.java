package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import utd.cso.compmod.CompMod;

/**
 * Created by Heather on 8/13/2015.
 */
public class DimensionArmor extends ItemArmor {
    public DimensionArmor(ArmorMaterial am, int type, String name) {
        super(am, 0, type);

        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setTextureName("bloomod:" + name);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == CompMod.dLegs)
            return "bloomod:models/armor/dimension_layer_2.png";
        else
            return "bloomod:models/armor/dimension_layer_1.png";
    }
     @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        if (player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem() == CompMod.dChest)
            //player.addVelocity(0, 1, 0);
        if (player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem() == CompMod.dLegs)
            player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 2, 10));
        if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem() == BlooMod.dBoots)
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 2, 10));
        if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem() == BlooMod.dHelm)
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 2, 10));

    }
}
