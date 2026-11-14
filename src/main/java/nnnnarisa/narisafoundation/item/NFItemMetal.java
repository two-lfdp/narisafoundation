package nnnnarisa.narisafoundation.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import nnnnarisa.narisafoundation.NarisaFoundation;
import nnnnarisa.narisafoundation.Tags;
import nnnnarisa.narisafoundation.util.IHasModel;
import nnnnarisa.narisafoundation.util.IMetaName;
import nnnnarisa.narisafoundation.util.enums.EnumMetal;

public class NFItemMetal extends Item implements IHasModel, IMetaName {

    String typeName;

    public NFItemMetal(String typeName){
        setRegistryName(Tags.MOD_ID, typeName);
        setTranslationKey(typeName);
        setHasSubtypes(true);
        setMaxDamage(0);
        setCreativeTab(NarisaFoundation.CREATIVE_TABS);

        this.typeName = typeName;
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
        if (this.isInCreativeTab(tab)) {
            for (EnumMetal metal : EnumMetal.values()) {
                items.add(new ItemStack(this, 1, metal.getMeta()));
            }
        }
    }

    @Override
    public String getSpecializedName(ItemStack stack) {
        return EnumMetal.byMeta(stack.getMetadata()).getUnlocalizedName();
    }

    @Override
    public String getTranslationKey(ItemStack stack){
        return super.getTranslationKey(stack) + getSpecializedName(stack);
    }

    @Override
    public void registerItemModel(){
        for (int i = 0; i < EnumMetal.values().length; i++) {
            NarisaFoundation.proxy.registerVariantItemRenderer(this, i,
                    typeName + "_" + EnumMetal.values()[i].getName(), "inventory");
        }
    }

}
