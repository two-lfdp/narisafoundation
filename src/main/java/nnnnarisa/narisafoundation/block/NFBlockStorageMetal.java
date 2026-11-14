package nnnnarisa.narisafoundation.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import nnnnarisa.narisafoundation.NarisaFoundation;
import nnnnarisa.narisafoundation.Tags;
import nnnnarisa.narisafoundation.util.IHasModel;
import nnnnarisa.narisafoundation.util.IMetaName;
import nnnnarisa.narisafoundation.util.enums.EnumMetal;

public class NFBlockStorageMetal extends Block implements IHasModel, IMetaName {

    public static final PropertyEnum<EnumMetal> VARIANT = PropertyEnum.create("variant", EnumMetal.class);

    public NFBlockStorageMetal() {
        super(Material.IRON);
        setRegistryName(Tags.MOD_ID, "storage_metal");
        setTranslationKey("storageMetal");
        setCreativeTab(NarisaFoundation.CREATIVE_TABS);
        setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumMetal.COPPER));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, VARIANT);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return (state.getValue(VARIANT)).getMeta();
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return (state.getValue(VARIANT)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumMetal.byMeta(meta));
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player){
        return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
    }

    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        for (EnumMetal metal : EnumMetal.values()) {
            items.add(new ItemStack(this, 1, metal.getMeta()));
        }
    }

    @Override
    public String getSpecializedName(ItemStack stack) {
        return EnumMetal.byMeta(stack.getMetadata()).getUnlocalizedName();
    }

    @Override
    public void registerItemModel(){
        for (int i = 0; i < EnumMetal.values().length; i++) {
            NarisaFoundation.proxy.registerVariantItemRenderer(
                    Item.getItemFromBlock(this), i,
                    "storage_" + EnumMetal.values()[i].getName(), "inventory");
        }
    }

}
