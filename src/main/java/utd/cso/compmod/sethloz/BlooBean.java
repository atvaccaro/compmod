package utd.cso.compmod.sethloz;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by Heather on 8/12/2015.
 */
public class BlooBean extends ItemFood {
    public BlooBean(int heal, float saturation, boolean canWolfEat) {
        super(heal, saturation, canWolfEat);

        this.setUnlocalizedName("bloo_bean");
        this.setTextureName("compmod:bloo_bean");
        this.setCreativeTab(CreativeTabs.tabFood);
    }
    public void onFoodEaten(ItemStack item, World world, EntityPlayer player){
        if(!world.isRemote)
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 5 * 20, 0));
    }
}
