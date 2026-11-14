package nnnnarisa.narisafoundation.util.handler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import nnnnarisa.narisafoundation.init.BlockInit;
import nnnnarisa.narisafoundation.init.ItemInit;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(ItemInit.INGOT);
        event.getRegistry().register(ItemInit.NUGGET);
        event.getRegistry().register(ItemInit.ITEM_STORAGE_METAL);
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(BlockInit.STORAGE_METAL);
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        // Items
        ItemInit.INGOT.registerItemModel();
        ItemInit.NUGGET.registerItemModel();
        // Blocks
        BlockInit.STORAGE_METAL.registerItemModel();
    }

}
