package utd.cso.compmod.Liamman2119;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

/**
 * Created by Liam on 8/11/2015.
 */
public class BlooSpade extends ItemSpade {
    public BlooSpade(ToolMaterial tm) {
        super(tm);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setUnlocalizedName("bloo_spade");
        this.setTextureName("BlooMod:bloo_spade");
        this.setMaxStackSize(1);
    }
}
