package gm3w.dndcraft.datagen.server;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.registration.ModBlocks;
import gm3w.dndcraft.registration.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DnDcraft.MOD_ID, exFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags() {
        tag(ModTags.Blocks.ORES_SILVER).add(ModBlocks.SILVER_ORE.get(), ModBlocks.DEEPSLATE_SILVER_ORE.get());
        tag(ModTags.Blocks.ORES_TITANIUM).add(ModBlocks.TITANIUM_ORE.get(), ModBlocks.DEEPSLATE_TITANIUM_ORE.get());
        tag(ModTags.Blocks.ORES_MITHRIL).add(ModBlocks.MITHRIL_ORE.get());
        tag(ModTags.Blocks.ORES_ADAMANT).add(ModBlocks.ADAMANT_ORE.get());
        tag(ModTags.Blocks.STORAGE_BLOCKS_SILVER).add(ModBlocks.SILVER_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_BLOCKS_TITANIUM).add(ModBlocks.TITANIUM_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_BLOCKS_MITHRIL).add(ModBlocks.MITHRIL_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_BLOCKS_ADAMANTINE).add(ModBlocks.ADAMANTINE_BLOCK.get());

        tag(Tags.Blocks.ORES).addTags(ModTags.Blocks.ORES_SILVER, ModTags.Blocks.ORES_TITANIUM, ModTags.Blocks.ORES_MITHRIL, ModTags.Blocks.ORES_ADAMANT);
        tag(Tags.Blocks.STORAGE_BLOCKS).addTags(ModTags.Blocks.STORAGE_BLOCKS_SILVER, ModTags.Blocks.STORAGE_BLOCKS_TITANIUM, ModTags.Blocks.STORAGE_BLOCKS_MITHRIL, ModTags.Blocks.STORAGE_BLOCKS_ADAMANTINE);
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTags(Tags.Blocks.ORES, Tags.Blocks.STORAGE_BLOCKS);

        tag(BlockTags.NEEDS_STONE_TOOL).addTag(Tags.Blocks.ORES_COPPER);
        tag(ModTags.Blocks.NEEDS_COPPER_TOOL).addTags(Tags.Blocks.ORES_IRON ,ModTags.Blocks.ORES_SILVER);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(ModTags.Blocks.ORES_TITANIUM);
        tag(ModTags.Blocks.NEEDS_TITANIUM_TOOL).addTag(Tags.Blocks.ORES_DIAMOND);
        tag(BlockTags.NEEDS_DIAMOND_TOOL).addTag(ModTags.Blocks.ORES_MITHRIL);
        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).addTag(ModTags.Blocks.ORES_ADAMANT);
    }

    @Override
    public String getName() { return DnDcraft.MOD_ID + " Block Tags"; }
}
