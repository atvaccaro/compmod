package utd.cso.compmod.Liamman2119;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by Liam on 8/12/2015.
 */
public class Tortilla extends ItemFood {
    public Tortilla(int heal, float saturation, boolean canWolfEat) {
        super(heal, saturation, canWolfEat);
        this.setUnlocalizedName("tortilla");
        this.setTextureName("bloomod:tortilla");
        this.setCreativeTab(CreativeTabs.tabFood);
    }
}
