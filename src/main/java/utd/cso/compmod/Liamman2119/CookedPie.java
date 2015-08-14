package utd.cso.compmod.Liamman2119;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import utd.cso.compmod.CompMod;

/**
 * Created by Liam on 8/13/2015.
 */
public class CookedPie extends ItemFood {
    public CookedPie(int heal, float saturation, boolean canWolfEat) {
        super(heal, saturation, canWolfEat);
        this.setUnlocalizedName("cooked_pie");
        this.setTextureName("bloomod:cooked_pie");
        this.setCreativeTab(CreativeTabs.tabFood);
    }
    protected void onFoodEaten(ItemStack item, World world, EntityPlayer player) {
        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 5 * 20,1));
            //Potiion Id, durration int ticks, amplifier
            player.inventory.addItemStackToInventory(new ItemStack(CompMod.pPan));
        }
    }
}
