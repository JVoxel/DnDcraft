package gm3w.dndcraft.datagen.client;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.registration.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) { super(gen, DnDcraft.MOD_ID, exFileHelper); }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.SILVER_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_SILVER_ORE.get());
        simpleBlock(ModBlocks.TITANIUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_TITANIUM_ORE.get());
        simpleBlock(ModBlocks.MITHRIL_ORE.get());
        simpleBlock(ModBlocks.ADAMANT_ORE.get());

        simpleBlock(ModBlocks.SILVER_BLOCK.get());
        simpleBlock(ModBlocks.TITANIUM_BLOCK.get());
        simpleBlock(ModBlocks.MITHRIL_BLOCK.get());
        simpleBlock(ModBlocks.ADAMANTINE_BLOCK.get());
    }
}
