package gm3w.dndcraft;

import gm3w.dndcraft.block.ModBlocks;
import gm3w.dndcraft.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DnDcraft.MOD_ID)
public class DnDcraft
{
    public static final String MOD_ID = "dndcraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DnDcraft()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.init(modEventBus);
        ModItems.init(modEventBus);
    }

}
