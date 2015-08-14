package utd.cso.compmod.sethloz;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Heather on 8/12/2015.
 */
public class DimensionalOre extends Block {
    protected DimensionalOre(Material mat) {
        super(mat);

        this.setBlockName("dimensional_ore");
        this.setBlockTextureName("compomod:dimensional_ore");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(2.5f);
    }
}
