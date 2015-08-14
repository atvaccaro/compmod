package utd.cso.compmod.Liamman2119;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import utd.cso.compmod.CompMod;

import java.util.Random;

/**
 * Created by Liam on 8/10/2015.
 */
public class BlooBlock extends Block {
    public BlooBlock(Material mat) {
        super(mat);
        this.setBlockName("bloo_block");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockTextureName("BlooMod:bloo_block");
        this.setHardness(3.5f);
        this.setHarvestLevel("pickaxe", 3);
        //0=wood 1=stone/gold 2=iron/ 3=diamond
        this.setLightOpacity(3);
        this.setLightLevel(1.0f);
        this.setStepSound(Block.soundTypeAnvil);
    }

    public Item getItemDropped(int meta, Random rand, int fortune) {
        return CompMod.bIngot;
    }

    public int quantityDropped(Random rand) {
        return 9;
    }
}
