package utd.cso.compmod.sethloz;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import scala.xml.PrettyPrinter;
import utd.cso.compmod.CompMod;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Heather on 8/13/2015.
 */
public class BloodBeanBush extends BlockCrops {
    @SideOnly(Side.CLIENT)
    protected IIcon[] iIcon;

    public BloodBeanBush(){
        this.setBlockName("bloodbean_bush");
        this.setBlockTextureName("bloomod:bloodbean_stage_0");
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random rand){
        return (meta/2);
    }

    @Override
    public Item getItemDropped(int meta, Random rand, int fortune){
        return CompMod.blBean;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int stage) {
        return iIcon[stage];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister parIR){
        iIcon = new IIcon[8];

        iIcon[0] = parIR.registerIcon("bloomod:bloodbean_stage_0");
        iIcon[1] = parIR.registerIcon("bloomod:bloodbean_stage_0");
        iIcon[2] = parIR.registerIcon("bloomod:bloodbean_stage_1");
        iIcon[3] = parIR.registerIcon("bloomod:bloodbean_stage_1");
        iIcon[4] = parIR.registerIcon("bloomod:bloodbean_stage_2");
        iIcon[5] = parIR.registerIcon("bloomod:bloodbean_stage_2");
        iIcon[6] = parIR.registerIcon("bloomod:bloodbean_stage_3");
        iIcon[7] = parIR.registerIcon("bloomod:bloodbean_stage_3");
    }
    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int meta, int fortune){
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(CompMod.blBean));

        if(meta >= 7){
            for(int i = 0; i < 3+fortune; i++){
                if(world.rand.nextInt(10) <= meta){
                    drops.add(new ItemStack(CompMod.blBean));
                }
            }
        }
        return drops;
    }
}
