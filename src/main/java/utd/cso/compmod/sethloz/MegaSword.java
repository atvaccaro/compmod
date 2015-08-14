package utd.cso.compmod.sethloz;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;

/**
 * Created by Heather on 8/12/2015.
 */
public class MegaSword extends ItemSword {
    public MegaSword(ToolMaterial tm) {
        super(tm);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName("mega_sword");
        this.setTextureName("bloomod:mega_sword");
        this.setMaxStackSize(1);
    }
    public boolean hitEntity(ItemStack item, EntityLivingBase target, EntityLivingBase player) {
        target.addVelocity(0, 1, 0);
        player.addPotionEffect(new PotionEffect(1, 10, 150));
        player.addPotionEffect(new PotionEffect(10, 20, 10000));
        player.addPotionEffect(new PotionEffect(11, 20, 10000));
        EntityLightningBolt lightning = new EntityLightningBolt(target.worldObj, target.posX, target.posY, target.posZ);
        player.worldObj.addWeatherEffect(lightning);
        target.worldObj.createExplosion(null, target.posX, target.posY, target.posZ, 2.0f, true);

        return true;
    }

}
