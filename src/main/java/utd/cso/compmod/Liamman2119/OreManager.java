package utd.cso.compmod.Liamman2119;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import utd.cso.compmod.CompMod;

import java.util.Random;

/**
 * Created by Liam on 8/12/2015.
 */
public class OreManager implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 0: generateSurface(world, random, chunkX*16,chunkZ*16);
                break;
            case 1: generateEnd(world, random, chunkX*16,chunkZ*16);
                break;
        }
    }

    private void generateNether(World world, Random random, int x, int z) {
    }

    private void generateEnd(World world, Random random, int x, int z) {
    }

    private void generateSurface(World world, Random random, int x, int z) {
        this.addOreSpawn(CompMod.bOre, world, random, x, z, 16, 16, 10, 128, 15, 100);
    }

    private void addOreSpawn(Block block, World world, Random random, int blockXpos, int blockZpos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn,
                             int minY, int maxY)
    {
        assert maxY > minY:
                "addOreSpawn: maxY must be greater than minY";
        assert minY> 0 :
                "addOreSpawn: minY must be greater than zero";
        assert maxY <256 && maxY > 0:
                "addOreSpawn: maxY > 0 and maxY < 256 not met";
        assert maxX >0 && maxX <= 16:
                "addOreSpawn: maxX > 0 and max x <=16 not met";
        assert maxZ > 0 && maxZ <= 16:
                "addOreSpawn: maxZ > 0 and maxZ <= 16 not met";

        int diffy = maxY-minY;
        for(int i = 0; i < chancesToSpawn; i++){
            int posX = blockXpos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffy);
            int posZ = blockZpos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }


}
