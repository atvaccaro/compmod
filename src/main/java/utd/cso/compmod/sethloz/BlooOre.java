package utd.cso.compmod.sethloz;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Heather on 8/10/2015.
 */
public class BlooOre extends Block {
    protected BlooOre(Material mat) {
        super(mat);

        this.setBlockName("bloo_ore");
        this.setBlockTextureName("compmod:bloo_ore");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(2.5f);
    }

    public int quantityDroppedWithBonus(int fortuneLevel, Random rand){
        return this.quantityDropped
                (rand) + rand.nextInt(fortuneLevel +1);
    }
}
