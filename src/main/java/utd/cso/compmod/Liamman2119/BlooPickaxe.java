package utd.cso.compmod.Liamman2119;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by Liam on 8/11/2015.
 */
public class BlooPickaxe extends ItemPickaxe {
    public BlooPickaxe(ToolMaterial tm) {
        super(tm);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setUnlocalizedName("bloo_pickaxe");
        this.setTextureName("BlooMod:bloo_pickaxe");
        this.setMaxStackSize(1);
    }
}
