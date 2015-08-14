package utd.cso.compmod.Liamman2119;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;

/**
 * Created by Liam on 8/11/2015.
 */
public class BlooSword extends ItemSword {


    public BlooSword(ToolMaterial tm) {
        super(tm);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName("bloo_sword");
        this.setTextureName("BlooMod:bloo_sword");
        this.setMaxStackSize(1);
    }
    public boolean hitEntity(ItemStack item, EntityLivingBase target, EntityLivingBase player)
    {
        target.setFire(4);
        target.addVelocity(0,3,0);
        player.addPotionEffect(new PotionEffect(11,20,255));
        //Potion ID, Duration,Amplifier
        EntityLightningBolt lightning = new EntityLightningBolt(target.worldObj, target.posX,target.posY,target.posZ);
        player.worldObj.addWeatherEffect(lightning);
        target.worldObj.createExplosion(null,target.posX,target.posY,target.posZ,4.0f,false);
        item.damageItem(1,player);
        return true;
    }
}
