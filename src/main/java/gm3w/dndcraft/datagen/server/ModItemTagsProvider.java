package gm3w.dndcraft.datagen.server;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.item.ModItems;
import gm3w.dndcraft.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator gen, BlockTagsProvider blockTags, ExistingFileHelper existingFileHelper) {
        super(gen, blockTags, DnDcraft.MOD_ID, existingFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags() {



        tag(Tags.Items.INGOTS).add(ModItems.SILVER_INGOT.get(), ModItems.TITANIUM_INGOT.get(), ModItems.VANADIUM_INGOT.get(), ModItems.MITHRIL_INGOT.get(), ModItems.ADAMANTINE_INGOT.get());
        tag(Tags.Items.NUGGETS).add(ModItems.COPPER_NUGGET.get(), ModItems.SILVER_NUGGET.get(), ModItems.TITANIUM_NUGGET.get(), ModItems.VANADIUM_NUGGET.get(), ModItems.MITHRIL_NUGGET.get(), ModItems.ADAMANTINE_NUGGET.get());
        tag(Tags.Items.ORE_RATES_SINGULAR).addTags(ModTags.Items.ORES_SILVER, ModTags.Items.ORES_TITANIUM, ModTags.Items.ORES_VANADIUM, ModTags.Items.ORES_MITHRIL, ModTags.Items.ORES_ADAMANT);
        tag(Tags.Items.ORES).addTags(ModTags.Items.ORES_SILVER, ModTags.Items.ORES_TITANIUM, ModTags.Items.ORES_VANADIUM, ModTags.Items.ORES_MITHRIL, ModTags.Items.ORES_ADAMANT);
        copy(ModTags.Blocks.ORES_SILVER, ModTags.Items.ORES_SILVER);
        copy(ModTags.Blocks.ORES_TITANIUM, ModTags.Items.ORES_TITANIUM);
        copy(ModTags.Blocks.ORES_VANADIUM, ModTags.Items.ORES_VANADIUM);
        copy(ModTags.Blocks.ORES_MITHRIL, ModTags.Items.ORES_MITHRIL);
        copy(ModTags.Blocks.ORES_ADAMANT, ModTags.Items.ORES_ADAMANT);
        tag(Tags.Items.RAW_MATERIALS).addTags(ModTags.Items.RAW_MATERIALS_SILVER, ModTags.Items.RAW_MATEIRALS_TITANIUM, ModTags.Items.RAW_MATERIALS_VANADIUM, ModTags.Items.RAW_MATEIRALS_TITANIUM, ModTags.Items.RAW_MATERIALS_ADAMANT);
        tag(ModTags.Items.RAW_MATERIALS_SILVER).add(ModItems.RAW_SILVER.get());
        tag(ModTags.Items.RAW_MATEIRALS_TITANIUM).add(ModItems.RAW_TITANIUM.get());
        tag(ModTags.Items.RAW_MATERIALS_VANADIUM).add(ModItems.RAW_VANADIUM.get());
        tag(ModTags.Items.RAW_MATERIALS_MITHRIL).add(ModItems.RAW_MITHRIL.get());
        tag(ModTags.Items.RAW_MATERIALS_ADAMANT).add(ModItems.RAW_ADAMANT.get());
        tag(Tags.Items.STORAGE_BLOCKS).addTags(ModTags.Items.STORAGE_BLOCKS_SILVER, ModTags.Items.STORAGE_BLOCKS_TITANIUM, ModTags.Items.ORES_VANADIUM, ModTags.Items.STORAGE_BLOCKS_MITHRIL, ModTags.Items.STORAGE_BLOCKS_ADAMANTINE);
        copy(ModTags.Blocks.STORAGE_BLOCKS_SILVER, ModTags.Items.STORAGE_BLOCKS_SILVER);
        copy(ModTags.Blocks.STORAGE_BLOCKS_TITANIUM, ModTags.Items.STORAGE_BLOCKS_TITANIUM);
        copy(ModTags.Blocks.STORAGE_BLOCKS_VANADIUM, ModTags.Items.STORAGE_BLOCKS_VANADIUM);
        copy(ModTags.Blocks.STORAGE_BLOCKS_MITHRIL, ModTags.Items.STORAGE_BLOCKS_MITHRIL);
        copy(ModTags.Blocks.STORAGE_BLOCKS_ADAMANTINE, ModTags.Items.STORAGE_BLOCKS_ADAMANTINE);
        tag(ModTags.Items.MOD_TOOLS_SWORDS).add(ModItems.BONE_SWORD.get(), ModItems.COPPER_SWORD.get(), ModItems.SILVER_SWORD.get(), ModItems.TITANIUM_SWORD.get(), ModItems.VANADIUM_SWORD.get(), ModItems.MITHRIL_SWORD.get(), ModItems.ADAMANTINE_SWORD.get());
        tag(ModTags.Items.MOD_TOOLS_SHOVELS).add(ModItems.BONE_SHOVEL.get(), ModItems.COPPER_SHOVEL.get(), ModItems.SILVER_SHOVEL.get(), ModItems.TITANIUM_SHOVEL.get(), ModItems.VANADIUM_SHOVEL.get(), ModItems.MITHRIL_SHOVEL.get(), ModItems.ADAMANTINE_SHOVEL.get());
        tag(ModTags.Items.MOD_TOOLS_PICKAXES).add(ModItems.BONE_PICKAXE.get(), ModItems.COPPER_PICKAXE.get(), ModItems.SILVER_PICKAXE.get(), ModItems.TITANIUM_PICKAXE.get(), ModItems.VANADIUM_PICKAXE.get(), ModItems.MITHRIL_PICKAXE.get(), ModItems.ADAMANTINE_PICKAXE.get());
        tag(ModTags.Items.MOD_TOOLS_AXES).add(ModItems.BONE_AXE.get(), ModItems.COPPER_AXE.get(), ModItems.SILVER_AXE.get(), ModItems.TITANIUM_AXE.get(), ModItems.VANADIUM_AXE.get(), ModItems.MITHRIL_AXE.get(), ModItems.ADAMANTINE_AXE.get());
        tag(ModTags.Items.MOD_TOOLS_HOES).add(ModItems.BONE_HOE.get(), ModItems.COPPER_HOE.get(), ModItems.SILVER_HOE.get(), ModItems.TITANIUM_HOE.get(), ModItems.VANADIUM_HOE.get(), ModItems.MITHRIL_HOE.get(), ModItems.ADAMANTINE_HOE.get());
        tag(Tags.Items.TOOLS_SWORDS).addTag(ModTags.Items.MOD_TOOLS_SWORDS);
        tag(Tags.Items.TOOLS_SHOVELS).addTag(ModTags.Items.MOD_TOOLS_SHOVELS);
        tag(Tags.Items.TOOLS_PICKAXES).addTag(ModTags.Items.MOD_TOOLS_PICKAXES);
        tag(Tags.Items.TOOLS_AXES).addTag(ModTags.Items.MOD_TOOLS_AXES);
        tag(Tags.Items.TOOLS_HOES).addTag(ModTags.Items.MOD_TOOLS_HOES);
        tag(Tags.Items.TOOLS).addTags(ModTags.Items.MOD_TOOLS_SWORDS, ModTags.Items.MOD_TOOLS_SHOVELS, ModTags.Items.MOD_TOOLS_PICKAXES, ModTags.Items.MOD_TOOLS_AXES, ModTags.Items.MOD_TOOLS_HOES);
        tag(ModTags.Items.MOD_HELMETS).add(ModItems.WOODEN_HELMET.get(), ModItems.COPPER_CHAINMAIL_HELMET.get(), ModItems.GOLD_CHAINMAIL_HELMET.get(), ModItems.COPPER_HELMET.get(), ModItems.SILVER_CHAINMAIL_HELMET.get(), ModItems.SILVER_HELMET.get(), ModItems.TITANIUM_CHAINMAIL_HELMET.get(), ModItems.TITANIUM_HELMET.get(), ModItems.VANADIUM_CHAINMAIL_HELMET.get(), ModItems.VANADIUM_HELMET.get(), ModItems.MITHRIL_CHAINMAIL_HELMET.get(), ModItems.MITHRIL_HELMET.get(), ModItems.ADAMANTINE_CHAINMAIL_HELMET.get(), ModItems.ADAMANTINE_HELMET.get());
        tag(ModTags.Items.MOD_CHESTPLATES).add(ModItems.WOODEN_CHESTPLATE.get(), ModItems.COPPER_CHAINMAIL_CHESTPLATE.get(), ModItems.GOLD_CHAINMAIL_CHESTPLATE.get(), ModItems.COPPER_CHESTPLATE.get(), ModItems.SILVER_CHAINMAIL_CHESTPLATE.get(), ModItems.SILVER_CHESTPLATE.get(), ModItems.TITANIUM_CHAINMAIL_CHESTPLATE.get(), ModItems.TITANIUM_CHESTPLATE.get(), ModItems.VANADIUM_CHAINMAIL_CHESTPLATE.get(), ModItems.VANADIUM_CHESTPLATE.get(), ModItems.MITHRIL_CHAINMAIL_CHESTPLATE.get(), ModItems.MITHRIL_CHESTPLATE.get(), ModItems.ADAMANTINE_CHAINMAIL_CHESTPLATE.get(), ModItems.ADAMANTINE_CHESTPLATE.get());
        tag(ModTags.Items.MOD_LEGGINGS).add(ModItems.WOODEN_LEGGINGS.get(), ModItems.COPPER_CHAINMAIL_LEGGINGS.get(), ModItems.GOLD_CHAINMAIL_LEGGINGS.get(), ModItems.COPPER_LEGGINGS.get(), ModItems.SILVER_CHAINMAIL_LEGGINGS.get(), ModItems.SILVER_LEGGINGS.get(), ModItems.TITANIUM_CHAINMAIL_LEGGINGS.get(), ModItems.TITANIUM_LEGGINGS.get(), ModItems.VANADIUM_CHAINMAIL_LEGGINGS.get(), ModItems.VANADIUM_LEGGINGS.get(), ModItems.MITHRIL_CHAINMAIL_LEGGINGS.get(), ModItems.MITHRIL_LEGGINGS.get(), ModItems.ADAMANTINE_CHAINMAIL_LEGGINGS.get(), ModItems.ADAMANTINE_LEGGINGS.get());
        tag(ModTags.Items.MOD_BOOTS).add(ModItems.WOODEN_BOOTS.get(), ModItems.COPPER_CHAINMAIL_BOOTS.get(), ModItems.GOLD_CHAINMAIL_BOOTS.get(), ModItems.COPPER_BOOTS.get(), ModItems.SILVER_CHAINMAIL_BOOTS.get(), ModItems.SILVER_BOOTS.get(), ModItems.TITANIUM_CHAINMAIL_BOOTS.get(), ModItems.TITANIUM_BOOTS.get(), ModItems.VANADIUM_CHAINMAIL_BOOTS.get(), ModItems.VANADIUM_BOOTS.get(), ModItems.MITHRIL_CHAINMAIL_BOOTS.get(), ModItems.MITHRIL_BOOTS.get(), ModItems.ADAMANTINE_CHAINMAIL_BOOTS.get(), ModItems.ADAMANTINE_BOOTS.get());
        tag(Tags.Items.ARMORS_HELMETS).addTag(ModTags.Items.MOD_HELMETS);
        tag(Tags.Items.ARMORS_CHESTPLATES).addTag(ModTags.Items.MOD_CHESTPLATES);
        tag(Tags.Items.ARMORS_LEGGINGS).addTag(ModTags.Items.MOD_LEGGINGS);
        tag(Tags.Items.ARMORS_BOOTS).addTag(ModTags.Items.MOD_BOOTS);
        tag(Tags.Items.ARMORS).addTags(ModTags.Items.MOD_HELMETS, ModTags.Items.MOD_CHESTPLATES, ModTags.Items.MOD_LEGGINGS, ModTags.Items.MOD_BOOTS);

        tag(ModTags.Items.CHAINMAIL_PLATE).add(ModItems.COPPER_CHAINMAIL_PLATE.get(), ModItems.GOLD_CHAINMAIL_PLATE.get(), ModItems.IRON_CHAINMAIL_PLATE.get(), ModItems.SILVER_CHAINMAIL_PLATE.get(), ModItems.TITANIUM_CHAINMAIL_PLATE.get(), ModItems.VANADIUM_CHAINMAIL_PLATE.get(), ModItems.MITHRIL_CHAINMAIL_PLATE.get(), ModItems.ADAMANTINE_CHAINMAIL_PLATE.get());
    }
}
