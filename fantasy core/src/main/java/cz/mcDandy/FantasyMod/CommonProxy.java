package cz.mcDandy.FantasyMod;

import cz.mcDandy.FantasyMod.blocks.Blocks;
import cz.mcDandy.FantasyMod.items.Items;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	Items.createItems();
    	Blocks.createBlocks();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
