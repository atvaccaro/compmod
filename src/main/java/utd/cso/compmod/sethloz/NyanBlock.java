package utd.cso.compmod.sethloz;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


/**
 * Created by Heather on 8/11/2015.
 */
public class NyanBlock extends Block {
    public NyanBlock(Material mat){
        super(mat);

        this.setBlockName("nyan_block");
        this.setBlockTextureName("bloomod:nyan_block");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5f);

    }
}

