package utd.cso.compmod.Liamman2119;

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
 * Created by Liam on 8/12/2015.
 */
public class BlooArmor extends ItemArmor {
    public BlooArmor(ArmorMaterial am, int type, String name) {
        super(am, 0, type);

        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setTextureName("bloomod:"+ name);
    }
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
        if(stack.getItem() == CompMod.bLegs)
            return "bloomod:models/armor/bloo_layer_2.png";
        else
            return "bloomod:models/armor/bloo_layer_1.png";
    }
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
    {
        if(player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem() == CompMod.bBoots
                && player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem() == CompMod.bLegs
                && player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem() == CompMod.bChest
                && player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem() == CompMod.bHelm){
            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 2, 10));
        }
    }
}
