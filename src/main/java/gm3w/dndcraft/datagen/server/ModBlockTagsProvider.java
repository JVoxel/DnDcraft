package gm3w.dndcraft.datagen.server;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.block.ModBlocks;
import gm3w.dndcraft.ModTags;
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
        // Vanilla-like tags
        tag(BlockTags.OVERWORLD_CARVER_REPLACEABLES).addTags(ModTags.Blocks.ORES_SILVER);
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTags(Tags.Blocks.ORES, Tags.Blocks.STORAGE_BLOCKS);
        tag(ModTags.Blocks.NEEDS_MITHRIL_TOOL).addTag(ModTags.Blocks.ORES_ADAMANT);
        tag(ModTags.Blocks.NEEDS_VANADIUM_TOOL).addTags(ModTags.Blocks.ORES_MITHRIL);
        tag(ModTags.Blocks.NEEDS_TITANIUM_TOOL).addTags(ModTags.Blocks.ORES_VANADIUM);
        tag(BlockTags.NEEDS_DIAMOND_TOOL).addTag(ModTags.Blocks.ORES_TITANIUM);
        tag(ModTags.Blocks.NEEDS_COPPER_TOOL).addTags(Tags.Blocks.ORES_IRON ,ModTags.Blocks.ORES_SILVER);
        tag(BlockTags.NEEDS_STONE_TOOL).addTag(Tags.Blocks.ORES_COPPER);
        tag(BlockTags.SNAPS_GOAT_HORN).addTags(ModTags.Blocks.ORES_SILVER);

        // Forge-like tags
        tag(Tags.Blocks.ORE_RATES_SINGULAR).addTags(ModTags.Blocks.ORES_SILVER, ModTags.Blocks.ORES_TITANIUM, ModTags.Blocks.ORES_VANADIUM, ModTags.Blocks.ORES_MITHRIL, ModTags.Blocks.ORES_ADAMANT);
        tag(Tags.Blocks.ORES).addTags(ModTags.Blocks.ORES_SILVER, ModTags.Blocks.ORES_TITANIUM, ModTags.Blocks.ORES_VANADIUM, ModTags.Blocks.ORES_MITHRIL, ModTags.Blocks.ORES_ADAMANT);
        tag(ModTags.Blocks.ORES_SILVER).add(ModBlocks.SILVER_ORE.get(), ModBlocks.DEEPSLATE_SILVER_ORE.get());
        tag(ModTags.Blocks.ORES_TITANIUM).add(ModBlocks.TITANIUM_ORE.get());
        tag(ModTags.Blocks.ORES_VANADIUM).add(ModBlocks.VANADIUM_ORE.get());
        tag(ModTags.Blocks.ORES_MITHRIL).add(ModBlocks.MITHRIL_ORE.get());
        tag(ModTags.Blocks.ORES_ADAMANT).add(ModBlocks.ADAMANT_ORE.get());
        tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(ModBlocks.DEEPSLATE_SILVER_ORE.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTags(ModTags.Blocks.STORAGE_BLOCKS_SILVER, ModTags.Blocks.STORAGE_BLOCKS_TITANIUM, ModTags.Blocks.ORES_VANADIUM, ModTags.Blocks.STORAGE_BLOCKS_MITHRIL, ModTags.Blocks.STORAGE_BLOCKS_ADAMANTINE);
        tag(ModTags.Blocks.STORAGE_BLOCKS_SILVER).add(ModBlocks.SILVER_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_BLOCKS_TITANIUM).add(ModBlocks.TITANIUM_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_BLOCKS_VANADIUM).add(ModBlocks.VANADIUM_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_BLOCKS_MITHRIL).add(ModBlocks.MITHRIL_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_BLOCKS_ADAMANTINE).add(ModBlocks.ADAMANTINE_BLOCK.get());

    }

    @Override
    public String getName() { return DnDcraft.MOD_ID + " Block Tags"; }
}
