package cz.mcDandy.FantasyMod.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class Blocks {

    public static Block FiaryDustBlock;

    public static void createBlocks() {
        GameRegistry.registerBlock(FiaryDustBlock = new FDBlock("FiaryDustBlock"), "FiaryDustBlock");
    }
}