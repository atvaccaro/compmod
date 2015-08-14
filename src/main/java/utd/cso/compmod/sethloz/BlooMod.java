package com.example.examplemod;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import utd.cso.compmod.sethloz.BlooBlock;

@Mod(modid = BlooMod.MODID, version = BlooMod.VERSION)
public class BlooMod
{
    public static final String MODID = "bloomod";
    public static final String VERSION = "0.1";

    public static final Item.ToolMaterial NYAN = EnumHelper.addToolMaterial("nyan", 2, 6000, 1.0f, 800.0f, 22);
    public static final Item.ToolMaterial BLOO = EnumHelper.addToolMaterial("bloo", 2, 6000, 1.0f, 10.0f, 22);
    public static final Item.ToolMaterial COOK = EnumHelper.addToolMaterial("cook", 2, 6000, 1.0f, 20.0f, 22);
    public static final Item.ToolMaterial PICK = EnumHelper.addToolMaterial("pick", 2, 6000, 500.0f, 20.0f, 22);
    public static final Item.ToolMaterial MEGA = EnumHelper.addToolMaterial("mega", 2, 6000, 1.0f, 5.0f, 22);
    public static final ItemArmor.ArmorMaterial MEGAA = EnumHelper.addArmorMaterial("mega_armor", 10000, new int[]{5, 10, 10, 5}, 3);
    public static final Item.ToolMaterial DIME = EnumHelper.addToolMaterial("dime", 2, 6000, 1.0f, 20.0f, 22);
    public static final Item.ToolMaterial DIMP = EnumHelper.addToolMaterial("dimp", 2, 6000, 1000.0f, 20.0f, 22);
    public static final Item.ToolMaterial PICKD = EnumHelper.addToolMaterial("pick", 2, 6000, 500.0f, 20.0f, 22);
    public static final ItemArmor.ArmorMaterial DIMEA = EnumHelper.addArmorMaterial("dimension_armor", 10000, new int[]{5, 10, 10, 5}, 3);
    public static final ItemArmor.ArmorMaterial WOLFA = EnumHelper.addArmorMaterial("dimension_armor", 10000, new int[]{5, 10, 10, 5}, 3);

    public static BlooBlock bBlock;
    public static BlooIngot bIngot;
    public static BlooOre bOre;
    public static NyanBlock nBlock;
    public static NyanSword nSword;
    public static BlooSword bSword;
    public static TheCookerSword cSword;
    public static FireIngot fIngot;
    public static HeatedOre hOre;
    public static MeltedBlock mBlock;
    public static NyanPickaxe nPickaxe;
    public static BlooBean bBean;
    public static MegaSword mSword;
    public static MegaArmor mHelm;
    public static MegaArmor mChest;
    public static MegaArmor mLegs;
    public static MegaArmor mBoots;
    public static DimensionIngot dIngot;
    public static DimensionalOre dOre;
    public static DimensionalSword dSword;
    public static DimensionShovel dShovel;
    public static DimensionPickaxe dPickaxe;
    public static DimensionArmor dHelm;
    public static DimensionArmor dChest;
    public static DimensionArmor dLegs;
    public static DimensionArmor dBoots;
    public static BloodBean blBean;
    public static BloodBeanBush blBeanBlock;
    public static MixingBowl mBowl;
    public static BowlOfBloodBean blBowl;
    public static MegaBow mBow;
    public static MegaArrow mArrow;
    public static WolfArmor wHelm;
    public static WolfArmor wChest;
    public static WolfArmor wLegs;
    public static WolfArmor wBoots;
    
