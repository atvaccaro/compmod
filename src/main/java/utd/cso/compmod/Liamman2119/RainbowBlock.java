package utd.cso.compmod.Liamman2119;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

/**
 * Created by Liam on 8/11/2015.
 */
public class RainbowBlock extends Block {

    private IIcon topIcon;
    private IIcon sideIcon;
    private IIcon botIcon;
    public RainbowBlock(Material mat) {
        super(mat);

        this.setBlockName("rainbow_block");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockTextureName("BlooMod:rainbow_block");
    }
    @Override
    public void registerBlockIcons(IIconRegister ir){

    }
}
