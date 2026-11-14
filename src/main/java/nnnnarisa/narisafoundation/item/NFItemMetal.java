package nnnnarisa.narisafoundation.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nnnnarisa.narisafoundation.NarisaFoundation;
import nnnnarisa.narisafoundation.Tags;
import nnnnarisa.narisafoundation.util.IHasModel;

public class NFItemMetal extends Item implements IHasModel {

    public NFItemMetal(String typeName){
        setRegistryName(Tags.MOD_ID, typeName);
        setTranslationKey(typeName);
        setCreativeTab(NarisaFoundation.CREATIVE_TABS);
    }

    public void registerItemModel(){
        NarisaFoundation.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
