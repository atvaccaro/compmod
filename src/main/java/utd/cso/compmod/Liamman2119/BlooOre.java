package utd.cso.compmod.Liamman2119;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.MathHelper;

import java.util.Random;

/**
 * Created by Liam on 8/11/2015.
 */
public class BlooOre extends Block {
        public BlooOre(Material mat){
            super(mat);
            this.setBlockName("bloo_ore");
            this.setCreativeTab(CreativeTabs.tabBlock);
            this.setBlockTextureName("BlooMod:bloo_ore");
            this.setHardness(3.0f);
            this.setHarvestLevel("pickaxe",3);
            this.setLightOpacity(3);
            this.setLightLevel(1.0f);
            this.setStepSound(Block.soundTypeMetal);
        }
        public int quantityDroppedWithBonus(int fortuneLevel,Random rand)
        {
            return this.quantityDropped(rand)+rand.nextInt(fortuneLevel+1);
        }
    }

