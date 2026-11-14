package nnnnarisa.narisafoundation.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import nnnnarisa.narisafoundation.util.IMetaName;

public class NFItemBlockVariants extends ItemBlock {

    public NFItemBlockVariants(Block block) {
        super(block);
        setRegistryName(block.getRegistryName());
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @Override
    public String getTranslationKey(ItemStack stack){
        if (this.block instanceof IMetaName) {
            return super.getTranslationKey(stack) + ((IMetaName)this.block).getSpecializedName(stack);
        }
        return super.getTranslationKey(stack);
    }

}
