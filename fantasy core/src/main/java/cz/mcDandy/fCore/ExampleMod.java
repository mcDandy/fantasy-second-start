package cz.mcDandy.fCore;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)

public class ExampleMod
{
    public static final String MODID = "fCore";
    public static final String VERSION = "0.0.1";
    @SidedProxy(clientSide="cz.mcDandy.fCore.ClientProxy", serverSide="cz.mcDandy.fCore.ServerProxy")
    public static CommonProxy proxy;  
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
