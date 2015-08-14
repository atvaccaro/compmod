package utd.cso.compmod.Liamman2119;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

/**
 * Created by Liam on 8/12/2015.
 */
public class BlooAxe extends ItemAxe {
    public BlooAxe(ToolMaterial tm) {
        super(tm);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setUnlocalizedName("bloo_axe");
        this.setTextureName("BlooMod:bloo_axe");
        this.setMaxStackSize(1);
    }
}
