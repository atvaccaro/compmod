package utd.cso.compmod;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import utd.cso.compmod.Liamman2119.*;

@Mod(modid = CompMod.MODID, version = CompMod.VERSION)
public class CompMod
{
    public static final String MODID = "compmod";
    public static final String VERSION = "0.1";
    //Tools
    public static final Item.ToolMaterial BLOOSW = EnumHelper.addToolMaterial("bloosw", 4, 1200, 10.0f, 4.0f, 50);
    public static final Item.ToolMaterial BLOOPA = EnumHelper.addToolMaterial("bloopa",4,12000,50.0f,0.0f,50);
    //Harvest level, durability, block dmg, entiity dmg, enchant
    //Armor
    public static final ItemArmor.ArmorMaterial JPACK = EnumHelper.addArmorMaterial("bloo_armor",500, new int[]{0,8,0,0},0);
    public static final ItemArmor.ArmorMaterial BLOOA =
            EnumHelper.addArmorMaterial("bloo_armor", 40, new int[]{4, 9, 7, 4}, 22);
    //Durability(Diamond Has 33),{helm, chest, legs, boots},enchantability
    //Blocks
    public static BlooBlock bBlock;
    public static BlooOre bOre;
    public static RainbowBlock rBlock;
    //Items
    public static BlooIngot bIngot;

    public static BlooStick bStick;

    public static BlooSword bSword;

    public static BlooPickaxe bPick;

    public static BlooSpade bSpade;

    public static BlooAxe bAxe;

    public static Tortilla tort;

    public static Burrito burt;

    public static Flour flour;

    public static BlooPieFilling bFilling;

    public static Dough dough;

    public static StonePiePan pPan;

    public static UncookedPie uPie;

    public static CookedPie cPie;

    public static BlooArrow bArrow;

    public static BlooBow bBow;
    //Armor
    public static BlooArmor bHelm;
    public static BlooArmor bChest;
    public static BlooArmor bLegs;
    public static BlooArmor bBoots;
    public static JetPack jPack;
    //Crops
    public static BlooBerryBush bBerryBush;
    public static Blooberries bBerry;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Bloo Block
        bBlock = new BlooBlock(Material.rock);
        GameRegistry.registerBlock(bBlock, "bloo_block");
        //Bloo Ore
        bOre = new BlooOre(Material.rock);
        GameRegistry.registerBlock(bOre, "bloo_ore");
        //Rainbow Block
        rBlock = new RainbowBlock(Material.rock);
        GameRegistry.registerBlock(rBlock, "rainbow_block");
        //Bl00 Ingot
        bIngot = new BlooIngot();
        GameRegistry.registerItem(bIngot, "bloo_ingot");
        //Bloo Stick
        bStick = new BlooStick();
        GameRegistry.registerItem(bStick, "bloo_stick");
        bSword = new BlooSword(BLOOSW);
        GameRegistry.registerItem(bSword, "bloo_sword");
        bPick = new BlooPickaxe(BLOOPA);
        GameRegistry.registerItem(bPick, "bloo_pickaxe");
        bSpade = new BlooSpade(BLOOPA);
        GameRegistry.registerItem(bSpade, "bloo_spade");
        bAxe = new BlooAxe(BLOOPA);
        GameRegistry.registerItem(bAxe, "bloo_axe");
        flour = new Flour();
        GameRegistry.registerItem(flour, "flour");
        bFilling = new BlooPieFilling();
        GameRegistry.registerItem(bFilling, "bloo_pie_filling");
        dough = new Dough();
        GameRegistry.registerItem(dough, "dough");
        pPan = new StonePiePan();
        GameRegistry.registerItem(pPan, "pie_pan");
        //Arrow and bow
        bArrow = new BlooArrow();
        GameRegistry.registerItem(bArrow, "bloo_arrow");
        bBow = new BlooBow();
        GameRegistry.registerItem(bBow, "bloo_bow");
        //Entity
        EntityRegistry.registerGlobalEntityID(EntityBlooArrow.class,
                "bloo_arrow",
                EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityBlooArrow.class, "bloo_arrow", 1, CompMod.MODID, 128, 1, true);
        uPie = new UncookedPie(2,0.4f,false);
        GameRegistry.registerItem(uPie,"uncooked_pie");
        cPie = new CookedPie(20,1.2f,true);
        GameRegistry.registerItem(cPie, "cooked_pie");
        //Food
        tort = new Tortilla(2,0.4f, false);
        GameRegistry.registerItem(tort, "tortilla");
        burt = new Burrito(20,1.2f,true);
        GameRegistry.registerItem(burt, "burrito");
        //Crops
        bBerryBush = new BlooBerryBush();
        GameRegistry.registerBlock(bBerryBush, "blooberry_bush");
        bBerry = new Blooberries();
        GameRegistry.registerItem(bBerry, "blooberries");
        //Armor
        bHelm = new BlooArmor(BLOOA, 0, "bloo_helm");
        bChest = new BlooArmor(BLOOA, 1, "bloo_chest");
        bLegs = new BlooArmor(BLOOA, 2,"bloo_legs");
        bBoots = new BlooArmor(BLOOA, 3, "bloo_boots");
        GameRegistry.registerItem(bHelm,"bHelm");
        GameRegistry.registerItem(bChest,"bChest");
        GameRegistry.registerItem(bLegs,"bLegs");
        GameRegistry.registerItem(bBoots, "bBoots");
        jPack = new JetPack();
        GameRegistry.registerItem(jPack, "jetpack");

