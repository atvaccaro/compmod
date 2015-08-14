package utd.cso.compmod.sethloz;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import utd.cso.compmod.CompMod;

/**
 * Created by Heather on 8/13/2015.
 */
public class BloodBean extends ItemSeedFood{
    public BloodBean() {
        super(1, 0.1f, CompMod.blBeanBlock, Blocks.farmland);

        this.setUnlocalizedName("blood_bean");
        this.setTextureName("bloomod:blood_bean");
        this.setCreativeTab(CreativeTabs.tabFood);
    }
}
