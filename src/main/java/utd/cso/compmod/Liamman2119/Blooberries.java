package utd.cso.compmod.Liamman2119;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import utd.cso.compmod.CompMod;

/**
 * Created by Liam on 8/13/2015.
 */
public class Blooberries extends ItemSeedFood {


    public Blooberries() {
        super(1, 0.1f, CompMod.bBerryBush, Blocks.farmland);
        this.setUnlocalizedName("blooberries");
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setTextureName("bloomod:bloo_berries");
    }
}