        GameRegistry.addShapedRecipe(new ItemStack(uPie),
                "_d_",
                "_f_",
                "_p_",
                'd', new ItemStack(dough),
                'f', new ItemStack(bFilling),
                'p', new ItemStack(pPan));
        GameRegistry.addShapedRecipe(new ItemStack(pPan),
                "___",
                "sss",
                "___",
                's', new ItemStack(Blocks.stone_slab));
        GameRegistry.addShapedRecipe(new ItemStack(dough),
                "___",
                "_w_",
                "_f_",
                'w', new ItemStack(Items.water_bucket),
                'f', new ItemStack(flour));
        GameRegistry.addShapelessRecipe(new ItemStack(bFilling), new ItemStack(bBerry));
        GameRegistry.addShapelessRecipe(new ItemStack(flour), new ItemStack(Items.wheat));
        GameRegistry.addShapedRecipe(new ItemStack(bHelm),
                "iii",
                "i_i",
                "___",
                'i', new ItemStack(bIngot));
        GameRegistry.addShapedRecipe(new ItemStack(bChest),
                "i_i",
                "iii",
                "iii",
                'i', new ItemStack(bIngot));
        GameRegistry.addShapedRecipe(new ItemStack(bLegs),
                "iii",
                "i_i",
                "i_i",
                'i', new ItemStack(bIngot));
        GameRegistry.addShapedRecipe(new ItemStack(bBoots),
                "___",
                "i_i",
                "i_i",
                'i', new ItemStack(bIngot));
        GameRegistry.addShapedRecipe(new ItemStack(burt),
                "_t_",
                "_s_",
                "_t_",
                't', new ItemStack(tort),
                's', new ItemStack(Items.cooked_beef));

        GameRegistry.addShapedRecipe(new ItemStack(tort),
                "___",
                "ww_",
                "ww_",
                'w', new ItemStack(Items.wheat));

        GameRegistry.addShapedRecipe(new ItemStack(bAxe),
                "ii_",
                "is_",
                "_s_",
                'i', new ItemStack(bIngot),
                's', new ItemStack(bStick));

        GameRegistry.addShapedRecipe(new ItemStack(bSpade),
                "_i_",
                "_s_",
                "_s_",
                'i', new ItemStack(bIngot),
                's', new ItemStack(bStick));
        GameRegistry.addShapedRecipe(new ItemStack(bPick),
                "iii",
                "_s_",
                "_s_",
                'i', new ItemStack(bIngot),
                's', new ItemStack(bStick));
        GameRegistry.addShapedRecipe(new ItemStack(bSword),
                "_i_",
                "_i_",
                "_s_",
                'i', new ItemStack(bIngot),
                's', new ItemStack(bStick));

        GameRegistry.addShapedRecipe(new ItemStack(bStick),
                "___",
                "_i_",
                "_i_",
                'i', new ItemStack(bIngot));
        GameRegistry.addShapelessRecipe(new ItemStack(bIngot, 9), new ItemStack(bBlock));
        GameRegistry.addShapedRecipe(new ItemStack(bBlock, 1),
                "iii",
                "iii",
                "iii",
                'i', new ItemStack(bIngot));
        GameRegistry.addSmelting(new ItemStack(bOre), new ItemStack(bIngot), 0.1f);
        GameRegistry.addSmelting(new ItemStack(uPie), new ItemStack(cPie),0.1f);

        OreManager om = new OreManager();
        GameRegistry.registerWorldGenerator(om, 0); //int=order

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
