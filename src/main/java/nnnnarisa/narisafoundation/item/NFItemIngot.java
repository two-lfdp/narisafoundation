package nnnnarisa.narisafoundation.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nnnnarisa.narisafoundation.NarisaFoundation;
import nnnnarisa.narisafoundation.Tags;
import nnnnarisa.narisafoundation.util.IHasModel;

public class NFItemIngot extends Item implements IHasModel {

    public NFItemIngot(){
        setRegistryName(Tags.MOD_ID, "ingot");
        setTranslationKey("ingot");
        setCreativeTab(CreativeTabs.MATERIALS);
    }

    public void registerItemModel(){
        NarisaFoundation.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
