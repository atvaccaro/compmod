package utd.cso.compmod.sethloz;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import utd.cso.compmod.CompMod;

import java.util.Random;

/**
 * Created by Heather on 8/11/2015.
 */
public class MeltedBlock extends Block {
    public MeltedBlock(Material mat){
        super(mat);
        this.setBlockName("melted_block");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockTextureName("bloomod:melted_block");
        this.setHardness(3.5f);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightOpacity(3);
        this.setLightLevel(1.0f);
        this.setStepSound(Block.soundTypeStone);
    }
    public Item getItemDropped(int meta, Random rand, int fortune){
        return CompMod.fIngot;
    }
    public int quantityDropped(Random rand){
        return 9;
    }
}


