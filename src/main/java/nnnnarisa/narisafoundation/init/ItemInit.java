package nnnnarisa.narisafoundation.init;

import nnnnarisa.narisafoundation.item.NFItemBlock;
import nnnnarisa.narisafoundation.item.NFItemBlockVariants;
import nnnnarisa.narisafoundation.item.NFItemMetal;

public class ItemInit {

    public static final NFItemMetal INGOT = new NFItemMetal("ingot");
    public static final NFItemMetal NUGGET = new NFItemMetal("nugget");

    public static final NFItemBlockVariants ITEM_STORAGE_METAL = new NFItemBlockVariants(BlockInit.STORAGE_METAL);

}
