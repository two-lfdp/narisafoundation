package nnnnarisa.narisafoundation.util.handler;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import nnnnarisa.narisafoundation.init.ItemInit;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(ItemInit.INGOT);
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        ItemInit.INGOT.registerItemModel();
    }

}
