package utd.cso.compmod.Liamman2119;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import scala.swing.event.KeyPressed;
import utd.cso.compmod.CompMod;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Liam on 8/13/2015.
 */
public class JetPack extends Item {

    public JetPack(){
        this.setUnlocalizedName("jetpack");
        this.setCreativeTab(CreativeTabs.tabTransport);
        this.setTextureName("bloomod:jetpack");
    }
    @Override
    public ItemStack onItemRightClick(ItemStack jPack,World world, EntityPlayer player)
    {
            if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == CompMod.jPack) {
                player.addVelocity(0, 0.5D, 0);
            }
        return jPack;
    }
}
// KeyEvent.KEY_PRESSED == KeyEvent.VK_SPACE
