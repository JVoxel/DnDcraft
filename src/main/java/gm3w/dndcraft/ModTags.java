package gm3w.dndcraft;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import javax.swing.text.html.HTML;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> ORES_SILVER = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "silver_ore"));
        public static final TagKey<Block> ORES_TITANIUM = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "titanium_ore"));
        public static final TagKey<Block> ORES_VANADIUM = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "vanadium_ore"));
        public static final TagKey<Block> ORES_MITHRIL = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mithril_ore"));
        public static final TagKey<Block> ORES_ADAMANT = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "adamant_ore"));
        public static final TagKey<Block> STORAGE_BLOCKS_SILVER = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "silver_block"));
        public static final TagKey<Block> STORAGE_BLOCKS_TITANIUM = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "titanium_block"));
        public static final TagKey<Block> STORAGE_BLOCKS_VANADIUM = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "vanadium_block"));
        public static final TagKey<Block> STORAGE_BLOCKS_MITHRIL = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mithril_block"));
        public static final TagKey<Block> STORAGE_BLOCKS_ADAMANTINE = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "adamantine_block"));
        public static final TagKey<Block> NEEDS_COPPER_TOOL = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "needs_copper_tool"));
        public static final TagKey<Block> NEEDS_TITANIUM_TOOL = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "needs_titanium_tool"));
        public static final TagKey<Block> NEEDS_VANADIUM_TOOL = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "needs_vanadium_tool"));
        public static final TagKey<Block> NEEDS_MITHRIL_TOOL = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "needs_mithril_tool"));
        public static final TagKey<Block> NEEDS_ADAMANTINE_TOOL = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "needs_adamantine_tool"));
    }

    public static class Items {
        public static final TagKey<Item> MOD_TOOLS_SWORDS = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mod_tools_swords"));
        public static final TagKey<Item> MOD_TOOLS_SHOVELS = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mod_tools_shovels"));
        public static final TagKey<Item> MOD_TOOLS_PICKAXES = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mod_tools_pickaxes"));
        public static final TagKey<Item> MOD_TOOLS_AXES = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mod_tools_axes"));
        public static final TagKey<Item> MOD_TOOLS_HOES = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mod_tools_hoes"));
        public static final TagKey<Item> MOD_HELMETS = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mod_helmets"));
        public static final TagKey<Item> MOD_CHESTPLATES = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mod_chestplates"));
        public static final TagKey<Item> MOD_LEGGINGS = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mod_leggings"));
        public static final TagKey<Item> MOD_BOOTS = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mod_boots"));
        public static final TagKey<Item> NOTHING = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "nothing"));
        public static final TagKey<Item> ORES_SILVER = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "silver_ore"));
        public static final TagKey<Item> ORES_TITANIUM = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "titanium_ore"));
        public static final TagKey<Item> ORES_VANADIUM = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "vanadium_ore"));
        public static final TagKey<Item> ORES_MITHRIL = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mithril_ore"));
        public static final TagKey<Item> ORES_ADAMANT = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "adamant_ore"));
        public static final TagKey<Item> STORAGE_BLOCKS_SILVER = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "silver_block"));
        public static final TagKey<Item> STORAGE_BLOCKS_TITANIUM = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "titanium_block"));
        public static final TagKey<Item> STORAGE_BLOCKS_VANADIUM = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "vanadium_block"));
        public static final TagKey<Item> STORAGE_BLOCKS_MITHRIL = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mithril_block"));
        public static final TagKey<Item> STORAGE_BLOCKS_ADAMANTINE = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "adamantine_block"));
        public static final TagKey<Item> RAW_MATERIALS_SILVER = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "raw_materials/silver"));
        public static final TagKey<Item> RAW_MATEIRALS_TITANIUM = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "raw_materials/titanium"));
        public static final TagKey<Item> RAW_MATERIALS_VANADIUM = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "raw_materials/vanadium"));
        public static final TagKey<Item> RAW_MATERIALS_MITHRIL = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "raw_materials/mithril"));
        public static final TagKey<Item> RAW_MATERIALS_ADAMANT = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "raw_materials/adamant"));
        public static final TagKey<Item> CHAINMAIL_PLATE = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "chainmail_plate"));
    }

}
