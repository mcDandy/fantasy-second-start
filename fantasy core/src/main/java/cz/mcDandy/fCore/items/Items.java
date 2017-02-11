package cz.mcDandy.fCore.items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class Items {

    public static Item FiaryDust;

    public static void createItems() {
    	GameRegistry.registerItem(FiaryDust = new FiaryDust("FiaryDust"), "FiaryDust");
    }
}