    @EventHandler
    public void preinit(FMLInitializationEvent event){
        bBlock = new BlooBlock(Material.iron);
        GameRegistry.registerBlock(bBlock, "bloo_block");

        bIngot = new BlooIngot();
        GameRegistry.registerItem(bIngot, "bloo_ingot");

        bOre = new BlooOre(Material.iron);
        GameRegistry.registerBlock(bOre, "bloo_ore");

        nBlock = new NyanBlock(Material.iron);
        GameRegistry.registerBlock(nBlock, "nyan_block");

        nSword = new NyanSword(NYAN);
        GameRegistry.registerItem(nSword, "nyan_sword");

        bSword = new BlooSword(BLOO);
        GameRegistry.registerItem(bSword, "bloo_sword");

        cSword = new TheCookerSword(COOK);
        GameRegistry.registerItem(cSword, "the_cooker_sword");

        fIngot = new FireIngot();
        GameRegistry.registerItem(fIngot, "fire_ingot");

        hOre = new HeatedOre(Material.iron);
        GameRegistry.registerBlock(hOre, "heated_ore");

        mBlock = new MeltedBlock(Material.iron);
        GameRegistry.registerBlock(mBlock, "melted_block");

        nPickaxe = new NyanPickaxe(PICK);
        GameRegistry.registerItem(nPickaxe, "nyan_pickaxe");

        bBean = new BlooBean(20, 0.1f, false);
        GameRegistry.registerItem(bBean, "bloo_bean");

        mSword = new MegaSword(MEGA);
        GameRegistry.registerItem(mSword, "mega_sword");

        mHelm = new MegaArmor(MEGAA, 0, "mega_helmet");

        mChest = new MegaArmor(MEGAA, 1, "mega_chestplate");

        mLegs = new MegaArmor(MEGAA, 2, "mega_leggings");

        mBoots = new MegaArmor(MEGAA, 3, "mega_boots");

        GameRegistry.registerItem(mHelm, "mHelm");
        GameRegistry.registerItem(mChest, "mChest");
        GameRegistry.registerItem(mLegs, "mLegs");
        GameRegistry.registerItem(mBoots, "mBoots");

        dIngot = new DimensionIngot();
        GameRegistry.registerItem(dIngot, "dimension_ingot");

        dOre = new DimensionalOre(Material.iron);
        GameRegistry.registerBlock(dOre, "dimensional_ore");

        dSword = new DimensionalSword(DIME);
        GameRegistry.registerItem(dSword, "dimensional_sword");

        dShovel = new DimensionShovel(DIMP);
        GameRegistry.registerItem(dShovel, "dimension_shovel");

        dPickaxe = new DimensionPickaxe(PICKD);
        GameRegistry.registerItem(dPickaxe, "dimension_pickaxe");

        dHelm = new DimensionArmor(DIMEA, 0, "dimension_helmet");

        dChest = new DimensionArmor(DIMEA, 1, "dimension_chestplate");

        dLegs = new DimensionArmor(DIMEA, 2, "dimension_leggings");

        dBoots = new DimensionArmor(DIMEA, 3, "dimension_boots");

        GameRegistry.registerItem(dHelm, "dHelm");
        GameRegistry.registerItem(dChest, "dChest");
        GameRegistry.registerItem(dLegs, "dLegs");
        GameRegistry.registerItem(dBoots, "dBoots");

        blBeanBlock = new BloodBeanBush();
        GameRegistry.registerBlock(blBeanBlock, "blBeanBlock");

        blBean = new BloodBean();
        GameRegistry.registerItem(blBean, "blBean");

        mBowl = new MixingBowl();
        GameRegistry.registerItem(mBowl, "mixing_bowl");

        //blBowl = new DimensionIngot();
        //GameRegistry.registerItem(dIngot, "dimension_ingot");

        mBow = new MegaBow();
        GameRegistry.registerItem(mBow, "mega_bow");

        mArrow = new MegaArrow();
        GameRegistry.registerItem(mArrow, "mega_arrow");

        wHelm = new WolfArmor(WOLFA, 0, "wolf_helmet");

        wChest = new WolfArmor(WOLFA, 1, "wolf_chestplate");

        wLegs = new WolfArmor(WOLFA, 2, "wolf_leggings");

        wBoots = new WolfArmor(WOLFA, 3, "wolf_boots");

        GameRegistry.registerItem(wHelm, "wHelm");
        GameRegistry.registerItem(wChest, "wChest");
        GameRegistry.registerItem(wLegs, "wLegs");
        GameRegistry.registerItem(wBoots, "wBoots");

        blBowl = new BowlOfBloodBean();
        GameRegistry.registerItem(blBowl, "bowlof_bloodbean");

        EntityRegistry.registerGlobalEntityID(EntityMegaArrow.class, "mega_arrow",
                EntityRegistry.findGlobalUniqueEntityId());

        EntityRegistry.registerModEntity(EntityMegaArrow.class, "mega_arrow", 1, "bloomod", 128, 1, true);




        GameRegistry.addShapelessRecipe(new ItemStack(bIngot, 9), new ItemStack(bBlock));
        GameRegistry.addShapedRecipe(new ItemStack(bBlock, 1), "iii", "iii", "iii", 'i', new ItemStack(bIngot));
        GameRegistry.addSmelting(new ItemStack(bOre), new ItemStack(bIngot), 0.1f);
        GameRegistry.addShapelessRecipe(new ItemStack(nBlock), new ItemStack(bIngot));
        GameRegistry.addShapedRecipe(new ItemStack(nSword, 1), " b ", " b ", " s", 'b', new ItemStack(nBlock), 's', new ItemStack(Items.stick)
        );
        GameRegistry.addShapedRecipe(new ItemStack(bSword, 1), " b ", " b ", " s ", 'b', new ItemStack(bBlock), 's', new ItemStack(Items.stick)
        );
        GameRegistry.addShapedRecipe(new ItemStack(cSword, 1),
                "ibi",
                "ibi",
                " s ",
                'b', new ItemStack(mBlock), 's', new ItemStack(Items.stick), 'i', new ItemStack(fIngot));
        GameRegistry.addSmelting(new ItemStack(hOre), new ItemStack(fIngot), 0.1f);
        GameRegistry.addShapelessRecipe(new ItemStack(fIngot, 9), new ItemStack(mBlock));
        GameRegistry.addShapedRecipe(new ItemStack(mBlock, 1), "iii", "iii", "iii", 'i', new ItemStack(fIngot));
        GameRegistry.addShapedRecipe(new ItemStack(nPickaxe, 1), "bbb", " s ", "s", 'b', new ItemStack(nBlock), 's', new ItemStack(Items.stick)
        );
        GameRegistry.addShapelessRecipe(new ItemStack(bBean, 2), new ItemStack(bIngot), new ItemStack(nBlock));
        GameRegistry.addShapedRecipe(new ItemStack(mSword, 1),
                "mib",
                "nin",
                "msb",
                'b', new ItemStack(bBlock), 's', new ItemStack(Items.stick), 'i', new ItemStack(fIngot), 'm', new ItemStack(mBlock), 'n', new ItemStack(nBlock));
        GameRegistry.addShapedRecipe(new ItemStack(mSword, 1),
                "mib",
                "nin",
                "msb",
                'b', new ItemStack(bBlock), 's', new ItemStack(Items.stick), 'i', new ItemStack(fIngot), 'm', new ItemStack(mBlock), 'n', new ItemStack(nBlock));
        GameRegistry.addShapedRecipe(new ItemStack(mHelm, 1),
                "mnb",
                "m b",
                "   ",
                'b', new ItemStack(bBlock), 'm', new ItemStack(mBlock), 'n', new ItemStack(nBlock));

        GameRegistry.addShapedRecipe(new ItemStack(mChest, 1),
                "m b",
                "mnb",
                "mnb",
                'b', new ItemStack(bBlock), 'm', new ItemStack(mBlock), 'n', new ItemStack(nBlock));
        GameRegistry.addShapedRecipe(new ItemStack(mLegs, 1),
                "mnb",
                "m b",
                "m b",
                'b', new ItemStack(bBlock), 'm', new ItemStack(mBlock), 'n', new ItemStack(nBlock));
        GameRegistry.addShapedRecipe(new ItemStack(mBoots, 1),
                "   ",
                "m b",
                "m b",
                'b', new ItemStack(bBlock), 'm', new ItemStack(mBlock), 'n', new ItemStack(nBlock));
        GameRegistry.addSmelting(new ItemStack(dOre), new ItemStack(dIngot), 0.1f);
        GameRegistry.addShapedRecipe(new ItemStack(dSword, 1),
                " i ",
                " d ",
                " s ",
                's', new ItemStack(Items.stick), 'i', new ItemStack(dIngot), 'd', new ItemStack(dOre));
        GameRegistry.addShapedRecipe(new ItemStack(dPickaxe, 1), "bbb", "isi", " s ", 'b', new ItemStack(dOre), 's', new ItemStack(Items.stick), 'i', new ItemStack(dIngot)
        );
        GameRegistry.addShapedRecipe(new ItemStack(dShovel, 1), " b ", "isi", " s ", 'b', new ItemStack(dOre), 's', new ItemStack(Items.stick), 'i', new ItemStack(dIngot)
        );
        GameRegistry.addShapedRecipe(new ItemStack(mBowl, 1),
                "   ",
                "sts",
                " s ",
                't', new ItemStack(Items.stick), 's', new ItemStack(Blocks.cobblestone));
        GameRegistry.addShapedRecipe(new ItemStack(dPickaxe, 1), "bbb", "isi", " s ", 'b', new ItemStack(dOre), 's', new ItemStack(Items.stick), 'i', new ItemStack(dIngot)
        );
        GameRegistry.addShapelessRecipe(new ItemStack(blBowl, 1), new ItemStack(mBowl), new ItemStack(blBean));
        GameRegistry.addShapedRecipe(new ItemStack(dPickaxe, 1), "bbb", "isi", " s ", 'b', new ItemStack(dOre), 's', new ItemStack(Items.stick), 'i', new ItemStack(dIngot)
        );
        OreManager om = new OreManager();
        GameRegistry.registerWorldGenerator(om, 0);
    }

}
