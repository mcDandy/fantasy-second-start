package cz.mcDandy.fCore.items;

import cz.mcDandy.fCore.ExampleMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {
	public static String modid = ExampleMod.MODID;

	public static void registerItemRenderer() {
	    reg(Items.FiaryDust);
	}

	public static void reg(Item item) {
		  System.out.println(item.getUnlocalizedName().substring(5));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	   .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
