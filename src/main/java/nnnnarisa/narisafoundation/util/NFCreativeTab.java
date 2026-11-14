package nnnnarisa.narisafoundation.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import nnnnarisa.narisafoundation.init.ItemInit;

public class NFCreativeTab extends CreativeTabs {

    public NFCreativeTab() {
        super("narisaFoundation");
    }

    public ItemStack createIcon() {
        return new ItemStack(ItemInit.INGOT);
    }
}
