package nnnnarisa.narisafoundation.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import nnnnarisa.narisafoundation.Tags;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(
                item, meta, new ModelResourceLocation(item.getRegistryName(), id)
        );
    }

    @Override
    public void registerVariantItemRenderer(Item item, int meta, String name, String id) {
        ModelLoader.setCustomModelResourceLocation(
                item, meta, new ModelResourceLocation(
                        new ResourceLocation(Tags.MOD_ID, name), id)
        );
    }

}
