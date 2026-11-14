package nnnnarisa.narisafoundation.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import nnnnarisa.narisafoundation.init.ItemInit;
import nnnnarisa.narisafoundation.util.enums.EnumMetal;

public class NFCreativeTab extends CreativeTabs {

    public NFCreativeTab() {
        super("narisaFoundation");
    }

    public ItemStack createIcon() {
        return new ItemStack(ItemInit.INGOT, 1, EnumMetal.STEEL.getMeta());
    }
}
