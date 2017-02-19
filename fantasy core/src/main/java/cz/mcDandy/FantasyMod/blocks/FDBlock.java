package cz.mcDandy.FantasyMod.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class FDBlock extends BlockFalling {

    public FDBlock(String unlocalizedName) {
        super(Material.sand);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(1);

        this.setHarvestLevel("shovel", 0);
    }
}
