package utd.cso.compmod.sethloz;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.util.Random;

/**
 * Created by Heather on 8/11/2015.
 */
public class HeatedOre extends Block {
    public HeatedOre(Material mat) {
        super(mat);

        this.setBlockName("heated_ore");
        this.setBlockTextureName("bloomod:heated_ore");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5f);
    }

    public int quantityDroppedWithBonus(int fortuneLevel, Random rand){
        return this.quantityDropped
                (rand) + rand.nextInt(fortuneLevel +1);
    }
}
