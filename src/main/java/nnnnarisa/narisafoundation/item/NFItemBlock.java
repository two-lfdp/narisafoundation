package nnnnarisa.narisafoundation.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import nnnnarisa.narisafoundation.Tags;

public class NFItemBlock extends ItemBlock {

    public NFItemBlock(Block block) {
        super(block);
        setRegistryName(block.getRegistryName());
    }

}
