package utd.cso.compmod.sethloz;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

/**
 * Created by Heather on 8/12/2015.
 */
public class NyanPickaxe extends ItemPickaxe {
    public NyanPickaxe(ToolMaterial tm) {
        super(tm);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName("nyan_pickaxe");
        this.setTextureName("bloomod:nyan_pickaxe");
        this.setMaxStackSize(1);
    }

    public boolean hitEntity(ItemStack item, EntityLivingBase target, EntityLivingBase player) {
        target.addVelocity(0, 1, 0);
        player.addPotionEffect(new PotionEffect(1, 10, 150));
        //EntityLightningBolt lightning = new EntityLightningBolt(target.worldObj, target.posX, target.posY, target.posZ);
        //player.worldObj.addWeatherEffect(lightning);
        target.worldObj.createExplosion(null, target.posX, target.posY, target.posZ, 4.0f, true);
        player.addPotionEffect(new PotionEffect(11, 20, 100));
        player.addPotionEffect(new PotionEffect(10, 20, 100));
        return true;
    }
}
