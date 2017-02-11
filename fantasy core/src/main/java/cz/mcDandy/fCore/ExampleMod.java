package cz.mcDandy.fCore;

import cz.mcDandy.fCore.items.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)

public class ExampleMod
{
    public static final String MODID = "FantasyMod";
    public static final String VERSION = "0.0.1";
    @SidedProxy(clientSide="cz.mcDandy.fCore.ClientProxy", serverSide="cz.mcDandy.fCore.ServerProxy")
    public static CommonProxy proxy;  
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        this.proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        this.proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        this.proxy.postInit(e);
    }
}
