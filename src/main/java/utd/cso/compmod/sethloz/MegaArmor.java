package utd.cso.compmod.sethloz;

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
 * Created by Heather on 8/12/2015.
 */
public class MegaArmor extends ItemArmor {
    public MegaArmor(ArmorMaterial am, int type, String name) {
        super(am, 0, type);

        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setTextureName("bloomod:" + name);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == CompMod.mLegs)
            return "bloomod:models/armor/mega_layer_2.png";
        else
            return "bloomod:models/armor/mega_layer_1.png";
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        if (player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem() == CompMod.mChest) {
            player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 2, 10));
            player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 2, 10));
        }
        if (player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem() == CompMod.mLegs) {
            player.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 2, 10));
        }
        if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem() == CompMod.mBoots) {
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 2, 10));
        }
        if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem() == CompMod.mHelm) {
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 2, 10));
        }

    }
}