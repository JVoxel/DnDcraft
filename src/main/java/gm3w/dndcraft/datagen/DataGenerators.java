package gm3w.dndcraft.datagen;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.datagen.client.ModBlockStateProvider;
import gm3w.dndcraft.datagen.client.ModItemModelProvider;
import gm3w.dndcraft.datagen.client.ModLanguageProvider;
import gm3w.dndcraft.datagen.server.ModBlockTagsProvider;
import gm3w.dndcraft.datagen.server.ModItemTagsProvider;
import gm3w.dndcraft.datagen.server.ModLootTableProvider;
import gm3w.dndcraft.datagen.server.ModRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DnDcraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, fileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ModItemTagsProvider(generator, blockTags, fileHelper));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(generator));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(generator));

        generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator, fileHelper));
        generator.addProvider(event.includeClient() ,new ModItemModelProvider(generator, fileHelper));
        generator.addProvider(event.includeClient(), new ModLanguageProvider(generator, "en_us"));
    }

}
