package cz.mcDandy.FantasyMod.items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class Items {

    public static Item FiaryDust;
    public static Item FiaryDustPile;

    public static void createItems() {
    	GameRegistry.registerItem(FiaryDust = new FiaryDust("FiaryDust"), "FiaryDust");
    	GameRegistry.registerItem(FiaryDustPile = new FiaryDustPile("FiaryDustPile"), "FiaryDustPile");
    	
    	
    	GameRegistry.addShapedRecipe(new ItemStack(FiaryDustPile), new Object[] {"###", "###","###", '#', FiaryDust});
    }
}
