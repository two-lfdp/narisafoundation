package nnnnarisa.narisafoundation;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nnnnarisa.narisafoundation.proxy.CommonProxy;
import nnnnarisa.narisafoundation.util.NFCreativeTab;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION)
public class NarisaFoundation {

    private static final String CLIENT_PROXY_CLASS = "nnnnarisa.narisafoundation.proxy.ClientProxy";
    private static final String SERVER_PROXY_CLASS = "nnnnarisa.narisafoundation.proxy.CommonProxy";

    public static final CreativeTabs CREATIVE_TABS = new NFCreativeTab();

    @Mod.Instance
    public static NarisaFoundation instance;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final Logger LOGGER = LogManager.getLogger(Tags.MOD_NAME);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("preInit");
    }

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event) {
        LOGGER.info("init");
    }

    @Mod.EventHandler
    public void postInit(FMLPreInitializationEvent event) {
        LOGGER.info("postInit");
    }

}
