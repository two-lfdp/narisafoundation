package nnnnarisa.narisafoundation.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nnnnarisa.narisafoundation.NarisaFoundation;
import nnnnarisa.narisafoundation.Tags;
import nnnnarisa.narisafoundation.util.IHasModel;

public class NFBlockStorageMetal extends Block implements IHasModel {

    public NFBlockStorageMetal() {
        super(Material.IRON);
        setRegistryName(Tags.MOD_ID, "storage_metal");
        setTranslationKey("storageMetal");
        setCreativeTab(NarisaFoundation.CREATIVE_TABS);
    }

    public void registerItemModel(){
        NarisaFoundation.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
