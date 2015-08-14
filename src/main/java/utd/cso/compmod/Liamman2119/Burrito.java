package utd.cso.compmod.Liamman2119;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by Liam on 8/12/2015.
 */
public class Burrito extends ItemFood {
    public Burrito(int heal, float saturation, boolean canWolfEat) {
        super(heal, saturation, canWolfEat);
        this.setUnlocalizedName("burrito");
        this.setTextureName("bloomod:burrito");
        this.setCreativeTab(CreativeTabs.tabFood);
    }
    protected void onFoodEaten(ItemStack item, World world, EntityPlayer player) {
        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 5 * 20, 255));
            //Potiion Id, durration int ticks, amplifier
        }
    }
}

