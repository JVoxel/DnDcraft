package gm3w.dndcraft.datagen.server;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.item.ModItems;
import gm3w.dndcraft.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator gen, BlockTagsProvider blockTags, ExistingFileHelper existingFileHelper) {
        super(gen, blockTags, DnDcraft.MOD_ID, existingFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags() {
        copy(ModTags.Blocks.ORES_SILVER, ModTags.Items.ORES_SILVER);
        copy(ModTags.Blocks.ORES_TITANIUM, ModTags.Items.ORES_TITANIUM);
        copy(ModTags.Blocks.ORES_MITHRIL, ModTags.Items.ORES_MITHRIL);
        copy(ModTags.Blocks.ORES_ADAMANT, ModTags.Items.ORES_ADAMANT);

        copy(ModTags.Blocks.STORAGE_BLOCKS_SILVER, ModTags.Items.STORAGE_BLOCKS_SILVER);
        copy(ModTags.Blocks.STORAGE_BLOCKS_TITANIUM, ModTags.Items.STORAGE_BLOCKS_TITANIUM);
        copy(ModTags.Blocks.STORAGE_BLOCKS_MITHRIL, ModTags.Items.STORAGE_BLOCKS_MITHRIL);
        copy(ModTags.Blocks.STORAGE_BLOCKS_ADAMANTINE, ModTags.Items.STORAGE_BLOCKS_ADAMANTINE);

        tag(ModTags.Items.RAW_MATERIALS_SILVER).add(ModItems.RAW_SILVER.get());
        tag(ModTags.Items.RAW_MATEIRALS_TITANIUM).add(ModItems.RAW_TITANIUM.get());
        tag(ModTags.Items.RAW_MATERIALS_MITHRIL).add(ModItems.RAW_MITHRIL.get());
        tag(ModTags.Items.RAW_MATERIALS_ADAMANT).add(ModItems.RAW_ADAMANT.get());

        tag(Tags.Items.ORES).addTags(ModTags.Items.ORES_SILVER, ModTags.Items.ORES_TITANIUM, ModTags.Items.ORES_MITHRIL, ModTags.Items.ORES_ADAMANT);
        tag(Tags.Items.RAW_MATERIALS).addTags(ModTags.Items.RAW_MATERIALS_SILVER, ModTags.Items.RAW_MATEIRALS_TITANIUM, ModTags.Items.RAW_MATEIRALS_TITANIUM, ModTags.Items.RAW_MATERIALS_ADAMANT);
        tag(Tags.Items.INGOTS).add(ModItems.SILVER_INGOT.get(), ModItems.TITANIUM_INGOT.get(), ModItems.MITHRIL_INGOT.get(), ModItems.ADAMANTINE_INGOT.get());
        tag(Tags.Items.NUGGETS).add(ModItems.COPPER_NUGGET.get(), ModItems.SILVER_NUGGET.get(), ModItems.TITANIUM_NUGGET.get(), ModItems.MITHRIL_NUGGET.get(), ModItems.ADAMANTINE_NUGGET.get());

        tag(Tags.Items.TOOLS_SWORDS).add(ModItems.COPPER_SWORD.get(), ModItems.SILVER_SWORD.get(), ModItems.TITANIUM_SWORD.get(), ModItems.MITHRIL_SWORD.get(), ModItems.ADAMANTINE_SWORD.get());
        tag(Tags.Items.TOOLS_SHOVELS).add(ModItems.COPPER_SHOVEL.get(), ModItems.SILVER_SHOVEL.get(), ModItems.TITANIUM_SHOVEL.get(), ModItems.MITHRIL_SHOVEL.get(), ModItems.ADAMANTINE_SHOVEL.get());
        tag(Tags.Items.TOOLS_PICKAXES).add(ModItems.BONE_PICKAXE.get(), ModItems.COPPER_PICKAXE.get(), ModItems.SILVER_PICKAXE.get(), ModItems.TITANIUM_PICKAXE.get(), ModItems.MITHRIL_PICKAXE.get(), ModItems.ADAMANTINE_PICKAXE.get());
        tag(Tags.Items.TOOLS_AXES).add(ModItems.COPPER_AXE.get(), ModItems.SILVER_AXE.get(), ModItems.TITANIUM_AXE.get(), ModItems.MITHRIL_AXE.get(), ModItems.ADAMANTINE_AXE.get());
        tag(Tags.Items.TOOLS_HOES).add(ModItems.COPPER_HOE.get(), ModItems.SILVER_HOE.get(), ModItems.TITANIUM_HOE.get(), ModItems.MITHRIL_HOE.get(), ModItems.ADAMANTINE_HOE.get());


    }
}
